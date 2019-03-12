package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationError
  extends BaseError
     with org.scalablytyped.runtime.Instantiable2[
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

