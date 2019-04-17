package typings
package remarkableLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- remarkableLib.libMod._Token because Already inherited */ trait ImageToken extends ContentToken {
  /**
    * Image alt.
    */
  var alt: java.lang.String
  /**
    * Image url.
    */
  var src: java.lang.String
  /**
    * Image title.
    */
  var title: java.lang.String
  @JSName("type")
  var type_ImageToken: remarkableLib.remarkableLibStrings.image
}

object ImageToken {
  @scala.inline
  def apply(
    alt: java.lang.String,
    level: scala.Double,
    src: java.lang.String,
    title: java.lang.String,
    `type`: remarkableLib.remarkableLibStrings.image,
    block: js.UndefOr[scala.Boolean] = js.undefined,
    content: js.Any = null,
    lines: js.Tuple2[scala.Double, scala.Double] = null
  ): ImageToken = {
    val __obj = js.Dynamic.literal(alt = alt, level = level, src = src, title = title)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(block)) __obj.updateDynamic("block")(block)
    if (content != null) __obj.updateDynamic("content")(content)
    if (lines != null) __obj.updateDynamic("lines")(lines)
    __obj.asInstanceOf[ImageToken]
  }
}

