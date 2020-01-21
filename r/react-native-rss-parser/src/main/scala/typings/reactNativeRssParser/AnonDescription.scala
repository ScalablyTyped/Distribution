package typings.reactNativeRssParser

import typings.reactNativeRssParser.mod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDescription extends js.Object {
  var description: Maybe[String]
  var height: Maybe[String]
  var title: String
  var url: String
  var width: Maybe[String]
}

object AnonDescription {
  @scala.inline
  def apply(
    title: String,
    url: String,
    description: Maybe[String] = null,
    height: Maybe[String] = null,
    width: Maybe[String] = null
  ): AnonDescription = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDescription]
  }
}

