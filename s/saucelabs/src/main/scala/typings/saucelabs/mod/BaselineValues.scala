package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaselineValues
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var datetime: js.UndefOr[String] = js.undefined
  
  var job_id: js.UndefOr[String] = js.undefined
  
  var real_value: js.UndefOr[Double] = js.undefined
}
object BaselineValues {
  
  inline def apply(): BaselineValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaselineValues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaselineValues] (val x: Self) extends AnyVal {
    
    inline def setDatetime(value: String): Self = StObject.set(x, "datetime", value.asInstanceOf[js.Any])
    
    inline def setDatetimeUndefined: Self = StObject.set(x, "datetime", js.undefined)
    
    inline def setJob_id(value: String): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    inline def setJob_idUndefined: Self = StObject.set(x, "job_id", js.undefined)
    
    inline def setReal_value(value: Double): Self = StObject.set(x, "real_value", value.asInstanceOf[js.Any])
    
    inline def setReal_valueUndefined: Self = StObject.set(x, "real_value", js.undefined)
  }
}
