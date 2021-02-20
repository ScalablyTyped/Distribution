package typings.reactFinalFormListeners

import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-final-form-listeners", "ExternallyChanged")
  @js.native
  val ExternallyChanged: FC[ExternallyChangedProps] = js.native
  
  @JSImport("react-final-form-listeners", "OnBlur")
  @js.native
  val OnBlur: FC[OnBlurProps] = js.native
  
  @JSImport("react-final-form-listeners", "OnChange")
  @js.native
  val OnChange: FC[OnChangeProps] = js.native
  
  @JSImport("react-final-form-listeners", "OnFocus")
  @js.native
  val OnFocus: FC[OnFocusProps] = js.native
  
  @js.native
  trait ExternallyChangedProps extends StObject {
    
    def children(externallyChanged: Boolean): ReactNode = js.native
    
    var name: String = js.native
  }
  object ExternallyChangedProps {
    
    @scala.inline
    def apply(children: Boolean => ReactNode, name: String): ExternallyChangedProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExternallyChangedProps]
    }
    
    @scala.inline
    implicit class ExternallyChangedPropsMutableBuilder[Self <: ExternallyChangedProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: Boolean => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OnBlurProps extends StObject {
    
    def children(): Unit = js.native
    
    var name: String = js.native
  }
  object OnBlurProps {
    
    @scala.inline
    def apply(children: () => Unit, name: String): OnBlurProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction0(children), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnBlurProps]
    }
    
    @scala.inline
    implicit class OnBlurPropsMutableBuilder[Self <: OnBlurProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: () => Unit): Self = StObject.set(x, "children", js.Any.fromFunction0(value))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OnChangeProps extends StObject {
    
    def children(value: js.Any, previous: js.Any): Unit = js.native
    
    var name: String = js.native
  }
  object OnChangeProps {
    
    @scala.inline
    def apply(children: (js.Any, js.Any) => Unit, name: String): OnChangeProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction2(children), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnChangeProps]
    }
    
    @scala.inline
    implicit class OnChangePropsMutableBuilder[Self <: OnChangeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: (js.Any, js.Any) => Unit): Self = StObject.set(x, "children", js.Any.fromFunction2(value))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OnFocusProps extends StObject {
    
    def children(): Unit = js.native
    
    var name: String = js.native
  }
  object OnFocusProps {
    
    @scala.inline
    def apply(children: () => Unit, name: String): OnFocusProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction0(children), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnFocusProps]
    }
    
    @scala.inline
    implicit class OnFocusPropsMutableBuilder[Self <: OnFocusProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: () => Unit): Self = StObject.set(x, "children", js.Any.fromFunction0(value))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
