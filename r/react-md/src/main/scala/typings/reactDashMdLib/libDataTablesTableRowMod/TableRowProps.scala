package typings
package reactDashMdLib.libDataTablesTableRowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TableRowProps
  extends reactDashMdLib.libMod.Props {
  /**
     * @deprecated
     */
  var autoAdjust: js.UndefOr[scala.Boolean] = js.undefined
  var children: js.UndefOr[
    js.Array[reactLib.reactMod.ReactNs.ReactElement[_]] | reactLib.reactMod.ReactNs.ReactElement[_] | reactLib.reactMod.ReactNs.ReactNode
  ] = js.undefined
  var onCheckboxClick: js.UndefOr[
    js.Function3[
      /* rowIndex */ scala.Double, 
      /* checked */ scala.Boolean, 
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLTableRowElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var selectable: js.UndefOr[scala.Boolean] = js.undefined
  var selected: js.UndefOr[scala.Boolean] = js.undefined
}

