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
  var searchOptions: js.UndefOr[reactDashPlacesDashAutocompleteLib.Anon_Location] = js.undefined
  var shouldFetchSuggestions: js.UndefOr[scala.Boolean] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
  def children(opts: stdLib.Readonly[reactDashPlacesDashAutocompleteLib.Anon_GetInputProps]): reactLib.reactMod.ReactNs.ReactNode
}

