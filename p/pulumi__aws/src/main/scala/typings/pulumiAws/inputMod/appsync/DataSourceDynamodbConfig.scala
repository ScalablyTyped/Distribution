package typings.pulumiAws.inputMod.appsync

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceDynamodbConfig extends js.Object {
  /**
    * AWS region of Elasticsearch domain. Defaults to current region.
    */
  var region: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the DynamoDB table.
    */
  var tableName: Input[String] = js.native
  /**
    * Set to `true` to use Amazon Cognito credentials with this data source.
    */
  var useCallerCredentials: js.UndefOr[Input[Boolean]] = js.native
}

object DataSourceDynamodbConfig {
  @scala.inline
  def apply(tableName: Input[String]): DataSourceDynamodbConfig = {
    val __obj = js.Dynamic.literal(tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceDynamodbConfig]
  }
  @scala.inline
  implicit class DataSourceDynamodbConfigOps[Self <: DataSourceDynamodbConfig] (val x: Self) extends AnyVal {
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
    def setTableName(value: Input[String]): Self = this.set("tableName", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegion(value: Input[String]): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    @scala.inline
    def setUseCallerCredentials(value: Input[Boolean]): Self = this.set("useCallerCredentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseCallerCredentials: Self = this.set("useCallerCredentials", js.undefined)
  }
  
}

