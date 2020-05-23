package typings.pulumiAws.outputMod.appsync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceDynamodbConfig extends js.Object {
  /**
    * AWS region of Elasticsearch domain. Defaults to current region.
    */
  var region: String = js.native
  /**
    * Name of the DynamoDB table.
    */
  var tableName: String = js.native
  /**
    * Set to `true` to use Amazon Cognito credentials with this data source.
    */
  var useCallerCredentials: js.UndefOr[Boolean] = js.native
}

object DataSourceDynamodbConfig {
  @scala.inline
  def apply(region: String, tableName: String, useCallerCredentials: js.UndefOr[Boolean] = js.undefined): DataSourceDynamodbConfig = {
    val __obj = js.Dynamic.literal(region = region.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    if (!js.isUndefined(useCallerCredentials)) __obj.updateDynamic("useCallerCredentials")(useCallerCredentials.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceDynamodbConfig]
  }
}

