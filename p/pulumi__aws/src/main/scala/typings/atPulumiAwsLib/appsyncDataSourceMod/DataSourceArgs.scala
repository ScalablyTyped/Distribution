package typings
package atPulumiAwsLib.appsyncDataSourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceArgs extends js.Object {
  /**
    * The API ID for the GraphQL API for the DataSource.
    */
  val apiId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * A description of the DataSource.
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * DynamoDB settings. See below
    */
  val dynamodbConfig: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_RegionTableName]] = js.undefined
  /**
    * Amazon Elasticsearch settings. See below
    */
  val elasticsearchConfig: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_EndpointRegion]] = js.undefined
  /**
    * HTTP settings. See below
    */
  val httpConfig: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_EndpointInput]] = js.undefined
  /**
    * AWS Lambda settings. See below
    */
  val lambdaConfig: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_FunctionArnInput]] = js.undefined
  /**
    * A user-supplied name for the DataSource.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The IAM service role ARN for the data source.
    */
  val serviceRoleArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The type of the DataSource. Valid values: `AWS_LAMBDA`, `AMAZON_DYNAMODB`, `AMAZON_ELASTICSEARCH`, `HTTP`, `NONE`.
    */
  val `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

