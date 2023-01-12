package typings.redisSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EFCONSTRUCTION extends StObject {
  
  var EF_CONSTRUCTION: js.UndefOr[Double] = js.undefined
  
  var EF_RUNTIME: js.UndefOr[Double] = js.undefined
  
  var M: js.UndefOr[Double] = js.undefined
}
object EFCONSTRUCTION {
  
  inline def apply(): EFCONSTRUCTION = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EFCONSTRUCTION]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EFCONSTRUCTION] (val x: Self) extends AnyVal {
    
    inline def setEF_CONSTRUCTION(value: Double): Self = StObject.set(x, "EF_CONSTRUCTION", value.asInstanceOf[js.Any])
    
    inline def setEF_CONSTRUCTIONUndefined: Self = StObject.set(x, "EF_CONSTRUCTION", js.undefined)
    
    inline def setEF_RUNTIME(value: Double): Self = StObject.set(x, "EF_RUNTIME", value.asInstanceOf[js.Any])
    
    inline def setEF_RUNTIMEUndefined: Self = StObject.set(x, "EF_RUNTIME", js.undefined)
    
    inline def setM(value: Double): Self = StObject.set(x, "M", value.asInstanceOf[js.Any])
    
    inline def setMUndefined: Self = StObject.set(x, "M", js.undefined)
  }
}
