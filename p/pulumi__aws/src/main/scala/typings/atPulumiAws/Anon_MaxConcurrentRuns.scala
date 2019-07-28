package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaxConcurrentRuns extends js.Object {
  var maxConcurrentRuns: js.UndefOr[Double] = js.undefined
}

object Anon_MaxConcurrentRuns {
  @scala.inline
  def apply(maxConcurrentRuns: Int | Double = null): Anon_MaxConcurrentRuns = {
    val __obj = js.Dynamic.literal()
    if (maxConcurrentRuns != null) __obj.updateDynamic("maxConcurrentRuns")(maxConcurrentRuns.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MaxConcurrentRuns]
  }
}

