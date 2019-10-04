package typings.roxDashReactDashNative.roxDashReactDashNativeMod

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
  
  /* 3 */ val freezeOptionNone: typings.roxDashReactDashNative.roxDashReactDashNativeMod.FreezeOptions.freezeOptionNone with Double = js.native
  /* 2 */ val freezeOptionUntilForeground: typings.roxDashReactDashNative.roxDashReactDashNativeMod.FreezeOptions.freezeOptionUntilForeground with Double = js.native
  /* 1 */ val freezeOptionUntilLaunch: typings.roxDashReactDashNative.roxDashReactDashNativeMod.FreezeOptions.freezeOptionUntilLaunch with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FreezeOptions with Double] = js.native
}

