package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DownwardAPIVolumeSource represents a volume containing downward API info. Downward API volumes support ownership management and SELinux relabeling.
  */
@js.native
trait DownwardAPIVolumeSource extends StObject {
  
  /**
    * Optional: mode bits to use on created files by default. Must be a Optional: mode bits used to set permissions on created files by default. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
    */
  var defaultMode: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Items is a list of downward API volume file
    */
  var items: js.UndefOr[Input[js.Array[Input[DownwardAPIVolumeFile]]]] = js.native
}
object DownwardAPIVolumeSource {
  
  @scala.inline
  def apply(): DownwardAPIVolumeSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownwardAPIVolumeSource]
  }
  
  @scala.inline
  implicit class DownwardAPIVolumeSourceMutableBuilder[Self <: DownwardAPIVolumeSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultMode(value: Input[Double]): Self = StObject.set(x, "defaultMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultModeUndefined: Self = StObject.set(x, "defaultMode", js.undefined)
    
    @scala.inline
    def setItems(value: Input[js.Array[Input[DownwardAPIVolumeFile]]]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: Input[DownwardAPIVolumeFile]*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
