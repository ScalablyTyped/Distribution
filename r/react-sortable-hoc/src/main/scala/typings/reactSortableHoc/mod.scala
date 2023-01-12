package typings.reactSortableHoc

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.TouchEvent
import typings.reactSortableHoc.anon.Cancel
import typings.reactSortableHoc.anon.Target
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-sortable-hoc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def SortableContainer[P](wrappedComponent: WrappedComponent[P]): ComponentClass[P & SortableContainerProps, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("SortableContainer")(wrappedComponent.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[P & SortableContainerProps, ComponentState]]
  inline def SortableContainer[P](wrappedComponent: WrappedComponent[P], config: Config): ComponentClass[P & SortableContainerProps, ComponentState] = (^.asInstanceOf[js.Dynamic].applyDynamic("SortableContainer")(wrappedComponent.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[ComponentClass[P & SortableContainerProps, ComponentState]]
  
  inline def SortableElement[P](wrappedComponent: WrappedComponent[P]): ComponentClass[P & SortableElementProps, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("SortableElement")(wrappedComponent.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[P & SortableElementProps, ComponentState]]
  inline def SortableElement[P](wrappedComponent: WrappedComponent[P], config: Config): ComponentClass[P & SortableElementProps, ComponentState] = (^.asInstanceOf[js.Dynamic].applyDynamic("SortableElement")(wrappedComponent.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[ComponentClass[P & SortableElementProps, ComponentState]]
  
  inline def SortableHandle[P](wrappedComponent: WrappedComponent[P]): ComponentClass[P, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("SortableHandle")(wrappedComponent.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[P, ComponentState]]
  inline def SortableHandle[P](wrappedComponent: WrappedComponent[P], config: Config): ComponentClass[P, ComponentState] = (^.asInstanceOf[js.Dynamic].applyDynamic("SortableHandle")(wrappedComponent.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[ComponentClass[P, ComponentState]]
  
  inline def arrayMove[T](collection: js.Array[T], previousIndex: Double, newIndex: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayMove")(collection.asInstanceOf[js.Any], previousIndex.asInstanceOf[js.Any], newIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactSortableHoc.reactSortableHocStrings.x
    - typings.reactSortableHoc.reactSortableHocStrings.y
    - typings.reactSortableHoc.reactSortableHocStrings.xy
  */
  trait Axis extends StObject
  object Axis {
    
    inline def x: typings.reactSortableHoc.reactSortableHocStrings.x = "x".asInstanceOf[typings.reactSortableHoc.reactSortableHocStrings.x]
    
    inline def xy: typings.reactSortableHoc.reactSortableHocStrings.xy = "xy".asInstanceOf[typings.reactSortableHoc.reactSortableHocStrings.xy]
    
    inline def y: typings.reactSortableHoc.reactSortableHocStrings.y = "y".asInstanceOf[typings.reactSortableHoc.reactSortableHocStrings.y]
  }
  
  trait Config extends StObject {
    
    var withRef: Boolean
  }
  object Config {
    
    inline def apply(withRef: Boolean): Config = {
      val __obj = js.Dynamic.literal(withRef = withRef.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      inline def setWithRef(value: Boolean): Self = StObject.set(x, "withRef", value.asInstanceOf[js.Any])
    }
  }
  
  type ContainerGetter = js.Function1[/* element */ ReactElement, HTMLElement | js.Promise[HTMLElement]]
  
  trait Dimensions extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object Dimensions {
    
    inline def apply(height: Double, width: Double): Dimensions = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dimensions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dimensions] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  type HelperContainerGetter = js.Function0[HTMLElement]
  
  type Offset = Double | String
  
  trait SortEnd extends StObject {
    
    var collection: Offset
    
    var isKeySorting: Boolean
    
    var newIndex: Double
    
    var nodes: js.Array[HTMLElement]
    
    var oldIndex: Double
  }
  object SortEnd {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: SortEnd] (val x: Self) extends AnyVal {
      
      inline def setCollection(value: Offset): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
      
      inline def setIsKeySorting(value: Boolean): Self = StObject.set(x, "isKeySorting", value.asInstanceOf[js.Any])
      
      inline def setNewIndex(value: Double): Self = StObject.set(x, "newIndex", value.asInstanceOf[js.Any])
      
      inline def setNodes(value: js.Array[HTMLElement]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: HTMLElement*): Self = StObject.set(x, "nodes", js.Array(value*))
      
      inline def setOldIndex(value: Double): Self = StObject.set(x, "oldIndex", value.asInstanceOf[js.Any])
    }
  }
  
  type SortEndHandler = js.Function2[/* sort */ SortEnd, /* event */ SortEvent, Unit]
  
  type SortEvent = (MouseEvent[Any, NativeMouseEvent]) | TouchEvent[Any]
  
  type SortEventWithTag = SortEvent & Target
  
  type SortMoveHandler = js.Function1[/* event */ SortEvent, Unit]
  
  trait SortOver extends StObject {
    
    var collection: Offset
    
    var helper: HTMLElement
    
    var index: Double
    
    var isKeySorting: Boolean
    
    var newIndex: Double
    
    var nodes: js.Array[HTMLElement]
    
    var oldIndex: Double
  }
  object SortOver {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: SortOver] (val x: Self) extends AnyVal {
      
      inline def setCollection(value: Offset): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
      
      inline def setHelper(value: HTMLElement): Self = StObject.set(x, "helper", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIsKeySorting(value: Boolean): Self = StObject.set(x, "isKeySorting", value.asInstanceOf[js.Any])
      
      inline def setNewIndex(value: Double): Self = StObject.set(x, "newIndex", value.asInstanceOf[js.Any])
      
      inline def setNodes(value: js.Array[HTMLElement]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: HTMLElement*): Self = StObject.set(x, "nodes", js.Array(value*))
      
      inline def setOldIndex(value: Double): Self = StObject.set(x, "oldIndex", value.asInstanceOf[js.Any])
    }
  }
  
  type SortOverHandler = js.Function2[/* sort */ SortOver, /* event */ SortEvent, Unit]
  
  trait SortStart extends StObject {
    
    var collection: Offset
    
    var helper: HTMLElement
    
    var index: Double
    
    var isKeySorting: Boolean
    
    var node: Element
    
    var nodes: js.Array[HTMLElement]
  }
  object SortStart {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: SortStart] (val x: Self) extends AnyVal {
      
      inline def setCollection(value: Offset): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
      
      inline def setHelper(value: HTMLElement): Self = StObject.set(x, "helper", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIsKeySorting(value: Boolean): Self = StObject.set(x, "isKeySorting", value.asInstanceOf[js.Any])
      
      inline def setNode(value: Element): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNodes(value: js.Array[HTMLElement]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: HTMLElement*): Self = StObject.set(x, "nodes", js.Array(value*))
    }
  }
  
  type SortStartHandler = js.Function2[/* sort */ SortStart, /* event */ SortEvent, Unit]
  
  trait SortableContainerProps extends StObject {
    
    var axis: js.UndefOr[Axis] = js.undefined
    
    var disableAutoscroll: js.UndefOr[Boolean] = js.undefined
    
    var distance: js.UndefOr[Double] = js.undefined
    
    var getContainer: js.UndefOr[ContainerGetter] = js.undefined
    
    var getHelperDimensions: js.UndefOr[js.Function1[/* sort */ SortStart, Dimensions]] = js.undefined
    
    var helperClass: js.UndefOr[String] = js.undefined
    
    var helperContainer: js.UndefOr[HTMLElement | HelperContainerGetter] = js.undefined
    
    var hideSortableGhost: js.UndefOr[Boolean] = js.undefined
    
    var keyCodes: js.UndefOr[Cancel] = js.undefined
    
    var keyboardSortingTransitionDuration: js.UndefOr[Double] = js.undefined
    
    var lockAxis: js.UndefOr[Axis] = js.undefined
    
    var lockOffset: js.UndefOr[Offset | (js.Tuple2[Offset, Offset])] = js.undefined
    
    var lockToContainerEdges: js.UndefOr[Boolean] = js.undefined
    
    var onSortEnd: js.UndefOr[SortEndHandler] = js.undefined
    
    var onSortMove: js.UndefOr[SortMoveHandler] = js.undefined
    
    var onSortOver: js.UndefOr[SortOverHandler] = js.undefined
    
    var onSortStart: js.UndefOr[SortStartHandler] = js.undefined
    
    var pressDelay: js.UndefOr[Double] = js.undefined
    
    var pressThreshold: js.UndefOr[Double] = js.undefined
    
    var shouldCancelStart: js.UndefOr[js.Function1[/* event */ SortEvent | SortEventWithTag, Boolean]] = js.undefined
    
    var transitionDuration: js.UndefOr[Double] = js.undefined
    
    var updateBeforeSortStart: js.UndefOr[SortStartHandler] = js.undefined
    
    var useDragHandle: js.UndefOr[Boolean] = js.undefined
    
    var useWindowAsScrollContainer: js.UndefOr[Boolean] = js.undefined
  }
  object SortableContainerProps {
    
    inline def apply(): SortableContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SortableContainerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SortableContainerProps] (val x: Self) extends AnyVal {
      
      inline def setAxis(value: Axis): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      inline def setDisableAutoscroll(value: Boolean): Self = StObject.set(x, "disableAutoscroll", value.asInstanceOf[js.Any])
      
      inline def setDisableAutoscrollUndefined: Self = StObject.set(x, "disableAutoscroll", js.undefined)
      
      inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
      
      inline def setGetContainer(value: /* element */ ReactElement => HTMLElement | js.Promise[HTMLElement]): Self = StObject.set(x, "getContainer", js.Any.fromFunction1(value))
      
      inline def setGetContainerUndefined: Self = StObject.set(x, "getContainer", js.undefined)
      
      inline def setGetHelperDimensions(value: /* sort */ SortStart => Dimensions): Self = StObject.set(x, "getHelperDimensions", js.Any.fromFunction1(value))
      
      inline def setGetHelperDimensionsUndefined: Self = StObject.set(x, "getHelperDimensions", js.undefined)
      
      inline def setHelperClass(value: String): Self = StObject.set(x, "helperClass", value.asInstanceOf[js.Any])
      
      inline def setHelperClassUndefined: Self = StObject.set(x, "helperClass", js.undefined)
      
      inline def setHelperContainer(value: HTMLElement | HelperContainerGetter): Self = StObject.set(x, "helperContainer", value.asInstanceOf[js.Any])
      
      inline def setHelperContainerFunction0(value: () => HTMLElement): Self = StObject.set(x, "helperContainer", js.Any.fromFunction0(value))
      
      inline def setHelperContainerUndefined: Self = StObject.set(x, "helperContainer", js.undefined)
      
      inline def setHideSortableGhost(value: Boolean): Self = StObject.set(x, "hideSortableGhost", value.asInstanceOf[js.Any])
      
      inline def setHideSortableGhostUndefined: Self = StObject.set(x, "hideSortableGhost", js.undefined)
      
      inline def setKeyCodes(value: Cancel): Self = StObject.set(x, "keyCodes", value.asInstanceOf[js.Any])
      
      inline def setKeyCodesUndefined: Self = StObject.set(x, "keyCodes", js.undefined)
      
      inline def setKeyboardSortingTransitionDuration(value: Double): Self = StObject.set(x, "keyboardSortingTransitionDuration", value.asInstanceOf[js.Any])
      
      inline def setKeyboardSortingTransitionDurationUndefined: Self = StObject.set(x, "keyboardSortingTransitionDuration", js.undefined)
      
      inline def setLockAxis(value: Axis): Self = StObject.set(x, "lockAxis", value.asInstanceOf[js.Any])
      
      inline def setLockAxisUndefined: Self = StObject.set(x, "lockAxis", js.undefined)
      
      inline def setLockOffset(value: Offset | (js.Tuple2[Offset, Offset])): Self = StObject.set(x, "lockOffset", value.asInstanceOf[js.Any])
      
      inline def setLockOffsetUndefined: Self = StObject.set(x, "lockOffset", js.undefined)
      
      inline def setLockToContainerEdges(value: Boolean): Self = StObject.set(x, "lockToContainerEdges", value.asInstanceOf[js.Any])
      
      inline def setLockToContainerEdgesUndefined: Self = StObject.set(x, "lockToContainerEdges", js.undefined)
      
      inline def setOnSortEnd(value: (/* sort */ SortEnd, /* event */ SortEvent) => Unit): Self = StObject.set(x, "onSortEnd", js.Any.fromFunction2(value))
      
      inline def setOnSortEndUndefined: Self = StObject.set(x, "onSortEnd", js.undefined)
      
      inline def setOnSortMove(value: /* event */ SortEvent => Unit): Self = StObject.set(x, "onSortMove", js.Any.fromFunction1(value))
      
      inline def setOnSortMoveUndefined: Self = StObject.set(x, "onSortMove", js.undefined)
      
      inline def setOnSortOver(value: (/* sort */ SortOver, /* event */ SortEvent) => Unit): Self = StObject.set(x, "onSortOver", js.Any.fromFunction2(value))
      
      inline def setOnSortOverUndefined: Self = StObject.set(x, "onSortOver", js.undefined)
      
      inline def setOnSortStart(value: (/* sort */ SortStart, /* event */ SortEvent) => Unit): Self = StObject.set(x, "onSortStart", js.Any.fromFunction2(value))
      
      inline def setOnSortStartUndefined: Self = StObject.set(x, "onSortStart", js.undefined)
      
      inline def setPressDelay(value: Double): Self = StObject.set(x, "pressDelay", value.asInstanceOf[js.Any])
      
      inline def setPressDelayUndefined: Self = StObject.set(x, "pressDelay", js.undefined)
      
      inline def setPressThreshold(value: Double): Self = StObject.set(x, "pressThreshold", value.asInstanceOf[js.Any])
      
      inline def setPressThresholdUndefined: Self = StObject.set(x, "pressThreshold", js.undefined)
      
      inline def setShouldCancelStart(value: /* event */ SortEvent | SortEventWithTag => Boolean): Self = StObject.set(x, "shouldCancelStart", js.Any.fromFunction1(value))
      
      inline def setShouldCancelStartUndefined: Self = StObject.set(x, "shouldCancelStart", js.undefined)
      
      inline def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      inline def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
      
      inline def setUpdateBeforeSortStart(value: (/* sort */ SortStart, /* event */ SortEvent) => Unit): Self = StObject.set(x, "updateBeforeSortStart", js.Any.fromFunction2(value))
      
      inline def setUpdateBeforeSortStartUndefined: Self = StObject.set(x, "updateBeforeSortStart", js.undefined)
      
      inline def setUseDragHandle(value: Boolean): Self = StObject.set(x, "useDragHandle", value.asInstanceOf[js.Any])
      
      inline def setUseDragHandleUndefined: Self = StObject.set(x, "useDragHandle", js.undefined)
      
      inline def setUseWindowAsScrollContainer(value: Boolean): Self = StObject.set(x, "useWindowAsScrollContainer", value.asInstanceOf[js.Any])
      
      inline def setUseWindowAsScrollContainerUndefined: Self = StObject.set(x, "useWindowAsScrollContainer", js.undefined)
    }
  }
  
  trait SortableElementProps extends StObject {
    
    var collection: js.UndefOr[Offset] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var index: Double
  }
  object SortableElementProps {
    
    inline def apply(index: Double): SortableElementProps = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[SortableElementProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SortableElementProps] (val x: Self) extends AnyVal {
      
      inline def setCollection(value: Offset): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
      
      inline def setCollectionUndefined: Self = StObject.set(x, "collection", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    }
  }
  
  type WrappedComponent[P] = (ComponentClass[P, ComponentState]) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<P> */ Any) | WrappedComponentFactory[P]
  
  type WrappedComponentFactory[P] = js.Function1[/* props */ P, typings.react.mod.global.JSX.Element]
}
