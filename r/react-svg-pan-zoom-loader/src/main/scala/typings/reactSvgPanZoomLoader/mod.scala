package typings.reactSvgPanZoomLoader

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-svg-pan-zoom-loader", "ReactSvgPanZoomLoader")
  @js.native
  val ReactSvgPanZoomLoader: ComponentType[ReactSvgPanZoomLoaderProps] = js.native
  
  @JSImport("react-svg-pan-zoom-loader", "SvgLoaderSelectElement")
  @js.native
  val SvgLoaderSelectElement: ComponentType[SvgLoaderSelectElementProps] = js.native
  
  trait ReactSvgPanZoomLoaderProps extends StObject {
    
    var proxy: js.UndefOr[ReactNode] = js.undefined
    
    def render(content: ReactNode): ReactNode
    
    var src: String
  }
  object ReactSvgPanZoomLoaderProps {
    
    inline def apply(render: ReactNode => ReactNode, src: String): ReactSvgPanZoomLoaderProps = {
      val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render), src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactSvgPanZoomLoaderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReactSvgPanZoomLoaderProps] (val x: Self) extends AnyVal {
      
      inline def setProxy(value: ReactNode): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      inline def setRender(value: ReactNode => ReactNode): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    }
  }
  
  trait SvgLoaderSelectElementProps
    extends StObject
       with /* prop */ StringDictionary[Any] {
    
    var children: js.UndefOr[String] = js.undefined
    
    var selector: String
  }
  object SvgLoaderSelectElementProps {
    
    inline def apply(selector: String): SvgLoaderSelectElementProps = {
      val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
      __obj.asInstanceOf[SvgLoaderSelectElementProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SvgLoaderSelectElementProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    }
  }
}
