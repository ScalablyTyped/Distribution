package typings.stickySession

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnv extends js.Object {
  val env: js.UndefOr[js.Any] = js.undefined
  val workers: js.UndefOr[Double] = js.undefined
}

object AnonEnv {
  @scala.inline
  def apply(env: js.Any = null, workers: Int | Double = null): AnonEnv = {
    val __obj = js.Dynamic.literal()
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (workers != null) __obj.updateDynamic("workers")(workers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnv]
  }
}

