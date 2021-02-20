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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("simple-diff", JSImport.Namespace)
  @js.native
  def apply(oldObj: js.Any, newObj: js.Any): js.Array[Event] = js.native
  @JSImport("simple-diff", JSImport.Namespace)
  @js.native
  def apply(oldObj: js.Any, newObj: js.Any, options: Options): js.Array[Event] = js.native
  
  @js.native
  trait AddEvent extends Event {
    
    var newPath: Path = js.native
    
    var newValue: js.Any = js.native
    
    var oldPath: Path = js.native
    
    var oldValue: js.UndefOr[scala.Nothing] = js.native
    
    var `type`: add = js.native
  }
  object AddEvent {
    
    @scala.inline
    def apply(newPath: Path, newValue: js.Any, oldPath: Path, `type`: add): AddEvent = {
      val __obj = js.Dynamic.literal(newPath = newPath.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldPath = oldPath.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddEvent]
    }
    
    @scala.inline
    implicit class AddEventMutableBuilder[Self <: AddEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNewPath(value: Path): Self = StObject.set(x, "newPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewPathVarargs(value: (String | Double)*): Self = StObject.set(x, "newPath", js.Array(value :_*))
      
      @scala.inline
      def setNewValue(value: js.Any): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldPath(value: Path): Self = StObject.set(x, "oldPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldPathVarargs(value: (String | Double)*): Self = StObject.set(x, "oldPath", js.Array(value :_*))
      
      @scala.inline
      def setType(value: add): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AddItemEvent extends Event {
    
    var curIndex: `-1` = js.native
    
    var newIndex: Double = js.native
    
    var newPath: Path = js.native
    
    var newValue: js.Any = js.native
    
    var oldIndex: `-1` = js.native
    
    var oldPath: Path = js.native
    
    var `type`: `add-item` = js.native
  }
  object AddItemEvent {
    
    @scala.inline
    def apply(
      curIndex: `-1`,
      newIndex: Double,
      newPath: Path,
      newValue: js.Any,
      oldIndex: `-1`,
      oldPath: Path,
      `type`: `add-item`
    ): AddItemEvent = {
      val __obj = js.Dynamic.literal(curIndex = curIndex.asInstanceOf[js.Any], newIndex = newIndex.asInstanceOf[js.Any], newPath = newPath.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any], oldPath = oldPath.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddItemEvent]
    }
    
    @scala.inline
    implicit class AddItemEventMutableBuilder[Self <: AddItemEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurIndex(value: `-1`): Self = StObject.set(x, "curIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewIndex(value: Double): Self = StObject.set(x, "newIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewPath(value: Path): Self = StObject.set(x, "newPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewPathVarargs(value: (String | Double)*): Self = StObject.set(x, "newPath", js.Array(value :_*))
      
      @scala.inline
      def setNewValue(value: js.Any): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldIndex(value: `-1`): Self = StObject.set(x, "oldIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldPath(value: Path): Self = StObject.set(x, "oldPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldPathVarargs(value: (String | Double)*): Self = StObject.set(x, "oldPath", js.Array(value :_*))
      
      @scala.inline
      def setType(value: `add-item`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ChangeEvent extends Event {
    
    var newPath: Path = js.native
    
    var newValue: js.Any = js.native
    
    var oldPath: Path = js.native
    
    var oldValue: js.Any = js.native
    
    var `type`: change = js.native
  }
  object ChangeEvent {
    
    @scala.inline
    def apply(newPath: Path, newValue: js.Any, oldPath: Path, oldValue: js.Any, `type`: change): ChangeEvent = {
      val __obj = js.Dynamic.literal(newPath = newPath.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldPath = oldPath.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChangeEvent]
    }
    
    @scala.inline
    implicit class ChangeEventMutableBuilder[Self <: ChangeEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNewPath(value: Path): Self = StObject.set(x, "newPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewPathVarargs(value: (String | Double)*): Self = StObject.set(x, "newPath", js.Array(value :_*))
      
      @scala.inline
      def setNewValue(value: js.Any): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldPath(value: Path): Self = StObject.set(x, "oldPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldPathVarargs(value: (String | Double)*): Self = StObject.set(x, "oldPath", js.Array(value :_*))
      
      @scala.inline
      def setOldValue(value: js.Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: change): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def AddEvent(newPath: Path, newValue: js.Any, oldPath: Path, `type`: add): typings.simpleDiff.mod.AddEvent = {
      val __obj = js.Dynamic.literal(newPath = newPath.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldPath = oldPath.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.simpleDiff.mod.AddEvent]
    }
    
    @scala.inline
    def AddItemEvent(
      curIndex: `-1`,
      newIndex: Double,
      newPath: Path,
      newValue: js.Any,
      oldIndex: `-1`,
      oldPath: Path,
      `type`: `add-item`
    ): typings.simpleDiff.mod.AddItemEvent = {
      val __obj = js.Dynamic.literal(curIndex = curIndex.asInstanceOf[js.Any], newIndex = newIndex.asInstanceOf[js.Any], newPath = newPath.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any], oldPath = oldPath.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.simpleDiff.mod.AddItemEvent]
    }
    
    @scala.inline
    def ChangeEvent(newPath: Path, newValue: js.Any, oldPath: Path, oldValue: js.Any, `type`: change): typings.simpleDiff.mod.ChangeEvent = {
      val __obj = js.Dynamic.literal(newPath = newPath.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldPath = oldPath.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.simpleDiff.mod.ChangeEvent]
    }
    
    @scala.inline
    def MoveItemEvent(
      curIndex: Double,
      newIndex: Double,
      newPath: Path,
      oldIndex: Double,
      oldPath: Path,
      `type`: `move-item`
    ): typings.simpleDiff.mod.MoveItemEvent = {
      val __obj = js.Dynamic.literal(curIndex = curIndex.asInstanceOf[js.Any], newIndex = newIndex.asInstanceOf[js.Any], newPath = newPath.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any], oldPath = oldPath.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.simpleDiff.mod.MoveItemEvent]
    }
    
    @scala.inline
    def RemoveEvent(newPath: Path, oldPath: Path, oldValue: js.Any, `type`: remove): typings.simpleDiff.mod.RemoveEvent = {
      val __obj = js.Dynamic.literal(newPath = newPath.asInstanceOf[js.Any], oldPath = oldPath.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.simpleDiff.mod.RemoveEvent]
    }
    
    @scala.inline
    def RemoveItemEvent(
      curIndex: Double,
      newIndex: `-1`,
      newPath: Path,
      oldIndex: Double,
      oldPath: Path,
      oldValue: js.Any,
      `type`: `remove-item`
    ): typings.simpleDiff.mod.RemoveItemEvent = {
      val __obj = js.Dynamic.literal(curIndex = curIndex.asInstanceOf[js.Any], newIndex = newIndex.asInstanceOf[js.Any], newPath = newPath.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any], oldPath = oldPath.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.simpleDiff.mod.RemoveItemEvent]
    }
  }
  
  @js.native
  trait MoveItemEvent extends Event {
    
    var curIndex: Double = js.native
    
    var newIndex: Double = js.native
    
    var newPath: Path = js.native
    
    var oldIndex: Double = js.native
    
    var oldPath: Path = js.native
    
    var `type`: `move-item` = js.native
  }
  object MoveItemEvent {
    
    @scala.inline
    def apply(
      curIndex: Double,
      newIndex: Double,
      newPath: Path,
      oldIndex: Double,
      oldPath: Path,
      `type`: `move-item`
    ): MoveItemEvent = {
      val __obj = js.Dynamic.literal(curIndex = curIndex.asInstanceOf[js.Any], newIndex = newIndex.asInstanceOf[js.Any], newPath = newPath.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any], oldPath = oldPath.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MoveItemEvent]
    }
    
    @scala.inline
    implicit class MoveItemEventMutableBuilder[Self <: MoveItemEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurIndex(value: Double): Self = StObject.set(x, "curIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewIndex(value: Double): Self = StObject.set(x, "newIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewPath(value: Path): Self = StObject.set(x, "newPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewPathVarargs(value: (String | Double)*): Self = StObject.set(x, "newPath", js.Array(value :_*))
      
      @scala.inline
      def setOldIndex(value: Double): Self = StObject.set(x, "oldIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldPath(value: Path): Self = StObject.set(x, "oldPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldPathVarargs(value: (String | Double)*): Self = StObject.set(x, "oldPath", js.Array(value :_*))
      
      @scala.inline
      def setType(value: `move-item`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var addEvent: js.UndefOr[String] = js.native
    
    var addItemEvent: js.UndefOr[String] = js.native
    
    var callback: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
    
    var changeEvent: js.UndefOr[String] = js.native
    
    var comparators: js.UndefOr[
        js.Array[
          js.Tuple2[
            _, 
            js.Function3[/* oldValue */ _, /* newValue */ _, /* options */ NewPath, Boolean]
          ]
        ]
      ] = js.native
    
    var idProp: js.UndefOr[String] = js.native
    
    var idProps: js.UndefOr[StringDictionary[String]] = js.native
    
    var ignore: js.UndefOr[
        js.Function3[/* oldValue */ js.Any, /* newValue */ js.Any, /* options */ NewPath, Boolean]
      ] = js.native
    
    var moveItemEvent: js.UndefOr[String] = js.native
    
    var removeEvent: js.UndefOr[String] = js.native
    
    var removeItemEvent: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddEvent(value: String): Self = StObject.set(x, "addEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddEventUndefined: Self = StObject.set(x, "addEvent", js.undefined)
      
      @scala.inline
      def setAddItemEvent(value: String): Self = StObject.set(x, "addItemEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddItemEventUndefined: Self = StObject.set(x, "addItemEvent", js.undefined)
      
      @scala.inline
      def setCallback(value: /* event */ Event => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setChangeEvent(value: String): Self = StObject.set(x, "changeEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChangeEventUndefined: Self = StObject.set(x, "changeEvent", js.undefined)
      
      @scala.inline
      def setComparators(
        value: js.Array[
              js.Tuple2[
                _, 
                js.Function3[/* oldValue */ _, /* newValue */ _, /* options */ NewPath, Boolean]
              ]
            ]
      ): Self = StObject.set(x, "comparators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComparatorsUndefined: Self = StObject.set(x, "comparators", js.undefined)
      
      @scala.inline
      def setComparatorsVarargs(value: (js.Tuple2[js.Any, js.Function3[js.Any, js.Any, /* options */ NewPath, Boolean]])*): Self = StObject.set(x, "comparators", js.Array(value :_*))
      
      @scala.inline
      def setIdProp(value: String): Self = StObject.set(x, "idProp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdPropUndefined: Self = StObject.set(x, "idProp", js.undefined)
      
      @scala.inline
      def setIdProps(value: StringDictionary[String]): Self = StObject.set(x, "idProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdPropsUndefined: Self = StObject.set(x, "idProps", js.undefined)
      
      @scala.inline
      def setIgnore(value: (/* oldValue */ js.Any, /* newValue */ js.Any, /* options */ NewPath) => Boolean): Self = StObject.set(x, "ignore", js.Any.fromFunction3(value))
      
      @scala.inline
      def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      @scala.inline
      def setMoveItemEvent(value: String): Self = StObject.set(x, "moveItemEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoveItemEventUndefined: Self = StObject.set(x, "moveItemEvent", js.undefined)
      
      @scala.inline
      def setRemoveEvent(value: String): Self = StObject.set(x, "removeEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveEventUndefined: Self = StObject.set(x, "removeEvent", js.undefined)
      
      @scala.inline
      def setRemoveItemEvent(value: String): Self = StObject.set(x, "removeItemEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveItemEventUndefined: Self = StObject.set(x, "removeItemEvent", js.undefined)
    }
  }
  
  type Path = js.Array[String | Double]
  
  @js.native
  trait RemoveEvent extends Event {
    
    var newPath: Path = js.native
    
    var newValue: js.UndefOr[scala.Nothing] = js.native
    
    var oldPath: Path = js.native
    
    var oldValue: js.Any = js.native
    
    var `type`: remove = js.native
  }
  object RemoveEvent {
    
    @scala.inline
    def apply(newPath: Path, oldPath: Path, oldValue: js.Any, `type`: remove): RemoveEvent = {
      val __obj = js.Dynamic.literal(newPath = newPath.asInstanceOf[js.Any], oldPath = oldPath.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoveEvent]
    }
    
    @scala.inline
    implicit class RemoveEventMutableBuilder[Self <: RemoveEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNewPath(value: Path): Self = StObject.set(x, "newPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewPathVarargs(value: (String | Double)*): Self = StObject.set(x, "newPath", js.Array(value :_*))
      
      @scala.inline
      def setOldPath(value: Path): Self = StObject.set(x, "oldPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldPathVarargs(value: (String | Double)*): Self = StObject.set(x, "oldPath", js.Array(value :_*))
      
      @scala.inline
      def setOldValue(value: js.Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: remove): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RemoveItemEvent extends Event {
    
    var curIndex: Double = js.native
    
    var newIndex: `-1` = js.native
    
    var newPath: Path = js.native
    
    var oldIndex: Double = js.native
    
    var oldPath: Path = js.native
    
    var oldValue: js.Any = js.native
    
    var `type`: `remove-item` = js.native
  }
  object RemoveItemEvent {
    
    @scala.inline
    def apply(
      curIndex: Double,
      newIndex: `-1`,
      newPath: Path,
      oldIndex: Double,
      oldPath: Path,
      oldValue: js.Any,
      `type`: `remove-item`
    ): RemoveItemEvent = {
      val __obj = js.Dynamic.literal(curIndex = curIndex.asInstanceOf[js.Any], newIndex = newIndex.asInstanceOf[js.Any], newPath = newPath.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any], oldPath = oldPath.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoveItemEvent]
    }
    
    @scala.inline
    implicit class RemoveItemEventMutableBuilder[Self <: RemoveItemEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurIndex(value: Double): Self = StObject.set(x, "curIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewIndex(value: `-1`): Self = StObject.set(x, "newIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewPath(value: Path): Self = StObject.set(x, "newPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewPathVarargs(value: (String | Double)*): Self = StObject.set(x, "newPath", js.Array(value :_*))
      
      @scala.inline
      def setOldIndex(value: Double): Self = StObject.set(x, "oldIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldPath(value: Path): Self = StObject.set(x, "oldPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldPathVarargs(value: (String | Double)*): Self = StObject.set(x, "oldPath", js.Array(value :_*))
      
      @scala.inline
      def setOldValue(value: js.Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: `remove-item`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
