package typings.reactStickynode.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StatusCode extends js.Object
@JSImport("react-stickynode", "StatusCode")
@js.native
object StatusCode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StatusCode with Double] = js.native
  
  @js.native
  sealed trait STATUS_FIXED extends StatusCode
  /* 2 */ @js.native
  object STATUS_FIXED extends TopLevel[STATUS_FIXED with Double]
  
  /** The default status, located at the original position. */
  @js.native
  sealed trait STATUS_ORIGINAL extends StatusCode
  /* 0 */ @js.native
  object STATUS_ORIGINAL extends TopLevel[STATUS_ORIGINAL with Double]
  
  /**
    * The released status, located at somewhere on document, but not
    * default one.
    */
  @js.native
  sealed trait STATUS_RELEASED extends StatusCode
  /* 1 */ @js.native
  object STATUS_RELEASED extends TopLevel[STATUS_RELEASED with Double]
}
