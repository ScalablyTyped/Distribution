package typings.atPulumiAws.appsyncDataSourceMod

import typings.atPulumiAws.typesInputMod.appsync.DataSourceDynamodbConfig
import typings.atPulumiAws.typesInputMod.appsync.DataSourceElasticsearchConfig
import typings.atPulumiAws.typesInputMod.appsync.DataSourceHttpConfig
import typings.atPulumiAws.typesInputMod.appsync.DataSourceLambdaConfig
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceState extends js.Object {
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
  val dynamodbConfig: js.UndefOr[Input[DataSourceDynamodbConfig]] = js.undefined
  /**
    * Amazon Elasticsearch settings. See below
    */
  val elasticsearchConfig: js.UndefOr[Input[DataSourceElasticsearchConfig]] = js.undefined
  /**
    * HTTP settings. See below
    */
  val httpConfig: js.UndefOr[Input[DataSourceHttpConfig]] = js.undefined
  /**
    * AWS Lambda settings. See below
    */
  val lambdaConfig: js.UndefOr[Input[DataSourceLambdaConfig]] = js.undefined
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
  @scala.inline
  def apply(
    apiId: Input[String] = null,
    arn: Input[String] = null,
    description: Input[String] = null,
    dynamodbConfig: Input[DataSourceDynamodbConfig] = null,
    elasticsearchConfig: Input[DataSourceElasticsearchConfig] = null,
    httpConfig: Input[DataSourceHttpConfig] = null,
    lambdaConfig: Input[DataSourceLambdaConfig] = null,
    name: Input[String] = null,
    serviceRoleArn: Input[String] = null,
    `type`: Input[String] = null
  ): DataSourceState = {
    val __obj = js.Dynamic.literal()
    if (apiId != null) __obj.updateDynamic("apiId")(apiId.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (dynamodbConfig != null) __obj.updateDynamic("dynamodbConfig")(dynamodbConfig.asInstanceOf[js.Any])
    if (elasticsearchConfig != null) __obj.updateDynamic("elasticsearchConfig")(elasticsearchConfig.asInstanceOf[js.Any])
    if (httpConfig != null) __obj.updateDynamic("httpConfig")(httpConfig.asInstanceOf[js.Any])
    if (lambdaConfig != null) __obj.updateDynamic("lambdaConfig")(lambdaConfig.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (serviceRoleArn != null) __obj.updateDynamic("serviceRoleArn")(serviceRoleArn.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceState]
  }
}

