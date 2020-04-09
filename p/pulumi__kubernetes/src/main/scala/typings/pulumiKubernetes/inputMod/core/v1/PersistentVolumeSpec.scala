package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
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
  var accessModes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * AWSElasticBlockStore represents an AWS Disk resource that is attached to a kubelet's host
    * machine and then exposed to the pod. More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
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
    * A description of the persistent volume's resources and capacity. More info:
    * https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity
    */
  var capacity: js.UndefOr[Input[js.Object]] = js.undefined
  /**
    * CephFS represents a Ceph FS mount on the host that shares a pod's lifetime
    */
  var cephfs: js.UndefOr[Input[CephFSPersistentVolumeSource]] = js.undefined
  /**
    * Cinder represents a cinder volume attached and mounted on kubelets host machine. More info:
    * https://examples.k8s.io/mysql-cinder-pd/README.md
    */
  var cinder: js.UndefOr[Input[CinderPersistentVolumeSource]] = js.undefined
  /**
    * ClaimRef is part of a bi-directional binding between PersistentVolume and
    * PersistentVolumeClaim. Expected to be non-nil when bound. claim.VolumeName is the
    * authoritative bind between PV and PVC. More info:
    * https://kubernetes.io/docs/concepts/storage/persistent-volumes#binding
    */
  var claimRef: js.UndefOr[Input[ObjectReference]] = js.undefined
  /**
    * CSI represents storage that is handled by an external CSI driver (Beta feature).
    */
  var csi: js.UndefOr[Input[CSIPersistentVolumeSource]] = js.undefined
  /**
    * FC represents a Fibre Channel resource that is attached to a kubelet's host machine and
    * then exposed to the pod.
    */
  var fc: js.UndefOr[Input[FCVolumeSource]] = js.undefined
  /**
    * FlexVolume represents a generic volume resource that is provisioned/attached using an exec
    * based plugin.
    */
  var flexVolume: js.UndefOr[Input[FlexPersistentVolumeSource]] = js.undefined
  /**
    * Flocker represents a Flocker volume attached to a kubelet's host machine and exposed to the
    * pod for its usage. This depends on the Flocker control service being running
    */
  var flocker: js.UndefOr[Input[FlockerVolumeSource]] = js.undefined
  /**
    * GCEPersistentDisk represents a GCE Disk resource that is attached to a kubelet's host
    * machine and then exposed to the pod. Provisioned by an admin. More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
    */
  var gcePersistentDisk: js.UndefOr[Input[GCEPersistentDiskVolumeSource]] = js.undefined
  /**
    * Glusterfs represents a Glusterfs volume that is attached to a host and exposed to the pod.
    * Provisioned by an admin. More info: https://examples.k8s.io/volumes/glusterfs/README.md
    */
  var glusterfs: js.UndefOr[Input[GlusterfsPersistentVolumeSource]] = js.undefined
  /**
    * HostPath represents a directory on the host. Provisioned by a developer or tester. This is
    * useful for single-node development and testing only! On-host storage is not supported in
    * any way and WILL NOT WORK in a multi-node cluster. More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#hostpath
    */
  var hostPath: js.UndefOr[Input[HostPathVolumeSource]] = js.undefined
  /**
    * ISCSI represents an ISCSI Disk resource that is attached to a kubelet's host machine and
    * then exposed to the pod. Provisioned by an admin.
    */
  var iscsi: js.UndefOr[Input[ISCSIPersistentVolumeSource]] = js.undefined
  /**
    * Local represents directly-attached storage with node affinity
    */
  var local: js.UndefOr[Input[LocalVolumeSource]] = js.undefined
  /**
    * A list of mount options, e.g. ["ro", "soft"]. Not validated - mount will simply fail if one
    * is invalid. More info:
    * https://kubernetes.io/docs/concepts/storage/persistent-volumes/#mount-options
    */
  var mountOptions: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * NFS represents an NFS mount on the host. Provisioned by an admin. More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#nfs
    */
  var nfs: js.UndefOr[Input[NFSVolumeSource]] = js.undefined
  /**
    * NodeAffinity defines constraints that limit what nodes this volume can be accessed from.
    * This field influences the scheduling of pods that use this volume.
    */
  var nodeAffinity: js.UndefOr[Input[VolumeNodeAffinity]] = js.undefined
  /**
    * What happens to a persistent volume when released from its claim. Valid options are Retain
    * (default for manually created PersistentVolumes), Delete (default for dynamically
    * provisioned PersistentVolumes), and Recycle (deprecated). Recycle must be supported by the
    * volume plugin underlying this PersistentVolume. More info:
    * https://kubernetes.io/docs/concepts/storage/persistent-volumes#reclaiming
    */
  var persistentVolumeReclaimPolicy: js.UndefOr[Input[String]] = js.undefined
  /**
    * PhotonPersistentDisk represents a PhotonController persistent disk attached and mounted on
    * kubelets host machine
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
    * RBD represents a Rados Block Device mount on the host that shares a pod's lifetime. More
    * info: https://examples.k8s.io/volumes/rbd/README.md
    */
  var rbd: js.UndefOr[Input[RBDPersistentVolumeSource]] = js.undefined
  /**
    * ScaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.
    */
  var scaleIO: js.UndefOr[Input[ScaleIOPersistentVolumeSource]] = js.undefined
  /**
    * Name of StorageClass to which this persistent volume belongs. Empty value means that this
    * volume does not belong to any StorageClass.
    */
  var storageClassName: js.UndefOr[Input[String]] = js.undefined
  /**
    * StorageOS represents a StorageOS volume that is attached to the kubelet's host machine and
    * mounted into the pod More info: https://examples.k8s.io/volumes/storageos/README.md
    */
  var storageos: js.UndefOr[Input[StorageOSPersistentVolumeSource]] = js.undefined
  /**
    * volumeMode defines if a volume is intended to be used with a formatted filesystem or to
    * remain in raw block state. Value of Filesystem is implied when not included in spec.
    */
  var volumeMode: js.UndefOr[Input[String]] = js.undefined
  /**
    * VsphereVolume represents a vSphere volume attached and mounted on kubelets host machine
    */
  var vsphereVolume: js.UndefOr[Input[VsphereVirtualDiskVolumeSource]] = js.undefined
}

