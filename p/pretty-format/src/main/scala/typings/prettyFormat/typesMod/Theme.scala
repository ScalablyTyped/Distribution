package typings.prettyFormat.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Theme extends js.Object {
  var comment: String = js.native
  var content: String = js.native
  var prop: String = js.native
  var tag: String = js.native
  var value: String = js.native
}

object Theme {
  @scala.inline
  def apply(comment: String, content: String, prop: String, tag: String, value: String): Theme = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], prop = prop.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Theme]
  }
  @scala.inline
  implicit class ThemeOps[Self <: Theme] (val x: Self) extends AnyVal {
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
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setProp(value: String): Self = this.set("prop", value.asInstanceOf[js.Any])
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

