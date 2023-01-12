package typings.reactNavigationCore

import typings.reactNavigationCore.anon.Type
import typings.reactNavigationCore.libTypescriptSrcTypesMod.EventArg
import typings.reactNavigationCore.libTypescriptSrcTypesMod.EventConsumer
import typings.reactNavigationCore.libTypescriptSrcTypesMod.EventEmitter
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcUseEventEmitterMod {
  
  @JSImport("@react-navigation/core/lib/typescript/src/useEventEmitter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: Record[String, Any] */](): NavigationEventEmitter[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[NavigationEventEmitter[T]]
  inline def default[T /* <: Record[String, Any] */](listen: js.Function1[/* e */ Any, Unit]): NavigationEventEmitter[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(listen.asInstanceOf[js.Any]).asInstanceOf[NavigationEventEmitter[T]]
  
  trait NavigationEventEmitter[T /* <: Record[String, Any] */]
    extends StObject
       with EventEmitter[T] {
    
    def create(target: String): EventConsumer[T]
  }
  object NavigationEventEmitter {
    
    inline def apply[T /* <: Record[String, Any] */](
      create: String => EventConsumer[T],
      emit: (Type[Any, T]) & (/* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['canPreventDefault'] extends true ? {  canPreventDefault :true} : {} */ js.Any) => EventArg[
          Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['canPreventDefault'] */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['data'] */ js.Any
        ]
    ): NavigationEventEmitter[T] = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), emit = js.Any.fromFunction1(emit))
      __obj.asInstanceOf[NavigationEventEmitter[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NavigationEventEmitter[?], T /* <: Record[String, Any] */] (val x: Self & NavigationEventEmitter[T]) extends AnyVal {
      
      inline def setCreate(value: String => EventConsumer[T]): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    }
  }
}
