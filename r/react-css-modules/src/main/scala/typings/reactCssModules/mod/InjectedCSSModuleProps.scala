package typings.reactCssModules.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Extend your component's Prop interface with this one to get access to `this.props.styles`
//
// interface MyComponentProps extends CSSModules.InjectedCSSModuleProps {}
@js.native
trait InjectedCSSModuleProps extends js.Object {
  var styles: js.UndefOr[StylesObject] = js.native
}

object InjectedCSSModuleProps {
  @scala.inline
  def apply(): InjectedCSSModuleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InjectedCSSModuleProps]
  }
  @scala.inline
  implicit class InjectedCSSModulePropsOps[Self <: InjectedCSSModuleProps] (val x: Self) extends AnyVal {
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
    def setStyles(value: StylesObject): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
  
}

