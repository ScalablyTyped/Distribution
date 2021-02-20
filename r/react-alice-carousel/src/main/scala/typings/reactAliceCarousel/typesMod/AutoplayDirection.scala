package typings.reactAliceCarousel.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AutoplayDirection extends StObject
@JSImport("react-alice-carousel/lib/types", "AutoplayDirection")
@js.native
object AutoplayDirection extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AutoplayDirection with String] = js.native
  
  @js.native
  sealed trait LTR extends AutoplayDirection
  /* "ltr" */ val LTR: typings.reactAliceCarousel.typesMod.AutoplayDirection.LTR with String = js.native
  
  @js.native
  sealed trait RTL extends AutoplayDirection
  /* "rtl" */ val RTL: typings.reactAliceCarousel.typesMod.AutoplayDirection.RTL with String = js.native
}
