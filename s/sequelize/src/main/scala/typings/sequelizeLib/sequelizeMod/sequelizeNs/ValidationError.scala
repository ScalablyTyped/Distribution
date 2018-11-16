package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationError
  extends BaseError
     with /**
         * Validation Error. Thrown when the sequelize validation has failed. The error contains an `errors`
         * property, which is an array with 1 or more ValidationErrorItems, one for each validation that failed.
         *
         * @param message Error message
         * @param errors  Array of ValidationErrorItem objects describing the validation errors
         */
ScalablyTyped.runtime.Instantiable1[/* message */ java.lang.String, ValidationError]
     with /**
         * Validation Error. Thrown when the sequelize validation has failed. The error contains an `errors`
         * property, which is an array with 1 or more ValidationErrorItems, one for each validation that failed.
         *
         * @param message Error message
         * @param errors  Array of ValidationErrorItem objects describing the validation errors
         */
ScalablyTyped.runtime.Instantiable2[
      /* message */ java.lang.String, 
      /* errors */ js.Array[ValidationErrorItem], 
      ValidationError
    ] {
  /** Array of ValidationErrorItem objects describing the validation errors */
  var errors: js.Array[ValidationErrorItem] = js.native
  /**
           * Gets all validation error items for the path / field specified.
           *
           * @param path The path to be checked for error items
           */
  def get(path: java.lang.String): js.Array[ValidationErrorItem] = js.native
}

