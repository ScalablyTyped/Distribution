package typings.pulumiAws.outputMod.kinesis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyticsApplicationOutputSchema extends StObject {
  
  /**
    * The Format Type of the records on the output stream. Can be `CSV` or `JSON`.
    */
  var recordFormatType: js.UndefOr[String] = js.undefined
}
object AnalyticsApplicationOutputSchema {
  
  inline def apply(): AnalyticsApplicationOutputSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyticsApplicationOutputSchema]
  }
  
  extension [Self <: AnalyticsApplicationOutputSchema](x: Self) {
    
    inline def setRecordFormatType(value: String): Self = StObject.set(x, "recordFormatType", value.asInstanceOf[js.Any])
    
    inline def setRecordFormatTypeUndefined: Self = StObject.set(x, "recordFormatType", js.undefined)
  }
}
