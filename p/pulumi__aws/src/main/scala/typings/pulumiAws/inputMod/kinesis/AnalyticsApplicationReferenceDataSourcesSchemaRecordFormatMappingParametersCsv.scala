package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsv extends js.Object {
  /**
    * The Column Delimiter.
    */
  var recordColumnDelimiter: Input[String] = js.native
  /**
    * The Row Delimiter.
    */
  var recordRowDelimiter: Input[String] = js.native
}

object AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsv {
  @scala.inline
  def apply(recordColumnDelimiter: Input[String], recordRowDelimiter: Input[String]): AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsv = {
    val __obj = js.Dynamic.literal(recordColumnDelimiter = recordColumnDelimiter.asInstanceOf[js.Any], recordRowDelimiter = recordRowDelimiter.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsv]
  }
}

