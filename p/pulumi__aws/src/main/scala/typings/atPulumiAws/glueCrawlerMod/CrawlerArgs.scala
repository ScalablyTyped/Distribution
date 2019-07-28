package typings.atPulumiAws.glueCrawlerMod

import typings.atPulumiAws.Anon_ConnectionNameExclusions
import typings.atPulumiAws.Anon_DeleteBehaviorUpdateBehavior
import typings.atPulumiAws.Anon_ExclusionsPath
import typings.atPulumiAws.Anon_PathInput
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CrawlerArgs extends js.Object {
  /**
    * List of custom classifiers. By default, all AWS classifiers are included in a crawl, but these custom classifiers always override the default classifiers for a given classification.
    */
  val classifiers: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * JSON string of configuration information.
    */
  val configuration: js.UndefOr[Input[String]] = js.undefined
  /**
    * Glue database where results are written.
    */
  val databaseName: Input[String]
  /**
    * Description of the crawler.
    */
  val description: js.UndefOr[Input[String]] = js.undefined
  /**
    * List of nested DynamoDB target arguments. See below.
    */
  val dynamodbTargets: js.UndefOr[Input[js.Array[Input[Anon_PathInput]]]] = js.undefined
  /**
    * List of nested JBDC target arguments. See below.
    */
  val jdbcTargets: js.UndefOr[Input[js.Array[Input[Anon_ConnectionNameExclusions]]]] = js.undefined
  /**
    * Name of the crawler.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * The IAM role friendly name (including path without leading slash), or ARN of an IAM role, used by the crawler to access other resources.
    */
  val role: Input[String]
  /**
    * List nested Amazon S3 target arguments. See below.
    */
  val s3Targets: js.UndefOr[Input[js.Array[Input[Anon_ExclusionsPath]]]] = js.undefined
  /**
    * A cron expression used to specify the schedule. For more information, see [Time-Based Schedules for Jobs and Crawlers](https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html). For example, to run something every day at 12:15 UTC, you would specify: `cron(15 12 * * ? *)`.
    */
  val schedule: js.UndefOr[Input[String]] = js.undefined
  /**
    * Policy for the crawler's update and deletion behavior.
    */
  val schemaChangePolicy: js.UndefOr[Input[Anon_DeleteBehaviorUpdateBehavior]] = js.undefined
  /**
    * The name of Security Configuration to be used by the crawler
    */
  val securityConfiguration: js.UndefOr[Input[String]] = js.undefined
  /**
    * The table prefix used for catalog tables that are created.
    */
  val tablePrefix: js.UndefOr[Input[String]] = js.undefined
}

object CrawlerArgs {
  @scala.inline
  def apply(
    databaseName: Input[String],
    role: Input[String],
    classifiers: Input[js.Array[Input[String]]] = null,
    configuration: Input[String] = null,
    description: Input[String] = null,
    dynamodbTargets: Input[js.Array[Input[Anon_PathInput]]] = null,
    jdbcTargets: Input[js.Array[Input[Anon_ConnectionNameExclusions]]] = null,
    name: Input[String] = null,
    s3Targets: Input[js.Array[Input[Anon_ExclusionsPath]]] = null,
    schedule: Input[String] = null,
    schemaChangePolicy: Input[Anon_DeleteBehaviorUpdateBehavior] = null,
    securityConfiguration: Input[String] = null,
    tablePrefix: Input[String] = null
  ): CrawlerArgs = {
    val __obj = js.Dynamic.literal(databaseName = databaseName.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    if (classifiers != null) __obj.updateDynamic("classifiers")(classifiers.asInstanceOf[js.Any])
    if (configuration != null) __obj.updateDynamic("configuration")(configuration.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (dynamodbTargets != null) __obj.updateDynamic("dynamodbTargets")(dynamodbTargets.asInstanceOf[js.Any])
    if (jdbcTargets != null) __obj.updateDynamic("jdbcTargets")(jdbcTargets.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (s3Targets != null) __obj.updateDynamic("s3Targets")(s3Targets.asInstanceOf[js.Any])
    if (schedule != null) __obj.updateDynamic("schedule")(schedule.asInstanceOf[js.Any])
    if (schemaChangePolicy != null) __obj.updateDynamic("schemaChangePolicy")(schemaChangePolicy.asInstanceOf[js.Any])
    if (securityConfiguration != null) __obj.updateDynamic("securityConfiguration")(securityConfiguration.asInstanceOf[js.Any])
    if (tablePrefix != null) __obj.updateDynamic("tablePrefix")(tablePrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrawlerArgs]
  }
}

