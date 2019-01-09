package typings
package reactDashCollapseLib.reactDashCollapseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollapseProps
  extends reactLib.reactMod.ReactNs.HTMLProps[Collapse] {
  @JSName("children")
  var children_CollapseProps: reactLib.reactMod.ReactNs.ReactNode
  var fixedHeight: js.UndefOr[scala.Double] = js.undefined
   // react-motion doesn't export the config interface
  var forceInitialAnimation: js.UndefOr[scala.Boolean] = js.undefined
  var hasNestedCollapse: js.UndefOr[scala.Boolean] = js.undefined
  var isOpened: scala.Boolean
  var onMeasure: js.UndefOr[js.Function1[/* hasWidthHeight */ reactDashCollapseLib.Anon_Height, scala.Unit]] = js.undefined
  var onRender: js.UndefOr[
    js.Function1[/* hasCurrentFromTo */ reactDashCollapseLib.Anon_Current, scala.Unit]
  ] = js.undefined
  var onRest: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var springConfig: js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Double]] = js.undefined
  var theme: js.UndefOr[reactDashCollapseLib.Anon_Collapse] = js.undefined
}

