package typings.reactMosaicComponent

import typings.react.mod.Component
import typings.react.mod.Context
import typings.react.mod.PureComponent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactDnd.distTypesConnectorsMod.ConnectDragPreview
import typings.reactDnd.distTypesConnectorsMod.ConnectDragSource
import typings.reactDnd.distTypesConnectorsMod.ConnectDropTarget
import typings.reactDnd.distTypesConnectorsMod.ConnectableElement
import typings.reactDnd.distTypesOptionsMod.DragPreviewOptions
import typings.reactDnd.distTypesOptionsMod.DragSourceOptions
import typings.reactMosaicComponent.anon.PartialInternalMosaicWind
import typings.reactMosaicComponent.libContextTypesMod.MosaicContext
import typings.reactMosaicComponent.libTypesMod.CreateNode
import typings.reactMosaicComponent.libTypesMod.MosaicBranch
import typings.reactMosaicComponent.libTypesMod.MosaicKey
import typings.reactMosaicComponent.reactMosaicComponentStrings.drop
import typings.reactMosaicComponent.reactMosaicComponentStrings.reset__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMosaicWindowMod {
  
  @JSImport("react-mosaic-component/lib/MosaicWindow", "InternalMosaicWindow")
  @js.native
  open class InternalMosaicWindow[T /* <: MosaicKey */] protected () extends Component[InternalMosaicWindowProps[T], InternalMosaicWindowState, Any] {
    def this(props: InternalMosaicWindowProps[T]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: InternalMosaicWindowProps[T], context: Any) = this()
    
    /* private */ var checkCreateNode: Any = js.native
    
    /* private */ val childContext: Any = js.native
    
    /* private */ var connectDragSource: Any = js.native
    
    @JSName("context")
    var context_InternalMosaicWindow: MosaicContext[T] = js.native
    
    /* private */ var getPath: Any = js.native
    
    /* private */ var getToolbarControls: Any = js.native
    
    /* private */ var renderDropTarget: Any = js.native
    
    /* private */ var renderToolbar: Any = js.native
    
    /* private */ var rootElement: Any = js.native
    
    /* private */ var setAdditionalControlsOpen: Any = js.native
    
    /* private */ var split: Any = js.native
    
    /* private */ var swap: Any = js.native
  }
  /* static members */
  object InternalMosaicWindow {
    
    @JSImport("react-mosaic-component/lib/MosaicWindow", "InternalMosaicWindow")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-mosaic-component/lib/MosaicWindow", "InternalMosaicWindow.contextType")
    @js.native
    def contextType: Context[MosaicContext[MosaicKey]] = js.native
    inline def contextType_=(x: Context[MosaicContext[MosaicKey]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    
    @JSImport("react-mosaic-component/lib/MosaicWindow", "InternalMosaicWindow.defaultProps")
    @js.native
    def defaultProps: PartialInternalMosaicWind = js.native
    inline def defaultProps_=(x: PartialInternalMosaicWind): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-mosaic-component/lib/MosaicWindow", "MosaicWindow")
  @js.native
  open class MosaicWindow[T /* <: MosaicKey */] protected ()
    extends PureComponent[MosaicWindowProps[T], js.Object, Any] {
    def this(props: MosaicWindowProps[T]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MosaicWindowProps[T], context: Any) = this()
  }
  
  @JSImport("react-mosaic-component/lib/MosaicWindow", "SourceConnectedInternalMosaicWindow")
  @js.native
  val SourceConnectedInternalMosaicWindow: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_react-dnd.DndComponentClass<typeof InternalMosaicWindow, imported_react-dnd.Omit<InternalMosaicWindowProps<any> | InternalMosaicWindowProps<MosaicKey>, 'connectDragSource' | 'connectDragPreview'>> */ Any = js.native
  
  @JSImport("react-mosaic-component/lib/MosaicWindow", "SourceDropConnectedInternalMosaicWindow")
  @js.native
  val SourceDropConnectedInternalMosaicWindow: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_react-dnd.DndComponentClass<any, imported_react-dnd.Omit<unknown, never>> */ Any = js.native
  
  trait InternalDragSourceProps extends StObject {
    
    var connectDragPreview: ConnectDragPreview
    
    var connectDragSource: ConnectDragSource
  }
  object InternalDragSourceProps {
    
    inline def apply(
      connectDragPreview: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[DragPreviewOptions]) => ReactElement | Null,
      connectDragSource: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[DragSourceOptions]) => ReactElement | Null
    ): InternalDragSourceProps = {
      val __obj = js.Dynamic.literal(connectDragPreview = js.Any.fromFunction2(connectDragPreview), connectDragSource = js.Any.fromFunction2(connectDragSource))
      __obj.asInstanceOf[InternalDragSourceProps]
    }
    
    extension [Self <: InternalDragSourceProps](x: Self) {
      
      inline def setConnectDragPreview(
        value: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[DragPreviewOptions]) => ReactElement | Null
      ): Self = StObject.set(x, "connectDragPreview", js.Any.fromFunction2(value))
      
      inline def setConnectDragSource(
        value: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[DragSourceOptions]) => ReactElement | Null
      ): Self = StObject.set(x, "connectDragSource", js.Any.fromFunction2(value))
    }
  }
  
  trait InternalDropTargetProps extends StObject {
    
    var connectDropTarget: ConnectDropTarget
    
    var draggedMosaicId: js.UndefOr[String] = js.undefined
    
    var isOver: Boolean
  }
  object InternalDropTargetProps {
    
    inline def apply(
      connectDropTarget: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[Any]) => ReactElement | Null,
      isOver: Boolean
    ): InternalDropTargetProps = {
      val __obj = js.Dynamic.literal(connectDropTarget = js.Any.fromFunction2(connectDropTarget), isOver = isOver.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalDropTargetProps]
    }
    
    extension [Self <: InternalDropTargetProps](x: Self) {
      
      inline def setConnectDropTarget(
        value: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[Any]) => ReactElement | Null
      ): Self = StObject.set(x, "connectDropTarget", js.Any.fromFunction2(value))
      
      inline def setDraggedMosaicId(value: String): Self = StObject.set(x, "draggedMosaicId", value.asInstanceOf[js.Any])
      
      inline def setDraggedMosaicIdUndefined: Self = StObject.set(x, "draggedMosaicId", js.undefined)
      
      inline def setIsOver(value: Boolean): Self = StObject.set(x, "isOver", value.asInstanceOf[js.Any])
    }
  }
  
  trait InternalMosaicWindowProps[T /* <: MosaicKey */]
    extends StObject
       with MosaicWindowProps[T]
       with InternalDropTargetProps
       with InternalDragSourceProps
  object InternalMosaicWindowProps {
    
    inline def apply[T /* <: MosaicKey */](
      connectDragPreview: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[DragPreviewOptions]) => ReactElement | Null,
      connectDragSource: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[DragSourceOptions]) => ReactElement | Null,
      connectDropTarget: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[Any]) => ReactElement | Null,
      isOver: Boolean,
      path: js.Array[MosaicBranch],
      title: String
    ): InternalMosaicWindowProps[T] = {
      val __obj = js.Dynamic.literal(connectDragPreview = js.Any.fromFunction2(connectDragPreview), connectDragSource = js.Any.fromFunction2(connectDragSource), connectDropTarget = js.Any.fromFunction2(connectDropTarget), isOver = isOver.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalMosaicWindowProps[T]]
    }
  }
  
  trait InternalMosaicWindowState extends StObject {
    
    var additionalControlsOpen: Boolean
  }
  object InternalMosaicWindowState {
    
    inline def apply(additionalControlsOpen: Boolean): InternalMosaicWindowState = {
      val __obj = js.Dynamic.literal(additionalControlsOpen = additionalControlsOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalMosaicWindowState]
    }
    
    extension [Self <: InternalMosaicWindowState](x: Self) {
      
      inline def setAdditionalControlsOpen(value: Boolean): Self = StObject.set(x, "additionalControlsOpen", value.asInstanceOf[js.Any])
    }
  }
  
  trait MosaicWindowProps[T /* <: MosaicKey */] extends StObject {
    
    var additionalControlButtonText: js.UndefOr[String] = js.undefined
    
    var additionalControls: js.UndefOr[ReactNode] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var createNode: js.UndefOr[CreateNode[T]] = js.undefined
    
    var draggable: js.UndefOr[Boolean] = js.undefined
    
    var onAdditionalControlsToggle: js.UndefOr[js.Function1[/* toggle */ Boolean, Unit]] = js.undefined
    
    var onDragEnd: js.UndefOr[js.Function1[/* type */ drop | reset__, Unit]] = js.undefined
    
    var onDragStart: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var path: js.Array[MosaicBranch]
    
    var renderPreview: js.UndefOr[js.Function1[/* props */ MosaicWindowProps[T], Element]] = js.undefined
    
    var renderToolbar: js.UndefOr[
        (js.Function2[/* props */ MosaicWindowProps[T], /* draggable */ js.UndefOr[Boolean], Element]) | Null
      ] = js.undefined
    
    var title: String
    
    var toolbarControls: js.UndefOr[ReactNode] = js.undefined
  }
  object MosaicWindowProps {
    
    inline def apply[T /* <: MosaicKey */](path: js.Array[MosaicBranch], title: String): MosaicWindowProps[T] = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[MosaicWindowProps[T]]
    }
    
    extension [Self <: MosaicWindowProps[?], T /* <: MosaicKey */](x: Self & MosaicWindowProps[T]) {
      
      inline def setAdditionalControlButtonText(value: String): Self = StObject.set(x, "additionalControlButtonText", value.asInstanceOf[js.Any])
      
      inline def setAdditionalControlButtonTextUndefined: Self = StObject.set(x, "additionalControlButtonText", js.undefined)
      
      inline def setAdditionalControls(value: ReactNode): Self = StObject.set(x, "additionalControls", value.asInstanceOf[js.Any])
      
      inline def setAdditionalControlsUndefined: Self = StObject.set(x, "additionalControls", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCreateNode(value: CreateNode[T]): Self = StObject.set(x, "createNode", value.asInstanceOf[js.Any])
      
      inline def setCreateNodeUndefined: Self = StObject.set(x, "createNode", js.undefined)
      
      inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setOnAdditionalControlsToggle(value: /* toggle */ Boolean => Unit): Self = StObject.set(x, "onAdditionalControlsToggle", js.Any.fromFunction1(value))
      
      inline def setOnAdditionalControlsToggleUndefined: Self = StObject.set(x, "onAdditionalControlsToggle", js.undefined)
      
      inline def setOnDragEnd(value: /* type */ drop | reset__ => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
      
      inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      inline def setOnDragStart(value: () => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction0(value))
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setPath(value: js.Array[MosaicBranch]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: MosaicBranch*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setRenderPreview(value: /* props */ MosaicWindowProps[T] => Element): Self = StObject.set(x, "renderPreview", js.Any.fromFunction1(value))
      
      inline def setRenderPreviewUndefined: Self = StObject.set(x, "renderPreview", js.undefined)
      
      inline def setRenderToolbar(value: (/* props */ MosaicWindowProps[T], /* draggable */ js.UndefOr[Boolean]) => Element): Self = StObject.set(x, "renderToolbar", js.Any.fromFunction2(value))
      
      inline def setRenderToolbarNull: Self = StObject.set(x, "renderToolbar", null)
      
      inline def setRenderToolbarUndefined: Self = StObject.set(x, "renderToolbar", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setToolbarControls(value: ReactNode): Self = StObject.set(x, "toolbarControls", value.asInstanceOf[js.Any])
      
      inline def setToolbarControlsUndefined: Self = StObject.set(x, "toolbarControls", js.undefined)
    }
  }
}
