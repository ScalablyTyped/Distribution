package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * EditorBreakpoint...
  */
trait IEditorBreakpoint extends js.Object {
  /**
    * If set to true then the breakpoint is enabled (in use).
    */
  var qEnabled: Boolean
  /**
    * Name of the breakpoint.
    */
  var qbufferName: String
  /**
    * Line number in the script where the breakpoint is set.
    */
  var qlineIx: Double
}

object IEditorBreakpoint {
  @scala.inline
  def apply(qEnabled: Boolean, qbufferName: String, qlineIx: Double): IEditorBreakpoint = {
    val __obj = js.Dynamic.literal(qEnabled = qEnabled.asInstanceOf[js.Any], qbufferName = qbufferName.asInstanceOf[js.Any], qlineIx = qlineIx.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IEditorBreakpoint]
  }
}

