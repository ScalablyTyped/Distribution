package typings.reduxApiMiddleware.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetaMeta[Meta] extends js.Object {
  var meta: Meta
}

object MetaMeta {
  @scala.inline
  def apply[Meta](meta: Meta): MetaMeta[Meta] = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaMeta[Meta]]
  }
}

