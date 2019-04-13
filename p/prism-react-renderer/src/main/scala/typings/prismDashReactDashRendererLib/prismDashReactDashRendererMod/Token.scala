package typings
package prismDashReactDashRendererLib.prismDashReactDashRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  var content: java.lang.String
  var empty: js.UndefOr[scala.Boolean] = js.undefined
  var types: js.Array[java.lang.String]
}

object Token {
  @scala.inline
  def apply(
    content: java.lang.String,
    types: js.Array[java.lang.String],
    empty: js.UndefOr[scala.Boolean] = js.undefined
  ): Token = {
    val __obj = js.Dynamic.literal(content = content, types = types)
    if (!js.isUndefined(empty)) __obj.updateDynamic("empty")(empty)
    __obj.asInstanceOf[Token]
  }
}

