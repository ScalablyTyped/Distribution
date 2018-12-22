package typings
package reactDashMdLib.libTextFieldsTextFieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TextFieldProps
  extends reactDashMdLib.libMod.Props
     with SharedTextFieldProps {
  /**
     * @deprecated
     */
  var adjustMinWidth: js.UndefOr[scala.Boolean] = js.undefined
  var defaultValue: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
     * @deprecated
     */
  var floatingLabel: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * @deprecated
     */
  var icon: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var id: js.UndefOr[reactDashMdLib.libMod.IdPropType] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[/* value */ scala.Double | java.lang.String, /* event */ reactLib.Event, scala.Unit]
  ] = js.undefined
  var onDoubleClick: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onPaste: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.ReactNs.ClipboardEvent[reactLib.HTMLElement], 
      scala.Unit
    ]
  ] = js.undefined
  var value: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

