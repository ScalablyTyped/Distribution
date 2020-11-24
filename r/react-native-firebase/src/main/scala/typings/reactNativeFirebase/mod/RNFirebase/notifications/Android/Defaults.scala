package typings.reactNativeFirebase.mod.RNFirebase.notifications.Android

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Defaults extends js.Object
@JSImport("react-native-firebase", "RNFirebase.notifications.Android.Defaults")
@js.native
object Defaults extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Defaults with Double] = js.native
  
  @js.native
  sealed trait All extends Defaults
  /* -1 */ @js.native
  object All extends TopLevel[All with Double]
  
  @js.native
  sealed trait Lights extends Defaults
  /* 4 */ @js.native
  object Lights
    extends TopLevel[
          typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.Defaults.Lights with Double
        ]
  
  @js.native
  sealed trait Sound extends Defaults
  /* 1 */ @js.native
  object Sound extends TopLevel[Sound with Double]
  
  @js.native
  sealed trait Vibrate extends Defaults
  /* 2 */ @js.native
  object Vibrate extends TopLevel[Vibrate with Double]
}
