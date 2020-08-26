package typings.storybookApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocsMode extends js.Object {
  var docsMode: Boolean = js.native
  var enableShortcuts: Boolean = js.native
  var name: js.UndefOr[String] = js.native
  var sidebarAnimations: Boolean = js.native
  var url: js.UndefOr[String] = js.native
}

object DocsMode {
  @scala.inline
  def apply(docsMode: Boolean, enableShortcuts: Boolean, sidebarAnimations: Boolean): DocsMode = {
    val __obj = js.Dynamic.literal(docsMode = docsMode.asInstanceOf[js.Any], enableShortcuts = enableShortcuts.asInstanceOf[js.Any], sidebarAnimations = sidebarAnimations.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocsMode]
  }
  @scala.inline
  implicit class DocsModeOps[Self <: DocsMode] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setEnableShortcuts(value: Boolean): Self = this.set("enableShortcuts", value.asInstanceOf[js.Any])
    @scala.inline
    def setSidebarAnimations(value: Boolean): Self = this.set("sidebarAnimations", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

