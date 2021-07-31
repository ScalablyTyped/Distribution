package typings.reactNavigationCore

import typings.reactNavigationCore.anon.Type
import typings.reactNavigationCore.anon.`2`
import typings.reactNavigationCore.anon.`3`
import typings.reactNavigationCore.anon.`4`
import typings.reactNavigationCore.typesMod.EventArg
import typings.reactNavigationCore.typesMod.EventConsumer
import typings.reactNavigationCore.typesMod.EventEmitter
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useEventEmitterMod {
  
  @JSImport("@react-navigation/core/lib/typescript/src/useEventEmitter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[T /* <: Record[String, js.Any] */](): NavigationEventEmitter[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[NavigationEventEmitter[T]]
  @scala.inline
  def default[T /* <: Record[String, js.Any] */](listen: js.Function1[/* e */ js.Any, Unit]): NavigationEventEmitter[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(listen.asInstanceOf[js.Any]).asInstanceOf[NavigationEventEmitter[T]]
  
  trait NavigationEventEmitter[T /* <: Record[String, js.Any] */]
    extends StObject
       with EventEmitter[T] {
    
    def create(target: String): EventConsumer[T]
  }
  object NavigationEventEmitter {
    
    @scala.inline
    def apply[T /* <: Record[String, js.Any] */](
      create: String => EventConsumer[T],
      emit: (Type[js.Any, T]) & (js.Object | `2`) & ((`4`[T, js.Any]) | (`3`[T, js.Any])) => EventArg[
          js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['canPreventDefault'] */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['data'] */ js.Any
        ]
    ): NavigationEventEmitter[T] = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), emit = js.Any.fromFunction1(emit))
      __obj.asInstanceOf[NavigationEventEmitter[T]]
    }
    
    @scala.inline
    implicit class NavigationEventEmitterMutableBuilder[Self <: NavigationEventEmitter[?], T /* <: Record[String, js.Any] */] (val x: Self & NavigationEventEmitter[T]) extends AnyVal {
      
      @scala.inline
      def setCreate(value: String => EventConsumer[T]): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    }
  }
}
