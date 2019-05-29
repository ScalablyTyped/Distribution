package typings
package purdyLib.purdyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var align: js.UndefOr[purdyLib.purdyLibStrings.left | purdyLib.purdyLibStrings.right] = js.undefined
  var arrayIndex: js.UndefOr[scala.Boolean] = js.undefined
  var depth: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var indent: js.UndefOr[scala.Double] = js.undefined
  var json: js.UndefOr[scala.Boolean] = js.undefined
  var path: js.UndefOr[scala.Boolean] = js.undefined
  var pathPrefix: js.UndefOr[java.lang.String] = js.undefined
  var plain: js.UndefOr[scala.Boolean] = js.undefined
  var proto: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    align: purdyLib.purdyLibStrings.left | purdyLib.purdyLibStrings.right = null,
    arrayIndex: js.UndefOr[scala.Boolean] = js.undefined,
    depth: scala.Int | scala.Double = null,
    indent: scala.Int | scala.Double = null,
    json: js.UndefOr[scala.Boolean] = js.undefined,
    path: js.UndefOr[scala.Boolean] = js.undefined,
    pathPrefix: java.lang.String = null,
    plain: js.UndefOr[scala.Boolean] = js.undefined,
    proto: js.UndefOr[scala.Boolean] = js.undefined
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

