package typings
package atPulumiKubernetesLib.typesOutputMod.storageNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * StorageClass describes the parameters for a class of storage for which PersistentVolumes can
  * be dynamically provisioned.
  *
  * StorageClasses are non-namespaced; the name of the storage class according to etcd is in
  * ObjectMeta.Name.
  */
trait StorageClass extends js.Object {
  /**
    * AllowVolumeExpansion shows whether the storage class allow volume expand
    */
  val allowVolumeExpansion: scala.Boolean
  /**
    * Restrict the node topologies where volumes can be dynamically provisioned. Each volume
    * plugin defines its own supported topology specifications. An empty TopologySelectorTerm
    * list means there is no topology restriction. This field is only honored by servers that
    * enable the VolumeScheduling feature.
    */
  val allowedTopologies: js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.TopologySelectorTerm]
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1`
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.StorageClass
  /**
    * Standard object's metadata. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
    */
  val metadata: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta
  /**
    * Dynamically provisioned PersistentVolumes of this storage class are created with these
    * mountOptions, e.g. ["ro", "soft"]. Not validated - mount of the PVs will simply fail if one
    * is invalid.
    */
  val mountOptions: js.Array[java.lang.String]
  /**
    * Parameters holds the parameters for the provisioner that should create volumes of this
    * storage class.
    */
  val parameters: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  /**
    * Provisioner indicates the type of the provisioner.
    */
  val provisioner: java.lang.String
  /**
    * Dynamically provisioned PersistentVolumes of this storage class are created with this
    * reclaimPolicy. Defaults to Delete.
    */
  val reclaimPolicy: java.lang.String
  /**
    * VolumeBindingMode indicates how PersistentVolumeClaims should be provisioned and bound.
    * When unset, VolumeBindingImmediate is used. This field is only honored by servers that
    * enable the VolumeScheduling feature.
    */
  val volumeBindingMode: java.lang.String
}

object StorageClass {
  @scala.inline
  def apply(
    allowVolumeExpansion: scala.Boolean,
    allowedTopologies: js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.TopologySelectorTerm],
    apiVersion: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1`,
    kind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.StorageClass,
    metadata: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta,
    mountOptions: js.Array[java.lang.String],
    parameters: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    provisioner: java.lang.String,
    reclaimPolicy: java.lang.String,
    volumeBindingMode: java.lang.String
  ): StorageClass = {
    val __obj = js.Dynamic.literal(allowVolumeExpansion = allowVolumeExpansion, allowedTopologies = allowedTopologies, apiVersion = apiVersion, kind = kind, metadata = metadata, mountOptions = mountOptions, parameters = parameters, provisioner = provisioner, reclaimPolicy = reclaimPolicy, volumeBindingMode = volumeBindingMode)
  
    __obj.asInstanceOf[StorageClass]
  }
}

