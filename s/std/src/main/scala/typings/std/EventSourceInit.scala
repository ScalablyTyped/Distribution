package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventSourceInit extends StObject {
  
  /* standard dom */
  var withCredentials: js.UndefOr[scala.Boolean] = js.undefined
}
object EventSourceInit {
  
  inline def apply(): EventSourceInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventSourceInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventSourceInit] (val x: Self) extends AnyVal {
    
    inline def setWithCredentials(value: scala.Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
  }
}
