package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NativeUIEvent extends StObject {
  
  /**
    * Returns a long with details about the event, depending on the event type.
    */
  val detail: Double
}
object NativeUIEvent {
  
  inline def apply(detail: Double): NativeUIEvent = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeUIEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NativeUIEvent] (val x: Self) extends AnyVal {
    
    inline def setDetail(value: Double): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
  }
}
