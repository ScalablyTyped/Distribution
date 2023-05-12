package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Video
  extends StObject
     with Node
     with Media
     with MetafieldReference {
  
  var sources: js.Array[VideoSource]
}
object Video {
  
  inline def apply(id: ID, mediaContentType: MediaContentType, sources: js.Array[VideoSource]): Video = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], mediaContentType = mediaContentType.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[Video]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Video] (val x: Self) extends AnyVal {
    
    inline def setSources(value: js.Array[VideoSource]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesVarargs(value: VideoSource*): Self = StObject.set(x, "sources", js.Array(value*))
  }
}
