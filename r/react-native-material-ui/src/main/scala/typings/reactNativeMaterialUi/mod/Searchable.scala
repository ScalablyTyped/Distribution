package typings.reactNativeMaterialUi.mod

import typings.reactNativeMaterialUi.reactNativeMaterialUiStrings.characters
import typings.reactNativeMaterialUi.reactNativeMaterialUiStrings.none
import typings.reactNativeMaterialUi.reactNativeMaterialUiStrings.sentences
import typings.reactNativeMaterialUi.reactNativeMaterialUiStrings.words
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Searchable extends js.Object {
  var autoCapitalize: js.UndefOr[none | sentences | words | characters] = js.undefined
  var autoCorrect: js.UndefOr[Boolean] = js.undefined
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var onChangeText: js.UndefOr[js.Function1[/* text */ String, Unit]] = js.undefined
  var onSearchCloseRequested: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSearchClosed: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSearchPressed: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSubmitEditing: js.UndefOr[js.Function0[Unit]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
}

object Searchable {
  @scala.inline
  def apply(
    autoCapitalize: none | sentences | words | characters = null,
    autoCorrect: js.UndefOr[Boolean] = js.undefined,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    onChangeText: /* text */ String => Unit = null,
    onSearchCloseRequested: () => Unit = null,
    onSearchClosed: () => Unit = null,
    onSearchPressed: () => Unit = null,
    onSubmitEditing: () => Unit = null,
    placeholder: String = null
  ): Searchable = {
    val __obj = js.Dynamic.literal()
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
    if (!js.isUndefined(autoCorrect)) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (onChangeText != null) __obj.updateDynamic("onChangeText")(js.Any.fromFunction1(onChangeText))
    if (onSearchCloseRequested != null) __obj.updateDynamic("onSearchCloseRequested")(js.Any.fromFunction0(onSearchCloseRequested))
    if (onSearchClosed != null) __obj.updateDynamic("onSearchClosed")(js.Any.fromFunction0(onSearchClosed))
    if (onSearchPressed != null) __obj.updateDynamic("onSearchPressed")(js.Any.fromFunction0(onSearchPressed))
    if (onSubmitEditing != null) __obj.updateDynamic("onSubmitEditing")(js.Any.fromFunction0(onSubmitEditing))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[Searchable]
  }
}

