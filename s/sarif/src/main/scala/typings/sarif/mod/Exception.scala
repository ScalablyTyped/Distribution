package typings.sarif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Exception extends js.Object {
  /**
    * An array of exception objects each of which is considered a cause of this exception.
    */
  var innerExceptions: js.UndefOr[js.Array[Exception]] = js.native
  /**
    * A string that identifies the kind of exception, for example, the fully qualified type name of an object that was
    * thrown, or the symbolic name of a signal.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * A message that describes the exception.
    */
  var message: js.UndefOr[String] = js.native
  /**
    * Key/value pairs that provide additional information about the exception.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  /**
    * The sequence of function calls leading to the exception.
    */
  var stack: js.UndefOr[Stack] = js.native
}

object Exception {
  @scala.inline
  def apply(): Exception = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Exception]
  }
  @scala.inline
  implicit class ExceptionOps[Self <: Exception] (val x: Self) extends AnyVal {
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
    def setInnerExceptionsVarargs(value: Exception*): Self = this.set("innerExceptions", js.Array(value :_*))
    @scala.inline
    def setInnerExceptions(value: js.Array[Exception]): Self = this.set("innerExceptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerExceptions: Self = this.set("innerExceptions", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setProperties(value: PropertyBag): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setStack(value: Stack): Self = this.set("stack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
  }
  
}

