package typings.purdy.purdyMod

import typings.purdy.purdyStrings.left
import typings.purdy.purdyStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var align: js.UndefOr[left | right] = js.undefined
  var arrayIndex: js.UndefOr[Boolean] = js.undefined
  var depth: js.UndefOr[Double | Null] = js.undefined
  var indent: js.UndefOr[Double] = js.undefined
  var json: js.UndefOr[Boolean] = js.undefined
  var path: js.UndefOr[Boolean] = js.undefined
  var pathPrefix: js.UndefOr[String] = js.undefined
  var plain: js.UndefOr[Boolean] = js.undefined
  var proto: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    align: left | right = null,
    arrayIndex: js.UndefOr[Boolean] = js.undefined,
    depth: Int | Double = null,
    indent: Int | Double = null,
    json: js.UndefOr[Boolean] = js.undefined,
    path: js.UndefOr[Boolean] = js.undefined,
    pathPrefix: String = null,
    plain: js.UndefOr[Boolean] = js.undefined,
    proto: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(arrayIndex)) __obj.updateDynamic("arrayIndex")(arrayIndex)
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    if (!js.isUndefined(json)) __obj.updateDynamic("json")(json)
    if (!js.isUndefined(path)) __obj.updateDynamic("path")(path)
    if (pathPrefix != null) __obj.updateDynamic("pathPrefix")(pathPrefix)
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain)
    if (!js.isUndefined(proto)) __obj.updateDynamic("proto")(proto)
    __obj.asInstanceOf[Options]
  }
}

