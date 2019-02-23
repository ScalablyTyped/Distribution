package typings
package atPulumiAwsLib.curGetReportDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetReportDefinitionResult extends js.Object {
  /**
    * A list of additional artifacts.
    */
  val additionalArtifacts: js.Array[java.lang.String]
  /**
    * A list of schema elements.
    */
  val additionalSchemaElements: js.Array[java.lang.String]
  /**
    * Preferred format for report.
    */
  val compression: java.lang.String
  /**
    * Preferred compression format for report.
    */
  val format: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * Name of customer S3 bucket.
    */
  val s3Bucket: java.lang.String
  /**
    * Preferred report path prefix.
    */
  val s3Prefix: java.lang.String
  /**
    * Region of customer S3 bucket.
    */
  val s3Region: java.lang.String
  /**
    * The frequency on which report data are measured and displayed.
    */
  val timeUnit: java.lang.String
}

