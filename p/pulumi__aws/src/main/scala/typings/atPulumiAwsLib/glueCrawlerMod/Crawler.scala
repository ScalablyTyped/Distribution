package typings
package atPulumiAwsLib.glueCrawlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/glue/crawler", "Crawler")
@js.native
class Crawler protected ()
  extends atPulumiPulumiLib.pulumiMod.CustomResource {
  /**
    * Create a Crawler resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: CrawlerArgs) = this()
  def this(name: java.lang.String, args: CrawlerArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * List of custom classifiers. By default, all AWS classifiers are included in a crawl, but these custom classifiers always override the default classifiers for a given classification.
    */
  val classifiers: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
  /**
    * JSON string of configuration information.
    */
  val configuration: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Glue database where results are written.
    */
  val databaseName: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * Description of the crawler.
    */
  val description: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * List of nested DynamoDB target arguments. See below.
    */
  val dynamodbTargets: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_Path]]] = js.native
  /**
    * List of nested JBDC target arguments. See below.
    */
  val jdbcTargets: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_Exclusions]]] = js.native
  /**
    * Name of the crawler.
    */
  val name: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The IAM role friendly name (including path without leading slash), or ARN of an IAM role, used by the crawler to access other resources.
    */
  val role: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * List nested Amazon S3 target arguments. See below.
    */
  val s3Targets: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_ExclusionsPath]]] = js.native
  /**
    * A cron expression used to specify the schedule. For more information, see [Time-Based Schedules for Jobs and Crawlers](https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html). For example, to run something every day at 12:15 UTC, you would specify: `cron(15 12 * * ? *)`.
    */
  val schedule: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Policy for the crawler's update and deletion behavior.
    */
  val schemaChangePolicy: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[atPulumiAwsLib.Anon_DeleteBehavior]] = js.native
  /**
    * The name of Security Configuration to be used by the crawler
    */
  val securityConfiguration: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The table prefix used for catalog tables that are created.
    */
  val tablePrefix: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
}

@JSImport("@pulumi/aws/glue/crawler", "Crawler")
@js.native
object Crawler extends js.Object {
  /**
    * Get an existing Crawler resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.glueCrawlerMod.Crawler = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.glueCrawlerMod.CrawlerState
  ): atPulumiAwsLib.glueCrawlerMod.Crawler = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.glueCrawlerMod.CrawlerState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.glueCrawlerMod.Crawler = js.native
}

