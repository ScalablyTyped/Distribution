package typings.recurlyRecurlyJs.anon

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataCollector extends StObject {
  
  var dataCollector: js.UndefOr[Boolean] = js.undefined
  
  var form: js.UndefOr[HTMLElement] = js.undefined
  
  var udf: js.UndefOr[StringDictionary[String | Double]] = js.undefined
}
object DataCollector {
  
  inline def apply(): DataCollector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataCollector]
  }
  
  extension [Self <: DataCollector](x: Self) {
    
    inline def setDataCollector(value: Boolean): Self = StObject.set(x, "dataCollector", value.asInstanceOf[js.Any])
    
    inline def setDataCollectorUndefined: Self = StObject.set(x, "dataCollector", js.undefined)
    
    inline def setForm(value: HTMLElement): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setUdf(value: StringDictionary[String | Double]): Self = StObject.set(x, "udf", value.asInstanceOf[js.Any])
    
    inline def setUdfUndefined: Self = StObject.set(x, "udf", js.undefined)
  }
}
