package typings.reactDashDevDashUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Errors extends js.Object {
  /**
    * Called when there are build errors.
    */
  def errors(errors: js.Array[String]): Unit
  /**
    * Called when there are build warnings.
    */
  def warnings(warnings: js.Array[String]): Unit
}

object Anon_Errors {
  @scala.inline
  def apply(errors: js.Array[String] => Unit, warnings: js.Array[String] => Unit): Anon_Errors = {
    val __obj = js.Dynamic.literal(errors = js.Any.fromFunction1(errors), warnings = js.Any.fromFunction1(warnings))
  
    __obj.asInstanceOf[Anon_Errors]
  }
}

