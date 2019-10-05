package typings.atPulumiAws.typesOutputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsApplicationInputsKinesisStream extends js.Object {
  var resourceArn: String
  var roleArn: String
}

object AnalyticsApplicationInputsKinesisStream {
  @scala.inline
  def apply(resourceArn: String, roleArn: String): AnalyticsApplicationInputsKinesisStream = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn, roleArn = roleArn)
  
    __obj.asInstanceOf[AnalyticsApplicationInputsKinesisStream]
  }
}

