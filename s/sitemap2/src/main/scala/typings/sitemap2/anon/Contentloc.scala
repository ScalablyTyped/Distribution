package typings.sitemap2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Contentloc extends js.Object {
  var content_loc: String
  var description: String
  var thumbnail_loc: String
  var title: String
}

object Contentloc {
  @scala.inline
  def apply(content_loc: String, description: String, thumbnail_loc: String, title: String): Contentloc = {
    val __obj = js.Dynamic.literal(content_loc = content_loc.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], thumbnail_loc = thumbnail_loc.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contentloc]
  }
}

