package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Volume represents a named volume in a pod that may be accessed by any container in the pod.
  */
@js.native
trait Volume extends js.Object {
  /**
    * AWSElasticBlockStore represents an AWS Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
    */
  var awsElasticBlockStore: AWSElasticBlockStoreVolumeSource = js.native
  /**
    * AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
    */
  var azureDisk: AzureDiskVolumeSource = js.native
  /**
    * AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
    */
  var azureFile: AzureFileVolumeSource = js.native
  /**
    * CephFS represents a Ceph FS mount on the host that shares a pod's lifetime
    */
  var cephfs: CephFSVolumeSource = js.native
  /**
    * Cinder represents a cinder volume attached and mounted on kubelets host machine. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
    */
  var cinder: CinderVolumeSource = js.native
  /**
    * ConfigMap represents a configMap that should populate this volume
    */
  var configMap: ConfigMapVolumeSource = js.native
  /**
    * CSI (Container Storage Interface) represents storage that is handled by an external CSI driver (Alpha feature).
    */
  var csi: CSIVolumeSource = js.native
  /**
    * DownwardAPI represents downward API about the pod that should populate this volume
    */
  var downwardAPI: DownwardAPIVolumeSource = js.native
  /**
    * EmptyDir represents a temporary directory that shares a pod's lifetime. More info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir
    */
  var emptyDir: EmptyDirVolumeSource = js.native
  /**
    * FC represents a Fibre Channel resource that is attached to a kubelet's host machine and then exposed to the pod.
    */
  var fc: FCVolumeSource = js.native
  /**
    * FlexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.
    */
  var flexVolume: FlexVolumeSource = js.native
  /**
    * Flocker represents a Flocker volume attached to a kubelet's host machine. This depends on the Flocker control service being running
    */
  var flocker: FlockerVolumeSource = js.native
  /**
    * GCEPersistentDisk represents a GCE Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
    */
  var gcePersistentDisk: GCEPersistentDiskVolumeSource = js.native
  /**
    * GitRepo represents a git repository at a particular revision. DEPRECATED: GitRepo is deprecated. To provision a container with a git repo, mount an EmptyDir into an InitContainer that clones the repo using git, then mount the EmptyDir into the Pod's container.
    */
  var gitRepo: GitRepoVolumeSource = js.native
  /**
    * Glusterfs represents a Glusterfs mount on the host that shares a pod's lifetime. More info: https://examples.k8s.io/volumes/glusterfs/README.md
    */
  var glusterfs: GlusterfsVolumeSource = js.native
  /**
    * HostPath represents a pre-existing file or directory on the host machine that is directly exposed to the container. This is generally used for system agents or other privileged things that are allowed to see the host machine. Most containers will NOT need this. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
    */
  var hostPath: HostPathVolumeSource = js.native
  /**
    * ISCSI represents an ISCSI Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: https://examples.k8s.io/volumes/iscsi/README.md
    */
  var iscsi: ISCSIVolumeSource = js.native
  /**
    * Volume's name. Must be a DNS_LABEL and unique within the pod. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
    */
  var name: String = js.native
  /**
    * NFS represents an NFS mount on the host that shares a pod's lifetime More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
    */
  var nfs: NFSVolumeSource = js.native
  /**
    * PersistentVolumeClaimVolumeSource represents a reference to a PersistentVolumeClaim in the same namespace. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
    */
  var persistentVolumeClaim: PersistentVolumeClaimVolumeSource = js.native
  /**
    * PhotonPersistentDisk represents a PhotonController persistent disk attached and mounted on kubelets host machine
    */
  var photonPersistentDisk: PhotonPersistentDiskVolumeSource = js.native
  /**
    * PortworxVolume represents a portworx volume attached and mounted on kubelets host machine
    */
  var portworxVolume: PortworxVolumeSource = js.native
  /**
    * Items for all in one resources secrets, configmaps, and downward API
    */
  var projected: ProjectedVolumeSource = js.native
  /**
    * Quobyte represents a Quobyte mount on the host that shares a pod's lifetime
    */
  var quobyte: QuobyteVolumeSource = js.native
  /**
    * RBD represents a Rados Block Device mount on the host that shares a pod's lifetime. More info: https://examples.k8s.io/volumes/rbd/README.md
    */
  var rbd: RBDVolumeSource = js.native
  /**
    * ScaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.
    */
  var scaleIO: ScaleIOVolumeSource = js.native
  /**
    * Secret represents a secret that should populate this volume. More info: https://kubernetes.io/docs/concepts/storage/volumes#secret
    */
  var secret: SecretVolumeSource = js.native
  /**
    * StorageOS represents a StorageOS volume attached and mounted on Kubernetes nodes.
    */
  var storageos: StorageOSVolumeSource = js.native
  /**
    * VsphereVolume represents a vSphere volume attached and mounted on kubelets host machine
    */
  var vsphereVolume: VsphereVirtualDiskVolumeSource = js.native
}

