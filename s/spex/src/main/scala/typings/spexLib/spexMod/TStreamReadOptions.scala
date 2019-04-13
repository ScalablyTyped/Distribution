package typings
package spexLib.spexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TStreamReadOptions extends js.Object {
  var closable: js.UndefOr[scala.Boolean] = js.undefined
  var readChunks: js.UndefOr[scala.Boolean] = js.undefined
  var readSize: js.UndefOr[scala.Double] = js.undefined
}

object TStreamReadOptions {
  @scala.inline
  def apply(
    closable: js.UndefOr[scala.Boolean] = js.undefined,
    readChunks: js.UndefOr[scala.Boolean] = js.undefined,
    readSize: scala.Int | scala.Double = null
  ): TStreamReadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable)
    if (!js.isUndefined(readChunks)) __obj.updateDynamic("readChunks")(readChunks)
    if (readSize != null) __obj.updateDynamic("readSize")(readSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[TStreamReadOptions]
  }
}

