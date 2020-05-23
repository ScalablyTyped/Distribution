package typings.reactNativeJoi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Arrays extends js.Object {
  var arrays: js.UndefOr[Boolean] = js.undefined
  var objects: js.UndefOr[Boolean] = js.undefined
}

object Arrays {
  @scala.inline
  def apply(arrays: js.UndefOr[Boolean] = js.undefined, objects: js.UndefOr[Boolean] = js.undefined): Arrays = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arrays)) __obj.updateDynamic("arrays")(arrays.get.asInstanceOf[js.Any])
    if (!js.isUndefined(objects)) __obj.updateDynamic("objects")(objects.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arrays]
  }
}

