package typings.reactAliceCarousel.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsPlaying extends StObject {
  
  var isPlaying: Any
}
object IsPlaying {
  
  inline def apply(isPlaying: Any): IsPlaying = {
    val __obj = js.Dynamic.literal(isPlaying = isPlaying.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsPlaying]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsPlaying] (val x: Self) extends AnyVal {
    
    inline def setIsPlaying(value: Any): Self = StObject.set(x, "isPlaying", value.asInstanceOf[js.Any])
  }
}
