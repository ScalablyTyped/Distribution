package typings.reactImageGallery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait CurrentIndex extends StObject {
    
    var currentIndex: Double = js.native
    
    var item: this.type = js.native
    
    var itemIndex: Double = js.native
  }
  object CurrentIndex {
    
    @scala.inline
    def apply(currentIndex: Double, item: CurrentIndex, itemIndex: Double): CurrentIndex = {
      val __obj = js.Dynamic.literal(currentIndex = currentIndex.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[CurrentIndex]
    }
    
    @scala.inline
    implicit class CurrentIndexMutableBuilder[Self <: CurrentIndex] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrentIndex(value: Double): Self = StObject.set(x, "currentIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem(value: CurrentIndex): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemIndex(value: Double): Self = StObject.set(x, "itemIndex", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Media extends StObject {
    
    var media: String = js.native
    
    var srcSet: String = js.native
  }
  object Media {
    
    @scala.inline
    def apply(media: String, srcSet: String): Media = {
      val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any], srcSet = srcSet.asInstanceOf[js.Any])
      __obj.asInstanceOf[Media]
    }
    
    @scala.inline
    implicit class MediaMutableBuilder[Self <: Media] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcSet(value: String): Self = StObject.set(x, "srcSet", value.asInstanceOf[js.Any])
    }
  }
}
