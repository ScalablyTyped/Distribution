package typings.reactThemeableTs.hocMod

import typings.reactThemeableTs.themeableMod.IStaticFnReturn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHOCDefaultProps extends IHOCDefaultNoThemeProps {
  
  var theme: js.UndefOr[js.Any] = js.native
}
object IHOCDefaultProps {
  
  @scala.inline
  def apply(t: IStaticFnReturn): IHOCDefaultProps = {
    val __obj = js.Dynamic.literal(t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHOCDefaultProps]
  }
  
  @scala.inline
  implicit class IHOCDefaultPropsOps[Self <: IHOCDefaultProps] (val x: Self) extends AnyVal {
    
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
    def setTheme(value: js.Any): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
}
