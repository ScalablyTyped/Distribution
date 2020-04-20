package typings.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaFeature extends js.Object {
  var name: String
  var value: String
}

object MediaFeature {
  @scala.inline
  def apply(name: String, value: String): MediaFeature = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaFeature]
  }
}

