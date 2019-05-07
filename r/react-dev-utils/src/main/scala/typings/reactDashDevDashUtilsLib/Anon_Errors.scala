package typings
package reactDashDevDashUtilsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Errors extends js.Object {
  /**
    * Called when there are build errors.
    */
  def errors(errors: js.Array[java.lang.String]): scala.Unit
  /**
    * Called when there are build warnings.
    */
  def warnings(warnings: js.Array[java.lang.String]): scala.Unit
}

object Anon_Errors {
  @scala.inline
  def apply(
    errors: js.Array[java.lang.String] => scala.Unit,
    warnings: js.Array[java.lang.String] => scala.Unit
  ): Anon_Errors = {
    val __obj = js.Dynamic.literal(errors = js.Any.fromFunction1(errors), warnings = js.Any.fromFunction1(warnings))
  
    __obj.asInstanceOf[Anon_Errors]
  }
}

