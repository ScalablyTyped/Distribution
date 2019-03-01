package typings
package reactDashIsDashDeprecatedLib.reactDashIsDashDeprecatedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deprecatable[T] extends js.Object {
  def isDeprecated(message: java.lang.String): reactLib.reactMod.ReactNs.Validator[T]
}

object Deprecatable {
  @scala.inline
  def apply[T](isDeprecated: js.Function1[java.lang.String, reactLib.reactMod.ReactNs.Validator[T]]): Deprecatable[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDeprecated")(isDeprecated)
    __obj.asInstanceOf[Deprecatable[T]]
  }
}

