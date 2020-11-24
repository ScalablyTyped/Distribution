package typings.reactNavigationCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanPreventDefault extends js.Object {
  
  var canPreventDefault: js.UndefOr[Boolean] = js.native
  
  var data: js.UndefOr[js.Any] = js.native
}
object CanPreventDefault {
  
  @scala.inline
  def apply(): CanPreventDefault = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanPreventDefault]
  }
  
  @scala.inline
  implicit class CanPreventDefaultOps[Self <: CanPreventDefault] (val x: Self) extends AnyVal {
    
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
    def setCanPreventDefault(value: Boolean): Self = this.set("canPreventDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanPreventDefault: Self = this.set("canPreventDefault", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
  }
}
