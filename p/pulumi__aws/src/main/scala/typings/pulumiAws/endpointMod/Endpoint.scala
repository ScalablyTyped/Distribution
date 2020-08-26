package typings.pulumiAws.endpointMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.dms.EndpointElasticsearchSettings
import typings.pulumiAws.outputMod.dms.EndpointKafkaSettings
import typings.pulumiAws.outputMod.dms.EndpointKinesisSettings
import typings.pulumiAws.outputMod.dms.EndpointMongodbSettings
import typings.pulumiAws.outputMod.dms.EndpointS3Settings
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/dms/endpoint", "Endpoint")
@js.native
class Endpoint protected () extends CustomResource {
  /**
    * Create a Endpoint resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: EndpointArgs) = this()
  def this(name: String, args: EndpointArgs, opts: CustomResourceOptions) = this()
  /**
    * The Amazon Resource Name (ARN) for the certificate.
    */
  val certificateArn: Output_[String] = js.native
  /**
    * The name of the endpoint database.
    */
  val databaseName: Output_[js.UndefOr[String]] = js.native
  /**
    * Configuration block with Elasticsearch settings. Detailed below.
    */
  val elasticsearchSettings: Output_[js.UndefOr[EndpointElasticsearchSettings]] = js.native
  /**
    * The Amazon Resource Name (ARN) for the endpoint.
    */
  val endpointArn: Output_[String] = js.native
  /**
    * The database endpoint identifier.
    */
  val endpointId: Output_[String] = js.native
  /**
    * The type of endpoint. Can be one of `source | target`.
    */
  val endpointType: Output_[String] = js.native
  /**
    * The type of engine for the endpoint. Can be one of `aurora | aurora-postgresql| azuredb | db2 | docdb | dynamodb | elasticsearch | kafka | kinesis | mariadb | mongodb | mysql | oracle | postgres | redshift | s3 | sqlserver | sybase`.
    */
  val engineName: Output_[String] = js.native
  /**
    * Additional attributes associated with the connection. For available attributes see [Using Extra Connection Attributes with AWS Database Migration Service](http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Introduction.ConnectionAttributes.html).
    */
  val extraConnectionAttributes: Output_[String] = js.native
  /**
    * Configuration block with Kafka settings. Detailed below.
    */
  val kafkaSettings: Output_[js.UndefOr[EndpointKafkaSettings]] = js.native
  /**
    * Configuration block with Kinesis settings. Detailed below.
    */
  val kinesisSettings: Output_[js.UndefOr[EndpointKinesisSettings]] = js.native
  /**
    * The Amazon Resource Name (ARN) for the KMS key that will be used to encrypt the connection parameters. If you do not specify a value for `kmsKeyArn`, then AWS DMS will use your default encryption key. AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS region.
    */
  val kmsKeyArn: Output_[String] = js.native
  /**
    * Configuration block with MongoDB settings. Detailed below.
    */
  val mongodbSettings: Output_[js.UndefOr[EndpointMongodbSettings]] = js.native
  /**
    * The password to be used to login to the endpoint database.
    */
  val password: Output_[js.UndefOr[String]] = js.native
  /**
    * The port used by the endpoint database.
    */
  val port: Output_[js.UndefOr[Double]] = js.native
  /**
    * Configuration block with S3 settings. Detailed below.
    */
  val s3Settings: Output_[js.UndefOr[EndpointS3Settings]] = js.native
  /**
    * The host name of the server.
    */
  val serverName: Output_[js.UndefOr[String]] = js.native
  /**
    * The Amazon Resource Name (ARN) used by the service access IAM role for dynamodb endpoints.
    */
  val serviceAccessRole: Output_[js.UndefOr[String]] = js.native
  /**
    * The SSL mode to use for the connection. Can be one of `none | require | verify-ca | verify-full`
    */
  val sslMode: Output_[String] = js.native
  /**
    * A map of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  /**
    * The user name to be used to login to the endpoint database.
    */
  val username: Output_[js.UndefOr[String]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/dms/endpoint", "Endpoint")
@js.native
object Endpoint extends js.Object {
  /**
    * Get an existing Endpoint resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Endpoint = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Endpoint = js.native
  def get(name: String, id: Input[ID], state: EndpointState): Endpoint = js.native
  def get(name: String, id: Input[ID], state: EndpointState, opts: CustomResourceOptions): Endpoint = js.native
  /**
    * Returns true if the given object is an instance of Endpoint.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dms/endpoint.Endpoint */ Boolean = js.native
}

