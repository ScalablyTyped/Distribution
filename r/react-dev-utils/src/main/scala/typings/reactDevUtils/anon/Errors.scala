package typings.reactDevUtils.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Errors extends js.Object {
  /**
    * Called when there are build errors.
    */
  def errors(errors: js.Array[String]): Unit = js.native
  /**
    * Called when there are build warnings.
    */
  def warnings(warnings: js.Array[String]): Unit = js.native
}

object Errors {
  @scala.inline
  def apply(errors: js.Array[String] => Unit, warnings: js.Array[String] => Unit): Errors = {
    val __obj = js.Dynamic.literal(errors = js.Any.fromFunction1(errors), warnings = js.Any.fromFunction1(warnings))
    __obj.asInstanceOf[Errors]
  }
  @scala.inline
  implicit class ErrorsOps[Self <: Errors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setErrors(value: js.Array[String] => Unit): Self = this.set("errors", js.Any.fromFunction1(value))
    @scala.inline
    def setWarnings(value: js.Array[String] => Unit): Self = this.set("warnings", js.Any.fromFunction1(value))
  }
  
}

