package typings
package reactDashIsDashDeprecatedLib.reactDashIsDashDeprecatedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deprecatable[T] extends js.Object {
  def isDeprecated(message: java.lang.String): reactLib.reactMod.Validator[T]
}

object Deprecatable {
  @scala.inline
  def apply[T](isDeprecated: java.lang.String => reactLib.reactMod.Validator[T]): Deprecatable[T] = {
    val __obj = js.Dynamic.literal(isDeprecated = js.Any.fromFunction1(isDeprecated))
  
    __obj.asInstanceOf[Deprecatable[T]]
  }
}

