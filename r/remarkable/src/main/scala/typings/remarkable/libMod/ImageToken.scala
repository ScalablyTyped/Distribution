package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.image
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait ImageToken extends ContentToken {
  /**
    * Image alt.
    */
  var alt: String
  /**
    * Image url.
    */
  var src: String
  /**
    * Image title.
    */
  var title: String
  @JSName("type")
  var type_ImageToken: image
}

object ImageToken {
  @scala.inline
  def apply(
    alt: String,
    level: Double,
    src: String,
    title: String,
    `type`: image,
    block: js.UndefOr[Boolean] = js.undefined,
    content: js.Any = null,
    lines: js.Tuple2[Double, Double] = null
  ): ImageToken = {
    val __obj = js.Dynamic.literal(alt = alt, level = level, src = src, title = title)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(block)) __obj.updateDynamic("block")(block)
    if (content != null) __obj.updateDynamic("content")(content)
    if (lines != null) __obj.updateDynamic("lines")(lines)
    __obj.asInstanceOf[ImageToken]
  }
}

