package typings.pulumiAws.outputMod.efs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFileSystemLifecyclePolicy extends js.Object {
  var transitionToIa: String = js.native
}

object GetFileSystemLifecyclePolicy {
  @scala.inline
  def apply(transitionToIa: String): GetFileSystemLifecyclePolicy = {
    val __obj = js.Dynamic.literal(transitionToIa = transitionToIa.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetFileSystemLifecyclePolicy]
  }
}

