package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.heading_open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ @js.native
trait HeadingOpenToken extends HeadingToken {
  @JSName("type")
  var type_HeadingOpenToken: heading_open = js.native
}

object HeadingOpenToken {
  @scala.inline
  def apply(hLevel: HeadingValue, level: Double, `type`: heading_open): HeadingOpenToken = {
    val __obj = js.Dynamic.literal(hLevel = hLevel.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadingOpenToken]
  }
  @scala.inline
  implicit class HeadingOpenTokenOps[Self <: HeadingOpenToken] (val x: Self) extends AnyVal {
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
    def setType(value: heading_open): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

