package typings.atPulumiAws.appsyncDataSourceMod

import typings.atPulumiAws.typesOutputMod.appsync.DataSourceDynamodbConfig
import typings.atPulumiAws.typesOutputMod.appsync.DataSourceElasticsearchConfig
import typings.atPulumiAws.typesOutputMod.appsync.DataSourceHttpConfig
import typings.atPulumiAws.typesOutputMod.appsync.DataSourceLambdaConfig
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
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
  val apiId: Output[String] = js.native
  /**
    * The ARN
    */
  val arn: Output[String] = js.native
  /**
    * A description of the DataSource.
    */
  val description: Output[js.UndefOr[String]] = js.native
  /**
    * DynamoDB settings. See below
    */
  val dynamodbConfig: Output[js.UndefOr[DataSourceDynamodbConfig]] = js.native
  /**
    * Amazon Elasticsearch settings. See below
    */
  val elasticsearchConfig: Output[js.UndefOr[DataSourceElasticsearchConfig]] = js.native
  /**
    * HTTP settings. See below
    */
  val httpConfig: Output[js.UndefOr[DataSourceHttpConfig]] = js.native
  /**
    * AWS Lambda settings. See below
    */
  val lambdaConfig: Output[js.UndefOr[DataSourceLambdaConfig]] = js.native
  /**
    * A user-supplied name for the DataSource.
    */
  val name: Output[String] = js.native
  /**
    * The IAM service role ARN for the data source.
    */
  val serviceRoleArn: Output[js.UndefOr[String]] = js.native
  /**
    * The type of the DataSource. Valid values: `AWS_LAMBDA`, `AMAZON_DYNAMODB`, `AMAZON_ELASTICSEARCH`, `HTTP`, `NONE`.
    */
  val `type`: Output[String] = js.native
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

