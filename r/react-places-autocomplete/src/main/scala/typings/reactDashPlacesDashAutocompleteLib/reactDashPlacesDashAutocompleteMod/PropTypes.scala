package typings
package reactDashPlacesDashAutocompleteLib.reactDashPlacesDashAutocompleteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropTypes extends js.Object {
  var debounce: js.UndefOr[scala.Double] = js.undefined
  var googleCallbackName: js.UndefOr[java.lang.String] = js.undefined
  var highlightFirstSuggestion: js.UndefOr[scala.Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ java.lang.String, scala.Unit]] = js.undefined
  var onError: js.UndefOr[
    js.Function2[
      /* status */ java.lang.String, 
      /* clearSuggestion */ js.Function0[scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  var onSelect: js.UndefOr[
    js.Function2[/* address */ java.lang.String, /* placeID */ java.lang.String, scala.Unit]
  ] = js.undefined
  var searchOptions: js.UndefOr[reactDashPlacesDashAutocompleteLib.Anon_Bounds] = js.undefined
  var shouldFetchSuggestions: js.UndefOr[scala.Boolean] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
  def children(opts: stdLib.Readonly[reactDashPlacesDashAutocompleteLib.Anon_GetInputProps]): reactLib.reactMod.ReactNs.ReactNode
}

object PropTypes {
  @scala.inline
  def apply(
    children: js.Function1[
      stdLib.Readonly[reactDashPlacesDashAutocompleteLib.Anon_GetInputProps], 
      reactLib.reactMod.ReactNs.ReactNode
    ],
    debounce: scala.Int | scala.Double = null,
    googleCallbackName: java.lang.String = null,
    highlightFirstSuggestion: js.UndefOr[scala.Boolean] = js.undefined,
    onChange: js.Function1[/* value */ java.lang.String, scala.Unit] = null,
    onError: js.Function2[
      /* status */ java.lang.String, 
      /* clearSuggestion */ js.Function0[scala.Unit], 
      scala.Unit
    ] = null,
    onSelect: js.Function2[/* address */ java.lang.String, /* placeID */ java.lang.String, scala.Unit] = null,
    searchOptions: reactDashPlacesDashAutocompleteLib.Anon_Bounds = null,
    shouldFetchSuggestions: js.UndefOr[scala.Boolean] = js.undefined,
    value: java.lang.String = null
  ): PropTypes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(children)
    if (debounce != null) __obj.updateDynamic("debounce")(debounce.asInstanceOf[js.Any])
    if (googleCallbackName != null) __obj.updateDynamic("googleCallbackName")(googleCallbackName)
    if (!js.isUndefined(highlightFirstSuggestion)) __obj.updateDynamic("highlightFirstSuggestion")(highlightFirstSuggestion)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onError != null) __obj.updateDynamic("onError")(onError)
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect)
    if (searchOptions != null) __obj.updateDynamic("searchOptions")(searchOptions)
    if (!js.isUndefined(shouldFetchSuggestions)) __obj.updateDynamic("shouldFetchSuggestions")(shouldFetchSuggestions)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[PropTypes]
  }
}

