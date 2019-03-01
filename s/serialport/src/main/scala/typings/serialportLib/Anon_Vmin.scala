package typings
package serialportLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Vmin extends js.Object {
  var vmin: js.UndefOr[scala.Double] = js.undefined
  var vtime: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Vmin {
  @scala.inline
  def apply(vmin: scala.Int | scala.Double = null, vtime: scala.Int | scala.Double = null): Anon_Vmin = {
    val __obj = js.Dynamic.literal()
    if (vmin != null) __obj.updateDynamic("vmin")(vmin.asInstanceOf[js.Any])
    if (vtime != null) __obj.updateDynamic("vtime")(vtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Vmin]
  }
}

