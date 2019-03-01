package typings
package qunitDashDomLib.QUnitDomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var count: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(count: scala.Int | scala.Double = null): Options = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

