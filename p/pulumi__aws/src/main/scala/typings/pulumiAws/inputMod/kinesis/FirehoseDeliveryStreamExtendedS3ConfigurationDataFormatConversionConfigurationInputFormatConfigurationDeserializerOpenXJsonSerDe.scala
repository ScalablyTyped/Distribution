package typings.pulumiAws.inputMod.kinesis

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDe extends StObject {
  
  /**
    * When set to true, which is the default, Kinesis Data Firehose converts JSON keys to lowercase before deserializing them.
    */
  var caseInsensitive: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * A map of column names to JSON keys that aren't identical to the column names. This is useful when the JSON contains keys that are Hive keywords. For example, timestamp is a Hive keyword. If you have a JSON key named timestamp, set this parameter to `{ ts = "timestamp" }` to map this key to a column named ts.
    */
  var columnToJsonKeyMappings: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  
  /**
    * When set to `true`, specifies that the names of the keys include dots and that you want Kinesis Data Firehose to replace them with underscores. This is useful because Apache Hive does not allow dots in column names. For example, if the JSON contains a key whose name is "a.b", you can define the column name to be "aB" when using this option. Defaults to `false`.
    */
  var convertDotsInJsonKeysToUnderscores: js.UndefOr[Input[Boolean]] = js.undefined
}
object FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDe {
  
  @scala.inline
  def apply(): FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDe]
  }
  
  @scala.inline
  implicit class FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDeMutableBuilder[Self <: FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDe] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaseInsensitive(value: Input[Boolean]): Self = StObject.set(x, "caseInsensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaseInsensitiveUndefined: Self = StObject.set(x, "caseInsensitive", js.undefined)
    
    @scala.inline
    def setColumnToJsonKeyMappings(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "columnToJsonKeyMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnToJsonKeyMappingsUndefined: Self = StObject.set(x, "columnToJsonKeyMappings", js.undefined)
    
    @scala.inline
    def setConvertDotsInJsonKeysToUnderscores(value: Input[Boolean]): Self = StObject.set(x, "convertDotsInJsonKeysToUnderscores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConvertDotsInJsonKeysToUnderscoresUndefined: Self = StObject.set(x, "convertDotsInJsonKeysToUnderscores", js.undefined)
  }
}
