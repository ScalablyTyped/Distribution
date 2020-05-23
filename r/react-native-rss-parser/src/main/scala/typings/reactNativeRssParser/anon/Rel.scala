package typings.reactNativeRssParser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rel extends js.Object {
  var rel: String
  var url: String
}

object Rel {
  @scala.inline
  def apply(rel: String, url: String): Rel = {
    val __obj = js.Dynamic.literal(rel = rel.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rel]
  }
}

