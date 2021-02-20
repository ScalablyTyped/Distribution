package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
  */
@js.native
trait AzureDiskVolumeSource extends StObject {
  
  /**
    * Host Caching mode: None, Read Only, Read Write.
    */
  var cachingMode: js.UndefOr[Input[String]] = js.native
  
  /**
    * The Name of the data disk in the blob storage
    */
  var diskName: Input[String] = js.native
  
  /**
    * The URI the data disk in the blob storage
    */
  var diskURI: Input[String] = js.native
  
  /**
    * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
    */
  var fsType: js.UndefOr[Input[String]] = js.native
  
  /**
    * Expected values Shared: multiple blob disks per storage account  Dedicated: single blob disk per storage account  Managed: azure managed data disk (only in managed availability set). defaults to shared
    */
  var kind: js.UndefOr[Input[String]] = js.native
  
  /**
    * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.native
}
object AzureDiskVolumeSource {
  
  @scala.inline
  def apply(diskName: Input[String], diskURI: Input[String]): AzureDiskVolumeSource = {
    val __obj = js.Dynamic.literal(diskName = diskName.asInstanceOf[js.Any], diskURI = diskURI.asInstanceOf[js.Any])
    __obj.asInstanceOf[AzureDiskVolumeSource]
  }
  
  @scala.inline
  implicit class AzureDiskVolumeSourceMutableBuilder[Self <: AzureDiskVolumeSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCachingMode(value: Input[String]): Self = StObject.set(x, "cachingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCachingModeUndefined: Self = StObject.set(x, "cachingMode", js.undefined)
    
    @scala.inline
    def setDiskName(value: Input[String]): Self = StObject.set(x, "diskName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskURI(value: Input[String]): Self = StObject.set(x, "diskURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFsType(value: Input[String]): Self = StObject.set(x, "fsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFsTypeUndefined: Self = StObject.set(x, "fsType", js.undefined)
    
    @scala.inline
    def setKind(value: Input[String]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Input[Boolean]): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
  }
}
