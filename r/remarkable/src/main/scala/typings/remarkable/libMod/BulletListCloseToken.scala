package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.bullet_list_close
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait BulletListCloseToken extends TagToken {
  @JSName("type")
  var type_BulletListCloseToken: bullet_list_close
}

object BulletListCloseToken {
  @scala.inline
  def apply(level: Double, `type`: bullet_list_close, lines: js.Tuple2[Double, Double] = null): BulletListCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulletListCloseToken]
  }
}

