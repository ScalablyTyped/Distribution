package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ISCSIPersistentVolumeSource represents an ISCSI disk. ISCSI volumes can only be mounted as read/write once. ISCSI volumes support ownership management and SELinux relabeling.
  */
trait ISCSIPersistentVolumeSource extends StObject {
  
  /**
    * whether support iSCSI Discovery CHAP authentication
    */
  var chapAuthDiscovery: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * whether support iSCSI Session CHAP authentication
    */
  var chapAuthSession: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#iscsi
    */
  var fsType: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Custom iSCSI Initiator Name. If initiatorName is specified with iscsiInterface simultaneously, new iSCSI interface <target portal>:<volume name> will be created for the connection.
    */
  var initiatorName: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Target iSCSI Qualified Name.
    */
  var iqn: Input[String]
  
  /**
    * iSCSI Interface Name that uses an iSCSI transport. Defaults to 'default' (tcp).
    */
  var iscsiInterface: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * iSCSI Target Lun number.
    */
  var lun: Input[Double]
  
  /**
    * iSCSI Target Portal List. The Portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).
    */
  var portals: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  
  /**
    * ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false.
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * CHAP Secret for iSCSI target and initiator authentication
    */
  var secretRef: js.UndefOr[Input[SecretReference]] = js.undefined
  
  /**
    * iSCSI Target Portal. The Portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).
    */
  var targetPortal: Input[String]
}
object ISCSIPersistentVolumeSource {
  
  @scala.inline
  def apply(iqn: Input[String], lun: Input[Double], targetPortal: Input[String]): ISCSIPersistentVolumeSource = {
    val __obj = js.Dynamic.literal(iqn = iqn.asInstanceOf[js.Any], lun = lun.asInstanceOf[js.Any], targetPortal = targetPortal.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISCSIPersistentVolumeSource]
  }
  
  @scala.inline
  implicit class ISCSIPersistentVolumeSourceMutableBuilder[Self <: ISCSIPersistentVolumeSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChapAuthDiscovery(value: Input[Boolean]): Self = StObject.set(x, "chapAuthDiscovery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChapAuthDiscoveryUndefined: Self = StObject.set(x, "chapAuthDiscovery", js.undefined)
    
    @scala.inline
    def setChapAuthSession(value: Input[Boolean]): Self = StObject.set(x, "chapAuthSession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChapAuthSessionUndefined: Self = StObject.set(x, "chapAuthSession", js.undefined)
    
    @scala.inline
    def setFsType(value: Input[String]): Self = StObject.set(x, "fsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFsTypeUndefined: Self = StObject.set(x, "fsType", js.undefined)
    
    @scala.inline
    def setInitiatorName(value: Input[String]): Self = StObject.set(x, "initiatorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitiatorNameUndefined: Self = StObject.set(x, "initiatorName", js.undefined)
    
    @scala.inline
    def setIqn(value: Input[String]): Self = StObject.set(x, "iqn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIscsiInterface(value: Input[String]): Self = StObject.set(x, "iscsiInterface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIscsiInterfaceUndefined: Self = StObject.set(x, "iscsiInterface", js.undefined)
    
    @scala.inline
    def setLun(value: Input[Double]): Self = StObject.set(x, "lun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortals(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "portals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalsUndefined: Self = StObject.set(x, "portals", js.undefined)
    
    @scala.inline
    def setPortalsVarargs(value: Input[String]*): Self = StObject.set(x, "portals", js.Array(value :_*))
    
    @scala.inline
    def setReadOnly(value: Input[Boolean]): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    @scala.inline
    def setSecretRef(value: Input[SecretReference]): Self = StObject.set(x, "secretRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretRefUndefined: Self = StObject.set(x, "secretRef", js.undefined)
    
    @scala.inline
    def setTargetPortal(value: Input[String]): Self = StObject.set(x, "targetPortal", value.asInstanceOf[js.Any])
  }
}
