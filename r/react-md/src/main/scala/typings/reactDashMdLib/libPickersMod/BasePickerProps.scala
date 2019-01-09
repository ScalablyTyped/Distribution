package typings
package reactDashMdLib.libPickersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasePickerProps
  extends reactDashMdLib.libMod.Props
     with reactDashMdLib.libTextFieldsTextFieldMod.SharedTextFieldProps {
  var DateTimeFormat: js.UndefOr[
    js.Function2[
      /* locales */ js.UndefOr[Locales | js.Array[Locales]], 
      /* options */ js.UndefOr[IntlFormat], 
      reactDashMdLib.Anon_Date
    ]
  ] = js.undefined
  var animateInline: js.UndefOr[scala.Boolean] = js.undefined
  var `aria-label`: js.UndefOr[java.lang.String] = js.undefined
  var autoOk: js.UndefOr[scala.Boolean] = js.undefined
  var cancelLabel: js.UndefOr[java.lang.String] = js.undefined
  var cancelPrimary: js.UndefOr[scala.Boolean] = js.undefined
  var closeOnEsc: js.UndefOr[scala.Boolean] = js.undefined
  var defaultVisible: js.UndefOr[scala.Boolean] = js.undefined
  var disableScrollLocking: js.UndefOr[scala.Boolean] = js.undefined
  var displayMode: js.UndefOr[
    reactDashMdLib.reactDashMdLibStrings.landscape | reactDashMdLib.reactDashMdLibStrings.portrait
  ] = js.undefined
  var icon: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var id: reactDashMdLib.libMod.IdPropType
  var `inline`: js.UndefOr[scala.Boolean] = js.undefined
  var lastChild: js.UndefOr[scala.Boolean] = js.undefined
  var locales: js.UndefOr[Locales] = js.undefined
  var okLabel: js.UndefOr[java.lang.String] = js.undefined
  var okPrimary: js.UndefOr[scala.Boolean] = js.undefined
  var onVisibilityChange: js.UndefOr[
    js.Function2[/* visible */ scala.Boolean, /* event */ reactLib.Event, scala.Unit]
  ] = js.undefined
  var pickerClassName: js.UndefOr[java.lang.String] = js.undefined
  var pickerContentClassName: js.UndefOr[java.lang.String] = js.undefined
  var pickerFooterClassName: js.UndefOr[java.lang.String] = js.undefined
  var pickerHeaderClassName: js.UndefOr[java.lang.String] = js.undefined
  var pickerStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var portal: js.UndefOr[scala.Boolean] = js.undefined
  var renderNode: js.UndefOr[js.Object] = js.undefined
  var textFieldClassName: js.UndefOr[java.lang.String] = js.undefined
  var textFieldStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

