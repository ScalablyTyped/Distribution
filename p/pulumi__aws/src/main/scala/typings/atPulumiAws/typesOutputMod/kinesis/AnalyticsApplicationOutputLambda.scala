package typings.atPulumiAws.typesOutputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsApplicationOutputLambda extends js.Object {
  var resourceArn: String
  var roleArn: String
}

object AnalyticsApplicationOutputLambda {
  @scala.inline
  def apply(resourceArn: String, roleArn: String): AnalyticsApplicationOutputLambda = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn, roleArn = roleArn)
  
    __obj.asInstanceOf[AnalyticsApplicationOutputLambda]
  }
}

