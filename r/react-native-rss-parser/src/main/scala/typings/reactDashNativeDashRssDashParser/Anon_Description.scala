package typings.reactDashNativeDashRssDashParser

import typings.reactDashNativeDashRssDashParser.reactDashNativeDashRssDashParserMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Description extends js.Object {
  var description: Maybe[String]
  var height: Maybe[String]
  var title: String
  var url: String
  var width: Maybe[String]
}

object Anon_Description {
  @scala.inline
  def apply(
    title: String,
    url: String,
    description: Maybe[String] = null,
    height: Maybe[String] = null,
    width: Maybe[String] = null
  ): Anon_Description = {
    val __obj = js.Dynamic.literal(title = title, url = url)
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Description]
  }
}

