package typings.reactNativeSvg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Orient extends StObject
@JSImport("react-native-svg", "Orient")
@js.native
object Orient extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Orient with String] = js.native
  
  @js.native
  sealed trait AUTO extends Orient
  /* "auto" */ val AUTO: typings.reactNativeSvg.mod.Orient.AUTO with String = js.native
  
  @js.native
  sealed trait AUTO_START_REVERSE extends Orient
  /* "auto-start-reverse" */ val AUTO_START_REVERSE: typings.reactNativeSvg.mod.Orient.AUTO_START_REVERSE with String = js.native
}
