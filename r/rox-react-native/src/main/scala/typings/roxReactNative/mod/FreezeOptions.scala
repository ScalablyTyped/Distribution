package typings.roxReactNative.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FreezeOptions extends js.Object
@JSImport("rox-react-native", "FreezeOptions")
@js.native
object FreezeOptions extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FreezeOptions with Double] = js.native
  
  @js.native
  sealed trait freezeOptionNone extends FreezeOptions
  /* 3 */ @js.native
  object freezeOptionNone extends TopLevel[freezeOptionNone with Double]
  
  @js.native
  sealed trait freezeOptionUntilForeground extends FreezeOptions
  /* 2 */ @js.native
  object freezeOptionUntilForeground extends TopLevel[freezeOptionUntilForeground with Double]
  
  @js.native
  sealed trait freezeOptionUntilLaunch extends FreezeOptions
  /* 1 */ @js.native
  object freezeOptionUntilLaunch extends TopLevel[freezeOptionUntilLaunch with Double]
}
