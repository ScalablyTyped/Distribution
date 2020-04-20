package typings.pulumiAws.getInstanceProfileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstanceProfileArgs extends js.Object {
  /**
    * The friendly IAM instance profile name to match.
    */
  val name: String = js.native
}

object GetInstanceProfileArgs {
  @scala.inline
  def apply(name: String): GetInstanceProfileArgs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceProfileArgs]
  }
}

