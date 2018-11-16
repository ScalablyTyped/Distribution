package typings
package reactDashMdLib.libGridsCellMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CellProps
  extends reactDashMdLib.libMod.Props {
  var align: js.UndefOr[
    reactDashMdLib.reactDashMdLibStrings.top | reactDashMdLib.reactDashMdLibStrings.middle | reactDashMdLib.reactDashMdLibStrings.bottom | reactDashMdLib.reactDashMdLibStrings.stretch
  ] = js.undefined
  var children: js.UndefOr[
    reactLib.reactMod.ReactNs.ReactNode | (js.Function1[
      /* props */ reactDashMdLib.libGridsMod.HOCProps, 
      reactLib.reactMod.ReactNs.ReactNode
    ])
  ] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  var desktopHidden: js.UndefOr[scala.Boolean] = js.undefined
  var desktopOffset: js.UndefOr[scala.Double] = js.undefined
  var desktopOrder: js.UndefOr[scala.Double] = js.undefined
  var desktopSize: js.UndefOr[scala.Double] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var order: js.UndefOr[scala.Double] = js.undefined
  var phoneHidden: js.UndefOr[scala.Boolean] = js.undefined
  var phoneOffset: js.UndefOr[scala.Double] = js.undefined
  var phoneOrder: js.UndefOr[scala.Double] = js.undefined
  var phoneSize: js.UndefOr[scala.Double] = js.undefined
  var position: js.UndefOr[
    reactDashMdLib.reactDashMdLibStrings.center | reactDashMdLib.reactDashMdLibStrings.right
  ] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var tabletHidden: js.UndefOr[scala.Boolean] = js.undefined
  var tabletOffset: js.UndefOr[scala.Double] = js.undefined
  var tabletOrder: js.UndefOr[scala.Double] = js.undefined
  var tabletSize: js.UndefOr[scala.Double] = js.undefined
}

