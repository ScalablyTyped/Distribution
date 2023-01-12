package typings.reactImageloader

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.LegacyRef
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-imageloader", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[ImageLoaderProps, js.Object, Any]
  
  type ImageLoader = Component[ImageLoaderProps, js.Object, Any]
  
  trait ImageLoaderProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** An optional class name for the wrapper component. */
    var className: js.UndefOr[String] = js.undefined
    
    /** An optional object containing props for the underlying img component. */
    var imgProps: js.UndefOr[Any] = js.undefined
    
    /** An optional handler for the error event. */
    var onError: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    /** An optional handler for the load event. */
    var onLoad: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    /** An optional function that returns a React element to be shown while the image loads. */
    var preloader: js.UndefOr[js.Function1[/* params */ Any, ReactElement]] = js.undefined
    
    var ref: js.UndefOr[LegacyRef[ImageLoader]] = js.undefined
    
    /** The URL of the image to be loaded. */
    var src: String
    
    /** An optional object containing styles for the wrapper component. */
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /** A function that takes a props argument and returns a React element to be used as the wrapper component. Defaults to React.DOM.span. */
    var wrapper: js.UndefOr[js.Function1[/* props */ Any, ReactElement]] = js.undefined
  }
  object ImageLoaderProps {
    
    inline def apply(src: String): ImageLoaderProps = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageLoaderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImageLoaderProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setImgProps(value: Any): Self = StObject.set(x, "imgProps", value.asInstanceOf[js.Any])
      
      inline def setImgPropsUndefined: Self = StObject.set(x, "imgProps", js.undefined)
      
      inline def setOnError(value: /* event */ Any => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnLoad(value: /* event */ Any => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setPreloader(value: /* params */ Any => ReactElement): Self = StObject.set(x, "preloader", js.Any.fromFunction1(value))
      
      inline def setPreloaderUndefined: Self = StObject.set(x, "preloader", js.undefined)
      
      inline def setRef(value: LegacyRef[ImageLoader]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ ImageLoader | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setWrapper(value: /* props */ Any => ReactElement): Self = StObject.set(x, "wrapper", js.Any.fromFunction1(value))
      
      inline def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
    }
  }
}
