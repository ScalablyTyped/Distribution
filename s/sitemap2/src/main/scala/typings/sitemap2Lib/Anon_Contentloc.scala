package typings
package sitemap2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Contentloc extends js.Object {
  var content_loc: java.lang.String
  var description: java.lang.String
  var thumbnail_loc: java.lang.String
  var title: java.lang.String
}

object Anon_Contentloc {
  @scala.inline
  def apply(
    content_loc: java.lang.String,
    description: java.lang.String,
    thumbnail_loc: java.lang.String,
    title: java.lang.String
  ): Anon_Contentloc = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("content_loc")(content_loc)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("thumbnail_loc")(thumbnail_loc)
    __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_Contentloc]
  }
}

