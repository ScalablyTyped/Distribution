package typings.reactDashNativeDashSvg.reactDashNativeDashSvgMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Orient extends js.Object

@JSImport("react-native-svg", "Orient")
@js.native
object Orient extends js.Object {
  @js.native
  sealed trait AUTO extends Orient
  
  @js.native
  sealed trait AUTO_START_REVERSE extends Orient
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Orient with String] = js.native
  /* "auto" */ @js.native
  object AUTO extends TopLevel[AUTO with String]
  
  /* "auto-start-reverse" */ @js.native
  object AUTO_START_REVERSE extends TopLevel[AUTO_START_REVERSE with String]
  
}

