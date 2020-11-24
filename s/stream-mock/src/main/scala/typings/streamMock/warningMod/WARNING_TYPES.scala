package typings.streamMock.warningMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WARNING_TYPES extends js.Object
@JSImport("stream-mock/lib/helpers/Warning", "WARNING_TYPES")
@js.native
object WARNING_TYPES extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[WARNING_TYPES with String] = js.native
  
  @js.native
  sealed trait DEPRECATED extends WARNING_TYPES
  /* "DeprecationWarning" */ @js.native
  object DEPRECATED extends TopLevel[DEPRECATED with String]
}
