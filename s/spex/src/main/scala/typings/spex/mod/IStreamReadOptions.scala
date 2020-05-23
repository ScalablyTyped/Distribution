package typings.spex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStreamReadOptions extends js.Object {
  var closable: js.UndefOr[Boolean] = js.undefined
  var readChunks: js.UndefOr[Boolean] = js.undefined
  var readSize: js.UndefOr[Double] = js.undefined
}

object IStreamReadOptions {
  @scala.inline
  def apply(
    closable: js.UndefOr[Boolean] = js.undefined,
    readChunks: js.UndefOr[Boolean] = js.undefined,
    readSize: js.UndefOr[Double] = js.undefined
  ): IStreamReadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(readChunks)) __obj.updateDynamic("readChunks")(readChunks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(readSize)) __obj.updateDynamic("readSize")(readSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStreamReadOptions]
  }
}

