package typings.simpleDiff

import org.scalablytyped.runtime.StringDictionary
import typings.simpleDiff.anon.NewPath
import typings.simpleDiff.simpleDiffNumbers.`-1`
import typings.simpleDiff.simpleDiffStrings.`add-item`
import typings.simpleDiff.simpleDiffStrings.`move-item`
import typings.simpleDiff.simpleDiffStrings.`remove-item`
import typings.simpleDiff.simpleDiffStrings.add
import typings.simpleDiff.simpleDiffStrings.change
import typings.simpleDiff.simpleDiffStrings.remove
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(oldObj: js.Any, newObj: js.Any): js.Array[Event] = (^.asInstanceOf[js.Dynamic].apply(oldObj.asInstanceOf[js.Any], newObj.asInstanceOf[js.Any])).asInstanceOf[js.Array[Event]]
  inline def apply(oldObj: js.Any, newObj: js.Any, options: Options): js.Array[Event] = (^.asInstanceOf[js.Dynamic].apply(oldObj.asInstanceOf[js.Any], newObj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Event]]
  
  @JSImport("simple-diff", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait AddEvent
    extends StObject
       with Event {
    
    var newPath: Path
    
    var newValue: js.Any
    
    var oldPath: Path
    
    var oldValue: Unit
    
    var `type`: add
  }
  object AddEvent {
    
    inline def apply(newPath: Path, newValue: js.Any, oldPath: Path, oldValue: Unit): AddEvent = {
      val __obj = js.Dynamic.literal(newPath = newPath.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldPath = oldPath.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("add")
      __obj.asInstanceOf[AddEvent]
    }
    
    extension [Self <: AddEvent](x: Self) {
      
      inline def setNewPath(value: Path): Self = StObject.set(x, "newPath", value.asInstanceOf[js.Any])
      
      inline def setNewPathVarargs(value: (String | Double)*): Self = StObject.set(x, "newPath", js.Array(value :_*))
      
      inline def setNewValue(value: js.Any): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      inline def setOldPath(value: Path): Self = StObject.set(x, "oldPath", value.asInstanceOf[js.Any])
      
      inline def setOldPathVarargs(value: (String | Double)*): Self = StObject.set(x, "oldPath", js.Array(value :_*))
      
      inline def setOldValue(value: Unit): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
      
      inline def setType(value: add): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait AddItemEvent
    extends StObject
       with Event {
    
    var curIndex: `-1`
    
    var newIndex: Double
    
    var newPath: Path
    
    var newValue: js.Any
    
    var oldIndex: `-1`
    
    var oldPath: Path
    
    var `type`: `add-item`
  }
  object AddItemEvent {
    
    inline def apply(newIndex: Double, newPath: Path, newValue: js.Any, oldPath: Path): AddItemEvent = {
      val __obj = js.Dynamic.literal(curIndex = -1, newIndex = newIndex.asInstanceOf[js.Any], newPath = newPath.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldIndex = -1, oldPath = oldPath.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("add-item")
      __obj.asInstanceOf[AddItemEvent]
    }
    
    extension [Self <: AddItemEvent](x: Self) {
      
      inline def setCurIndex(value: `-1`): Self = StObject.set(x, "curIndex", value.asInstanceOf[js.Any])
      
      inline def setNewIndex(value: Double): Self = StObject.set(x, "newIndex", value.asInstanceOf[js.Any])
      
      inline def setNewPath(value: Path): Self = StObject.set(x, "newPath", value.asInstanceOf[js.Any])
      
      inline def setNewPathVarargs(value: (String | Double)*): Self = StObject.set(x, "newPath", js.Array(value :_*))
      
      inline def setNewValue(value: js.Any): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      inline def setOldIndex(value: `-1`): Self = StObject.set(x, "oldIndex", value.asInstanceOf[js.Any])
      
      inline def setOldPath(value: Path): Self = StObject.set(x, "oldPath", value.asInstanceOf[js.Any])
      
      inline def setOldPathVarargs(value: (String | Double)*): Self = StObject.set(x, "oldPath", js.Array(value :_*))
      
      inline def setType(value: `add-item`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ChangeEvent
    extends StObject
       with Event {
    
    var newPath: Path
    
    var newValue: js.Any
    
    var oldPath: Path
    
    var oldValue: js.Any
    
    var `type`: change
  }
  object ChangeEvent {
    
    inline def apply(newPath: Path, newValue: js.Any, oldPath: Path, oldValue: js.Any): ChangeEvent = {
      val __obj = js.Dynamic.literal(newPath = newPath.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldPath = oldPath.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("change")
      __obj.asInstanceOf[ChangeEvent]
    }
    
    extension [Self <: ChangeEvent](x: Self) {
      
      inline def setNewPath(value: Path): Self = StObject.set(x, "newPath", value.asInstanceOf[js.Any])
      
      inline def setNewPathVarargs(value: (String | Double)*): Self = StObject.set(x, "newPath", js.Array(value :_*))
      
      inline def setNewValue(value: js.Any): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      inline def setOldPath(value: Path): Self = StObject.set(x, "oldPath", value.asInstanceOf[js.Any])
      
      inline def setOldPathVarargs(value: (String | Double)*): Self = StObject.set(x, "oldPath", js.Array(value :_*))
      
      inline def setOldValue(value: js.Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
      
      inline def setType(value: change): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.simpleDiff.mod.AddEvent
    - typings.simpleDiff.mod.RemoveEvent
    - typings.simpleDiff.mod.ChangeEvent
    - typings.simpleDiff.mod.AddItemEvent
    - typings.simpleDiff.mod.RemoveItemEvent
    - typings.simpleDiff.mod.MoveItemEvent
  */
  trait Event extends StObject
  object Event {
    
    inline def AddEvent(newPath: Path, newValue: js.Any, oldPath: Path, oldValue: Unit): typings.simpleDiff.mod.AddEvent = {
      val __obj = js.Dynamic.literal(newPath = newPath.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldPath = oldPath.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("add")
      __obj.asInstanceOf[typings.simpleDiff.mod.AddEvent]
    }
    
    inline def AddItemEvent(newIndex: Double, newPath: Path, newValue: js.Any, oldPath: Path): typings.simpleDiff.mod.AddItemEvent = {
      val __obj = js.Dynamic.literal(curIndex = -1, newIndex = newIndex.asInstanceOf[js.Any], newPath = newPath.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldIndex = -1, oldPath = oldPath.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("add-item")
      __obj.asInstanceOf[typings.simpleDiff.mod.AddItemEvent]
    }
    
    inline def ChangeEvent(newPath: Path, newValue: js.Any, oldPath: Path, oldValue: js.Any): typings.simpleDiff.mod.ChangeEvent = {
      val __obj = js.Dynamic.literal(newPath = newPath.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldPath = oldPath.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("change")
      __obj.asInstanceOf[typings.simpleDiff.mod.ChangeEvent]
    }
    
    inline def MoveItemEvent(curIndex: Double, newIndex: Double, newPath: Path, oldIndex: Double, oldPath: Path): typings.simpleDiff.mod.MoveItemEvent = {
      val __obj = js.Dynamic.literal(curIndex = curIndex.asInstanceOf[js.Any], newIndex = newIndex.asInstanceOf[js.Any], newPath = newPath.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any], oldPath = oldPath.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("move-item")
      __obj.asInstanceOf[typings.simpleDiff.mod.MoveItemEvent]
    }
    
    inline def RemoveEvent(newPath: Path, newValue: Unit, oldPath: Path, oldValue: js.Any): typings.simpleDiff.mod.RemoveEvent = {
      val __obj = js.Dynamic.literal(newPath = newPath.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldPath = oldPath.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("remove")
      __obj.asInstanceOf[typings.simpleDiff.mod.RemoveEvent]
    }
    
    inline def RemoveItemEvent(curIndex: Double, newPath: Path, oldIndex: Double, oldPath: Path, oldValue: js.Any): typings.simpleDiff.mod.RemoveItemEvent = {
      val __obj = js.Dynamic.literal(curIndex = curIndex.asInstanceOf[js.Any], newIndex = -1, newPath = newPath.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any], oldPath = oldPath.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("remove-item")
      __obj.asInstanceOf[typings.simpleDiff.mod.RemoveItemEvent]
    }
  }
  
  trait MoveItemEvent
    extends StObject
       with Event {
    
    var curIndex: Double
    
    var newIndex: Double
    
    var newPath: Path
    
    var oldIndex: Double
    
    var oldPath: Path
    
    var `type`: `move-item`
  }
  object MoveItemEvent {
    
    inline def apply(curIndex: Double, newIndex: Double, newPath: Path, oldIndex: Double, oldPath: Path): MoveItemEvent = {
      val __obj = js.Dynamic.literal(curIndex = curIndex.asInstanceOf[js.Any], newIndex = newIndex.asInstanceOf[js.Any], newPath = newPath.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any], oldPath = oldPath.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("move-item")
      __obj.asInstanceOf[MoveItemEvent]
    }
    
    extension [Self <: MoveItemEvent](x: Self) {
      
      inline def setCurIndex(value: Double): Self = StObject.set(x, "curIndex", value.asInstanceOf[js.Any])
      
      inline def setNewIndex(value: Double): Self = StObject.set(x, "newIndex", value.asInstanceOf[js.Any])
      
      inline def setNewPath(value: Path): Self = StObject.set(x, "newPath", value.asInstanceOf[js.Any])
      
      inline def setNewPathVarargs(value: (String | Double)*): Self = StObject.set(x, "newPath", js.Array(value :_*))
      
      inline def setOldIndex(value: Double): Self = StObject.set(x, "oldIndex", value.asInstanceOf[js.Any])
      
      inline def setOldPath(value: Path): Self = StObject.set(x, "oldPath", value.asInstanceOf[js.Any])
      
      inline def setOldPathVarargs(value: (String | Double)*): Self = StObject.set(x, "oldPath", js.Array(value :_*))
      
      inline def setType(value: `move-item`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var addEvent: js.UndefOr[String] = js.undefined
    
    var addItemEvent: js.UndefOr[String] = js.undefined
    
    var callback: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
    
    var changeEvent: js.UndefOr[String] = js.undefined
    
    var comparators: js.UndefOr[
        js.Array[
          js.Tuple2[
            js.Any, 
            js.Function3[/* oldValue */ js.Any, /* newValue */ js.Any, /* options */ NewPath, Boolean]
          ]
        ]
      ] = js.undefined
    
    var idProp: js.UndefOr[String] = js.undefined
    
    var idProps: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var ignore: js.UndefOr[
        js.Function3[/* oldValue */ js.Any, /* newValue */ js.Any, /* options */ NewPath, Boolean]
      ] = js.undefined
    
    var moveItemEvent: js.UndefOr[String] = js.undefined
    
    var removeEvent: js.UndefOr[String] = js.undefined
    
    var removeItemEvent: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAddEvent(value: String): Self = StObject.set(x, "addEvent", value.asInstanceOf[js.Any])
      
      inline def setAddEventUndefined: Self = StObject.set(x, "addEvent", js.undefined)
      
      inline def setAddItemEvent(value: String): Self = StObject.set(x, "addItemEvent", value.asInstanceOf[js.Any])
      
      inline def setAddItemEventUndefined: Self = StObject.set(x, "addItemEvent", js.undefined)
      
      inline def setCallback(value: /* event */ Event => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setChangeEvent(value: String): Self = StObject.set(x, "changeEvent", value.asInstanceOf[js.Any])
      
      inline def setChangeEventUndefined: Self = StObject.set(x, "changeEvent", js.undefined)
      
      inline def setComparators(
        value: js.Array[
              js.Tuple2[
                js.Any, 
                js.Function3[/* oldValue */ js.Any, /* newValue */ js.Any, /* options */ NewPath, Boolean]
              ]
            ]
      ): Self = StObject.set(x, "comparators", value.asInstanceOf[js.Any])
      
      inline def setComparatorsUndefined: Self = StObject.set(x, "comparators", js.undefined)
      
      inline def setComparatorsVarargs(
        value: (js.Tuple2[
              js.Any, 
              js.Function3[/* oldValue */ js.Any, /* newValue */ js.Any, /* options */ NewPath, Boolean]
            ])*
      ): Self = StObject.set(x, "comparators", js.Array(value :_*))
      
      inline def setIdProp(value: String): Self = StObject.set(x, "idProp", value.asInstanceOf[js.Any])
      
      inline def setIdPropUndefined: Self = StObject.set(x, "idProp", js.undefined)
      
      inline def setIdProps(value: StringDictionary[String]): Self = StObject.set(x, "idProps", value.asInstanceOf[js.Any])
      
      inline def setIdPropsUndefined: Self = StObject.set(x, "idProps", js.undefined)
      
      inline def setIgnore(value: (/* oldValue */ js.Any, /* newValue */ js.Any, /* options */ NewPath) => Boolean): Self = StObject.set(x, "ignore", js.Any.fromFunction3(value))
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setMoveItemEvent(value: String): Self = StObject.set(x, "moveItemEvent", value.asInstanceOf[js.Any])
      
      inline def setMoveItemEventUndefined: Self = StObject.set(x, "moveItemEvent", js.undefined)
      
      inline def setRemoveEvent(value: String): Self = StObject.set(x, "removeEvent", value.asInstanceOf[js.Any])
      
      inline def setRemoveEventUndefined: Self = StObject.set(x, "removeEvent", js.undefined)
      
      inline def setRemoveItemEvent(value: String): Self = StObject.set(x, "removeItemEvent", value.asInstanceOf[js.Any])
      
      inline def setRemoveItemEventUndefined: Self = StObject.set(x, "removeItemEvent", js.undefined)
    }
  }
  
  type Path = js.Array[String | Double]
  
  trait RemoveEvent
    extends StObject
       with Event {
    
    var newPath: Path
    
    var newValue: Unit
    
    var oldPath: Path
    
    var oldValue: js.Any
    
    var `type`: remove
  }
  object RemoveEvent {
    
    inline def apply(newPath: Path, newValue: Unit, oldPath: Path, oldValue: js.Any): RemoveEvent = {
      val __obj = js.Dynamic.literal(newPath = newPath.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldPath = oldPath.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("remove")
      __obj.asInstanceOf[RemoveEvent]
    }
    
    extension [Self <: RemoveEvent](x: Self) {
      
      inline def setNewPath(value: Path): Self = StObject.set(x, "newPath", value.asInstanceOf[js.Any])
      
      inline def setNewPathVarargs(value: (String | Double)*): Self = StObject.set(x, "newPath", js.Array(value :_*))
      
      inline def setNewValue(value: Unit): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      inline def setOldPath(value: Path): Self = StObject.set(x, "oldPath", value.asInstanceOf[js.Any])
      
      inline def setOldPathVarargs(value: (String | Double)*): Self = StObject.set(x, "oldPath", js.Array(value :_*))
      
      inline def setOldValue(value: js.Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
      
      inline def setType(value: remove): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait RemoveItemEvent
    extends StObject
       with Event {
    
    var curIndex: Double
    
    var newIndex: `-1`
    
    var newPath: Path
    
    var oldIndex: Double
    
    var oldPath: Path
    
    var oldValue: js.Any
    
    var `type`: `remove-item`
  }
  object RemoveItemEvent {
    
    inline def apply(curIndex: Double, newPath: Path, oldIndex: Double, oldPath: Path, oldValue: js.Any): RemoveItemEvent = {
      val __obj = js.Dynamic.literal(curIndex = curIndex.asInstanceOf[js.Any], newIndex = -1, newPath = newPath.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any], oldPath = oldPath.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("remove-item")
      __obj.asInstanceOf[RemoveItemEvent]
    }
    
    extension [Self <: RemoveItemEvent](x: Self) {
      
      inline def setCurIndex(value: Double): Self = StObject.set(x, "curIndex", value.asInstanceOf[js.Any])
      
      inline def setNewIndex(value: `-1`): Self = StObject.set(x, "newIndex", value.asInstanceOf[js.Any])
      
      inline def setNewPath(value: Path): Self = StObject.set(x, "newPath", value.asInstanceOf[js.Any])
      
      inline def setNewPathVarargs(value: (String | Double)*): Self = StObject.set(x, "newPath", js.Array(value :_*))
      
      inline def setOldIndex(value: Double): Self = StObject.set(x, "oldIndex", value.asInstanceOf[js.Any])
      
      inline def setOldPath(value: Path): Self = StObject.set(x, "oldPath", value.asInstanceOf[js.Any])
      
      inline def setOldPathVarargs(value: (String | Double)*): Self = StObject.set(x, "oldPath", js.Array(value :_*))
      
      inline def setOldValue(value: js.Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
      
      inline def setType(value: `remove-item`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
