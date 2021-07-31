package typings.sequelize.mod

import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidationErrorItem
  extends StObject
     with BaseError
     with /**
  * Validation Error Item
  * Instances of this class are included in the `ValidationError.errors` property.
  *
  * @param message An error message
  * @param type The type of the validation error
  * @param path The field that triggered the validation error
  * @param value The value that generated the error
  */
Instantiable4[
      /* message */ String, 
      /* type */ String, 
      /* path */ String, 
      /* value */ String, 
      ValidationErrorItem
    ] {
  
  /** The field that triggered the validation error */
  var path: String = js.native
  
  /** The type of the validation error */
  var `type`: String = js.native
  
  /** The value that generated the error */
  var value: String = js.native
}
