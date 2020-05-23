package typings.rollupPluginPostcss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ctx extends js.Object {
  var ctx: js.Any
  var path: String
}

object Ctx {
  @scala.inline
  def apply(ctx: js.Any, path: String): Ctx = {
    val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ctx]
  }
}

