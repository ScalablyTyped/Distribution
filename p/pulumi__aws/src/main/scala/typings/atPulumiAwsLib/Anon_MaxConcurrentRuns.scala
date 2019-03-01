package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaxConcurrentRuns extends js.Object {
  var maxConcurrentRuns: js.UndefOr[scala.Double] = js.undefined
}

object Anon_MaxConcurrentRuns {
  @scala.inline
  def apply(maxConcurrentRuns: scala.Int | scala.Double = null): Anon_MaxConcurrentRuns = {
    val __obj = js.Dynamic.literal()
    if (maxConcurrentRuns != null) __obj.updateDynamic("maxConcurrentRuns")(maxConcurrentRuns.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MaxConcurrentRuns]
  }
}

