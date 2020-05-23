package typings.remarkable.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait ParagraphToken extends TagToken {
  /**
    * Absence of empty line before current tag: `true` if absent, `false`
    * if present. List is tight if any list item is tight.
    */
  var tight: Boolean
}

object ParagraphToken {
  @scala.inline
  def apply(level: Double, tight: Boolean, `type`: String, lines: js.Tuple2[Double, Double] = null): ParagraphToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], tight = tight.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParagraphToken]
  }
}

