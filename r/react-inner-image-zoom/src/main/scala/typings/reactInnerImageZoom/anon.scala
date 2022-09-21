package typings.reactInnerImageZoom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Media extends StObject {
    
    var media: js.UndefOr[String] = js.undefined
    
    var srcSet: js.UndefOr[String] = js.undefined
  }
  object Media {
    
    inline def apply(): Media = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Media]
    }
    
    extension [Self <: Media](x: Self) {
      
      inline def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
      
      inline def setSrcSet(value: String): Self = StObject.set(x, "srcSet", value.asInstanceOf[js.Any])
      
      inline def setSrcSetUndefined: Self = StObject.set(x, "srcSet", js.undefined)
    }
  }
}
