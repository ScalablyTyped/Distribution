package typings.pulumiAws

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object endpointMod {
  
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
  object Endpoint {
    
    @JSImport("@pulumi/aws/dms/endpoint", "Endpoint")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Endpoint resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Endpoint]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Endpoint]
    inline def get(name: String, id: Input[ID], state: EndpointState): Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Endpoint]
    inline def get(name: String, id: Input[ID], state: EndpointState, opts: CustomResourceOptions): Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Endpoint]
    
    /**
      * Returns true if the given object is an instance of Endpoint.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dms/endpoint.Endpoint */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/dms/endpoint.Endpoint */ Boolean]
  }
  
  trait EndpointArgs extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) for the certificate.
      */
    val certificateArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the endpoint database.
      */
    val databaseName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Configuration block with Elasticsearch settings. Detailed below.
      */
    val elasticsearchSettings: js.UndefOr[Input[typings.pulumiAws.inputMod.dms.EndpointElasticsearchSettings]] = js.undefined
    
    /**
      * The database endpoint identifier.
      */
    val endpointId: Input[String]
    
    /**
      * The type of endpoint. Can be one of `source | target`.
      */
    val endpointType: Input[String]
    
    /**
      * The type of engine for the endpoint. Can be one of `aurora | aurora-postgresql| azuredb | db2 | docdb | dynamodb | elasticsearch | kafka | kinesis | mariadb | mongodb | mysql | oracle | postgres | redshift | s3 | sqlserver | sybase`.
      */
    val engineName: Input[String]
    
    /**
      * Additional attributes associated with the connection. For available attributes see [Using Extra Connection Attributes with AWS Database Migration Service](http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Introduction.ConnectionAttributes.html).
      */
    val extraConnectionAttributes: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Configuration block with Kafka settings. Detailed below.
      */
    val kafkaSettings: js.UndefOr[Input[typings.pulumiAws.inputMod.dms.EndpointKafkaSettings]] = js.undefined
    
    /**
      * Configuration block with Kinesis settings. Detailed below.
      */
    val kinesisSettings: js.UndefOr[Input[typings.pulumiAws.inputMod.dms.EndpointKinesisSettings]] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) for the KMS key that will be used to encrypt the connection parameters. If you do not specify a value for `kmsKeyArn`, then AWS DMS will use your default encryption key. AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS region.
      */
    val kmsKeyArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Configuration block with MongoDB settings. Detailed below.
      */
    val mongodbSettings: js.UndefOr[Input[typings.pulumiAws.inputMod.dms.EndpointMongodbSettings]] = js.undefined
    
    /**
      * The password to be used to login to the endpoint database.
      */
    val password: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The port used by the endpoint database.
      */
    val port: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Configuration block with S3 settings. Detailed below.
      */
    val s3Settings: js.UndefOr[Input[typings.pulumiAws.inputMod.dms.EndpointS3Settings]] = js.undefined
    
    /**
      * The host name of the server.
      */
    val serverName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) used by the service access IAM role for dynamodb endpoints.
      */
    val serviceAccessRole: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The SSL mode to use for the connection. Can be one of `none | require | verify-ca | verify-full`
      */
    val sslMode: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The user name to be used to login to the endpoint database.
      */
    val username: js.UndefOr[Input[String]] = js.undefined
  }
  object EndpointArgs {
    
    inline def apply(endpointId: Input[String], endpointType: Input[String], engineName: Input[String]): EndpointArgs = {
      val __obj = js.Dynamic.literal(endpointId = endpointId.asInstanceOf[js.Any], endpointType = endpointType.asInstanceOf[js.Any], engineName = engineName.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointArgs]
    }
    
    extension [Self <: EndpointArgs](x: Self) {
      
      inline def setCertificateArn(value: Input[String]): Self = StObject.set(x, "certificateArn", value.asInstanceOf[js.Any])
      
      inline def setCertificateArnUndefined: Self = StObject.set(x, "certificateArn", js.undefined)
      
      inline def setDatabaseName(value: Input[String]): Self = StObject.set(x, "databaseName", value.asInstanceOf[js.Any])
      
      inline def setDatabaseNameUndefined: Self = StObject.set(x, "databaseName", js.undefined)
      
      inline def setElasticsearchSettings(value: Input[typings.pulumiAws.inputMod.dms.EndpointElasticsearchSettings]): Self = StObject.set(x, "elasticsearchSettings", value.asInstanceOf[js.Any])
      
      inline def setElasticsearchSettingsUndefined: Self = StObject.set(x, "elasticsearchSettings", js.undefined)
      
      inline def setEndpointId(value: Input[String]): Self = StObject.set(x, "endpointId", value.asInstanceOf[js.Any])
      
      inline def setEndpointType(value: Input[String]): Self = StObject.set(x, "endpointType", value.asInstanceOf[js.Any])
      
      inline def setEngineName(value: Input[String]): Self = StObject.set(x, "engineName", value.asInstanceOf[js.Any])
      
      inline def setExtraConnectionAttributes(value: Input[String]): Self = StObject.set(x, "extraConnectionAttributes", value.asInstanceOf[js.Any])
      
      inline def setExtraConnectionAttributesUndefined: Self = StObject.set(x, "extraConnectionAttributes", js.undefined)
      
      inline def setKafkaSettings(value: Input[typings.pulumiAws.inputMod.dms.EndpointKafkaSettings]): Self = StObject.set(x, "kafkaSettings", value.asInstanceOf[js.Any])
      
      inline def setKafkaSettingsUndefined: Self = StObject.set(x, "kafkaSettings", js.undefined)
      
      inline def setKinesisSettings(value: Input[typings.pulumiAws.inputMod.dms.EndpointKinesisSettings]): Self = StObject.set(x, "kinesisSettings", value.asInstanceOf[js.Any])
      
      inline def setKinesisSettingsUndefined: Self = StObject.set(x, "kinesisSettings", js.undefined)
      
      inline def setKmsKeyArn(value: Input[String]): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
      
      inline def setKmsKeyArnUndefined: Self = StObject.set(x, "kmsKeyArn", js.undefined)
      
      inline def setMongodbSettings(value: Input[typings.pulumiAws.inputMod.dms.EndpointMongodbSettings]): Self = StObject.set(x, "mongodbSettings", value.asInstanceOf[js.Any])
      
      inline def setMongodbSettingsUndefined: Self = StObject.set(x, "mongodbSettings", js.undefined)
      
      inline def setPassword(value: Input[String]): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setPort(value: Input[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setS3Settings(value: Input[typings.pulumiAws.inputMod.dms.EndpointS3Settings]): Self = StObject.set(x, "s3Settings", value.asInstanceOf[js.Any])
      
      inline def setS3SettingsUndefined: Self = StObject.set(x, "s3Settings", js.undefined)
      
      inline def setServerName(value: Input[String]): Self = StObject.set(x, "serverName", value.asInstanceOf[js.Any])
      
      inline def setServerNameUndefined: Self = StObject.set(x, "serverName", js.undefined)
      
      inline def setServiceAccessRole(value: Input[String]): Self = StObject.set(x, "serviceAccessRole", value.asInstanceOf[js.Any])
      
      inline def setServiceAccessRoleUndefined: Self = StObject.set(x, "serviceAccessRole", js.undefined)
      
      inline def setSslMode(value: Input[String]): Self = StObject.set(x, "sslMode", value.asInstanceOf[js.Any])
      
      inline def setSslModeUndefined: Self = StObject.set(x, "sslMode", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setUsername(value: Input[String]): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
  
  trait EndpointState extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) for the certificate.
      */
    val certificateArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the endpoint database.
      */
    val databaseName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Configuration block with Elasticsearch settings. Detailed below.
      */
    val elasticsearchSettings: js.UndefOr[Input[typings.pulumiAws.inputMod.dms.EndpointElasticsearchSettings]] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) for the endpoint.
      */
    val endpointArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The database endpoint identifier.
      */
    val endpointId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The type of endpoint. Can be one of `source | target`.
      */
    val endpointType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The type of engine for the endpoint. Can be one of `aurora | aurora-postgresql| azuredb | db2 | docdb | dynamodb | elasticsearch | kafka | kinesis | mariadb | mongodb | mysql | oracle | postgres | redshift | s3 | sqlserver | sybase`.
      */
    val engineName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Additional attributes associated with the connection. For available attributes see [Using Extra Connection Attributes with AWS Database Migration Service](http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Introduction.ConnectionAttributes.html).
      */
    val extraConnectionAttributes: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Configuration block with Kafka settings. Detailed below.
      */
    val kafkaSettings: js.UndefOr[Input[typings.pulumiAws.inputMod.dms.EndpointKafkaSettings]] = js.undefined
    
    /**
      * Configuration block with Kinesis settings. Detailed below.
      */
    val kinesisSettings: js.UndefOr[Input[typings.pulumiAws.inputMod.dms.EndpointKinesisSettings]] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) for the KMS key that will be used to encrypt the connection parameters. If you do not specify a value for `kmsKeyArn`, then AWS DMS will use your default encryption key. AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS region.
      */
    val kmsKeyArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Configuration block with MongoDB settings. Detailed below.
      */
    val mongodbSettings: js.UndefOr[Input[typings.pulumiAws.inputMod.dms.EndpointMongodbSettings]] = js.undefined
    
    /**
      * The password to be used to login to the endpoint database.
      */
    val password: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The port used by the endpoint database.
      */
    val port: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Configuration block with S3 settings. Detailed below.
      */
    val s3Settings: js.UndefOr[Input[typings.pulumiAws.inputMod.dms.EndpointS3Settings]] = js.undefined
    
    /**
      * The host name of the server.
      */
    val serverName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) used by the service access IAM role for dynamodb endpoints.
      */
    val serviceAccessRole: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The SSL mode to use for the connection. Can be one of `none | require | verify-ca | verify-full`
      */
    val sslMode: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The user name to be used to login to the endpoint database.
      */
    val username: js.UndefOr[Input[String]] = js.undefined
  }
  object EndpointState {
    
    inline def apply(): EndpointState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndpointState]
    }
    
    extension [Self <: EndpointState](x: Self) {
      
      inline def setCertificateArn(value: Input[String]): Self = StObject.set(x, "certificateArn", value.asInstanceOf[js.Any])
      
      inline def setCertificateArnUndefined: Self = StObject.set(x, "certificateArn", js.undefined)
      
      inline def setDatabaseName(value: Input[String]): Self = StObject.set(x, "databaseName", value.asInstanceOf[js.Any])
      
      inline def setDatabaseNameUndefined: Self = StObject.set(x, "databaseName", js.undefined)
      
      inline def setElasticsearchSettings(value: Input[typings.pulumiAws.inputMod.dms.EndpointElasticsearchSettings]): Self = StObject.set(x, "elasticsearchSettings", value.asInstanceOf[js.Any])
      
      inline def setElasticsearchSettingsUndefined: Self = StObject.set(x, "elasticsearchSettings", js.undefined)
      
      inline def setEndpointArn(value: Input[String]): Self = StObject.set(x, "endpointArn", value.asInstanceOf[js.Any])
      
      inline def setEndpointArnUndefined: Self = StObject.set(x, "endpointArn", js.undefined)
      
      inline def setEndpointId(value: Input[String]): Self = StObject.set(x, "endpointId", value.asInstanceOf[js.Any])
      
      inline def setEndpointIdUndefined: Self = StObject.set(x, "endpointId", js.undefined)
      
      inline def setEndpointType(value: Input[String]): Self = StObject.set(x, "endpointType", value.asInstanceOf[js.Any])
      
      inline def setEndpointTypeUndefined: Self = StObject.set(x, "endpointType", js.undefined)
      
      inline def setEngineName(value: Input[String]): Self = StObject.set(x, "engineName", value.asInstanceOf[js.Any])
      
      inline def setEngineNameUndefined: Self = StObject.set(x, "engineName", js.undefined)
      
      inline def setExtraConnectionAttributes(value: Input[String]): Self = StObject.set(x, "extraConnectionAttributes", value.asInstanceOf[js.Any])
      
      inline def setExtraConnectionAttributesUndefined: Self = StObject.set(x, "extraConnectionAttributes", js.undefined)
      
      inline def setKafkaSettings(value: Input[typings.pulumiAws.inputMod.dms.EndpointKafkaSettings]): Self = StObject.set(x, "kafkaSettings", value.asInstanceOf[js.Any])
      
      inline def setKafkaSettingsUndefined: Self = StObject.set(x, "kafkaSettings", js.undefined)
      
      inline def setKinesisSettings(value: Input[typings.pulumiAws.inputMod.dms.EndpointKinesisSettings]): Self = StObject.set(x, "kinesisSettings", value.asInstanceOf[js.Any])
      
      inline def setKinesisSettingsUndefined: Self = StObject.set(x, "kinesisSettings", js.undefined)
      
      inline def setKmsKeyArn(value: Input[String]): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
      
      inline def setKmsKeyArnUndefined: Self = StObject.set(x, "kmsKeyArn", js.undefined)
      
      inline def setMongodbSettings(value: Input[typings.pulumiAws.inputMod.dms.EndpointMongodbSettings]): Self = StObject.set(x, "mongodbSettings", value.asInstanceOf[js.Any])
      
      inline def setMongodbSettingsUndefined: Self = StObject.set(x, "mongodbSettings", js.undefined)
      
      inline def setPassword(value: Input[String]): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setPort(value: Input[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setS3Settings(value: Input[typings.pulumiAws.inputMod.dms.EndpointS3Settings]): Self = StObject.set(x, "s3Settings", value.asInstanceOf[js.Any])
      
      inline def setS3SettingsUndefined: Self = StObject.set(x, "s3Settings", js.undefined)
      
      inline def setServerName(value: Input[String]): Self = StObject.set(x, "serverName", value.asInstanceOf[js.Any])
      
      inline def setServerNameUndefined: Self = StObject.set(x, "serverName", js.undefined)
      
      inline def setServiceAccessRole(value: Input[String]): Self = StObject.set(x, "serviceAccessRole", value.asInstanceOf[js.Any])
      
      inline def setServiceAccessRoleUndefined: Self = StObject.set(x, "serviceAccessRole", js.undefined)
      
      inline def setSslMode(value: Input[String]): Self = StObject.set(x, "sslMode", value.asInstanceOf[js.Any])
      
      inline def setSslModeUndefined: Self = StObject.set(x, "sslMode", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setUsername(value: Input[String]): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
}
