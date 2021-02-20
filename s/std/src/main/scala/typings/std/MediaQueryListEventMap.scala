package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaQueryListEventMap extends StObject {
  
  var change: MediaQueryListEvent = js.native
}
object MediaQueryListEventMap {
  
  @scala.inline
  def apply(change: MediaQueryListEvent): MediaQueryListEventMap = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaQueryListEventMap]
  }
  
  @scala.inline
  implicit class MediaQueryListEventMapMutableBuilder[Self <: MediaQueryListEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChange(value: MediaQueryListEvent): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
  }
}
