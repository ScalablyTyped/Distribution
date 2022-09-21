package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaQueryListEventMap extends StObject {
  
  /* standard dom */
  var change: MediaQueryListEvent
}
object MediaQueryListEventMap {
  
  inline def apply(change: MediaQueryListEvent): MediaQueryListEventMap = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaQueryListEventMap]
  }
  
  extension [Self <: MediaQueryListEventMap](x: Self) {
    
    inline def setChange(value: MediaQueryListEvent): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
  }
}
