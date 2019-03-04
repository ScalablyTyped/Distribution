package typings
package atPulumiAwsLib.getArnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetArnArgs extends js.Object {
  /**
    * The ARN to parse.
    */
  val arn: java.lang.String
}

object GetArnArgs {
  @scala.inline
  def apply(arn: java.lang.String): GetArnArgs = {
    val __obj = js.Dynamic.literal(arn = arn)
  
    __obj.asInstanceOf[GetArnArgs]
  }
}

