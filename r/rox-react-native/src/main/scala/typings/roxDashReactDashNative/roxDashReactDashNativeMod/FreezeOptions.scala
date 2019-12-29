package typings.roxDashReactDashNative.roxDashReactDashNativeMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FreezeOptions extends js.Object

@JSImport("rox-react-native", "FreezeOptions")
@js.native
object FreezeOptions extends js.Object {
  @js.native
  sealed trait freezeOptionNone extends FreezeOptions
  
  @js.native
  sealed trait freezeOptionUntilForeground extends FreezeOptions
  
  @js.native
  sealed trait freezeOptionUntilLaunch extends FreezeOptions
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FreezeOptions with Double] = js.native
  /* 3 */ @js.native
  object freezeOptionNone extends TopLevel[freezeOptionNone with Double]
  
  /* 2 */ @js.native
  object freezeOptionUntilForeground extends TopLevel[freezeOptionUntilForeground with Double]
  
  /* 1 */ @js.native
  object freezeOptionUntilLaunch extends TopLevel[freezeOptionUntilLaunch with Double]
  
}

