package typings.reactBeautifulDnd

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Announce = js.Function1[/* message */ java.lang.String, scala.Unit]
  
  type ContextId = typings.reactBeautifulDnd.mod.Id
  
  type DisplacementMap = org.scalablytyped.runtime.StringDictionary[typings.reactBeautifulDnd.mod.Displacement]
  
  type DraggableChildrenFn = js.Function3[
    /* provided */ typings.reactBeautifulDnd.mod.DraggableProvided, 
    /* snapshot */ typings.reactBeautifulDnd.mod.DraggableStateSnapshot, 
    /* rubric */ typings.reactBeautifulDnd.mod.DraggableRubric, 
    typings.react.mod.ReactElement
  ]
  
  type DraggableDimensionMap = org.scalablytyped.runtime.StringDictionary[typings.reactBeautifulDnd.mod.DraggableDimension]
  
  type DraggableId = typings.reactBeautifulDnd.mod.Id
  
  type DraggableIdMap = org.scalablytyped.runtime.StringDictionary[typings.reactBeautifulDnd.reactBeautifulDndBooleans.`true`]
  
  type DroppableDimensionMap = org.scalablytyped.runtime.StringDictionary[typings.reactBeautifulDnd.mod.DroppableDimension]
  
  type DroppableId = typings.reactBeautifulDnd.mod.Id
  
  type DroppableIdMap = org.scalablytyped.runtime.StringDictionary[typings.reactBeautifulDnd.reactBeautifulDndBooleans.`true`]
  
  type ElementId = typings.reactBeautifulDnd.mod.Id
  
  type Id = java.lang.String
  
  type Omit[T, K /* <: /* keyof T */ java.lang.String */] = typings.std.Pick[T, typings.std.Exclude[/* keyof T */ java.lang.String, K]]
  
  type OnBeforeCaptureResponder = js.Function1[/* before */ typings.reactBeautifulDnd.mod.BeforeCapture, scala.Unit]
  
  type OnBeforeDragStartResponder = js.Function1[/* start */ typings.reactBeautifulDnd.mod.DragStart, scala.Unit]
  
  type OnDragEndResponder = js.Function2[
    /* result */ typings.reactBeautifulDnd.mod.DropResult, 
    /* provided */ typings.reactBeautifulDnd.mod.ResponderProvided, 
    scala.Unit
  ]
  
  type OnDragStartResponder = js.Function2[
    /* start */ typings.reactBeautifulDnd.mod.DragStart, 
    /* provided */ typings.reactBeautifulDnd.mod.ResponderProvided, 
    scala.Unit
  ]
  
  type OnDragUpdateResponder = js.Function2[
    /* update */ typings.reactBeautifulDnd.mod.DragUpdate, 
    /* provided */ typings.reactBeautifulDnd.mod.ResponderProvided, 
    scala.Unit
  ]
  
  type Sensor = js.Function1[/* api */ typings.reactBeautifulDnd.mod.SensorAPI, scala.Unit]
  
  type TryGetLock = js.Function3[
    /* draggableId */ typings.reactBeautifulDnd.mod.DraggableId, 
    /* forceStop */ js.UndefOr[js.Function0[scala.Unit]], 
    /* options */ js.UndefOr[typings.reactBeautifulDnd.mod.TryGetLockOptions], 
    typings.reactBeautifulDnd.mod.PreDragActions | scala.Null
  ]
  
  type TypeId = typings.reactBeautifulDnd.mod.Id
  
  @scala.inline
  def resetServerContext(): scala.Unit = typings.reactBeautifulDnd.mod.^.asInstanceOf[js.Dynamic].applyDynamic("resetServerContext")().asInstanceOf[scala.Unit]
}
