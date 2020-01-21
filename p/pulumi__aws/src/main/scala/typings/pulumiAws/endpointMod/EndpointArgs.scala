package typings.pulumiAws.endpointMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.dms.EndpointMongodbSettings
import typings.pulumiAws.inputMod.dms.EndpointS3Settings
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointArgs extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the certificate.
    */
  val certificateArn: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the endpoint database.
    */
  val databaseName: js.UndefOr[Input[String]] = js.native
  /**
    * The database endpoint identifier.
    */
  val endpointId: Input[String] = js.native
  /**
    * The type of endpoint. Can be one of `source | target`.
    */
  val endpointType: Input[String] = js.native
  /**
    * The type of engine for the endpoint. Can be one of `aurora | azuredb | db2 | docdb | dynamodb | mariadb | mongodb | mysql | oracle | postgres | redshift | s3 | sqlserver | sybase`.
    */
  val engineName: Input[String] = js.native
  /**
    * Additional attributes associated with the connection. For available attributes see [Using Extra Connection Attributes with AWS Database Migration Service](http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Introduction.ConnectionAttributes.html).
    */
  val extraConnectionAttributes: js.UndefOr[Input[String]] = js.native
  /**
    * The Amazon Resource Name (ARN) for the KMS key that will be used to encrypt the connection parameters. If you do not specify a value for `kmsKeyArn`, then AWS DMS will use your default encryption key. AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS region.
    */
  val kmsKeyArn: js.UndefOr[Input[String]] = js.native
  /**
    * Settings for the source MongoDB endpoint. Available settings are `authType` (default: `password`), `authMechanism` (default: `default`), `nestingLevel` (default: `none`), `extractDocId` (default: `false`), `docsToInvestigate` (default: `1000`) and `authSource` (default: `admin`). For more details, see [Using MongoDB as a Source for AWS DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.MongoDB.html).
    */
  val mongodbSettings: js.UndefOr[Input[EndpointMongodbSettings]] = js.native
  /**
    * The password to be used to login to the endpoint database.
    */
  val password: js.UndefOr[Input[String]] = js.native
  /**
    * The port used by the endpoint database.
    */
  val port: js.UndefOr[Input[Double]] = js.native
  /**
    * Settings for the target S3 endpoint. Available settings are `serviceAccessRoleArn`, `externalTableDefinition`, `csvRowDelimiter` (default: `\\n`), `csvDelimiter` (default: `,`), `bucketFolder`, `bucketName` and `compressionType` (default: `NONE`). For more details, see [Using Amazon S3 as a Target for AWS Database Migration Service](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html).
    */
  val s3Settings: js.UndefOr[Input[EndpointS3Settings]] = js.native
  /**
    * The host name of the server.
    */
  val serverName: js.UndefOr[Input[String]] = js.native
  /**
    * The Amazon Resource Name (ARN) used by the service access IAM role for dynamodb endpoints.
    */
  val serviceAccessRole: js.UndefOr[Input[String]] = js.native
  /**
    * The SSL mode to use for the connection. Can be one of `none | require | verify-ca | verify-full`
    */
  val sslMode: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The user name to be used to login to the endpoint database.
    */
  val username: js.UndefOr[Input[String]] = js.native
}

object EndpointArgs {
  @scala.inline
  def apply(
    endpointId: Input[String],
    endpointType: Input[String],
    engineName: Input[String],
    certificateArn: Input[String] = null,
    databaseName: Input[String] = null,
    extraConnectionAttributes: Input[String] = null,
    kmsKeyArn: Input[String] = null,
    mongodbSettings: Input[EndpointMongodbSettings] = null,
    password: Input[String] = null,
    port: Input[Double] = null,
    s3Settings: Input[EndpointS3Settings] = null,
    serverName: Input[String] = null,
    serviceAccessRole: Input[String] = null,
    sslMode: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    username: Input[String] = null
  ): EndpointArgs = {
    val __obj = js.Dynamic.literal(endpointId = endpointId.asInstanceOf[js.Any], endpointType = endpointType.asInstanceOf[js.Any], engineName = engineName.asInstanceOf[js.Any])
    if (certificateArn != null) __obj.updateDynamic("certificateArn")(certificateArn.asInstanceOf[js.Any])
    if (databaseName != null) __obj.updateDynamic("databaseName")(databaseName.asInstanceOf[js.Any])
    if (extraConnectionAttributes != null) __obj.updateDynamic("extraConnectionAttributes")(extraConnectionAttributes.asInstanceOf[js.Any])
    if (kmsKeyArn != null) __obj.updateDynamic("kmsKeyArn")(kmsKeyArn.asInstanceOf[js.Any])
    if (mongodbSettings != null) __obj.updateDynamic("mongodbSettings")(mongodbSettings.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (s3Settings != null) __obj.updateDynamic("s3Settings")(s3Settings.asInstanceOf[js.Any])
    if (serverName != null) __obj.updateDynamic("serverName")(serverName.asInstanceOf[js.Any])
    if (serviceAccessRole != null) __obj.updateDynamic("serviceAccessRole")(serviceAccessRole.asInstanceOf[js.Any])
    if (sslMode != null) __obj.updateDynamic("sslMode")(sslMode.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointArgs]
  }
}

