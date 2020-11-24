package typings.pulumiAws.endpointMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.dms.EndpointElasticsearchSettings
import typings.pulumiAws.inputMod.dms.EndpointKafkaSettings
import typings.pulumiAws.inputMod.dms.EndpointKinesisSettings
import typings.pulumiAws.inputMod.dms.EndpointMongodbSettings
import typings.pulumiAws.inputMod.dms.EndpointS3Settings
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * Configuration block with Elasticsearch settings. Detailed below.
    */
  val elasticsearchSettings: js.UndefOr[Input[EndpointElasticsearchSettings]] = js.native
  
  /**
    * The database endpoint identifier.
    */
  val endpointId: Input[String] = js.native
  
  /**
    * The type of endpoint. Can be one of `source | target`.
    */
  val endpointType: Input[String] = js.native
  
  /**
    * The type of engine for the endpoint. Can be one of `aurora | aurora-postgresql| azuredb | db2 | docdb | dynamodb | elasticsearch | kafka | kinesis | mariadb | mongodb | mysql | oracle | postgres | redshift | s3 | sqlserver | sybase`.
    */
  val engineName: Input[String] = js.native
  
  /**
    * Additional attributes associated with the connection. For available attributes see [Using Extra Connection Attributes with AWS Database Migration Service](http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Introduction.ConnectionAttributes.html).
    */
  val extraConnectionAttributes: js.UndefOr[Input[String]] = js.native
  
  /**
    * Configuration block with Kafka settings. Detailed below.
    */
  val kafkaSettings: js.UndefOr[Input[EndpointKafkaSettings]] = js.native
  
  /**
    * Configuration block with Kinesis settings. Detailed below.
    */
  val kinesisSettings: js.UndefOr[Input[EndpointKinesisSettings]] = js.native
  
  /**
    * The Amazon Resource Name (ARN) for the KMS key that will be used to encrypt the connection parameters. If you do not specify a value for `kmsKeyArn`, then AWS DMS will use your default encryption key. AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS region.
    */
  val kmsKeyArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * Configuration block with MongoDB settings. Detailed below.
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
    * Configuration block with S3 settings. Detailed below.
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
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * The user name to be used to login to the endpoint database.
    */
  val username: js.UndefOr[Input[String]] = js.native
}
object EndpointArgs {
  
  @scala.inline
  def apply(endpointId: Input[String], endpointType: Input[String], engineName: Input[String]): EndpointArgs = {
    val __obj = js.Dynamic.literal(endpointId = endpointId.asInstanceOf[js.Any], endpointType = endpointType.asInstanceOf[js.Any], engineName = engineName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointArgs]
  }
  
  @scala.inline
  implicit class EndpointArgsOps[Self <: EndpointArgs] (val x: Self) extends AnyVal {
    
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
    def setEndpointId(value: Input[String]): Self = this.set("endpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointType(value: Input[String]): Self = this.set("endpointType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineName(value: Input[String]): Self = this.set("engineName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateArn(value: Input[String]): Self = this.set("certificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateArn: Self = this.set("certificateArn", js.undefined)
    
    @scala.inline
    def setDatabaseName(value: Input[String]): Self = this.set("databaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatabaseName: Self = this.set("databaseName", js.undefined)
    
    @scala.inline
    def setElasticsearchSettings(value: Input[EndpointElasticsearchSettings]): Self = this.set("elasticsearchSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElasticsearchSettings: Self = this.set("elasticsearchSettings", js.undefined)
    
    @scala.inline
    def setExtraConnectionAttributes(value: Input[String]): Self = this.set("extraConnectionAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtraConnectionAttributes: Self = this.set("extraConnectionAttributes", js.undefined)
    
    @scala.inline
    def setKafkaSettings(value: Input[EndpointKafkaSettings]): Self = this.set("kafkaSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKafkaSettings: Self = this.set("kafkaSettings", js.undefined)
    
    @scala.inline
    def setKinesisSettings(value: Input[EndpointKinesisSettings]): Self = this.set("kinesisSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKinesisSettings: Self = this.set("kinesisSettings", js.undefined)
    
    @scala.inline
    def setKmsKeyArn(value: Input[String]): Self = this.set("kmsKeyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyArn: Self = this.set("kmsKeyArn", js.undefined)
    
    @scala.inline
    def setMongodbSettings(value: Input[EndpointMongodbSettings]): Self = this.set("mongodbSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMongodbSettings: Self = this.set("mongodbSettings", js.undefined)
    
    @scala.inline
    def setPassword(value: Input[String]): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setPort(value: Input[Double]): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setS3Settings(value: Input[EndpointS3Settings]): Self = this.set("s3Settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3Settings: Self = this.set("s3Settings", js.undefined)
    
    @scala.inline
    def setServerName(value: Input[String]): Self = this.set("serverName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerName: Self = this.set("serverName", js.undefined)
    
    @scala.inline
    def setServiceAccessRole(value: Input[String]): Self = this.set("serviceAccessRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceAccessRole: Self = this.set("serviceAccessRole", js.undefined)
    
    @scala.inline
    def setSslMode(value: Input[String]): Self = this.set("sslMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslMode: Self = this.set("sslMode", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setUsername(value: Input[String]): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
}
