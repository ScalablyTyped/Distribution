package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.link_close
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait LinkCloseToken extends TagToken {
  @JSName("type")
  var type_LinkCloseToken: link_close
}

object LinkCloseToken {
  @scala.inline
  def apply(level: Double, `type`: link_close, lines: js.Tuple2[Double, Double] = null): LinkCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkCloseToken]
  }
}

