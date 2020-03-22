package typings.simpleIcons.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleIcon extends js.Object {
  var hex: String
  var path: String
  var slug: String
  var source: String
  var svg: String
  var title: String
}

object SimpleIcon {
  @scala.inline
  def apply(hex: String, path: String, slug: String, source: String, svg: String, title: String): SimpleIcon = {
    val __obj = js.Dynamic.literal(hex = hex.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], svg = svg.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SimpleIcon]
  }
}

