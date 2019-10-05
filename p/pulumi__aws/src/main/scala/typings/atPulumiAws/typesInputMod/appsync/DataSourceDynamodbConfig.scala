package typings.atPulumiAws.typesInputMod.appsync

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceDynamodbConfig extends js.Object {
  /**
    * AWS region of Elasticsearch domain. Defaults to current region.
    */
  var region: js.UndefOr[Input[String]] = js.undefined
  /**
    * Name of the DynamoDB table.
    */
  var tableName: Input[String]
  /**
    * Set to `true` to use Amazon Cognito credentials with this data source.
    */
  var useCallerCredentials: js.UndefOr[Input[Boolean]] = js.undefined
}

object DataSourceDynamodbConfig {
  @scala.inline
  def apply(
    tableName: Input[String],
    region: Input[String] = null,
    useCallerCredentials: Input[Boolean] = null
  ): DataSourceDynamodbConfig = {
    val __obj = js.Dynamic.literal(tableName = tableName.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (useCallerCredentials != null) __obj.updateDynamic("useCallerCredentials")(useCallerCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceDynamodbConfig]
  }
}

