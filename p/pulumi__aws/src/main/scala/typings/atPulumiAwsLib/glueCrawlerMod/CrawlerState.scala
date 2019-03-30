package typings
package atPulumiAwsLib.glueCrawlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CrawlerState extends js.Object {
  /**
    * The ARN of the crawler
    */
  val arn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
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

object CrawlerState {
  @scala.inline
  def apply(
    arn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    classifiers: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    configuration: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    databaseName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    description: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    dynamodbTargets: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_PathInput]]] = null,
    jdbcTargets: atPulumiPulumiLib.outputMod.Input[
      js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ConnectionNameExclusions]]
    ] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    role: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    s3Targets: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ExclusionsPath]]] = null,
    schedule: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    schemaChangePolicy: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_DeleteBehaviorUpdateBehavior] = null,
    securityConfiguration: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    tablePrefix: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): CrawlerState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (classifiers != null) __obj.updateDynamic("classifiers")(classifiers.asInstanceOf[js.Any])
    if (configuration != null) __obj.updateDynamic("configuration")(configuration.asInstanceOf[js.Any])
    if (databaseName != null) __obj.updateDynamic("databaseName")(databaseName.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (dynamodbTargets != null) __obj.updateDynamic("dynamodbTargets")(dynamodbTargets.asInstanceOf[js.Any])
    if (jdbcTargets != null) __obj.updateDynamic("jdbcTargets")(jdbcTargets.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (s3Targets != null) __obj.updateDynamic("s3Targets")(s3Targets.asInstanceOf[js.Any])
    if (schedule != null) __obj.updateDynamic("schedule")(schedule.asInstanceOf[js.Any])
    if (schemaChangePolicy != null) __obj.updateDynamic("schemaChangePolicy")(schemaChangePolicy.asInstanceOf[js.Any])
    if (securityConfiguration != null) __obj.updateDynamic("securityConfiguration")(securityConfiguration.asInstanceOf[js.Any])
    if (tablePrefix != null) __obj.updateDynamic("tablePrefix")(tablePrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrawlerState]
  }
}

