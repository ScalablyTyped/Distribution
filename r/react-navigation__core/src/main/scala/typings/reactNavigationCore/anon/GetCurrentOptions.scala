package typings.reactNavigationCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCurrentOptions extends StObject {
  
  def addOptionsGetter(key: String, getter: js.Function0[js.UndefOr[js.Object | Null]]): js.Function0[Unit]
  
  def getCurrentOptions(): js.UndefOr[js.Object | Null]
}
object GetCurrentOptions {
  
  inline def apply(
    addOptionsGetter: (String, js.Function0[js.UndefOr[js.Object | Null]]) => js.Function0[Unit],
    getCurrentOptions: () => js.UndefOr[js.Object | Null]
  ): GetCurrentOptions = {
    val __obj = js.Dynamic.literal(addOptionsGetter = js.Any.fromFunction2(addOptionsGetter), getCurrentOptions = js.Any.fromFunction0(getCurrentOptions))
    __obj.asInstanceOf[GetCurrentOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCurrentOptions] (val x: Self) extends AnyVal {
    
    inline def setAddOptionsGetter(value: (String, js.Function0[js.UndefOr[js.Object | Null]]) => js.Function0[Unit]): Self = StObject.set(x, "addOptionsGetter", js.Any.fromFunction2(value))
    
    inline def setGetCurrentOptions(value: () => js.UndefOr[js.Object | Null]): Self = StObject.set(x, "getCurrentOptions", js.Any.fromFunction0(value))
  }
}
