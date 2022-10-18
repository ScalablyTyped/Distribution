package typings.reactNativeNavigation

import typings.reactNativeNavigation.libDistSrcAdaptersUniqueIdProviderMod.UniqueIdProvider
import typings.reactNativeNavigation.libDistSrcInterfacesEventSubscriptionMod.EventSubscription
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDistSrcEventsCommandsObserverMod {
  
  @JSImport("react-native-navigation/lib/dist/src/events/CommandsObserver", "CommandsObserver")
  @js.native
  open class CommandsObserver protected () extends StObject {
    def this(uniqueIdProvider: UniqueIdProvider) = this()
    
    /* private */ var listeners: Any = js.native
    
    def notify(commandName: String, params: Record[String, Any]): Unit = js.native
    
    def register(listener: CommandsListener): EventSubscription = js.native
    
    /* private */ var uniqueIdProvider: Any = js.native
  }
  
  type CommandsListener = js.Function2[/* name */ String, /* params */ Record[String, Any], Unit]
}
