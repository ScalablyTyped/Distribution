package typings.stickySession.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Env extends js.Object {
  val env: js.UndefOr[js.Any] = js.undefined
  val workers: js.UndefOr[Double] = js.undefined
}

object Env {
  @scala.inline
  def apply(env: js.Any = null, workers: js.UndefOr[Double] = js.undefined): Env = {
    val __obj = js.Dynamic.literal()
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (!js.isUndefined(workers)) __obj.updateDynamic("workers")(workers.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Env]
  }
}

