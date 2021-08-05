package typings.pulumiKubernetes.inputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PersistentVolumeSpec is the specification of a persistent volume.
  */
trait PersistentVolumeSpec extends StObject {
  
  /**
    * AccessModes contains all ways the volume can be mounted. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes
    */
  var accessModes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  
  /**
    * AWSElasticBlockStore represents an AWS Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
    */
  var awsElasticBlockStore: js.UndefOr[Input[AWSElasticBlockStoreVolumeSource]] = js.undefined
  
  /**
    * AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
    */
  var azureDisk: js.UndefOr[Input[AzureDiskVolumeSource]] = js.undefined
  
  /**
    * AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
    */
  var azureFile: js.UndefOr[Input[AzureFilePersistentVolumeSource]] = js.undefined
  
  /**
    * A description of the persistent volume's resources and capacity. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity
    */
  var capacity: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  
  /**
    * CephFS represents a Ceph FS mount on the host that shares a pod's lifetime
    */
  var cephfs: js.UndefOr[Input[CephFSPersistentVolumeSource]] = js.undefined
  
  /**
    * Cinder represents a cinder volume attached and mounted on kubelets host machine. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
    */
  var cinder: js.UndefOr[Input[CinderPersistentVolumeSource]] = js.undefined
  
  /**
    * ClaimRef is part of a bi-directional binding between PersistentVolume and PersistentVolumeClaim. Expected to be non-nil when bound. claim.VolumeName is the authoritative bind between PV and PVC. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#binding
    */
  var claimRef: js.UndefOr[Input[ObjectReference]] = js.undefined
  
  /**
    * CSI represents storage that is handled by an external CSI driver (Beta feature).
    */
  var csi: js.UndefOr[Input[CSIPersistentVolumeSource]] = js.undefined
  
  /**
    * FC represents a Fibre Channel resource that is attached to a kubelet's host machine and then exposed to the pod.
    */
  var fc: js.UndefOr[Input[FCVolumeSource]] = js.undefined
  
  /**
    * FlexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.
    */
  var flexVolume: js.UndefOr[Input[FlexPersistentVolumeSource]] = js.undefined
  
  /**
    * Flocker represents a Flocker volume attached to a kubelet's host machine and exposed to the pod for its usage. This depends on the Flocker control service being running
    */
  var flocker: js.UndefOr[Input[FlockerVolumeSource]] = js.undefined
  
  /**
    * GCEPersistentDisk represents a GCE Disk resource that is attached to a kubelet's host machine and then exposed to the pod. Provisioned by an admin. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
    */
  var gcePersistentDisk: js.UndefOr[Input[GCEPersistentDiskVolumeSource]] = js.undefined
  
  /**
    * Glusterfs represents a Glusterfs volume that is attached to a host and exposed to the pod. Provisioned by an admin. More info: https://examples.k8s.io/volumes/glusterfs/README.md
    */
  var glusterfs: js.UndefOr[Input[GlusterfsPersistentVolumeSource]] = js.undefined
  
  /**
    * HostPath represents a directory on the host. Provisioned by a developer or tester. This is useful for single-node development and testing only! On-host storage is not supported in any way and WILL NOT WORK in a multi-node cluster. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
    */
  var hostPath: js.UndefOr[Input[HostPathVolumeSource]] = js.undefined
  
  /**
    * ISCSI represents an ISCSI Disk resource that is attached to a kubelet's host machine and then exposed to the pod. Provisioned by an admin.
    */
  var iscsi: js.UndefOr[Input[ISCSIPersistentVolumeSource]] = js.undefined
  
  /**
    * Local represents directly-attached storage with node affinity
    */
  var local: js.UndefOr[Input[LocalVolumeSource]] = js.undefined
  
  /**
    * A list of mount options, e.g. ["ro", "soft"]. Not validated - mount will simply fail if one is invalid. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes/#mount-options
    */
  var mountOptions: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  
  /**
    * NFS represents an NFS mount on the host. Provisioned by an admin. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
    */
  var nfs: js.UndefOr[Input[NFSVolumeSource]] = js.undefined
  
  /**
    * NodeAffinity defines constraints that limit what nodes this volume can be accessed from. This field influences the scheduling of pods that use this volume.
    */
  var nodeAffinity: js.UndefOr[Input[VolumeNodeAffinity]] = js.undefined
  
  /**
    * What happens to a persistent volume when released from its claim. Valid options are Retain (default for manually created PersistentVolumes), Delete (default for dynamically provisioned PersistentVolumes), and Recycle (deprecated). Recycle must be supported by the volume plugin underlying this PersistentVolume. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#reclaiming
    */
  var persistentVolumeReclaimPolicy: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * PhotonPersistentDisk represents a PhotonController persistent disk attached and mounted on kubelets host machine
    */
  var photonPersistentDisk: js.UndefOr[Input[PhotonPersistentDiskVolumeSource]] = js.undefined
  
