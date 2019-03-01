package typings
package atPulumiPulumiLib.dynamicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckFailure extends js.Object {
  /**
    * The property that failed validation.
    */
  val property: java.lang.String
  /**
    * The reason that the property failed validation.
    */
  val reason: java.lang.String
}

object CheckFailure {
  @scala.inline
  def apply(property: java.lang.String, reason: java.lang.String): CheckFailure = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("property")(property)
    __obj.updateDynamic("reason")(reason)
    __obj.asInstanceOf[CheckFailure]
  }
}

