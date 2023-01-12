package typings.reactMosaicComponent

import typings.dndCore.distInterfacesMod.DragDropManager
import typings.react.mod.PureComponent
import typings.react.mod.global.JSX.Element
import typings.reactMosaicComponent.anon.BlueprintNamespace
import typings.reactMosaicComponent.anon.PartialMosaicStateMosaicK
import typings.reactMosaicComponent.libTypesMod.MosaicBranch
import typings.reactMosaicComponent.libTypesMod.MosaicKey
import typings.reactMosaicComponent.libTypesMod.MosaicNode
import typings.reactMosaicComponent.libTypesMod.ResizeOptions
import typings.reactMosaicComponent.libTypesMod.TileRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMosaicMod {
  
  @JSImport("react-mosaic-component/lib/Mosaic", "Mosaic")
  @js.native
  open class Mosaic[T /* <: MosaicKey */] protected ()
    extends PureComponent[MosaicProps[T], js.Object, Any] {
    def this(props: MosaicProps[T]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MosaicProps[T], context: Any) = this()
  }
  
  @JSImport("react-mosaic-component/lib/Mosaic", "MosaicWithoutDragDropContext")
  @js.native
  open class MosaicWithoutDragDropContext[T /* <: MosaicKey */] protected () extends PureComponent[MosaicProps[T], MosaicState[T], Any] {
    def this(props: MosaicProps[T]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MosaicProps[T], context: Any) = this()
    
    /* private */ var actions: Any = js.native
    
    /* private */ val childContext: Any = js.native
    
    /* private */ var getRoot: Any = js.native
    
    /* private */ var renderTree: Any = js.native
    
    /* private */ var replaceRoot: Any = js.native
    
    /* private */ var updateRoot: Any = js.native
    
    /* private */ var validateTree: Any = js.native
  }
  /* static members */
  object MosaicWithoutDragDropContext {
    
    @JSImport("react-mosaic-component/lib/Mosaic", "MosaicWithoutDragDropContext")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-mosaic-component/lib/Mosaic", "MosaicWithoutDragDropContext.defaultProps")
    @js.native
    def defaultProps: BlueprintNamespace = js.native
    inline def defaultProps_=(x: BlueprintNamespace): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    inline def getDerivedStateFromProps(nextProps: MosaicProps[MosaicKey], prevState: MosaicState[MosaicKey]): PartialMosaicStateMosaicK | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], prevState.asInstanceOf[js.Any])).asInstanceOf[PartialMosaicStateMosaicK | Null]
  }
  
  trait MosaicBaseProps[T /* <: MosaicKey */] extends StObject {
    
    /**
      * Make it possible to use different versions of Blueprint with `mosaic-blueprint-theme`
      * Note: does not support updating after instantiation
      * default: 'bp3'
      */
    var blueprintNamespace: js.UndefOr[String] = js.undefined
    
    /**
      * Additional classes to affix to the root element
      * Default: 'mosaic-blueprint-theme'
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Override the react-dnd provider to allow applications to inject an existing drag and drop context
      */
    var dragAndDropManager: js.UndefOr[DragDropManager] = js.undefined
    
    /**
      * Override the mosaicId passed to `react-dnd` to control how drag and drop works with other components
      * Note: does not support updating after instantiation
      * default: Random UUID
      */
    var mosaicId: js.UndefOr[String] = js.undefined
    
    /**
      * Called when a user initiates any change to the tree (removing, adding, moving, resizing, etc.)
      */
    var onChange: js.UndefOr[js.Function1[/* newNode */ MosaicNode[T] | Null, Unit]] = js.undefined
    
    /**
      * Called when a user completes a change (fires like above except for the interpolation during resizing)
      */
    var onRelease: js.UndefOr[js.Function1[/* newNode */ MosaicNode[T] | Null, Unit]] = js.undefined
    
    /**
      * Lookup function to convert `T` to a displayable `JSX.Element`
      */
    var renderTile: TileRenderer[T]
    
    /**
      * Options that control resizing
      * @see: [[ResizeOptions]]
      */
    var resize: js.UndefOr[ResizeOptions] = js.undefined
    
    /**
      * View to display when the current value is `null`
      * default: Simple NonIdealState view
      */
    var zeroStateView: js.UndefOr[Element] = js.undefined
  }
  object MosaicBaseProps {
    
    inline def apply[T /* <: MosaicKey */](renderTile: (T, /* path */ js.Array[MosaicBranch]) => Element): MosaicBaseProps[T] = {
      val __obj = js.Dynamic.literal(renderTile = js.Any.fromFunction2(renderTile))
      __obj.asInstanceOf[MosaicBaseProps[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MosaicBaseProps[?], T /* <: MosaicKey */] (val x: Self & MosaicBaseProps[T]) extends AnyVal {
      
      inline def setBlueprintNamespace(value: String): Self = StObject.set(x, "blueprintNamespace", value.asInstanceOf[js.Any])
      
      inline def setBlueprintNamespaceUndefined: Self = StObject.set(x, "blueprintNamespace", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDragAndDropManager(value: DragDropManager): Self = StObject.set(x, "dragAndDropManager", value.asInstanceOf[js.Any])
      
      inline def setDragAndDropManagerUndefined: Self = StObject.set(x, "dragAndDropManager", js.undefined)
      
      inline def setMosaicId(value: String): Self = StObject.set(x, "mosaicId", value.asInstanceOf[js.Any])
      
      inline def setMosaicIdUndefined: Self = StObject.set(x, "mosaicId", js.undefined)
      
      inline def setOnChange(value: /* newNode */ MosaicNode[T] | Null => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnRelease(value: /* newNode */ MosaicNode[T] | Null => Unit): Self = StObject.set(x, "onRelease", js.Any.fromFunction1(value))
      
      inline def setOnReleaseUndefined: Self = StObject.set(x, "onRelease", js.undefined)
      
      inline def setRenderTile(value: (T, /* path */ js.Array[MosaicBranch]) => Element): Self = StObject.set(x, "renderTile", js.Any.fromFunction2(value))
      
      inline def setResize(value: ResizeOptions): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      inline def setZeroStateView(value: Element): Self = StObject.set(x, "zeroStateView", value.asInstanceOf[js.Any])
      
      inline def setZeroStateViewUndefined: Self = StObject.set(x, "zeroStateView", js.undefined)
    }
  }
  
  @js.native
  trait MosaicControlledProps[T /* <: MosaicKey */]
    extends StObject
       with MosaicBaseProps[T]
       with MosaicProps[T] {
    
    @JSName("onChange")
    def onChange_MMosaicControlledProps(): Unit = js.native
    @JSName("onChange")
    def onChange_MMosaicControlledProps(newNode: MosaicNode[T]): Unit = js.native
    
    /**
      * The tree to render
      */
    var value: MosaicNode[T] | Null = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMosaicComponent.libMosaicMod.MosaicControlledProps[T]
    - typings.reactMosaicComponent.libMosaicMod.MosaicUncontrolledProps[T]
  */
  trait MosaicProps[T /* <: MosaicKey */] extends StObject
  
  trait MosaicState[T /* <: MosaicKey */] extends StObject {
    
    var currentNode: MosaicNode[T] | Null
    
    var lastInitialValue: MosaicNode[T] | Null
    
    var mosaicId: String
  }
  object MosaicState {
    
    inline def apply[T /* <: MosaicKey */](mosaicId: String): MosaicState[T] = {
      val __obj = js.Dynamic.literal(mosaicId = mosaicId.asInstanceOf[js.Any], currentNode = null, lastInitialValue = null)
      __obj.asInstanceOf[MosaicState[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MosaicState[?], T /* <: MosaicKey */] (val x: Self & MosaicState[T]) extends AnyVal {
      
      inline def setCurrentNode(value: MosaicNode[T]): Self = StObject.set(x, "currentNode", value.asInstanceOf[js.Any])
      
      inline def setCurrentNodeNull: Self = StObject.set(x, "currentNode", null)
      
      inline def setLastInitialValue(value: MosaicNode[T]): Self = StObject.set(x, "lastInitialValue", value.asInstanceOf[js.Any])
      
      inline def setLastInitialValueNull: Self = StObject.set(x, "lastInitialValue", null)
      
      inline def setMosaicId(value: String): Self = StObject.set(x, "mosaicId", value.asInstanceOf[js.Any])
    }
  }
  
  trait MosaicUncontrolledProps[T /* <: MosaicKey */]
    extends StObject
       with MosaicBaseProps[T]
       with MosaicProps[T] {
    
    /**
      * The initial tree to render, can be modified by the user
      */
    var initialValue: MosaicNode[T] | Null
  }
  object MosaicUncontrolledProps {
    
    inline def apply[T /* <: MosaicKey */](renderTile: (T, /* path */ js.Array[MosaicBranch]) => Element): MosaicUncontrolledProps[T] = {
      val __obj = js.Dynamic.literal(renderTile = js.Any.fromFunction2(renderTile), initialValue = null)
      __obj.asInstanceOf[MosaicUncontrolledProps[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MosaicUncontrolledProps[?], T /* <: MosaicKey */] (val x: Self & MosaicUncontrolledProps[T]) extends AnyVal {
      
      inline def setInitialValue(value: MosaicNode[T]): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
      
      inline def setInitialValueNull: Self = StObject.set(x, "initialValue", null)
    }
  }
}
