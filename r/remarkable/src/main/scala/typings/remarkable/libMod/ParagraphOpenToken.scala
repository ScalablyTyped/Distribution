package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.paragraph_open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ @js.native
trait ParagraphOpenToken extends ParagraphToken {
  @JSName("type")
  var type_ParagraphOpenToken: paragraph_open = js.native
}

object ParagraphOpenToken {
  @scala.inline
  def apply(level: Double, tight: Boolean, `type`: paragraph_open): ParagraphOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], tight = tight.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParagraphOpenToken]
  }
  @scala.inline
  implicit class ParagraphOpenTokenOps[Self <: ParagraphOpenToken] (val x: Self) extends AnyVal {
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
    def setType(value: paragraph_open): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

