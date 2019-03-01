package typings
package reactDashDomLib.testDashUtilsMod

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

object DebugPromiseLike {
  @scala.inline
  def apply(
    `then`: js.Function2[
      js.Function1[/* value */ scala.Nothing, scala.Nothing], 
      js.Function1[/* reason */ scala.Nothing, scala.Nothing], 
      scala.Nothing
    ]
  ): DebugPromiseLike = {
    val __obj = js.Dynamic.literal(`then` = `then`)
  
    __obj.asInstanceOf[DebugPromiseLike]
  }
}

