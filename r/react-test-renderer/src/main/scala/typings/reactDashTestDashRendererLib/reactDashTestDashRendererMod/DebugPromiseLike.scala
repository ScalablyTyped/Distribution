package typings
package reactDashTestDashRendererLib.reactDashTestDashRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebugPromiseLike extends js.Object {
  // the actual then() in here is 0-ary, but that doesn't count as a PromiseLike.
  def `then`(
    onfulfilled: js.Function1[/* value */ scala.Nothing, scala.Nothing],
    onrejected: js.Function1[/* reason */ scala.Nothing, scala.Nothing]
  ): scala.Nothing
}

