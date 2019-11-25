package typings.restify.restifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChainOptions extends js.Object {
  var onceNext: js.UndefOr[Boolean] = js.undefined
  var strictNext: js.UndefOr[Boolean] = js.undefined
}

object ChainOptions {
  @scala.inline
  def apply(onceNext: js.UndefOr[Boolean] = js.undefined, strictNext: js.UndefOr[Boolean] = js.undefined): ChainOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(onceNext)) __obj.updateDynamic("onceNext")(onceNext.asInstanceOf[js.Any])
    if (!js.isUndefined(strictNext)) __obj.updateDynamic("strictNext")(strictNext.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChainOptions]
  }
}

