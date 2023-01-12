package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaQueryListEventInit
  extends StObject
     with EventInit {
  
  /* standard dom */
  var matches: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard dom */
  var media: js.UndefOr[java.lang.String] = js.undefined
}
object MediaQueryListEventInit {
  
  inline def apply(): MediaQueryListEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaQueryListEventInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaQueryListEventInit] (val x: Self) extends AnyVal {
    
    inline def setMatches(value: scala.Boolean): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    inline def setMatchesUndefined: Self = StObject.set(x, "matches", js.undefined)
    
    inline def setMedia(value: java.lang.String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
  }
}
