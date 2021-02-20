package typings.reactNativeNavigation

import typings.reactNativeNavigation.eventSubscriptionMod.EventSubscription
import typings.reactNativeNavigation.uniqueIdProviderMod.UniqueIdProvider
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsObserverMod {
  
  @JSImport("react-native-navigation/lib/dist/events/CommandsObserver", "CommandsObserver")
  @js.native
  class CommandsObserver protected () extends StObject {
    def this(uniqueIdProvider: UniqueIdProvider) = this()
    
    var listeners: js.Any = js.native
    
    def notify(commandName: String, params: Record[String, _]): Unit = js.native
    
    def register(listener: CommandsListener): EventSubscription = js.native
    
    var uniqueIdProvider: js.Any = js.native
  }
  
  type CommandsListener = js.Function2[/* name */ String, /* params */ Record[String, js.Any], Unit]
}
