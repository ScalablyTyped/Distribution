package typings
package rsmqLib.rsmqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueOptions extends QueueIdentifier {
  var delay: js.UndefOr[scala.Double] = js.undefined
  var maxsize: js.UndefOr[scala.Double] = js.undefined
  var vt: js.UndefOr[scala.Double] = js.undefined
}

object QueueOptions {
  @scala.inline
  def apply(
    qname: java.lang.String,
    delay: scala.Int | scala.Double = null,
    maxsize: scala.Int | scala.Double = null,
    vt: scala.Int | scala.Double = null
  ): QueueOptions = {
    val __obj = js.Dynamic.literal(qname = qname)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (maxsize != null) __obj.updateDynamic("maxsize")(maxsize.asInstanceOf[js.Any])
    if (vt != null) __obj.updateDynamic("vt")(vt.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueOptions]
  }
}

