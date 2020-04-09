package typings.pulumiAws.crawlerMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.glue.CrawlerCatalogTarget
import typings.pulumiAws.inputMod.glue.CrawlerDynamodbTarget
import typings.pulumiAws.inputMod.glue.CrawlerJdbcTarget
import typings.pulumiAws.inputMod.glue.CrawlerS3Target
import typings.pulumiAws.inputMod.glue.CrawlerSchemaChangePolicy
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CrawlerArgs extends js.Object {
  val catalogTargets: js.UndefOr[Input[js.Array[Input[CrawlerCatalogTarget]]]] = js.native
  /**
    * List of custom classifiers. By default, all AWS classifiers are included in a crawl, but these custom classifiers always override the default classifiers for a given classification.
    */
  val classifiers: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * JSON string of configuration information.
    */
  val configuration: js.UndefOr[Input[String]] = js.native
  /**
    * Glue database where results are written.
    */
  val databaseName: Input[String] = js.native
  /**
    * Description of the crawler.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * List of nested DynamoDB target arguments. See below.
    */
  val dynamodbTargets: js.UndefOr[Input[js.Array[Input[CrawlerDynamodbTarget]]]] = js.native
  /**
    * List of nested JBDC target arguments. See below.
    */
  val jdbcTargets: js.UndefOr[Input[js.Array[Input[CrawlerJdbcTarget]]]] = js.native
  /**
    * Name of the crawler.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The IAM role friendly name (including path without leading slash), or ARN of an IAM role, used by the crawler to access other resources.
    */
  val role: Input[String] = js.native
  /**
    * List nested Amazon S3 target arguments. See below.
    */
  val s3Targets: js.UndefOr[Input[js.Array[Input[CrawlerS3Target]]]] = js.native
  /**
    * A cron expression used to specify the schedule. For more information, see [Time-Based Schedules for Jobs and Crawlers](https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html). For example, to run something every day at 12:15 UTC, you would specify: `cron(15 12 * * ? *)`.
    */
  val schedule: js.UndefOr[Input[String]] = js.native
  /**
    * Policy for the crawler's update and deletion behavior.
    */
  val schemaChangePolicy: js.UndefOr[Input[CrawlerSchemaChangePolicy]] = js.native
  /**
    * The name of Security Configuration to be used by the crawler
    */
  val securityConfiguration: js.UndefOr[Input[String]] = js.native
  /**
    * The table prefix used for catalog tables that are created.
    */
  val tablePrefix: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object CrawlerArgs {
  @scala.inline
  def apply(
    databaseName: Input[String],
    role: Input[String],
    catalogTargets: Input[js.Array[Input[CrawlerCatalogTarget]]] = null,
    classifiers: Input[js.Array[Input[String]]] = null,
    configuration: Input[String] = null,
    description: Input[String] = null,
    dynamodbTargets: Input[js.Array[Input[CrawlerDynamodbTarget]]] = null,
    jdbcTargets: Input[js.Array[Input[CrawlerJdbcTarget]]] = null,
    name: Input[String] = null,
    s3Targets: Input[js.Array[Input[CrawlerS3Target]]] = null,
    schedule: Input[String] = null,
    schemaChangePolicy: Input[CrawlerSchemaChangePolicy] = null,
    securityConfiguration: Input[String] = null,
    tablePrefix: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): CrawlerArgs = {
    val __obj = js.Dynamic.literal(databaseName = databaseName.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    if (catalogTargets != null) __obj.updateDynamic("catalogTargets")(catalogTargets.asInstanceOf[js.Any])
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
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrawlerArgs]
  }
}

