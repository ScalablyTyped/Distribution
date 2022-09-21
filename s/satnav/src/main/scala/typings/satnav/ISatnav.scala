package typings.satnav

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISatnav extends StObject {
  
  def change(onChange: js.Function3[/* hash */ String, /* params */ Any, /* old */ Any, Any]): ISatnav
  
  def go(): ISatnav
  
  def navigate(navigationOptions: INavigationOptions): ISatnav
  
  def otherwise(route: String): ISatnav
}
object ISatnav {
  
  inline def apply(
    change: js.Function3[/* hash */ String, /* params */ Any, /* old */ Any, Any] => ISatnav,
    go: () => ISatnav,
    navigate: INavigationOptions => ISatnav,
    otherwise: String => ISatnav
  ): ISatnav = {
    val __obj = js.Dynamic.literal(change = js.Any.fromFunction1(change), go = js.Any.fromFunction0(go), navigate = js.Any.fromFunction1(navigate), otherwise = js.Any.fromFunction1(otherwise))
    __obj.asInstanceOf[ISatnav]
  }
  
  extension [Self <: ISatnav](x: Self) {
    
    inline def setChange(value: js.Function3[/* hash */ String, /* params */ Any, /* old */ Any, Any] => ISatnav): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    inline def setGo(value: () => ISatnav): Self = StObject.set(x, "go", js.Any.fromFunction0(value))
    
    inline def setNavigate(value: INavigationOptions => ISatnav): Self = StObject.set(x, "navigate", js.Any.fromFunction1(value))
    
    inline def setOtherwise(value: String => ISatnav): Self = StObject.set(x, "otherwise", js.Any.fromFunction1(value))
  }
}
