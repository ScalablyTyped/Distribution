package typings
package qlikDashEngineapiLib.EngineAPINs

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
  var qEnabled: scala.Boolean
  /**
    * Name of the breakpoint.
    */
  var qbufferName: java.lang.String
  /**
    * Line number in the script where the breakpoint is set.
    */
  var qlineIx: scala.Double
}

object IEditorBreakpoint {
  @scala.inline
  def apply(qEnabled: scala.Boolean, qbufferName: java.lang.String, qlineIx: scala.Double): IEditorBreakpoint = {
    val __obj = js.Dynamic.literal(qEnabled = qEnabled, qbufferName = qbufferName, qlineIx = qlineIx)
  
    __obj.asInstanceOf[IEditorBreakpoint]
  }
}

