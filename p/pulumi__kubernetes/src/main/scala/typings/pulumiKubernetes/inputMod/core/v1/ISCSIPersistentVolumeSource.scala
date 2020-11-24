package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ISCSIPersistentVolumeSource represents an ISCSI disk. ISCSI volumes can only be mounted as read/write once. ISCSI volumes support ownership management and SELinux relabeling.
  */
@js.native
trait ISCSIPersistentVolumeSource extends js.Object {
  
  /**
    * whether support iSCSI Discovery CHAP authentication
    */
  var chapAuthDiscovery: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * whether support iSCSI Session CHAP authentication
    */
  var chapAuthSession: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#iscsi
    */
  var fsType: js.UndefOr[Input[String]] = js.native
  
  /**
    * Custom iSCSI Initiator Name. If initiatorName is specified with iscsiInterface simultaneously, new iSCSI interface <target portal>:<volume name> will be created for the connection.
    */
  var initiatorName: js.UndefOr[Input[String]] = js.native
  
  /**
    * Target iSCSI Qualified Name.
    */
  var iqn: Input[String] = js.native
  
  /**
    * iSCSI Interface Name that uses an iSCSI transport. Defaults to 'default' (tcp).
    */
  var iscsiInterface: js.UndefOr[Input[String]] = js.native
  
  /**
    * iSCSI Target Lun number.
    */
  var lun: Input[Double] = js.native
  
  /**
    * iSCSI Target Portal List. The Portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).
    */
  var portals: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false.
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * CHAP Secret for iSCSI target and initiator authentication
    */
  var secretRef: js.UndefOr[Input[SecretReference]] = js.native
  
  /**
    * iSCSI Target Portal. The Portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).
    */
  var targetPortal: Input[String] = js.native
}
object ISCSIPersistentVolumeSource {
  
  @scala.inline
  def apply(iqn: Input[String], lun: Input[Double], targetPortal: Input[String]): ISCSIPersistentVolumeSource = {
    val __obj = js.Dynamic.literal(iqn = iqn.asInstanceOf[js.Any], lun = lun.asInstanceOf[js.Any], targetPortal = targetPortal.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISCSIPersistentVolumeSource]
  }
  
  @scala.inline
  implicit class ISCSIPersistentVolumeSourceOps[Self <: ISCSIPersistentVolumeSource] (val x: Self) extends AnyVal {
    
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
    def setIqn(value: Input[String]): Self = this.set("iqn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLun(value: Input[Double]): Self = this.set("lun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetPortal(value: Input[String]): Self = this.set("targetPortal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChapAuthDiscovery(value: Input[Boolean]): Self = this.set("chapAuthDiscovery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChapAuthDiscovery: Self = this.set("chapAuthDiscovery", js.undefined)
    
    @scala.inline
    def setChapAuthSession(value: Input[Boolean]): Self = this.set("chapAuthSession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChapAuthSession: Self = this.set("chapAuthSession", js.undefined)
    
    @scala.inline
    def setFsType(value: Input[String]): Self = this.set("fsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFsType: Self = this.set("fsType", js.undefined)
    
    @scala.inline
    def setInitiatorName(value: Input[String]): Self = this.set("initiatorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitiatorName: Self = this.set("initiatorName", js.undefined)
    
    @scala.inline
    def setIscsiInterface(value: Input[String]): Self = this.set("iscsiInterface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIscsiInterface: Self = this.set("iscsiInterface", js.undefined)
    
    @scala.inline
    def setPortalsVarargs(value: Input[String]*): Self = this.set("portals", js.Array(value :_*))
    
    @scala.inline
    def setPortals(value: Input[js.Array[Input[String]]]): Self = this.set("portals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortals: Self = this.set("portals", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Input[Boolean]): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    
    @scala.inline
    def setSecretRef(value: Input[SecretReference]): Self = this.set("secretRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecretRef: Self = this.set("secretRef", js.undefined)
  }
}
