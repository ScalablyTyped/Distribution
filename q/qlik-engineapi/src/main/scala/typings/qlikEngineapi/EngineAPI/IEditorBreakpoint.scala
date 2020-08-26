package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * EditorBreakpoint...
  */
@js.native
trait IEditorBreakpoint extends js.Object {
  /**
    * If set to true then the breakpoint is enabled (in use).
    */
  var qEnabled: Boolean = js.native
  /**
    * Name of the breakpoint.
    */
  var qbufferName: String = js.native
  /**
    * Line number in the script where the breakpoint is set.
    */
  var qlineIx: Double = js.native
}

object IEditorBreakpoint {
  @scala.inline
  def apply(qEnabled: Boolean, qbufferName: String, qlineIx: Double): IEditorBreakpoint = {
    val __obj = js.Dynamic.literal(qEnabled = qEnabled.asInstanceOf[js.Any], qbufferName = qbufferName.asInstanceOf[js.Any], qlineIx = qlineIx.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditorBreakpoint]
  }
  @scala.inline
  implicit class IEditorBreakpointOps[Self <: IEditorBreakpoint] (val x: Self) extends AnyVal {
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
    def setQEnabled(value: Boolean): Self = this.set("qEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setQbufferName(value: String): Self = this.set("qbufferName", value.asInstanceOf[js.Any])
    @scala.inline
    def setQlineIx(value: Double): Self = this.set("qlineIx", value.asInstanceOf[js.Any])
  }
  
}

