package typings
package reactDashStickynodeLib.reactDashStickynodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StatusCode extends js.Object

@JSImport("react-stickynode", "StatusCode")
@js.native
object StatusCode extends js.Object {
  @js.native
  sealed trait STATUS_FIXED
    extends reactDashStickynodeLib.reactDashStickynodeMod.StatusCode
  
  /** The default status, located at the original position. */
  @js.native
  sealed trait STATUS_ORIGINAL
    extends reactDashStickynodeLib.reactDashStickynodeMod.StatusCode
  
  /**
    * The released status, located at somewhere on document, but not
    * default one.
    */
  @js.native
  sealed trait STATUS_RELEASED
    extends reactDashStickynodeLib.reactDashStickynodeMod.StatusCode
  
  /* 2 */ val STATUS_FIXED: STATUS_FIXED with scala.Double = js.native
  /* 0 */ val STATUS_ORIGINAL: STATUS_ORIGINAL with scala.Double = js.native
  /* 1 */ val STATUS_RELEASED: STATUS_RELEASED with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[reactDashStickynodeLib.reactDashStickynodeMod.StatusCode with scala.Double] = js.native
}

