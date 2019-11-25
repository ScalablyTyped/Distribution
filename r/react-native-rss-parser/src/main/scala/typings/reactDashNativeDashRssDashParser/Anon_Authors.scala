package typings.reactDashNativeDashRssDashParser

import typings.reactDashNativeDashRssDashParser.reactDashNativeDashRssDashParserMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Authors extends js.Object {
  var authors: Maybe[js.Array[Anon_Name]]
  var block: Maybe[String]
  var duration: String
  var explicit: String
  var image: Maybe[String]
  var isClosedCaptioned: Maybe[String]
  var order: Maybe[String]
  var subtitle: String
  var summary: Maybe[String]
}

object Anon_Authors {
  @scala.inline
  def apply(
    duration: String,
    explicit: String,
    subtitle: String,
    authors: Maybe[js.Array[Anon_Name]] = null,
    block: Maybe[String] = null,
    image: Maybe[String] = null,
    isClosedCaptioned: Maybe[String] = null,
    order: Maybe[String] = null,
    summary: Maybe[String] = null
  ): Anon_Authors = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], explicit = explicit.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any])
    if (authors != null) __obj.updateDynamic("authors")(authors.asInstanceOf[js.Any])
    if (block != null) __obj.updateDynamic("block")(block.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (isClosedCaptioned != null) __obj.updateDynamic("isClosedCaptioned")(isClosedCaptioned.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Authors]
  }
}

