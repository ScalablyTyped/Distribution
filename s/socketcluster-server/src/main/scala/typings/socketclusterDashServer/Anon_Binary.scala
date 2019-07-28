package typings.socketclusterDashServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Binary extends js.Object {
  var binary: js.UndefOr[Boolean] = js.undefined
  var compress: js.UndefOr[Boolean] = js.undefined
  var fin: js.UndefOr[Boolean] = js.undefined
  var mask: js.UndefOr[Boolean] = js.undefined
}

object Anon_Binary {
  @scala.inline
  def apply(
    binary: js.UndefOr[Boolean] = js.undefined,
    compress: js.UndefOr[Boolean] = js.undefined,
    fin: js.UndefOr[Boolean] = js.undefined,
    mask: js.UndefOr[Boolean] = js.undefined
  ): Anon_Binary = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(binary)) __obj.updateDynamic("binary")(binary)
    if (!js.isUndefined(compress)) __obj.updateDynamic("compress")(compress)
    if (!js.isUndefined(fin)) __obj.updateDynamic("fin")(fin)
    if (!js.isUndefined(mask)) __obj.updateDynamic("mask")(mask)
    __obj.asInstanceOf[Anon_Binary]
  }
}

