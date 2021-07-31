package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
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
  var accessModes: js.Array[String]
  
  /**
    * AWSElasticBlockStore represents an AWS Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
    */
  var awsElasticBlockStore: AWSElasticBlockStoreVolumeSource
  
  /**
    * AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
    */
  var azureDisk: AzureDiskVolumeSource
  
  /**
    * AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
    */
  var azureFile: AzureFilePersistentVolumeSource
  
  /**
    * A description of the persistent volume's resources and capacity. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity
    */
  var capacity: StringDictionary[String]
  
  /**
    * CephFS represents a Ceph FS mount on the host that shares a pod's lifetime
    */
  var cephfs: CephFSPersistentVolumeSource
  
  /**
    * Cinder represents a cinder volume attached and mounted on kubelets host machine. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
    */
  var cinder: CinderPersistentVolumeSource
  
  /**
    * ClaimRef is part of a bi-directional binding between PersistentVolume and PersistentVolumeClaim. Expected to be non-nil when bound. claim.VolumeName is the authoritative bind between PV and PVC. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#binding
    */
  var claimRef: ObjectReference
  
  /**
    * CSI represents storage that is handled by an external CSI driver (Beta feature).
    */
  var csi: CSIPersistentVolumeSource
  
  /**
    * FC represents a Fibre Channel resource that is attached to a kubelet's host machine and then exposed to the pod.
    */
  var fc: FCVolumeSource
  
  /**
    * FlexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.
    */
  var flexVolume: FlexPersistentVolumeSource
  
  /**
    * Flocker represents a Flocker volume attached to a kubelet's host machine and exposed to the pod for its usage. This depends on the Flocker control service being running
    */
  var flocker: FlockerVolumeSource
  
  /**
    * GCEPersistentDisk represents a GCE Disk resource that is attached to a kubelet's host machine and then exposed to the pod. Provisioned by an admin. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
    */
  var gcePersistentDisk: GCEPersistentDiskVolumeSource
  
  /**
    * Glusterfs represents a Glusterfs volume that is attached to a host and exposed to the pod. Provisioned by an admin. More info: https://examples.k8s.io/volumes/glusterfs/README.md
    */
  var glusterfs: GlusterfsPersistentVolumeSource
  
  /**
    * HostPath represents a directory on the host. Provisioned by a developer or tester. This is useful for single-node development and testing only! On-host storage is not supported in any way and WILL NOT WORK in a multi-node cluster. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
    */
  var hostPath: HostPathVolumeSource
  
  /**
    * ISCSI represents an ISCSI Disk resource that is attached to a kubelet's host machine and then exposed to the pod. Provisioned by an admin.
    */
  var iscsi: ISCSIPersistentVolumeSource
  
  /**
    * Local represents directly-attached storage with node affinity
    */
  var local: LocalVolumeSource
  
  /**
    * A list of mount options, e.g. ["ro", "soft"]. Not validated - mount will simply fail if one is invalid. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes/#mount-options
    */
  var mountOptions: js.Array[String]
  
  /**
    * NFS represents an NFS mount on the host. Provisioned by an admin. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
    */
  var nfs: NFSVolumeSource
  
  /**
    * NodeAffinity defines constraints that limit what nodes this volume can be accessed from. This field influences the scheduling of pods that use this volume.
    */
  var nodeAffinity: VolumeNodeAffinity
  
  /**
    * What happens to a persistent volume when released from its claim. Valid options are Retain (default for manually created PersistentVolumes), Delete (default for dynamically provisioned PersistentVolumes), and Recycle (deprecated). Recycle must be supported by the volume plugin underlying this PersistentVolume. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#reclaiming
    */
  var persistentVolumeReclaimPolicy: String
  
  /**
    * PhotonPersistentDisk represents a PhotonController persistent disk attached and mounted on kubelets host machine
    */
  var photonPersistentDisk: PhotonPersistentDiskVolumeSource
  
  /**
    * PortworxVolume represents a portworx volume attached and mounted on kubelets host machine
    */
  var portworxVolume: PortworxVolumeSource
  
  /**
    * Quobyte represents a Quobyte mount on the host that shares a pod's lifetime
    */
  var quobyte: QuobyteVolumeSource
  
  /**
    * RBD represents a Rados Block Device mount on the host that shares a pod's lifetime. More info: https://examples.k8s.io/volumes/rbd/README.md
    */
  var rbd: RBDPersistentVolumeSource
  
  /**
    * ScaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.
    */
  var scaleIO: ScaleIOPersistentVolumeSource
  
  /**
    * Name of StorageClass to which this persistent volume belongs. Empty value means that this volume does not belong to any StorageClass.
    */
  var storageClassName: String
  
  /**
    * StorageOS represents a StorageOS volume that is attached to the kubelet's host machine and mounted into the pod More info: https://examples.k8s.io/volumes/storageos/README.md
    */
  var storageos: StorageOSPersistentVolumeSource
  
  /**
    * volumeMode defines if a volume is intended to be used with a formatted filesystem or to remain in raw block state. Value of Filesystem is implied when not included in spec.
    */
  var volumeMode: String
  
  /**
    * VsphereVolume represents a vSphere volume attached and mounted on kubelets host machine
    */
  var vsphereVolume: VsphereVirtualDiskVolumeSource
}
object PersistentVolumeSpec {
  
