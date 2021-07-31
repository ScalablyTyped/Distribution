package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a projected volume source
  */
trait ProjectedVolumeSource extends StObject {
  
  /**
    * Mode bits used to set permissions on created files by default. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
    */
  var defaultMode: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * list of volume projections
    */
  var sources: Input[js.Array[Input[VolumeProjection]]]
}
object ProjectedVolumeSource {
  
  @scala.inline
  def apply(sources: Input[js.Array[Input[VolumeProjection]]]): ProjectedVolumeSource = {
    val __obj = js.Dynamic.literal(sources = sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectedVolumeSource]
  }
  
  @scala.inline
  implicit class ProjectedVolumeSourceMutableBuilder[Self <: ProjectedVolumeSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultMode(value: Input[Double]): Self = StObject.set(x, "defaultMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultModeUndefined: Self = StObject.set(x, "defaultMode", js.undefined)
    
    @scala.inline
    def setSources(value: Input[js.Array[Input[VolumeProjection]]]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesVarargs(value: Input[VolumeProjection]*): Self = StObject.set(x, "sources", js.Array(value :_*))
  }
}
