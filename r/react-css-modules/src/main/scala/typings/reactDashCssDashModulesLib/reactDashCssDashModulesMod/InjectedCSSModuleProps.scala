package typings
package reactDashCssDashModulesLib.reactDashCssDashModulesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Extend your component's Prop interface with this one to get access to `this.props.styles`
//
// interface MyComponentProps extends CSSModules.InjectedCSSModuleProps {}
trait InjectedCSSModuleProps extends js.Object {
  var styles: js.UndefOr[reactDashCssDashModulesLib.StylesObject] = js.undefined
}

object InjectedCSSModuleProps {
  @scala.inline
  def apply(styles: reactDashCssDashModulesLib.StylesObject = null): InjectedCSSModuleProps = {
    val __obj = js.Dynamic.literal()
    if (styles != null) __obj.updateDynamic("styles")(styles)
    __obj.asInstanceOf[InjectedCSSModuleProps]
  }
}

