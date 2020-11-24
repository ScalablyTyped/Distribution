package typings.reactTextMask.mod

import typings.reactTextMask.anon.SomeCharsRejected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait conformToMaskResult extends js.Object {
  
  var conformedValue: String = js.native
  
  var meta: SomeCharsRejected = js.native
}
object conformToMaskResult {
  
  @scala.inline
  def apply(conformedValue: String, meta: SomeCharsRejected): conformToMaskResult = {
    val __obj = js.Dynamic.literal(conformedValue = conformedValue.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[conformToMaskResult]
  }
  
  @scala.inline
  implicit class conformToMaskResultOps[Self <: conformToMaskResult] (val x: Self) extends AnyVal {
    
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
    def setConformedValue(value: String): Self = this.set("conformedValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeta(value: SomeCharsRejected): Self = this.set("meta", value.asInstanceOf[js.Any])
  }
}
