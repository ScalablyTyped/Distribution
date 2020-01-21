package typings.pulumiAws.outputMod.workspaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBundleComputeType extends js.Object {
  /**
    * The name of the compute type.
    */
  var name: String = js.native
}

object GetBundleComputeType {
  @scala.inline
  def apply(name: String): GetBundleComputeType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetBundleComputeType]
  }
}

