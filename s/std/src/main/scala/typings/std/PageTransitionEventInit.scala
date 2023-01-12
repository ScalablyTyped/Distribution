package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageTransitionEventInit
  extends StObject
     with EventInit {
  
  /* standard dom */
  var persisted: js.UndefOr[scala.Boolean] = js.undefined
}
object PageTransitionEventInit {
  
  inline def apply(): PageTransitionEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageTransitionEventInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PageTransitionEventInit] (val x: Self) extends AnyVal {
    
    inline def setPersisted(value: scala.Boolean): Self = StObject.set(x, "persisted", value.asInstanceOf[js.Any])
    
    inline def setPersistedUndefined: Self = StObject.set(x, "persisted", js.undefined)
  }
}
