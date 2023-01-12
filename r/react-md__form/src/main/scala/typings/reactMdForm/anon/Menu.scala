package typings.reactMdForm.anon

import typings.reactMdForm.reactMdFormBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Menu extends StObject {
  
  var menu: js.UndefOr[`false`] = js.undefined
}
object Menu {
  
  inline def apply(): Menu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Menu]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Menu] (val x: Self) extends AnyVal {
    
    inline def setMenu(value: `false`): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    inline def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
  }
}
