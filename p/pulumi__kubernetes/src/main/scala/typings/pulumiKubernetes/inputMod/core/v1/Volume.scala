package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Volume represents a named volume in a pod that may be accessed by any container in the pod.
  */
trait Volume extends js.Object {
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
  var azureFile: js.UndefOr[Input[AzureFileVolumeSource]] = js.undefined
  /**
    * CephFS represents a Ceph FS mount on the host that shares a pod's lifetime
    */
  var cephfs: js.UndefOr[Input[CephFSVolumeSource]] = js.undefined
  /**
    * Cinder represents a cinder volume attached and mounted on kubelets host machine. More info:
    * https://examples.k8s.io/mysql-cinder-pd/README.md
    */
  var cinder: js.UndefOr[Input[CinderVolumeSource]] = js.undefined
  /**
    * ConfigMap represents a configMap that should populate this volume
    */
  var configMap: js.UndefOr[Input[ConfigMapVolumeSource]] = js.undefined
  /**
    * CSI (Container Storage Interface) represents storage that is handled by an external CSI
    * driver (Alpha feature).
    */
  var csi: js.UndefOr[Input[CSIVolumeSource]] = js.undefined
  /**
    * DownwardAPI represents downward API about the pod that should populate this volume
    */
  var downwardAPI: js.UndefOr[Input[DownwardAPIVolumeSource]] = js.undefined
  /**
    * EmptyDir represents a temporary directory that shares a pod's lifetime. More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#emptydir
    */
  var emptyDir: js.UndefOr[Input[EmptyDirVolumeSource]] = js.undefined
  /**
    * FC represents a Fibre Channel resource that is attached to a kubelet's host machine and
    * then exposed to the pod.
    */
  var fc: js.UndefOr[Input[FCVolumeSource]] = js.undefined
  /**
    * FlexVolume represents a generic volume resource that is provisioned/attached using an exec
    * based plugin.
    */
  var flexVolume: js.UndefOr[Input[FlexVolumeSource]] = js.undefined
  /**
    * Flocker represents a Flocker volume attached to a kubelet's host machine. This depends on
    * the Flocker control service being running
    */
  var flocker: js.UndefOr[Input[FlockerVolumeSource]] = js.undefined
  /**
    * GCEPersistentDisk represents a GCE Disk resource that is attached to a kubelet's host
    * machine and then exposed to the pod. More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
    */
  var gcePersistentDisk: js.UndefOr[Input[GCEPersistentDiskVolumeSource]] = js.undefined
  /**
    * GitRepo represents a git repository at a particular revision. DEPRECATED: GitRepo is
    * deprecated. To provision a container with a git repo, mount an EmptyDir into an
    * InitContainer that clones the repo using git, then mount the EmptyDir into the Pod's
    * container.
    */
  var gitRepo: js.UndefOr[Input[GitRepoVolumeSource]] = js.undefined
  /**
    * Glusterfs represents a Glusterfs mount on the host that shares a pod's lifetime. More info:
    * https://examples.k8s.io/volumes/glusterfs/README.md
    */
  var glusterfs: js.UndefOr[Input[GlusterfsVolumeSource]] = js.undefined
  /**
    * HostPath represents a pre-existing file or directory on the host machine that is directly
    * exposed to the container. This is generally used for system agents or other privileged
    * things that are allowed to see the host machine. Most containers will NOT need this. More
    * info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
    */
  var hostPath: js.UndefOr[Input[HostPathVolumeSource]] = js.undefined
  /**
    * ISCSI represents an ISCSI Disk resource that is attached to a kubelet's host machine and
    * then exposed to the pod. More info: https://examples.k8s.io/volumes/iscsi/README.md
    */
  var iscsi: js.UndefOr[Input[ISCSIVolumeSource]] = js.undefined
  /**
    * Volume's name. Must be a DNS_LABEL and unique within the pod. More info:
    * https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
    */
  var name: Input[String]
  /**
    * NFS represents an NFS mount on the host that shares a pod's lifetime More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#nfs
    */
  var nfs: js.UndefOr[Input[NFSVolumeSource]] = js.undefined
  /**
    * PersistentVolumeClaimVolumeSource represents a reference to a PersistentVolumeClaim in the
    * same namespace. More info:
    * https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
    */
  var persistentVolumeClaim: js.UndefOr[Input[PersistentVolumeClaimVolumeSource]] = js.undefined
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
    * Items for all in one resources secrets, configmaps, and downward API
    */
  var projected: js.UndefOr[Input[ProjectedVolumeSource]] = js.undefined
  /**
    * Quobyte represents a Quobyte mount on the host that shares a pod's lifetime
    */
  var quobyte: js.UndefOr[Input[QuobyteVolumeSource]] = js.undefined
  /**
    * RBD represents a Rados Block Device mount on the host that shares a pod's lifetime. More
    * info: https://examples.k8s.io/volumes/rbd/README.md
    */
  var rbd: js.UndefOr[Input[RBDVolumeSource]] = js.undefined
  /**
    * ScaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.
    */
  var scaleIO: js.UndefOr[Input[ScaleIOVolumeSource]] = js.undefined
  /**
    * Secret represents a secret that should populate this volume. More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#secret
    */
  var secret: js.UndefOr[Input[SecretVolumeSource]] = js.undefined
  /**
    * StorageOS represents a StorageOS volume attached and mounted on Kubernetes nodes.
    */
  var storageos: js.UndefOr[Input[StorageOSVolumeSource]] = js.undefined
  /**
    * VsphereVolume represents a vSphere volume attached and mounted on kubelets host machine
    */
  var vsphereVolume: js.UndefOr[Input[VsphereVirtualDiskVolumeSource]] = js.undefined
}

