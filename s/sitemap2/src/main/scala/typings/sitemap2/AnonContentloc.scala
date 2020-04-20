package typings.sitemap2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContentloc extends js.Object {
  var content_loc: String
  var description: String
  var thumbnail_loc: String
  var title: String
}

object AnonContentloc {
  @scala.inline
  def apply(content_loc: String, description: String, thumbnail_loc: String, title: String): AnonContentloc = {
    val __obj = js.Dynamic.literal(content_loc = content_loc.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], thumbnail_loc = thumbnail_loc.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContentloc]
  }
}

