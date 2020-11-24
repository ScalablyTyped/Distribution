package typings.reactMdAppBar.useInheritContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppBarColorInherit extends js.Object {
  
  /**
    * Boolean if this component should inherit the base color provided by the
    * `AppBar`.  When this value is omitted, this will be enabled when the theme
    * is not `"clear"` and not `"default"`
    */
  var inheritColor: js.UndefOr[Boolean] = js.native
}
object AppBarColorInherit {
  
  @scala.inline
  def apply(): AppBarColorInherit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppBarColorInherit]
  }
  
  @scala.inline
  implicit class AppBarColorInheritOps[Self <: AppBarColorInherit] (val x: Self) extends AnyVal {
    
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
    def setInheritColor(value: Boolean): Self = this.set("inheritColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInheritColor: Self = this.set("inheritColor", js.undefined)
  }
}
