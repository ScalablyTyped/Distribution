package typings.sipJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Once extends StObject {
  
  var once: js.UndefOr[Boolean] = js.undefined
}
object Once {
  
  inline def apply(): Once = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Once]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Once] (val x: Self) extends AnyVal {
    
    inline def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
    
    inline def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
  }
}
