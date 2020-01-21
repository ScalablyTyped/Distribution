package typings.pulumiKubernetes.inputMod.extensions.v1beta1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DEPRECATED.
  */
trait RollbackConfig extends js.Object {
  /**
    * The revision to rollback to. If set to 0, rollback to the last revision.
    */
  var revision: js.UndefOr[Input[Double]] = js.undefined
}

object RollbackConfig {
  @scala.inline
  def apply(revision: Input[Double] = null): RollbackConfig = {
    val __obj = js.Dynamic.literal()
    if (revision != null) __obj.updateDynamic("revision")(revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollbackConfig]
  }
}

