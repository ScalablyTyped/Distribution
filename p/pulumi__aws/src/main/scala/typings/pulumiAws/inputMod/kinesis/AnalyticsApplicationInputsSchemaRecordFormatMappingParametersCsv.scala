package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsv extends StObject {
  
  /**
    * The Column Delimiter.
    */
  var recordColumnDelimiter: Input[String]
  
  /**
    * The Row Delimiter.
    */
  var recordRowDelimiter: Input[String]
}
object AnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsv {
  
  inline def apply(recordColumnDelimiter: Input[String], recordRowDelimiter: Input[String]): AnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsv = {
    val __obj = js.Dynamic.literal(recordColumnDelimiter = recordColumnDelimiter.asInstanceOf[js.Any], recordRowDelimiter = recordRowDelimiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsv]
  }
  
  extension [Self <: AnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsv](x: Self) {
    
    inline def setRecordColumnDelimiter(value: Input[String]): Self = StObject.set(x, "recordColumnDelimiter", value.asInstanceOf[js.Any])
    
    inline def setRecordRowDelimiter(value: Input[String]): Self = StObject.set(x, "recordRowDelimiter", value.asInstanceOf[js.Any])
  }
}
