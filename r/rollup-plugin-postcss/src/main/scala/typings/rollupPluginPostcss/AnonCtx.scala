package typings.rollupPluginPostcss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCtx extends js.Object {
  var ctx: js.Any
  var path: String
}

object AnonCtx {
  @scala.inline
  def apply(ctx: js.Any, path: String): AnonCtx = {
    val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCtx]
  }
}

