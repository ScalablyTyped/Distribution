package typings.atPulumiAws.typesOutputMod.dax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterServerSideEncryption extends js.Object {
  /**
    * Whether to enable encryption at rest. Defaults to `false`.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}

object ClusterServerSideEncryption {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined): ClusterServerSideEncryption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    __obj.asInstanceOf[ClusterServerSideEncryption]
  }
}

