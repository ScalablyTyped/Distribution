package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConstrainVideoFacingModeParameters extends js.Object {
  
  var exact: js.UndefOr[VideoFacingModeEnum | js.Array[VideoFacingModeEnum]] = js.native
  
  var ideal: js.UndefOr[VideoFacingModeEnum | js.Array[VideoFacingModeEnum]] = js.native
}
object ConstrainVideoFacingModeParameters {
  
  @scala.inline
  def apply(): ConstrainVideoFacingModeParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstrainVideoFacingModeParameters]
  }
  
  @scala.inline
  implicit class ConstrainVideoFacingModeParametersOps[Self <: ConstrainVideoFacingModeParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExactVarargs(value: VideoFacingModeEnum*): Self = this.set("exact", js.Array(value :_*))
    
    @scala.inline
    def setExact(value: VideoFacingModeEnum | js.Array[VideoFacingModeEnum]): Self = this.set("exact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExact: Self = this.set("exact", js.undefined)
    
    @scala.inline
    def setIdealVarargs(value: VideoFacingModeEnum*): Self = this.set("ideal", js.Array(value :_*))
    
    @scala.inline
    def setIdeal(value: VideoFacingModeEnum | js.Array[VideoFacingModeEnum]): Self = this.set("ideal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdeal: Self = this.set("ideal", js.undefined)
  }
}
