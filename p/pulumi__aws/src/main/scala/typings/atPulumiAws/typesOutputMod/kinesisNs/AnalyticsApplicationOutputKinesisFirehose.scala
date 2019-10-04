package typings.atPulumiAws.typesOutputMod.kinesisNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsApplicationOutputKinesisFirehose extends js.Object {
  var resourceArn: String
  var roleArn: String
}

object AnalyticsApplicationOutputKinesisFirehose {
  @scala.inline
  def apply(resourceArn: String, roleArn: String): AnalyticsApplicationOutputKinesisFirehose = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn, roleArn = roleArn)
  
    __obj.asInstanceOf[AnalyticsApplicationOutputKinesisFirehose]
  }
}

