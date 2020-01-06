package typings.atPulumiAws.getArnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetArnArgs extends js.Object {
  /**
    * The ARN to parse.
    */
  val arn: String = js.native
}

object GetArnArgs {
  @scala.inline
  def apply(arn: String): GetArnArgs = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetArnArgs]
  }
}

