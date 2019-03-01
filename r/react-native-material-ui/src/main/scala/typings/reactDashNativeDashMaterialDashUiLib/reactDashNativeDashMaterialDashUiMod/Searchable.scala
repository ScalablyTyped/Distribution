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
    onChangeText: js.Function1[/* text */ java.lang.String, scala.Unit] = null,
    onSearchCloseRequested: js.Function0[scala.Unit] = null,
    onSearchClosed: js.Function0[scala.Unit] = null,
    onSearchPressed: js.Function0[scala.Unit] = null,
    onSubmitEditing: js.Function0[scala.Unit] = null,
    placeholder: java.lang.String = null
  ): Searchable = {
    val __obj = js.Dynamic.literal()
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
    if (!js.isUndefined(autoCorrect)) __obj.updateDynamic("autoCorrect")(autoCorrect)
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (onChangeText != null) __obj.updateDynamic("onChangeText")(onChangeText)
    if (onSearchCloseRequested != null) __obj.updateDynamic("onSearchCloseRequested")(onSearchCloseRequested)
    if (onSearchClosed != null) __obj.updateDynamic("onSearchClosed")(onSearchClosed)
    if (onSearchPressed != null) __obj.updateDynamic("onSearchPressed")(onSearchPressed)
    if (onSubmitEditing != null) __obj.updateDynamic("onSubmitEditing")(onSubmitEditing)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    __obj.asInstanceOf[Searchable]
  }
}

