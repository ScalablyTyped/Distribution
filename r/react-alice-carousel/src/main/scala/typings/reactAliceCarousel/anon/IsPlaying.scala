package typings.reactAliceCarousel.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsPlaying extends StObject {
  
  var isPlaying: js.UndefOr[Boolean] = js.undefined
}
object IsPlaying {
  
  inline def apply(): IsPlaying = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsPlaying]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsPlaying] (val x: Self) extends AnyVal {
    
    inline def setIsPlaying(value: Boolean): Self = StObject.set(x, "isPlaying", value.asInstanceOf[js.Any])
    
    inline def setIsPlayingUndefined: Self = StObject.set(x, "isPlaying", js.undefined)
  }
}
