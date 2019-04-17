package typings
package remarkableLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- remarkableLib.libMod._Token because Already inherited */ trait LinkOpenToken extends TagToken {
  /**
    * Link url.
    */
  var href: java.lang.String
  /**
    * Link title.
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  @JSName("type")
  var type_LinkOpenToken: remarkableLib.remarkableLibStrings.link_open
}

object LinkOpenToken {
  @scala.inline
  def apply(
    href: java.lang.String,
    level: scala.Double,
    `type`: remarkableLib.remarkableLibStrings.link_open,
    lines: js.Tuple2[scala.Double, scala.Double] = null,
    title: java.lang.String = null
  ): LinkOpenToken = {
    val __obj = js.Dynamic.literal(href = href, level = level)
    __obj.updateDynamic("type")(`type`)
    if (lines != null) __obj.updateDynamic("lines")(lines)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[LinkOpenToken]
  }
}

