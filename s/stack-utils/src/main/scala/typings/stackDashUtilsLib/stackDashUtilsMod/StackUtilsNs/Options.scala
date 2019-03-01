package typings
package stackDashUtilsLib.stackDashUtilsMod.StackUtilsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  var internals: js.UndefOr[js.Array[stdLib.RegExp]] = js.undefined
  var wrapCallSite: js.UndefOr[js.Function1[/* callSite */ CallSite, CallSite]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    cwd: java.lang.String = null,
    internals: js.Array[stdLib.RegExp] = null,
    wrapCallSite: js.Function1[/* callSite */ CallSite, CallSite] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (internals != null) __obj.updateDynamic("internals")(internals)
    if (wrapCallSite != null) __obj.updateDynamic("wrapCallSite")(wrapCallSite)
    __obj.asInstanceOf[Options]
  }
}

