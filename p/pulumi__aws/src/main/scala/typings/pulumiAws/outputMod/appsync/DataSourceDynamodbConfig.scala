package typings.pulumiAws.outputMod.appsync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(region: String, tableName: String): DataSourceDynamodbConfig = {
    val __obj = js.Dynamic.literal(region = region.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
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
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableName(value: String): Self = this.set("tableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseCallerCredentials(value: Boolean): Self = this.set("useCallerCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseCallerCredentials: Self = this.set("useCallerCredentials", js.undefined)
  }
}
