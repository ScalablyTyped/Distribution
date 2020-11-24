package typings.reactAliceCarousel.typesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AutoPlayStrategy extends js.Object
@JSImport("react-alice-carousel/lib/types", "AutoPlayStrategy")
@js.native
object AutoPlayStrategy extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AutoPlayStrategy with String] = js.native
  
  @js.native
  sealed trait ACTION extends AutoPlayStrategy
  /* "action" */ @js.native
  object ACTION extends TopLevel[ACTION with String]
  
  @js.native
  sealed trait ALL extends AutoPlayStrategy
  /* "all" */ @js.native
  object ALL extends TopLevel[ALL with String]
  
  @js.native
  sealed trait DEFAULT extends AutoPlayStrategy
  /* "default" */ @js.native
  object DEFAULT extends TopLevel[DEFAULT with String]
  
  @js.native
  sealed trait NONE extends AutoPlayStrategy
  /* "none" */ @js.native
  object NONE extends TopLevel[NONE with String]
}
