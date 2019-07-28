package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.strong_close
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait StrongCloseToken extends TagToken {
  @JSName("type")
  var type_StrongCloseToken: strong_close
}

object StrongCloseToken {
  @scala.inline
  def apply(level: Double, `type`: strong_close, lines: js.Tuple2[Double, Double] = null): StrongCloseToken = {
    val __obj = js.Dynamic.literal(level = level)
    __obj.updateDynamic("type")(`type`)
    if (lines != null) __obj.updateDynamic("lines")(lines)
    __obj.asInstanceOf[StrongCloseToken]
  }
}

