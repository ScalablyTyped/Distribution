package typings
package reactDashNativeDashNavigationLib.libDistEventsCommandsObserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-navigation/lib/dist/events/CommandsObserver", "CommandsObserver")
@js.native
class CommandsObserver protected () extends js.Object {
  def this(uniqueIdProvider: reactDashNativeDashNavigationLib.libDistAdaptersUniqueIdProviderMod.UniqueIdProvider) = this()
  var listeners: js.Any = js.native
  var uniqueIdProvider: js.Any = js.native
  def notify(commandName: java.lang.String, params: stdLib.Record[java.lang.String, _]): scala.Unit = js.native
  def register(listener: CommandsListener): reactDashNativeDashNavigationLib.libDistInterfacesEventSubscriptionMod.EventSubscription = js.native
}

