package typings.pulumiAws.outputMod.dax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterServerSideEncryption extends js.Object {
  /**
    * Whether to enable encryption at rest. Defaults to `false`.
    */
  var enabled: js.UndefOr[Boolean] = js.native
}

object ClusterServerSideEncryption {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined): ClusterServerSideEncryption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterServerSideEncryption]
  }
}

