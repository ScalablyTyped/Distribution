package typings.reactCssModules.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Extend your component's Prop interface with this one to get access to `this.props.styles`
//
// interface MyComponentProps extends CSSModules.InjectedCSSModuleProps {}
trait InjectedCSSModuleProps extends js.Object {
  var styles: js.UndefOr[StylesObject] = js.undefined
}

object InjectedCSSModuleProps {
  @scala.inline
  def apply(styles: StylesObject = null): InjectedCSSModuleProps = {
    val __obj = js.Dynamic.literal()
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[InjectedCSSModuleProps]
  }
}

