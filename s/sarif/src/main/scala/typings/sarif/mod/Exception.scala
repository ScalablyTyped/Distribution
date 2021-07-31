package typings.sarif.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Exception extends StObject {
  
  /**
    * An array of exception objects each of which is considered a cause of this exception.
    */
  var innerExceptions: js.UndefOr[js.Array[Exception]] = js.undefined
  
  /**
    * A string that identifies the kind of exception, for example, the fully qualified type name of an object that was
    * thrown, or the symbolic name of a signal.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * A message that describes the exception.
    */
  var message: js.UndefOr[String] = js.undefined
  
  /**
    * Key/value pairs that provide additional information about the exception.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  
  /**
    * The sequence of function calls leading to the exception.
    */
  var stack: js.UndefOr[Stack] = js.undefined
}
object Exception {
  
  @scala.inline
  def apply(): Exception = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Exception]
  }
  
  @scala.inline
  implicit class ExceptionMutableBuilder[Self <: Exception] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInnerExceptions(value: js.Array[Exception]): Self = StObject.set(x, "innerExceptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerExceptionsUndefined: Self = StObject.set(x, "innerExceptions", js.undefined)
    
    @scala.inline
    def setInnerExceptionsVarargs(value: Exception*): Self = StObject.set(x, "innerExceptions", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setStack(value: Stack): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
  }
}
