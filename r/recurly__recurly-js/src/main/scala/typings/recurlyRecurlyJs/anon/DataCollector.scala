package typings.recurlyRecurlyJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataCollector extends StObject {
  
  var dataCollector: js.UndefOr[Boolean] = js.undefined
}
object DataCollector {
  
  inline def apply(): DataCollector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataCollector]
  }
  
  extension [Self <: DataCollector](x: Self) {
    
    inline def setDataCollector(value: Boolean): Self = StObject.set(x, "dataCollector", value.asInstanceOf[js.Any])
    
    inline def setDataCollectorUndefined: Self = StObject.set(x, "dataCollector", js.undefined)
  }
}
