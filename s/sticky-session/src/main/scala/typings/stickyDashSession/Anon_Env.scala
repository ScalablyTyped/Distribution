package typings.stickyDashSession

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Env extends js.Object {
  val env: js.UndefOr[js.Any] = js.undefined
  val workers: js.UndefOr[Double] = js.undefined
}

object Anon_Env {
  @scala.inline
  def apply(env: js.Any = null, workers: Int | Double = null): Anon_Env = {
    val __obj = js.Dynamic.literal()
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (workers != null) __obj.updateDynamic("workers")(workers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Env]
  }
}

