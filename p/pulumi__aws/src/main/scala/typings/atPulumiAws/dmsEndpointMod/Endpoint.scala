package typings.atPulumiAws.dmsEndpointMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.dmsNs.EndpointMongodbSettings
import typings.atPulumiAws.typesOutputMod.dmsNs.EndpointS3Settings
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
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
  val certificateArn: Output[String] = js.native
  /**
    * The name of the endpoint database.
    */
  val databaseName: Output[js.UndefOr[String]] = js.native
  /**
    * The Amazon Resource Name (ARN) for the endpoint.
    */
  val endpointArn: Output[String] = js.native
  /**
    * The database endpoint identifier.
    */
  val endpointId: Output[String] = js.native
  /**
    * The type of endpoint. Can be one of `source | target`.
    */
  val endpointType: Output[String] = js.native
  /**
    * The type of engine for the endpoint. Can be one of `aurora | azuredb | db2 | docdb | dynamodb | mariadb | mongodb | mysql | oracle | postgres | redshift | s3 | sqlserver | sybase`.
    */
  val engineName: Output[String] = js.native
  /**
    * Additional attributes associated with the connection. For available attributes see [Using Extra Connection Attributes with AWS Database Migration Service](http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Introduction.ConnectionAttributes.html).
    */
  val extraConnectionAttributes: Output[String] = js.native
  /**
    * The Amazon Resource Name (ARN) for the KMS key that will be used to encrypt the connection parameters. If you do not specify a value for `kmsKeyArn`, then AWS DMS will use your default encryption key. AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS region.
    */
  val kmsKeyArn: Output[String] = js.native
  /**
    * Settings for the source MongoDB endpoint. Available settings are `authType` (default: `password`), `authMechanism` (default: `default`), `nestingLevel` (default: `none`), `extractDocId` (default: `false`), `docsToInvestigate` (default: `1000`) and `authSource` (default: `admin`). For more details, see [Using MongoDB as a Source for AWS DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.MongoDB.html).
    */
  val mongodbSettings: Output[js.UndefOr[EndpointMongodbSettings]] = js.native
  /**
    * The password to be used to login to the endpoint database.
    */
  val password: Output[js.UndefOr[String]] = js.native
  /**
    * The port used by the endpoint database.
    */
  val port: Output[js.UndefOr[Double]] = js.native
  /**
    * Settings for the target S3 endpoint. Available settings are `serviceAccessRoleArn`, `externalTableDefinition`, `csvRowDelimiter` (default: `\\n`), `csvDelimiter` (default: `,`), `bucketFolder`, `bucketName` and `compressionType` (default: `NONE`). For more details, see [Using Amazon S3 as a Target for AWS Database Migration Service](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html).
    */
  val s3Settings: Output[js.UndefOr[EndpointS3Settings]] = js.native
  /**
    * The host name of the server.
    */
  val serverName: Output[js.UndefOr[String]] = js.native
  /**
    * The Amazon Resource Name (ARN) used by the service access IAM role for dynamodb endpoints.
    */
  val serviceAccessRole: Output[js.UndefOr[String]] = js.native
  /**
    * The SSL mode to use for the connection. Can be one of `none | require | verify-ca | verify-full`
    */
  val sslMode: Output[String] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * The user name to be used to login to the endpoint database.
    */
  val username: Output[js.UndefOr[String]] = js.native
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
    */
  def get(name: String, id: Input[ID]): Endpoint = js.native
  def get(name: String, id: Input[ID], state: EndpointState): Endpoint = js.native
  def get(name: String, id: Input[ID], state: EndpointState, opts: CustomResourceOptions): Endpoint = js.native
  /**
    * Returns true if the given object is an instance of Endpoint.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dms/endpoint.Endpoint */ Boolean = js.native
}

