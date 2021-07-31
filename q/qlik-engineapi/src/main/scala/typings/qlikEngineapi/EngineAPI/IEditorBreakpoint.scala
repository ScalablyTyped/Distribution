package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * EditorBreakpoint...
  */
trait IEditorBreakpoint extends StObject {
  
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
  
  @scala.inline
  implicit class IEditorBreakpointMutableBuilder[Self <: IEditorBreakpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQEnabled(value: Boolean): Self = StObject.set(x, "qEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQbufferName(value: String): Self = StObject.set(x, "qbufferName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQlineIx(value: Double): Self = StObject.set(x, "qlineIx", value.asInstanceOf[js.Any])
  }
}
