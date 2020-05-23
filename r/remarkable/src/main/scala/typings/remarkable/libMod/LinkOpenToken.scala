package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.link_open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
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
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkOpenToken]
  }
}

