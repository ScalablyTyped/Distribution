package typings
package reactDashTouchLib.reactDashTouchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait HoldableConfig extends js.Object {
  def holdComplete(callback: js.Function0[scala.Unit]): js.Function0[js.Function0[scala.Unit]]
  def holdProgress(callback: js.Function0[scala.Unit]): js.Function1[
    /* updateState */ js.Function1[/* holdLength */ scala.Double, scala.Unit], 
    js.Function0[scala.Unit]
  ]
}

