package typings.atPulumiAws.typesOutputMod.dynamodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalTableReplica extends js.Object {
  /**
    * AWS region name of replica DynamoDB Table. e.g. `us-east-1`
    */
  var regionName: String
}

object GlobalTableReplica {
  @scala.inline
  def apply(regionName: String): GlobalTableReplica = {
    val __obj = js.Dynamic.literal(regionName = regionName)
  
    __obj.asInstanceOf[GlobalTableReplica]
  }
}

