package typings.storybookPolymer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Kind extends js.Object {
  var kind: String = js.native
  var story: String = js.native
}

object Kind {
  @scala.inline
  def apply(kind: String, story: String): Kind = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], story = story.asInstanceOf[js.Any])
    __obj.asInstanceOf[Kind]
  }
  @scala.inline
  implicit class KindOps[Self <: Kind] (val x: Self) extends AnyVal {
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
    def setStory(value: String): Self = this.set("story", value.asInstanceOf[js.Any])
  }
  
}

