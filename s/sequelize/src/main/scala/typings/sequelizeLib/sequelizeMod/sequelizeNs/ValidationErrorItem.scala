package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationErrorItem
  extends BaseError
     with /**
  * Validation Error Item
  * Instances of this class are included in the `ValidationError.errors` property.
  *
  * @param message An error message
  * @param type The type of the validation error
  * @param path The field that triggered the validation error
  * @param value The value that generated the error
  */
org.scalablytyped.runtime.Instantiable4[
      /* message */ java.lang.String, 
      /* type */ java.lang.String, 
      /* path */ java.lang.String, 
      /* value */ java.lang.String, 
      ValidationErrorItem
    ] {
  /** An error message */
  var message: java.lang.String = js.native
  /** The field that triggered the validation error */
  var path: java.lang.String = js.native
  /** The type of the validation error */
  var `type`: java.lang.String = js.native
  /** The value that generated the error */
  var value: java.lang.String = js.native
}

