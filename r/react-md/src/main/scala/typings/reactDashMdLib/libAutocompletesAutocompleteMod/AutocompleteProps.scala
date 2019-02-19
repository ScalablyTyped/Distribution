package typings
package reactDashMdLib.libAutocompletesAutocompleteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutocompleteProps
  extends reactDashMdLib.libMenusMenuMod.BaseMenuProps {
  var autoComplete: js.UndefOr[java.lang.String] = js.undefined
  var autocompleteWithLabel: js.UndefOr[scala.Boolean] = js.undefined
  var clearOnAutocomplete: js.UndefOr[scala.Boolean] = js.undefined
  var customSize: js.UndefOr[java.lang.String] = js.undefined
  var data: DataType
  var dataLabel: js.UndefOr[java.lang.String] = js.undefined
  var dataValue: js.UndefOr[java.lang.String] = js.undefined
  var defaultValue: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var deleteKeys: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var error: js.UndefOr[scala.Boolean] = js.undefined
  var filter: js.UndefOr[
    scala.Null | (js.Function3[
      /* data */ DataType, 
      /* filterText */ java.lang.String | scala.Double, 
      /* dataLabel */ js.UndefOr[java.lang.String], 
      js.Array[java.lang.String]
    ])
  ] = js.undefined
  var findInlineSuggestion: js.UndefOr[
    js.Function3[
      /* data */ DataType, 
      /* value */ java.lang.String | scala.Double, 
      /* dataLabel */ js.UndefOr[java.lang.String], 
      java.lang.String | scala.Double
    ]
  ] = js.undefined
  var focusInputOnAutocomplete: js.UndefOr[scala.Boolean] = js.undefined
  var helpOnFocus: js.UndefOr[scala.Boolean] = js.undefined
  var helpText: js.UndefOr[java.lang.String] = js.undefined
  var `inline`: js.UndefOr[scala.Boolean] = js.undefined
  var inlineIndicator: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  var inlineSuggestionClassName: js.UndefOr[java.lang.String] = js.undefined
  var inlineSuggestionPadding: js.UndefOr[scala.Double] = js.undefined
  var inlineSuggestionStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var inputClassName: js.UndefOr[java.lang.String] = js.undefined
  var inputStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var label: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var menuId: js.UndefOr[reactDashMdLib.libMod.IdPropType] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var onAutocomplete: js.UndefOr[
    js.Function3[
      /* suggestion */ java.lang.String | scala.Double, 
      /* suggestionIndex */ scala.Double, 
      /* matches */ DataType, 
      scala.Unit
    ]
  ] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[
      /* value */ java.lang.String, 
      /* event */ reactLib.reactMod.ReactNs.FormEvent[reactLib.HTMLFormElement], 
      scala.Unit
    ]
  ] = js.undefined
  var onMenuClose: js.UndefOr[js.Function] = js.undefined
  var onMenuOpen: js.UndefOr[js.Function] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var position: js.UndefOr[reactDashMdLib.libHelpersLayoverMod.LayoverPositions] = js.undefined
  var showUnfilteredData: js.UndefOr[scala.Boolean] = js.undefined
  var simplifiedMenu: js.UndefOr[scala.Boolean] = js.undefined
  var textFieldClassName: js.UndefOr[java.lang.String] = js.undefined
  var textFieldStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var toolbar: js.UndefOr[scala.Boolean] = js.undefined
  var total: js.UndefOr[scala.Double] = js.undefined
  var value: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

