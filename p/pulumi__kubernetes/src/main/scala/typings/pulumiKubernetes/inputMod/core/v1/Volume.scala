package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Volume represents a named volume in a pod that may be accessed by any container in the pod.
  */
@js.native
trait Volume extends js.Object {
  
  /**
    * AWSElasticBlockStore represents an AWS Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
    */
  var awsElasticBlockStore: js.UndefOr[Input[AWSElasticBlockStoreVolumeSource]] = js.native
  
  /**
    * AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
    */
  var azureDisk: js.UndefOr[Input[AzureDiskVolumeSource]] = js.native
  
  /**
    * AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
    */
  var azureFile: js.UndefOr[Input[AzureFileVolumeSource]] = js.native
  
  /**
    * CephFS represents a Ceph FS mount on the host that shares a pod's lifetime
    */
  var cephfs: js.UndefOr[Input[CephFSVolumeSource]] = js.native
  
  /**
    * Cinder represents a cinder volume attached and mounted on kubelets host machine. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
    */
  var cinder: js.UndefOr[Input[CinderVolumeSource]] = js.native
  
  /**
    * ConfigMap represents a configMap that should populate this volume
    */
  var configMap: js.UndefOr[Input[ConfigMapVolumeSource]] = js.native
  
  /**
    * CSI (Container Storage Interface) represents ephemeral storage that is handled by certain external CSI drivers (Beta feature).
    */
  var csi: js.UndefOr[Input[CSIVolumeSource]] = js.native
  
  /**
    * DownwardAPI represents downward API about the pod that should populate this volume
    */
  var downwardAPI: js.UndefOr[Input[DownwardAPIVolumeSource]] = js.native
  
  /**
    * EmptyDir represents a temporary directory that shares a pod's lifetime. More info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir
    */
  var emptyDir: js.UndefOr[Input[EmptyDirVolumeSource]] = js.native
  
  /**
    * Ephemeral represents a volume that is handled by a cluster storage driver (Alpha feature). The volume's lifecycle is tied to the pod that defines it - it will be created before the pod starts, and deleted when the pod is removed.
    *
    * Use this if: a) the volume is only needed while the pod runs, b) features of normal volumes like restoring from snapshot or capacity
    *    tracking are needed,
    * c) the storage driver is specified through a storage class, and d) the storage driver supports dynamic volume provisioning through
    *    a PersistentVolumeClaim (see EphemeralVolumeSource for more
    *    information on the connection between this volume type
    *    and PersistentVolumeClaim).
    *
    * Use PersistentVolumeClaim or one of the vendor-specific APIs for volumes that persist for longer than the lifecycle of an individual pod.
    *
    * Use CSI for light-weight local ephemeral volumes if the CSI driver is meant to be used that way - see the documentation of the driver for more information.
    *
    * A pod can use both types of ephemeral volumes and persistent volumes at the same time.
    */
  var ephemeral: js.UndefOr[Input[EphemeralVolumeSource]] = js.native
  
  /**
    * FC represents a Fibre Channel resource that is attached to a kubelet's host machine and then exposed to the pod.
    */
  var fc: js.UndefOr[Input[FCVolumeSource]] = js.native
  
  /**
    * FlexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.
    */
  var flexVolume: js.UndefOr[Input[FlexVolumeSource]] = js.native
  
  /**
    * Flocker represents a Flocker volume attached to a kubelet's host machine. This depends on the Flocker control service being running
    */
  var flocker: js.UndefOr[Input[FlockerVolumeSource]] = js.native
  
  /**
    * GCEPersistentDisk represents a GCE Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
    */
  var gcePersistentDisk: js.UndefOr[Input[GCEPersistentDiskVolumeSource]] = js.native
  
  /**
    * GitRepo represents a git repository at a particular revision. DEPRECATED: GitRepo is deprecated. To provision a container with a git repo, mount an EmptyDir into an InitContainer that clones the repo using git, then mount the EmptyDir into the Pod's container.
    */
  var gitRepo: js.UndefOr[Input[GitRepoVolumeSource]] = js.native
  
  /**
    * Glusterfs represents a Glusterfs mount on the host that shares a pod's lifetime. More info: https://examples.k8s.io/volumes/glusterfs/README.md
    */
  var glusterfs: js.UndefOr[Input[GlusterfsVolumeSource]] = js.native
  
