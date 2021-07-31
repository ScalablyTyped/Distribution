package typings.recharts.anon

import typings.recharts.mod.RechartsFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataKey extends StObject {
  
  var dataKey: String | Double | RechartsFunction
  
  var valueAccessor: js.UndefOr[scala.Nothing] = js.undefined
}
object DataKey {
  
  @scala.inline
  def apply(dataKey: String | Double | RechartsFunction): DataKey = {
    val __obj = js.Dynamic.literal(dataKey = dataKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataKey]
  }
  
  @scala.inline
  implicit class DataKeyMutableBuilder[Self <: DataKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataKey(value: String | Double | RechartsFunction): Self = StObject.set(x, "dataKey", value.asInstanceOf[js.Any])
  }
}
