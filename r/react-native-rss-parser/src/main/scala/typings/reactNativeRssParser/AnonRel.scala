package typings.reactNativeRssParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRel extends js.Object {
  var rel: String
  var url: String
}

object AnonRel {
  @scala.inline
  def apply(rel: String, url: String): AnonRel = {
    val __obj = js.Dynamic.literal(rel = rel.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRel]
  }
}

