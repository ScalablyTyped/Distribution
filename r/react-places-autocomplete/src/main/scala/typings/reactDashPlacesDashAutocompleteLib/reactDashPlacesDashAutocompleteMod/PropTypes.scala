package typings
package reactDashPlacesDashAutocompleteLib.reactDashPlacesDashAutocompleteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PropTypes extends js.Object {
  var classNames: js.UndefOr[reactDashPlacesDashAutocompleteLib.Anon_RootAutocompleteItemActive] = js.undefined
  var debounce: js.UndefOr[scala.Double] = js.undefined
  var highlightFirstSuggestion: js.UndefOr[scala.Boolean] = js.undefined
  var inputProps: reactDashPlacesDashAutocompleteLib.Anon_OnBlur
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
  var options: js.UndefOr[reactDashPlacesDashAutocompleteLib.Anon_Location] = js.undefined
  var renderFooter: js.UndefOr[js.Function0[reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
  var renderSuggestion: js.UndefOr[
    js.Function2[
      /* suggestion */ java.lang.String, 
      /* formattedSuggestion */ formattedSuggestionType, 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  var shouldFetchSuggestions: js.UndefOr[js.Function1[/* value */ java.lang.String, scala.Boolean]] = js.undefined
  var styles: js.UndefOr[reactDashPlacesDashAutocompleteLib.Anon_Root] = js.undefined
}

