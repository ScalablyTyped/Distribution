package typings.reactMdDialog

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nestedDialogContextMod {
  
  @JSImport("@react-md/dialog/types/NestedDialogContext", "NestedDialogContextProvider")
  @js.native
  def NestedDialogContextProvider(hasChildren: NestedDialogContextProviderProps): ReactElement = js.native
  
  @JSImport("@react-md/dialog/types/NestedDialogContext", "useNestedDialogContext")
  @js.native
  def useNestedDialogContext(): NestedDialogContext = js.native
  
  @js.native
  trait NestedDialogContext extends StObject {
    
    def add(dialogId: String): Unit = js.native
    
    def remove(dialogId: String): Unit = js.native
    
    var stack: js.Array[String] = js.native
  }
  object NestedDialogContext {
    
    @scala.inline
    def apply(add: String => Unit, remove: String => Unit, stack: js.Array[String]): NestedDialogContext = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), remove = js.Any.fromFunction1(remove), stack = stack.asInstanceOf[js.Any])
      __obj.asInstanceOf[NestedDialogContext]
    }
    
    @scala.inline
    implicit class NestedDialogContextMutableBuilder[Self <: NestedDialogContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdd(value: String => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemove(value: String => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStack(value: js.Array[String]): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackVarargs(value: String*): Self = StObject.set(x, "stack", js.Array(value :_*))
    }
  }
  
  @js.native
  trait NestedDialogContextProviderProps extends StObject {
    
    var children: ReactNode = js.native
  }
  object NestedDialogContextProviderProps {
    
    @scala.inline
    def apply(): NestedDialogContextProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NestedDialogContextProviderProps]
    }
    
    @scala.inline
    implicit class NestedDialogContextProviderPropsMutableBuilder[Self <: NestedDialogContextProviderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
