package typings.reactNativeJoi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in 'then' | 'catch' ]: std.Promise<T>[P]} */ trait ValidationResult[T] extends js.Object {
  var error: ValidationError
  var value: T
}

object ValidationResult {
  @scala.inline
  def apply[T](error: ValidationError, value: T): ValidationResult[T] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ValidationResult[T]]
  }
}