object Volume {
  @scala.inline
  def apply(
    awsElasticBlockStore: AWSElasticBlockStoreVolumeSource,
    azureDisk: AzureDiskVolumeSource,
    azureFile: AzureFileVolumeSource,
    cephfs: CephFSVolumeSource,
    cinder: CinderVolumeSource,
    configMap: ConfigMapVolumeSource,
    csi: CSIVolumeSource,
    downwardAPI: DownwardAPIVolumeSource,
    emptyDir: EmptyDirVolumeSource,
    fc: FCVolumeSource,
    flexVolume: FlexVolumeSource,
    flocker: FlockerVolumeSource,
    gcePersistentDisk: GCEPersistentDiskVolumeSource,
    gitRepo: GitRepoVolumeSource,
    glusterfs: GlusterfsVolumeSource,
    hostPath: HostPathVolumeSource,
    iscsi: ISCSIVolumeSource,
    name: String,
    nfs: NFSVolumeSource,
    persistentVolumeClaim: PersistentVolumeClaimVolumeSource,
    photonPersistentDisk: PhotonPersistentDiskVolumeSource,
    portworxVolume: PortworxVolumeSource,
    projected: ProjectedVolumeSource,
    quobyte: QuobyteVolumeSource,
    rbd: RBDVolumeSource,
    scaleIO: ScaleIOVolumeSource,
    secret: SecretVolumeSource,
    storageos: StorageOSVolumeSource,
    vsphereVolume: VsphereVirtualDiskVolumeSource
  ): Volume = {
    val __obj = js.Dynamic.literal(awsElasticBlockStore = awsElasticBlockStore.asInstanceOf[js.Any], azureDisk = azureDisk.asInstanceOf[js.Any], azureFile = azureFile.asInstanceOf[js.Any], cephfs = cephfs.asInstanceOf[js.Any], cinder = cinder.asInstanceOf[js.Any], configMap = configMap.asInstanceOf[js.Any], csi = csi.asInstanceOf[js.Any], downwardAPI = downwardAPI.asInstanceOf[js.Any], emptyDir = emptyDir.asInstanceOf[js.Any], fc = fc.asInstanceOf[js.Any], flexVolume = flexVolume.asInstanceOf[js.Any], flocker = flocker.asInstanceOf[js.Any], gcePersistentDisk = gcePersistentDisk.asInstanceOf[js.Any], gitRepo = gitRepo.asInstanceOf[js.Any], glusterfs = glusterfs.asInstanceOf[js.Any], hostPath = hostPath.asInstanceOf[js.Any], iscsi = iscsi.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nfs = nfs.asInstanceOf[js.Any], persistentVolumeClaim = persistentVolumeClaim.asInstanceOf[js.Any], photonPersistentDisk = photonPersistentDisk.asInstanceOf[js.Any], portworxVolume = portworxVolume.asInstanceOf[js.Any], projected = projected.asInstanceOf[js.Any], quobyte = quobyte.asInstanceOf[js.Any], rbd = rbd.asInstanceOf[js.Any], scaleIO = scaleIO.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any], storageos = storageos.asInstanceOf[js.Any], vsphereVolume = vsphereVolume.asInstanceOf[js.Any])
    __obj.asInstanceOf[Volume]
  }
  @scala.inline
  implicit class VolumeOps[Self <: Volume] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAwsElasticBlockStore(value: AWSElasticBlockStoreVolumeSource): Self = this.set("awsElasticBlockStore", value.asInstanceOf[js.Any])
    @scala.inline
    def setAzureDisk(value: AzureDiskVolumeSource): Self = this.set("azureDisk", value.asInstanceOf[js.Any])
    @scala.inline
    def setAzureFile(value: AzureFileVolumeSource): Self = this.set("azureFile", value.asInstanceOf[js.Any])
    @scala.inline
    def setCephfs(value: CephFSVolumeSource): Self = this.set("cephfs", value.asInstanceOf[js.Any])
    @scala.inline
    def setCinder(value: CinderVolumeSource): Self = this.set("cinder", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfigMap(value: ConfigMapVolumeSource): Self = this.set("configMap", value.asInstanceOf[js.Any])
    @scala.inline
    def setCsi(value: CSIVolumeSource): Self = this.set("csi", value.asInstanceOf[js.Any])
    @scala.inline
    def setDownwardAPI(value: DownwardAPIVolumeSource): Self = this.set("downwardAPI", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmptyDir(value: EmptyDirVolumeSource): Self = this.set("emptyDir", value.asInstanceOf[js.Any])
    @scala.inline
    def setFc(value: FCVolumeSource): Self = this.set("fc", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlexVolume(value: FlexVolumeSource): Self = this.set("flexVolume", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlocker(value: FlockerVolumeSource): Self = this.set("flocker", value.asInstanceOf[js.Any])
    @scala.inline
    def setGcePersistentDisk(value: GCEPersistentDiskVolumeSource): Self = this.set("gcePersistentDisk", value.asInstanceOf[js.Any])
    @scala.inline
    def setGitRepo(value: GitRepoVolumeSource): Self = this.set("gitRepo", value.asInstanceOf[js.Any])
    @scala.inline
    def setGlusterfs(value: GlusterfsVolumeSource): Self = this.set("glusterfs", value.asInstanceOf[js.Any])
    @scala.inline
    def setHostPath(value: HostPathVolumeSource): Self = this.set("hostPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setIscsi(value: ISCSIVolumeSource): Self = this.set("iscsi", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNfs(value: NFSVolumeSource): Self = this.set("nfs", value.asInstanceOf[js.Any])
    @scala.inline
    def setPersistentVolumeClaim(value: PersistentVolumeClaimVolumeSource): Self = this.set("persistentVolumeClaim", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhotonPersistentDisk(value: PhotonPersistentDiskVolumeSource): Self = this.set("photonPersistentDisk", value.asInstanceOf[js.Any])
    @scala.inline
    def setPortworxVolume(value: PortworxVolumeSource): Self = this.set("portworxVolume", value.asInstanceOf[js.Any])
    @scala.inline
    def setProjected(value: ProjectedVolumeSource): Self = this.set("projected", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuobyte(value: QuobyteVolumeSource): Self = this.set("quobyte", value.asInstanceOf[js.Any])
    @scala.inline
    def setRbd(value: RBDVolumeSource): Self = this.set("rbd", value.asInstanceOf[js.Any])
    @scala.inline
    def setScaleIO(value: ScaleIOVolumeSource): Self = this.set("scaleIO", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecret(value: SecretVolumeSource): Self = this.set("secret", value.asInstanceOf[js.Any])
    @scala.inline
    def setStorageos(value: StorageOSVolumeSource): Self = this.set("storageos", value.asInstanceOf[js.Any])
    @scala.inline
    def setVsphereVolume(value: VsphereVirtualDiskVolumeSource): Self = this.set("vsphereVolume", value.asInstanceOf[js.Any])
  }
  
}

