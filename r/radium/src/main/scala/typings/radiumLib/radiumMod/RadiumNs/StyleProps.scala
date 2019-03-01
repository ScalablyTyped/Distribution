package typings
package radiumLib.radiumMod.RadiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleProps extends js.Object {
  /**
    * An object of styles, or an object of CSS rules to render. Each key of the rules object is a CSS
    * selector and the value is an object of styles. If rules is empty, the component will render nothing.
    */
  var rules: reactLib.reactMod.ReactNs.CSSProperties | StyleRules
  /**
    * A string that any included selectors in rules will be appended to.
    * Use to scope styles in the component to a particular element. A good use case might be to generate a unique
    * ID for a component to scope any styles to the particular component that owns the <Style> component instance.
    */
  var scopeSelector: js.UndefOr[java.lang.String] = js.undefined
}

object StyleProps {
  @scala.inline
  def apply(
    rules: reactLib.reactMod.ReactNs.CSSProperties | StyleRules,
    scopeSelector: java.lang.String = null
  ): StyleProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    if (scopeSelector != null) __obj.updateDynamic("scopeSelector")(scopeSelector)
    __obj.asInstanceOf[StyleProps]
  }
}

