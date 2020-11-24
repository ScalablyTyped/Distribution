package typings.reduxUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pure extends js.Object {
  
  var pure: js.UndefOr[Boolean] = js.native
  
  var withRef: js.UndefOr[Boolean] = js.native
}
object Pure {
  
  @scala.inline
  def apply(): Pure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pure]
  }
  
  @scala.inline
  implicit class PureOps[Self <: Pure] (val x: Self) extends AnyVal {
    
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
    def setPure(value: Boolean): Self = this.set("pure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePure: Self = this.set("pure", js.undefined)
    
    @scala.inline
    def setWithRef(value: Boolean): Self = this.set("withRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithRef: Self = this.set("withRef", js.undefined)
  }
}
