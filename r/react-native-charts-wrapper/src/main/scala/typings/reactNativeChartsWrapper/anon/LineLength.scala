package typings.reactNativeChartsWrapper.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineLength extends js.Object {
  
  var lineLength: js.UndefOr[Double] = js.native
  
  var phase: js.UndefOr[Double] = js.native
  
  var spaceLength: js.UndefOr[Double] = js.native
}
object LineLength {
  
  @scala.inline
  def apply(): LineLength = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineLength]
  }
  
  @scala.inline
  implicit class LineLengthOps[Self <: LineLength] (val x: Self) extends AnyVal {
    
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
    def setLineLength(value: Double): Self = this.set("lineLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineLength: Self = this.set("lineLength", js.undefined)
    
    @scala.inline
    def setPhase(value: Double): Self = this.set("phase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhase: Self = this.set("phase", js.undefined)
    
    @scala.inline
    def setSpaceLength(value: Double): Self = this.set("spaceLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpaceLength: Self = this.set("spaceLength", js.undefined)
  }
}
