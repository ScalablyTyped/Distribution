package typings.reactImageGallery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CurrentIndex extends StObject {
    
    var currentIndex: Double
    
    var item: this.type
    
    var itemIndex: Double
  }
  object CurrentIndex {
    
    inline def apply(currentIndex: Double, item: CurrentIndex, itemIndex: Double): CurrentIndex = {
      val __obj = js.Dynamic.literal(currentIndex = currentIndex.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[CurrentIndex]
    }
    
    extension [Self <: CurrentIndex](x: Self) {
      
      inline def setCurrentIndex(value: Double): Self = StObject.set(x, "currentIndex", value.asInstanceOf[js.Any])
      
      inline def setItem(value: CurrentIndex): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemIndex(value: Double): Self = StObject.set(x, "itemIndex", value.asInstanceOf[js.Any])
    }
  }
  
  trait Media extends StObject {
    
    var media: String
    
    var srcSet: String
  }
  object Media {
    
    inline def apply(media: String, srcSet: String): Media = {
      val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any], srcSet = srcSet.asInstanceOf[js.Any])
      __obj.asInstanceOf[Media]
    }
    
    extension [Self <: Media](x: Self) {
      
      inline def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      inline def setSrcSet(value: String): Self = StObject.set(x, "srcSet", value.asInstanceOf[js.Any])
    }
  }
}
