package typings.reactNativeSafeArea.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-safe-area", JSImport.Default)
@js.native
class default () extends SafeArea

/* static members */
@JSImport("react-native-safe-area", JSImport.Default)
@js.native
object default extends js.Object {
  def addEventListener(eventType: EventType, listener: js.Function1[/* payload */ EventPayload, Unit]): Unit = js.native
  def getSafeAreaInsetsForRootView(): js.Promise[EventPayload] = js.native
  def removeEventListener(eventType: EventType, listener: js.Function1[/* payload */ EventPayload, Unit]): Unit = js.native
}

