package typings.reactDashStickynode.reactDashStickynodeMod

import org.scalablytyped.runtime.TopLevel
import typings.reactDashStickynode.reactDashStickynodeMod.StatusCode.STATUS_FIXED
import typings.reactDashStickynode.reactDashStickynodeMod.StatusCode.STATUS_ORIGINAL
import typings.reactDashStickynode.reactDashStickynodeMod.StatusCode.STATUS_RELEASED
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StatusCode with Double] = js.native
  /* 2 */ @js.native
  object STATUS_FIXED extends TopLevel[STATUS_FIXED with Double]
  
  /* 0 */ @js.native
  object STATUS_ORIGINAL extends TopLevel[STATUS_ORIGINAL with Double]
  
  /* 1 */ @js.native
  object STATUS_RELEASED extends TopLevel[STATUS_RELEASED with Double]
  
}

