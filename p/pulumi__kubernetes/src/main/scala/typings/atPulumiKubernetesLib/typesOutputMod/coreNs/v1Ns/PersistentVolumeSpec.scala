package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PersistentVolumeSpec is the specification of a persistent volume.
  */
trait PersistentVolumeSpec extends js.Object {
  /**
    * AccessModes contains all ways the volume can be mounted. More info:
    * https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes
    */
  val accessModes: js.Array[java.lang.String]
  /**
    * AWSElasticBlockStore represents an AWS Disk resource that is attached to a kubelet's host
    * machine and then exposed to the pod. More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
    */
  val awsElasticBlockStore: AWSElasticBlockStoreVolumeSource
  /**
    * AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
    */
  val azureDisk: AzureDiskVolumeSource
  /**
    * AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
    */
  val azureFile: AzureFilePersistentVolumeSource
  /**
    * A description of the persistent volume's resources and capacity. More info:
    * https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity
    */
  val capacity: js.Object
  /**
    * CephFS represents a Ceph FS mount on the host that shares a pod's lifetime
    */
  val cephfs: CephFSPersistentVolumeSource
  /**
    * Cinder represents a cinder volume attached and mounted on kubelets host machine More info:
    * https://releases.k8s.io/HEAD/examples/mysql-cinder-pd/README.md
    */
  val cinder: CinderPersistentVolumeSource
  /**
    * ClaimRef is part of a bi-directional binding between PersistentVolume and
    * PersistentVolumeClaim. Expected to be non-nil when bound. claim.VolumeName is the
    * authoritative bind between PV and PVC. More info:
    * https://kubernetes.io/docs/concepts/storage/persistent-volumes#binding
    */
  val claimRef: ObjectReference
  /**
    * CSI represents storage that handled by an external CSI driver (Beta feature).
    */
  val csi: CSIPersistentVolumeSource
  /**
    * FC represents a Fibre Channel resource that is attached to a kubelet's host machine and
    * then exposed to the pod.
    */
  val fc: FCVolumeSource
  /**
    * FlexVolume represents a generic volume resource that is provisioned/attached using an exec
    * based plugin.
    */
  val flexVolume: FlexPersistentVolumeSource
  /**
    * Flocker represents a Flocker volume attached to a kubelet's host machine and exposed to the
    * pod for its usage. This depends on the Flocker control service being running
    */
  val flocker: FlockerVolumeSource
  /**
    * GCEPersistentDisk represents a GCE Disk resource that is attached to a kubelet's host
    * machine and then exposed to the pod. Provisioned by an admin. More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
    */
  val gcePersistentDisk: GCEPersistentDiskVolumeSource
  /**
    * Glusterfs represents a Glusterfs volume that is attached to a host and exposed to the pod.
    * Provisioned by an admin. More info:
    * https://releases.k8s.io/HEAD/examples/volumes/glusterfs/README.md
    */
  val glusterfs: GlusterfsPersistentVolumeSource
  /**
    * HostPath represents a directory on the host. Provisioned by a developer or tester. This is
    * useful for single-node development and testing only! On-host storage is not supported in
    * any way and WILL NOT WORK in a multi-node cluster. More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#hostpath
    */
  val hostPath: HostPathVolumeSource
  /**
    * ISCSI represents an ISCSI Disk resource that is attached to a kubelet's host machine and
    * then exposed to the pod. Provisioned by an admin.
    */
  val iscsi: ISCSIPersistentVolumeSource
  /**
    * Local represents directly-attached storage with node affinity
    */
  val local: LocalVolumeSource
  /**
    * A list of mount options, e.g. ["ro", "soft"]. Not validated - mount will simply fail if one
    * is invalid. More info:
    * https://kubernetes.io/docs/concepts/storage/persistent-volumes/#mount-options
    */
  val mountOptions: js.Array[java.lang.String]
  /**
    * NFS represents an NFS mount on the host. Provisioned by an admin. More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#nfs
    */
  val nfs: NFSVolumeSource
  /**
    * NodeAffinity defines constraints that limit what nodes this volume can be accessed from.
    * This field influences the scheduling of pods that use this volume.
    */
  val nodeAffinity: VolumeNodeAffinity
  /**
    * What happens to a persistent volume when released from its claim. Valid options are Retain
    * (default for manually created PersistentVolumes), Delete (default for dynamically
    * provisioned PersistentVolumes), and Recycle (deprecated). Recycle must be supported by the
    * volume plugin underlying this PersistentVolume. More info:
    * https://kubernetes.io/docs/concepts/storage/persistent-volumes#reclaiming
    */
  val persistentVolumeReclaimPolicy: java.lang.String
  /**
    * PhotonPersistentDisk represents a PhotonController persistent disk attached and mounted on
    * kubelets host machine
    */
  val photonPersistentDisk: PhotonPersistentDiskVolumeSource
  /**
    * PortworxVolume represents a portworx volume attached and mounted on kubelets host machine
    */
  val portworxVolume: PortworxVolumeSource
  /**
    * Quobyte represents a Quobyte mount on the host that shares a pod's lifetime
    */
  val quobyte: QuobyteVolumeSource
  /**
    * RBD represents a Rados Block Device mount on the host that shares a pod's lifetime. More
    * info: https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md
    */
  val rbd: RBDPersistentVolumeSource
  /**
    * ScaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.
    */
  val scaleIO: ScaleIOPersistentVolumeSource
  /**
    * Name of StorageClass to which this persistent volume belongs. Empty value means that this
    * volume does not belong to any StorageClass.
    */
  val storageClassName: java.lang.String
  /**
    * StorageOS represents a StorageOS volume that is attached to the kubelet's host machine and
    * mounted into the pod More info:
    * https://releases.k8s.io/HEAD/examples/volumes/storageos/README.md
    */
  val storageos: StorageOSPersistentVolumeSource
  /**
    * volumeMode defines if a volume is intended to be used with a formatted filesystem or to
    * remain in raw block state. Value of Filesystem is implied when not included in spec. This
    * is a beta feature.
    */
  val volumeMode: java.lang.String
  /**
    * VsphereVolume represents a vSphere volume attached and mounted on kubelets host machine
    */
  val vsphereVolume: VsphereVirtualDiskVolumeSource
}

