package typings
package atPulumiAwsLib.cloudformationGetStackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetStackArgs extends js.Object {
  /**
    * The name of the stack
    */
  val name: java.lang.String
}

object GetStackArgs {
  @scala.inline
  def apply(name: java.lang.String): GetStackArgs = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[GetStackArgs]
  }
}

