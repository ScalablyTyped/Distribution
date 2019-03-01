package typings
package siestaLib.SiestaNs.TestNs.ActionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  */
trait Done
  extends siestaLib.SiestaNs.TestNs.IAction {
  var delay: js.UndefOr[scala.Double] = js.undefined
}

object Done {
  @scala.inline
  def apply(delay: scala.Int | scala.Double = null, desc: java.lang.String = null): Done = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (desc != null) __obj.updateDynamic("desc")(desc)
    __obj.asInstanceOf[Done]
  }
}

