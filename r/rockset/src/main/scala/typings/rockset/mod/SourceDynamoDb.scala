package typings.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceDynamoDb extends js.Object {
  // AWS region name of DynamoDB table, by default us-west-2 is used
  var aws_region: js.UndefOr[String] = js.undefined
  // name of DynamoDB table containing data
  var table_name: String
}

object SourceDynamoDb {
  @scala.inline
  def apply(table_name: String, aws_region: String = null): SourceDynamoDb = {
    val __obj = js.Dynamic.literal(table_name = table_name.asInstanceOf[js.Any])
    if (aws_region != null) __obj.updateDynamic("aws_region")(aws_region.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceDynamoDb]
  }
}