object PersistentVolumeSpec {
  @scala.inline
  def apply(
    accessModes: Input[js.Array[Input[String]]] = null,
    awsElasticBlockStore: Input[AWSElasticBlockStoreVolumeSource] = null,
    azureDisk: Input[AzureDiskVolumeSource] = null,
    azureFile: Input[AzureFilePersistentVolumeSource] = null,
    capacity: Input[js.Object] = null,
    cephfs: Input[CephFSPersistentVolumeSource] = null,
    cinder: Input[CinderPersistentVolumeSource] = null,
    claimRef: Input[ObjectReference] = null,
    csi: Input[CSIPersistentVolumeSource] = null,
    fc: Input[FCVolumeSource] = null,
    flexVolume: Input[FlexPersistentVolumeSource] = null,
    flocker: Input[FlockerVolumeSource] = null,
    gcePersistentDisk: Input[GCEPersistentDiskVolumeSource] = null,
    glusterfs: Input[GlusterfsPersistentVolumeSource] = null,
    hostPath: Input[HostPathVolumeSource] = null,
    iscsi: Input[ISCSIPersistentVolumeSource] = null,
    local: Input[LocalVolumeSource] = null,
    mountOptions: Input[js.Array[Input[String]]] = null,
    nfs: Input[NFSVolumeSource] = null,
    nodeAffinity: Input[VolumeNodeAffinity] = null,
    persistentVolumeReclaimPolicy: Input[String] = null,
    photonPersistentDisk: Input[PhotonPersistentDiskVolumeSource] = null,
    portworxVolume: Input[PortworxVolumeSource] = null,
    quobyte: Input[QuobyteVolumeSource] = null,
    rbd: Input[RBDPersistentVolumeSource] = null,
    scaleIO: Input[ScaleIOPersistentVolumeSource] = null,
    storageClassName: Input[String] = null,
    storageos: Input[StorageOSPersistentVolumeSource] = null,
    volumeMode: Input[String] = null,
    vsphereVolume: Input[VsphereVirtualDiskVolumeSource] = null
  ): PersistentVolumeSpec = {
    val __obj = js.Dynamic.literal()
    if (accessModes != null) __obj.updateDynamic("accessModes")(accessModes.asInstanceOf[js.Any])
    if (awsElasticBlockStore != null) __obj.updateDynamic("awsElasticBlockStore")(awsElasticBlockStore.asInstanceOf[js.Any])
    if (azureDisk != null) __obj.updateDynamic("azureDisk")(azureDisk.asInstanceOf[js.Any])
    if (azureFile != null) __obj.updateDynamic("azureFile")(azureFile.asInstanceOf[js.Any])
    if (capacity != null) __obj.updateDynamic("capacity")(capacity.asInstanceOf[js.Any])
    if (cephfs != null) __obj.updateDynamic("cephfs")(cephfs.asInstanceOf[js.Any])
    if (cinder != null) __obj.updateDynamic("cinder")(cinder.asInstanceOf[js.Any])
    if (claimRef != null) __obj.updateDynamic("claimRef")(claimRef.asInstanceOf[js.Any])
    if (csi != null) __obj.updateDynamic("csi")(csi.asInstanceOf[js.Any])
    if (fc != null) __obj.updateDynamic("fc")(fc.asInstanceOf[js.Any])
    if (flexVolume != null) __obj.updateDynamic("flexVolume")(flexVolume.asInstanceOf[js.Any])
    if (flocker != null) __obj.updateDynamic("flocker")(flocker.asInstanceOf[js.Any])
    if (gcePersistentDisk != null) __obj.updateDynamic("gcePersistentDisk")(gcePersistentDisk.asInstanceOf[js.Any])
    if (glusterfs != null) __obj.updateDynamic("glusterfs")(glusterfs.asInstanceOf[js.Any])
    if (hostPath != null) __obj.updateDynamic("hostPath")(hostPath.asInstanceOf[js.Any])
    if (iscsi != null) __obj.updateDynamic("iscsi")(iscsi.asInstanceOf[js.Any])
    if (local != null) __obj.updateDynamic("local")(local.asInstanceOf[js.Any])
    if (mountOptions != null) __obj.updateDynamic("mountOptions")(mountOptions.asInstanceOf[js.Any])
    if (nfs != null) __obj.updateDynamic("nfs")(nfs.asInstanceOf[js.Any])
    if (nodeAffinity != null) __obj.updateDynamic("nodeAffinity")(nodeAffinity.asInstanceOf[js.Any])
    if (persistentVolumeReclaimPolicy != null) __obj.updateDynamic("persistentVolumeReclaimPolicy")(persistentVolumeReclaimPolicy.asInstanceOf[js.Any])
    if (photonPersistentDisk != null) __obj.updateDynamic("photonPersistentDisk")(photonPersistentDisk.asInstanceOf[js.Any])
    if (portworxVolume != null) __obj.updateDynamic("portworxVolume")(portworxVolume.asInstanceOf[js.Any])
    if (quobyte != null) __obj.updateDynamic("quobyte")(quobyte.asInstanceOf[js.Any])
    if (rbd != null) __obj.updateDynamic("rbd")(rbd.asInstanceOf[js.Any])
    if (scaleIO != null) __obj.updateDynamic("scaleIO")(scaleIO.asInstanceOf[js.Any])
    if (storageClassName != null) __obj.updateDynamic("storageClassName")(storageClassName.asInstanceOf[js.Any])
    if (storageos != null) __obj.updateDynamic("storageos")(storageos.asInstanceOf[js.Any])
    if (volumeMode != null) __obj.updateDynamic("volumeMode")(volumeMode.asInstanceOf[js.Any])
    if (vsphereVolume != null) __obj.updateDynamic("vsphereVolume")(vsphereVolume.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistentVolumeSpec]
  }
}

