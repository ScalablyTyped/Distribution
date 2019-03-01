package typings
package siestaLib.SiestaNs.TestNs.ActionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  */
trait Wait
  extends siestaLib.SiestaNs.TestNs.IAction {
  var args: js.UndefOr[js.Array[_]] = js.undefined
  var delay: js.UndefOr[scala.Double] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var waitFor: js.UndefOr[java.lang.String] = js.undefined
}

object Wait {
  @scala.inline
  def apply(
    args: js.Array[_] = null,
    delay: scala.Int | scala.Double = null,
    desc: java.lang.String = null,
    timeout: scala.Int | scala.Double = null,
    waitFor: java.lang.String = null
  ): Wait = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (desc != null) __obj.updateDynamic("desc")(desc)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (waitFor != null) __obj.updateDynamic("waitFor")(waitFor)
    __obj.asInstanceOf[Wait]
  }
}

