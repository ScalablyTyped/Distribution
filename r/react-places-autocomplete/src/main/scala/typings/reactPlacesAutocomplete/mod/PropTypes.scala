package typings.reactPlacesAutocomplete.mod

import typings.react.mod.ReactNode
import typings.reactPlacesAutocomplete.AnonBounds
import typings.reactPlacesAutocomplete.AnonGetInputProps
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
  var searchOptions: js.UndefOr[AnonBounds] = js.undefined
  var shouldFetchSuggestions: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[String] = js.undefined
  def children(opts: AnonGetInputProps): ReactNode
}

object PropTypes {
  @scala.inline
  def apply(
    children: AnonGetInputProps => ReactNode,
    debounce: Int | Double = null,
    googleCallbackName: String = null,
    highlightFirstSuggestion: js.UndefOr[Boolean] = js.undefined,
    onChange: /* value */ String => Unit = null,
    onError: (/* status */ String, /* clearSuggestion */ js.Function0[Unit]) => Unit = null,
    onSelect: (/* address */ String, /* placeID */ String) => Unit = null,
    searchOptions: AnonBounds = null,
    shouldFetchSuggestions: js.UndefOr[Boolean] = js.undefined,
    value: String = null
  ): PropTypes = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    if (debounce != null) __obj.updateDynamic("debounce")(debounce.asInstanceOf[js.Any])
    if (googleCallbackName != null) __obj.updateDynamic("googleCallbackName")(googleCallbackName.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightFirstSuggestion)) __obj.updateDynamic("highlightFirstSuggestion")(highlightFirstSuggestion.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction2(onError))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2(onSelect))
    if (searchOptions != null) __obj.updateDynamic("searchOptions")(searchOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldFetchSuggestions)) __obj.updateDynamic("shouldFetchSuggestions")(shouldFetchSuggestions.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropTypes]
  }
}

