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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait BeforeDragParams extends StObject {
    
    var elements: js.Array[Element] = js.native
    
    var index: Double = js.native
  }
  object BeforeDragParams {
    
    @scala.inline
    def apply(elements: js.Array[Element], index: Double): BeforeDragParams = {
      val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[BeforeDragParams]
    }
    
    @scala.inline
    implicit class BeforeDragParamsMutableBuilder[Self <: BeforeDragParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElements(value: js.Array[Element]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementsVarargs(value: Element*): Self = StObject.set(x, "elements", js.Array(value :_*))
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IItemProps extends StObject {
    
    var `aria-roledescription`: js.UndefOr[String] = js.native
    
    var key: js.UndefOr[Double] = js.native
    
    var onKeyDown: js.UndefOr[js.Function1[/* e */ KeyboardEvent[Element], Unit]] = js.native
    
    var onWheel: js.UndefOr[js.Function1[/* e */ WheelEvent[Element], Unit]] = js.native
    
    var ref: js.UndefOr[RefObject[_]] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var tabIndex: js.UndefOr[Double] = js.native
  }
  object IItemProps {
    
    @scala.inline
    def apply(): IItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IItemProps]
    }
    
    @scala.inline
    implicit class IItemPropsMutableBuilder[Self <: IItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setAria-roledescription`(value: String): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
      
      @scala.inline
      def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: /* e */ KeyboardEvent[Element] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnWheel(value: /* e */ WheelEvent[Element] => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
      
      @scala.inline
      def setRef(value: RefObject[_]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    }
  }
  
  @js.native
  trait IProps[Value] extends StObject {
    
    var beforeDrag: js.UndefOr[js.Function1[/* params */ BeforeDragParams, Unit]] = js.native
    
    var container: js.UndefOr[Element | Null] = js.native
    
    var lockVertically: Boolean = js.native
    
    def onChange(meta: OnChangeMeta): Unit = js.native
    
    var removableByMove: Boolean = js.native
    
    def renderItem(params: RenderItemParams[Value]): ReactNode = js.native
    
    def renderList(props: RenderListParams): ReactNode = js.native
    
    var transitionDuration: Double = js.native
    
    var values: js.Array[Value] = js.native
    
    var voiceover: IVoiceover = js.native
  }
  object IProps {
    
    @scala.inline
    def apply[Value](
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
    implicit class IPropsMutableBuilder[Self <: IProps[_], Value] (val x: Self with IProps[Value]) extends AnyVal {
      
      @scala.inline
      def setBeforeDrag(value: /* params */ BeforeDragParams => Unit): Self = StObject.set(x, "beforeDrag", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeDragUndefined: Self = StObject.set(x, "beforeDrag", js.undefined)
      
      @scala.inline
      def setContainer(value: Element): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerNull: Self = StObject.set(x, "container", null)
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      @scala.inline
      def setLockVertically(value: Boolean): Self = StObject.set(x, "lockVertically", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnChange(value: OnChangeMeta => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemovableByMove(value: Boolean): Self = StObject.set(x, "removableByMove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderItem(value: RenderItemParams[Value] => ReactNode): Self = StObject.set(x, "renderItem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderList(value: RenderListParams => ReactNode): Self = StObject.set(x, "renderList", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: js.Array[Value]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesVarargs(value: Value*): Self = StObject.set(x, "values", js.Array(value :_*))
      
      @scala.inline
      def setVoiceover(value: IVoiceover): Self = StObject.set(x, "voiceover", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IVoiceover extends StObject {
    
    def canceled(position: Double): String = js.native
    
    def dropped(from: Double, to: Double): String = js.native
    
    def item(position: Double): String = js.native
    
    def lifted(position: Double): String = js.native
    
    def moved(position: Double, up: Boolean): String = js.native
  }
  object IVoiceover {
    
    @scala.inline
    def apply(
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
    implicit class IVoiceoverMutableBuilder[Self <: IVoiceover] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanceled(value: Double => String): Self = StObject.set(x, "canceled", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDropped(value: (Double, Double) => String): Self = StObject.set(x, "dropped", js.Any.fromFunction2(value))
      
      @scala.inline
      def setItem(value: Double => String): Self = StObject.set(x, "item", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLifted(value: Double => String): Self = StObject.set(x, "lifted", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMoved(value: (Double, Boolean) => String): Self = StObject.set(x, "moved", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait OnChangeMeta extends StObject {
    
    var newIndex: Double = js.native
    
    var oldIndex: Double = js.native
    
    var targetRect: ClientRect = js.native
  }
  object OnChangeMeta {
    
    @scala.inline
    def apply(newIndex: Double, oldIndex: Double, targetRect: ClientRect): OnChangeMeta = {
      val __obj = js.Dynamic.literal(newIndex = newIndex.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any], targetRect = targetRect.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnChangeMeta]
    }
    
    @scala.inline
    implicit class OnChangeMetaMutableBuilder[Self <: OnChangeMeta] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNewIndex(value: Double): Self = StObject.set(x, "newIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldIndex(value: Double): Self = StObject.set(x, "oldIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetRect(value: ClientRect): Self = StObject.set(x, "targetRect", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RenderItemParams[Value] extends StObject {
    
    var index: js.UndefOr[Double] = js.native
    
    var isDragged: Boolean = js.native
    
    var isOutOfBounds: Boolean = js.native
    
    var isSelected: Boolean = js.native
    
    var props: IItemProps = js.native
    
    var value: Value = js.native
  }
  object RenderItemParams {
    
    @scala.inline
    def apply[Value](isDragged: Boolean, isOutOfBounds: Boolean, isSelected: Boolean, props: IItemProps, value: Value): RenderItemParams[Value] = {
      val __obj = js.Dynamic.literal(isDragged = isDragged.asInstanceOf[js.Any], isOutOfBounds = isOutOfBounds.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderItemParams[Value]]
    }
    
    @scala.inline
    implicit class RenderItemParamsMutableBuilder[Self <: RenderItemParams[_], Value] (val x: Self with RenderItemParams[Value]) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setIsDragged(value: Boolean): Self = StObject.set(x, "isDragged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOutOfBounds(value: Boolean): Self = StObject.set(x, "isOutOfBounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: IItemProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RenderListParams extends StObject {
    
    var children: ReactNode = js.native
    
    var isDragged: Boolean = js.native
    
    var props: Ref = js.native
  }
  object RenderListParams {
    
    @scala.inline
    def apply(isDragged: Boolean, props: Ref): RenderListParams = {
      val __obj = js.Dynamic.literal(isDragged = isDragged.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderListParams]
    }
    
    @scala.inline
    implicit class RenderListParamsMutableBuilder[Self <: RenderListParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setIsDragged(value: Boolean): Self = StObject.set(x, "isDragged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: Ref): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type TEvent = (MouseEvent[Element, NativeMouseEvent]) | TouchEvent[Element] | KeyboardEvent[Element]
}
