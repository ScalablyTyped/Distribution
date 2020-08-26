package typings.storybookApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocsModeData extends js.Object {
  var docsMode: Boolean = js.native
}

object DocsModeData {
  @scala.inline
  def apply(docsMode: Boolean): DocsModeData = {
    val __obj = js.Dynamic.literal(docsMode = docsMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocsModeData]
  }
  @scala.inline
  implicit class DocsModeDataOps[Self <: DocsModeData] (val x: Self) extends AnyVal {
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
    def setDocsMode(value: Boolean): Self = this.set("docsMode", value.asInstanceOf[js.Any])
  }
  
}

