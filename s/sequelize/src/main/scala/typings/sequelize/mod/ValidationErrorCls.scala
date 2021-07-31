package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("sequelize", "ValidationError")
@js.native
class ValidationErrorCls protected ()
  extends StObject
     with ValidationError {
  /**
    * Validation Error. Thrown when the sequelize validation has failed. The error contains an `errors`
    * property, which is an array with 1 or more ValidationErrorItems, one for each validation that failed.
    *
    * @param message Error message
    * @param errors  Array of ValidationErrorItem objects describing the validation errors
    */
  def this(message: String) = this()
  def this(message: String, errors: js.Array[ValidationErrorItem]) = this()
  
  /* CompleteClass */
  var message: String = js.native
  
  /* CompleteClass */
  var name: String = js.native
}
