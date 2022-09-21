package typings.sequelize.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Skip extends StObject {
  
  var skip: js.UndefOr[js.Array[String]] = js.undefined
}
object Skip {
  
  inline def apply(): Skip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Skip]
  }
  
  extension [Self <: Skip](x: Self) {
    
    inline def setSkip(value: js.Array[String]): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    
    inline def setSkipVarargs(value: String*): Self = StObject.set(x, "skip", js.Array(value*))
  }
}
