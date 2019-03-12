package typings
package reactDashTabsLib.reactDashTabsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLProps<std.HTMLDivElement>, 'className'> ]: react.react.HTMLProps<std.HTMLDivElement>[P]} */ trait TabPanelProps extends js.Object {
  var className: js.UndefOr[
    java.lang.String | js.Array[java.lang.String] | org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  ] = js.undefined
  var forceRender: js.UndefOr[scala.Boolean] = js.undefined
  var selectedClassName: js.UndefOr[java.lang.String] = js.undefined
}

object TabPanelProps {
  @scala.inline
  def apply(
    className: java.lang.String | js.Array[java.lang.String] | org.scalablytyped.runtime.StringDictionary[scala.Boolean] = null,
    forceRender: js.UndefOr[scala.Boolean] = js.undefined,
    selectedClassName: java.lang.String = null
  ): TabPanelProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(forceRender)) __obj.updateDynamic("forceRender")(forceRender)
    if (selectedClassName != null) __obj.updateDynamic("selectedClassName")(selectedClassName)
    __obj.asInstanceOf[TabPanelProps]
  }
}

