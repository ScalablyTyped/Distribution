package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("sequelize", "ValidationErrorItem")
@js.native
class ValidationErrorItemCls protected () extends ValidationErrorItem {
  /**
    * Validation Error Item
    * Instances of this class are included in the `ValidationError.errors` property.
    *
    * @param message An error message
    * @param type The type of the validation error
    * @param path The field that triggered the validation error
    * @param value The value that generated the error
    */
  def this(message: String, `type`: String, path: String, value: String) = this()
}
