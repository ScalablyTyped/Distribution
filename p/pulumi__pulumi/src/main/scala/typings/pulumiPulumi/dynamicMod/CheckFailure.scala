package typings.pulumiPulumi.dynamicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckFailure extends js.Object {
  /**
    * The property that failed validation.
    */
  val property: String
  /**
    * The reason that the property failed validation.
    */
  val reason: String
}

object CheckFailure {
  @scala.inline
  def apply(property: String, reason: String): CheckFailure = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CheckFailure]
  }
}

