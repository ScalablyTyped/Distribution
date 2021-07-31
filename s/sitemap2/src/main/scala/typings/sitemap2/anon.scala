package typings.sitemap2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Contentloc extends StObject {
    
    var content_loc: String
    
    var description: String
    
    var thumbnail_loc: String
    
    var title: String
  }
  object Contentloc {
    
    @scala.inline
    def apply(content_loc: String, description: String, thumbnail_loc: String, title: String): Contentloc = {
      val __obj = js.Dynamic.literal(content_loc = content_loc.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], thumbnail_loc = thumbnail_loc.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Contentloc]
    }
    
    @scala.inline
    implicit class ContentlocMutableBuilder[Self <: Contentloc] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent_loc(value: String): Self = StObject.set(x, "content_loc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbnail_loc(value: String): Self = StObject.set(x, "thumbnail_loc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
