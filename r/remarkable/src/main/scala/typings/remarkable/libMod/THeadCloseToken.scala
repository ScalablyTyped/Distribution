package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.thead_close
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait THeadCloseToken extends TagToken {
  @JSName("type")
  var type_THeadCloseToken: thead_close
}

object THeadCloseToken {
  @scala.inline
  def apply(level: Double, `type`: thead_close, lines: js.Tuple2[Double, Double] = null): THeadCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[THeadCloseToken]
  }
}

