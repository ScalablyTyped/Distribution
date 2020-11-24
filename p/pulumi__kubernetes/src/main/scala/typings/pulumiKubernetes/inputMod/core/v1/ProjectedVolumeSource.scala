package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a projected volume source
  */
@js.native
trait ProjectedVolumeSource extends js.Object {
  
  /**
    * Mode bits used to set permissions on created files by default. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
    */
  var defaultMode: js.UndefOr[Input[Double]] = js.native
  
  /**
    * list of volume projections
    */
  var sources: Input[js.Array[Input[VolumeProjection]]] = js.native
}
object ProjectedVolumeSource {
  
  @scala.inline
  def apply(sources: Input[js.Array[Input[VolumeProjection]]]): ProjectedVolumeSource = {
    val __obj = js.Dynamic.literal(sources = sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectedVolumeSource]
  }
  
  @scala.inline
  implicit class ProjectedVolumeSourceOps[Self <: ProjectedVolumeSource] (val x: Self) extends AnyVal {
    
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
    def setSourcesVarargs(value: Input[VolumeProjection]*): Self = this.set("sources", js.Array(value :_*))
    
    @scala.inline
    def setSources(value: Input[js.Array[Input[VolumeProjection]]]): Self = this.set("sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultMode(value: Input[Double]): Self = this.set("defaultMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultMode: Self = this.set("defaultMode", js.undefined)
  }
}
