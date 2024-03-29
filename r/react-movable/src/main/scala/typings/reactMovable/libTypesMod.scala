package typings.reactMovable

import typings.react.mod.CSSProperties
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.react.mod.TouchEvent
import typings.react.mod.WheelEvent
import typings.reactMovable.anon.Ref
import typings.std.ClientRect
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesMod {
  
  trait BeforeDragParams extends StObject {
    
    var elements: js.Array[Element]
    
    var index: Double
  }
  object BeforeDragParams {
    
    inline def apply(elements: js.Array[Element], index: Double): BeforeDragParams = {
      val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[BeforeDragParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BeforeDragParams] (val x: Self) extends AnyVal {
      
      inline def setElements(value: js.Array[Element]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      inline def setElementsVarargs(value: Element*): Self = StObject.set(x, "elements", js.Array(value*))
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    }
  }
  
  trait IItemProps extends StObject {
    
    var `aria-roledescription`: js.UndefOr[String] = js.undefined
    
    var key: js.UndefOr[Double] = js.undefined
    
    var onKeyDown: js.UndefOr[js.Function1[/* e */ KeyboardEvent[Element], Unit]] = js.undefined
    
    var onWheel: js.UndefOr[js.Function1[/* e */ WheelEvent[Element], Unit]] = js.undefined
    
    var ref: js.UndefOr[RefObject[Any]] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
  }
  object IItemProps {
    
    inline def apply(): IItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IItemProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IItemProps] (val x: Self) extends AnyVal {
      
      inline def `setAria-roledescription`(value: String): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
      
      inline def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
      
      inline def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setOnKeyDown(value: /* e */ KeyboardEvent[Element] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnWheel(value: /* e */ WheelEvent[Element] => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
      
      inline def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
      
      inline def setRef(value: RefObject[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    }
  }
  
  trait IProps[Value] extends StObject {
    
    var beforeDrag: js.UndefOr[js.Function1[/* params */ BeforeDragParams, Unit]] = js.undefined
    
    var container: js.UndefOr[Element | Null] = js.undefined
    
    var lockVertically: Boolean
    
    def onChange(meta: OnChangeMeta): Unit
    
    var removableByMove: Boolean
    
    def renderItem(params: RenderItemParams[Value]): ReactNode
    
    def renderList(props: RenderListParams): ReactNode
    
    var transitionDuration: Double
    
    var values: js.Array[Value]
    
    var voiceover: IVoiceover
  }
  object IProps {
    
    inline def apply[Value](
      lockVertically: Boolean,
      onChange: OnChangeMeta => Unit,
      removableByMove: Boolean,
      renderItem: RenderItemParams[Value] => ReactNode,
      renderList: RenderListParams => ReactNode,
      transitionDuration: Double,
      values: js.Array[Value],
      voiceover: IVoiceover
    ): IProps[Value] = {
      val __obj = js.Dynamic.literal(lockVertically = lockVertically.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), removableByMove = removableByMove.asInstanceOf[js.Any], renderItem = js.Any.fromFunction1(renderItem), renderList = js.Any.fromFunction1(renderList), transitionDuration = transitionDuration.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], voiceover = voiceover.asInstanceOf[js.Any])
      __obj.asInstanceOf[IProps[Value]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IProps[?], Value] (val x: Self & IProps[Value]) extends AnyVal {
      
      inline def setBeforeDrag(value: /* params */ BeforeDragParams => Unit): Self = StObject.set(x, "beforeDrag", js.Any.fromFunction1(value))
      
      inline def setBeforeDragUndefined: Self = StObject.set(x, "beforeDrag", js.undefined)
      
      inline def setContainer(value: Element): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerNull: Self = StObject.set(x, "container", null)
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setLockVertically(value: Boolean): Self = StObject.set(x, "lockVertically", value.asInstanceOf[js.Any])
      
      inline def setOnChange(value: OnChangeMeta => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setRemovableByMove(value: Boolean): Self = StObject.set(x, "removableByMove", value.asInstanceOf[js.Any])
      
      inline def setRenderItem(value: RenderItemParams[Value] => ReactNode): Self = StObject.set(x, "renderItem", js.Any.fromFunction1(value))
      
      inline def setRenderList(value: RenderListParams => ReactNode): Self = StObject.set(x, "renderList", js.Any.fromFunction1(value))
      
      inline def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[Value]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: Value*): Self = StObject.set(x, "values", js.Array(value*))
      
      inline def setVoiceover(value: IVoiceover): Self = StObject.set(x, "voiceover", value.asInstanceOf[js.Any])
    }
  }
  
  trait IVoiceover extends StObject {
    
    def canceled(position: Double): String
    
    def dropped(from: Double, to: Double): String
    
    def item(position: Double): String
    
    def lifted(position: Double): String
    
    def moved(position: Double, up: Boolean): String
  }
  object IVoiceover {
    
    inline def apply(
      canceled: Double => String,
      dropped: (Double, Double) => String,
      item: Double => String,
      lifted: Double => String,
      moved: (Double, Boolean) => String
    ): IVoiceover = {
      val __obj = js.Dynamic.literal(canceled = js.Any.fromFunction1(canceled), dropped = js.Any.fromFunction2(dropped), item = js.Any.fromFunction1(item), lifted = js.Any.fromFunction1(lifted), moved = js.Any.fromFunction2(moved))
      __obj.asInstanceOf[IVoiceover]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IVoiceover] (val x: Self) extends AnyVal {
      
      inline def setCanceled(value: Double => String): Self = StObject.set(x, "canceled", js.Any.fromFunction1(value))
      
      inline def setDropped(value: (Double, Double) => String): Self = StObject.set(x, "dropped", js.Any.fromFunction2(value))
      
      inline def setItem(value: Double => String): Self = StObject.set(x, "item", js.Any.fromFunction1(value))
      
      inline def setLifted(value: Double => String): Self = StObject.set(x, "lifted", js.Any.fromFunction1(value))
      
      inline def setMoved(value: (Double, Boolean) => String): Self = StObject.set(x, "moved", js.Any.fromFunction2(value))
    }
  }
  
  trait OnChangeMeta extends StObject {
    
    var newIndex: Double
    
    var oldIndex: Double
    
    var targetRect: ClientRect
  }
  object OnChangeMeta {
    
    inline def apply(newIndex: Double, oldIndex: Double, targetRect: ClientRect): OnChangeMeta = {
      val __obj = js.Dynamic.literal(newIndex = newIndex.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any], targetRect = targetRect.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnChangeMeta]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnChangeMeta] (val x: Self) extends AnyVal {
      
      inline def setNewIndex(value: Double): Self = StObject.set(x, "newIndex", value.asInstanceOf[js.Any])
      
      inline def setOldIndex(value: Double): Self = StObject.set(x, "oldIndex", value.asInstanceOf[js.Any])
      
      inline def setTargetRect(value: ClientRect): Self = StObject.set(x, "targetRect", value.asInstanceOf[js.Any])
    }
  }
  
  trait RenderItemParams[Value] extends StObject {
    
    var index: js.UndefOr[Double] = js.undefined
    
    var isDragged: Boolean
    
    var isOutOfBounds: Boolean
    
    var isSelected: Boolean
    
    var props: IItemProps
    
    var value: Value
  }
  object RenderItemParams {
    
    inline def apply[Value](isDragged: Boolean, isOutOfBounds: Boolean, isSelected: Boolean, props: IItemProps, value: Value): RenderItemParams[Value] = {
      val __obj = js.Dynamic.literal(isDragged = isDragged.asInstanceOf[js.Any], isOutOfBounds = isOutOfBounds.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderItemParams[Value]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RenderItemParams[?], Value] (val x: Self & RenderItemParams[Value]) extends AnyVal {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setIsDragged(value: Boolean): Self = StObject.set(x, "isDragged", value.asInstanceOf[js.Any])
      
      inline def setIsOutOfBounds(value: Boolean): Self = StObject.set(x, "isOutOfBounds", value.asInstanceOf[js.Any])
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      inline def setProps(value: IItemProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait RenderListParams extends StObject {
    
    var children: ReactNode
    
    var isDragged: Boolean
    
    var props: Ref
  }
  object RenderListParams {
    
    inline def apply(isDragged: Boolean, props: Ref): RenderListParams = {
      val __obj = js.Dynamic.literal(isDragged = isDragged.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderListParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RenderListParams] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setIsDragged(value: Boolean): Self = StObject.set(x, "isDragged", value.asInstanceOf[js.Any])
      
      inline def setProps(value: Ref): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type TEvent = (MouseEvent[Element, NativeMouseEvent]) | TouchEvent[Element] | KeyboardEvent[Element]
}