  /**
    * PortworxVolume represents a portworx volume attached and mounted on kubelets host machine
    */
  var portworxVolume: js.UndefOr[Input[PortworxVolumeSource]] = js.undefined
  
  /**
    * Quobyte represents a Quobyte mount on the host that shares a pod's lifetime
    */
  var quobyte: js.UndefOr[Input[QuobyteVolumeSource]] = js.undefined
  
  /**
    * RBD represents a Rados Block Device mount on the host that shares a pod's lifetime. More info: https://examples.k8s.io/volumes/rbd/README.md
    */
  var rbd: js.UndefOr[Input[RBDPersistentVolumeSource]] = js.undefined
  
  /**
    * ScaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.
    */
  var scaleIO: js.UndefOr[Input[ScaleIOPersistentVolumeSource]] = js.undefined
  
  /**
    * Name of StorageClass to which this persistent volume belongs. Empty value means that this volume does not belong to any StorageClass.
    */
  var storageClassName: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * StorageOS represents a StorageOS volume that is attached to the kubelet's host machine and mounted into the pod More info: https://examples.k8s.io/volumes/storageos/README.md
    */
  var storageos: js.UndefOr[Input[StorageOSPersistentVolumeSource]] = js.undefined
  
  /**
    * volumeMode defines if a volume is intended to be used with a formatted filesystem or to remain in raw block state. Value of Filesystem is implied when not included in spec.
    */
  var volumeMode: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * VsphereVolume represents a vSphere volume attached and mounted on kubelets host machine
    */
  var vsphereVolume: js.UndefOr[Input[VsphereVirtualDiskVolumeSource]] = js.undefined
}
object PersistentVolumeSpec {
  
