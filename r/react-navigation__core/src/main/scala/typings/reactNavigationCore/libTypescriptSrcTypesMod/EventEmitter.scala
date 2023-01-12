package typings.reactNavigationCore.libTypescriptSrcTypesMod

import typings.reactNavigationCore.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventEmitter[EventMap /* <: EventMapBase */] extends StObject {
  
  /**
    * Emit an event to child screens.
    *
    * @param options.type Type of the event (e.g. `focus`, `blur`)
    * @param [options.data] Optional information regarding the event.
    * @param [options.target] Key of the target route which should receive the event.
    * If not specified, all routes receive the event.
    */
  def emit[EventName /* <: Keyof[EventMap] */](
    options: (Type[EventName, EventMap]) & (/* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['canPreventDefault'] extends true ? {  canPreventDefault :true} : {} */ js.Any)
  ): EventArg[
    EventName, 
    /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['canPreventDefault'] */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['data'] */ js.Any
  ]
}
object EventEmitter {
  
  inline def apply[EventMap /* <: EventMapBase */](
    emit: (Type[Any, EventMap]) & (/* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['canPreventDefault'] extends true ? {  canPreventDefault :true} : {} */ js.Any) => EventArg[
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['canPreventDefault'] */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['data'] */ js.Any
    ]
  ): EventEmitter[EventMap] = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction1(emit))
    __obj.asInstanceOf[EventEmitter[EventMap]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventEmitter[?], EventMap /* <: EventMapBase */] (val x: Self & EventEmitter[EventMap]) extends AnyVal {
    
    inline def setEmit(
      value: (Type[Any, EventMap]) & (/* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['canPreventDefault'] extends true ? {  canPreventDefault :true} : {} */ js.Any) => EventArg[
          Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['canPreventDefault'] */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['data'] */ js.Any
        ]
    ): Self = StObject.set(x, "emit", js.Any.fromFunction1(value))
  }
}