  /**
    * HostPath represents a pre-existing file or directory on the host machine that is directly exposed to the container. This is generally used for system agents or other privileged things that are allowed to see the host machine. Most containers will NOT need this. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
    */
  var hostPath: js.UndefOr[Input[HostPathVolumeSource]] = js.native
  
  /**
    * ISCSI represents an ISCSI Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: https://examples.k8s.io/volumes/iscsi/README.md
    */
  var iscsi: js.UndefOr[Input[ISCSIVolumeSource]] = js.native
  
  /**
    * Volume's name. Must be a DNS_LABEL and unique within the pod. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
    */
  var name: Input[String] = js.native
  
  /**
    * NFS represents an NFS mount on the host that shares a pod's lifetime More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
    */
  var nfs: js.UndefOr[Input[NFSVolumeSource]] = js.native
  
  /**
    * PersistentVolumeClaimVolumeSource represents a reference to a PersistentVolumeClaim in the same namespace. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
    */
  var persistentVolumeClaim: js.UndefOr[Input[PersistentVolumeClaimVolumeSource]] = js.native
  
  /**
    * PhotonPersistentDisk represents a PhotonController persistent disk attached and mounted on kubelets host machine
    */
  var photonPersistentDisk: js.UndefOr[Input[PhotonPersistentDiskVolumeSource]] = js.native
  
  /**
    * PortworxVolume represents a portworx volume attached and mounted on kubelets host machine
    */
  var portworxVolume: js.UndefOr[Input[PortworxVolumeSource]] = js.native
  
  /**
    * Items for all in one resources secrets, configmaps, and downward API
    */
  var projected: js.UndefOr[Input[ProjectedVolumeSource]] = js.native
  
  /**
    * Quobyte represents a Quobyte mount on the host that shares a pod's lifetime
    */
  var quobyte: js.UndefOr[Input[QuobyteVolumeSource]] = js.native
  
  /**
    * RBD represents a Rados Block Device mount on the host that shares a pod's lifetime. More info: https://examples.k8s.io/volumes/rbd/README.md
    */
  var rbd: js.UndefOr[Input[RBDVolumeSource]] = js.native
  
  /**
    * ScaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.
    */
  var scaleIO: js.UndefOr[Input[ScaleIOVolumeSource]] = js.native
  
  /**
    * Secret represents a secret that should populate this volume. More info: https://kubernetes.io/docs/concepts/storage/volumes#secret
    */
  var secret: js.UndefOr[Input[SecretVolumeSource]] = js.native
  
  /**
    * StorageOS represents a StorageOS volume attached and mounted on Kubernetes nodes.
    */
  var storageos: js.UndefOr[Input[StorageOSVolumeSource]] = js.native
  
  /**
    * VsphereVolume represents a vSphere volume attached and mounted on kubelets host machine
    */
  var vsphereVolume: js.UndefOr[Input[VsphereVirtualDiskVolumeSource]] = js.native
}
object Volume {
  
