package typings.reactFrameComponent

import typings.react.mod.Component
import typings.react.mod.Consumer
import typings.react.mod.Context
import typings.react.mod.IframeHTMLAttributes
import typings.react.mod.Provider
import typings.react.mod.ReactNode
import typings.std.HTMLIFrameElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-frame-component", JSImport.Default)
  @js.native
  class default ()
    extends Component[FrameComponentProps, js.Object, js.Any]
  
  @JSImport("react-frame-component", "FrameContext")
  @js.native
  val FrameContext: Context[FrameContextProps] = js.native
  
  @JSImport("react-frame-component", "FrameContextConsumer")
  @js.native
  val FrameContextConsumer: Consumer[FrameContextProps] = js.native
  
  @JSImport("react-frame-component", "FrameContextProvider")
  @js.native
  val FrameContextProvider: Provider[FrameContextProps] = js.native
  
  type FrameComponent = Component[FrameComponentProps, js.Object, js.Any]
  
  trait FrameComponentProps
    extends StObject
       with IframeHTMLAttributes[HTMLIFrameElement] {
    
    @JSName("children")
    var children_FrameComponentProps: ReactNode
    
    var contentDidMount: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var contentDidUpdate: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var head: js.UndefOr[ReactNode] = js.undefined
    
    var initialContent: js.UndefOr[String] = js.undefined
    
    var mountTarget: js.UndefOr[String] = js.undefined
  }
  object FrameComponentProps {
    
    @scala.inline
    def apply(): FrameComponentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FrameComponentProps]
    }
    
    @scala.inline
    implicit class FrameComponentPropsMutableBuilder[Self <: FrameComponentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setContentDidMount(value: () => Unit): Self = StObject.set(x, "contentDidMount", js.Any.fromFunction0(value))
      
      @scala.inline
      def setContentDidMountUndefined: Self = StObject.set(x, "contentDidMount", js.undefined)
      
      @scala.inline
      def setContentDidUpdate(value: () => Unit): Self = StObject.set(x, "contentDidUpdate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setContentDidUpdateUndefined: Self = StObject.set(x, "contentDidUpdate", js.undefined)
      
      @scala.inline
      def setHead(value: ReactNode): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadUndefined: Self = StObject.set(x, "head", js.undefined)
      
      @scala.inline
      def setInitialContent(value: String): Self = StObject.set(x, "initialContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialContentUndefined: Self = StObject.set(x, "initialContent", js.undefined)
      
      @scala.inline
      def setMountTarget(value: String): Self = StObject.set(x, "mountTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMountTargetUndefined: Self = StObject.set(x, "mountTarget", js.undefined)
    }
  }
  
  trait FrameContextProps extends StObject {
    
    var document: js.UndefOr[js.Any] = js.undefined
    
    var window: js.UndefOr[js.Any] = js.undefined
  }
  object FrameContextProps {
    
    @scala.inline
    def apply(): FrameContextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FrameContextProps]
    }
    
    @scala.inline
    implicit class FrameContextPropsMutableBuilder[Self <: FrameContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDocument(value: js.Any): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
      
      @scala.inline
      def setWindow(value: js.Any): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
    }
  }
}
