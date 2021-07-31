package typings.reactImageloader

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.Props
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-imageloader", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[ImageLoaderProps, js.Object, js.Any]
  
  @js.native
  trait ImageLoader
    extends Component[ImageLoaderProps, js.Object, js.Any]
  
  trait ImageLoaderProps
    extends StObject
       with Props[ImageLoader] {
    
    /** An optional class name for the wrapper component. */
    var className: js.UndefOr[String] = js.undefined
    
    /** An optional object containing props for the underlying img component. */
    var imgProps: js.UndefOr[js.Any] = js.undefined
    
    /** An optional handler for the error event. */
    var onError: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.undefined
    
    /** An optional handler for the load event. */
    var onLoad: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.undefined
    
    /** An optional function that returns a React element to be shown while the image loads. */
    var preloader: js.UndefOr[js.Function1[/* params */ js.Any, ReactElement]] = js.undefined
    
    /** The URL of the image to be loaded. */
    var src: String
    
    /** An optional object containing styles for the wrapper component. */
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /** A function that takes a props argument and returns a React element to be used as the wrapper component. Defaults to React.DOM.span. */
    var wrapper: js.UndefOr[js.Function1[/* props */ js.Any, ReactElement]] = js.undefined
  }
  object ImageLoaderProps {
    
    @scala.inline
    def apply(src: String): ImageLoaderProps = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageLoaderProps]
    }
    
    @scala.inline
    implicit class ImageLoaderPropsMutableBuilder[Self <: ImageLoaderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setImgProps(value: js.Any): Self = StObject.set(x, "imgProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImgPropsUndefined: Self = StObject.set(x, "imgProps", js.undefined)
      
      @scala.inline
      def setOnError(value: /* event */ js.Any => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnLoad(value: /* event */ js.Any => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      @scala.inline
      def setPreloader(value: /* params */ js.Any => ReactElement): Self = StObject.set(x, "preloader", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPreloaderUndefined: Self = StObject.set(x, "preloader", js.undefined)
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setWrapper(value: /* props */ js.Any => ReactElement): Self = StObject.set(x, "wrapper", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
    }
  }
}
