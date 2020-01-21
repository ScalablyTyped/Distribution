package typings.reactIsDeprecated.mod

import typings.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deprecatable[T] extends js.Object {
  def isDeprecated(message: String): Validator[T]
}

object Deprecatable {
  @scala.inline
  def apply[T](isDeprecated: String => Validator[T]): Deprecatable[T] = {
    val __obj = js.Dynamic.literal(isDeprecated = js.Any.fromFunction1(isDeprecated))
  
    __obj.asInstanceOf[Deprecatable[T]]
  }
}

