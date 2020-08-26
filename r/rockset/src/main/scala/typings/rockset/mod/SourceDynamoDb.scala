package typings.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceDynamoDb extends js.Object {
  // AWS region name of DynamoDB table, by default us-west-2 is used
  var aws_region: js.UndefOr[String] = js.native
  // name of DynamoDB table containing data
  var table_name: String = js.native
}

object SourceDynamoDb {
  @scala.inline
  def apply(table_name: String): SourceDynamoDb = {
    val __obj = js.Dynamic.literal(table_name = table_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceDynamoDb]
  }
  @scala.inline
  implicit class SourceDynamoDbOps[Self <: SourceDynamoDb] (val x: Self) extends AnyVal {
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
    def setTable_name(value: String): Self = this.set("table_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setAws_region(value: String): Self = this.set("aws_region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAws_region: Self = this.set("aws_region", js.undefined)
  }
  
}

