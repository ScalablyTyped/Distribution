package typings.slickgrid.Slick

import typings.slickgrid.DOMEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Editors {
  
  trait Checkbox[T /* <: SlickData */]
    extends StObject
       with Editor[T]
  object Checkbox {
    
    inline def apply[T /* <: SlickData */](
      applyValue: (T, String) => Unit,
      destroy: () => Unit,
      focus: () => Unit,
      init: () => Unit,
      isValueChanged: () => Boolean,
      loadValue: T => Unit,
      serializeValue: () => Any,
      validate: () => ValidateResults
    ): Checkbox[T] = {
      val __obj = js.Dynamic.literal(applyValue = js.Any.fromFunction2(applyValue), destroy = js.Any.fromFunction0(destroy), focus = js.Any.fromFunction0(focus), init = js.Any.fromFunction0(init), isValueChanged = js.Any.fromFunction0(isValueChanged), loadValue = js.Any.fromFunction1(loadValue), serializeValue = js.Any.fromFunction0(serializeValue), validate = js.Any.fromFunction0(validate))
      __obj.asInstanceOf[Checkbox[T]]
    }
  }
  
  trait Date[T /* <: SlickData */]
    extends StObject
       with Editor[T] {
    
    def hide(): Unit
    
    def position(position: Position): Unit
    
    def show(): Unit
  }
  object Date {
    
    inline def apply[T /* <: SlickData */](
      applyValue: (T, String) => Unit,
      destroy: () => Unit,
      focus: () => Unit,
      hide: () => Unit,
      init: () => Unit,
      isValueChanged: () => Boolean,
      loadValue: T => Unit,
      position: Position => Unit,
      serializeValue: () => Any,
      show: () => Unit,
      validate: () => ValidateResults
    ): Date[T] = {
      val __obj = js.Dynamic.literal(applyValue = js.Any.fromFunction2(applyValue), destroy = js.Any.fromFunction0(destroy), focus = js.Any.fromFunction0(focus), hide = js.Any.fromFunction0(hide), init = js.Any.fromFunction0(init), isValueChanged = js.Any.fromFunction0(isValueChanged), loadValue = js.Any.fromFunction1(loadValue), position = js.Any.fromFunction1(position), serializeValue = js.Any.fromFunction0(serializeValue), show = js.Any.fromFunction0(show), validate = js.Any.fromFunction0(validate))
      __obj.asInstanceOf[Date[T]]
    }
    
    extension [Self <: Date[?], T /* <: SlickData */](x: Self & Date[T]) {
      
      inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      inline def setPosition(value: Position => Unit): Self = StObject.set(x, "position", js.Any.fromFunction1(value))
      
      inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    }
  }
  
  trait Editor[T /* <: SlickData */] extends StObject {
    
    def applyValue(item: T, state: String): Unit
    
    def destroy(): Unit
    
    def focus(): Unit
    
    def init(): Unit
    
    def isValueChanged(): Boolean
    
    def loadValue(item: T): Unit
    
    def serializeValue(): Any
    
    def validate(): ValidateResults
  }
  object Editor {
    
    inline def apply[T /* <: SlickData */](
      applyValue: (T, String) => Unit,
      destroy: () => Unit,
      focus: () => Unit,
      init: () => Unit,
      isValueChanged: () => Boolean,
      loadValue: T => Unit,
      serializeValue: () => Any,
      validate: () => ValidateResults
    ): Editor[T] = {
      val __obj = js.Dynamic.literal(applyValue = js.Any.fromFunction2(applyValue), destroy = js.Any.fromFunction0(destroy), focus = js.Any.fromFunction0(focus), init = js.Any.fromFunction0(init), isValueChanged = js.Any.fromFunction0(isValueChanged), loadValue = js.Any.fromFunction1(loadValue), serializeValue = js.Any.fromFunction0(serializeValue), validate = js.Any.fromFunction0(validate))
      __obj.asInstanceOf[Editor[T]]
    }
    
    extension [Self <: Editor[?], T /* <: SlickData */](x: Self & Editor[T]) {
      
      inline def setApplyValue(value: (T, String) => Unit): Self = StObject.set(x, "applyValue", js.Any.fromFunction2(value))
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
      
      inline def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
      
      inline def setIsValueChanged(value: () => Boolean): Self = StObject.set(x, "isValueChanged", js.Any.fromFunction0(value))
      
      inline def setLoadValue(value: T => Unit): Self = StObject.set(x, "loadValue", js.Any.fromFunction1(value))
      
      inline def setSerializeValue(value: () => Any): Self = StObject.set(x, "serializeValue", js.Any.fromFunction0(value))
      
      inline def setValidate(value: () => ValidateResults): Self = StObject.set(x, "validate", js.Any.fromFunction0(value))
    }
  }
  
  trait EditorOptions[T /* <: SlickData */] extends StObject {
    
    var cancelChanges: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var column: Column[T]
    
    var commitChanges: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var container: HTMLElement
    
    var grid: Grid[T]
    
    var gridPosition: js.UndefOr[CellPosition] = js.undefined
    
    var item: js.UndefOr[T] = js.undefined
    
    var position: js.UndefOr[CellPosition] = js.undefined
  }
  object EditorOptions {
    
    inline def apply[T /* <: SlickData */](column: Column[T], container: HTMLElement, grid: Grid[T]): EditorOptions[T] = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditorOptions[T]]
    }
    
    extension [Self <: EditorOptions[?], T /* <: SlickData */](x: Self & EditorOptions[T]) {
      
      inline def setCancelChanges(value: () => Unit): Self = StObject.set(x, "cancelChanges", js.Any.fromFunction0(value))
      
      inline def setCancelChangesUndefined: Self = StObject.set(x, "cancelChanges", js.undefined)
      
      inline def setColumn(value: Column[T]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setCommitChanges(value: () => Unit): Self = StObject.set(x, "commitChanges", js.Any.fromFunction0(value))
      
      inline def setCommitChangesUndefined: Self = StObject.set(x, "commitChanges", js.undefined)
      
      inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setGrid(value: Grid[T]): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setGridPosition(value: CellPosition): Self = StObject.set(x, "gridPosition", value.asInstanceOf[js.Any])
      
      inline def setGridPositionUndefined: Self = StObject.set(x, "gridPosition", js.undefined)
      
      inline def setItem(value: T): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
      
      inline def setPosition(value: CellPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    }
  }
  
  trait Integer[T /* <: SlickData */]
    extends StObject
       with Editor[T]
  object Integer {
    
    inline def apply[T /* <: SlickData */](
      applyValue: (T, String) => Unit,
      destroy: () => Unit,
      focus: () => Unit,
      init: () => Unit,
      isValueChanged: () => Boolean,
      loadValue: T => Unit,
      serializeValue: () => Any,
      validate: () => ValidateResults
    ): Integer[T] = {
      val __obj = js.Dynamic.literal(applyValue = js.Any.fromFunction2(applyValue), destroy = js.Any.fromFunction0(destroy), focus = js.Any.fromFunction0(focus), init = js.Any.fromFunction0(init), isValueChanged = js.Any.fromFunction0(isValueChanged), loadValue = js.Any.fromFunction1(loadValue), serializeValue = js.Any.fromFunction0(serializeValue), validate = js.Any.fromFunction0(validate))
      __obj.asInstanceOf[Integer[T]]
    }
  }
  
  trait LongText[T /* <: SlickData */]
    extends StObject
       with Editor[T] {
    
    def cancel(): Unit
    
    def handleKeyDown(e: DOMEvent): Unit
    
    def hide(): Unit
    
    def position(position: Position): Unit
    
    def save(): Unit
    
    def show(): Unit
  }
  object LongText {
    
    inline def apply[T /* <: SlickData */](
      applyValue: (T, String) => Unit,
      cancel: () => Unit,
      destroy: () => Unit,
      focus: () => Unit,
      handleKeyDown: DOMEvent => Unit,
      hide: () => Unit,
      init: () => Unit,
      isValueChanged: () => Boolean,
      loadValue: T => Unit,
      position: Position => Unit,
      save: () => Unit,
      serializeValue: () => Any,
      show: () => Unit,
      validate: () => ValidateResults
    ): LongText[T] = {
      val __obj = js.Dynamic.literal(applyValue = js.Any.fromFunction2(applyValue), cancel = js.Any.fromFunction0(cancel), destroy = js.Any.fromFunction0(destroy), focus = js.Any.fromFunction0(focus), handleKeyDown = js.Any.fromFunction1(handleKeyDown), hide = js.Any.fromFunction0(hide), init = js.Any.fromFunction0(init), isValueChanged = js.Any.fromFunction0(isValueChanged), loadValue = js.Any.fromFunction1(loadValue), position = js.Any.fromFunction1(position), save = js.Any.fromFunction0(save), serializeValue = js.Any.fromFunction0(serializeValue), show = js.Any.fromFunction0(show), validate = js.Any.fromFunction0(validate))
      __obj.asInstanceOf[LongText[T]]
    }
    
    extension [Self <: LongText[?], T /* <: SlickData */](x: Self & LongText[T]) {
      
      inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      inline def setHandleKeyDown(value: DOMEvent => Unit): Self = StObject.set(x, "handleKeyDown", js.Any.fromFunction1(value))
      
      inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      inline def setPosition(value: Position => Unit): Self = StObject.set(x, "position", js.Any.fromFunction1(value))
      
      inline def setSave(value: () => Unit): Self = StObject.set(x, "save", js.Any.fromFunction0(value))
      
      inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    }
  }
  
  trait PercentComplete[T /* <: SlickData */]
    extends StObject
       with Editor[T]
  object PercentComplete {
    
    inline def apply[T /* <: SlickData */](
      applyValue: (T, String) => Unit,
      destroy: () => Unit,
      focus: () => Unit,
      init: () => Unit,
      isValueChanged: () => Boolean,
      loadValue: T => Unit,
      serializeValue: () => Any,
      validate: () => ValidateResults
    ): PercentComplete[T] = {
      val __obj = js.Dynamic.literal(applyValue = js.Any.fromFunction2(applyValue), destroy = js.Any.fromFunction0(destroy), focus = js.Any.fromFunction0(focus), init = js.Any.fromFunction0(init), isValueChanged = js.Any.fromFunction0(isValueChanged), loadValue = js.Any.fromFunction1(loadValue), serializeValue = js.Any.fromFunction0(serializeValue), validate = js.Any.fromFunction0(validate))
      __obj.asInstanceOf[PercentComplete[T]]
    }
  }
  
  trait Text[T /* <: SlickData */]
    extends StObject
       with Editor[T] {
    
    def getValue(): String
    
    def setValue(`val`: String): Unit
  }
  object Text {
    
    inline def apply[T /* <: SlickData */](
      applyValue: (T, String) => Unit,
      destroy: () => Unit,
      focus: () => Unit,
      getValue: () => String,
      init: () => Unit,
      isValueChanged: () => Boolean,
      loadValue: T => Unit,
      serializeValue: () => Any,
      setValue: String => Unit,
      validate: () => ValidateResults
    ): Text[T] = {
      val __obj = js.Dynamic.literal(applyValue = js.Any.fromFunction2(applyValue), destroy = js.Any.fromFunction0(destroy), focus = js.Any.fromFunction0(focus), getValue = js.Any.fromFunction0(getValue), init = js.Any.fromFunction0(init), isValueChanged = js.Any.fromFunction0(isValueChanged), loadValue = js.Any.fromFunction1(loadValue), serializeValue = js.Any.fromFunction0(serializeValue), setValue = js.Any.fromFunction1(setValue), validate = js.Any.fromFunction0(validate))
      __obj.asInstanceOf[Text[T]]
    }
    
    extension [Self <: Text[?], T /* <: SlickData */](x: Self & Text[T]) {
      
      inline def setGetValue(value: () => String): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
      
      inline def setSetValue(value: String => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
    }
  }
  
  trait YesNoSelect[T /* <: SlickData */]
    extends StObject
       with Editor[T]
  object YesNoSelect {
    
    inline def apply[T /* <: SlickData */](
      applyValue: (T, String) => Unit,
      destroy: () => Unit,
      focus: () => Unit,
      init: () => Unit,
      isValueChanged: () => Boolean,
      loadValue: T => Unit,
      serializeValue: () => Any,
      validate: () => ValidateResults
    ): YesNoSelect[T] = {
      val __obj = js.Dynamic.literal(applyValue = js.Any.fromFunction2(applyValue), destroy = js.Any.fromFunction0(destroy), focus = js.Any.fromFunction0(focus), init = js.Any.fromFunction0(init), isValueChanged = js.Any.fromFunction0(isValueChanged), loadValue = js.Any.fromFunction1(loadValue), serializeValue = js.Any.fromFunction0(serializeValue), validate = js.Any.fromFunction0(validate))
      __obj.asInstanceOf[YesNoSelect[T]]
    }
  }
}
