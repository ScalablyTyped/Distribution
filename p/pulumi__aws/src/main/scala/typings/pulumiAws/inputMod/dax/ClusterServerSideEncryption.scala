package typings.pulumiAws.inputMod.dax

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterServerSideEncryption extends js.Object {
  /**
    * Whether to enable encryption at rest. Defaults to `false`.
    */
  var enabled: js.UndefOr[Input[Boolean]] = js.native
}

object ClusterServerSideEncryption {
  @scala.inline
  def apply(enabled: Input[Boolean] = null): ClusterServerSideEncryption = {
    val __obj = js.Dynamic.literal()
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterServerSideEncryption]
  }
}

