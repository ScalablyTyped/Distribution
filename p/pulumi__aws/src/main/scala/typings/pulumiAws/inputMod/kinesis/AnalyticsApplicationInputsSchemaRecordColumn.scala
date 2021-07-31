package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyticsApplicationInputsSchemaRecordColumn extends StObject {
  
  /**
    * The Mapping reference to the data element.
    */
  var mapping: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Name of the column.
    */
  var name: Input[String]
  
  /**
    * The SQL Type of the column.
    */
  var sqlType: Input[String]
}
object AnalyticsApplicationInputsSchemaRecordColumn {
  
  @scala.inline
  def apply(name: Input[String], sqlType: Input[String]): AnalyticsApplicationInputsSchemaRecordColumn = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], sqlType = sqlType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationInputsSchemaRecordColumn]
  }
  
  @scala.inline
  implicit class AnalyticsApplicationInputsSchemaRecordColumnMutableBuilder[Self <: AnalyticsApplicationInputsSchemaRecordColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMapping(value: Input[String]): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMappingUndefined: Self = StObject.set(x, "mapping", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqlType(value: Input[String]): Self = StObject.set(x, "sqlType", value.asInstanceOf[js.Any])
  }
}
