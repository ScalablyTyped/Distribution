package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.htmltag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ @js.native
trait HtmlTagToken extends ContentToken {
  @JSName("content")
  var content_HtmlTagToken: String = js.native
  @JSName("type")
  var type_HtmlTagToken: htmltag = js.native
}

object HtmlTagToken {
  @scala.inline
  def apply(content: String, level: Double, `type`: htmltag): HtmlTagToken = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlTagToken]
  }
  @scala.inline
  implicit class HtmlTagTokenOps[Self <: HtmlTagToken] (val x: Self) extends AnyVal {
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: htmltag): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

