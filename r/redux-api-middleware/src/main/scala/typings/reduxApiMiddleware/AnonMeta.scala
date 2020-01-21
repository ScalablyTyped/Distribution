package typings.reduxApiMiddleware

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMeta[Meta] extends js.Object {
  var meta: Meta
}

object AnonMeta {
  @scala.inline
  def apply[Meta](meta: Meta): AnonMeta[Meta] = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMeta[Meta]]
  }
}

