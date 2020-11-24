package typings.reactNativeSvg.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Orient extends js.Object
@JSImport("react-native-svg", "Orient")
@js.native
object Orient extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Orient with String] = js.native
  
  @js.native
  sealed trait AUTO extends Orient
  /* "auto" */ @js.native
  object AUTO extends TopLevel[AUTO with String]
  
  @js.native
  sealed trait AUTO_START_REVERSE extends Orient
  /* "auto-start-reverse" */ @js.native
  object AUTO_START_REVERSE extends TopLevel[AUTO_START_REVERSE with String]
}
