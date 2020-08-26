package typings.sarif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackFrame extends js.Object {
  /**
    * The location to which this stack frame refers.
    */
  var location: js.UndefOr[Location] = js.native
  /**
    * The name of the module that contains the code of this stack frame.
    */
  var module: js.UndefOr[String] = js.native
  /**
    * The parameters of the call that is executing.
    */
  var parameters: js.UndefOr[js.Array[String]] = js.native
  /**
    * Key/value pairs that provide additional information about the stack frame.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  /**
    * The thread identifier of the stack frame.
    */
  var threadId: js.UndefOr[Double] = js.native
}

object StackFrame {
  @scala.inline
  def apply(): StackFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackFrame]
  }
  @scala.inline
  implicit class StackFrameOps[Self <: StackFrame] (val x: Self) extends AnyVal {
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
    def setLocation(value: Location): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setModule(value: String): Self = this.set("module", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModule: Self = this.set("module", js.undefined)
    @scala.inline
    def setParametersVarargs(value: String*): Self = this.set("parameters", js.Array(value :_*))
    @scala.inline
    def setParameters(value: js.Array[String]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    @scala.inline
    def setProperties(value: PropertyBag): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setThreadId(value: Double): Self = this.set("threadId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreadId: Self = this.set("threadId", js.undefined)
  }
  
}

