package typings.reactImageFallback

import typings.react.mod.Component
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.ImgHTMLAttributes
import typings.react.mod.ReactElement
import typings.react.mod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-image-fallback", JSImport.Default)
  @js.native
  open class default () extends Component[
          ReactImageFallbackProps & (DetailedHTMLProps[ImgHTMLAttributes[HTMLImageElement], HTMLImageElement]), 
          Any, 
          Any
        ]
  
  type ReactImageFallback = Component[
    ReactImageFallbackProps & (DetailedHTMLProps[ImgHTMLAttributes[HTMLImageElement], HTMLImageElement]), 
    Any, 
    Any
  ]
  
  trait ReactImageFallbackProps extends StObject {
    
    var fallbackImage: String | ReactElement | (js.Array[js.UndefOr[ReactElement | String]])
    
    var initialImage: js.UndefOr[String | ReactElement] = js.undefined
    
    var initialTimeout: js.UndefOr[Double] = js.undefined
    
    var onError: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLImageElement, Event], Unit]] = js.undefined
    
    var onLoad: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLImageElement, Event], Unit]] = js.undefined
    
    var src: js.UndefOr[String] = js.undefined
  }
  object ReactImageFallbackProps {
    
    inline def apply(fallbackImage: String | ReactElement | (js.Array[js.UndefOr[ReactElement | String]])): ReactImageFallbackProps = {
      val __obj = js.Dynamic.literal(fallbackImage = fallbackImage.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactImageFallbackProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReactImageFallbackProps] (val x: Self) extends AnyVal {
      
      inline def setFallbackImage(value: String | ReactElement | (js.Array[js.UndefOr[ReactElement | String]])): Self = StObject.set(x, "fallbackImage", value.asInstanceOf[js.Any])
      
      inline def setFallbackImageVarargs(value: (js.UndefOr[ReactElement | String])*): Self = StObject.set(x, "fallbackImage", js.Array(value*))
      
      inline def setInitialImage(value: String | ReactElement): Self = StObject.set(x, "initialImage", value.asInstanceOf[js.Any])
      
      inline def setInitialImageUndefined: Self = StObject.set(x, "initialImage", js.undefined)
      
      inline def setInitialTimeout(value: Double): Self = StObject.set(x, "initialTimeout", value.asInstanceOf[js.Any])
      
      inline def setInitialTimeoutUndefined: Self = StObject.set(x, "initialTimeout", js.undefined)
      
      inline def setOnError(value: /* event */ SyntheticEvent[HTMLImageElement, Event] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnLoad(value: /* event */ SyntheticEvent[HTMLImageElement, Event] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    }
  }
}
