package typings.reactDashLazylog

import typings.reactDashLazylog.buildLazyLogMod.LazyLogProps
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-lazylog", JSImport.Namespace)
@js.native
object reactDashLazylogMod extends js.Object {
  @js.native
  class LazyLog ()
    extends typings.reactDashLazylog.buildLazyLogMod.LazyLog
  
  @js.native
  class ScrollFollow ()
    extends typings.reactDashLazylog.buildScrollFollowMod.ScrollFollow
  
  /* static members */
  @js.native
  object LazyLog extends js.Object {
    var defaultProps: Partial[LazyLogProps] = js.native
  }
  
}

