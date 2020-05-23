package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.paragraph_open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait ParagraphOpenToken extends ParagraphToken {
  @JSName("type")
  var type_ParagraphOpenToken: paragraph_open
}

object ParagraphOpenToken {
  @scala.inline
  def apply(level: Double, tight: Boolean, `type`: paragraph_open, lines: js.Tuple2[Double, Double] = null): ParagraphOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], tight = tight.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParagraphOpenToken]
  }
}

