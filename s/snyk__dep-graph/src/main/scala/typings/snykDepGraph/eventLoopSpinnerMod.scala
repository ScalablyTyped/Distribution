package typings.snykDepGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@snyk/dep-graph/dist/legacy/event-loop-spinner", JSImport.Namespace)
@js.native
object eventLoopSpinnerMod extends js.Object {
  @js.native
  class EventLoopSpinner () extends js.Object {
    def this(thresholdMs: Double) = this()
    var afterLastSpin: js.Any = js.native
    var thresholdMs: js.Any = js.native
    def isStarving(): Boolean = js.native
    def reset(): Unit = js.native
    def spin(): js.Promise[_] = js.native
  }
  
}

