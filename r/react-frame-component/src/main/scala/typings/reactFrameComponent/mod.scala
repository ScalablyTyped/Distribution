package typings.reactFrameComponent

import typings.react.mod.Component
import typings.react.mod.Consumer
import typings.react.mod.Context
import typings.react.mod.IframeHTMLAttributes
import typings.react.mod.Provider
import typings.react.mod.ReactNode
import typings.std.HTMLDocument
import typings.std.HTMLIFrameElement
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-frame-component", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-frame-component", JSImport.Default)
  @js.native
  open class default ()
    extends Component[FrameComponentProps, js.Object, Any]
  
  @JSImport("react-frame-component", "FrameContext")
  @js.native
  val FrameContext: Context[FrameContextProps] = js.native
  
  @JSImport("react-frame-component", "FrameContextConsumer")
  @js.native
  val FrameContextConsumer: Consumer[FrameContextProps] = js.native
  
  @JSImport("react-frame-component", "FrameContextProvider")
  @js.native
  val FrameContextProvider: Provider[FrameContextProps] = js.native
  
  inline def useFrame(): FrameContextProps = ^.asInstanceOf[js.Dynamic].applyDynamic("useFrame")().asInstanceOf[FrameContextProps]
  
  type FrameComponent = Component[FrameComponentProps, js.Object, Any]
  
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
    
    inline def apply(): FrameComponentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FrameComponentProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FrameComponentProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setContentDidMount(value: () => Unit): Self = StObject.set(x, "contentDidMount", js.Any.fromFunction0(value))
      
      inline def setContentDidMountUndefined: Self = StObject.set(x, "contentDidMount", js.undefined)
      
      inline def setContentDidUpdate(value: () => Unit): Self = StObject.set(x, "contentDidUpdate", js.Any.fromFunction0(value))
      
      inline def setContentDidUpdateUndefined: Self = StObject.set(x, "contentDidUpdate", js.undefined)
      
      inline def setHead(value: ReactNode): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      inline def setHeadUndefined: Self = StObject.set(x, "head", js.undefined)
      
      inline def setInitialContent(value: String): Self = StObject.set(x, "initialContent", value.asInstanceOf[js.Any])
      
      inline def setInitialContentUndefined: Self = StObject.set(x, "initialContent", js.undefined)
      
      inline def setMountTarget(value: String): Self = StObject.set(x, "mountTarget", value.asInstanceOf[js.Any])
      
      inline def setMountTargetUndefined: Self = StObject.set(x, "mountTarget", js.undefined)
    }
  }
  
  trait FrameContextProps extends StObject {
    
    var document: js.UndefOr[HTMLDocument] = js.undefined
    
    var window: js.UndefOr[Window] = js.undefined
  }
  object FrameContextProps {
    
    inline def apply(): FrameContextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FrameContextProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FrameContextProps] (val x: Self) extends AnyVal {
      
      inline def setDocument(value: HTMLDocument): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
      
      inline def setWindow(value: Window): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
      
      inline def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
    }
  }
}
