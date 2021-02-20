package typings.reactYoutubeEmbed

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-youtube-embed", JSImport.Default)
  @js.native
  class default ()
    extends Component[YouTubeEmbedProps, js.Object, js.Any]
  
  type YouTubeEmbed = Component[YouTubeEmbedProps, js.Object, js.Any]
  
  @js.native
  trait YouTubeEmbedProps extends StObject {
    
    var appendSrc: js.UndefOr[String] = js.native
    
    var aspectRatio: js.UndefOr[String] = js.native
    
    var id: String = js.native
    
    var prependSrc: js.UndefOr[String] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object YouTubeEmbedProps {
    
    @scala.inline
    def apply(id: String): YouTubeEmbedProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[YouTubeEmbedProps]
    }
    
    @scala.inline
    implicit class YouTubeEmbedPropsMutableBuilder[Self <: YouTubeEmbedProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppendSrc(value: String): Self = StObject.set(x, "appendSrc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppendSrcUndefined: Self = StObject.set(x, "appendSrc", js.undefined)
      
      @scala.inline
      def setAspectRatio(value: String): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrependSrc(value: String): Self = StObject.set(x, "prependSrc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrependSrcUndefined: Self = StObject.set(x, "prependSrc", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