  @scala.inline
  def apply(name: Input[String]): Volume = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
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
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsElasticBlockStore(value: Input[AWSElasticBlockStoreVolumeSource]): Self = this.set("awsElasticBlockStore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsElasticBlockStore: Self = this.set("awsElasticBlockStore", js.undefined)
    
    @scala.inline
    def setAzureDisk(value: Input[AzureDiskVolumeSource]): Self = this.set("azureDisk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAzureDisk: Self = this.set("azureDisk", js.undefined)
    
    @scala.inline
    def setAzureFile(value: Input[AzureFileVolumeSource]): Self = this.set("azureFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAzureFile: Self = this.set("azureFile", js.undefined)
    
    @scala.inline
    def setCephfs(value: Input[CephFSVolumeSource]): Self = this.set("cephfs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCephfs: Self = this.set("cephfs", js.undefined)
    
    @scala.inline
    def setCinder(value: Input[CinderVolumeSource]): Self = this.set("cinder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCinder: Self = this.set("cinder", js.undefined)
    
    @scala.inline
    def setConfigMap(value: Input[ConfigMapVolumeSource]): Self = this.set("configMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigMap: Self = this.set("configMap", js.undefined)
    
    @scala.inline
    def setCsi(value: Input[CSIVolumeSource]): Self = this.set("csi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCsi: Self = this.set("csi", js.undefined)
    
    @scala.inline
    def setDownwardAPI(value: Input[DownwardAPIVolumeSource]): Self = this.set("downwardAPI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownwardAPI: Self = this.set("downwardAPI", js.undefined)
    
    @scala.inline
    def setEmptyDir(value: Input[EmptyDirVolumeSource]): Self = this.set("emptyDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmptyDir: Self = this.set("emptyDir", js.undefined)
    
    @scala.inline
    def setEphemeral(value: Input[EphemeralVolumeSource]): Self = this.set("ephemeral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEphemeral: Self = this.set("ephemeral", js.undefined)
    
    @scala.inline
    def setFc(value: Input[FCVolumeSource]): Self = this.set("fc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFc: Self = this.set("fc", js.undefined)
    
    @scala.inline
    def setFlexVolume(value: Input[FlexVolumeSource]): Self = this.set("flexVolume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlexVolume: Self = this.set("flexVolume", js.undefined)
    
    @scala.inline
    def setFlocker(value: Input[FlockerVolumeSource]): Self = this.set("flocker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlocker: Self = this.set("flocker", js.undefined)
    
    @scala.inline
    def setGcePersistentDisk(value: Input[GCEPersistentDiskVolumeSource]): Self = this.set("gcePersistentDisk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGcePersistentDisk: Self = this.set("gcePersistentDisk", js.undefined)
    
    @scala.inline
    def setGitRepo(value: Input[GitRepoVolumeSource]): Self = this.set("gitRepo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGitRepo: Self = this.set("gitRepo", js.undefined)
    
    @scala.inline
    def setGlusterfs(value: Input[GlusterfsVolumeSource]): Self = this.set("glusterfs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlusterfs: Self = this.set("glusterfs", js.undefined)
    
    @scala.inline
    def setHostPath(value: Input[HostPathVolumeSource]): Self = this.set("hostPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostPath: Self = this.set("hostPath", js.undefined)
    
    @scala.inline
    def setIscsi(value: Input[ISCSIVolumeSource]): Self = this.set("iscsi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIscsi: Self = this.set("iscsi", js.undefined)
    
    @scala.inline
    def setNfs(value: Input[NFSVolumeSource]): Self = this.set("nfs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNfs: Self = this.set("nfs", js.undefined)
    
    @scala.inline
    def setPersistentVolumeClaim(value: Input[PersistentVolumeClaimVolumeSource]): Self = this.set("persistentVolumeClaim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersistentVolumeClaim: Self = this.set("persistentVolumeClaim", js.undefined)
    
    @scala.inline
    def setPhotonPersistentDisk(value: Input[PhotonPersistentDiskVolumeSource]): Self = this.set("photonPersistentDisk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhotonPersistentDisk: Self = this.set("photonPersistentDisk", js.undefined)
    
    @scala.inline
    def setPortworxVolume(value: Input[PortworxVolumeSource]): Self = this.set("portworxVolume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortworxVolume: Self = this.set("portworxVolume", js.undefined)
    
    @scala.inline
    def setProjected(value: Input[ProjectedVolumeSource]): Self = this.set("projected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjected: Self = this.set("projected", js.undefined)
    
    @scala.inline
    def setQuobyte(value: Input[QuobyteVolumeSource]): Self = this.set("quobyte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuobyte: Self = this.set("quobyte", js.undefined)
    
    @scala.inline
    def setRbd(value: Input[RBDVolumeSource]): Self = this.set("rbd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRbd: Self = this.set("rbd", js.undefined)
    
    @scala.inline
    def setScaleIO(value: Input[ScaleIOVolumeSource]): Self = this.set("scaleIO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleIO: Self = this.set("scaleIO", js.undefined)
    
    @scala.inline
    def setSecret(value: Input[SecretVolumeSource]): Self = this.set("secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecret: Self = this.set("secret", js.undefined)
    
    @scala.inline
    def setStorageos(value: Input[StorageOSVolumeSource]): Self = this.set("storageos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageos: Self = this.set("storageos", js.undefined)
    
    @scala.inline
    def setVsphereVolume(value: Input[VsphereVirtualDiskVolumeSource]): Self = this.set("vsphereVolume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVsphereVolume: Self = this.set("vsphereVolume", js.undefined)
  }
}
