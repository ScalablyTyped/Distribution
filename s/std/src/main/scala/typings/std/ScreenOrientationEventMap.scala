package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScreenOrientationEventMap extends StObject {
  
  /* standard dom */
  var change: Event
}
object ScreenOrientationEventMap {
  
  inline def apply(change: Event): ScreenOrientationEventMap = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenOrientationEventMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScreenOrientationEventMap] (val x: Self) extends AnyVal {
    
    inline def setChange(value: Event): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
  }
}
