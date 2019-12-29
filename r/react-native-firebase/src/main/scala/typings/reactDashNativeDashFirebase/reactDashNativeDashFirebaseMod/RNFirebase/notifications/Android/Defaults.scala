package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Defaults extends js.Object

@JSImport("react-native-firebase", "RNFirebase.notifications.Android.Defaults")
@js.native
object Defaults extends js.Object {
  @js.native
  sealed trait All extends Defaults
  
  @js.native
  sealed trait Lights extends Defaults
  
  @js.native
  sealed trait Sound extends Defaults
  
  @js.native
  sealed trait Vibrate extends Defaults
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Defaults with Double] = js.native
  /* -1 */ @js.native
  object All extends TopLevel[All with Double]
  
  /* 4 */ @js.native
  object Lights
    extends TopLevel[
          typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android.Defaults.Lights with Double
        ]
  
  /* 1 */ @js.native
  object Sound extends TopLevel[Sound with Double]
  
  /* 2 */ @js.native
  object Vibrate extends TopLevel[Vibrate with Double]
  
}

