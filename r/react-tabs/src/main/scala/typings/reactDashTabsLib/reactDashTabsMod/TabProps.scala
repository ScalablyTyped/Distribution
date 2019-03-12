package typings
package reactDashTabsLib.reactDashTabsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLProps<std.HTMLLIElement>, 'className' | 'tabIndex'> ]: react.react.HTMLProps<std.HTMLLIElement>[P]} */ trait TabProps extends js.Object {
  var className: js.UndefOr[
    java.lang.String | js.Array[java.lang.String] | org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  ] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var disabledClassName: js.UndefOr[java.lang.String] = js.undefined
  var selectedClassName: js.UndefOr[java.lang.String] = js.undefined
  var tabIndex: js.UndefOr[java.lang.String] = js.undefined
}

object TabProps {
  @scala.inline
  def apply(
    className: java.lang.String | js.Array[java.lang.String] | org.scalablytyped.runtime.StringDictionary[scala.Boolean] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    disabledClassName: java.lang.String = null,
    selectedClassName: java.lang.String = null,
    tabIndex: java.lang.String = null
  ): TabProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (disabledClassName != null) __obj.updateDynamic("disabledClassName")(disabledClassName)
    if (selectedClassName != null) __obj.updateDynamic("selectedClassName")(selectedClassName)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex)
    __obj.asInstanceOf[TabProps]
  }
}

