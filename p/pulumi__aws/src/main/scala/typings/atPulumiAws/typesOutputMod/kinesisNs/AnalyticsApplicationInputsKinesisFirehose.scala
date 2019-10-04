package typings.atPulumiAws.typesOutputMod.kinesisNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsApplicationInputsKinesisFirehose extends js.Object {
  var resourceArn: String
  var roleArn: String
}

object AnalyticsApplicationInputsKinesisFirehose {
  @scala.inline
  def apply(resourceArn: String, roleArn: String): AnalyticsApplicationInputsKinesisFirehose = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn, roleArn = roleArn)
  
    __obj.asInstanceOf[AnalyticsApplicationInputsKinesisFirehose]
  }
}

