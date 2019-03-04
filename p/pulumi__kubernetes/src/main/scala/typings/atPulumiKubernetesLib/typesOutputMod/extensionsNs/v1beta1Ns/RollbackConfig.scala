package typings
package atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns

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
  val revision: scala.Double
}

object RollbackConfig {
  @scala.inline
  def apply(revision: scala.Double): RollbackConfig = {
    val __obj = js.Dynamic.literal(revision = revision)
  
    __obj.asInstanceOf[RollbackConfig]
  }
}

