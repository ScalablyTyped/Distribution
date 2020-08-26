package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.abbr_open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ @js.native
trait AbbrOpenToken extends TagToken {
  /**
    * Abbreviation title.
    */
  var title: String = js.native
  @JSName("type")
  var type_AbbrOpenToken: abbr_open = js.native
}

object AbbrOpenToken {
  @scala.inline
  def apply(level: Double, title: String, `type`: abbr_open): AbbrOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbbrOpenToken]
  }
  @scala.inline
  implicit class AbbrOpenTokenOps[Self <: AbbrOpenToken] (val x: Self) extends AnyVal {
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
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: abbr_open): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