  inline def apply(): PersistentVolumeSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersistentVolumeSpec]
  }
  
  extension [Self <: PersistentVolumeSpec](x: Self) {
    
    inline def setAccessModes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "accessModes", value.asInstanceOf[js.Any])
    
    inline def setAccessModesUndefined: Self = StObject.set(x, "accessModes", js.undefined)
    
    inline def setAccessModesVarargs(value: Input[String]*): Self = StObject.set(x, "accessModes", js.Array(value :_*))
    
    inline def setAwsElasticBlockStore(value: Input[AWSElasticBlockStoreVolumeSource]): Self = StObject.set(x, "awsElasticBlockStore", value.asInstanceOf[js.Any])
    
    inline def setAwsElasticBlockStoreUndefined: Self = StObject.set(x, "awsElasticBlockStore", js.undefined)
    
    inline def setAzureDisk(value: Input[AzureDiskVolumeSource]): Self = StObject.set(x, "azureDisk", value.asInstanceOf[js.Any])
    
    inline def setAzureDiskUndefined: Self = StObject.set(x, "azureDisk", js.undefined)
    
    inline def setAzureFile(value: Input[AzureFilePersistentVolumeSource]): Self = StObject.set(x, "azureFile", value.asInstanceOf[js.Any])
    
    inline def setAzureFileUndefined: Self = StObject.set(x, "azureFile", js.undefined)
    
    inline def setCapacity(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
    
    inline def setCapacityUndefined: Self = StObject.set(x, "capacity", js.undefined)
    
    inline def setCephfs(value: Input[CephFSPersistentVolumeSource]): Self = StObject.set(x, "cephfs", value.asInstanceOf[js.Any])
    
    inline def setCephfsUndefined: Self = StObject.set(x, "cephfs", js.undefined)
    
    inline def setCinder(value: Input[CinderPersistentVolumeSource]): Self = StObject.set(x, "cinder", value.asInstanceOf[js.Any])
    
    inline def setCinderUndefined: Self = StObject.set(x, "cinder", js.undefined)
    
    inline def setClaimRef(value: Input[ObjectReference]): Self = StObject.set(x, "claimRef", value.asInstanceOf[js.Any])
    
    inline def setClaimRefUndefined: Self = StObject.set(x, "claimRef", js.undefined)
    
    inline def setCsi(value: Input[CSIPersistentVolumeSource]): Self = StObject.set(x, "csi", value.asInstanceOf[js.Any])
    
    inline def setCsiUndefined: Self = StObject.set(x, "csi", js.undefined)
    
    inline def setFc(value: Input[FCVolumeSource]): Self = StObject.set(x, "fc", value.asInstanceOf[js.Any])
    
    inline def setFcUndefined: Self = StObject.set(x, "fc", js.undefined)
    
    inline def setFlexVolume(value: Input[FlexPersistentVolumeSource]): Self = StObject.set(x, "flexVolume", value.asInstanceOf[js.Any])
    
    inline def setFlexVolumeUndefined: Self = StObject.set(x, "flexVolume", js.undefined)
    
    inline def setFlocker(value: Input[FlockerVolumeSource]): Self = StObject.set(x, "flocker", value.asInstanceOf[js.Any])
    
    inline def setFlockerUndefined: Self = StObject.set(x, "flocker", js.undefined)
    
    inline def setGcePersistentDisk(value: Input[GCEPersistentDiskVolumeSource]): Self = StObject.set(x, "gcePersistentDisk", value.asInstanceOf[js.Any])
    
    inline def setGcePersistentDiskUndefined: Self = StObject.set(x, "gcePersistentDisk", js.undefined)
    
    inline def setGlusterfs(value: Input[GlusterfsPersistentVolumeSource]): Self = StObject.set(x, "glusterfs", value.asInstanceOf[js.Any])
    
    inline def setGlusterfsUndefined: Self = StObject.set(x, "glusterfs", js.undefined)
    
    inline def setHostPath(value: Input[HostPathVolumeSource]): Self = StObject.set(x, "hostPath", value.asInstanceOf[js.Any])
    
    inline def setHostPathUndefined: Self = StObject.set(x, "hostPath", js.undefined)
    
    inline def setIscsi(value: Input[ISCSIPersistentVolumeSource]): Self = StObject.set(x, "iscsi", value.asInstanceOf[js.Any])
    
    inline def setIscsiUndefined: Self = StObject.set(x, "iscsi", js.undefined)
    
    inline def setLocal(value: Input[LocalVolumeSource]): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    inline def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
    
    inline def setMountOptions(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "mountOptions", value.asInstanceOf[js.Any])
    
    inline def setMountOptionsUndefined: Self = StObject.set(x, "mountOptions", js.undefined)
    
    inline def setMountOptionsVarargs(value: Input[String]*): Self = StObject.set(x, "mountOptions", js.Array(value :_*))
    
    inline def setNfs(value: Input[NFSVolumeSource]): Self = StObject.set(x, "nfs", value.asInstanceOf[js.Any])
    
    inline def setNfsUndefined: Self = StObject.set(x, "nfs", js.undefined)
    
    inline def setNodeAffinity(value: Input[VolumeNodeAffinity]): Self = StObject.set(x, "nodeAffinity", value.asInstanceOf[js.Any])
    
    inline def setNodeAffinityUndefined: Self = StObject.set(x, "nodeAffinity", js.undefined)
    
    inline def setPersistentVolumeReclaimPolicy(value: Input[String]): Self = StObject.set(x, "persistentVolumeReclaimPolicy", value.asInstanceOf[js.Any])
    
    inline def setPersistentVolumeReclaimPolicyUndefined: Self = StObject.set(x, "persistentVolumeReclaimPolicy", js.undefined)
    
    inline def setPhotonPersistentDisk(value: Input[PhotonPersistentDiskVolumeSource]): Self = StObject.set(x, "photonPersistentDisk", value.asInstanceOf[js.Any])
    
    inline def setPhotonPersistentDiskUndefined: Self = StObject.set(x, "photonPersistentDisk", js.undefined)
    
    inline def setPortworxVolume(value: Input[PortworxVolumeSource]): Self = StObject.set(x, "portworxVolume", value.asInstanceOf[js.Any])
    
    inline def setPortworxVolumeUndefined: Self = StObject.set(x, "portworxVolume", js.undefined)
    
    inline def setQuobyte(value: Input[QuobyteVolumeSource]): Self = StObject.set(x, "quobyte", value.asInstanceOf[js.Any])
    
    inline def setQuobyteUndefined: Self = StObject.set(x, "quobyte", js.undefined)
    
    inline def setRbd(value: Input[RBDPersistentVolumeSource]): Self = StObject.set(x, "rbd", value.asInstanceOf[js.Any])
    
    inline def setRbdUndefined: Self = StObject.set(x, "rbd", js.undefined)
    
    inline def setScaleIO(value: Input[ScaleIOPersistentVolumeSource]): Self = StObject.set(x, "scaleIO", value.asInstanceOf[js.Any])
    
    inline def setScaleIOUndefined: Self = StObject.set(x, "scaleIO", js.undefined)
    
    inline def setStorageClassName(value: Input[String]): Self = StObject.set(x, "storageClassName", value.asInstanceOf[js.Any])
    
    inline def setStorageClassNameUndefined: Self = StObject.set(x, "storageClassName", js.undefined)
    
    inline def setStorageos(value: Input[StorageOSPersistentVolumeSource]): Self = StObject.set(x, "storageos", value.asInstanceOf[js.Any])
    
    inline def setStorageosUndefined: Self = StObject.set(x, "storageos", js.undefined)
    
    inline def setVolumeMode(value: Input[String]): Self = StObject.set(x, "volumeMode", value.asInstanceOf[js.Any])
    
    inline def setVolumeModeUndefined: Self = StObject.set(x, "volumeMode", js.undefined)
    
    inline def setVsphereVolume(value: Input[VsphereVirtualDiskVolumeSource]): Self = StObject.set(x, "vsphereVolume", value.asInstanceOf[js.Any])
    
    inline def setVsphereVolumeUndefined: Self = StObject.set(x, "vsphereVolume", js.undefined)
  }
}
