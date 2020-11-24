package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextEncoderEncodeIntoResult extends js.Object {
  
  var read: js.UndefOr[Double] = js.native
  
  var written: js.UndefOr[Double] = js.native
}
object TextEncoderEncodeIntoResult {
  
  @scala.inline
  def apply(): TextEncoderEncodeIntoResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextEncoderEncodeIntoResult]
  }
  
  @scala.inline
  implicit class TextEncoderEncodeIntoResultOps[Self <: TextEncoderEncodeIntoResult] (val x: Self) extends AnyVal {
    
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
    def setRead(value: Double): Self = this.set("read", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRead: Self = this.set("read", js.undefined)
    
    @scala.inline
    def setWritten(value: Double): Self = this.set("written", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWritten: Self = this.set("written", js.undefined)
  }
}
