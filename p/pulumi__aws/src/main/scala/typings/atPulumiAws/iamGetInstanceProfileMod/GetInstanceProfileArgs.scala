package typings.atPulumiAws.iamGetInstanceProfileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInstanceProfileArgs extends js.Object {
  /**
    * The friendly IAM instance profile name to match.
    */
  val name: String
}

object GetInstanceProfileArgs {
  @scala.inline
  def apply(name: String): GetInstanceProfileArgs = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[GetInstanceProfileArgs]
  }
}

