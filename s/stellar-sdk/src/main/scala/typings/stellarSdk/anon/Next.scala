package typings.stellarSdk.anon

import typings.stellarSdk.horizonApiMod.Horizon.ResponseLink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Next extends js.Object {
  
  var next: ResponseLink = js.native
  
  var prev: ResponseLink = js.native
  
  var self: ResponseLink = js.native
}
object Next {
  
  @scala.inline
  def apply(next: ResponseLink, prev: ResponseLink, self: ResponseLink): Next = {
    val __obj = js.Dynamic.literal(next = next.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any])
    __obj.asInstanceOf[Next]
  }
  
  @scala.inline
  implicit class NextOps[Self <: Next] (val x: Self) extends AnyVal {
    
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
    def setNext(value: ResponseLink): Self = this.set("next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrev(value: ResponseLink): Self = this.set("prev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelf(value: ResponseLink): Self = this.set("self", value.asInstanceOf[js.Any])
  }
}
