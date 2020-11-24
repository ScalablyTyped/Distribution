package typings.reactAliceCarousel.typesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ControlsStrategy extends js.Object
@JSImport("react-alice-carousel/lib/types", "ControlsStrategy")
@js.native
object ControlsStrategy extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ControlsStrategy with String] = js.native
  
  @js.native
  sealed trait DEFAULT extends ControlsStrategy
  /* "default" */ @js.native
  object DEFAULT extends TopLevel[DEFAULT with String]
  
  @js.native
  sealed trait RESPONSIVE extends ControlsStrategy
  /* "responsive" */ @js.native
  object RESPONSIVE extends TopLevel[RESPONSIVE with String]
}
