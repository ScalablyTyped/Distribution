package typings.atPulumiAws.typesInputMod.dynamodb

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalTableReplica extends js.Object {
  /**
    * AWS region name of replica DynamoDB Table. e.g. `us-east-1`
    */
  var regionName: Input[String]
}

object GlobalTableReplica {
  @scala.inline
  def apply(regionName: Input[String]): GlobalTableReplica = {
    val __obj = js.Dynamic.literal(regionName = regionName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GlobalTableReplica]
  }
}

