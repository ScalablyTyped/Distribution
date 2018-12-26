package typings
package reactDashMediaLib.reactDashMediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MediaProps extends js.Object {
  var children: js.UndefOr[
    (js.Function1[/* matches */ scala.Boolean, reactLib.reactMod.ReactNs.ReactNode]) | reactLib.reactMod.ReactNs.ReactNode
  ] = js.undefined
  var defaultMatches: js.UndefOr[scala.Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* matches */ scala.Boolean, scala.Unit]] = js.undefined
  var query: java.lang.String | MediaQueryObject | js.Array[MediaQueryObject]
  var render: js.UndefOr[js.Function0[reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
  var targetWindow: js.UndefOr[stdLib.Window] = js.undefined
}

