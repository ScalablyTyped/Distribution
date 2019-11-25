package typings.prettier.prettierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SupportOptionDefault extends js.Object {
  var since: String
  var value: SupportOptionValue
}

object SupportOptionDefault {
  @scala.inline
  def apply(since: String, value: SupportOptionValue): SupportOptionDefault = {
    val __obj = js.Dynamic.literal(since = since.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SupportOptionDefault]
  }
}

