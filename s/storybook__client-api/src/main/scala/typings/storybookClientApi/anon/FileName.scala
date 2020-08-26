package typings.storybookClientApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileName extends js.Object {
  var fileName: String = js.native
  var kind: String = js.native
  var stories: js.Array[Name] = js.native
}

object FileName {
  @scala.inline
  def apply(fileName: String, kind: String, stories: js.Array[Name]): FileName = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], stories = stories.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileName]
  }
  @scala.inline
  implicit class FileNameOps[Self <: FileName] (val x: Self) extends AnyVal {
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
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setStoriesVarargs(value: Name*): Self = this.set("stories", js.Array(value :_*))
    @scala.inline
    def setStories(value: js.Array[Name]): Self = this.set("stories", value.asInstanceOf[js.Any])
  }
  
}

