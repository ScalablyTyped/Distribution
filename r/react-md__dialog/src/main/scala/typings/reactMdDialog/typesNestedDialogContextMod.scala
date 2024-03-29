package typings.reactMdDialog

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesNestedDialogContextMod {
  
  @JSImport("@react-md/dialog/types/NestedDialogContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def NestedDialogContextProvider(param0: NestedDialogContextProviderProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("NestedDialogContextProvider")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def useNestedDialogContext(): NestedDialogContext = ^.asInstanceOf[js.Dynamic].applyDynamic("useNestedDialogContext")().asInstanceOf[NestedDialogContext]
  
  trait NestedDialogContext extends StObject {
    
    def add(dialogId: String): Unit
    
    def remove(dialogId: String): Unit
    
    var stack: js.Array[String]
  }
  object NestedDialogContext {
    
    inline def apply(add: String => Unit, remove: String => Unit, stack: js.Array[String]): NestedDialogContext = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), remove = js.Any.fromFunction1(remove), stack = stack.asInstanceOf[js.Any])
      __obj.asInstanceOf[NestedDialogContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NestedDialogContext] (val x: Self) extends AnyVal {
      
      inline def setAdd(value: String => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      inline def setRemove(value: String => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      inline def setStack(value: js.Array[String]): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackVarargs(value: String*): Self = StObject.set(x, "stack", js.Array(value*))
    }
  }
  
  trait NestedDialogContextProviderProps extends StObject {
    
    var children: ReactNode
  }
  object NestedDialogContextProviderProps {
    
    inline def apply(): NestedDialogContextProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NestedDialogContextProviderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NestedDialogContextProviderProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
