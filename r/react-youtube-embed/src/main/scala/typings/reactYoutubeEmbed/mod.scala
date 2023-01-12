package typings.reactYoutubeEmbed

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-youtube-embed", JSImport.Default)
  @js.native
  open class default ()
    extends Component[YouTubeEmbedProps, js.Object, Any]
  
  type YouTubeEmbed = Component[YouTubeEmbedProps, js.Object, Any]
  
  trait YouTubeEmbedProps extends StObject {
    
    var appendSrc: js.UndefOr[String] = js.undefined
    
    var aspectRatio: js.UndefOr[String] = js.undefined
    
    var id: String
    
    var prependSrc: js.UndefOr[String] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object YouTubeEmbedProps {
    
    inline def apply(id: String): YouTubeEmbedProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[YouTubeEmbedProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: YouTubeEmbedProps] (val x: Self) extends AnyVal {
      
      inline def setAppendSrc(value: String): Self = StObject.set(x, "appendSrc", value.asInstanceOf[js.Any])
      
      inline def setAppendSrcUndefined: Self = StObject.set(x, "appendSrc", js.undefined)
      
      inline def setAspectRatio(value: String): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
      
      inline def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPrependSrc(value: String): Self = StObject.set(x, "prependSrc", value.asInstanceOf[js.Any])
      
      inline def setPrependSrcUndefined: Self = StObject.set(x, "prependSrc", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
