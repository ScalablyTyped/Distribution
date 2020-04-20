package typings.pulumiKubernetes.outputMod.apps.v1beta1

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
  val revision: Double
}

object RollbackConfig {
  @scala.inline
  def apply(revision: Double): RollbackConfig = {
    val __obj = js.Dynamic.literal(revision = revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollbackConfig]
  }
}

