package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.link_open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait LinkOpenToken extends TagToken {
  /**
    * Link url.
    */
  var href: String
  /**
    * Link title.
    */
  var title: js.UndefOr[String] = js.undefined
  @JSName("type")
  var type_LinkOpenToken: link_open
}

object LinkOpenToken {
  @scala.inline
  def apply(
    href: String,
    level: Double,
    `type`: link_open,
    lines: js.Tuple2[Double, Double] = null,
    title: String = null
  ): LinkOpenToken = {
    val __obj = js.Dynamic.literal(href = href, level = level)
    __obj.updateDynamic("type")(`type`)
    if (lines != null) __obj.updateDynamic("lines")(lines)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[LinkOpenToken]
  }
}

