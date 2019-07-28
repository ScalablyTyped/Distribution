package typings.reactDashPlacesDashAutocomplete.reactDashPlacesDashAutocompleteMod

import typings.react.reactMod.ReactNode
import typings.reactDashPlacesDashAutocomplete.Anon_Bounds
import typings.reactDashPlacesDashAutocomplete.Anon_GetInputProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropTypes extends js.Object {
  var debounce: js.UndefOr[Double] = js.undefined
  var googleCallbackName: js.UndefOr[String] = js.undefined
  var highlightFirstSuggestion: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
  var onError: js.UndefOr[
    js.Function2[/* status */ String, /* clearSuggestion */ js.Function0[Unit], Unit]
  ] = js.undefined
  var onSelect: js.UndefOr[js.Function2[/* address */ String, /* placeID */ String, Unit]] = js.undefined
  var searchOptions: js.UndefOr[Anon_Bounds] = js.undefined
  var shouldFetchSuggestions: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[String] = js.undefined
  def children(opts: Anon_GetInputProps): ReactNode
}

object PropTypes {
  @scala.inline
  def apply(
    children: Anon_GetInputProps => ReactNode,
    debounce: Int | Double = null,
    googleCallbackName: String = null,
    highlightFirstSuggestion: js.UndefOr[Boolean] = js.undefined,
    onChange: /* value */ String => Unit = null,
    onError: (/* status */ String, /* clearSuggestion */ js.Function0[Unit]) => Unit = null,
    onSelect: (/* address */ String, /* placeID */ String) => Unit = null,
    searchOptions: Anon_Bounds = null,
    shouldFetchSuggestions: js.UndefOr[Boolean] = js.undefined,
    value: String = null
  ): PropTypes = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    if (debounce != null) __obj.updateDynamic("debounce")(debounce.asInstanceOf[js.Any])
    if (googleCallbackName != null) __obj.updateDynamic("googleCallbackName")(googleCallbackName)
    if (!js.isUndefined(highlightFirstSuggestion)) __obj.updateDynamic("highlightFirstSuggestion")(highlightFirstSuggestion)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction2(onError))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2(onSelect))
    if (searchOptions != null) __obj.updateDynamic("searchOptions")(searchOptions)
    if (!js.isUndefined(shouldFetchSuggestions)) __obj.updateDynamic("shouldFetchSuggestions")(shouldFetchSuggestions)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[PropTypes]
  }
}

