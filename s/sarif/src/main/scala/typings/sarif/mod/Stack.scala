package typings.sarif.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stack extends StObject {
  
  /**
    * An array of stack frames that represents a sequence of calls, rendered in reverse chronological order, that
    * comprise the call stack.
    */
  var frames: js.Array[StackFrame]
  
  /**
    * A message relevant to this call stack.
    */
  var message: js.UndefOr[Message] = js.undefined
  
  /**
    * Key/value pairs that provide additional information about the stack.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
}
object Stack {
  
  @scala.inline
  def apply(frames: js.Array[StackFrame]): Stack = {
    val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stack]
  }
  
  @scala.inline
  implicit class StackMutableBuilder[Self <: Stack] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrames(value: js.Array[StackFrame]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramesVarargs(value: StackFrame*): Self = StObject.set(x, "frames", js.Array(value :_*))
    
    @scala.inline
    def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
