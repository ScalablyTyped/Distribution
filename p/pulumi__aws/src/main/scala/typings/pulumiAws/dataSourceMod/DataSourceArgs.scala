package typings.pulumiAws.dataSourceMod

import typings.pulumiAws.inputMod.appsync.DataSourceDynamodbConfig
import typings.pulumiAws.inputMod.appsync.DataSourceElasticsearchConfig
import typings.pulumiAws.inputMod.appsync.DataSourceHttpConfig
import typings.pulumiAws.inputMod.appsync.DataSourceLambdaConfig
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceArgs extends js.Object {
  
  /**
    * The API ID for the GraphQL API for the DataSource.
    */
  val apiId: Input[String] = js.native
  
  /**
    * A description of the DataSource.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * DynamoDB settings. See below
    */
  val dynamodbConfig: js.UndefOr[Input[DataSourceDynamodbConfig]] = js.native
  
  /**
    * Amazon Elasticsearch settings. See below
    */
  val elasticsearchConfig: js.UndefOr[Input[DataSourceElasticsearchConfig]] = js.native
  
  /**
    * HTTP settings. See below
    */
  val httpConfig: js.UndefOr[Input[DataSourceHttpConfig]] = js.native
  
  /**
    * AWS Lambda settings. See below
    */
  val lambdaConfig: js.UndefOr[Input[DataSourceLambdaConfig]] = js.native
  
  /**
    * A user-supplied name for the DataSource.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * The IAM service role ARN for the data source.
    */
  val serviceRoleArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The type of the DataSource. Valid values: `AWS_LAMBDA`, `AMAZON_DYNAMODB`, `AMAZON_ELASTICSEARCH`, `HTTP`, `NONE`.
    */
  val `type`: Input[String] = js.native
}
object DataSourceArgs {
  
  @scala.inline
  def apply(apiId: Input[String], `type`: Input[String]): DataSourceArgs = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceArgs]
  }
  
  @scala.inline
  implicit class DataSourceArgsOps[Self <: DataSourceArgs] (val x: Self) extends AnyVal {
    
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
    def setApiId(value: Input[String]): Self = this.set("apiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDynamodbConfig(value: Input[DataSourceDynamodbConfig]): Self = this.set("dynamodbConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynamodbConfig: Self = this.set("dynamodbConfig", js.undefined)
    
    @scala.inline
    def setElasticsearchConfig(value: Input[DataSourceElasticsearchConfig]): Self = this.set("elasticsearchConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElasticsearchConfig: Self = this.set("elasticsearchConfig", js.undefined)
    
    @scala.inline
    def setHttpConfig(value: Input[DataSourceHttpConfig]): Self = this.set("httpConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpConfig: Self = this.set("httpConfig", js.undefined)
    
    @scala.inline
    def setLambdaConfig(value: Input[DataSourceLambdaConfig]): Self = this.set("lambdaConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLambdaConfig: Self = this.set("lambdaConfig", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setServiceRoleArn(value: Input[String]): Self = this.set("serviceRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceRoleArn: Self = this.set("serviceRoleArn", js.undefined)
  }
}
