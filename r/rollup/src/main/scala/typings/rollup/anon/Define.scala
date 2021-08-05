package typings.rollup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Define extends StObject {
  
  var define: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
}
object Define {
  
  inline def apply(): Define = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Define]
  }
  
  extension [Self <: Define](x: Self) {
    
    inline def setDefine(value: String): Self = StObject.set(x, "define", value.asInstanceOf[js.Any])
    
    inline def setDefineUndefined: Self = StObject.set(x, "define", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
