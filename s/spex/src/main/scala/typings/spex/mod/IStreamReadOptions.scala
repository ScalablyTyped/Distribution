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
    readSize: Int | Double = null
  ): IStreamReadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable.asInstanceOf[js.Any])
    if (!js.isUndefined(readChunks)) __obj.updateDynamic("readChunks")(readChunks.asInstanceOf[js.Any])
    if (readSize != null) __obj.updateDynamic("readSize")(readSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStreamReadOptions]
  }
}

