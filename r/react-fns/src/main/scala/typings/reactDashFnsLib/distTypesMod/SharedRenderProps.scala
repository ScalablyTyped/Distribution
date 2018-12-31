package typings
package reactDashFnsLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedRenderProps[P] extends js.Object {
  var children: js.UndefOr[
    (js.Function1[/* props */ P, reactLib.reactMod.ReactNs.ReactNode]) | reactLib.reactMod.ReactNs.ReactNode
  ] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ComponentType[P | scala.Unit]] = js.undefined
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var render: js.UndefOr[js.Function1[/* props */ P, reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
}

