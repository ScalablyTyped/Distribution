package typings.serialport.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vmin extends js.Object {
  var vmin: js.UndefOr[Double] = js.undefined
  var vtime: js.UndefOr[Double] = js.undefined
}

object Vmin {
  @scala.inline
  def apply(vmin: js.UndefOr[Double] = js.undefined, vtime: js.UndefOr[Double] = js.undefined): Vmin = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(vmin)) __obj.updateDynamic("vmin")(vmin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(vtime)) __obj.updateDynamic("vtime")(vtime.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vmin]
  }
}