  @scala.inline
  def apply(
    accessModes: js.Array[String],
    awsElasticBlockStore: AWSElasticBlockStoreVolumeSource,
    azureDisk: AzureDiskVolumeSource,
    azureFile: AzureFilePersistentVolumeSource,
    capacity: StringDictionary[String],
    cephfs: CephFSPersistentVolumeSource,
    cinder: CinderPersistentVolumeSource,
    claimRef: ObjectReference,
    csi: CSIPersistentVolumeSource,
    fc: FCVolumeSource,
    flexVolume: FlexPersistentVolumeSource,
    flocker: FlockerVolumeSource,
    gcePersistentDisk: GCEPersistentDiskVolumeSource,
    glusterfs: GlusterfsPersistentVolumeSource,
    hostPath: HostPathVolumeSource,
    iscsi: ISCSIPersistentVolumeSource,
    local: LocalVolumeSource,
    mountOptions: js.Array[String],
    nfs: NFSVolumeSource,
    nodeAffinity: VolumeNodeAffinity,
    persistentVolumeReclaimPolicy: String,
    photonPersistentDisk: PhotonPersistentDiskVolumeSource,
    portworxVolume: PortworxVolumeSource,
    quobyte: QuobyteVolumeSource,
    rbd: RBDPersistentVolumeSource,
    scaleIO: ScaleIOPersistentVolumeSource,
    storageClassName: String,
    storageos: StorageOSPersistentVolumeSource,
    volumeMode: String,
    vsphereVolume: VsphereVirtualDiskVolumeSource
  ): PersistentVolumeSpec = {
    val __obj = js.Dynamic.literal(accessModes = accessModes.asInstanceOf[js.Any], awsElasticBlockStore = awsElasticBlockStore.asInstanceOf[js.Any], azureDisk = azureDisk.asInstanceOf[js.Any], azureFile = azureFile.asInstanceOf[js.Any], capacity = capacity.asInstanceOf[js.Any], cephfs = cephfs.asInstanceOf[js.Any], cinder = cinder.asInstanceOf[js.Any], claimRef = claimRef.asInstanceOf[js.Any], csi = csi.asInstanceOf[js.Any], fc = fc.asInstanceOf[js.Any], flexVolume = flexVolume.asInstanceOf[js.Any], flocker = flocker.asInstanceOf[js.Any], gcePersistentDisk = gcePersistentDisk.asInstanceOf[js.Any], glusterfs = glusterfs.asInstanceOf[js.Any], hostPath = hostPath.asInstanceOf[js.Any], iscsi = iscsi.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], mountOptions = mountOptions.asInstanceOf[js.Any], nfs = nfs.asInstanceOf[js.Any], nodeAffinity = nodeAffinity.asInstanceOf[js.Any], persistentVolumeReclaimPolicy = persistentVolumeReclaimPolicy.asInstanceOf[js.Any], photonPersistentDisk = photonPersistentDisk.asInstanceOf[js.Any], portworxVolume = portworxVolume.asInstanceOf[js.Any], quobyte = quobyte.asInstanceOf[js.Any], rbd = rbd.asInstanceOf[js.Any], scaleIO = scaleIO.asInstanceOf[js.Any], storageClassName = storageClassName.asInstanceOf[js.Any], storageos = storageos.asInstanceOf[js.Any], volumeMode = volumeMode.asInstanceOf[js.Any], vsphereVolume = vsphereVolume.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistentVolumeSpec]
  }
  
  @scala.inline
  implicit class PersistentVolumeSpecMutableBuilder[Self <: PersistentVolumeSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessModes(value: js.Array[String]): Self = StObject.set(x, "accessModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessModesVarargs(value: String*): Self = StObject.set(x, "accessModes", js.Array(value :_*))
    
    @scala.inline
    def setAwsElasticBlockStore(value: AWSElasticBlockStoreVolumeSource): Self = StObject.set(x, "awsElasticBlockStore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAzureDisk(value: AzureDiskVolumeSource): Self = StObject.set(x, "azureDisk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAzureFile(value: AzureFilePersistentVolumeSource): Self = StObject.set(x, "azureFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacity(value: StringDictionary[String]): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCephfs(value: CephFSPersistentVolumeSource): Self = StObject.set(x, "cephfs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCinder(value: CinderPersistentVolumeSource): Self = StObject.set(x, "cinder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClaimRef(value: ObjectReference): Self = StObject.set(x, "claimRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCsi(value: CSIPersistentVolumeSource): Self = StObject.set(x, "csi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFc(value: FCVolumeSource): Self = StObject.set(x, "fc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexVolume(value: FlexPersistentVolumeSource): Self = StObject.set(x, "flexVolume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlocker(value: FlockerVolumeSource): Self = StObject.set(x, "flocker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcePersistentDisk(value: GCEPersistentDiskVolumeSource): Self = StObject.set(x, "gcePersistentDisk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlusterfs(value: GlusterfsPersistentVolumeSource): Self = StObject.set(x, "glusterfs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostPath(value: HostPathVolumeSource): Self = StObject.set(x, "hostPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIscsi(value: ISCSIPersistentVolumeSource): Self = StObject.set(x, "iscsi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocal(value: LocalVolumeSource): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMountOptions(value: js.Array[String]): Self = StObject.set(x, "mountOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMountOptionsVarargs(value: String*): Self = StObject.set(x, "mountOptions", js.Array(value :_*))
    
    @scala.inline
    def setNfs(value: NFSVolumeSource): Self = StObject.set(x, "nfs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeAffinity(value: VolumeNodeAffinity): Self = StObject.set(x, "nodeAffinity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistentVolumeReclaimPolicy(value: String): Self = StObject.set(x, "persistentVolumeReclaimPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotonPersistentDisk(value: PhotonPersistentDiskVolumeSource): Self = StObject.set(x, "photonPersistentDisk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortworxVolume(value: PortworxVolumeSource): Self = StObject.set(x, "portworxVolume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuobyte(value: QuobyteVolumeSource): Self = StObject.set(x, "quobyte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRbd(value: RBDPersistentVolumeSource): Self = StObject.set(x, "rbd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleIO(value: ScaleIOPersistentVolumeSource): Self = StObject.set(x, "scaleIO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageClassName(value: String): Self = StObject.set(x, "storageClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageos(value: StorageOSPersistentVolumeSource): Self = StObject.set(x, "storageos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeMode(value: String): Self = StObject.set(x, "volumeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVsphereVolume(value: VsphereVirtualDiskVolumeSource): Self = StObject.set(x, "vsphereVolume", value.asInstanceOf[js.Any])
  }
}
