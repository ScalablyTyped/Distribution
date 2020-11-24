package typings.pulumiKubernetes.outputMod.core.v1

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
  var chapAuthDiscovery: Boolean = js.native
  
  /**
    * whether support iSCSI Session CHAP authentication
    */
  var chapAuthSession: Boolean = js.native
  
  /**
    * Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#iscsi
    */
  var fsType: String = js.native
  
  /**
    * Custom iSCSI Initiator Name. If initiatorName is specified with iscsiInterface simultaneously, new iSCSI interface <target portal>:<volume name> will be created for the connection.
    */
  var initiatorName: String = js.native
  
  /**
    * Target iSCSI Qualified Name.
    */
  var iqn: String = js.native
  
  /**
    * iSCSI Interface Name that uses an iSCSI transport. Defaults to 'default' (tcp).
    */
  var iscsiInterface: String = js.native
  
  /**
    * iSCSI Target Lun number.
    */
  var lun: Double = js.native
  
  /**
    * iSCSI Target Portal List. The Portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).
    */
  var portals: js.Array[String] = js.native
  
  /**
    * ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false.
    */
  var readOnly: Boolean = js.native
  
  /**
    * CHAP Secret for iSCSI target and initiator authentication
    */
  var secretRef: SecretReference = js.native
  
  /**
    * iSCSI Target Portal. The Portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).
    */
  var targetPortal: String = js.native
}
object ISCSIPersistentVolumeSource {
  
  @scala.inline
  def apply(
    chapAuthDiscovery: Boolean,
    chapAuthSession: Boolean,
    fsType: String,
    initiatorName: String,
    iqn: String,
    iscsiInterface: String,
    lun: Double,
    portals: js.Array[String],
    readOnly: Boolean,
    secretRef: SecretReference,
    targetPortal: String
  ): ISCSIPersistentVolumeSource = {
    val __obj = js.Dynamic.literal(chapAuthDiscovery = chapAuthDiscovery.asInstanceOf[js.Any], chapAuthSession = chapAuthSession.asInstanceOf[js.Any], fsType = fsType.asInstanceOf[js.Any], initiatorName = initiatorName.asInstanceOf[js.Any], iqn = iqn.asInstanceOf[js.Any], iscsiInterface = iscsiInterface.asInstanceOf[js.Any], lun = lun.asInstanceOf[js.Any], portals = portals.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], secretRef = secretRef.asInstanceOf[js.Any], targetPortal = targetPortal.asInstanceOf[js.Any])
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
    def setChapAuthDiscovery(value: Boolean): Self = this.set("chapAuthDiscovery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChapAuthSession(value: Boolean): Self = this.set("chapAuthSession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFsType(value: String): Self = this.set("fsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitiatorName(value: String): Self = this.set("initiatorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIqn(value: String): Self = this.set("iqn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIscsiInterface(value: String): Self = this.set("iscsiInterface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLun(value: Double): Self = this.set("lun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalsVarargs(value: String*): Self = this.set("portals", js.Array(value :_*))
    
    @scala.inline
    def setPortals(value: js.Array[String]): Self = this.set("portals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretRef(value: SecretReference): Self = this.set("secretRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetPortal(value: String): Self = this.set("targetPortal", value.asInstanceOf[js.Any])
  }
}
