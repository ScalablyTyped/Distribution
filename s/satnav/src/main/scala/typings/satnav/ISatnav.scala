package typings.satnav

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISatnav extends StObject {
  
  def change(onChange: js.Function3[/* hash */ String, /* params */ js.Any, /* old */ js.Any, _]): ISatnav = js.native
  
  def go(): ISatnav = js.native
  
  def navigate(navigationOptions: INavigationOptions): ISatnav = js.native
  
  def otherwise(route: String): ISatnav = js.native
}
object ISatnav {
  
  @scala.inline
  def apply(
    change: js.Function3[/* hash */ String, /* params */ js.Any, /* old */ js.Any, _] => ISatnav,
    go: () => ISatnav,
    navigate: INavigationOptions => ISatnav,
    otherwise: String => ISatnav
  ): ISatnav = {
    val __obj = js.Dynamic.literal(change = js.Any.fromFunction1(change), go = js.Any.fromFunction0(go), navigate = js.Any.fromFunction1(navigate), otherwise = js.Any.fromFunction1(otherwise))
    __obj.asInstanceOf[ISatnav]
  }
  
  @scala.inline
  implicit class ISatnavMutableBuilder[Self <: ISatnav] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChange(value: js.Function3[/* hash */ String, /* params */ js.Any, /* old */ js.Any, _] => ISatnav): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGo(value: () => ISatnav): Self = StObject.set(x, "go", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNavigate(value: INavigationOptions => ISatnav): Self = StObject.set(x, "navigate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOtherwise(value: String => ISatnav): Self = StObject.set(x, "otherwise", js.Any.fromFunction1(value))
  }
}
