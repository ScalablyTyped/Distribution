package typings.rbx.anon

import typings.react.mod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsTDefaultComponent[TDefaultComponent /* <: ReactType[_] */] extends js.Object {
  
  var as: TDefaultComponent = js.native
}
object AsTDefaultComponent {
  
  @scala.inline
  def apply[TDefaultComponent /* <: ReactType[_] */](as: TDefaultComponent): AsTDefaultComponent[TDefaultComponent] = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsTDefaultComponent[TDefaultComponent]]
  }
  
  @scala.inline
  implicit class AsTDefaultComponentOps[Self <: AsTDefaultComponent[_], TDefaultComponent /* <: ReactType[_] */] (val x: Self with AsTDefaultComponent[TDefaultComponent]) extends AnyVal {
    
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
    def setAs(value: TDefaultComponent): Self = this.set("as", value.asInstanceOf[js.Any])
  }
}
