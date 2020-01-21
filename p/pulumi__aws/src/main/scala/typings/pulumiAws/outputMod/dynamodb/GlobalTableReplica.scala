package typings.pulumiAws.outputMod.dynamodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalTableReplica extends js.Object {
  /**
    * AWS region name of replica DynamoDB Table. e.g. `us-east-1`
    */
  var regionName: String = js.native
}

object GlobalTableReplica {
  @scala.inline
  def apply(regionName: String): GlobalTableReplica = {
    val __obj = js.Dynamic.literal(regionName = regionName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GlobalTableReplica]
  }
}

