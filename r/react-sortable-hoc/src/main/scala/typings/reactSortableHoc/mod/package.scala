package typings.reactSortableHoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ContainerGetter = js.Function1[
    /* element */ typings.react.mod.ReactElement, 
    typings.std.HTMLElement | js.Promise[typings.std.HTMLElement]
  ]
  
  type HelperContainerGetter = js.Function0[typings.std.HTMLElement]
  
  type Offset = scala.Double | java.lang.String
  
  type SortEndHandler = js.Function2[
    /* sort */ typings.reactSortableHoc.mod.SortEnd, 
    /* event */ typings.reactSortableHoc.mod.SortEvent, 
    scala.Unit
  ]
  
  type SortEvent = (typings.react.mod.MouseEvent[js.Any, typings.react.mod.NativeMouseEvent]) | typings.react.mod.TouchEvent[js.Any]
  
  type SortEventWithTag = typings.reactSortableHoc.mod.SortEvent with typings.reactSortableHoc.anon.Target
  
  type SortMoveHandler = js.Function1[/* event */ typings.reactSortableHoc.mod.SortEvent, scala.Unit]
  
  type SortOverHandler = js.Function2[
    /* sort */ typings.reactSortableHoc.mod.SortOver, 
    /* event */ typings.reactSortableHoc.mod.SortEvent, 
    scala.Unit
  ]
  
  type SortStartHandler = js.Function2[
    /* sort */ typings.reactSortableHoc.mod.SortStart, 
    /* event */ typings.reactSortableHoc.mod.SortEvent, 
    scala.Unit
  ]
  
  type WrappedComponent[P] = (typings.react.mod.ComponentClass[P, typings.react.mod.ComponentState]) | typings.react.mod.SFC[P] | typings.reactSortableHoc.mod.WrappedComponentFactory[P]
  
  type WrappedComponentFactory[P] = js.Function1[/* props */ P, typings.react.mod.global.JSX.Element]
}
