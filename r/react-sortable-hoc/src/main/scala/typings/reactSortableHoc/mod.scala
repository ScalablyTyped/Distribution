package typings.reactSortableHoc

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.SFC
import typings.react.mod.TouchEvent
import typings.reactSortableHoc.anon.Cancel
import typings.reactSortableHoc.anon.Target
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-sortable-hoc", "SortableContainer")
  @js.native
  def SortableContainer[P](wrappedComponent: WrappedComponent[P]): ComponentClass[P with SortableContainerProps, ComponentState] = js.native
  @JSImport("react-sortable-hoc", "SortableContainer")
  @js.native
  def SortableContainer[P](wrappedComponent: WrappedComponent[P], config: Config): ComponentClass[P with SortableContainerProps, ComponentState] = js.native
  
  @JSImport("react-sortable-hoc", "SortableElement")
  @js.native
  def SortableElement[P](wrappedComponent: WrappedComponent[P]): ComponentClass[P with SortableElementProps, ComponentState] = js.native
  @JSImport("react-sortable-hoc", "SortableElement")
  @js.native
  def SortableElement[P](wrappedComponent: WrappedComponent[P], config: Config): ComponentClass[P with SortableElementProps, ComponentState] = js.native
  
  @JSImport("react-sortable-hoc", "SortableHandle")
  @js.native
  def SortableHandle[P](wrappedComponent: WrappedComponent[P]): ComponentClass[P, ComponentState] = js.native
  @JSImport("react-sortable-hoc", "SortableHandle")
  @js.native
  def SortableHandle[P](wrappedComponent: WrappedComponent[P], config: Config): ComponentClass[P, ComponentState] = js.native
  
  @JSImport("react-sortable-hoc", "arrayMove")
  @js.native
  def arrayMove[T](collection: js.Array[T], previousIndex: Double, newIndex: Double): js.Array[T] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactSortableHoc.reactSortableHocStrings.x
    - typings.reactSortableHoc.reactSortableHocStrings.y
    - typings.reactSortableHoc.reactSortableHocStrings.xy
  */
  trait Axis extends StObject
  object Axis {
    
    @scala.inline
    def x: typings.reactSortableHoc.reactSortableHocStrings.x = "x".asInstanceOf[typings.reactSortableHoc.reactSortableHocStrings.x]
    
    @scala.inline
    def xy: typings.reactSortableHoc.reactSortableHocStrings.xy = "xy".asInstanceOf[typings.reactSortableHoc.reactSortableHocStrings.xy]
    
    @scala.inline
    def y: typings.reactSortableHoc.reactSortableHocStrings.y = "y".asInstanceOf[typings.reactSortableHoc.reactSortableHocStrings.y]
  }
  
  @js.native
  trait Config extends StObject {
    
    var withRef: Boolean = js.native
  }
  object Config {
    
    @scala.inline
    def apply(withRef: Boolean): Config = {
      val __obj = js.Dynamic.literal(withRef = withRef.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWithRef(value: Boolean): Self = StObject.set(x, "withRef", value.asInstanceOf[js.Any])
    }
  }
  
  type ContainerGetter = js.Function1[/* element */ ReactElement, HTMLElement | js.Promise[HTMLElement]]
  
  @js.native
  trait Dimensions extends StObject {
    
    var height: Double = js.native
    
    var width: Double = js.native
  }
  object Dimensions {
    
    @scala.inline
    def apply(height: Double, width: Double): Dimensions = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dimensions]
    }
    
    @scala.inline
    implicit class DimensionsMutableBuilder[Self <: Dimensions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  type HelperContainerGetter = js.Function0[HTMLElement]
  
  type Offset = Double | String
  
  @js.native
  trait SortEnd extends StObject {
    
    var collection: Offset = js.native
    
    var isKeySorting: Boolean = js.native
    
    var newIndex: Double = js.native
    
    var nodes: js.Array[HTMLElement] = js.native
    
    var oldIndex: Double = js.native
  }
  object SortEnd {
    
    @scala.inline
    def apply(
      collection: Offset,
      isKeySorting: Boolean,
      newIndex: Double,
      nodes: js.Array[HTMLElement],
      oldIndex: Double
    ): SortEnd = {
      val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], isKeySorting = isKeySorting.asInstanceOf[js.Any], newIndex = newIndex.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[SortEnd]
    }
    
    @scala.inline
    implicit class SortEndMutableBuilder[Self <: SortEnd] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCollection(value: Offset): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsKeySorting(value: Boolean): Self = StObject.set(x, "isKeySorting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewIndex(value: Double): Self = StObject.set(x, "newIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodes(value: js.Array[HTMLElement]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodesVarargs(value: HTMLElement*): Self = StObject.set(x, "nodes", js.Array(value :_*))
      
      @scala.inline
      def setOldIndex(value: Double): Self = StObject.set(x, "oldIndex", value.asInstanceOf[js.Any])
    }
  }
  
  type SortEndHandler = js.Function2[/* sort */ SortEnd, /* event */ SortEvent, Unit]
  
  type SortEvent = (MouseEvent[js.Any, NativeMouseEvent]) | TouchEvent[js.Any]
  
  type SortEventWithTag = SortEvent with Target
  
  type SortMoveHandler = js.Function1[/* event */ SortEvent, Unit]
  
  @js.native
  trait SortOver extends StObject {
    
    var collection: Offset = js.native
    
    var helper: HTMLElement = js.native
    
    var index: Double = js.native
    
    var isKeySorting: Boolean = js.native
    
    var newIndex: Double = js.native
    
    var nodes: js.Array[HTMLElement] = js.native
    
    var oldIndex: Double = js.native
  }
  object SortOver {
    
    @scala.inline
    def apply(
      collection: Offset,
      helper: HTMLElement,
      index: Double,
      isKeySorting: Boolean,
      newIndex: Double,
      nodes: js.Array[HTMLElement],
      oldIndex: Double
    ): SortOver = {
      val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], helper = helper.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isKeySorting = isKeySorting.asInstanceOf[js.Any], newIndex = newIndex.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[SortOver]
    }
    
    @scala.inline
    implicit class SortOverMutableBuilder[Self <: SortOver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCollection(value: Offset): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelper(value: HTMLElement): Self = StObject.set(x, "helper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsKeySorting(value: Boolean): Self = StObject.set(x, "isKeySorting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewIndex(value: Double): Self = StObject.set(x, "newIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodes(value: js.Array[HTMLElement]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodesVarargs(value: HTMLElement*): Self = StObject.set(x, "nodes", js.Array(value :_*))
      
      @scala.inline
      def setOldIndex(value: Double): Self = StObject.set(x, "oldIndex", value.asInstanceOf[js.Any])
    }
  }
  
  type SortOverHandler = js.Function2[/* sort */ SortOver, /* event */ SortEvent, Unit]
  
  @js.native
  trait SortStart extends StObject {
    
    var collection: Offset = js.native
    
    var helper: HTMLElement = js.native
    
    var index: Double = js.native
    
    var isKeySorting: Boolean = js.native
    
    var node: Element = js.native
    
    var nodes: js.Array[HTMLElement] = js.native
  }
  object SortStart {
    
    @scala.inline
    def apply(
      collection: Offset,
      helper: HTMLElement,
      index: Double,
      isKeySorting: Boolean,
      node: Element,
      nodes: js.Array[HTMLElement]
    ): SortStart = {
      val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], helper = helper.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isKeySorting = isKeySorting.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[SortStart]
    }
    
    @scala.inline
    implicit class SortStartMutableBuilder[Self <: SortStart] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCollection(value: Offset): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelper(value: HTMLElement): Self = StObject.set(x, "helper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsKeySorting(value: Boolean): Self = StObject.set(x, "isKeySorting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: Element): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodes(value: js.Array[HTMLElement]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodesVarargs(value: HTMLElement*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    }
  }
  
  type SortStartHandler = js.Function2[/* sort */ SortStart, /* event */ SortEvent, Unit]
  
  @js.native
  trait SortableContainerProps extends StObject {
    
    var axis: js.UndefOr[Axis] = js.native
    
    var distance: js.UndefOr[Double] = js.native
    
    var getContainer: js.UndefOr[ContainerGetter] = js.native
    
    var getHelperDimensions: js.UndefOr[js.Function1[/* sort */ SortStart, Dimensions]] = js.native
    
    var helperClass: js.UndefOr[String] = js.native
    
    var helperContainer: js.UndefOr[HTMLElement | HelperContainerGetter] = js.native
    
    var hideSortableGhost: js.UndefOr[Boolean] = js.native
    
    var keyCodes: js.UndefOr[Cancel] = js.native
    
    var keyboardSortingTransitionDuration: js.UndefOr[Double] = js.native
    
    var lockAxis: js.UndefOr[Axis] = js.native
    
    var lockOffset: js.UndefOr[Offset | (js.Tuple2[Offset, Offset])] = js.native
    
    var lockToContainerEdges: js.UndefOr[Boolean] = js.native
    
    var onSortEnd: js.UndefOr[SortEndHandler] = js.native
    
    var onSortMove: js.UndefOr[SortMoveHandler] = js.native
    
    var onSortOver: js.UndefOr[SortOverHandler] = js.native
    
    var onSortStart: js.UndefOr[SortStartHandler] = js.native
    
    var pressDelay: js.UndefOr[Double] = js.native
    
    var pressThreshold: js.UndefOr[Double] = js.native
    
    var shouldCancelStart: js.UndefOr[js.Function1[/* event */ SortEvent | SortEventWithTag, Boolean]] = js.native
    
    var transitionDuration: js.UndefOr[Double] = js.native
    
    var updateBeforeSortStart: js.UndefOr[SortStartHandler] = js.native
    
    var useDragHandle: js.UndefOr[Boolean] = js.native
    
    var useWindowAsScrollContainer: js.UndefOr[Boolean] = js.native
  }
  object SortableContainerProps {
    
    @scala.inline
    def apply(): SortableContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SortableContainerProps]
    }
    
    @scala.inline
    implicit class SortableContainerPropsMutableBuilder[Self <: SortableContainerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAxis(value: Axis): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      @scala.inline
      def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
      
      @scala.inline
      def setGetContainer(value: /* element */ ReactElement => HTMLElement | js.Promise[HTMLElement]): Self = StObject.set(x, "getContainer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetContainerUndefined: Self = StObject.set(x, "getContainer", js.undefined)
      
      @scala.inline
      def setGetHelperDimensions(value: /* sort */ SortStart => Dimensions): Self = StObject.set(x, "getHelperDimensions", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetHelperDimensionsUndefined: Self = StObject.set(x, "getHelperDimensions", js.undefined)
      
      @scala.inline
      def setHelperClass(value: String): Self = StObject.set(x, "helperClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelperClassUndefined: Self = StObject.set(x, "helperClass", js.undefined)
      
      @scala.inline
      def setHelperContainer(value: HTMLElement | HelperContainerGetter): Self = StObject.set(x, "helperContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelperContainerFunction0(value: () => HTMLElement): Self = StObject.set(x, "helperContainer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHelperContainerUndefined: Self = StObject.set(x, "helperContainer", js.undefined)
      
      @scala.inline
      def setHideSortableGhost(value: Boolean): Self = StObject.set(x, "hideSortableGhost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideSortableGhostUndefined: Self = StObject.set(x, "hideSortableGhost", js.undefined)
      
      @scala.inline
      def setKeyCodes(value: Cancel): Self = StObject.set(x, "keyCodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyCodesUndefined: Self = StObject.set(x, "keyCodes", js.undefined)
      
      @scala.inline
      def setKeyboardSortingTransitionDuration(value: Double): Self = StObject.set(x, "keyboardSortingTransitionDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardSortingTransitionDurationUndefined: Self = StObject.set(x, "keyboardSortingTransitionDuration", js.undefined)
      
      @scala.inline
      def setLockAxis(value: Axis): Self = StObject.set(x, "lockAxis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLockAxisUndefined: Self = StObject.set(x, "lockAxis", js.undefined)
      
      @scala.inline
      def setLockOffset(value: Offset | (js.Tuple2[Offset, Offset])): Self = StObject.set(x, "lockOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLockOffsetUndefined: Self = StObject.set(x, "lockOffset", js.undefined)
      
      @scala.inline
      def setLockToContainerEdges(value: Boolean): Self = StObject.set(x, "lockToContainerEdges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLockToContainerEdgesUndefined: Self = StObject.set(x, "lockToContainerEdges", js.undefined)
      
      @scala.inline
      def setOnSortEnd(value: (/* sort */ SortEnd, /* event */ SortEvent) => Unit): Self = StObject.set(x, "onSortEnd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSortEndUndefined: Self = StObject.set(x, "onSortEnd", js.undefined)
      
      @scala.inline
      def setOnSortMove(value: /* event */ SortEvent => Unit): Self = StObject.set(x, "onSortMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSortMoveUndefined: Self = StObject.set(x, "onSortMove", js.undefined)
      
      @scala.inline
      def setOnSortOver(value: (/* sort */ SortOver, /* event */ SortEvent) => Unit): Self = StObject.set(x, "onSortOver", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSortOverUndefined: Self = StObject.set(x, "onSortOver", js.undefined)
      
      @scala.inline
      def setOnSortStart(value: (/* sort */ SortStart, /* event */ SortEvent) => Unit): Self = StObject.set(x, "onSortStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSortStartUndefined: Self = StObject.set(x, "onSortStart", js.undefined)
      
      @scala.inline
      def setPressDelay(value: Double): Self = StObject.set(x, "pressDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPressDelayUndefined: Self = StObject.set(x, "pressDelay", js.undefined)
      
      @scala.inline
      def setPressThreshold(value: Double): Self = StObject.set(x, "pressThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPressThresholdUndefined: Self = StObject.set(x, "pressThreshold", js.undefined)
      
      @scala.inline
      def setShouldCancelStart(value: /* event */ SortEvent | SortEventWithTag => Boolean): Self = StObject.set(x, "shouldCancelStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShouldCancelStartUndefined: Self = StObject.set(x, "shouldCancelStart", js.undefined)
      
      @scala.inline
      def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
      
      @scala.inline
      def setUpdateBeforeSortStart(value: (/* sort */ SortStart, /* event */ SortEvent) => Unit): Self = StObject.set(x, "updateBeforeSortStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUpdateBeforeSortStartUndefined: Self = StObject.set(x, "updateBeforeSortStart", js.undefined)
      
      @scala.inline
      def setUseDragHandle(value: Boolean): Self = StObject.set(x, "useDragHandle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseDragHandleUndefined: Self = StObject.set(x, "useDragHandle", js.undefined)
      
      @scala.inline
      def setUseWindowAsScrollContainer(value: Boolean): Self = StObject.set(x, "useWindowAsScrollContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseWindowAsScrollContainerUndefined: Self = StObject.set(x, "useWindowAsScrollContainer", js.undefined)
    }
  }
  
  @js.native
  trait SortableElementProps extends StObject {
    
    var collection: js.UndefOr[Offset] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var index: Double = js.native
  }
  object SortableElementProps {
    
    @scala.inline
    def apply(index: Double): SortableElementProps = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[SortableElementProps]
    }
    
    @scala.inline
    implicit class SortableElementPropsMutableBuilder[Self <: SortableElementProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCollection(value: Offset): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollectionUndefined: Self = StObject.set(x, "collection", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    }
  }
  
  type WrappedComponent[P] = (ComponentClass[P, ComponentState]) | SFC[P] | WrappedComponentFactory[P]
  
  type WrappedComponentFactory[P] = js.Function1[/* props */ P, typings.react.mod.global.JSX.Element]
}
