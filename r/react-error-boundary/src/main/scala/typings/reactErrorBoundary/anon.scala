package typings.reactErrorBoundary

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ComponentStack extends StObject {
    
    var componentStack: String
  }
  object ComponentStack {
    
    inline def apply(componentStack: String): ComponentStack = {
      val __obj = js.Dynamic.literal(componentStack = componentStack.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentStack]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ComponentStack] (val x: Self) extends AnyVal {
      
      inline def setComponentStack(value: String): Self = StObject.set(x, "componentStack", value.asInstanceOf[js.Any])
    }
  }
  
  trait Error extends StObject {
    
    var error: js.Error
  }
  object Error {
    
    inline def apply(error: js.Error): Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
}
