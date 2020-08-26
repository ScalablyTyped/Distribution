package typings.storybookClientApi.storyStoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoryOptions extends js.Object {
  var includeDocsOnly: js.UndefOr[Boolean] = js.native
}

object StoryOptions {
  @scala.inline
  def apply(): StoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StoryOptions]
  }
  @scala.inline
  implicit class StoryOptionsOps[Self <: StoryOptions] (val x: Self) extends AnyVal {
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
    def setIncludeDocsOnly(value: Boolean): Self = this.set("includeDocsOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeDocsOnly: Self = this.set("includeDocsOnly", js.undefined)
  }
  
}

