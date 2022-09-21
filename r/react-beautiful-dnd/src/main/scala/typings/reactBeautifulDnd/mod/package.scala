package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactElement
import typings.reactBeautifulDnd.mod.^
import typings.reactBeautifulDnd.reactBeautifulDndBooleans.`true`
import typings.std.Exclude
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def resetServerContext(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetServerContext")().asInstanceOf[Unit]

inline def useKeyboardSensor: Sensor = ^.asInstanceOf[js.Dynamic].selectDynamic("useKeyboardSensor").asInstanceOf[Sensor]

inline def useMouseSensor: Sensor = ^.asInstanceOf[js.Dynamic].selectDynamic("useMouseSensor").asInstanceOf[Sensor]

inline def useTouchSensor: Sensor = ^.asInstanceOf[js.Dynamic].selectDynamic("useTouchSensor").asInstanceOf[Sensor]

type Announce = js.Function1[/* message */ String, Unit]

type ContextId = Id

type DisplacementMap = StringDictionary[Displacement]

type DraggableChildrenFn = js.Function3[
/* provided */ DraggableProvided, 
/* snapshot */ DraggableStateSnapshot, 
/* rubric */ DraggableRubric, 
ReactElement]

type DraggableDimensionMap = StringDictionary[DraggableDimension]

type DraggableId = Id

type DraggableIdMap = StringDictionary[`true`]

type DroppableDimensionMap = StringDictionary[DroppableDimension]

type DroppableId = Id

type DroppableIdMap = StringDictionary[`true`]

type ElementId = Id

type Id = String

type Omit[T, K /* <: /* keyof T */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]

type OnBeforeCaptureResponder = js.Function1[/* before */ BeforeCapture, Unit]

type OnBeforeDragStartResponder = js.Function1[/* start */ DragStart, Unit]

type OnDragEndResponder = js.Function2[/* result */ DropResult, /* provided */ ResponderProvided, Unit]

type OnDragStartResponder = js.Function2[/* start */ DragStart, /* provided */ ResponderProvided, Unit]

type OnDragUpdateResponder = js.Function2[/* update */ DragUpdate, /* provided */ ResponderProvided, Unit]

type Sensor = js.Function1[/* api */ SensorAPI, Unit]

type TryGetLock = js.Function3[
/* draggableId */ DraggableId, 
/* forceStop */ js.UndefOr[js.Function0[Unit]], 
/* options */ js.UndefOr[TryGetLockOptions], 
PreDragActions | Null]

type TypeId = Id
