package typings
package spdyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoSpdy31 extends js.Object {
  var autoSpdy31: js.UndefOr[scala.Boolean] = js.undefined
  var windowSize: js.UndefOr[scala.Double] = js.undefined
}

object Anon_AutoSpdy31 {
  @scala.inline
  def apply(autoSpdy31: js.UndefOr[scala.Boolean] = js.undefined, windowSize: scala.Int | scala.Double = null): Anon_AutoSpdy31 = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoSpdy31)) __obj.updateDynamic("autoSpdy31")(autoSpdy31)
    if (windowSize != null) __obj.updateDynamic("windowSize")(windowSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AutoSpdy31]
  }
}

