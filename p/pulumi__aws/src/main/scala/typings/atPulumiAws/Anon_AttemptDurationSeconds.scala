package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttemptDurationSeconds extends js.Object {
  var attemptDurationSeconds: js.UndefOr[Double] = js.undefined
}

object Anon_AttemptDurationSeconds {
  @scala.inline
  def apply(attemptDurationSeconds: Int | Double = null): Anon_AttemptDurationSeconds = {
    val __obj = js.Dynamic.literal()
    if (attemptDurationSeconds != null) __obj.updateDynamic("attemptDurationSeconds")(attemptDurationSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AttemptDurationSeconds]
  }
}

