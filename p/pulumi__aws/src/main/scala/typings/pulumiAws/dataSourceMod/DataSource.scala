package typings.pulumiAws.dataSourceMod

import typings.pulumiAws.outputMod.appsync.DataSourceDynamodbConfig
import typings.pulumiAws.outputMod.appsync.DataSourceElasticsearchConfig
import typings.pulumiAws.outputMod.appsync.DataSourceHttpConfig
import typings.pulumiAws.outputMod.appsync.DataSourceLambdaConfig
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/appsync/dataSource", "DataSource")
@js.native
class DataSource protected () extends CustomResource {
  /**
    * Create a DataSource resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: DataSourceArgs) = this()
  def this(name: String, args: DataSourceArgs, opts: CustomResourceOptions) = this()
  /**
    * The API ID for the GraphQL API for the DataSource.
    */
  val apiId: Output_[String] = js.native
  /**
    * The ARN
    */
  val arn: Output_[String] = js.native
  /**
    * A description of the DataSource.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  /**
    * DynamoDB settings. See below
    */
  val dynamodbConfig: Output_[js.UndefOr[DataSourceDynamodbConfig]] = js.native
  /**
    * Amazon Elasticsearch settings. See below
    */
  val elasticsearchConfig: Output_[js.UndefOr[DataSourceElasticsearchConfig]] = js.native
  /**
    * HTTP settings. See below
    */
  val httpConfig: Output_[js.UndefOr[DataSourceHttpConfig]] = js.native
  /**
    * AWS Lambda settings. See below
    */
  val lambdaConfig: Output_[js.UndefOr[DataSourceLambdaConfig]] = js.native
  /**
    * A user-supplied name for the DataSource.
    */
  val name: Output_[String] = js.native
  /**
    * The IAM service role ARN for the data source.
    */
  val serviceRoleArn: Output_[js.UndefOr[String]] = js.native
  /**
    * The type of the DataSource. Valid values: `AWS_LAMBDA`, `AMAZON_DYNAMODB`, `AMAZON_ELASTICSEARCH`, `HTTP`, `NONE`.
    */
  val `type`: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/appsync/dataSource", "DataSource")
@js.native
object DataSource extends js.Object {
  /**
    * Get an existing DataSource resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): DataSource = js.native
  def get(name: String, id: Input[ID], state: DataSourceState): DataSource = js.native
  def get(name: String, id: Input[ID], state: DataSourceState, opts: CustomResourceOptions): DataSource = js.native
  /**
    * Returns true if the given object is an instance of DataSource.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appsync/dataSource.DataSource */ Boolean = js.native
}

