package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaselineValues
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var datetime: js.UndefOr[String] = js.undefined
  
  var job_id: js.UndefOr[String] = js.undefined
  
  var real_value: js.UndefOr[Double] = js.undefined
}
object BaselineValues {
  
  @scala.inline
  def apply(): BaselineValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaselineValues]
  }
  
  @scala.inline
  implicit class BaselineValuesMutableBuilder[Self <: BaselineValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatetime(value: String): Self = StObject.set(x, "datetime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatetimeUndefined: Self = StObject.set(x, "datetime", js.undefined)
    
    @scala.inline
    def setJob_id(value: String): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJob_idUndefined: Self = StObject.set(x, "job_id", js.undefined)
    
    @scala.inline
    def setReal_value(value: Double): Self = StObject.set(x, "real_value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReal_valueUndefined: Self = StObject.set(x, "real_value", js.undefined)
  }
}
