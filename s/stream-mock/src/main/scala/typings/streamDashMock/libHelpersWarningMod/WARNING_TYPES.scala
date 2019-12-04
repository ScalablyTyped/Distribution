package typings.streamDashMock.libHelpersWarningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WARNING_TYPES extends js.Object

@JSImport("stream-mock/lib/helpers/Warning", "WARNING_TYPES")
@js.native
object WARNING_TYPES extends js.Object {
  @js.native
  sealed trait DEPRECATED extends WARNING_TYPES
  
  /* "DeprecationWarning" */ val DEPRECATED: typings.streamDashMock.libHelpersWarningMod.WARNING_TYPES.DEPRECATED with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[WARNING_TYPES with String] = js.native
}

