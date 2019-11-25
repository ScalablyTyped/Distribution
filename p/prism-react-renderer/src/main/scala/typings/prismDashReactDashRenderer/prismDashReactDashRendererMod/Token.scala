package typings.prismDashReactDashRenderer.prismDashReactDashRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  var content: String
  var empty: js.UndefOr[Boolean] = js.undefined
  var types: js.Array[String]
}

object Token {
  @scala.inline
  def apply(content: String, types: js.Array[String], empty: js.UndefOr[Boolean] = js.undefined): Token = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    if (!js.isUndefined(empty)) __obj.updateDynamic("empty")(empty.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
}

