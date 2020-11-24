package typings.reactNavigationCore.useEventEmitterMod

import typings.reactNavigationCore.anon.TargetTypeEventName
import typings.reactNavigationCore.anon.`10`
import typings.reactNavigationCore.anon.`11`
import typings.reactNavigationCore.anon.`2`
import typings.reactNavigationCore.typesMod.EventArg
import typings.reactNavigationCore.typesMod.EventConsumer
import typings.std.Extract
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @react-navigation/core.@react-navigation/core/lib/typescript/src/types.EventEmitter<T> & {create (target : string): @react-navigation/core.@react-navigation/core/lib/typescript/src/types.EventConsumer<T>} */
@js.native
trait NavigationEventEmitter[T /* <: Record[String, _] */] extends js.Object {
  
  def create(target: String): EventConsumer[T] = js.native
  
  /**
    * Emit an event to child screens.
    *
    * @param options.type Type of the event (e.g. `focus`, `blur`)
    * @param [options.data] Optional information regarding the event.
    * @param [options.target] Key of the target route which should receive the event.
    * If not specified, all routes receive the event.
    */
  def emit[EventName /* <: Extract[/* keyof T */ String, String] */](
    options: (TargetTypeEventName[EventName, T]) with (js.Object | `2`) with ((`11`[T, EventName]) | (`10`[T, EventName]))
  ): EventArg[
    EventName, 
    /* import warning: importer.ImportType#apply Failed type conversion: T[EventName]['canPreventDefault'] */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: T[EventName]['data'] */ js.Any
  ] = js.native
}
object NavigationEventEmitter {
  
  @scala.inline
  def apply[T /* <: Record[String, _] */](
    create: String => EventConsumer[T],
    emit: (TargetTypeEventName[js.Any, T]) with (js.Object | `2`) with ((`11`[T, js.Any]) | (`10`[T, js.Any])) => EventArg[
      js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: T[EventName]['canPreventDefault'] */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: T[EventName]['data'] */ js.Any
    ]
  ): NavigationEventEmitter[T] = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), emit = js.Any.fromFunction1(emit))
    __obj.asInstanceOf[NavigationEventEmitter[T]]
  }
  
  @scala.inline
  implicit class NavigationEventEmitterOps[Self <: NavigationEventEmitter[_], T /* <: Record[String, _] */] (val x: Self with NavigationEventEmitter[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreate(value: String => EventConsumer[T]): Self = this.set("create", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEmit(
      value: (TargetTypeEventName[js.Any, T]) with (js.Object | `2`) with ((`11`[T, js.Any]) | (`10`[T, js.Any])) => EventArg[
          js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: T[EventName]['canPreventDefault'] */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: T[EventName]['data'] */ js.Any
        ]
    ): Self = this.set("emit", js.Any.fromFunction1(value))
  }
}
