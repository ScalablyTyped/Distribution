package typings.pulumiPulumi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFlags extends js.Object {
  var flags: String
  var source: String
}

object AnonFlags {
  @scala.inline
  def apply(flags: String, source: String): AnonFlags = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFlags]
  }
}

