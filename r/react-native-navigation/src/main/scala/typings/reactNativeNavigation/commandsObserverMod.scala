package typings.reactNativeNavigation

import typings.reactNativeNavigation.eventSubscriptionMod.EventSubscription
import typings.reactNativeNavigation.uniqueIdProviderMod.UniqueIdProvider
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-navigation/lib/dist/events/CommandsObserver", JSImport.Namespace)
@js.native
object commandsObserverMod extends js.Object {
  
  @js.native
  class CommandsObserver protected () extends js.Object {
    def this(uniqueIdProvider: UniqueIdProvider) = this()
    
    var listeners: js.Any = js.native
    
    def notify(commandName: String, params: Record[String, _]): Unit = js.native
    
    def register(listener: CommandsListener): EventSubscription = js.native
    
    var uniqueIdProvider: js.Any = js.native
  }
  
  type CommandsListener = js.Function2[/* name */ String, /* params */ Record[String, js.Any], Unit]
}
