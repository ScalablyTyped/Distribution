package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlobPropertyBag extends js.Object {
  
  var endings: js.UndefOr[EndingType] = js.native
  
  var `type`: js.UndefOr[java.lang.String] = js.native
}
object BlobPropertyBag {
  
  @scala.inline
  def apply(): BlobPropertyBag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlobPropertyBag]
  }
  
  @scala.inline
  implicit class BlobPropertyBagOps[Self <: BlobPropertyBag] (val x: Self) extends AnyVal {
    
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
    def setEndings(value: EndingType): Self = this.set("endings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndings: Self = this.set("endings", js.undefined)
    
    @scala.inline
    def setType(value: java.lang.String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
