package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.dd_open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ @js.native
trait DdOpenToken extends TagToken {
  @JSName("type")
  var type_DdOpenToken: dd_open = js.native
}

object DdOpenToken {
  @scala.inline
  def apply(level: Double, `type`: dd_open): DdOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DdOpenToken]
  }
  @scala.inline
  implicit class DdOpenTokenOps[Self <: DdOpenToken] (val x: Self) extends AnyVal {
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
    def setType(value: dd_open): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

