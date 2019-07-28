package typings.atPulumiAws.getArnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetArnArgs extends js.Object {
  /**
    * The ARN to parse.
    */
  val arn: String
}

object GetArnArgs {
  @scala.inline
  def apply(arn: String): GetArnArgs = {
    val __obj = js.Dynamic.literal(arn = arn)
  
    __obj.asInstanceOf[GetArnArgs]
  }
}

