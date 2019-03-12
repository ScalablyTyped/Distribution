package typings
package reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Searchable extends js.Object {
  var autoCapitalize: js.UndefOr[
    reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiLibStrings.none | reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiLibStrings.sentences | reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiLibStrings.words | reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiLibStrings.characters
  ] = js.undefined
  var autoCorrect: js.UndefOr[scala.Boolean] = js.undefined
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  var onChangeText: js.UndefOr[js.Function1[/* text */ java.lang.String, scala.Unit]] = js.undefined
  var onSearchCloseRequested: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onSearchClosed: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onSearchPressed: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onSubmitEditing: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
}

object Searchable {
  @scala.inline
  def apply(
    autoCapitalize: reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiLibStrings.none | reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiLibStrings.sentences | reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiLibStrings.words | reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiLibStrings.characters = null,
    autoCorrect: js.UndefOr[scala.Boolean] = js.undefined,
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    onChangeText: /* text */ java.lang.String => scala.Unit = null,
    onSearchCloseRequested: () => scala.Unit = null,
    onSearchClosed: () => scala.Unit = null,
    onSearchPressed: () => scala.Unit = null,
    onSubmitEditing: () => scala.Unit = null,
    placeholder: java.lang.String = null
  ): Searchable = {
    val __obj = js.Dynamic.literal()
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
    if (!js.isUndefined(autoCorrect)) __obj.updateDynamic("autoCorrect")(autoCorrect)
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (onChangeText != null) __obj.updateDynamic("onChangeText")(js.Any.fromFunction1(onChangeText))
    if (onSearchCloseRequested != null) __obj.updateDynamic("onSearchCloseRequested")(js.Any.fromFunction0(onSearchCloseRequested))
    if (onSearchClosed != null) __obj.updateDynamic("onSearchClosed")(js.Any.fromFunction0(onSearchClosed))
    if (onSearchPressed != null) __obj.updateDynamic("onSearchPressed")(js.Any.fromFunction0(onSearchPressed))
    if (onSubmitEditing != null) __obj.updateDynamic("onSubmitEditing")(js.Any.fromFunction0(onSubmitEditing))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    __obj.asInstanceOf[Searchable]
  }
}

