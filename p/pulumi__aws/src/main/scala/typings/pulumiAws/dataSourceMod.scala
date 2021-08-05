package typings.pulumiAws

import typings.pulumiAws.outputMod.appsync.DataSourceDynamodbConfig
import typings.pulumiAws.outputMod.appsync.DataSourceElasticsearchConfig
import typings.pulumiAws.outputMod.appsync.DataSourceHttpConfig
import typings.pulumiAws.outputMod.appsync.DataSourceLambdaConfig
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataSourceMod {
  
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
  object DataSource {
    
    @JSImport("@pulumi/aws/appsync/dataSource", "DataSource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing DataSource resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): DataSource = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[DataSource]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): DataSource = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[DataSource]
    inline def get(name: String, id: Input[ID], state: DataSourceState): DataSource = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[DataSource]
    inline def get(name: String, id: Input[ID], state: DataSourceState, opts: CustomResourceOptions): DataSource = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[DataSource]
    
    /**
      * Returns true if the given object is an instance of DataSource.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appsync/dataSource.DataSource */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/appsync/dataSource.DataSource */ Boolean]
  }
  
  trait DataSourceArgs extends StObject {
    
    /**
      * The API ID for the GraphQL API for the DataSource.
      */
    val apiId: Input[String]
    
    /**
      * A description of the DataSource.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * DynamoDB settings. See below
      */
    val dynamodbConfig: js.UndefOr[Input[typings.pulumiAws.inputMod.appsync.DataSourceDynamodbConfig]] = js.undefined
    
    /**
      * Amazon Elasticsearch settings. See below
      */
    val elasticsearchConfig: js.UndefOr[Input[typings.pulumiAws.inputMod.appsync.DataSourceElasticsearchConfig]] = js.undefined
    
    /**
      * HTTP settings. See below
      */
    val httpConfig: js.UndefOr[Input[typings.pulumiAws.inputMod.appsync.DataSourceHttpConfig]] = js.undefined
    
    /**
      * AWS Lambda settings. See below
      */
    val lambdaConfig: js.UndefOr[Input[typings.pulumiAws.inputMod.appsync.DataSourceLambdaConfig]] = js.undefined
    
    /**
      * A user-supplied name for the DataSource.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The IAM service role ARN for the data source.
      */
    val serviceRoleArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The type of the DataSource. Valid values: `AWS_LAMBDA`, `AMAZON_DYNAMODB`, `AMAZON_ELASTICSEARCH`, `HTTP`, `NONE`.
      */
    val `type`: Input[String]
  }
  object DataSourceArgs {
    
    inline def apply(apiId: Input[String], `type`: Input[String]): DataSourceArgs = {
      val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataSourceArgs]
    }
    
    extension [Self <: DataSourceArgs](x: Self) {
      
      inline def setApiId(value: Input[String]): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDynamodbConfig(value: Input[typings.pulumiAws.inputMod.appsync.DataSourceDynamodbConfig]): Self = StObject.set(x, "dynamodbConfig", value.asInstanceOf[js.Any])
      
      inline def setDynamodbConfigUndefined: Self = StObject.set(x, "dynamodbConfig", js.undefined)
      
      inline def setElasticsearchConfig(value: Input[typings.pulumiAws.inputMod.appsync.DataSourceElasticsearchConfig]): Self = StObject.set(x, "elasticsearchConfig", value.asInstanceOf[js.Any])
      
      inline def setElasticsearchConfigUndefined: Self = StObject.set(x, "elasticsearchConfig", js.undefined)
      
      inline def setHttpConfig(value: Input[typings.pulumiAws.inputMod.appsync.DataSourceHttpConfig]): Self = StObject.set(x, "httpConfig", value.asInstanceOf[js.Any])
      
      inline def setHttpConfigUndefined: Self = StObject.set(x, "httpConfig", js.undefined)
      
      inline def setLambdaConfig(value: Input[typings.pulumiAws.inputMod.appsync.DataSourceLambdaConfig]): Self = StObject.set(x, "lambdaConfig", value.asInstanceOf[js.Any])
      
      inline def setLambdaConfigUndefined: Self = StObject.set(x, "lambdaConfig", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setServiceRoleArn(value: Input[String]): Self = StObject.set(x, "serviceRoleArn", value.asInstanceOf[js.Any])
      
      inline def setServiceRoleArnUndefined: Self = StObject.set(x, "serviceRoleArn", js.undefined)
      
      inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait DataSourceState extends StObject {
    
    /**
      * The API ID for the GraphQL API for the DataSource.
      */
    val apiId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ARN
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A description of the DataSource.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * DynamoDB settings. See below
      */
    val dynamodbConfig: js.UndefOr[Input[typings.pulumiAws.inputMod.appsync.DataSourceDynamodbConfig]] = js.undefined
    
    /**
      * Amazon Elasticsearch settings. See below
      */
    val elasticsearchConfig: js.UndefOr[Input[typings.pulumiAws.inputMod.appsync.DataSourceElasticsearchConfig]] = js.undefined
    
    /**
      * HTTP settings. See below
      */
    val httpConfig: js.UndefOr[Input[typings.pulumiAws.inputMod.appsync.DataSourceHttpConfig]] = js.undefined
    
    /**
      * AWS Lambda settings. See below
      */
    val lambdaConfig: js.UndefOr[Input[typings.pulumiAws.inputMod.appsync.DataSourceLambdaConfig]] = js.undefined
    
    /**
      * A user-supplied name for the DataSource.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The IAM service role ARN for the data source.
      */
    val serviceRoleArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The type of the DataSource. Valid values: `AWS_LAMBDA`, `AMAZON_DYNAMODB`, `AMAZON_ELASTICSEARCH`, `HTTP`, `NONE`.
      */
    val `type`: js.UndefOr[Input[String]] = js.undefined
  }
  object DataSourceState {
    
    inline def apply(): DataSourceState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataSourceState]
    }
    
    extension [Self <: DataSourceState](x: Self) {
      
      inline def setApiId(value: Input[String]): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
      
      inline def setApiIdUndefined: Self = StObject.set(x, "apiId", js.undefined)
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDynamodbConfig(value: Input[typings.pulumiAws.inputMod.appsync.DataSourceDynamodbConfig]): Self = StObject.set(x, "dynamodbConfig", value.asInstanceOf[js.Any])
      
      inline def setDynamodbConfigUndefined: Self = StObject.set(x, "dynamodbConfig", js.undefined)
      
      inline def setElasticsearchConfig(value: Input[typings.pulumiAws.inputMod.appsync.DataSourceElasticsearchConfig]): Self = StObject.set(x, "elasticsearchConfig", value.asInstanceOf[js.Any])
      
      inline def setElasticsearchConfigUndefined: Self = StObject.set(x, "elasticsearchConfig", js.undefined)
      
      inline def setHttpConfig(value: Input[typings.pulumiAws.inputMod.appsync.DataSourceHttpConfig]): Self = StObject.set(x, "httpConfig", value.asInstanceOf[js.Any])
      
      inline def setHttpConfigUndefined: Self = StObject.set(x, "httpConfig", js.undefined)
      
      inline def setLambdaConfig(value: Input[typings.pulumiAws.inputMod.appsync.DataSourceLambdaConfig]): Self = StObject.set(x, "lambdaConfig", value.asInstanceOf[js.Any])
      
      inline def setLambdaConfigUndefined: Self = StObject.set(x, "lambdaConfig", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setServiceRoleArn(value: Input[String]): Self = StObject.set(x, "serviceRoleArn", value.asInstanceOf[js.Any])
      
      inline def setServiceRoleArnUndefined: Self = StObject.set(x, "serviceRoleArn", js.undefined)
      
      inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
