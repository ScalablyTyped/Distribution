package typings
package reactDashNativeDashNavigationLib.libDistEventsCommandsObserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-navigation/lib/dist/events/CommandsObserver", "CommandsObserver")
@js.native
class CommandsObserver () extends js.Object {
  val listeners: js.Any = js.native
  def notify(commandName: java.lang.String, params: js.Object): scala.Unit = js.native
  def register(listener: CommandsListener): reactDashNativeDashNavigationLib.libDistInterfacesEventSubscriptionMod.EventSubscription = js.native
}

