package typings.satnav

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INavigationOptions extends StObject {
  
  var directions: js.UndefOr[js.Function1[/* params */ js.Any, js.Any]] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String | Callback] = js.undefined
}
object INavigationOptions {
  
  @scala.inline
  def apply(): INavigationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INavigationOptions]
  }
  
  @scala.inline
  implicit class INavigationOptionsMutableBuilder[Self <: INavigationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirections(value: /* params */ js.Any => js.Any): Self = StObject.set(x, "directions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDirectionsUndefined: Self = StObject.set(x, "directions", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setTitle(value: String | Callback): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleFunction0(value: () => Unit): Self = StObject.set(x, "title", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
