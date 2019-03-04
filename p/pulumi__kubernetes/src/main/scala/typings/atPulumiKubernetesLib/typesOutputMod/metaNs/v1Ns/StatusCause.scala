package typings
package atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * StatusCause provides more information about an api.Status failure, including cases when
  * multiple errors are encountered.
  */
trait StatusCause extends js.Object {
  /**
    * The field of the resource that has caused this error, as named by its JSON serialization.
    * May include dot and postfix notation for nested attributes. Arrays are zero-indexed.
    * Fields may appear more than once in an array of causes due to fields having multiple
    * errors. Optional.
    *
    * Examples:
    *   "name" - the field "name" on the current resource
    *   "items[0].name" - the field "name" on the first array entry in "items"
    */
  val field: java.lang.String
  /**
    * A human-readable description of the cause of the error.  This field may be presented as-is
    * to a reader.
    */
  val message: java.lang.String
  /**
    * A machine-readable description of the cause of the error. If this value is empty there is
    * no information available.
    */
  val reason: java.lang.String
}

object StatusCause {
  @scala.inline
  def apply(field: java.lang.String, message: java.lang.String, reason: java.lang.String): StatusCause = {
    val __obj = js.Dynamic.literal(field = field, message = message, reason = reason)
  
    __obj.asInstanceOf[StatusCause]
  }
}

