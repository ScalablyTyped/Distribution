package typings.reactWidgets.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Culture extends StObject {
  
  var culture: js.UndefOr[String] = js.undefined
  
  var firstOfWeek: js.UndefOr[Double] = js.undefined
}
object Culture {
  
  inline def apply(): Culture = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Culture]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Culture] (val x: Self) extends AnyVal {
    
    inline def setCulture(value: String): Self = StObject.set(x, "culture", value.asInstanceOf[js.Any])
    
    inline def setCultureUndefined: Self = StObject.set(x, "culture", js.undefined)
    
    inline def setFirstOfWeek(value: Double): Self = StObject.set(x, "firstOfWeek", value.asInstanceOf[js.Any])
    
    inline def setFirstOfWeekUndefined: Self = StObject.set(x, "firstOfWeek", js.undefined)
  }
}
