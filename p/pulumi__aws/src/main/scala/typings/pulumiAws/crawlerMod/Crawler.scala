package typings.pulumiAws.crawlerMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.glue.CrawlerCatalogTarget
import typings.pulumiAws.outputMod.glue.CrawlerDynamodbTarget
import typings.pulumiAws.outputMod.glue.CrawlerJdbcTarget
import typings.pulumiAws.outputMod.glue.CrawlerMongodbTarget
import typings.pulumiAws.outputMod.glue.CrawlerS3Target
import typings.pulumiAws.outputMod.glue.CrawlerSchemaChangePolicy
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/glue/crawler", "Crawler")
@js.native
class Crawler protected () extends CustomResource {
  /**
    * Create a Crawler resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: CrawlerArgs) = this()
  def this(name: String, args: CrawlerArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The ARN of the crawler
    */
  val arn: Output_[String] = js.native
  
  val catalogTargets: Output_[js.UndefOr[js.Array[CrawlerCatalogTarget]]] = js.native
  
  /**
    * List of custom classifiers. By default, all AWS classifiers are included in a crawl, but these custom classifiers always override the default classifiers for a given classification.
    */
  val classifiers: Output_[js.UndefOr[js.Array[String]]] = js.native
  
  /**
    * JSON string of configuration information.
    */
  val configuration: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Glue database where results are written.
    */
  val databaseName: Output_[String] = js.native
  
  /**
    * Description of the crawler.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  
  /**
    * List of nested DynamoDB target arguments. See below.
    */
  val dynamodbTargets: Output_[js.UndefOr[js.Array[CrawlerDynamodbTarget]]] = js.native
  
  /**
    * List of nested JBDC target arguments. See below.
    */
  val jdbcTargets: Output_[js.UndefOr[js.Array[CrawlerJdbcTarget]]] = js.native
  
  /**
    * List nested MongoDB target arguments. See below.
    */
  val mongodbTargets: Output_[js.UndefOr[js.Array[CrawlerMongodbTarget]]] = js.native
  
  /**
    * Name of the crawler.
    */
  val name: Output_[String] = js.native
  
  /**
    * The IAM role friendly name (including path without leading slash), or ARN of an IAM role, used by the crawler to access other resources.
    */
  val role: Output_[String] = js.native
  
  /**
    * List nested Amazon S3 target arguments. See below.
    */
  val s3Targets: Output_[js.UndefOr[js.Array[CrawlerS3Target]]] = js.native
  
  /**
    * A cron expression used to specify the schedule. For more information, see [Time-Based Schedules for Jobs and Crawlers](https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html). For example, to run something every day at 12:15 UTC, you would specify: `cron(15 12 * * ? *)`.
    */
  val schedule: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Policy for the crawler's update and deletion behavior.
    */
  val schemaChangePolicy: Output_[js.UndefOr[CrawlerSchemaChangePolicy]] = js.native
  
  /**
    * The name of Security Configuration to be used by the crawler
    */
  val securityConfiguration: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The table prefix used for catalog tables that are created.
    */
  val tablePrefix: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Key-value map of resource tags
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
}
/* static members */
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
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Crawler = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Crawler = js.native
  def get(name: String, id: Input[ID], state: CrawlerState): Crawler = js.native
  def get(name: String, id: Input[ID], state: CrawlerState, opts: CustomResourceOptions): Crawler = js.native
  
  /**
    * Returns true if the given object is an instance of Crawler.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/crawler.Crawler */ Boolean = js.native
}
