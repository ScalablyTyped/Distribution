package typings.reactAliceCarousel.typesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AutoplayDirection extends js.Object
@JSImport("react-alice-carousel/lib/types", "AutoplayDirection")
@js.native
object AutoplayDirection extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AutoplayDirection with String] = js.native
  
  @js.native
  sealed trait LTR extends AutoplayDirection
  /* "ltr" */ @js.native
  object LTR extends TopLevel[LTR with String]
  
  @js.native
  sealed trait RTL extends AutoplayDirection
  /* "rtl" */ @js.native
  object RTL extends TopLevel[RTL with String]
}
