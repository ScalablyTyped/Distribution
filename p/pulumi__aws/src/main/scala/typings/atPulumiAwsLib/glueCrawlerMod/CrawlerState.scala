package typings
package atPulumiAwsLib.glueCrawlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CrawlerState extends js.Object {
  /**
    * List of custom classifiers. By default, all AWS classifiers are included in a crawl, but these custom classifiers always override the default classifiers for a given classification.
    */
  val classifiers: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * JSON string of configuration information.
    */
  val configuration: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Glue database where results are written.
    */
  val databaseName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Description of the crawler.
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * List of nested DynamoDB target arguments. See below.
    */
  val dynamodbTargets: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_PathInput]]]
  ] = js.undefined
  /**
    * List of nested JBDC target arguments. See below.
    */
  val jdbcTargets: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ConnectionNameExclusions]]
    ]
  ] = js.undefined
  /**
    * Name of the crawler.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The IAM role friendly name (including path without leading slash), or ARN of an IAM role, used by the crawler to access other resources.
    */
  val role: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * List nested Amazon S3 target arguments. See below.
    */
  val s3Targets: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ExclusionsPath]]]
  ] = js.undefined
  /**
    * A cron expression used to specify the schedule. For more information, see [Time-Based Schedules for Jobs and Crawlers](https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html). For example, to run something every day at 12:15 UTC, you would specify: `cron(15 12 * * ? *)`.
    */
  val schedule: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Policy for the crawler's update and deletion behavior.
    */
  val schemaChangePolicy: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_DeleteBehaviorUpdateBehavior]
  ] = js.undefined
  /**
    * The name of Security Configuration to be used by the crawler
    */
  val securityConfiguration: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The table prefix used for catalog tables that are created.
    */
  val tablePrefix: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

