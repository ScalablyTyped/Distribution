package typings.satnav

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INavigationOptions extends StObject {
  
  var directions: js.UndefOr[js.Function1[/* params */ Any, Any]] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String | Callback] = js.undefined
}
object INavigationOptions {
  
  inline def apply(): INavigationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INavigationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: INavigationOptions] (val x: Self) extends AnyVal {
    
    inline def setDirections(value: /* params */ Any => Any): Self = StObject.set(x, "directions", js.Any.fromFunction1(value))
    
    inline def setDirectionsUndefined: Self = StObject.set(x, "directions", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setTitle(value: String | Callback): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleFunction0(value: () => Unit): Self = StObject.set(x, "title", js.Any.fromFunction0(value))
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
