package typings.schematicsAngular.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scripts extends StObject {
  
  var scripts: js.UndefOr[Boolean] = js.undefined
  
  var styles: js.UndefOr[Boolean] = js.undefined
}
object Scripts {
  
  inline def apply(): Scripts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Scripts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Scripts] (val x: Self) extends AnyVal {
    
    inline def setScripts(value: Boolean): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
    
    inline def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
    
    inline def setStyles(value: Boolean): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
