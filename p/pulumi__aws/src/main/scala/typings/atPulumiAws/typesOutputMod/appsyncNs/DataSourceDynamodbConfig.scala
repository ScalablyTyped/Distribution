package typings.atPulumiAws.typesOutputMod.appsyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceDynamodbConfig extends js.Object {
  /**
    * AWS region of Elasticsearch domain. Defaults to current region.
    */
  var region: String
  /**
    * Name of the DynamoDB table.
    */
  var tableName: String
  /**
    * Set to `true` to use Amazon Cognito credentials with this data source.
    */
  var useCallerCredentials: js.UndefOr[Boolean] = js.undefined
}

object DataSourceDynamodbConfig {
  @scala.inline
  def apply(region: String, tableName: String, useCallerCredentials: js.UndefOr[Boolean] = js.undefined): DataSourceDynamodbConfig = {
    val __obj = js.Dynamic.literal(region = region, tableName = tableName)
    if (!js.isUndefined(useCallerCredentials)) __obj.updateDynamic("useCallerCredentials")(useCallerCredentials)
    __obj.asInstanceOf[DataSourceDynamodbConfig]
  }
}

