package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaQueryListEventInit extends EventInit {
  
  var matches: js.UndefOr[scala.Boolean] = js.native
  
  var media: js.UndefOr[java.lang.String] = js.native
}
object MediaQueryListEventInit {
  
  @scala.inline
  def apply(): MediaQueryListEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaQueryListEventInit]
  }
  
  @scala.inline
  implicit class MediaQueryListEventInitMutableBuilder[Self <: MediaQueryListEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMatches(value: scala.Boolean): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchesUndefined: Self = StObject.set(x, "matches", js.undefined)
    
    @scala.inline
    def setMedia(value: java.lang.String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
  }
}
