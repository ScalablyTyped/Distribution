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
trait CrawlerState extends js.Object {
  /**
    * The ARN of the crawler
    */
  val arn: js.UndefOr[Input[String]] = js.native
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
  val databaseName: js.UndefOr[Input[String]] = js.native
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
  val role: js.UndefOr[Input[String]] = js.native
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
    * Key-value map of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object CrawlerState {
  @scala.inline
  def apply(): CrawlerState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrawlerState]
  }
  @scala.inline
  implicit class CrawlerStateOps[Self <: CrawlerState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setCatalogTargetsVarargs(value: Input[CrawlerCatalogTarget]*): Self = this.set("catalogTargets", js.Array(value :_*))
    @scala.inline
    def setCatalogTargets(value: Input[js.Array[Input[CrawlerCatalogTarget]]]): Self = this.set("catalogTargets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCatalogTargets: Self = this.set("catalogTargets", js.undefined)
    @scala.inline
    def setClassifiersVarargs(value: Input[String]*): Self = this.set("classifiers", js.Array(value :_*))
    @scala.inline
    def setClassifiers(value: Input[js.Array[Input[String]]]): Self = this.set("classifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassifiers: Self = this.set("classifiers", js.undefined)
    @scala.inline
    def setConfiguration(value: Input[String]): Self = this.set("configuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfiguration: Self = this.set("configuration", js.undefined)
    @scala.inline
    def setDatabaseName(value: Input[String]): Self = this.set("databaseName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatabaseName: Self = this.set("databaseName", js.undefined)
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDynamodbTargetsVarargs(value: Input[CrawlerDynamodbTarget]*): Self = this.set("dynamodbTargets", js.Array(value :_*))
    @scala.inline
    def setDynamodbTargets(value: Input[js.Array[Input[CrawlerDynamodbTarget]]]): Self = this.set("dynamodbTargets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDynamodbTargets: Self = this.set("dynamodbTargets", js.undefined)
    @scala.inline
    def setJdbcTargetsVarargs(value: Input[CrawlerJdbcTarget]*): Self = this.set("jdbcTargets", js.Array(value :_*))
    @scala.inline
    def setJdbcTargets(value: Input[js.Array[Input[CrawlerJdbcTarget]]]): Self = this.set("jdbcTargets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJdbcTargets: Self = this.set("jdbcTargets", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRole(value: Input[String]): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    @scala.inline
    def setS3TargetsVarargs(value: Input[CrawlerS3Target]*): Self = this.set("s3Targets", js.Array(value :_*))
    @scala.inline
    def setS3Targets(value: Input[js.Array[Input[CrawlerS3Target]]]): Self = this.set("s3Targets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3Targets: Self = this.set("s3Targets", js.undefined)
    @scala.inline
    def setSchedule(value: Input[String]): Self = this.set("schedule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchedule: Self = this.set("schedule", js.undefined)
    @scala.inline
    def setSchemaChangePolicy(value: Input[CrawlerSchemaChangePolicy]): Self = this.set("schemaChangePolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchemaChangePolicy: Self = this.set("schemaChangePolicy", js.undefined)
    @scala.inline
    def setSecurityConfiguration(value: Input[String]): Self = this.set("securityConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityConfiguration: Self = this.set("securityConfiguration", js.undefined)
    @scala.inline
    def setTablePrefix(value: Input[String]): Self = this.set("tablePrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTablePrefix: Self = this.set("tablePrefix", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

