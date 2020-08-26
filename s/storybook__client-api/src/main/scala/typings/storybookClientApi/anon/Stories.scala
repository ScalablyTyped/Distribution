package typings.storybookClientApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stories extends js.Object {
  var kind: String = js.native
  var stories: js.Array[_] = js.native
}

object Stories {
  @scala.inline
  def apply(kind: String, stories: js.Array[_]): Stories = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], stories = stories.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stories]
  }
  @scala.inline
  implicit class StoriesOps[Self <: Stories] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setStoriesVarargs(value: js.Any*): Self = this.set("stories", js.Array(value :_*))
    @scala.inline
    def setStories(value: js.Array[_]): Self = this.set("stories", value.asInstanceOf[js.Any])
  }
  
}

