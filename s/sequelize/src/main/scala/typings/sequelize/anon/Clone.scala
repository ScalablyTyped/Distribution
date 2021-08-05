package typings.sequelize.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Clone extends StObject {
  
  @JSName("clone")
  var clone_FClone: js.UndefOr[Boolean] = js.undefined
  
  var plain: js.UndefOr[Boolean] = js.undefined
}
object Clone {
  
  inline def apply(): Clone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Clone]
  }
  
  extension [Self <: Clone](x: Self) {
    
    inline def setClone_(value: Boolean): Self = StObject.set(x, "clone", value.asInstanceOf[js.Any])
    
    inline def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
    
    inline def setPlain(value: Boolean): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
    
    inline def setPlainUndefined: Self = StObject.set(x, "plain", js.undefined)
  }
}
