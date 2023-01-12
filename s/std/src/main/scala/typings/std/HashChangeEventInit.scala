package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HashChangeEventInit
  extends StObject
     with EventInit {
  
  /* standard dom */
  var newURL: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var oldURL: js.UndefOr[java.lang.String] = js.undefined
}
object HashChangeEventInit {
  
  inline def apply(): HashChangeEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HashChangeEventInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HashChangeEventInit] (val x: Self) extends AnyVal {
    
    inline def setNewURL(value: java.lang.String): Self = StObject.set(x, "newURL", value.asInstanceOf[js.Any])
    
    inline def setNewURLUndefined: Self = StObject.set(x, "newURL", js.undefined)
    
    inline def setOldURL(value: java.lang.String): Self = StObject.set(x, "oldURL", value.asInstanceOf[js.Any])
    
    inline def setOldURLUndefined: Self = StObject.set(x, "oldURL", js.undefined)
  }
}
