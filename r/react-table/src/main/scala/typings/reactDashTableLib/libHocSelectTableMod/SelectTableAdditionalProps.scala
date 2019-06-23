package typings
package reactDashTableLib.libHocSelectTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectTableAdditionalProps extends js.Object {
  var SelectAllInputComponent: js.UndefOr[reactLib.reactMod.ComponentType[SelectAllInputComponentProps]] = js.undefined
  var SelectInputComponent: js.UndefOr[reactLib.reactMod.ComponentType[SelectInputComponentProps]] = js.undefined
  var isSelected: js.UndefOr[js.Function1[/* key */ java.lang.String, scala.Boolean]] = js.undefined
  /**
    * Default: _id
    */
  var keyField: js.UndefOr[java.lang.String] = js.undefined
  var selectAll: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default: checkbox
    */
  var selectType: js.UndefOr[SelectType] = js.undefined
  var selectWidth: js.UndefOr[scala.Double] = js.undefined
  var toggleAll: js.UndefOr[js.Function0[_]] = js.undefined
  var toggleSelection: js.UndefOr[
    js.Function3[/* key */ java.lang.String, /* shiftKeyPressed */ scala.Boolean, /* row */ js.Any, _]
  ] = js.undefined
}

object SelectTableAdditionalProps {
  @scala.inline
  def apply(
    SelectAllInputComponent: reactLib.reactMod.ComponentType[SelectAllInputComponentProps] = null,
    SelectInputComponent: reactLib.reactMod.ComponentType[SelectInputComponentProps] = null,
    isSelected: /* key */ java.lang.String => scala.Boolean = null,
    keyField: java.lang.String = null,
    selectAll: js.UndefOr[scala.Boolean] = js.undefined,
    selectType: SelectType = null,
    selectWidth: scala.Int | scala.Double = null,
    toggleAll: () => _ = null,
    toggleSelection: (/* key */ java.lang.String, /* shiftKeyPressed */ scala.Boolean, /* row */ js.Any) => _ = null
  ): SelectTableAdditionalProps = {
    val __obj = js.Dynamic.literal()
    if (SelectAllInputComponent != null) __obj.updateDynamic("SelectAllInputComponent")(SelectAllInputComponent.asInstanceOf[js.Any])
    if (SelectInputComponent != null) __obj.updateDynamic("SelectInputComponent")(SelectInputComponent.asInstanceOf[js.Any])
    if (isSelected != null) __obj.updateDynamic("isSelected")(js.Any.fromFunction1(isSelected))
    if (keyField != null) __obj.updateDynamic("keyField")(keyField)
    if (!js.isUndefined(selectAll)) __obj.updateDynamic("selectAll")(selectAll)
    if (selectType != null) __obj.updateDynamic("selectType")(selectType)
    if (selectWidth != null) __obj.updateDynamic("selectWidth")(selectWidth.asInstanceOf[js.Any])
    if (toggleAll != null) __obj.updateDynamic("toggleAll")(js.Any.fromFunction0(toggleAll))
    if (toggleSelection != null) __obj.updateDynamic("toggleSelection")(js.Any.fromFunction3(toggleSelection))
    __obj.asInstanceOf[SelectTableAdditionalProps]
  }
}