object Volume {
  @scala.inline
  def apply(
    name: Input[String],
    awsElasticBlockStore: Input[AWSElasticBlockStoreVolumeSource] = null,
    azureDisk: Input[AzureDiskVolumeSource] = null,
    azureFile: Input[AzureFileVolumeSource] = null,
    cephfs: Input[CephFSVolumeSource] = null,
    cinder: Input[CinderVolumeSource] = null,
    configMap: Input[ConfigMapVolumeSource] = null,
    csi: Input[CSIVolumeSource] = null,
    downwardAPI: Input[DownwardAPIVolumeSource] = null,
    emptyDir: Input[EmptyDirVolumeSource] = null,
    fc: Input[FCVolumeSource] = null,
    flexVolume: Input[FlexVolumeSource] = null,
    flocker: Input[FlockerVolumeSource] = null,
    gcePersistentDisk: Input[GCEPersistentDiskVolumeSource] = null,
    gitRepo: Input[GitRepoVolumeSource] = null,
    glusterfs: Input[GlusterfsVolumeSource] = null,
    hostPath: Input[HostPathVolumeSource] = null,
    iscsi: Input[ISCSIVolumeSource] = null,
    nfs: Input[NFSVolumeSource] = null,
    persistentVolumeClaim: Input[PersistentVolumeClaimVolumeSource] = null,
    photonPersistentDisk: Input[PhotonPersistentDiskVolumeSource] = null,
    portworxVolume: Input[PortworxVolumeSource] = null,
    projected: Input[ProjectedVolumeSource] = null,
    quobyte: Input[QuobyteVolumeSource] = null,
    rbd: Input[RBDVolumeSource] = null,
    scaleIO: Input[ScaleIOVolumeSource] = null,
    secret: Input[SecretVolumeSource] = null,
    storageos: Input[StorageOSVolumeSource] = null,
    vsphereVolume: Input[VsphereVirtualDiskVolumeSource] = null
  ): Volume = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (awsElasticBlockStore != null) __obj.updateDynamic("awsElasticBlockStore")(awsElasticBlockStore.asInstanceOf[js.Any])
    if (azureDisk != null) __obj.updateDynamic("azureDisk")(azureDisk.asInstanceOf[js.Any])
    if (azureFile != null) __obj.updateDynamic("azureFile")(azureFile.asInstanceOf[js.Any])
    if (cephfs != null) __obj.updateDynamic("cephfs")(cephfs.asInstanceOf[js.Any])
    if (cinder != null) __obj.updateDynamic("cinder")(cinder.asInstanceOf[js.Any])
    if (configMap != null) __obj.updateDynamic("configMap")(configMap.asInstanceOf[js.Any])
    if (csi != null) __obj.updateDynamic("csi")(csi.asInstanceOf[js.Any])
    if (downwardAPI != null) __obj.updateDynamic("downwardAPI")(downwardAPI.asInstanceOf[js.Any])
    if (emptyDir != null) __obj.updateDynamic("emptyDir")(emptyDir.asInstanceOf[js.Any])
    if (fc != null) __obj.updateDynamic("fc")(fc.asInstanceOf[js.Any])
    if (flexVolume != null) __obj.updateDynamic("flexVolume")(flexVolume.asInstanceOf[js.Any])
    if (flocker != null) __obj.updateDynamic("flocker")(flocker.asInstanceOf[js.Any])
    if (gcePersistentDisk != null) __obj.updateDynamic("gcePersistentDisk")(gcePersistentDisk.asInstanceOf[js.Any])
    if (gitRepo != null) __obj.updateDynamic("gitRepo")(gitRepo.asInstanceOf[js.Any])
    if (glusterfs != null) __obj.updateDynamic("glusterfs")(glusterfs.asInstanceOf[js.Any])
    if (hostPath != null) __obj.updateDynamic("hostPath")(hostPath.asInstanceOf[js.Any])
    if (iscsi != null) __obj.updateDynamic("iscsi")(iscsi.asInstanceOf[js.Any])
    if (nfs != null) __obj.updateDynamic("nfs")(nfs.asInstanceOf[js.Any])
    if (persistentVolumeClaim != null) __obj.updateDynamic("persistentVolumeClaim")(persistentVolumeClaim.asInstanceOf[js.Any])
    if (photonPersistentDisk != null) __obj.updateDynamic("photonPersistentDisk")(photonPersistentDisk.asInstanceOf[js.Any])
    if (portworxVolume != null) __obj.updateDynamic("portworxVolume")(portworxVolume.asInstanceOf[js.Any])
    if (projected != null) __obj.updateDynamic("projected")(projected.asInstanceOf[js.Any])
    if (quobyte != null) __obj.updateDynamic("quobyte")(quobyte.asInstanceOf[js.Any])
    if (rbd != null) __obj.updateDynamic("rbd")(rbd.asInstanceOf[js.Any])
    if (scaleIO != null) __obj.updateDynamic("scaleIO")(scaleIO.asInstanceOf[js.Any])
    if (secret != null) __obj.updateDynamic("secret")(secret.asInstanceOf[js.Any])
    if (storageos != null) __obj.updateDynamic("storageos")(storageos.asInstanceOf[js.Any])
    if (vsphereVolume != null) __obj.updateDynamic("vsphereVolume")(vsphereVolume.asInstanceOf[js.Any])
    __obj.asInstanceOf[Volume]
  }
}

