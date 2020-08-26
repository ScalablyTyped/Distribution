package typings.reduxApiMiddleware.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetaMeta[Meta] extends js.Object {
  var meta: Meta = js.native
}

object MetaMeta {
  @scala.inline
  def apply[Meta](meta: Meta): MetaMeta[Meta] = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaMeta[Meta]]
  }
  @scala.inline
  implicit class MetaMetaOps[Self <: MetaMeta[_], Meta] (val x: Self with MetaMeta[Meta]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMeta(value: Meta): Self = this.set("meta", value.asInstanceOf[js.Any])
  }
  
}

