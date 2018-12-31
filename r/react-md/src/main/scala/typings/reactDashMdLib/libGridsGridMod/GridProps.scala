package typings
package reactDashMdLib.libGridsGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridProps
  extends reactDashMdLib.libMod.Props {
  var children: js.UndefOr[
    reactLib.reactMod.ReactNs.ReactNode | (js.Function1[
      /* props */ reactDashMdLib.libGridsMod.HOCProps, 
      reactLib.reactMod.ReactNs.ReactNode
    ])
  ] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  var container: js.UndefOr[java.lang.String] = js.undefined
  var gutter: js.UndefOr[scala.Double] = js.undefined
  var noSpacing: js.UndefOr[scala.Boolean] = js.undefined
  var spacing: js.UndefOr[scala.Double] = js.undefined
  var stacked: js.UndefOr[scala.Boolean] = js.undefined
}

