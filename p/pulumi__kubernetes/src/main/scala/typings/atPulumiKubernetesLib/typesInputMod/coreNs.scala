package typings
package atPulumiKubernetesLib.typesInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/types/input", "core")
@js.native
object coreNs extends js.Object {
  @JSName("v1")
  @js.native
  object v1Ns extends js.Object {
    /**
             * Represents a Persistent Disk resource in AWS.
             *
             * An AWS EBS disk must exist before mounting to a container. The disk must also be in the same
             * AWS zone as the kubelet. An AWS EBS disk can only be mounted as read/write once. AWS EBS
             * volumes support ownership management and SELinux relabeling.
             */
    
    trait AWSElasticBlockStoreVolumeSource extends js.Object {
      /**
                   * Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type
                   * is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly
                   * inferred to be "ext4" if unspecified. More info:
                   * https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
                   */
      var fsType: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * The partition in the volume that you want to mount. If omitted, the default is to mount by
                   * volume name. Examples: For volume /dev/sda1, you specify the partition as "1". Similarly,
                   * the volume partition for /dev/sda is "0" (or you can leave the property empty).
                   */
      var partition: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * Specify "true" to force and set the ReadOnly property in VolumeMounts to "true". If
                   * omitted, the default is "false". More info:
                   * https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
                   */
      var readOnly: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      /**
                   * Unique ID of the persistent disk resource in AWS (Amazon EBS volume). More info:
                   * https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
                   */
      var volumeID: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
    }
    
    /**
             * Affinity is a group of affinity scheduling rules.
             */
    
