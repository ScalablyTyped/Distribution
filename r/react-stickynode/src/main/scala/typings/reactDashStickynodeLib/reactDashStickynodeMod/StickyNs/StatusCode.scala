package typings
package reactDashStickynodeLib.reactDashStickynodeMod.StickyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StatusCode extends js.Object

@JSImport("react-stickynode/Sticky", "StatusCode")
@js.native
object StatusCode extends js.Object {
  @js.native
  sealed trait STATUS_FIXED
    extends reactDashStickynodeLib.reactDashStickynodeMod.StickyNs.StatusCode
  
  /** The default status, located at the original position. */
  @js.native
  sealed trait STATUS_ORIGINAL
    extends reactDashStickynodeLib.reactDashStickynodeMod.StickyNs.StatusCode
  
  /**
           * The released status, located at somewhere on document, but not
           * default one.
           */
  @js.native
  sealed trait STATUS_RELEASED
    extends reactDashStickynodeLib.reactDashStickynodeMod.StickyNs.StatusCode
  
}