object PersistentVolumeSpec {
  @scala.inline
  def apply(
    accessModes: js.Array[java.lang.String],
    awsElasticBlockStore: AWSElasticBlockStoreVolumeSource,
    azureDisk: AzureDiskVolumeSource,
    azureFile: AzureFilePersistentVolumeSource,
    capacity: js.Object,
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
    mountOptions: js.Array[java.lang.String],
    nfs: NFSVolumeSource,
    nodeAffinity: VolumeNodeAffinity,
    persistentVolumeReclaimPolicy: java.lang.String,
    photonPersistentDisk: PhotonPersistentDiskVolumeSource,
    portworxVolume: PortworxVolumeSource,
    quobyte: QuobyteVolumeSource,
    rbd: RBDPersistentVolumeSource,
    scaleIO: ScaleIOPersistentVolumeSource,
    storageClassName: java.lang.String,
    storageos: StorageOSPersistentVolumeSource,
    volumeMode: java.lang.String,
    vsphereVolume: VsphereVirtualDiskVolumeSource
  ): PersistentVolumeSpec = {
    val __obj = js.Dynamic.literal(accessModes = accessModes, awsElasticBlockStore = awsElasticBlockStore, azureDisk = azureDisk, azureFile = azureFile, capacity = capacity, cephfs = cephfs, cinder = cinder, claimRef = claimRef, csi = csi, fc = fc, flexVolume = flexVolume, flocker = flocker, gcePersistentDisk = gcePersistentDisk, glusterfs = glusterfs, hostPath = hostPath, iscsi = iscsi, local = local, mountOptions = mountOptions, nfs = nfs, nodeAffinity = nodeAffinity, persistentVolumeReclaimPolicy = persistentVolumeReclaimPolicy, photonPersistentDisk = photonPersistentDisk, portworxVolume = portworxVolume, quobyte = quobyte, rbd = rbd, scaleIO = scaleIO, storageClassName = storageClassName, storageos = storageos, volumeMode = volumeMode, vsphereVolume = vsphereVolume)
  
    __obj.asInstanceOf[PersistentVolumeSpec]
  }
}

