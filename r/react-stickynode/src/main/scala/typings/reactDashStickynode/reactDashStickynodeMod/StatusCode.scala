package typings.reactDashStickynode.reactDashStickynodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StatusCode extends js.Object

@JSImport("react-stickynode", "StatusCode")
@js.native
object StatusCode extends js.Object {
  @js.native
  sealed trait STATUS_FIXED extends StatusCode
  
  /** The default status, located at the original position. */
  @js.native
  sealed trait STATUS_ORIGINAL extends StatusCode
  
  /**
    * The released status, located at somewhere on document, but not
    * default one.
    */
  @js.native
  sealed trait STATUS_RELEASED extends StatusCode
  
  /* 2 */ val STATUS_FIXED: typings.reactDashStickynode.reactDashStickynodeMod.StatusCode.STATUS_FIXED with Double = js.native
  /* 0 */ val STATUS_ORIGINAL: typings.reactDashStickynode.reactDashStickynodeMod.StatusCode.STATUS_ORIGINAL with Double = js.native
  /* 1 */ val STATUS_RELEASED: typings.reactDashStickynode.reactDashStickynodeMod.StatusCode.STATUS_RELEASED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StatusCode with Double] = js.native
}

