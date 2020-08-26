package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.bullet_list_close
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ @js.native
trait BulletListCloseToken extends TagToken {
  @JSName("type")
  var type_BulletListCloseToken: bullet_list_close = js.native
}

object BulletListCloseToken {
  @scala.inline
  def apply(level: Double, `type`: bullet_list_close): BulletListCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulletListCloseToken]
  }
  @scala.inline
  implicit class BulletListCloseTokenOps[Self <: BulletListCloseToken] (val x: Self) extends AnyVal {
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
    def setType(value: bullet_list_close): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

