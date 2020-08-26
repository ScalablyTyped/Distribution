package typings.reactThemeableTs.themeProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IThemeProviderProps extends js.Object {
  var children: js.UndefOr[js.Any] = js.native
  var reactThemeable: js.Any = js.native
}

object IThemeProviderProps {
  @scala.inline
  def apply(reactThemeable: js.Any): IThemeProviderProps = {
    val __obj = js.Dynamic.literal(reactThemeable = reactThemeable.asInstanceOf[js.Any])
    __obj.asInstanceOf[IThemeProviderProps]
  }
  @scala.inline
  implicit class IThemeProviderPropsOps[Self <: IThemeProviderProps] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setChildren(value: js.Any): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
  }
  
}