    trait Affinity extends js.Object {
      /**
                   * Describes node affinity scheduling rules for the pod.
                   */
      var nodeAffinity: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[NodeAffinity]] = js.undefined
      /**
                   * Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone,
                   * etc. as some other pod(s)).
                   */
      var podAffinity: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[PodAffinity]] = js.undefined
      /**
                   * Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node,
                   * zone, etc. as some other pod(s)).
                   */
      var podAntiAffinity: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[PodAntiAffinity]] = js.undefined
    }
    
    /**
             * AttachedVolume describes a volume attached to a node
             */
    
    trait AttachedVolume extends js.Object {
      /**
                   * DevicePath represents the device path where the volume should be available
                   */
      var devicePath: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Name of the attached volume
                   */
      var name: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
    }
    
    /**
             * AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
             */
    
    trait AzureDiskVolumeSource extends js.Object {
      /**
                   * Host Caching mode: None, Read Only, Read Write.
                   */
      var cachingMode: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * The Name of the data disk in the blob storage
                   */
      var diskName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * The URI the data disk in the blob storage
                   */
      var diskURI: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Filesystem type to mount. Must be a filesystem type supported by the host operating system.
                   * Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
                   */
      var fsType: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Expected values Shared: multiple blob disks per storage account  Dedicated: single blob
                   * disk per storage account  Managed: azure managed data disk (only in managed availability
                   * set). defaults to shared
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in
                   * VolumeMounts.
                   */
      var readOnly: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
    }
    
    /**
             * AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
             */
    
    trait AzureFilePersistentVolumeSource extends js.Object {
      /**
                   * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in
                   * VolumeMounts.
                   */
      var readOnly: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      /**
                   * the name of secret that contains Azure Storage Account Name and Key
                   */
      var secretName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * the namespace of the secret that contains Azure Storage Account Name and Key default is the
                   * same as the Pod
                   */
      var secretNamespace: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Share Name
                   */
      var shareName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
    }
    
    /**
             * AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
             */
    
    trait AzureFileVolumeSource extends js.Object {
      /**
                   * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in
                   * VolumeMounts.
                   */
      var readOnly: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      /**
                   * the name of secret that contains Azure Storage Account Name and Key
                   */
      var secretName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Share Name
                   */
      var shareName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
    }
    
    /**
             * Binding ties one object to another; for example, a pod is bound to a node by a scheduler.
             * Deprecated in 1.7, please use the bindings subresource of pods instead.
             */
    
    trait Binding extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard object's metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
                   * The target object that you want to bind to the standard object.
                   */
      var target: atPulumiPulumiLib.resourceMod.Input[ObjectReference]
    }
    
    /**
             * Represents storage that is managed by an external CSI volume driver
             */
    
    trait CSIPersistentVolumeSource extends js.Object {
      /**
                   * Driver is the name of the driver to use for this volume. Required.
                   */
      var driver: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Optional: The value to pass to ControllerPublishVolumeRequest. Defaults to false
                   * (read/write).
                   */
      var readOnly: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      /**
                   * VolumeHandle is the unique volume name returned by the CSI volume plugin’s CreateVolume
                   * to refer to the volume on all subsequent calls. Required.
                   */
      var volumeHandle: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
    }
    
    /**
             * Adds and removes POSIX capabilities from running containers.
             */
    
    trait Capabilities extends js.Object {
      /**
                   * Added capabilities
                   */
      var add: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]] = js.undefined
      /**
                   * Removed capabilities
                   */
      var drop: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]] = js.undefined
    }
    
    /**
             * Represents a Ceph Filesystem mount that lasts the lifetime of a pod Cephfs volumes do not
             * support ownership management or SELinux relabeling.
             */
    
    trait CephFSPersistentVolumeSource extends js.Object {
      /**
                   * Required: Monitors is a collection of Ceph monitors More info:
                   * https://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it
                   */
      var monitors: atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]
      /**
                   * Optional: Used as the mounted root, rather than the full Ceph tree, default is /
                   */
      var path: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in
                   * VolumeMounts. More info:
                   * https://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it
                   */
      var readOnly: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      /**
                   * Optional: SecretFile is the path to key ring for User, default is /etc/ceph/user.secret
                   * More info: https://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it
                   */
      var secretFile: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Optional: SecretRef is reference to the authentication secret for User, default is empty.
                   * More info: https://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it
                   */
      var secretRef: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[SecretReference]] = js.undefined
      /**
                   * Optional: User is the rados user name, default is admin More info:
                   * https://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it
                   */
      var user: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
             * Represents a Ceph Filesystem mount that lasts the lifetime of a pod Cephfs volumes do not
             * support ownership management or SELinux relabeling.
             */
    
    trait CephFSVolumeSource extends js.Object {
      /**
                   * Required: Monitors is a collection of Ceph monitors More info:
                   * https://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it
                   */
      var monitors: atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]
      /**
                   * Optional: Used as the mounted root, rather than the full Ceph tree, default is /
                   */
      var path: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in
                   * VolumeMounts. More info:
                   * https://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it
                   */
      var readOnly: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      /**
                   * Optional: SecretFile is the path to key ring for User, default is /etc/ceph/user.secret
                   * More info: https://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it
                   */
      var secretFile: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Optional: SecretRef is reference to the authentication secret for User, default is empty.
                   * More info: https://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it
                   */
      var secretRef: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[LocalObjectReference]] = js.undefined
      /**
                   * Optional: User is the rados user name, default is admin More info:
                   * https://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it
                   */
      var user: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
             * Represents a cinder volume resource in Openstack. A Cinder volume must exist before mounting
             * to a container. The volume must also be in the same region as the kubelet. Cinder volumes
             * support ownership management and SELinux relabeling.
             */
    
    trait CinderVolumeSource extends js.Object {
      /**
                   * Filesystem type to mount. Must be a filesystem type supported by the host operating system.
                   * Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More
                   * info: https://releases.k8s.io/HEAD/examples/mysql-cinder-pd/README.md
                   */
      var fsType: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in
                   * VolumeMounts. More info: https://releases.k8s.io/HEAD/examples/mysql-cinder-pd/README.md
                   */
      var readOnly: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      /**
                   * volume id used to identify the volume in cinder More info:
                   * https://releases.k8s.io/HEAD/examples/mysql-cinder-pd/README.md
                   */
      var volumeID: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
    }
    
    /**
             * ClientIPConfig represents the configurations of Client IP based session affinity.
             */
    
    trait ClientIPConfig extends js.Object {
      /**
                   * timeoutSeconds specifies the seconds of ClientIP type session sticky time. The value must
                   * be >0 && <=86400(for 1 day) if ServiceAffinity == "ClientIP". Default value is 10800(for 3
                   * hours).
                   */
      var timeoutSeconds: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
    }
    
    /**
             * Information about the condition of a component.
             */
    
    trait ComponentCondition extends js.Object {
      /**
                   * Condition error code for a component. For example, a health check error code.
                   */
      var error: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Message about the condition for a component. For example, information about a health check.
                   */
      var message: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Status of the condition for a component. Valid values for "Healthy": "True", "False", or
                   * "Unknown".
                   */
      var status: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Type of condition for a component. Valid value: "Healthy"
                   */
      var `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
    }
    
    /**
             * ComponentStatus (and ComponentStatusList) holds the cluster validation info.
             */
    
    trait ComponentStatus extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * List of component conditions observed
                   */
      var conditions: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[ComponentCondition]]] = js.undefined
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard object's metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
    }
    
    /**
             * Status of all the conditions for the component as a list of ComponentStatus objects.
             */
    
    trait ComponentStatusList extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * List of ComponentStatus objects.
                   */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[ComponentStatus]]
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard list metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
             * ConfigMap holds configuration data for pods to consume.
             */
    
    trait ConfigMap extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Data contains the configuration data. Each key must consist of alphanumeric characters,
                   * '-', '_' or '.'.
                   */
      var data: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[
              ScalablyTyped.runtime.StringDictionary[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]
            ]
          ] = js.undefined
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard object's metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
    }
    
    /**
             * ConfigMapEnvSource selects a ConfigMap to populate the environment variables with.
             *
             * The contents of the target ConfigMap's Data field will represent the key-value pairs as
             * environment variables.
             */
    
    trait ConfigMapEnvSource extends js.Object {
      /**
                   * Name of the referent. More info:
                   * https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
                   */
      var name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Specify whether the ConfigMap must be defined
                   */
      var optional: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
    }
    
    /**
             * Selects a key from a ConfigMap.
             */
    
    trait ConfigMapKeySelector extends js.Object {
      /**
                   * The key to select.
                   */
      var key: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Name of the referent. More info:
                   * https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
                   */
      var name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Specify whether the ConfigMap or it's key must be defined
                   */
      var optional: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
    }
    
    /**
             * ConfigMapList is a resource containing a list of ConfigMap objects.
             */
    
    trait ConfigMapList extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Items is the list of ConfigMaps.
                   */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[ConfigMap]]
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
             * Adapts a ConfigMap into a projected volume.
             *
             * The contents of the target ConfigMap's Data field will be presented in a projected volume as
             * files using the keys in the Data field as the file names, unless the items element is
             * populated with specific mappings of keys to paths. Note that this is identical to a configmap
             * volume source without the default mode.
             */
    
    trait ConfigMapProjection extends js.Object {
      /**
                   * If unspecified, each key-value pair in the Data field of the referenced ConfigMap will be
                   * projected into the volume as a file whose name is the key and content is the value. If
                   * specified, the listed keys will be projected into the specified paths, and unlisted keys
                   * will not be present. If a key is specified which is not present in the ConfigMap, the
                   * volume setup will error unless it is marked optional. Paths must be relative and may not
                   * contain the '..' path or start with '..'.
                   */
      var items: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[KeyToPath]]] = js.undefined
      /**
                   * Name of the referent. More info:
                   * https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
                   */
      var name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Specify whether the ConfigMap or it's keys must be defined
                   */
      var optional: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
    }
    
    /**
             * Adapts a ConfigMap into a volume.
             *
             * The contents of the target ConfigMap's Data field will be presented in a volume as files
             * using the keys in the Data field as the file names, unless the items element is populated
             * with specific mappings of keys to paths. ConfigMap volumes support ownership management and
             * SELinux relabeling.
             */
    
    trait ConfigMapVolumeSource extends js.Object {
      /**
                   * Optional: mode bits to use on created files by default. Must be a value between 0 and 0777.
                   * Defaults to 0644. Directories within the path are not affected by this setting. This might
                   * be in conflict with other options that affect the file mode, like fsGroup, and the result
                   * can be other mode bits set.
                   */
      var defaultMode: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * If unspecified, each key-value pair in the Data field of the referenced ConfigMap will be
                   * projected into the volume as a file whose name is the key and content is the value. If
                   * specified, the listed keys will be projected into the specified paths, and unlisted keys
                   * will not be present. If a key is specified which is not present in the ConfigMap, the
                   * volume setup will error unless it is marked optional. Paths must be relative and may not
                   * contain the '..' path or start with '..'.
                   */
      var items: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[KeyToPath]]] = js.undefined
      /**
                   * Name of the referent. More info:
                   * https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
                   */
      var name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Specify whether the ConfigMap or it's keys must be defined
                   */
      var optional: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
    }
    
    /**
             * A single application container that you want to run within a pod.
             */
    
    trait Container extends js.Object {
      /**
                   * Arguments to the entrypoint. The docker image's CMD is used if this is not provided.
                   * Variable references $(VAR_NAME) are expanded using the container's environment. If a
                   * variable cannot be resolved, the reference in the input string will be unchanged. The
                   * $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references
                   * will never be expanded, regardless of whether the variable exists or not. Cannot be
                   * updated. More info:
                   * https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
                   */
      var args: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]] = js.undefined
      /**
                   * Entrypoint array. Not executed within a shell. The docker image's ENTRYPOINT is used if
                   * this is not provided. Variable references $(VAR_NAME) are expanded using the container's
                   * environment. If a variable cannot be resolved, the reference in the input string will be
                   * unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME).
                   * Escaped references will never be expanded, regardless of whether the variable exists or
                   * not. Cannot be updated. More info:
                   * https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
                   */
      var command: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]] = js.undefined
      /**
                   * List of environment variables to set in the container. Cannot be updated.
                   */
      var env: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[EnvVar]]] = js.undefined
      /**
                   * List of sources to populate environment variables in the container. The keys defined within
                   * a source must be a C_IDENTIFIER. All invalid keys will be reported as an event when the
                   * container is starting. When a key exists in multiple sources, the value associated with the
                   * last source will take precedence. Values defined by an Env with a duplicate key will take
                   * precedence. Cannot be updated.
                   */
      var envFrom: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[EnvFromSource]]] = js.undefined
      /**
                   * Docker image name. More info: https://kubernetes.io/docs/concepts/containers/images This
                   * field is optional to allow higher level config management to default or override container
                   * images in workload controllers like Deployments and StatefulSets.
                   */
      var image: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is
                   * specified, or IfNotPresent otherwise. Cannot be updated. More info:
                   * https://kubernetes.io/docs/concepts/containers/images#updating-images
                   */
      var imagePullPolicy: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Actions that the management system should take in response to container lifecycle events.
                   * Cannot be updated.
                   */
      var lifecycle: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Lifecycle]] = js.undefined
      /**
                   * Periodic probe of container liveness. Container will be restarted if the probe fails.
                   * Cannot be updated. More info:
                   * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
                   */
      var livenessProbe: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Probe]] = js.undefined
      /**
                   * Name of the container specified as a DNS_LABEL. Each container in a pod must have a unique
                   * name (DNS_LABEL). Cannot be updated.
                   */
      var name: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * List of ports to expose from the container. Exposing a port here gives the system
                   * additional information about the network connections a container uses, but is primarily
                   * informational. Not specifying a port here DOES NOT prevent that port from being exposed.
                   * Any port which is listening on the default "0.0.0.0" address inside a container will be
                   * accessible from the network. Cannot be updated.
                   */
      var ports: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[ContainerPort]]] = js.undefined
      /**
                   * Periodic probe of container service readiness. Container will be removed from service
                   * endpoints if the probe fails. Cannot be updated. More info:
                   * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
                   */
      var readinessProbe: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Probe]] = js.undefined
      /**
                   * Compute Resources required by this container. Cannot be updated. More info:
                   * https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources
                   */
      var resources: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[ResourceRequirements]] = js.undefined
      /**
                   * Security options the pod should run with. More info:
                   * https://kubernetes.io/docs/concepts/policy/security-context/ More info:
                   * https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
                   */
      var securityContext: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[SecurityContext]] = js.undefined
      /**
                   * Whether this container should allocate a buffer for stdin in the container runtime. If this
                   * is not set, reads from stdin in the container will always result in EOF. Default is false.
                   */
      var stdin: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      /**
                   * Whether the container runtime should close the stdin channel after it has been opened by a
                   * single attach. When stdin is true the stdin stream will remain open across multiple attach
                   * sessions. If stdinOnce is set to true, stdin is opened on container start, is empty until
                   * the first client attaches to stdin, and then remains open and accepts data until the client
                   * disconnects, at which time stdin is closed and remains closed until the container is
                   * restarted. If this flag is false, a container processes that reads from stdin will never
                   * receive an EOF. Default is false
                   */
      var stdinOnce: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      /**
                   * Optional: Path at which the file to which the container's termination message will be
                   * written is mounted into the container's filesystem. Message written is intended to be brief
                   * final status, such as an assertion failure message. Will be truncated by the node if
                   * greater than 4096 bytes. The total message length across all containers will be limited to
                   * 12kb. Defaults to /dev/termination-log. Cannot be updated.
                   */
      var terminationMessagePath: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Indicate how the termination message should be populated. File will use the contents of
                   * terminationMessagePath to populate the container status message on both success and
                   * failure. FallbackToLogsOnError will use the last chunk of container log output if the
                   * termination message file is empty and the container exited with an error. The log output is
                   * limited to 2048 bytes or 80 lines, whichever is smaller. Defaults to File. Cannot be
                   * updated.
                   */
      var terminationMessagePolicy: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Whether this container should allocate a TTY for itself, also requires 'stdin' to be true.
                   * Default is false.
                   */
      var tty: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      /**
                   * volumeDevices is the list of block devices to be used by the container. This is an alpha
                   * feature and may change in the future.
                   */
      var volumeDevices: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[VolumeDevice]]] = js.undefined
      /**
                   * Pod volumes to mount into the container's filesystem. Cannot be updated.
                   */
      var volumeMounts: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[VolumeMount]]] = js.undefined
      /**
                   * Container's working directory. If not specified, the container runtime's default will be
                   * used, which might be configured in the container image. Cannot be updated.
                   */
      var workingDir: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
             * Describe a container image
             */
    
    trait ContainerImage extends js.Object {
      /**
                   * Names by which this image is known. e.g. ["gcr.io/google_containers/hyperkube:v1.0.7",
                   * "dockerhub.io/google_containers/hyperkube:v1.0.7"]
                   */
      var names: atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]
      /**
                   * The size of the image in bytes.
                   */
      var sizeBytes: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
    }
    
    /**
             * ContainerPort represents a network port in a single container.
             */
    
    trait ContainerPort extends js.Object {
      /**
                   * Number of port to expose on the pod's IP address. This must be a valid port number, 0 < x <
                   * 65536.
                   */
      var containerPort: atPulumiPulumiLib.resourceMod.Input[scala.Double]
      /**
                   * What host IP to bind the external port to.
                   */
      var hostIP: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Number of port to expose on the host. If specified, this must be a valid port number, 0 < x
                   * < 65536. If HostNetwork is specified, this must match ContainerPort. Most containers do not
                   * need this.
                   */
      var hostPort: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * If specified, this must be an IANA_SVC_NAME and unique within the pod. Each named port in a
                   * pod must have a unique name. Name for the port that can be referred to by services.
                   */
      var name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Protocol for port. Must be UDP or TCP. Defaults to "TCP".
                   */
      var protocol: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
             * ContainerState holds a possible state of container. Only one of its members may be specified.
             * If none of them is specified, the default one is ContainerStateWaiting.
             */
    
    trait ContainerState extends js.Object {
      /**
                   * Details about a running container
                   */
      var running: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[ContainerStateRunning]] = js.undefined
      /**
                   * Details about a terminated container
                   */
      var terminated: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[ContainerStateTerminated]] = js.undefined
      /**
                   * Details about a waiting container
                   */
      var waiting: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[ContainerStateWaiting]] = js.undefined
    }
    
    /**
             * ContainerStateRunning is a running state of a container.
             */
    
    trait ContainerStateRunning extends js.Object {
      /**
                   * Time at which the container was last (re-)started
                   */
      var startedAt: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
             * ContainerStateTerminated is a terminated state of a container.
             */
    
    trait ContainerStateTerminated extends js.Object {
      /**
                   * Container's ID in the format 'docker://<container_id>'
                   */
      var containerID: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Exit status from the last termination of the container
                   */
      var exitCode: atPulumiPulumiLib.resourceMod.Input[scala.Double]
      /**
                   * Time at which the container last terminated
                   */
      var finishedAt: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Message regarding the last termination of the container
                   */
      var message: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * (brief) reason from the last termination of the container
                   */
      var reason: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Signal from the last termination of the container
                   */
      var signal: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * Time at which previous execution of the container started
                   */
      var startedAt: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
             * ContainerStateWaiting is a waiting state of a container.
             */
    
    trait ContainerStateWaiting extends js.Object {
      /**
                   * Message regarding why the container is not yet running.
                   */
      var message: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * (brief) reason the container is not yet running.
                   */
      var reason: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
             * ContainerStatus contains details for the current status of this container.
             */
    
    trait ContainerStatus extends js.Object {
      /**
                   * Container's ID in the format 'docker://<container_id>'.
                   */
      var containerID: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * The image the container is running. More info:
                   * https://kubernetes.io/docs/concepts/containers/images
                   */
      var image: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * ImageID of the container's image.
                   */
      var imageID: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Details about the container's last termination condition.
                   */
      var lastState: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[ContainerState]] = js.undefined
      /**
                   * This must be a DNS_LABEL. Each container in a pod must have a unique name. Cannot be
                   * updated.
                   */
      var name: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Specifies whether the container has passed its readiness probe.
                   */
      var ready: atPulumiPulumiLib.resourceMod.Input[scala.Boolean]
      /**
                   * The number of times the container has been restarted, currently based on the number of dead
                   * containers that have not yet been removed. Note that this is calculated from dead
                   * containers. But those containers are subject to garbage collection. This value will get
                   * capped at 5 by GC.
                   */
      var restartCount: atPulumiPulumiLib.resourceMod.Input[scala.Double]
      /**
                   * Details about the container's current condition.
                   */
      var state: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[ContainerState]] = js.undefined
    }
    
    /**
             * DaemonEndpoint contains information about a single Daemon endpoint.
             */
    
    trait DaemonEndpoint extends js.Object {
      /**
                   * Port number of the given endpoint.
                   */
      var Port: atPulumiPulumiLib.resourceMod.Input[scala.Double]
    }
    
    /**
             * Represents downward API info for projecting into a projected volume. Note that this is
             * identical to a downwardAPI volume source without the default mode.
             */
    
    trait DownwardAPIProjection extends js.Object {
      /**
                   * Items is a list of DownwardAPIVolume file
                   */
      var items: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[DownwardAPIVolumeFile]]] = js.undefined
    }
    
    /**
             * DownwardAPIVolumeFile represents information to create the file containing the pod field
             */
    
    trait DownwardAPIVolumeFile extends js.Object {
      /**
                   * Required: Selects a field of the pod: only annotations, labels, name and namespace are
                   * supported.
                   */
      var fieldRef: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[ObjectFieldSelector]] = js.undefined
      /**
                   * Optional: mode bits to use on this file, must be a value between 0 and 0777. If not
                   * specified, the volume defaultMode will be used. This might be in conflict with other
                   * options that affect the file mode, like fsGroup, and the result can be other mode bits set.
                   */
      var mode: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * Required: Path is  the relative path name of the file to be created. Must not be absolute
                   * or contain the '..' path. Must be utf-8 encoded. The first item of the relative path must
                   * not start with '..'
                   */
      var path: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Selects a resource of the container: only resources limits and requests (limits.cpu,
                   * limits.memory, requests.cpu and requests.memory) are currently supported.
                   */
      var resourceFieldRef: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[ResourceFieldSelector]] = js.undefined
    }
    
    /**
             * DownwardAPIVolumeSource represents a volume containing downward API info. Downward API
             * volumes support ownership management and SELinux relabeling.
             */
    
    trait DownwardAPIVolumeSource extends js.Object {
      /**
                   * Optional: mode bits to use on created files by default. Must be a value between 0 and 0777.
                   * Defaults to 0644. Directories within the path are not affected by this setting. This might
                   * be in conflict with other options that affect the file mode, like fsGroup, and the result
                   * can be other mode bits set.
                   */
      var defaultMode: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * Items is a list of downward API volume file
                   */
      var items: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[DownwardAPIVolumeFile]]] = js.undefined
    }
    
    /**
             * Represents an empty directory for a pod. Empty directory volumes support ownership management
             * and SELinux relabeling.
             */
    
    trait EmptyDirVolumeSource extends js.Object {
      /**
                   * What type of storage medium should back this directory. The default is "" which means to
                   * use the node's default medium. Must be an empty string (default) or Memory. More info:
                   * https://kubernetes.io/docs/concepts/storage/volumes#emptydir
                   */
      var medium: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Total amount of local storage required for this EmptyDir volume. The size limit is also
                   * applicable for memory medium. The maximum usage on memory medium EmptyDir would be the
                   * minimum value between the SizeLimit specified here and the sum of memory limits of all
                   * containers in a pod. The default is nil which means that the limit is undefined. More info:
                   * http://kubernetes.io/docs/user-guide/volumes#emptydir
                   */
      var sizeLimit: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
             * EndpointAddress is a tuple that describes single IP address.
             */
    
    trait EndpointAddress extends js.Object {
      /**
                   * The Hostname of this endpoint
                   */
      var hostname: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * The IP of this endpoint. May not be loopback (127.0.0.0/8), link-local (169.254.0.0/16), or
                   * link-local multicast ((224.0.0.0/24). IPv6 is also accepted but not fully supported on all
                   * platforms. Also, certain kubernetes components, like kube-proxy, are not IPv6 ready.
                   */
      var ip: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Optional: Node hosting this endpoint. This can be used to determine endpoints local to a
                   * node.
                   */
      var nodeName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Reference to object providing the endpoint.
                   */
      var targetRef: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[ObjectReference]] = js.undefined
    }
    
    /**
             * EndpointPort is a tuple that describes a single port.
             */
    
    trait EndpointPort extends js.Object {
      /**
                   * The name of this port (corresponds to ServicePort.Name). Must be a DNS_LABEL. Optional only
                   * if one port is defined.
                   */
      var name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * The port number of the endpoint.
                   */
      var port: atPulumiPulumiLib.resourceMod.Input[scala.Double]
      /**
                   * The IP protocol for this port. Must be UDP or TCP. Default is TCP.
                   */
      var protocol: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
             * EndpointSubset is a group of addresses with a common set of ports. The expanded set of
             * endpoints is the Cartesian product of Addresses x Ports. For example, given:
             *   {
             *     Addresses: [{"ip": "10.10.1.1"}, {"ip": "10.10.2.2"}],
             *     Ports:     [{"name": "a", "port": 8675}, {"name": "b", "port": 309}]
             *   }
             * The resulting set of endpoints can be viewed as:
             *     a: [ 10.10.1.1:8675, 10.10.2.2:8675 ],
             *     b: [ 10.10.1.1:309, 10.10.2.2:309 ]
             */
    
    trait EndpointSubset extends js.Object {
      /**
                   * IP addresses which offer the related ports that are marked as ready. These endpoints should
                   * be considered safe for load balancers and clients to utilize.
                   */
      var addresses: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[EndpointAddress]]] = js.undefined
      /**
                   * IP addresses which offer the related ports but are not currently marked as ready because
                   * they have not yet finished starting, have recently failed a readiness check, or have
                   * recently failed a liveness check.
                   */
      var notReadyAddresses: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[EndpointAddress]]] = js.undefined
      /**
                   * Port numbers available on the related IP addresses.
                   */
      var ports: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[EndpointPort]]] = js.undefined
    }
    
    /**
             * Endpoints is a collection of endpoints that implement the actual service. Example:
             *   Name: "mysvc",
             *   Subsets: [
             *     {
             *       Addresses: [{"ip": "10.10.1.1"}, {"ip": "10.10.2.2"}],
             *       Ports: [{"name": "a", "port": 8675}, {"name": "b", "port": 309}]
             *     },
             *     {
             *       Addresses: [{"ip": "10.10.3.3"}],
             *       Ports: [{"name": "a", "port": 93}, {"name": "b", "port": 76}]
             *     },
             *  ]
             */
    
    trait Endpoints extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard object's metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
                   * The set of all endpoints is the union of all subsets. Addresses are placed into subsets
                   * according to the IPs they share. A single address with multiple ports, some of which are
                   * ready and some of which are not (because they come from different containers) will result
                   * in the address being displayed in different subsets for the different ports. No address
                   * will appear in both Addresses and NotReadyAddresses in the same subset. Sets of addresses
                   * and ports that comprise a service.
                   */
      var subsets: atPulumiPulumiLib.resourceMod.Input[js.Array[EndpointSubset]]
    }
    
    /**
             * EndpointsList is a list of endpoints.
             */
    
    trait EndpointsList extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * List of endpoints.
                   */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[Endpoints]]
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard list metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
             * EnvFromSource represents the source of a set of ConfigMaps
             */
    
    trait EnvFromSource extends js.Object {
      /**
                   * The ConfigMap to select from
                   */
      var configMapRef: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[ConfigMapEnvSource]] = js.undefined
      /**
                   * An optional identifer to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER.
                   */
      var prefix: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * The Secret to select from
                   */
      var secretRef: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[SecretEnvSource]] = js.undefined
    }
    
    /**
             * EnvVar represents an environment variable present in a Container.
             */
    
    trait EnvVar extends js.Object {
      /**
                   * Name of the environment variable. Must be a C_IDENTIFIER.
                   */
      var name: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Variable references $(VAR_NAME) are expanded using the previous defined environment
                   * variables in the container and any service environment variables. If a variable cannot be
                   * resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can
                   * be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded,
                   * regardless of whether the variable exists or not. Defaults to "".
                   */
      var value: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Source for the environment variable's value. Cannot be used if value is not empty.
                   */
      var valueFrom: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[EnvVarSource]] = js.undefined
    }
    
    /**
             * EnvVarSource represents a source for the value of an EnvVar.
             */
    
    trait EnvVarSource extends js.Object {
      /**
                   * Selects a key of a ConfigMap.
                   */
      var configMapKeyRef: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[ConfigMapKeySelector]] = js.undefined
      /**
                   * Selects a field of the pod: supports metadata.name, metadata.namespace, metadata.labels,
                   * metadata.annotations, spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP.
                   */
      var fieldRef: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[ObjectFieldSelector]] = js.undefined
      /**
                   * Selects a resource of the container: only resources limits and requests (limits.cpu,
                   * limits.memory, limits.ephemeral-storage, requests.cpu, requests.memory and
                   * requests.ephemeral-storage) are currently supported.
                   */
      var resourceFieldRef: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[ResourceFieldSelector]] = js.undefined
      /**
                   * Selects a key of a secret in the pod's namespace
                   */
      var secretKeyRef: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[SecretKeySelector]] = js.undefined
    }
    
    /**
             * Event is a report of an event somewhere in the cluster.
             */
    
    trait Event extends js.Object {
      /**
                   * What action was taken/failed regarding to the Regarding object.
                   */
      var action: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * The number of times this event has occurred.
                   */
      var count: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * Time when this Event was first observed.
                   */
      var eventTime: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * The time at which the event was first recorded. (Time of server receipt is in TypeMeta.)
                   */
      var firstTimestamp: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * The object that this event is about.
                   */
      var involvedObject: atPulumiPulumiLib.resourceMod.Input[ObjectReference]
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * The time at which the most recent occurrence of this event was recorded.
                   */
      var lastTimestamp: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * A human-readable description of the status of this operation.
                   */
      var message: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard object's metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
                   */
      var metadata: atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
      /**
                   * This should be a short, machine understandable string that gives the reason for the
                   * transition into the object's current status.
                   */
      var reason: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Optional secondary object for more complex actions.
                   */
      var related: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[ObjectReference]] = js.undefined
      /**
                   * Name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`.
                   */
      var reportingComponent: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * ID of the controller instance, e.g. `kubelet-xyzf`.
                   */
      var reportingInstance: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Data about the Event series this event represents or nil if it's a singleton Event.
                   */
      var series: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[EventSeries]] = js.undefined
      /**
                   * The component reporting this event. Should be a short machine understandable string.
                   */
      var source: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[EventSource]] = js.undefined
      /**
                   * Type of this event (Normal, Warning), new types could be added in the future
                   */
      var `type`: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
             * EventList is a list of events.
             */
    
    trait EventList extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * List of events
                   */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[Event]]
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard list metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
             * EventSeries contain information on series of events, i.e. thing that was/is happening
             * continously for some time.
             */
    
    trait EventSeries extends js.Object {
      /**
                   * Number of occurrences in this series up to the last heartbeat time
                   */
      var count: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * Time of the last occurence observed
                   */
      var lastObservedTime: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * State of this Series: Ongoing or Finished
                   */
      var state: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
             * EventSource contains information for an event.
             */
    
    trait EventSource extends js.Object {
      /**
                   * Component from which the event is generated.
                   */
      var component: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Node name on which the event is generated.
                   */
      var host: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
             * ExecAction describes a "run in container" action.
             */
    
    trait ExecAction extends js.Object {
      /**
                   * Command is the command line to execute inside the container, the working directory for the
                   * command  is root ('/') in the container's filesystem. The command is simply exec'd, it is
                   * not run inside a shell, so traditional shell instructions ('|', etc) won't work. To use a
                   * shell, you need to explicitly call out to that shell. Exit status of 0 is treated as
                   * live/healthy and non-zero is unhealthy.
                   */
      var command: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]] = js.undefined
    }
    
    /**
             * Represents a Fibre Channel volume. Fibre Channel volumes can only be mounted as read/write
             * once. Fibre Channel volumes support ownership management and SELinux relabeling.
             */
    
    trait FCVolumeSource extends js.Object {
      /**
                   * Filesystem type to mount. Must be a filesystem type supported by the host operating system.
                   * Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
                   */
      var fsType: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Optional: FC target lun number
                   */
      var lun: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in
                   * VolumeMounts.
                   */
      var readOnly: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      /**
                   * Optional: FC target worldwide names (WWNs)
                   */
      var targetWWNs: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]] = js.undefined
      /**
                   * Optional: FC volume world wide identifiers (wwids) Either wwids or combination of
                   * targetWWNs and lun must be set, but not both simultaneously.
                   */
      var wwids: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]] = js.undefined
    }
    
    /**
             * FlexVolume represents a generic volume resource that is provisioned/attached using an exec
             * based plugin.
             */
    
    trait FlexVolumeSource extends js.Object {
      /**
                   * Driver is the name of the driver to use for this volume.
                   */
      var driver: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Filesystem type to mount. Must be a filesystem type supported by the host operating system.
                   * Ex. "ext4", "xfs", "ntfs". The default filesystem depends on FlexVolume script.
                   */
      var fsType: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Optional: Extra command options if any.
                   */
      var options: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[
              ScalablyTyped.runtime.StringDictionary[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]
            ]
          ] = js.undefined
      /**
                   * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in
                   * VolumeMounts.
                   */
      var readOnly: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      /**
                   * Optional: SecretRef is reference to the secret object containing sensitive information to
                   * pass to the plugin scripts. This may be empty if no secret object is specified. If the
                   * secret object contains more than one secret, all secrets are passed to the plugin scripts.
                   */
      var secretRef: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[LocalObjectReference]] = js.undefined
    }
    
    /**
             * Represents a Flocker volume mounted by the Flocker agent. One and only one of datasetName and
             * datasetUUID should be set. Flocker volumes do not support ownership management or SELinux
             * relabeling.
             */
    
    trait FlockerVolumeSource extends js.Object {
      /**
                   * Name of the dataset stored as metadata -> name on the dataset for Flocker should be
                   * considered as deprecated
                   */
      var datasetName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * UUID of the dataset. This is unique identifier of a Flocker dataset
                   */
      var datasetUUID: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
             * Represents a Persistent Disk resource in Google Compute Engine.
             *
             * A GCE PD must exist before mounting to a container. The disk must also be in the same GCE
             * project and zone as the kubelet. A GCE PD can only be mounted as read/write once or read-only
             * many times. GCE PDs support ownership management and SELinux relabeling.
             */
    
    trait GCEPersistentDiskVolumeSource extends js.Object {
      /**
                   * Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type
                   * is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly
                   * inferred to be "ext4" if unspecified. More info:
                   * https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
                   */
      var fsType: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * The partition in the volume that you want to mount. If omitted, the default is to mount by
                   * volume name. Examples: For volume /dev/sda1, you specify the partition as "1". Similarly,
                   * the volume partition for /dev/sda is "0" (or you can leave the property empty). More info:
                   * https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
                   */
      var partition: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * Unique name of the PD resource in GCE. Used to identify the disk in GCE. More info:
                   * https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
                   */
      var pdName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false. More
                   * info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
                   */
      var readOnly: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
    }
    
    /**
             * Represents a volume that is populated with the contents of a git repository. Git repo volumes
             * do not support ownership management. Git repo volumes support SELinux relabeling.
             */
    
    trait GitRepoVolumeSource extends js.Object {
      /**
                   * Target directory name. Must not contain or start with '..'.  If '.' is supplied, the volume
                   * directory will be the git repository.  Otherwise, if specified, the volume will contain the
                   * git repository in the subdirectory with the given name.
                   */
      var directory: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Repository URL
                   */
      var repository: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Commit hash for the specified revision.
                   */
      var revision: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
             * Represents a Glusterfs mount that lasts the lifetime of a pod. Glusterfs volumes do not
             * support ownership management or SELinux relabeling.
             */
    
    trait GlusterfsVolumeSource extends js.Object {
      /**
                   * EndpointsName is the endpoint name that details Glusterfs topology. More info:
                   * https://releases.k8s.io/HEAD/examples/volumes/glusterfs/README.md#create-a-pod
                   */
      var endpoints: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Path is the Glusterfs volume path. More info:
                   * https://releases.k8s.io/HEAD/examples/volumes/glusterfs/README.md#create-a-pod
                   */
      var path: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * ReadOnly here will force the Glusterfs volume to be mounted with read-only permissions.
                   * Defaults to false. More info:
                   * https://releases.k8s.io/HEAD/examples/volumes/glusterfs/README.md#create-a-pod
                   */
      var readOnly: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
    }
    
    /**
             * HTTPGetAction describes an action based on HTTP Get requests.
             */
    
    trait HTTPGetAction extends js.Object {
      /**
                   * Host name to connect to, defaults to the pod IP. You probably want to set "Host" in
                   * httpHeaders instead.
                   */
      var host: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Custom headers to set in the request. HTTP allows repeated headers.
                   */
      var httpHeaders: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[HTTPHeader]]] = js.undefined
      /**
                   * Path to access on the HTTP server.
                   */
      var path: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Name or number of the port to access on the container. Number must be in the range 1 to
                   * 65535. Name must be an IANA_SVC_NAME.
                   */
      var port: atPulumiPulumiLib.resourceMod.Input[scala.Double | java.lang.String]
      /**
                   * Scheme to use for connecting to the host. Defaults to HTTP.
                   */
      var scheme: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
             * HTTPHeader describes a custom header to be used in HTTP probes
             */
    
    trait HTTPHeader extends js.Object {
      /**
                   * The header field name
                   */
      var name: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * The header field value
                   */
      var value: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
    }
    
    /**
             * Handler defines a specific action that should be taken
             */
    
    trait Handler extends js.Object {
      /**
                   * One and only one of the following should be specified. Exec specifies the action to take.
                   */
      var exec: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[ExecAction]] = js.undefined
      /**
                   * HTTPGet specifies the http request to perform.
                   */
      var httpGet: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[HTTPGetAction]] = js.undefined
      /**
                   * TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported
                   */
      var tcpSocket: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[TCPSocketAction]] = js.undefined
    }
    
    /**
             * HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the
             * pod's hosts file.
             */
    
    trait HostAlias extends js.Object {
      /**
                   * Hostnames for the above IP address.
                   */
      var hostnames: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]] = js.undefined
      /**
                   * IP address of the host file entry.
                   */
      var ip: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
             * Represents a host path mapped into a pod. Host path volumes do not support ownership
             * management or SELinux relabeling.
             */
    
    trait HostPathVolumeSource extends js.Object {
      /**
                   * Path of the directory on the host. If the path is a symlink, it will follow the link to the
                   * real path. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
                   */
      var path: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Type for HostPath Volume Defaults to "" More info:
                   * https://kubernetes.io/docs/concepts/storage/volumes#hostpath
                   */
      var `type`: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
             * ISCSIPersistentVolumeSource represents an ISCSI disk. ISCSI volumes can only be mounted as
             * read/write once. ISCSI volumes support ownership management and SELinux relabeling.
             */
    
    trait ISCSIPersistentVolumeSource extends js.Object {
      /**
                   * whether support iSCSI Discovery CHAP authentication
                   */
      var chapAuthDiscovery: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      /**
                   * whether support iSCSI Session CHAP authentication
                   */
      var chapAuthSession: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      /**
                   * Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type
                   * is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly
                   * inferred to be "ext4" if unspecified. More info:
                   * https://kubernetes.io/docs/concepts/storage/volumes#iscsi
                   */
      var fsType: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Custom iSCSI Initiator Name. If initiatorName is specified with iscsiInterface
                   * simultaneously, new iSCSI interface <target portal>:<volume name> will be created for the
                   * connection.
                   */
      var initiatorName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Target iSCSI Qualified Name.
                   */
      var iqn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * iSCSI Interface Name that uses an iSCSI transport. Defaults to 'default' (tcp).
                   */
      var iscsiInterface: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * iSCSI Target Lun number.
                   */
      var lun: atPulumiPulumiLib.resourceMod.Input[scala.Double]
      /**
                   * iSCSI Target Portal List. The Portal is either an IP or ip_addr:port if the port is other
                   * than default (typically TCP ports 860 and 3260).
                   */
      var portals: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]] = js.undefined
      /**
                   * ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false.
                   */
      var readOnly: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      /**
                   * CHAP Secret for iSCSI target and initiator authentication
                   */
      var secretRef: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[SecretReference]] = js.undefined
      /**
                   * iSCSI Target Portal. The Portal is either an IP or ip_addr:port if the port is other than
                   * default (typically TCP ports 860 and 3260).
                   */
      var targetPortal: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
    }
    
    /**
             * Represents an ISCSI disk. ISCSI volumes can only be mounted as read/write once. ISCSI volumes
             * support ownership management and SELinux relabeling.
             */
    
    trait ISCSIVolumeSource extends js.Object {
      /**
                   * whether support iSCSI Discovery CHAP authentication
                   */
      var chapAuthDiscovery: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      /**
                   * whether support iSCSI Session CHAP authentication
                   */
      var chapAuthSession: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      /**
                   * Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type
                   * is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly
                   * inferred to be "ext4" if unspecified. More info:
                   * https://kubernetes.io/docs/concepts/storage/volumes#iscsi
                   */
      var fsType: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Custom iSCSI Initiator Name. If initiatorName is specified with iscsiInterface
                   * simultaneously, new iSCSI interface <target portal>:<volume name> will be created for the
                   * connection.
                   */
      var initiatorName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Target iSCSI Qualified Name.
                   */
      var iqn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * iSCSI Interface Name that uses an iSCSI transport. Defaults to 'default' (tcp).
                   */
      var iscsiInterface: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * iSCSI Target Lun number.
                   */
      var lun: atPulumiPulumiLib.resourceMod.Input[scala.Double]
      /**
                   * iSCSI Target Portal List. The portal is either an IP or ip_addr:port if the port is other
                   * than default (typically TCP ports 860 and 3260).
                   */
      var portals: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]] = js.undefined
      /**
                   * ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false.
                   */
      var readOnly: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      /**
                   * CHAP Secret for iSCSI target and initiator authentication
                   */
      var secretRef: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[LocalObjectReference]] = js.undefined
      /**
                   * iSCSI Target Portal. The Portal is either an IP or ip_addr:port if the port is other than
                   * default (typically TCP ports 860 and 3260).
                   */
      var targetPortal: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
    }
    
    /**
             * Maps a string key to a path within a volume.
             */
    
    trait KeyToPath extends js.Object {
      /**
                   * The key to project.
                   */
      var key: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Optional: mode bits to use on this file, must be a value between 0 and 0777. If not
                   * specified, the volume defaultMode will be used. This might be in conflict with other
                   * options that affect the file mode, like fsGroup, and the result can be other mode bits set.
                   */
      var mode: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * The relative path of the file to map the key to. May not be an absolute path. May not
                   * contain the path element '..'. May not start with the string '..'.
                   */
      var path: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
    }
    
    /**
             * Lifecycle describes actions that the management system should take in response to container
             * lifecycle events. For the PostStart and PreStop lifecycle handlers, management of the
             * container blocks until the action is complete, unless the container process fails, in which
             * case the handler is aborted.
             */
    
    trait Lifecycle extends js.Object {
      /**
                   * PostStart is called immediately after a container is created. If the handler fails, the
                   * container is terminated and restarted according to its restart policy. Other management of
                   * the container blocks until the hook completes. More info:
                   * https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
                   */
      var postStart: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Handler]] = js.undefined
      /**
                   * PreStop is called immediately before a container is terminated. The container is terminated
                   * after the handler completes. The reason for termination is passed to the handler.
                   * Regardless of the outcome of the handler, the container is eventually terminated. Other
                   * management of the container blocks until the hook completes. More info:
                   * https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
                   */
      var preStop: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Handler]] = js.undefined
    }
    
    /**
             * LimitRange sets resource usage limits for each kind of resource in a Namespace.
             */
    
    trait LimitRange extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard object's metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
                   * Spec defines the limits enforced. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
                   */
      var spec: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[LimitRangeSpec]] = js.undefined
    }
    
    /**
             * LimitRangeItem defines a min/max usage limit for any resource that matches on kind.
             */
    
    trait LimitRangeItem extends js.Object {
      /**
                   * Default resource requirement limit value by resource name if resource limit is omitted.
                   */
      var default: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Object]] = js.undefined
      /**
                   * DefaultRequest is the default resource requirement request value by resource name if
                   * resource request is omitted.
                   */
      var defaultRequest: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Object]] = js.undefined
      /**
                   * Max usage constraints on this kind by resource name.
                   */
      var max: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Object]] = js.undefined
      /**
                   * MaxLimitRequestRatio if specified, the named resource must have a request and limit that
                   * are both non-zero where limit divided by request is less than or equal to the enumerated
                   * value; this represents the max burst for the named resource.
                   */
      var maxLimitRequestRatio: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Object]] = js.undefined
      /**
                   * Min usage constraints on this kind by resource name.
                   */
      var min: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Object]] = js.undefined
      /**
                   * Type of resource that this limit applies to.
                   */
      var `type`: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
             * LimitRangeList is a list of LimitRange items.
             */
    
    trait LimitRangeList extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Items is a list of LimitRange objects. More info:
                   * https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
                   */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[LimitRange]]
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard list metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
             * LimitRangeSpec defines a min/max usage limit for resources that match on kind.
             */
    
    trait LimitRangeSpec extends js.Object {
      /**
                   * Limits is the list of LimitRangeItem objects that are enforced.
                   */
      var limits: atPulumiPulumiLib.resourceMod.Input[js.Array[LimitRangeItem]]
    }
    
    /**
             * LoadBalancerIngress represents the status of a load-balancer ingress point: traffic intended
             * for the service should be sent to an ingress point.
             */
    
    trait LoadBalancerIngress extends js.Object {
      /**
                   * Hostname is set for load-balancer ingress points that are DNS based (typically AWS
                   * load-balancers)
                   */
      var hostname: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * IP is set for load-balancer ingress points that are IP based (typically GCE or OpenStack
                   * load-balancers)
                   */
      var ip: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
             * LoadBalancerStatus represents the status of a load-balancer.
             */
    
    trait LoadBalancerStatus extends js.Object {
      /**
                   * Ingress is a list containing ingress points for the load-balancer. Traffic intended for the
                   * service should be sent to these ingress points.
                   */
      var ingress: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[LoadBalancerIngress]]] = js.undefined
    }
    
    /**
             * LocalObjectReference contains enough information to let you locate the referenced object
             * inside the same namespace.
             */
    
    trait LocalObjectReference extends js.Object {
      /**
                   * Name of the referent. More info:
                   * https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
                   */
      var name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
             * Local represents directly-attached storage with node affinity
             */
    
    trait LocalVolumeSource extends js.Object {
      /**
                   * The full path to the volume on the node For alpha, this path must be a directory Once block
                   * as a source is supported, then this path can point to a block device
                   */
      var path: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
    }
    
    /**
             * Represents an NFS mount that lasts the lifetime of a pod. NFS volumes do not support
             * ownership management or SELinux relabeling.
             */
    
    trait NFSVolumeSource extends js.Object {
      /**
                   * Path that is exported by the NFS server. More info:
                   * https://kubernetes.io/docs/concepts/storage/volumes#nfs
                   */
      var path: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * ReadOnly here will force the NFS export to be mounted with read-only permissions. Defaults
                   * to false. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
                   */
      var readOnly: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      /**
                   * Server is the hostname or IP address of the NFS server. More info:
                   * https://kubernetes.io/docs/concepts/storage/volumes#nfs
                   */
      var server: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
    }
    
    /**
             * Namespace provides a scope for Names. Use of multiple namespaces is optional.
             */
    
    trait Namespace extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard object's metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
                   * Spec defines the behavior of the Namespace. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
                   */
      var spec: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[NamespaceSpec]] = js.undefined
      /**
                   * Status describes the current status of a Namespace. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
                   */
      var status: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[NamespaceStatus]] = js.undefined
    }
    
    /**
             * NamespaceList is a list of Namespaces.
             */
    
    trait NamespaceList extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Items is the list of Namespace objects in the list. More info:
                   * https://kubernetes.io/docs/concepts/overview/working-with-objects/namespaces/
                   */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[Namespace]]
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard list metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
             * NamespaceSpec describes the attributes on a Namespace.
             */
    
    trait NamespaceSpec extends js.Object {
      /**
                   * Finalizers is an opaque list of values that must be empty to permanently remove object from
                   * storage. More info: https://kubernetes.io/docs/tasks/administer-cluster/namespaces/
                   */
      var finalizers: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]] = js.undefined
    }
    
    /**
             * NamespaceStatus is information about the current status of a Namespace.
             */
    
    trait NamespaceStatus extends js.Object {
      /**
                   * Phase is the current lifecycle phase of the namespace. More info:
                   * https://kubernetes.io/docs/tasks/administer-cluster/namespaces/
                   */
      var phase: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
             * Node is a worker node in Kubernetes. Each node will have a unique identifier in the cache
             * (i.e. in etcd).
             */
    
    trait Node extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard object's metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
                   * Spec defines the behavior of a node.
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
                   */
      var spec: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[NodeSpec]] = js.undefined
      /**
                   * Most recently observed status of the node. Populated by the system. Read-only. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
                   */
      var status: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[NodeStatus]] = js.undefined
    }
    
    /**
             * NodeAddress contains information for the node's address.
             */
    
    trait NodeAddress extends js.Object {
      /**
                   * The node address.
                   */
      var address: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Node address type, one of Hostname, ExternalIP or InternalIP.
                   */
      var `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
    }
    
    /**
             * Node affinity is a group of node affinity scheduling rules.
             */
    
    trait NodeAffinity extends js.Object {
      /**
                   * The scheduler will prefer to schedule pods to nodes that satisfy the affinity expressions
                   * specified by this field, but it may choose a node that violates one or more of the
                   * expressions. The node that is most preferred is the one with the greatest sum of weights,
                   * i.e. for each node that meets all of the scheduling requirements (resource request,
                   * requiredDuringScheduling affinity expressions, etc.), compute a sum by iterating through
                   * the elements of this field and adding "weight" to the sum if the node matches the
                   * corresponding matchExpressions; the node(s) with the highest sum are the most preferred.
                   */
      var preferredDuringSchedulingIgnoredDuringExecution: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[PreferredSchedulingTerm]]] = js.undefined
      /**
                   * If the affinity requirements specified by this field are not met at scheduling time, the
                   * pod will not be scheduled onto the node. If the affinity requirements specified by this
                   * field cease to be met at some point during pod execution (e.g. due to an update), the
                   * system may or may not try to eventually evict the pod from its node.
                   */
      var requiredDuringSchedulingIgnoredDuringExecution: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[NodeSelector]] = js.undefined
    }
    
    /**
             * NodeCondition contains condition information for a node.
             */
    
    trait NodeCondition extends js.Object {
      /**
                   * Last time we got an update on a given condition.
                   */
      var lastHeartbeatTime: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Last time the condition transit from one status to another.
                   */
      var lastTransitionTime: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Human readable message indicating details about last transition.
                   */
      var message: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * (brief) reason for the condition's last transition.
                   */
      var reason: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Status of the condition, one of True, False, Unknown.
                   */
      var status: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Type of node condition.
                   */
      var `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
    }
    
    /**
             * NodeConfigSource specifies a source of node configuration. Exactly one subfield (excluding
             * metadata) must be non-nil.
             */
    
    trait NodeConfigSource extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      var configMapRef: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[ObjectReference]] = js.undefined
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
             * NodeDaemonEndpoints lists ports opened by daemons running on the Node.
             */
    
    trait NodeDaemonEndpoints extends js.Object {
      /**
                   * Endpoint on which Kubelet is listening.
                   */
      var kubeletEndpoint: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[DaemonEndpoint]] = js.undefined
    }
    
    /**
             * NodeList is the whole list of all Nodes which have been registered with master.
             */
    
    trait NodeList extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * List of nodes
                   */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[Node]]
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard list metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
             * A node selector represents the union of the results of one or more label queries over a set
             * of nodes; that is, it represents the OR of the selectors represented by the node selector
             * terms.
             */
    
    trait NodeSelector extends js.Object {
      /**
                   * Required. A list of node selector terms. The terms are ORed.
                   */
      var nodeSelectorTerms: atPulumiPulumiLib.resourceMod.Input[js.Array[NodeSelectorTerm]]
    }
    
    /**
             * A node selector requirement is a selector that contains values, a key, and an operator that
             * relates the key and values.
             */
    
    trait NodeSelectorRequirement extends js.Object {
      /**
                   * The label key that the selector applies to.
                   */
      var key: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Represents a key's relationship to a set of values. Valid operators are In, NotIn, Exists,
                   * DoesNotExist. Gt, and Lt.
                   */
      var operator: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * An array of string values. If the operator is In or NotIn, the values array must be
                   * non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. If
                   * the operator is Gt or Lt, the values array must have a single element, which will be
                   * interpreted as an integer. This array is replaced during a strategic merge patch.
                   */
      var values: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]] = js.undefined
    }
    
    /**
             * A null or empty node selector term matches no objects.
             */
    
    trait NodeSelectorTerm extends js.Object {
      /**
                   * Required. A list of node selector requirements. The requirements are ANDed.
                   */
      var matchExpressions: atPulumiPulumiLib.resourceMod.Input[js.Array[NodeSelectorRequirement]]
    }
    
    /**
             * NodeSpec describes the attributes that a node is created with.
             */
    
    trait NodeSpec extends js.Object {
      /**
                   * If specified, the source to get node configuration from The DynamicKubeletConfig feature
                   * gate must be enabled for the Kubelet to use this field
                   */
      var configSource: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[NodeConfigSource]] = js.undefined
      /**
                   * External ID of the node assigned by some machine database (e.g. a cloud provider).
                   * Deprecated.
                   */
      var externalID: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * PodCIDR represents the pod IP range assigned to the node.
                   */
      var podCIDR: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * ID of the node assigned by the cloud provider in the format:
                   * <ProviderName>://<ProviderSpecificNodeID>
                   */
      var providerID: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * If specified, the node's taints.
                   */
      var taints: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[Taint]]] = js.undefined
      /**
                   * Unschedulable controls node schedulability of new pods. By default, node is schedulable.
                   * More info: https://kubernetes.io/docs/concepts/nodes/node/#manual-node-administration
                   */
      var unschedulable: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
    }
    
    /**
             * NodeStatus is information about the current status of a node.
             */
    
    trait NodeStatus extends js.Object {
      /**
                   * List of addresses reachable to the node. Queried from cloud provider, if available. More
                   * info: https://kubernetes.io/docs/concepts/nodes/node/#addresses
                   */
      var addresses: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[NodeAddress]]] = js.undefined
      /**
                   * Allocatable represents the resources of a node that are available for scheduling. Defaults
                   * to Capacity.
                   */
      var allocatable: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Object]] = js.undefined
      /**
                   * Capacity represents the total resources of a node. More info:
                   * https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity
                   */
      var capacity: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Object]] = js.undefined
      /**
                   * Conditions is an array of current observed node conditions. More info:
                   * https://kubernetes.io/docs/concepts/nodes/node/#condition
                   */
      var conditions: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[NodeCondition]]] = js.undefined
      /**
                   * Endpoints of daemons running on the Node.
                   */
      var daemonEndpoints: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[NodeDaemonEndpoints]] = js.undefined
      /**
                   * List of container images on this node
                   */
      var images: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[ContainerImage]]] = js.undefined
      /**
                   * Set of ids/uuids to uniquely identify the node. More info:
                   * https://kubernetes.io/docs/concepts/nodes/node/#info
                   */
      var nodeInfo: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[NodeSystemInfo]] = js.undefined
      /**
                   * NodePhase is the recently observed lifecycle phase of the node. More info:
                   * https://kubernetes.io/docs/concepts/nodes/node/#phase The field is never populated, and now
                   * is deprecated.
                   */
      var phase: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * List of volumes that are attached to the node.
                   */
      var volumesAttached: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[AttachedVolume]]] = js.undefined
      /**
                   * List of attachable volumes in use (mounted) by the node.
                   */
      var volumesInUse: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]] = js.undefined
    }
    
    /**
             * NodeSystemInfo is a set of ids/uuids to uniquely identify the node.
             */
    
    trait NodeSystemInfo extends js.Object {
      /**
                   * The Architecture reported by the node
                   */
      var architecture: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Boot ID reported by the node.
                   */
      var bootID: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * ContainerRuntime Version reported by the node through runtime remote API (e.g.
                   * docker://1.5.0).
                   */
      var containerRuntimeVersion: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Kernel Version reported by the node from 'uname -r' (e.g. 3.16.0-0.bpo.4-amd64).
                   */
      var kernelVersion: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * KubeProxy Version reported by the node.
                   */
      var kubeProxyVersion: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Kubelet Version reported by the node.
                   */
      var kubeletVersion: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * MachineID reported by the node. For unique machine identification in the cluster this field
                   * is preferred. Learn more from man(5) machine-id:
                   * http://man7.org/linux/man-pages/man5/machine-id.5.html
                   */
      var machineID: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * The Operating System reported by the node
                   */
      var operatingSystem: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * OS Image reported by the node from /etc/os-release (e.g. Debian GNU/Linux 7 (wheezy)).
                   */
      var osImage: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * SystemUUID reported by the node. For unique machine identification MachineID is preferred.
                   * This field is specific to Red Hat hosts
                   * https://access.redhat.com/documentation/en-US/Red_Hat_Subscription_Management/1/html/RHSM/getting-system-uuid.html
                   */
      var systemUUID: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
    }
    
    /**
             * ObjectFieldSelector selects an APIVersioned field of an object.
             */
    
    trait ObjectFieldSelector extends js.Object {
      /**
                   * Version of the schema the FieldPath is written in terms of, defaults to "v1".
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Path of the field to select in the specified API version.
                   */
      var fieldPath: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
    }
    
    /**
             * ObjectReference contains enough information to let you inspect or modify the referred object.
             */
    
    trait ObjectReference extends js.Object {
      /**
                   * API version of the referent.
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * If referring to a piece of an object instead of an entire object, this string should
                   * contain a valid JSON/Go field access statement, such as
                   * desiredState.manifest.containers[2]. For example, if the object reference is to a container
                   * within a pod, this would take on a value like: "spec.containers{name}" (where "name" refers
                   * to the name of the container that triggered the event) or if no container name is specified
                   * "spec.containers[2]" (container with index 2 in this pod). This syntax is chosen only to
                   * have some well-defined way of referencing a part of an object.
                   */
      var fieldPath: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Kind of the referent. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Name of the referent. More info:
                   * https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
                   */
      var name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Namespace of the referent. More info:
                   * https://kubernetes.io/docs/concepts/overview/working-with-objects/namespaces/
                   */
      var namespace: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Specific resourceVersion to which this reference is made, if any. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#concurrency-control-and-consistency
                   */
      var resourceVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * UID of the referent. More info:
                   * https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#uids
                   */
      var uid: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
             * PersistentVolume (PV) is a storage resource provisioned by an administrator. It is analogous
             * to a node. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes
             */
    
    trait PersistentVolume extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard object's metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
                   * Spec defines a specification of a persistent volume owned by the cluster. Provisioned by an
                   * administrator. More info:
                   * https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistent-volumes
                   */
      var spec: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[PersistentVolumeSpec]] = js.undefined
      /**
                   * Status represents the current information/status for the persistent volume. Populated by
                   * the system. Read-only. More info:
                   * https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistent-volumes
                   */
      var status: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[PersistentVolumeStatus]] = js.undefined
    }
    
    /**
             * PersistentVolumeClaim is a user's request for and claim to a persistent volume
             */
    
    trait PersistentVolumeClaim extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard object's metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
                   * Spec defines the desired characteristics of a volume requested by a pod author. More info:
                   * https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
                   */
      var spec: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[PersistentVolumeClaimSpec]] = js.undefined
      /**
                   * Status represents the current information/status of a persistent volume claim. Read-only.
                   * More info:
                   * https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
                   */
      var status: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[PersistentVolumeClaimStatus]] = js.undefined
    }
    
    /**
             * PersistentVolumeClaimCondition contails details about state of pvc
             */
    
    trait PersistentVolumeClaimCondition extends js.Object {
      /**
                   * Last time we probed the condition.
                   */
      var lastProbeTime: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Last time the condition transitioned from one status to another.
                   */
      var lastTransitionTime: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Human-readable message indicating details about last transition.
                   */
      var message: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Unique, this should be a short, machine understandable string that gives the reason for
                   * condition's last transition. If it reports "ResizeStarted" that means the underlying
                   * persistent volume is being resized.
                   */
      var reason: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      var status: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      var `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
    }
    
    /**
             * PersistentVolumeClaimList is a list of PersistentVolumeClaim items.
             */
    
    trait PersistentVolumeClaimList extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * A list of persistent volume claims. More info:
                   * https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
                   */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[PersistentVolumeClaim]]
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard list metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
             * PersistentVolumeClaimSpec describes the common attributes of storage devices and allows a
             * Source for provider-specific attributes
             */
    
    trait PersistentVolumeClaimSpec extends js.Object {
      /**
                   * AccessModes contains the desired access modes the volume should have. More info:
                   * https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
                   */
      var accessModes: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]] = js.undefined
      /**
                   * Resources represents the minimum resources the volume should have. More info:
                   * https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources
                   */
      var resources: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[ResourceRequirements]] = js.undefined
      /**
                   * A label query over volumes to consider for binding.
                   */
      var selector: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.LabelSelector]
          ] = js.undefined
      /**
                   * Name of the StorageClass required by the claim. More info:
                   * https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1
                   */
      var storageClassName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * volumeMode defines what type of volume is required by the claim. Value of Filesystem is
                   * implied when not included in claim spec. This is an alpha feature and may change in the
                   * future.
                   */
      var volumeMode: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * VolumeName is the binding reference to the PersistentVolume backing this claim.
                   */
      var volumeName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
             * PersistentVolumeClaimStatus is the current status of a persistent volume claim.
             */
    
    trait PersistentVolumeClaimStatus extends js.Object {
      /**
                   * AccessModes contains the actual access modes the volume backing the PVC has. More info:
                   * https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
                   */
      var accessModes: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]] = js.undefined
      /**
                   * Represents the actual resources of the underlying volume.
                   */
      var capacity: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Object]] = js.undefined
      /**
                   * Current Condition of persistent volume claim. If underlying persistent volume is being
                   * resized then the Condition will be set to 'ResizeStarted'.
                   */
      var conditions: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[PersistentVolumeClaimCondition]]] = js.undefined
      /**
                   * Phase represents the current phase of PersistentVolumeClaim.
                   */
      var phase: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
             * PersistentVolumeClaimVolumeSource references the user's PVC in the same namespace. This
             * volume finds the bound PV and mounts that volume for the pod. A
             * PersistentVolumeClaimVolumeSource is, essentially, a wrapper around another type of volume
             * that is owned by someone else (the system).
             */
    
    trait PersistentVolumeClaimVolumeSource extends js.Object {
      /**
                   * ClaimName is the name of a PersistentVolumeClaim in the same namespace as the pod using
                   * this volume. More info:
                   * https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
                   */
      var claimName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Will force the ReadOnly setting in VolumeMounts. Default false.
                   */
      var readOnly: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
    }
    
    /**
             * PersistentVolumeList is a list of PersistentVolume items.
             */
    
    trait PersistentVolumeList extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * List of persistent volumes. More info:
                   * https://kubernetes.io/docs/concepts/storage/persistent-volumes
                   */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[PersistentVolume]]
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard list metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
             * PersistentVolumeSpec is the specification of a persistent volume.
             */
    
    trait PersistentVolumeSpec extends js.Object {
      /**
                   * AccessModes contains all ways the volume can be mounted. More info:
                   * https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes
                   */
      var accessModes: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]] = js.undefined
      /**
                   * AWSElasticBlockStore represents an AWS Disk resource that is attached to a kubelet's host
                   * machine and then exposed to the pod. More info:
                   * https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
                   */
      var awsElasticBlockStore: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[AWSElasticBlockStoreVolumeSource]] = js.undefined
      /**
                   * AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
                   */
      var azureDisk: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[AzureDiskVolumeSource]] = js.undefined
      /**
                   * AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
                   */
      var azureFile: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[AzureFilePersistentVolumeSource]] = js.undefined
      /**
                   * A description of the persistent volume's resources and capacity. More info:
                   * https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity
                   */
      var capacity: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Object]] = js.undefined
      /**
                   * CephFS represents a Ceph FS mount on the host that shares a pod's lifetime
                   */
      var cephfs: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[CephFSPersistentVolumeSource]] = js.undefined
      /**
                   * Cinder represents a cinder volume attached and mounted on kubelets host machine More info:
                   * https://releases.k8s.io/HEAD/examples/mysql-cinder-pd/README.md
                   */
      var cinder: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[CinderVolumeSource]] = js.undefined
      /**
                   * ClaimRef is part of a bi-directional binding between PersistentVolume and
                   * PersistentVolumeClaim. Expected to be non-nil when bound. claim.VolumeName is the
                   * authoritative bind between PV and PVC. More info:
                   * https://kubernetes.io/docs/concepts/storage/persistent-volumes#binding
                   */
      var claimRef: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[ObjectReference]] = js.undefined
      /**
                   * CSI represents storage that handled by an external CSI driver
                   */
      var csi: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[CSIPersistentVolumeSource]] = js.undefined
      /**
                   * FC represents a Fibre Channel resource that is attached to a kubelet's host machine and
                   * then exposed to the pod.
                   */
      var fc: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[FCVolumeSource]] = js.undefined
      /**
                   * FlexVolume represents a generic volume resource that is provisioned/attached using an exec
                   * based plugin.
                   */
      var flexVolume: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[FlexVolumeSource]] = js.undefined
      /**
                   * Flocker represents a Flocker volume attached to a kubelet's host machine and exposed to the
                   * pod for its usage. This depends on the Flocker control service being running
                   */
      var flocker: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[FlockerVolumeSource]] = js.undefined
      /**
                   * GCEPersistentDisk represents a GCE Disk resource that is attached to a kubelet's host
                   * machine and then exposed to the pod. Provisioned by an admin. More info:
                   * https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
                   */
      var gcePersistentDisk: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[GCEPersistentDiskVolumeSource]] = js.undefined
      /**
                   * Glusterfs represents a Glusterfs volume that is attached to a host and exposed to the pod.
                   * Provisioned by an admin. More info:
                   * https://releases.k8s.io/HEAD/examples/volumes/glusterfs/README.md
                   */
      var glusterfs: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[GlusterfsVolumeSource]] = js.undefined
      /**
                   * HostPath represents a directory on the host. Provisioned by a developer or tester. This is
                   * useful for single-node development and testing only! On-host storage is not supported in
                   * any way and WILL NOT WORK in a multi-node cluster. More info:
                   * https://kubernetes.io/docs/concepts/storage/volumes#hostpath
                   */
      var hostPath: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[HostPathVolumeSource]] = js.undefined
      /**
                   * ISCSI represents an ISCSI Disk resource that is attached to a kubelet's host machine and
                   * then exposed to the pod. Provisioned by an admin.
                   */
      var iscsi: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[ISCSIPersistentVolumeSource]] = js.undefined
      /**
                   * Local represents directly-attached storage with node affinity
                   */
      var local: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[LocalVolumeSource]] = js.undefined
      /**
                   * A list of mount options, e.g. ["ro", "soft"]. Not validated - mount will simply fail if one
                   * is invalid. More info:
                   * https://kubernetes.io/docs/concepts/storage/persistent-volumes/#mount-options
                   */
      var mountOptions: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]] = js.undefined
      /**
                   * NFS represents an NFS mount on the host. Provisioned by an admin. More info:
                   * https://kubernetes.io/docs/concepts/storage/volumes#nfs
                   */
      var nfs: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[NFSVolumeSource]] = js.undefined
      /**
                   * What happens to a persistent volume when released from its claim. Valid options are Retain
                   * (default) and Recycle. Recycling must be supported by the volume plugin underlying this
                   * persistent volume. More info:
                   * https://kubernetes.io/docs/concepts/storage/persistent-volumes#reclaiming
                   */
      var persistentVolumeReclaimPolicy: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * PhotonPersistentDisk represents a PhotonController persistent disk attached and mounted on
                   * kubelets host machine
                   */
      var photonPersistentDisk: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[PhotonPersistentDiskVolumeSource]] = js.undefined
      /**
                   * PortworxVolume represents a portworx volume attached and mounted on kubelets host machine
                   */
      var portworxVolume: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[PortworxVolumeSource]] = js.undefined
      /**
                   * Quobyte represents a Quobyte mount on the host that shares a pod's lifetime
                   */
      var quobyte: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[QuobyteVolumeSource]] = js.undefined
      /**
                   * RBD represents a Rados Block Device mount on the host that shares a pod's lifetime. More
                   * info: https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md
                   */
      var rbd: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[RBDPersistentVolumeSource]] = js.undefined
      /**
                   * ScaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.
                   */
      var scaleIO: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[ScaleIOPersistentVolumeSource]] = js.undefined
      /**
                   * Name of StorageClass to which this persistent volume belongs. Empty value means that this
                   * volume does not belong to any StorageClass.
                   */
      var storageClassName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * StorageOS represents a StorageOS volume that is attached to the kubelet's host machine and
                   * mounted into the pod More info:
                   * https://releases.k8s.io/HEAD/examples/volumes/storageos/README.md
                   */
      var storageos: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[StorageOSPersistentVolumeSource]] = js.undefined
      /**
                   * volumeMode defines if a volume is intended to be used with a formatted filesystem or to
                   * remain in raw block state. Value of Filesystem is implied when not included in spec. This
                   * is an alpha feature and may change in the future.
                   */
      var volumeMode: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * VsphereVolume represents a vSphere volume attached and mounted on kubelets host machine
                   */
      var vsphereVolume: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[VsphereVirtualDiskVolumeSource]] = js.undefined
    }
    
    /**
             * PersistentVolumeStatus is the current status of a persistent volume.
             */
    
    trait PersistentVolumeStatus extends js.Object {
      /**
                   * A human-readable message indicating details about why the volume is in this state.
                   */
      var message: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Phase indicates if a volume is available, bound to a claim, or released by a claim. More
                   * info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#phase
                   */
      var phase: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Reason is a brief CamelCase string that describes any failure and is meant for machine
                   * parsing and tidy display in the CLI.
                   */
      var reason: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
             * Represents a Photon Controller persistent disk resource.
             */
    
    trait PhotonPersistentDiskVolumeSource extends js.Object {
      /**
                   * Filesystem type to mount. Must be a filesystem type supported by the host operating system.
                   * Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
                   */
      var fsType: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * ID that identifies Photon Controller persistent disk
                   */
      var pdID: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
    }
    
    /**
             * Pod is a collection of containers that can run on a host. This resource is created by clients
             * and scheduled onto hosts.
             */
    
    trait Pod extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard object's metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
                   * Specification of the desired behavior of the pod. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
                   */
      var spec: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[PodSpec]] = js.undefined
      /**
                   * Most recently observed status of the pod. This data may not be up to date. Populated by the
                   * system. Read-only. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
                   */
      var status: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[PodStatus]] = js.undefined
    }
    
    /**
             * Pod affinity is a group of inter pod affinity scheduling rules.
             */
    
    trait PodAffinity extends js.Object {
      /**
                   * The scheduler will prefer to schedule pods to nodes that satisfy the affinity expressions
                   * specified by this field, but it may choose a node that violates one or more of the
                   * expressions. The node that is most preferred is the one with the greatest sum of weights,
                   * i.e. for each node that meets all of the scheduling requirements (resource request,
                   * requiredDuringScheduling affinity expressions, etc.), compute a sum by iterating through
                   * the elements of this field and adding "weight" to the sum if the node has pods which
                   * matches the corresponding podAffinityTerm; the node(s) with the highest sum are the most
                   * preferred.
                   */
      var preferredDuringSchedulingIgnoredDuringExecution: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[WeightedPodAffinityTerm]]] = js.undefined
      /**
                   * If the affinity requirements specified by this field are not met at scheduling time, the
                   * pod will not be scheduled onto the node. If the affinity requirements specified by this
                   * field cease to be met at some point during pod execution (e.g. due to a pod label update),
                   * the system may or may not try to eventually evict the pod from its node. When there are
                   * multiple elements, the lists of nodes corresponding to each podAffinityTerm are
                   * intersected, i.e. all terms must be satisfied.
                   */
      var requiredDuringSchedulingIgnoredDuringExecution: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[PodAffinityTerm]]] = js.undefined
    }
    
    /**
             * Defines a set of pods (namely those matching the labelSelector relative to the given
             * namespace(s)) that this pod should be co-located (affinity) or not co-located (anti-affinity)
             * with, where co-located is defined as running on a node whose value of the label with key
             * <topologyKey> matches that of any node on which a pod of the set of pods is running
             */
    
    trait PodAffinityTerm extends js.Object {
      /**
                   * A label query over a set of resources, in this case pods.
                   */
      var labelSelector: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.LabelSelector]
          ] = js.undefined
      /**
                   * namespaces specifies which namespaces the labelSelector applies to (matches against); null
                   * or empty list means "this pod's namespace"
                   */
      var namespaces: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]] = js.undefined
      /**
                   * This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods
                   * matching the labelSelector in the specified namespaces, where co-located is defined as
                   * running on a node whose value of the label with key topologyKey matches that of any node on
                   * which any of the selected pods is running. Empty topologyKey is not allowed.
                   */
      var topologyKey: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
    }
    
    /**
             * Pod anti affinity is a group of inter pod anti affinity scheduling rules.
             */
    
    trait PodAntiAffinity extends js.Object {
      /**
                   * The scheduler will prefer to schedule pods to nodes that satisfy the anti-affinity
                   * expressions specified by this field, but it may choose a node that violates one or more of
                   * the expressions. The node that is most preferred is the one with the greatest sum of
                   * weights, i.e. for each node that meets all of the scheduling requirements (resource
                   * request, requiredDuringScheduling anti-affinity expressions, etc.), compute a sum by
                   * iterating through the elements of this field and adding "weight" to the sum if the node has
                   * pods which matches the corresponding podAffinityTerm; the node(s) with the highest sum are
                   * the most preferred.
                   */
      var preferredDuringSchedulingIgnoredDuringExecution: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[WeightedPodAffinityTerm]]] = js.undefined
      /**
                   * If the anti-affinity requirements specified by this field are not met at scheduling time,
                   * the pod will not be scheduled onto the node. If the anti-affinity requirements specified by
                   * this field cease to be met at some point during pod execution (e.g. due to a pod label
                   * update), the system may or may not try to eventually evict the pod from its node. When
                   * there are multiple elements, the lists of nodes corresponding to each podAffinityTerm are
                   * intersected, i.e. all terms must be satisfied.
                   */
      var requiredDuringSchedulingIgnoredDuringExecution: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[PodAffinityTerm]]] = js.undefined
    }
    
    /**
             * PodCondition contains details for the current condition of this pod.
             */
    
    trait PodCondition extends js.Object {
      /**
                   * Last time we probed the condition.
                   */
      var lastProbeTime: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Last time the condition transitioned from one status to another.
                   */
      var lastTransitionTime: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Human-readable message indicating details about last transition.
                   */
      var message: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Unique, one-word, CamelCase reason for the condition's last transition.
                   */
      var reason: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Status is the status of the condition. Can be True, False, Unknown. More info:
                   * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions
                   */
      var status: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Type is the type of the condition. Currently only Ready. More info:
                   * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions
                   */
      var `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
    }
    
    /**
             * PodDNSConfig defines the DNS parameters of a pod in addition to those generated from
             * DNSPolicy.
             */
    
    trait PodDNSConfig extends js.Object {
      /**
                   * A list of DNS name server IP addresses. This will be appended to the base nameservers
                   * generated from DNSPolicy. Duplicated nameservers will be removed.
                   */
      var nameservers: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]] = js.undefined
      /**
                   * A list of DNS resolver options. This will be merged with the base options generated from
                   * DNSPolicy. Duplicated entries will be removed. Resolution options given in Options will
                   * override those that appear in the base DNSPolicy.
                   */
      var options: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[PodDNSConfigOption]]] = js.undefined
      /**
                   * A list of DNS search domains for host-name lookup. This will be appended to the base search
                   * paths generated from DNSPolicy. Duplicated search paths will be removed.
                   */
      var searches: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]] = js.undefined
    }
    
    /**
             * PodDNSConfigOption defines DNS resolver options of a pod.
             */
    
    trait PodDNSConfigOption extends js.Object {
      /**
                   * Required.
                   */
      var name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      var value: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
             * PodList is a list of Pods.
             */
    
    trait PodList extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * List of pods. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md
                   */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[Pod]]
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard list metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
             * PodSecurityContext holds pod-level security attributes and common container settings. Some
             * fields are also present in container.securityContext.  Field values of
             * container.securityContext take precedence over field values of PodSecurityContext.
             */
    
    trait PodSecurityContext extends js.Object {
      /**
                   * A special supplemental group that applies to all containers in a pod. Some volume types
                   * allow the Kubelet to change the ownership of that volume to be owned by the pod:
                   *
                   * 1. The owning GID will be the FSGroup 2. The setgid bit is set (new files created in the
                   * volume will be owned by FSGroup) 3. The permission bits are OR'd with rw-rw----
                   *
                   * If unset, the Kubelet will not modify the ownership and permissions of any volume.
                   */
      var fsGroup: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * Indicates that the container must run as a non-root user. If true, the Kubelet will
                   * validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to
                   * start the container if it does. If unset or false, no such validation will be performed.
                   * May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext,
                   * the value specified in SecurityContext takes precedence.
                   */
      var runAsNonRoot: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      /**
                   * The UID to run the entrypoint of the container process. Defaults to user specified in image
                   * metadata if unspecified. May also be set in SecurityContext.  If set in both
                   * SecurityContext and PodSecurityContext, the value specified in SecurityContext takes
                   * precedence for that container.
                   */
      var runAsUser: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * The SELinux context to be applied to all containers. If unspecified, the container runtime
                   * will allocate a random SELinux context for each container.  May also be set in
                   * SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value
                   * specified in SecurityContext takes precedence for that container.
                   */
      var seLinuxOptions: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[SELinuxOptions]] = js.undefined
      /**
                   * A list of groups applied to the first process run in each container, in addition to the
                   * container's primary GID.  If unspecified, no groups will be added to any container.
                   */
      var supplementalGroups: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[scala.Double]]] = js.undefined
    }
    
    /**
             * PodSpec is a description of a pod.
             */
    
    trait PodSpec extends js.Object {
      /**
                   * Optional duration in seconds the pod may be active on the node relative to StartTime before
                   * the system will actively try to mark it failed and kill associated containers. Value must
                   * be a positive integer.
                   */
      var activeDeadlineSeconds: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * If specified, the pod's scheduling constraints
                   */
      var affinity: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Affinity]] = js.undefined
      /**
                   * AutomountServiceAccountToken indicates whether a service account token should be
                   * automatically mounted.
                   */
      var automountServiceAccountToken: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      /**
                   * List of containers belonging to the pod. Containers cannot currently be added or removed.
                   * There must be at least one container in a Pod. Cannot be updated.
                   */
      var containers: atPulumiPulumiLib.resourceMod.Input[js.Array[Container]]
      /**
                   * Specifies the DNS parameters of a pod. Parameters specified here will be merged to the
                   * generated DNS configuration based on DNSPolicy. This is an alpha feature introduced in v1.9
                   * and CustomPodDNS feature gate must be enabled to use it.
                   */
      var dnsConfig: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[PodDNSConfig]] = js.undefined
      /**
                   * Set DNS policy for the pod. Defaults to "ClusterFirst". Valid values are
                   * 'ClusterFirstWithHostNet', 'ClusterFirst', 'Default' or 'None'. DNS parameters given in
                   * DNSConfig will be merged with the policy selected with DNSPolicy. To have DNS options set
                   * along with hostNetwork, you have to specify DNS policy explicitly to
                   * 'ClusterFirstWithHostNet'. Note that 'None' policy is an alpha feature introduced in v1.9
                   * and CustomPodDNS feature gate must be enabled to use it.
                   */
      var dnsPolicy: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * HostAliases is an optional list of hosts and IPs that will be injected into the pod's hosts
                   * file if specified. This is only valid for non-hostNetwork pods.
                   */
      var hostAliases: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[HostAlias]]] = js.undefined
      /**
                   * Use the host's ipc namespace. Optional: Default to false.
                   */
      var hostIPC: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      /**
                   * Host networking requested for this pod. Use the host's network namespace. If this option is
                   * set, the ports that will be used must be specified. Default to false.
                   */
      var hostNetwork: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      /**
                   * Use the host's pid namespace. Optional: Default to false.
                   */
      var hostPID: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      /**
                   * Specifies the hostname of the Pod If not specified, the pod's hostname will be set to a
                   * system-defined value.
                   */
      var hostname: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * ImagePullSecrets is an optional list of references to secrets in the same namespace to use
                   * for pulling any of the images used by this PodSpec. If specified, these secrets will be
                   * passed to individual puller implementations for them to use. For example, in the case of
                   * docker, only DockerConfig type secrets are honored. More info:
                   * https://kubernetes.io/docs/concepts/containers/images#specifying-imagepullsecrets-on-a-pod
                   */
      var imagePullSecrets: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[LocalObjectReference]]] = js.undefined
      /**
                   * List of initialization containers belonging to the pod. Init containers are executed in
                   * order prior to containers being started. If any init container fails, the pod is considered
                   * to have failed and is handled according to its restartPolicy. The name for an init
                   * container or normal container must be unique among all containers. Init containers may not
                   * have Lifecycle actions, Readiness probes, or Liveness probes. The resourceRequirements of
                   * an init container are taken into account during scheduling by finding the highest
                   * request/limit for each resource type, and then using the max of of that value or the sum of
                   * the normal containers. Limits are applied to init containers in a similar fashion. Init
                   * containers cannot currently be added or removed. Cannot be updated. More info:
                   * https://kubernetes.io/docs/concepts/workloads/pods/init-containers/
                   */
      var initContainers: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[Container]]] = js.undefined
      /**
                   * NodeName is a request to schedule this pod onto a specific node. If it is non-empty, the
                   * scheduler simply schedules this pod onto that node, assuming that it fits resource
                   * requirements.
                   */
      var nodeName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * NodeSelector is a selector which must be true for the pod to fit on a node. Selector which
                   * must match a node's labels for the pod to be scheduled on that node. More info:
                   * https://kubernetes.io/docs/concepts/configuration/assign-pod-node/
                   */
      var nodeSelector: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[
              ScalablyTyped.runtime.StringDictionary[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]
            ]
          ] = js.undefined
      /**
                   * The priority value. Various system components use this field to find the priority of the
                   * pod. When Priority Admission Controller is enabled, it prevents users from setting this
                   * field. The admission controller populates this field from PriorityClassName. The higher the
                   * value, the higher the priority.
                   */
      var priority: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * If specified, indicates the pod's priority. "SYSTEM" is a special keyword which indicates
                   * the highest priority. Any other name must be defined by creating a PriorityClass object
                   * with that name. If not specified, the pod priority will be default or zero if there is no
                   * default.
                   */
      var priorityClassName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Restart policy for all containers within the pod. One of Always, OnFailure, Never. Default
                   * to Always. More info:
                   * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy
                   */
      var restartPolicy: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * If specified, the pod will be dispatched by specified scheduler. If not specified, the pod
                   * will be dispatched by default scheduler.
                   */
      var schedulerName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * SecurityContext holds pod-level security attributes and common container settings.
                   * Optional: Defaults to empty.  See type description for default values of each field.
                   */
      var securityContext: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[PodSecurityContext]] = js.undefined
      /**
                   * DeprecatedServiceAccount is a depreciated alias for ServiceAccountName. Deprecated: Use
                   * serviceAccountName instead.
                   */
      var serviceAccount: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * ServiceAccountName is the name of the ServiceAccount to use to run this pod. More info:
                   * https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/
                   */
      var serviceAccountName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * If specified, the fully qualified Pod hostname will be "<hostname>.<subdomain>.<pod
                   * namespace>.svc.<cluster domain>". If not specified, the pod will not have a domainname at
                   * all.
                   */
      var subdomain: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Optional duration in seconds the pod needs to terminate gracefully. May be decreased in
                   * delete request. Value must be non-negative integer. The value zero indicates delete
                   * immediately. If this value is nil, the default grace period will be used instead. The grace
                   * period is the duration in seconds after the processes running in the pod are sent a
                   * termination signal and the time when the processes are forcibly halted with a kill signal.
                   * Set this value longer than the expected cleanup time for your process. Defaults to 30
                   * seconds.
                   */
      var terminationGracePeriodSeconds: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * If specified, the pod's tolerations.
                   */
      var tolerations: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[Toleration]]] = js.undefined
      /**
                   * List of volumes that can be mounted by containers belonging to the pod. More info:
                   * https://kubernetes.io/docs/concepts/storage/volumes
                   */
      var volumes: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[Volume]]] = js.undefined
    }
    
    /**
             * PodStatus represents information about the status of a pod. Status may trail the actual state
             * of a system.
             */
    
    trait PodStatus extends js.Object {
      /**
                   * Current service state of pod. More info:
                   * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions
                   */
      var conditions: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[PodCondition]]] = js.undefined
      /**
                   * The list has one entry per container in the manifest. Each entry is currently the output of
                   * `docker inspect`. More info:
                   * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status
                   */
      var containerStatuses: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[ContainerStatus]]] = js.undefined
      /**
                   * IP address of the host to which the pod is assigned. Empty if not yet scheduled.
                   */
      var hostIP: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * The list has one entry per init container in the manifest. The most recent successful init
                   * container will have ready = true, the most recently started container will have startTime
                   * set. More info:
                   * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status
                   */
      var initContainerStatuses: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[ContainerStatus]]] = js.undefined
      /**
                   * A human readable message indicating details about why the pod is in this condition.
                   */
      var message: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Current condition of the pod. More info:
                   * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-phase
                   */
      var phase: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * IP address allocated to the pod. Routable at least within the cluster. Empty if not yet
                   * allocated.
                   */
      var podIP: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * The Quality of Service (QOS) classification assigned to the pod based on resource
                   * requirements See PodQOSClass type for available QOS classes More info:
                   * https://github.com/kubernetes/kubernetes/blob/master/docs/design/resource-qos.md
                   */
      var qosClass: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * A brief CamelCase message indicating details about why the pod is in this state. e.g.
                   * 'Evicted'
                   */
      var reason: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * RFC 3339 date and time at which the object was acknowledged by the Kubelet. This is before
                   * the Kubelet pulled the container image(s) for the pod.
                   */
      var startTime: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
             * PodTemplate describes a template for creating copies of a predefined pod.
             */
    
    trait PodTemplate extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard object's metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
                   * Template defines the pods that will be created from this pod template.
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
                   */
      var template: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[PodTemplateSpec]] = js.undefined
    }
    
    /**
             * PodTemplateList is a list of PodTemplates.
             */
    
    trait PodTemplateList extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * List of pod templates
                   */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[PodTemplate]]
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard list metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
             * PodTemplateSpec describes the data a pod should have when created from a template
             */
    
    trait PodTemplateSpec extends js.Object {
      /**
                   * Standard object's metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
                   * Specification of the desired behavior of the pod. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
                   */
      var spec: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[PodSpec]] = js.undefined
    }
    
    /**
             * PortworxVolumeSource represents a Portworx volume resource.
             */
    
    trait PortworxVolumeSource extends js.Object {
      /**
                   * FSType represents the filesystem type to mount Must be a filesystem type supported by the
                   * host operating system. Ex. "ext4", "xfs". Implicitly inferred to be "ext4" if unspecified.
                   */
      var fsType: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in
                   * VolumeMounts.
                   */
      var readOnly: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      /**
                   * VolumeID uniquely identifies a Portworx volume
                   */
      var volumeID: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
    }
    
    /**
             * An empty preferred scheduling term matches all objects with implicit weight 0 (i.e. it's a
             * no-op). A null preferred scheduling term matches no objects (i.e. is also a no-op).
             */
    
    trait PreferredSchedulingTerm extends js.Object {
      /**
                   * A node selector term, associated with the corresponding weight.
                   */
      var preference: atPulumiPulumiLib.resourceMod.Input[NodeSelectorTerm]
      /**
                   * Weight associated with matching the corresponding nodeSelectorTerm, in the range 1-100.
                   */
      var weight: atPulumiPulumiLib.resourceMod.Input[scala.Double]
    }
    
    /**
             * Probe describes a health check to be performed against a container to determine whether it is
             * alive or ready to receive traffic.
             */
    
    trait Probe extends js.Object {
      /**
                   * One and only one of the following should be specified. Exec specifies the action to take.
                   */
      var exec: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[ExecAction]] = js.undefined
      /**
                   * Minimum consecutive failures for the probe to be considered failed after having succeeded.
                   * Defaults to 3. Minimum value is 1.
                   */
      var failureThreshold: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * HTTPGet specifies the http request to perform.
                   */
      var httpGet: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[HTTPGetAction]] = js.undefined
      /**
                   * Number of seconds after the container has started before liveness probes are initiated.
                   * More info:
                   * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
                   */
      var initialDelaySeconds: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1.
                   */
      var periodSeconds: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * Minimum consecutive successes for the probe to be considered successful after having
                   * failed. Defaults to 1. Must be 1 for liveness. Minimum value is 1.
                   */
      var successThreshold: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported
                   */
      var tcpSocket: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[TCPSocketAction]] = js.undefined
      /**
                   * Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is
                   * 1. More info:
                   * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
                   */
      var timeoutSeconds: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
    }
    
    /**
             * Represents a projected volume source
             */
    
    trait ProjectedVolumeSource extends js.Object {
      /**
                   * Mode bits to use on created files by default. Must be a value between 0 and 0777.
                   * Directories within the path are not affected by this setting. This might be in conflict
                   * with other options that affect the file mode, like fsGroup, and the result can be other
                   * mode bits set.
                   */
      var defaultMode: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * list of volume projections
                   */
      var sources: atPulumiPulumiLib.resourceMod.Input[js.Array[VolumeProjection]]
    }
    
    /**
             * Represents a Quobyte mount that lasts the lifetime of a pod. Quobyte volumes do not support
             * ownership management or SELinux relabeling.
             */
    
    trait QuobyteVolumeSource extends js.Object {
      /**
                   * Group to map volume access to Default is no group
                   */
      var group: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * ReadOnly here will force the Quobyte volume to be mounted with read-only permissions.
                   * Defaults to false.
                   */
      var readOnly: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      /**
                   * Registry represents a single or multiple Quobyte Registry services specified as a string as
                   * host:port pair (multiple entries are separated with commas) which acts as the central
                   * registry for volumes
                   */
      var registry: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * User to map volume access to Defaults to serivceaccount user
                   */
      var user: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Volume is a string that references an already created Quobyte volume by name.
                   */
      var volume: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
    }
    
    /**
             * Represents a Rados Block Device mount that lasts the lifetime of a pod. RBD volumes support
             * ownership management and SELinux relabeling.
             */
    
    trait RBDPersistentVolumeSource extends js.Object {
      /**
                   * Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type
                   * is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly
                   * inferred to be "ext4" if unspecified. More info:
                   * https://kubernetes.io/docs/concepts/storage/volumes#rbd
                   */
      var fsType: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * The rados image name. More info:
                   * https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md#how-to-use-it
                   */
      var image: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Keyring is the path to key ring for RBDUser. Default is /etc/ceph/keyring. More info:
                   * https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md#how-to-use-it
                   */
      var keyring: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * A collection of Ceph monitors. More info:
                   * https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md#how-to-use-it
                   */
      var monitors: atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]
      /**
                   * The rados pool name. Default is rbd. More info:
                   * https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md#how-to-use-it
                   */
      var pool: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false. More
                   * info: https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md#how-to-use-it
                   */
      var readOnly: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      /**
                   * SecretRef is name of the authentication secret for RBDUser. If provided overrides keyring.
                   * Default is nil. More info:
                   * https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md#how-to-use-it
                   */
      var secretRef: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[SecretReference]] = js.undefined
      /**
                   * The rados user name. Default is admin. More info:
                   * https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md#how-to-use-it
                   */
      var user: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
             * Represents a Rados Block Device mount that lasts the lifetime of a pod. RBD volumes support
             * ownership management and SELinux relabeling.
             */
    
    trait RBDVolumeSource extends js.Object {
      /**
                   * Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type
                   * is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly
                   * inferred to be "ext4" if unspecified. More info:
                   * https://kubernetes.io/docs/concepts/storage/volumes#rbd
                   */
      var fsType: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * The rados image name. More info:
                   * https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md#how-to-use-it
                   */
      var image: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Keyring is the path to key ring for RBDUser. Default is /etc/ceph/keyring. More info:
                   * https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md#how-to-use-it
                   */
      var keyring: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * A collection of Ceph monitors. More info:
                   * https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md#how-to-use-it
                   */
      var monitors: atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]
      /**
                   * The rados pool name. Default is rbd. More info:
                   * https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md#how-to-use-it
                   */
      var pool: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false. More
                   * info: https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md#how-to-use-it
                   */
      var readOnly: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      /**
                   * SecretRef is name of the authentication secret for RBDUser. If provided overrides keyring.
                   * Default is nil. More info:
                   * https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md#how-to-use-it
                   */
      var secretRef: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[LocalObjectReference]] = js.undefined
      /**
                   * The rados user name. Default is admin. More info:
                   * https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md#how-to-use-it
                   */
      var user: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
             * ReplicationController represents the configuration of a replication controller.
             */
    
    trait ReplicationController extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * If the Labels of a ReplicationController are empty, they are defaulted to be the same as
                   * the Pod(s) that the replication controller manages. Standard object's metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
                   * Spec defines the specification of the desired behavior of the replication controller. More
                   * info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
                   */
      var spec: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[ReplicationControllerSpec]] = js.undefined
      /**
                   * Status is the most recently observed status of the replication controller. This data may be
                   * out of date by some window of time. Populated by the system. Read-only. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
                   */
      var status: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[ReplicationControllerStatus]] = js.undefined
    }
    
    /**
             * ReplicationControllerCondition describes the state of a replication controller at a certain
             * point.
             */
    
    trait ReplicationControllerCondition extends js.Object {
      /**
                   * The last time the condition transitioned from one status to another.
                   */
      var lastTransitionTime: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * A human readable message indicating details about the transition.
                   */
      var message: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * The reason for the condition's last transition.
                   */
      var reason: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Status of the condition, one of True, False, Unknown.
                   */
      var status: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Type of replication controller condition.
                   */
      var `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
    }
    
    /**
             * ReplicationControllerList is a collection of replication controllers.
             */
    
    trait ReplicationControllerList extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * List of replication controllers. More info:
                   * https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller
                   */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[ReplicationController]]
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard list metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
             * ReplicationControllerSpec is the specification of a replication controller.
             */
    
    trait ReplicationControllerSpec extends js.Object {
      /**
                   * Minimum number of seconds for which a newly created pod should be ready without any of its
                   * container crashing, for it to be considered available. Defaults to 0 (pod will be
                   * considered available as soon as it is ready)
                   */
      var minReadySeconds: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * Replicas is the number of desired replicas. This is a pointer to distinguish between
                   * explicit zero and unspecified. Defaults to 1. More info:
                   * https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#what-is-a-replicationcontroller
                   */
      var replicas: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * Selector is a label query over pods that should match the Replicas count. If Selector is
                   * empty, it is defaulted to the labels present on the Pod template. Label keys and values
                   * that must match in order to be controlled by this replication controller, if empty
                   * defaulted to labels on Pod template. More info:
                   * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
                   */
      var selector: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[
              ScalablyTyped.runtime.StringDictionary[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]
            ]
          ] = js.undefined
      /**
                   * Template is the object that describes the pod that will be created if insufficient replicas
                   * are detected. This takes precedence over a TemplateRef. More info:
                   * https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template
                   */
      var template: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[PodTemplateSpec]] = js.undefined
    }
    
    /**
             * ReplicationControllerStatus represents the current status of a replication controller.
             */
    
    trait ReplicationControllerStatus extends js.Object {
      /**
                   * The number of available replicas (ready for at least minReadySeconds) for this replication
                   * controller.
                   */
      var availableReplicas: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * Represents the latest available observations of a replication controller's current state.
                   */
      var conditions: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[ReplicationControllerCondition]]] = js.undefined
      /**
                   * The number of pods that have labels matching the labels of the pod template of the
                   * replication controller.
                   */
      var fullyLabeledReplicas: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * ObservedGeneration reflects the generation of the most recently observed replication
                   * controller.
                   */
      var observedGeneration: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * The number of ready replicas for this replication controller.
                   */
      var readyReplicas: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * Replicas is the most recently oberved number of replicas. More info:
                   * https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#what-is-a-replicationcontroller
                   */
      var replicas: atPulumiPulumiLib.resourceMod.Input[scala.Double]
    }
    
    /**
             * ResourceFieldSelector represents container resources (cpu, memory) and their output format
             */
    
    trait ResourceFieldSelector extends js.Object {
      /**
                   * Container name: required for volumes, optional for env vars
                   */
      var containerName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Specifies the output format of the exposed resources, defaults to "1"
                   */
      var divisor: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Required: resource to select
                   */
      var resource: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
    }
    
    /**
             * ResourceQuota sets aggregate quota restrictions enforced per namespace
             */
    
    trait ResourceQuota extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard object's metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
                   * Spec defines the desired quota.
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
                   */
      var spec: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[ResourceQuotaSpec]] = js.undefined
      /**
                   * Status defines the actual enforced quota and its current usage.
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
                   */
      var status: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[ResourceQuotaStatus]] = js.undefined
    }
    
    /**
             * ResourceQuotaList is a list of ResourceQuota items.
             */
    
    trait ResourceQuotaList extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Items is a list of ResourceQuota objects. More info:
                   * https://kubernetes.io/docs/concepts/policy/resource-quotas/
                   */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[ResourceQuota]]
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard list metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
             * ResourceQuotaSpec defines the desired hard limits to enforce for Quota.
             */
    
    trait ResourceQuotaSpec extends js.Object {
      /**
                   * Hard is the set of desired hard limits for each named resource. More info:
                   * https://kubernetes.io/docs/concepts/policy/resource-quotas/
                   */
      var hard: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Object]] = js.undefined
      /**
                   * A collection of filters that must match each object tracked by a quota. If not specified,
                   * the quota matches all objects.
                   */
      var scopes: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]] = js.undefined
    }
    
    /**
             * ResourceQuotaStatus defines the enforced hard limits and observed use.
             */
    
    trait ResourceQuotaStatus extends js.Object {
      /**
                   * Hard is the set of enforced hard limits for each named resource. More info:
                   * https://kubernetes.io/docs/concepts/policy/resource-quotas/
                   */
      var hard: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Object]] = js.undefined
      /**
                   * Used is the current observed total usage of the resource in the namespace.
                   */
      var used: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Object]] = js.undefined
    }
    
    /**
             * ResourceRequirements describes the compute resource requirements.
             */
    
    trait ResourceRequirements extends js.Object {
      /**
                   * Limits describes the maximum amount of compute resources allowed. More info:
                   * https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
                   */
      var limits: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Object]] = js.undefined
      /**
                   * Requests describes the minimum amount of compute resources required. If Requests is omitted
                   * for a container, it defaults to Limits if that is explicitly specified, otherwise to an
                   * implementation-defined value. More info:
                   * https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
                   */
      var requests: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Object]] = js.undefined
    }
    
    /**
             * SELinuxOptions are the labels to be applied to the container
             */
    
    trait SELinuxOptions extends js.Object {
      /**
                   * Level is SELinux level label that applies to the container.
                   */
      var level: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Role is a SELinux role label that applies to the container.
                   */
      var role: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Type is a SELinux type label that applies to the container.
                   */
      var `type`: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * User is a SELinux user label that applies to the container.
                   */
      var user: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
             * ScaleIOPersistentVolumeSource represents a persistent ScaleIO volume
             */
    
    trait ScaleIOPersistentVolumeSource extends js.Object {
      /**
                   * Filesystem type to mount. Must be a filesystem type supported by the host operating system.
                   * Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
                   */
      var fsType: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * The host address of the ScaleIO API Gateway.
                   */
      var gateway: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * The name of the ScaleIO Protection Domain for the configured storage.
                   */
      var protectionDomain: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in
                   * VolumeMounts.
                   */
      var readOnly: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      /**
                   * SecretRef references to the secret for ScaleIO user and other sensitive information. If
                   * this is not provided, Login operation will fail.
                   */
      var secretRef: atPulumiPulumiLib.resourceMod.Input[SecretReference]
      /**
                   * Flag to enable/disable SSL communication with Gateway, default false
                   */
      var sslEnabled: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      /**
                   * Indicates whether the storage for a volume should be ThickProvisioned or ThinProvisioned.
                   */
      var storageMode: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * The ScaleIO Storage Pool associated with the protection domain.
                   */
      var storagePool: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * The name of the storage system as configured in ScaleIO.
                   */
      var system: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * The name of a volume already created in the ScaleIO system that is associated with this
                   * volume source.
                   */
      var volumeName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
             * ScaleIOVolumeSource represents a persistent ScaleIO volume
             */
    
    trait ScaleIOVolumeSource extends js.Object {
      /**
                   * Filesystem type to mount. Must be a filesystem type supported by the host operating system.
                   * Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
                   */
      var fsType: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * The host address of the ScaleIO API Gateway.
                   */
      var gateway: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * The name of the ScaleIO Protection Domain for the configured storage.
                   */
      var protectionDomain: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in
                   * VolumeMounts.
                   */
      var readOnly: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      /**
                   * SecretRef references to the secret for ScaleIO user and other sensitive information. If
                   * this is not provided, Login operation will fail.
                   */
      var secretRef: atPulumiPulumiLib.resourceMod.Input[LocalObjectReference]
      /**
                   * Flag to enable/disable SSL communication with Gateway, default false
                   */
      var sslEnabled: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      /**
                   * Indicates whether the storage for a volume should be ThickProvisioned or ThinProvisioned.
                   */
      var storageMode: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * The ScaleIO Storage Pool associated with the protection domain.
                   */
      var storagePool: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * The name of the storage system as configured in ScaleIO.
                   */
      var system: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * The name of a volume already created in the ScaleIO system that is associated with this
                   * volume source.
                   */
      var volumeName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
             * Secret holds secret data of a certain type. The total bytes of the values in the Data field
             * must be less than MaxSecretSize bytes.
             */
    
    trait Secret extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Data contains the secret data. Each key must consist of alphanumeric characters, '-', '_'
                   * or '.'. The serialized form of the secret data is a base64 encoded string, representing the
                   * arbitrary (possibly non-string) data value here. Described in
                   * https://tools.ietf.org/html/rfc4648#section-4
                   */
      var data: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Object]] = js.undefined
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard object's metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
                   * stringData allows specifying non-binary secret data in string form. It is provided as a
                   * write-only convenience method. All keys and values are merged into the data field on write,
                   * overwriting any existing values. It is never output when reading from the API.
                   */
      var stringData: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[
              ScalablyTyped.runtime.StringDictionary[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]
            ]
          ] = js.undefined
      /**
                   * Used to facilitate programmatic handling of secret data.
                   */
      var `type`: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
             * SecretEnvSource selects a Secret to populate the environment variables with.
             *
             * The contents of the target Secret's Data field will represent the key-value pairs as
             * environment variables.
             */
    
    trait SecretEnvSource extends js.Object {
      /**
                   * Name of the referent. More info:
                   * https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
                   */
      var name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Specify whether the Secret must be defined
                   */
      var optional: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
    }
    
    /**
             * SecretKeySelector selects a key of a Secret.
             */
    
    trait SecretKeySelector extends js.Object {
      /**
                   * The key of the secret to select from.  Must be a valid secret key.
                   */
      var key: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Name of the referent. More info:
                   * https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
                   */
      var name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Specify whether the Secret or it's key must be defined
                   */
      var optional: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
    }
    
    /**
             * SecretList is a list of Secret.
             */
    
    trait SecretList extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Items is a list of secret objects. More info:
                   * https://kubernetes.io/docs/concepts/configuration/secret
                   */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[Secret]]
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard list metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
             * Adapts a secret into a projected volume.
             *
             * The contents of the target Secret's Data field will be presented in a projected volume as
             * files using the keys in the Data field as the file names. Note that this is identical to a
             * secret volume source without the default mode.
             */
    
    trait SecretProjection extends js.Object {
      /**
                   * If unspecified, each key-value pair in the Data field of the referenced Secret will be
                   * projected into the volume as a file whose name is the key and content is the value. If
                   * specified, the listed keys will be projected into the specified paths, and unlisted keys
                   * will not be present. If a key is specified which is not present in the Secret, the volume
                   * setup will error unless it is marked optional. Paths must be relative and may not contain
                   * the '..' path or start with '..'.
                   */
      var items: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[KeyToPath]]] = js.undefined
      /**
                   * Name of the referent. More info:
                   * https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
                   */
      var name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Specify whether the Secret or its key must be defined
                   */
      var optional: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
    }
    
    /**
             * SecretReference represents a Secret Reference. It has enough information to retrieve secret
             * in any namespace
             */
    
    trait SecretReference extends js.Object {
      /**
                   * Name is unique within a namespace to reference a secret resource.
                   */
      var name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Namespace defines the space within which the secret name must be unique.
                   */
      var namespace: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
             * Adapts a Secret into a volume.
             *
             * The contents of the target Secret's Data field will be presented in a volume as files using
             * the keys in the Data field as the file names. Secret volumes support ownership management and
             * SELinux relabeling.
             */
    
    trait SecretVolumeSource extends js.Object {
      /**
                   * Optional: mode bits to use on created files by default. Must be a value between 0 and 0777.
                   * Defaults to 0644. Directories within the path are not affected by this setting. This might
                   * be in conflict with other options that affect the file mode, like fsGroup, and the result
                   * can be other mode bits set.
                   */
      var defaultMode: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * If unspecified, each key-value pair in the Data field of the referenced Secret will be
                   * projected into the volume as a file whose name is the key and content is the value. If
                   * specified, the listed keys will be projected into the specified paths, and unlisted keys
                   * will not be present. If a key is specified which is not present in the Secret, the volume
                   * setup will error unless it is marked optional. Paths must be relative and may not contain
                   * the '..' path or start with '..'.
                   */
      var items: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[KeyToPath]]] = js.undefined
      /**
                   * Specify whether the Secret or it's keys must be defined
                   */
      var optional: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      /**
                   * Name of the secret in the pod's namespace to use. More info:
                   * https://kubernetes.io/docs/concepts/storage/volumes#secret
                   */
      var secretName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
             * SecurityContext holds security configuration that will be applied to a container. Some fields
             * are present in both SecurityContext and PodSecurityContext.  When both are set, the values in
             * SecurityContext take precedence.
             */
    
    trait SecurityContext extends js.Object {
      /**
                   * AllowPrivilegeEscalation controls whether a process can gain more privileges than its
                   * parent process. This bool directly controls if the no_new_privs flag will be set on the
                   * container process. AllowPrivilegeEscalation is true always when the container is: 1) run as
                   * Privileged 2) has CAP_SYS_ADMIN
                   */
      var allowPrivilegeEscalation: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      /**
                   * The capabilities to add/drop when running containers. Defaults to the default set of
                   * capabilities granted by the container runtime.
                   */
      var capabilities: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Capabilities]] = js.undefined
      /**
                   * Run container in privileged mode. Processes in privileged containers are essentially
                   * equivalent to root on the host. Defaults to false.
                   */
      var privileged: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      /**
                   * Whether this container has a read-only root filesystem. Default is false.
                   */
      var readOnlyRootFilesystem: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      /**
                   * Indicates that the container must run as a non-root user. If true, the Kubelet will
                   * validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to
                   * start the container if it does. If unset or false, no such validation will be performed.
                   * May also be set in PodSecurityContext.  If set in both SecurityContext and
                   * PodSecurityContext, the value specified in SecurityContext takes precedence.
                   */
      var runAsNonRoot: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      /**
                   * The UID to run the entrypoint of the container process. Defaults to user specified in image
                   * metadata if unspecified. May also be set in PodSecurityContext.  If set in both
                   * SecurityContext and PodSecurityContext, the value specified in SecurityContext takes
                   * precedence.
                   */
      var runAsUser: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * The SELinux context to be applied to the container. If unspecified, the container runtime
                   * will allocate a random SELinux context for each container.  May also be set in
                   * PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value
                   * specified in SecurityContext takes precedence.
                   */
      var seLinuxOptions: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[SELinuxOptions]] = js.undefined
    }
    
    /**
             * Service is a named abstraction of software service (for example, mysql) consisting of local
             * port (for example 3306) that the proxy listens on, and the selector that determines which
             * pods will answer requests sent through the proxy.
             */
    
    trait Service extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard object's metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
                   * Spec defines the behavior of a service.
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
                   */
      var spec: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[ServiceSpec]] = js.undefined
      /**
                   * Most recently observed status of the service. Populated by the system. Read-only. More
                   * info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
                   */
      var status: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[ServiceStatus]] = js.undefined
    }
    
    /**
             * ServiceAccount binds together: * a name, understood by users, and perhaps by peripheral
             * systems, for an identity * a principal that can be authenticated and authorized * a set of
             * secrets
             */
    
    trait ServiceAccount extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * AutomountServiceAccountToken indicates whether pods running as this service account should
                   * have an API token automatically mounted. Can be overridden at the pod level.
                   */
      var automountServiceAccountToken: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      /**
                   * ImagePullSecrets is a list of references to secrets in the same namespace to use for
                   * pulling any images in pods that reference this ServiceAccount. ImagePullSecrets are
                   * distinct from Secrets because Secrets can be mounted in the pod, but ImagePullSecrets are
                   * only accessed by the kubelet. More info:
                   * https://kubernetes.io/docs/concepts/containers/images/#specifying-imagepullsecrets-on-a-pod
                   */
      var imagePullSecrets: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[LocalObjectReference]]] = js.undefined
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard object's metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
                   * Secrets is the list of secrets allowed to be used by pods running using this
                   * ServiceAccount. More info: https://kubernetes.io/docs/concepts/configuration/secret
                   */
      var secrets: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[ObjectReference]]] = js.undefined
    }
    
    /**
             * ServiceAccountList is a list of ServiceAccount objects
             */
    
    trait ServiceAccountList extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * List of ServiceAccounts. More info:
                   * https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/
                   */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[ServiceAccount]]
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard list metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
             * ServiceList holds a list of services.
             */
    
    trait ServiceList extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * List of services
                   */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[Service]]
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard list metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
             * ServicePort contains information on service's port.
             */
    
    trait ServicePort extends js.Object {
      /**
                   * The name of this port within the service. This must be a DNS_LABEL. All ports within a
                   * ServiceSpec must have unique names. This maps to the 'Name' field in EndpointPort objects.
                   * Optional if only one ServicePort is defined on this service.
                   */
      var name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * The port on each node on which this service is exposed when type=NodePort or LoadBalancer.
                   * Usually assigned by the system. If specified, it will be allocated to the service if unused
                   * or else creation of the service will fail. Default is to auto-allocate a port if the
                   * ServiceType of this Service requires one. More info:
                   * https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport
                   */
      var nodePort: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * The port that will be exposed by this service.
                   */
      var port: atPulumiPulumiLib.resourceMod.Input[scala.Double]
      /**
                   * The IP protocol for this port. Supports "TCP" and "UDP". Default is TCP.
                   */
      var protocol: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Number or name of the port to access on the pods targeted by the service. Number must be in
                   * the range 1 to 65535. Name must be an IANA_SVC_NAME. If this is a string, it will be looked
                   * up as a named port in the target Pod's container ports. If this is not specified, the value
                   * of the 'port' field is used (an identity map). This field is ignored for services with
                   * clusterIP=None, and should be omitted or set equal to the 'port' field. More info:
                   * https://kubernetes.io/docs/concepts/services-networking/service/#defining-a-service
                   */
      var targetPort: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double | java.lang.String]] = js.undefined
    }
    
    /**
             * ServiceSpec describes the attributes that a user creates on a service.
             */
    
    trait ServiceSpec extends js.Object {
      /**
                   * clusterIP is the IP address of the service and is usually assigned randomly by the master.
                   * If an address is specified manually and is not in use by others, it will be allocated to
                   * the service; otherwise, creation of the service will fail. This field can not be changed
                   * through updates. Valid values are "None", empty string (""), or a valid IP address. "None"
                   * can be specified for headless services when proxying is not required. Only applies to types
                   * ClusterIP, NodePort, and LoadBalancer. Ignored if type is ExternalName. More info:
                   * https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
                   */
      var clusterIP: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * externalIPs is a list of IP addresses for which nodes in the cluster will also accept
                   * traffic for this service.  These IPs are not managed by Kubernetes.  The user is
                   * responsible for ensuring that traffic arrives at a node with this IP.  A common example is
                   * external load-balancers that are not part of the Kubernetes system.
                   */
      var externalIPs: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]] = js.undefined
      /**
                   * externalName is the external reference that kubedns or equivalent will return as a CNAME
                   * record for this service. No proxying will be involved. Must be a valid RFC-1123 hostname
                   * (https://tools.ietf.org/html/rfc1123) and requires Type to be ExternalName.
                   */
      var externalName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * externalTrafficPolicy denotes if this Service desires to route external traffic to
                   * node-local or cluster-wide endpoints. "Local" preserves the client source IP and avoids a
                   * second hop for LoadBalancer and Nodeport type services, but risks potentially imbalanced
                   * traffic spreading. "Cluster" obscures the client source IP and may cause a second hop to
                   * another node, but should have good overall load-spreading.
                   */
      var externalTrafficPolicy: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * healthCheckNodePort specifies the healthcheck nodePort for the service. If not specified,
                   * HealthCheckNodePort is created by the service api backend with the allocated nodePort. Will
                   * use user-specified nodePort value if specified by the client. Only effects when Type is set
                   * to LoadBalancer and ExternalTrafficPolicy is set to Local.
                   */
      var healthCheckNodePort: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * Only applies to Service Type: LoadBalancer LoadBalancer will get created with the IP
                   * specified in this field. This feature depends on whether the underlying cloud-provider
                   * supports specifying the loadBalancerIP when a load balancer is created. This field will be
                   * ignored if the cloud-provider does not support the feature.
                   */
      var loadBalancerIP: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * If specified and supported by the platform, this will restrict traffic through the
                   * cloud-provider load-balancer will be restricted to the specified client IPs. This field
                   * will be ignored if the cloud-provider does not support the feature." More info:
                   * https://kubernetes.io/docs/tasks/access-application-cluster/configure-cloud-provider-firewall/
                   */
      var loadBalancerSourceRanges: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]] = js.undefined
      /**
                   * The list of ports that are exposed by this service. More info:
                   * https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
                   */
      var ports: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[ServicePort]]] = js.undefined
      /**
                   * publishNotReadyAddresses, when set to true, indicates that DNS implementations must publish
                   * the notReadyAddresses of subsets for the Endpoints associated with the Service. The default
                   * value is false. The primary use case for setting this field is to use a StatefulSet's
                   * Headless Service to propagate SRV records for its Pods without respect to their readiness
                   * for purpose of peer discovery. This field will replace the
                   * service.alpha.kubernetes.io/tolerate-unready-endpoints when that annotation is deprecated
                   * and all clients have been converted to use this field.
                   */
      var publishNotReadyAddresses: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      /**
                   * Route service traffic to pods with label keys and values matching this selector. If empty
                   * or not present, the service is assumed to have an external process managing its endpoints,
                   * which Kubernetes will not modify. Only applies to types ClusterIP, NodePort, and
                   * LoadBalancer. Ignored if type is ExternalName. More info:
                   * https://kubernetes.io/docs/concepts/services-networking/service/
                   */
      var selector: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[
              ScalablyTyped.runtime.StringDictionary[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]
            ]
          ] = js.undefined
      /**
                   * Supports "ClientIP" and "None". Used to maintain session affinity. Enable client IP based
                   * session affinity. Must be ClientIP or None. Defaults to None. More info:
                   * https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
                   */
      var sessionAffinity: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * sessionAffinityConfig contains the configurations of session affinity.
                   */
      var sessionAffinityConfig: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[SessionAffinityConfig]] = js.undefined
      /**
                   * type determines how the Service is exposed. Defaults to ClusterIP. Valid options are
                   * ExternalName, ClusterIP, NodePort, and LoadBalancer. "ExternalName" maps to the specified
                   * externalName. "ClusterIP" allocates a cluster-internal IP address for load-balancing to
                   * endpoints. Endpoints are determined by the selector or if that is not specified, by manual
                   * construction of an Endpoints object. If clusterIP is "None", no virtual IP is allocated and
                   * the endpoints are published as a set of endpoints rather than a stable IP. "NodePort"
                   * builds on ClusterIP and allocates a port on every node which routes to the clusterIP.
                   * "LoadBalancer" builds on NodePort and creates an external load-balancer (if supported in
                   * the current cloud) which routes to the clusterIP. More info:
                   * https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services---service-types
                   */
      var `type`: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
             * ServiceStatus represents the current status of a service.
             */
    
    trait ServiceStatus extends js.Object {
      /**
                   * LoadBalancer contains the current status of the load-balancer, if one is present.
                   */
      var loadBalancer: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[LoadBalancerStatus]] = js.undefined
    }
    
    /**
             * SessionAffinityConfig represents the configurations of session affinity.
             */
    
    trait SessionAffinityConfig extends js.Object {
      /**
                   * clientIP contains the configurations of Client IP based session affinity.
                   */
      var clientIP: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[ClientIPConfig]] = js.undefined
    }
    
    /**
             * Represents a StorageOS persistent volume resource.
             */
    
    trait StorageOSPersistentVolumeSource extends js.Object {
      /**
                   * Filesystem type to mount. Must be a filesystem type supported by the host operating system.
                   * Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
                   */
      var fsType: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in
                   * VolumeMounts.
                   */
      var readOnly: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      /**
                   * SecretRef specifies the secret to use for obtaining the StorageOS API credentials.  If not
                   * specified, default values will be attempted.
                   */
      var secretRef: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[ObjectReference]] = js.undefined
      /**
                   * VolumeName is the human-readable name of the StorageOS volume.  Volume names are only
                   * unique within a namespace.
                   */
      var volumeName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * VolumeNamespace specifies the scope of the volume within StorageOS.  If no namespace is
                   * specified then the Pod's namespace will be used.  This allows the Kubernetes name scoping
                   * to be mirrored within StorageOS for tighter integration. Set VolumeName to any name to
                   * override the default behaviour. Set to "default" if you are not using namespaces within
                   * StorageOS. Namespaces that do not pre-exist within StorageOS will be created.
                   */
      var volumeNamespace: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
             * Represents a StorageOS persistent volume resource.
             */
    
    trait StorageOSVolumeSource extends js.Object {
      /**
                   * Filesystem type to mount. Must be a filesystem type supported by the host operating system.
                   * Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
                   */
      var fsType: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in
                   * VolumeMounts.
                   */
      var readOnly: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      /**
                   * SecretRef specifies the secret to use for obtaining the StorageOS API credentials.  If not
                   * specified, default values will be attempted.
                   */
      var secretRef: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[LocalObjectReference]] = js.undefined
      /**
                   * VolumeName is the human-readable name of the StorageOS volume.  Volume names are only
                   * unique within a namespace.
                   */
      var volumeName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * VolumeNamespace specifies the scope of the volume within StorageOS.  If no namespace is
                   * specified then the Pod's namespace will be used.  This allows the Kubernetes name scoping
                   * to be mirrored within StorageOS for tighter integration. Set VolumeName to any name to
                   * override the default behaviour. Set to "default" if you are not using namespaces within
                   * StorageOS. Namespaces that do not pre-exist within StorageOS will be created.
                   */
      var volumeNamespace: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
             * TCPSocketAction describes an action based on opening a socket
             */
    
    trait TCPSocketAction extends js.Object {
      /**
                   * Optional: Host name to connect to, defaults to the pod IP.
                   */
      var host: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Number or name of the port to access on the container. Number must be in the range 1 to
                   * 65535. Name must be an IANA_SVC_NAME.
                   */
      var port: atPulumiPulumiLib.resourceMod.Input[scala.Double | java.lang.String]
    }
    
    /**
             * The node this Taint is attached to has the "effect" on any pod that does not tolerate the
             * Taint.
             */
    
    trait Taint extends js.Object {
      /**
                   * Required. The effect of the taint on pods that do not tolerate the taint. Valid effects are
                   * NoSchedule, PreferNoSchedule and NoExecute.
                   */
      var effect: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Required. The taint key to be applied to a node.
                   */
      var key: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * TimeAdded represents the time at which the taint was added. It is only written for
                   * NoExecute taints.
                   */
      var timeAdded: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Required. The taint value corresponding to the taint key.
                   */
      var value: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
             * The pod this Toleration is attached to tolerates any taint that matches the triple
             * <key,value,effect> using the matching operator <operator>.
             */
    
    trait Toleration extends js.Object {
      /**
                   * Effect indicates the taint effect to match. Empty means match all taint effects. When
                   * specified, allowed values are NoSchedule, PreferNoSchedule and NoExecute.
                   */
      var effect: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Key is the taint key that the toleration applies to. Empty means match all taint keys. If
                   * the key is empty, operator must be Exists; this combination means to match all values and
                   * all keys.
                   */
      var key: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Operator represents a key's relationship to the value. Valid operators are Exists and
                   * Equal. Defaults to Equal. Exists is equivalent to wildcard for value, so that a pod can
                   * tolerate all taints of a particular category.
                   */
      var operator: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * TolerationSeconds represents the period of time the toleration (which must be of effect
                   * NoExecute, otherwise this field is ignored) tolerates the taint. By default, it is not set,
                   * which means tolerate the taint forever (do not evict). Zero and negative values will be
                   * treated as 0 (evict immediately) by the system.
                   */
      var tolerationSeconds: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * Value is the taint value the toleration matches to. If the operator is Exists, the value
                   * should be empty, otherwise just a regular string.
                   */
      var value: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
             * Volume represents a named volume in a pod that may be accessed by any container in the pod.
             */
    
    trait Volume extends js.Object {
      /**
                   * AWSElasticBlockStore represents an AWS Disk resource that is attached to a kubelet's host
                   * machine and then exposed to the pod. More info:
                   * https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
                   */
      var awsElasticBlockStore: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[AWSElasticBlockStoreVolumeSource]] = js.undefined
      /**
                   * AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
                   */
      var azureDisk: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[AzureDiskVolumeSource]] = js.undefined
      /**
                   * AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
                   */
      var azureFile: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[AzureFileVolumeSource]] = js.undefined
      /**
                   * CephFS represents a Ceph FS mount on the host that shares a pod's lifetime
                   */
      var cephfs: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[CephFSVolumeSource]] = js.undefined
      /**
                   * Cinder represents a cinder volume attached and mounted on kubelets host machine More info:
                   * https://releases.k8s.io/HEAD/examples/mysql-cinder-pd/README.md
                   */
      var cinder: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[CinderVolumeSource]] = js.undefined
      /**
                   * ConfigMap represents a configMap that should populate this volume
                   */
      var configMap: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[ConfigMapVolumeSource]] = js.undefined
      /**
                   * DownwardAPI represents downward API about the pod that should populate this volume
                   */
      var downwardAPI: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[DownwardAPIVolumeSource]] = js.undefined
      /**
                   * EmptyDir represents a temporary directory that shares a pod's lifetime. More info:
                   * https://kubernetes.io/docs/concepts/storage/volumes#emptydir
                   */
      var emptyDir: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[EmptyDirVolumeSource]] = js.undefined
      /**
                   * FC represents a Fibre Channel resource that is attached to a kubelet's host machine and
                   * then exposed to the pod.
                   */
      var fc: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[FCVolumeSource]] = js.undefined
      /**
                   * FlexVolume represents a generic volume resource that is provisioned/attached using an exec
                   * based plugin.
                   */
      var flexVolume: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[FlexVolumeSource]] = js.undefined
      /**
                   * Flocker represents a Flocker volume attached to a kubelet's host machine. This depends on
                   * the Flocker control service being running
                   */
      var flocker: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[FlockerVolumeSource]] = js.undefined
      /**
                   * GCEPersistentDisk represents a GCE Disk resource that is attached to a kubelet's host
                   * machine and then exposed to the pod. More info:
                   * https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
                   */
      var gcePersistentDisk: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[GCEPersistentDiskVolumeSource]] = js.undefined
      /**
                   * GitRepo represents a git repository at a particular revision.
                   */
      var gitRepo: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[GitRepoVolumeSource]] = js.undefined
      /**
                   * Glusterfs represents a Glusterfs mount on the host that shares a pod's lifetime. More info:
                   * https://releases.k8s.io/HEAD/examples/volumes/glusterfs/README.md
                   */
      var glusterfs: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[GlusterfsVolumeSource]] = js.undefined
      /**
                   * HostPath represents a pre-existing file or directory on the host machine that is directly
                   * exposed to the container. This is generally used for system agents or other privileged
                   * things that are allowed to see the host machine. Most containers will NOT need this. More
                   * info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
                   */
      var hostPath: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[HostPathVolumeSource]] = js.undefined
      /**
                   * ISCSI represents an ISCSI Disk resource that is attached to a kubelet's host machine and
                   * then exposed to the pod. More info:
                   * https://releases.k8s.io/HEAD/examples/volumes/iscsi/README.md
                   */
      var iscsi: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[ISCSIVolumeSource]] = js.undefined
      /**
                   * Volume's name. Must be a DNS_LABEL and unique within the pod. More info:
                   * https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
                   */
      var name: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * NFS represents an NFS mount on the host that shares a pod's lifetime More info:
                   * https://kubernetes.io/docs/concepts/storage/volumes#nfs
                   */
      var nfs: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[NFSVolumeSource]] = js.undefined
      /**
                   * PersistentVolumeClaimVolumeSource represents a reference to a PersistentVolumeClaim in the
                   * same namespace. More info:
                   * https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
                   */
      var persistentVolumeClaim: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[PersistentVolumeClaimVolumeSource]] = js.undefined
      /**
                   * PhotonPersistentDisk represents a PhotonController persistent disk attached and mounted on
                   * kubelets host machine
                   */
      var photonPersistentDisk: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[PhotonPersistentDiskVolumeSource]] = js.undefined
      /**
                   * PortworxVolume represents a portworx volume attached and mounted on kubelets host machine
                   */
      var portworxVolume: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[PortworxVolumeSource]] = js.undefined
      /**
                   * Items for all in one resources secrets, configmaps, and downward API
                   */
      var projected: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[ProjectedVolumeSource]] = js.undefined
      /**
                   * Quobyte represents a Quobyte mount on the host that shares a pod's lifetime
                   */
      var quobyte: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[QuobyteVolumeSource]] = js.undefined
      /**
                   * RBD represents a Rados Block Device mount on the host that shares a pod's lifetime. More
                   * info: https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md
                   */
      var rbd: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[RBDVolumeSource]] = js.undefined
      /**
                   * ScaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.
                   */
      var scaleIO: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[ScaleIOVolumeSource]] = js.undefined
      /**
                   * Secret represents a secret that should populate this volume. More info:
                   * https://kubernetes.io/docs/concepts/storage/volumes#secret
                   */
      var secret: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[SecretVolumeSource]] = js.undefined
      /**
                   * StorageOS represents a StorageOS volume attached and mounted on Kubernetes nodes.
                   */
      var storageos: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[StorageOSVolumeSource]] = js.undefined
      /**
                   * VsphereVolume represents a vSphere volume attached and mounted on kubelets host machine
                   */
      var vsphereVolume: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[VsphereVirtualDiskVolumeSource]] = js.undefined
    }
    
    /**
             * volumeDevice describes a mapping of a raw block device within a container.
             */
    
    trait VolumeDevice extends js.Object {
      /**
                   * devicePath is the path inside of the container that the device will be mapped to.
                   */
      var devicePath: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * name must match the name of a persistentVolumeClaim in the pod
                   */
      var name: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
    }
    
    /**
             * VolumeMount describes a mounting of a Volume within a container.
             */
    
    trait VolumeMount extends js.Object {
      /**
                   * Path within the container at which the volume should be mounted.  Must not contain ':'.
                   */
      var mountPath: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * mountPropagation determines how mounts are propagated from the host to container and the
                   * other way around. When not set, MountPropagationHostToContainer is used. This field is
                   * alpha in 1.8 and can be reworked or removed in a future release.
                   */
      var mountPropagation: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * This must match the Name of a Volume.
                   */
      var name: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Mounted read-only if true, read-write otherwise (false or unspecified). Defaults to false.
                   */
      var readOnly: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      /**
                   * Path within the volume from which the container's volume should be mounted. Defaults to ""
                   * (volume's root).
                   */
      var subPath: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
             * Projection that may be projected along with other supported volume types
             */
    
    trait VolumeProjection extends js.Object {
      /**
                   * information about the configMap data to project
                   */
      var configMap: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[ConfigMapProjection]] = js.undefined
      /**
                   * information about the downwardAPI data to project
                   */
      var downwardAPI: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[DownwardAPIProjection]] = js.undefined
      /**
                   * information about the secret data to project
                   */
      var secret: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[SecretProjection]] = js.undefined
    }
    
    /**
             * Represents a vSphere volume resource.
             */
    
    trait VsphereVirtualDiskVolumeSource extends js.Object {
      /**
                   * Filesystem type to mount. Must be a filesystem type supported by the host operating system.
                   * Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
                   */
      var fsType: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Storage Policy Based Management (SPBM) profile ID associated with the StoragePolicyName.
                   */
      var storagePolicyID: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Storage Policy Based Management (SPBM) profile name.
                   */
      var storagePolicyName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Path that identifies vSphere volume vmdk
                   */
      var volumePath: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
    }
    
    /**
             * The weights of all of the matched WeightedPodAffinityTerm fields are added per-node to find
             * the most preferred node(s)
             */
    
    trait WeightedPodAffinityTerm extends js.Object {
      /**
                   * Required. A pod affinity term, associated with the corresponding weight.
                   */
      var podAffinityTerm: atPulumiPulumiLib.resourceMod.Input[PodAffinityTerm]
      /**
                   * weight associated with matching the corresponding podAffinityTerm, in the range 1-100.
                   */
      var weight: atPulumiPulumiLib.resourceMod.Input[scala.Double]
    }
    
    def isBinding(o: js.Any): /* is Binding */scala.Boolean = js.native
    def isComponentStatus(o: js.Any): /* is ComponentStatus */scala.Boolean = js.native
    def isComponentStatusList(o: js.Any): /* is ComponentStatusList */scala.Boolean = js.native
    def isConfigMap(o: js.Any): /* is ConfigMap */scala.Boolean = js.native
    def isConfigMapList(o: js.Any): /* is ConfigMapList */scala.Boolean = js.native
    def isEndpoints(o: js.Any): /* is Endpoints */scala.Boolean = js.native
    def isEndpointsList(o: js.Any): /* is EndpointsList */scala.Boolean = js.native
    def isEvent(o: js.Any): /* is Event */scala.Boolean = js.native
    def isEventList(o: js.Any): /* is EventList */scala.Boolean = js.native
    def isLimitRange(o: js.Any): /* is LimitRange */scala.Boolean = js.native
    def isLimitRangeList(o: js.Any): /* is LimitRangeList */scala.Boolean = js.native
    def isNamespace(o: js.Any): /* is Namespace */scala.Boolean = js.native
    def isNamespaceList(o: js.Any): /* is NamespaceList */scala.Boolean = js.native
    def isNode(o: js.Any): /* is Node */scala.Boolean = js.native
    def isNodeConfigSource(o: js.Any): /* is NodeConfigSource */scala.Boolean = js.native
    def isNodeList(o: js.Any): /* is NodeList */scala.Boolean = js.native
    def isObjectFieldSelector(o: js.Any): /* is ObjectFieldSelector */scala.Boolean = js.native
    def isObjectReference(o: js.Any): /* is ObjectReference */scala.Boolean = js.native
    def isPersistentVolume(o: js.Any): /* is PersistentVolume */scala.Boolean = js.native
    def isPersistentVolumeClaim(o: js.Any): /* is PersistentVolumeClaim */scala.Boolean = js.native
    def isPersistentVolumeClaimList(o: js.Any): /* is PersistentVolumeClaimList */scala.Boolean = js.native
    def isPersistentVolumeList(o: js.Any): /* is PersistentVolumeList */scala.Boolean = js.native
    def isPod(o: js.Any): /* is Pod */scala.Boolean = js.native
    def isPodList(o: js.Any): /* is PodList */scala.Boolean = js.native
    def isPodTemplate(o: js.Any): /* is PodTemplate */scala.Boolean = js.native
    def isPodTemplateList(o: js.Any): /* is PodTemplateList */scala.Boolean = js.native
    def isReplicationController(o: js.Any): /* is ReplicationController */scala.Boolean = js.native
    def isReplicationControllerList(o: js.Any): /* is ReplicationControllerList */scala.Boolean = js.native
    def isResourceQuota(o: js.Any): /* is ResourceQuota */scala.Boolean = js.native
    def isResourceQuotaList(o: js.Any): /* is ResourceQuotaList */scala.Boolean = js.native
    def isSecret(o: js.Any): /* is Secret */scala.Boolean = js.native
    def isSecretList(o: js.Any): /* is SecretList */scala.Boolean = js.native
    def isService(o: js.Any): /* is Service */scala.Boolean = js.native
    def isServiceAccount(o: js.Any): /* is ServiceAccount */scala.Boolean = js.native
    def isServiceAccountList(o: js.Any): /* is ServiceAccountList */scala.Boolean = js.native
    def isServiceList(o: js.Any): /* is ServiceList */scala.Boolean = js.native
  }
  
}

