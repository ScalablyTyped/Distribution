package typings
package atPulumiAwsLib.iamGetInstanceProfileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInstanceProfileArgs extends js.Object {
  /**
    * The friendly IAM instance profile name to match.
    */
  val name: java.lang.String
}

object GetInstanceProfileArgs {
  @scala.inline
  def apply(name: java.lang.String): GetInstanceProfileArgs = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[GetInstanceProfileArgs]
  }
}

