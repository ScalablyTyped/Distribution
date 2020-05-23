package typings.pulumiAws.outputMod.kinesis

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDe extends js.Object {
  /**
    * When set to true, which is the default, Kinesis Data Firehose converts JSON keys to lowercase before deserializing them.
    */
  var caseInsensitive: js.UndefOr[Boolean] = js.native
  /**
    * A map of column names to JSON keys that aren't identical to the column names. This is useful when the JSON contains keys that are Hive keywords. For example, timestamp is a Hive keyword. If you have a JSON key named timestamp, set this parameter to `{ ts = "timestamp" }` to map this key to a column named ts.
    */
  var columnToJsonKeyMappings: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * When set to `true`, specifies that the names of the keys include dots and that you want Kinesis Data Firehose to replace them with underscores. This is useful because Apache Hive does not allow dots in column names. For example, if the JSON contains a key whose name is "a.b", you can define the column name to be "aB" when using this option. Defaults to `false`.
    */
  var convertDotsInJsonKeysToUnderscores: js.UndefOr[Boolean] = js.native
}

object FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDe {
  @scala.inline
  def apply(
    caseInsensitive: js.UndefOr[Boolean] = js.undefined,
    columnToJsonKeyMappings: StringDictionary[String] = null,
    convertDotsInJsonKeysToUnderscores: js.UndefOr[Boolean] = js.undefined
  ): FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDe = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseInsensitive)) __obj.updateDynamic("caseInsensitive")(caseInsensitive.get.asInstanceOf[js.Any])
    if (columnToJsonKeyMappings != null) __obj.updateDynamic("columnToJsonKeyMappings")(columnToJsonKeyMappings.asInstanceOf[js.Any])
    if (!js.isUndefined(convertDotsInJsonKeysToUnderscores)) __obj.updateDynamic("convertDotsInJsonKeysToUnderscores")(convertDotsInJsonKeysToUnderscores.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDe]
  }
}

