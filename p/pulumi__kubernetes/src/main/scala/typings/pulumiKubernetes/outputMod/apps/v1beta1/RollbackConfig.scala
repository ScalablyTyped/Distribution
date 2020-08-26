package typings.pulumiKubernetes.outputMod.apps.v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DEPRECATED.
  */
@js.native
trait RollbackConfig extends js.Object {
  /**
    * The revision to rollback to. If set to 0, rollback to the last revision.
    */
  var revision: Double = js.native
}

object RollbackConfig {
  @scala.inline
  def apply(revision: Double): RollbackConfig = {
    val __obj = js.Dynamic.literal(revision = revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollbackConfig]
  }
  @scala.inline
  implicit class RollbackConfigOps[Self <: RollbackConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRevision(value: Double): Self = this.set("revision", value.asInstanceOf[js.Any])
  }
  
}

