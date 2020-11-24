package typings.reactThemeableTs.themeProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IThemeProviderContext extends js.Object {
  
  var reactThemeable: js.Any = js.native
}
object IThemeProviderContext {
  
  @scala.inline
  def apply(reactThemeable: js.Any): IThemeProviderContext = {
    val __obj = js.Dynamic.literal(reactThemeable = reactThemeable.asInstanceOf[js.Any])
    __obj.asInstanceOf[IThemeProviderContext]
  }
  
  @scala.inline
  implicit class IThemeProviderContextOps[Self <: IThemeProviderContext] (val x: Self) extends AnyVal {
    
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
    def setReactThemeable(value: js.Any): Self = this.set("reactThemeable", value.asInstanceOf[js.Any])
  }
}
