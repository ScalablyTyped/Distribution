package typings.reactTabs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLProps<std.HTMLLIElement>, 'className' | 'tabIndex'> ]: react.react.HTMLProps<std.HTMLLIElement>[P]} */ trait TabProps extends js.Object {
  var className: js.UndefOr[String | js.Array[String] | StringDictionary[Boolean]] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var disabledClassName: js.UndefOr[String] = js.undefined
  var selectedClassName: js.UndefOr[String] = js.undefined
  var tabIndex: js.UndefOr[String] = js.undefined
}

object TabProps {
  @scala.inline
  def apply(
    className: String | js.Array[String] | StringDictionary[Boolean] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    disabledClassName: String = null,
    selectedClassName: String = null,
    tabIndex: String = null
  ): TabProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (disabledClassName != null) __obj.updateDynamic("disabledClassName")(disabledClassName.asInstanceOf[js.Any])
    if (selectedClassName != null) __obj.updateDynamic("selectedClassName")(selectedClassName.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabProps]
  }
}

