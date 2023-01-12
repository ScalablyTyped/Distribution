package typings.reactMosaicComponent

import typings.blueprintjsIcons.libEsmGenerated16pxBlueprintIcons16Mod.BlueprintIcons16Id
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactDnd.distTypesConnectorsMod.ConnectDragPreview
import typings.reactDnd.distTypesConnectorsMod.ConnectDragSource
import typings.reactDnd.distTypesConnectorsMod.ConnectDropTarget
import typings.reactDnd.distTypesConnectorsMod.ConnectableElement
import typings.reactDnd.distTypesOptionsMod.DragPreviewOptions
import typings.reactDnd.distTypesOptionsMod.DragSourceOptions
import typings.reactMosaicComponent.libMosaicWindowMod.MosaicWindowProps
import typings.reactMosaicComponent.libTypesMod.CreateNode
import typings.reactMosaicComponent.libTypesMod.MosaicBranch
import typings.reactMosaicComponent.libTypesMod.MosaicKey
import typings.reactMosaicComponent.libTypesMod.MosaicNode
import typings.reactMosaicComponent.reactMosaicComponentStrings.drop
import typings.reactMosaicComponent.reactMosaicComponentStrings.large
import typings.reactMosaicComponent.reactMosaicComponentStrings.reset__
import typings.reactMosaicComponent.reactMosaicComponentStrings.standard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait BlueprintNamespace extends StObject {
    
    var blueprintNamespace: String
    
    var className: String
    
    def onChange(): Unit
    
    var zeroStateView: Element
  }
  object BlueprintNamespace {
    
    inline def apply(blueprintNamespace: String, className: String, onChange: () => Unit, zeroStateView: Element): BlueprintNamespace = {
      val __obj = js.Dynamic.literal(blueprintNamespace = blueprintNamespace.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), zeroStateView = zeroStateView.asInstanceOf[js.Any])
      __obj.asInstanceOf[BlueprintNamespace]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BlueprintNamespace] (val x: Self) extends AnyVal {
      
      inline def setBlueprintNamespace(value: String): Self = StObject.set(x, "blueprintNamespace", value.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setOnChange(value: () => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
      
      inline def setZeroStateView(value: Element): Self = StObject.set(x, "zeroStateView", value.asInstanceOf[js.Any])
    }
  }
  
  trait Bottom extends StObject {
    
    var bottom: Double
    
    var left: Double
    
    var right: Double
    
    var top: Double
  }
  object Bottom {
    
    inline def apply(bottom: Double, left: Double, right: Double, top: Double): Bottom = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bottom]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Bottom] (val x: Self) extends AnyVal {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClassName extends StObject {
    
    var className: String
    
    def onClick(event: MouseEvent[Any, NativeMouseEvent]): Any
    
    var text: js.UndefOr[String] = js.undefined
    
    var title: String
  }
  object ClassName {
    
    inline def apply(className: String, onClick: MouseEvent[Any, NativeMouseEvent] => Any, title: String): ClassName = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClassName]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClassName] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: MouseEvent[Any, NativeMouseEvent] => Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait Icon extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var icon: /* keyof react-mosaic-component.anon.TypeofIconNames */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 1130, starting with typings.reactMosaicComponent.reactMosaicComponentStrings.FUNCTION, typings.reactMosaicComponent.reactMosaicComponentStrings.ADD, typings.reactMosaicComponent.reactMosaicComponentStrings.AIRPLANE */ Any
    
    var size: js.UndefOr[standard | large] = js.undefined
  }
  object Icon {
    
    inline def apply(
      icon: /* keyof react-mosaic-component.anon.TypeofIconNames */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 1130, starting with typings.reactMosaicComponent.reactMosaicComponentStrings.FUNCTION, typings.reactMosaicComponent.reactMosaicComponentStrings.ADD, typings.reactMosaicComponent.reactMosaicComponentStrings.AIRPLANE */ Any
    ): Icon = {
      val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
      __obj.asInstanceOf[Icon]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Icon] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setIcon(
        value: /* keyof react-mosaic-component.anon.TypeofIconNames */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 1130, starting with typings.reactMosaicComponent.reactMosaicComponentStrings.FUNCTION, typings.reactMosaicComponent.reactMosaicComponentStrings.ADD, typings.reactMosaicComponent.reactMosaicComponentStrings.AIRPLANE */ Any
      ): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setSize(value: standard | large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait MinimumPaneSizePercentage extends StObject {
    
    var minimumPaneSizePercentage: Double
    
    def onChange(): Unit
    
    def onRelease(): Unit
  }
  object MinimumPaneSizePercentage {
    
    inline def apply(minimumPaneSizePercentage: Double, onChange: () => Unit, onRelease: () => Unit): MinimumPaneSizePercentage = {
      val __obj = js.Dynamic.literal(minimumPaneSizePercentage = minimumPaneSizePercentage.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), onRelease = js.Any.fromFunction0(onRelease))
      __obj.asInstanceOf[MinimumPaneSizePercentage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MinimumPaneSizePercentage] (val x: Self) extends AnyVal {
      
      inline def setMinimumPaneSizePercentage(value: Double): Self = StObject.set(x, "minimumPaneSizePercentage", value.asInstanceOf[js.Any])
      
      inline def setOnChange(value: () => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
      
      inline def setOnRelease(value: () => Unit): Self = StObject.set(x, "onRelease", js.Any.fromFunction0(value))
    }
  }
  
  /* Inlined std.Partial<react-mosaic-component.react-mosaic-component/lib/MosaicWindow.InternalMosaicWindowProps<any>> */
  trait PartialInternalMosaicWind extends StObject {
    
    var additionalControlButtonText: js.UndefOr[String] = js.undefined
    
    var additionalControls: js.UndefOr[ReactNode] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var connectDragPreview: js.UndefOr[ConnectDragPreview] = js.undefined
    
    var connectDragSource: js.UndefOr[ConnectDragSource] = js.undefined
    
    var connectDropTarget: js.UndefOr[ConnectDropTarget] = js.undefined
    
    var createNode: js.UndefOr[CreateNode[Any]] = js.undefined
    
    var draggable: js.UndefOr[Boolean] = js.undefined
    
    var draggedMosaicId: js.UndefOr[String] = js.undefined
    
    var isOver: js.UndefOr[Boolean] = js.undefined
    
    var onAdditionalControlsToggle: js.UndefOr[js.Function1[/* toggle */ Boolean, Unit]] = js.undefined
    
    var onDragEnd: js.UndefOr[js.Function1[/* type */ drop | reset__, Unit]] = js.undefined
    
    var onDragStart: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var path: js.UndefOr[js.Array[MosaicBranch]] = js.undefined
    
    var renderPreview: js.UndefOr[js.Function1[/* props */ MosaicWindowProps[Any], Element]] = js.undefined
    
    var renderToolbar: js.UndefOr[
        (js.Function2[/* props */ MosaicWindowProps[Any], /* draggable */ js.UndefOr[Boolean], Element]) | Null
      ] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var toolbarControls: js.UndefOr[ReactNode] = js.undefined
  }
  object PartialInternalMosaicWind {
    
    inline def apply(): PartialInternalMosaicWind = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialInternalMosaicWind]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialInternalMosaicWind] (val x: Self) extends AnyVal {
      
      inline def setAdditionalControlButtonText(value: String): Self = StObject.set(x, "additionalControlButtonText", value.asInstanceOf[js.Any])
      
      inline def setAdditionalControlButtonTextUndefined: Self = StObject.set(x, "additionalControlButtonText", js.undefined)
      
      inline def setAdditionalControls(value: ReactNode): Self = StObject.set(x, "additionalControls", value.asInstanceOf[js.Any])
      
      inline def setAdditionalControlsUndefined: Self = StObject.set(x, "additionalControls", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setConnectDragPreview(
        value: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[DragPreviewOptions]) => ReactElement | Null
      ): Self = StObject.set(x, "connectDragPreview", js.Any.fromFunction2(value))
      
      inline def setConnectDragPreviewUndefined: Self = StObject.set(x, "connectDragPreview", js.undefined)
      
      inline def setConnectDragSource(
        value: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[DragSourceOptions]) => ReactElement | Null
      ): Self = StObject.set(x, "connectDragSource", js.Any.fromFunction2(value))
      
      inline def setConnectDragSourceUndefined: Self = StObject.set(x, "connectDragSource", js.undefined)
      
      inline def setConnectDropTarget(
        value: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[Any]) => ReactElement | Null
      ): Self = StObject.set(x, "connectDropTarget", js.Any.fromFunction2(value))
      
      inline def setConnectDropTargetUndefined: Self = StObject.set(x, "connectDropTarget", js.undefined)
      
      inline def setCreateNode(value: CreateNode[Any]): Self = StObject.set(x, "createNode", value.asInstanceOf[js.Any])
      
      inline def setCreateNodeUndefined: Self = StObject.set(x, "createNode", js.undefined)
      
      inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setDraggedMosaicId(value: String): Self = StObject.set(x, "draggedMosaicId", value.asInstanceOf[js.Any])
      
      inline def setDraggedMosaicIdUndefined: Self = StObject.set(x, "draggedMosaicId", js.undefined)
      
      inline def setIsOver(value: Boolean): Self = StObject.set(x, "isOver", value.asInstanceOf[js.Any])
      
      inline def setIsOverUndefined: Self = StObject.set(x, "isOver", js.undefined)
      
      inline def setOnAdditionalControlsToggle(value: /* toggle */ Boolean => Unit): Self = StObject.set(x, "onAdditionalControlsToggle", js.Any.fromFunction1(value))
      
      inline def setOnAdditionalControlsToggleUndefined: Self = StObject.set(x, "onAdditionalControlsToggle", js.undefined)
      
      inline def setOnDragEnd(value: /* type */ drop | reset__ => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
      
      inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      inline def setOnDragStart(value: () => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction0(value))
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setPath(value: js.Array[MosaicBranch]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPathVarargs(value: MosaicBranch*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setRenderPreview(value: /* props */ MosaicWindowProps[Any] => Element): Self = StObject.set(x, "renderPreview", js.Any.fromFunction1(value))
      
      inline def setRenderPreviewUndefined: Self = StObject.set(x, "renderPreview", js.undefined)
      
      inline def setRenderToolbar(value: (/* props */ MosaicWindowProps[Any], /* draggable */ js.UndefOr[Boolean]) => Element): Self = StObject.set(x, "renderToolbar", js.Any.fromFunction2(value))
      
      inline def setRenderToolbarNull: Self = StObject.set(x, "renderToolbar", null)
      
      inline def setRenderToolbarUndefined: Self = StObject.set(x, "renderToolbar", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setToolbarControls(value: ReactNode): Self = StObject.set(x, "toolbarControls", value.asInstanceOf[js.Any])
      
      inline def setToolbarControlsUndefined: Self = StObject.set(x, "toolbarControls", js.undefined)
    }
  }
  
  /* Inlined std.Partial<react-mosaic-component.react-mosaic-component/lib/Mosaic.MosaicState<react-mosaic-component.react-mosaic-component/lib/types.MosaicKey>> */
  trait PartialMosaicStateMosaicK extends StObject {
    
    var currentNode: js.UndefOr[MosaicNode[MosaicKey] | Null] = js.undefined
    
    var lastInitialValue: js.UndefOr[MosaicNode[MosaicKey] | Null] = js.undefined
    
    var mosaicId: js.UndefOr[String] = js.undefined
  }
  object PartialMosaicStateMosaicK {
    
    inline def apply(): PartialMosaicStateMosaicK = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMosaicStateMosaicK]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialMosaicStateMosaicK] (val x: Self) extends AnyVal {
      
      inline def setCurrentNode(value: MosaicNode[MosaicKey]): Self = StObject.set(x, "currentNode", value.asInstanceOf[js.Any])
      
      inline def setCurrentNodeNull: Self = StObject.set(x, "currentNode", null)
      
      inline def setCurrentNodeUndefined: Self = StObject.set(x, "currentNode", js.undefined)
      
      inline def setLastInitialValue(value: MosaicNode[MosaicKey]): Self = StObject.set(x, "lastInitialValue", value.asInstanceOf[js.Any])
      
      inline def setLastInitialValueNull: Self = StObject.set(x, "lastInitialValue", null)
      
      inline def setLastInitialValueUndefined: Self = StObject.set(x, "lastInitialValue", js.undefined)
      
      inline def setMosaicId(value: String): Self = StObject.set(x, "mosaicId", value.asInstanceOf[js.Any])
      
      inline def setMosaicIdUndefined: Self = StObject.set(x, "mosaicId", js.undefined)
    }
  }
  
  trait TypeofIconNames extends StObject {
    
    var ADD: BlueprintIcons16Id
    
    var ADD_CLIP: BlueprintIcons16Id
    
    var ADD_COLUMN_LEFT: BlueprintIcons16Id
    
    var ADD_COLUMN_RIGHT: BlueprintIcons16Id
    
    var ADD_LOCATION: BlueprintIcons16Id
    
    var ADD_ROW_BOTTOM: BlueprintIcons16Id
    
    var ADD_ROW_TOP: BlueprintIcons16Id
    
    var ADD_TO_ARTIFACT: BlueprintIcons16Id
    
    var ADD_TO_FOLDER: BlueprintIcons16Id
    
    var AIMPOINTS_TARGET: BlueprintIcons16Id
    
    var AIRPLANE: BlueprintIcons16Id
    
    var ALIGNMENT_BOTTOM: BlueprintIcons16Id
    
    var ALIGNMENT_HORIZONTAL_CENTER: BlueprintIcons16Id
    
    var ALIGNMENT_LEFT: BlueprintIcons16Id
    
    var ALIGNMENT_RIGHT: BlueprintIcons16Id
    
    var ALIGNMENT_TOP: BlueprintIcons16Id
    
    var ALIGNMENT_VERTICAL_CENTER: BlueprintIcons16Id
    
    var ALIGN_CENTER: BlueprintIcons16Id
    
    var ALIGN_JUSTIFY: BlueprintIcons16Id
    
    var ALIGN_LEFT: BlueprintIcons16Id
    
    var ALIGN_RIGHT: BlueprintIcons16Id
    
    var ANCHOR: BlueprintIcons16Id
    
    var ANNOTATION: BlueprintIcons16Id
    
    var ANTENNA: BlueprintIcons16Id
    
    var APPLICATION: BlueprintIcons16Id
    
    var APPLICATIONS: BlueprintIcons16Id
    
    var APP_HEADER: BlueprintIcons16Id
    
    var ARCHIVE: BlueprintIcons16Id
    
    var AREA_OF_INTEREST: BlueprintIcons16Id
    
    var ARRAY: BlueprintIcons16Id
    
    var ARRAY_BOOLEAN: BlueprintIcons16Id
    
    var ARRAY_DATE: BlueprintIcons16Id
    
    var ARRAY_FLOATING_POINT: BlueprintIcons16Id
    
    var ARRAY_NUMERIC: BlueprintIcons16Id
    
    var ARRAY_STRING: BlueprintIcons16Id
    
    var ARRAY_TIMESTAMP: BlueprintIcons16Id
    
    var ARROWS_HORIZONTAL: BlueprintIcons16Id
    
    var ARROWS_VERTICAL: BlueprintIcons16Id
    
    var ARROW_BOTTOM_LEFT: BlueprintIcons16Id
    
    var ARROW_BOTTOM_RIGHT: BlueprintIcons16Id
    
    var ARROW_DOWN: BlueprintIcons16Id
    
    var ARROW_LEFT: BlueprintIcons16Id
    
    var ARROW_RIGHT: BlueprintIcons16Id
    
    var ARROW_TOP_LEFT: BlueprintIcons16Id
    
    var ARROW_TOP_RIGHT: BlueprintIcons16Id
    
    var ARROW_UP: BlueprintIcons16Id
    
    var ASTERISK: BlueprintIcons16Id
    
    var AT: BlueprintIcons16Id
    
    var AUTOMATIC_UPDATES: BlueprintIcons16Id
    
    var Add: BlueprintIcons16Id
    
    var AddClip: BlueprintIcons16Id
    
    var AddColumnLeft: BlueprintIcons16Id
    
    var AddColumnRight: BlueprintIcons16Id
    
    var AddLocation: BlueprintIcons16Id
    
    var AddRowBottom: BlueprintIcons16Id
    
    var AddRowTop: BlueprintIcons16Id
    
    var AddToArtifact: BlueprintIcons16Id
    
    var AddToFolder: BlueprintIcons16Id
    
    var AimpointsTarget: BlueprintIcons16Id
    
    var Airplane: BlueprintIcons16Id
    
    var AlignCenter: BlueprintIcons16Id
    
    var AlignJustify: BlueprintIcons16Id
    
    var AlignLeft: BlueprintIcons16Id
    
    var AlignRight: BlueprintIcons16Id
    
    var AlignmentBottom: BlueprintIcons16Id
    
    var AlignmentHorizontalCenter: BlueprintIcons16Id
    
    var AlignmentLeft: BlueprintIcons16Id
    
    var AlignmentRight: BlueprintIcons16Id
    
    var AlignmentTop: BlueprintIcons16Id
    
    var AlignmentVerticalCenter: BlueprintIcons16Id
    
    var Anchor: BlueprintIcons16Id
    
    var Annotation: BlueprintIcons16Id
    
    var Antenna: BlueprintIcons16Id
    
    var AppHeader: BlueprintIcons16Id
    
    var Application: BlueprintIcons16Id
    
    var Applications: BlueprintIcons16Id
    
    var Archive: BlueprintIcons16Id
    
    var AreaOfInterest: BlueprintIcons16Id
    
    var Array: BlueprintIcons16Id
    
    var ArrayBoolean: BlueprintIcons16Id
    
    var ArrayDate: BlueprintIcons16Id
    
    var ArrayFloatingPoint: BlueprintIcons16Id
    
    var ArrayNumeric: BlueprintIcons16Id
    
    var ArrayString: BlueprintIcons16Id
    
    var ArrayTimestamp: BlueprintIcons16Id
    
    var ArrowBottomLeft: BlueprintIcons16Id
    
    var ArrowBottomRight: BlueprintIcons16Id
    
    var ArrowDown: BlueprintIcons16Id
    
    var ArrowLeft: BlueprintIcons16Id
    
    var ArrowRight: BlueprintIcons16Id
    
    var ArrowTopLeft: BlueprintIcons16Id
    
    var ArrowTopRight: BlueprintIcons16Id
    
    var ArrowUp: BlueprintIcons16Id
    
    var ArrowsHorizontal: BlueprintIcons16Id
    
    var ArrowsVertical: BlueprintIcons16Id
    
    var Asterisk: BlueprintIcons16Id
    
    var At: BlueprintIcons16Id
    
    var AutomaticUpdates: BlueprintIcons16Id
    
    var BACKLINK: BlueprintIcons16Id
    
    var BADGE: BlueprintIcons16Id
    
    var BANK_ACCOUNT: BlueprintIcons16Id
    
    var BAN_CIRCLE: BlueprintIcons16Id
    
    var BARCODE: BlueprintIcons16Id
    
    var BLANK: BlueprintIcons16Id
    
    var BLOCKED_PERSON: BlueprintIcons16Id
    
    var BOLD: BlueprintIcons16Id
    
    var BOOK: BlueprintIcons16Id
    
    var BOOKMARK: BlueprintIcons16Id
    
    var BOX: BlueprintIcons16Id
    
    var BRIEFCASE: BlueprintIcons16Id
    
    var BRING_DATA: BlueprintIcons16Id
    
    var BUG: BlueprintIcons16Id
    
    var BUGGY: BlueprintIcons16Id
    
    var BUILD: BlueprintIcons16Id
    
    var Backlink: BlueprintIcons16Id
    
    var Badge: BlueprintIcons16Id
    
    var BanCircle: BlueprintIcons16Id
    
    var BankAccount: BlueprintIcons16Id
    
    var Barcode: BlueprintIcons16Id
    
    var Blank: BlueprintIcons16Id
    
    var BlockedPerson: BlueprintIcons16Id
    
    var Bold: BlueprintIcons16Id
    
    var Book: BlueprintIcons16Id
    
    var Bookmark: BlueprintIcons16Id
    
    var Box: BlueprintIcons16Id
    
    var Briefcase: BlueprintIcons16Id
    
    var BringData: BlueprintIcons16Id
    
    var Bug: BlueprintIcons16Id
    
    var Buggy: BlueprintIcons16Id
    
    var Build: BlueprintIcons16Id
    
    var CALCULATOR: BlueprintIcons16Id
    
    var CALENDAR: BlueprintIcons16Id
    
    var CAMERA: BlueprintIcons16Id
    
    var CARET_DOWN: BlueprintIcons16Id
    
    var CARET_LEFT: BlueprintIcons16Id
    
    var CARET_RIGHT: BlueprintIcons16Id
    
    var CARET_UP: BlueprintIcons16Id
    
    var CARGO_SHIP: BlueprintIcons16Id
    
    var CELL_TOWER: BlueprintIcons16Id
    
    var CHANGES: BlueprintIcons16Id
    
    var CHART: BlueprintIcons16Id
    
    var CHAT: BlueprintIcons16Id
    
    var CHEVRON_BACKWARD: BlueprintIcons16Id
    
    var CHEVRON_DOWN: BlueprintIcons16Id
    
    var CHEVRON_FORWARD: BlueprintIcons16Id
    
    var CHEVRON_LEFT: BlueprintIcons16Id
    
    var CHEVRON_RIGHT: BlueprintIcons16Id
    
    var CHEVRON_UP: BlueprintIcons16Id
    
    var CIRCLE: BlueprintIcons16Id
    
    var CIRCLE_ARROW_DOWN: BlueprintIcons16Id
    
    var CIRCLE_ARROW_LEFT: BlueprintIcons16Id
    
    var CIRCLE_ARROW_RIGHT: BlueprintIcons16Id
    
    var CIRCLE_ARROW_UP: BlueprintIcons16Id
    
    var CITATION: BlueprintIcons16Id
    
    var CLEAN: BlueprintIcons16Id
    
    var CLIP: BlueprintIcons16Id
    
    var CLIPBOARD: BlueprintIcons16Id
    
    var CLOUD: BlueprintIcons16Id
    
    var CLOUD_DOWNLOAD: BlueprintIcons16Id
    
    var CLOUD_UPLOAD: BlueprintIcons16Id
    
    var CODE: BlueprintIcons16Id
    
    var CODE_BLOCK: BlueprintIcons16Id
    
    var COG: BlueprintIcons16Id
    
    var COLLAPSE_ALL: BlueprintIcons16Id
    
    var COLOR_FILL: BlueprintIcons16Id
    
    var COLUMN_LAYOUT: BlueprintIcons16Id
    
    var COMMENT: BlueprintIcons16Id
    
    var COMPARISON: BlueprintIcons16Id
    
    var COMPASS: BlueprintIcons16Id
    
    var COMPRESSED: BlueprintIcons16Id
    
    var CONFIRM: BlueprintIcons16Id
    
    var CONSOLE: BlueprintIcons16Id
    
    var CONTRAST: BlueprintIcons16Id
    
    var CONTROL: BlueprintIcons16Id
    
    var CREDIT_CARD: BlueprintIcons16Id
    
    var CROSS: BlueprintIcons16Id
    
    var CROWN: BlueprintIcons16Id
    
    var CUBE: BlueprintIcons16Id
    
    var CUBE_ADD: BlueprintIcons16Id
    
    var CUBE_REMOVE: BlueprintIcons16Id
    
    var CURVED_RANGE_CHART: BlueprintIcons16Id
    
    var CUT: BlueprintIcons16Id
    
    var CYCLE: BlueprintIcons16Id
    
    var Calculator: BlueprintIcons16Id
    
    var Calendar: BlueprintIcons16Id
    
    var Camera: BlueprintIcons16Id
    
    var CaretDown: BlueprintIcons16Id
    
    var CaretLeft: BlueprintIcons16Id
    
    var CaretRight: BlueprintIcons16Id
    
    var CaretUp: BlueprintIcons16Id
    
    var CargoShip: BlueprintIcons16Id
    
    var CellTower: BlueprintIcons16Id
    
    var Changes: BlueprintIcons16Id
    
    var Chart: BlueprintIcons16Id
    
    var Chat: BlueprintIcons16Id
    
    var ChevronBackward: BlueprintIcons16Id
    
    var ChevronDown: BlueprintIcons16Id
    
    var ChevronForward: BlueprintIcons16Id
    
    var ChevronLeft: BlueprintIcons16Id
    
    var ChevronRight: BlueprintIcons16Id
    
    var ChevronUp: BlueprintIcons16Id
    
    var Circle: BlueprintIcons16Id
    
    var CircleArrowDown: BlueprintIcons16Id
    
    var CircleArrowLeft: BlueprintIcons16Id
    
    var CircleArrowRight: BlueprintIcons16Id
    
    var CircleArrowUp: BlueprintIcons16Id
    
    var Citation: BlueprintIcons16Id
    
    var Clean: BlueprintIcons16Id
    
    var Clip: BlueprintIcons16Id
    
    var Clipboard: BlueprintIcons16Id
    
    var Cloud: BlueprintIcons16Id
    
    var CloudDownload: BlueprintIcons16Id
    
    var CloudUpload: BlueprintIcons16Id
    
    var Code: BlueprintIcons16Id
    
    var CodeBlock: BlueprintIcons16Id
    
    var Cog: BlueprintIcons16Id
    
    var CollapseAll: BlueprintIcons16Id
    
    var ColorFill: BlueprintIcons16Id
    
    var ColumnLayout: BlueprintIcons16Id
    
    var Comment: BlueprintIcons16Id
    
    var Comparison: BlueprintIcons16Id
    
    var Compass: BlueprintIcons16Id
    
    var Compressed: BlueprintIcons16Id
    
    var Confirm: BlueprintIcons16Id
    
    var Console: BlueprintIcons16Id
    
    var Contrast: BlueprintIcons16Id
    
    var Control: BlueprintIcons16Id
    
    var CreditCard: BlueprintIcons16Id
    
    var Cross: BlueprintIcons16Id
    
    var Crown: BlueprintIcons16Id
    
    var Cube: BlueprintIcons16Id
    
    var CubeAdd: BlueprintIcons16Id
    
    var CubeRemove: BlueprintIcons16Id
    
    var CurvedRangeChart: BlueprintIcons16Id
    
    var Cut: BlueprintIcons16Id
    
    var Cycle: BlueprintIcons16Id
    
    var DASHBOARD: BlueprintIcons16Id
    
    var DATABASE: BlueprintIcons16Id
    
    var DATA_CONNECTION: BlueprintIcons16Id
    
    var DATA_LINEAGE: BlueprintIcons16Id
    
    var DELETE: BlueprintIcons16Id
    
    var DELTA: BlueprintIcons16Id
    
    var DERIVE_COLUMN: BlueprintIcons16Id
    
    var DESKTOP: BlueprintIcons16Id
    
    var DIAGNOSIS: BlueprintIcons16Id
    
    var DIAGRAM_TREE: BlueprintIcons16Id
    
    var DIRECTION_LEFT: BlueprintIcons16Id
    
    var DIRECTION_RIGHT: BlueprintIcons16Id
    
    var DISABLE: BlueprintIcons16Id
    
    var DIVIDE: BlueprintIcons16Id
    
    var DOCUMENT: BlueprintIcons16Id
    
    var DOCUMENT_OPEN: BlueprintIcons16Id
    
    var DOCUMENT_SHARE: BlueprintIcons16Id
    
    var DOLLAR: BlueprintIcons16Id
    
    var DOT: BlueprintIcons16Id
    
    var DOUBLE_CARET_HORIZONTAL: BlueprintIcons16Id
    
    var DOUBLE_CARET_VERTICAL: BlueprintIcons16Id
    
    var DOUBLE_CHEVRON_DOWN: BlueprintIcons16Id
    
    var DOUBLE_CHEVRON_LEFT: BlueprintIcons16Id
    
    var DOUBLE_CHEVRON_RIGHT: BlueprintIcons16Id
    
    var DOUBLE_CHEVRON_UP: BlueprintIcons16Id
    
    var DOUGHNUT_CHART: BlueprintIcons16Id
    
    var DOWNLOAD: BlueprintIcons16Id
    
    var DRAG_HANDLE_HORIZONTAL: BlueprintIcons16Id
    
    var DRAG_HANDLE_VERTICAL: BlueprintIcons16Id
    
    var DRAW: BlueprintIcons16Id
    
    var DRAWER_LEFT: BlueprintIcons16Id
    
    var DRAWER_LEFT_FILLED: BlueprintIcons16Id
    
    var DRAWER_RIGHT: BlueprintIcons16Id
    
    var DRAWER_RIGHT_FILLED: BlueprintIcons16Id
    
    var DRIVE_TIME: BlueprintIcons16Id
    
    var DUPLICATE: BlueprintIcons16Id
    
    var Dashboard: BlueprintIcons16Id
    
    var DataConnection: BlueprintIcons16Id
    
    var DataLineage: BlueprintIcons16Id
    
    var Database: BlueprintIcons16Id
    
    var Delete: BlueprintIcons16Id
    
    var Delta: BlueprintIcons16Id
    
    var DeriveColumn: BlueprintIcons16Id
    
    var Desktop: BlueprintIcons16Id
    
    var Diagnosis: BlueprintIcons16Id
    
    var DiagramTree: BlueprintIcons16Id
    
    var DirectionLeft: BlueprintIcons16Id
    
    var DirectionRight: BlueprintIcons16Id
    
    var Disable: BlueprintIcons16Id
    
    var Divide: BlueprintIcons16Id
    
    var Document: BlueprintIcons16Id
    
    var DocumentOpen: BlueprintIcons16Id
    
    var DocumentShare: BlueprintIcons16Id
    
    var Dollar: BlueprintIcons16Id
    
    var Dot: BlueprintIcons16Id
    
    var DoubleCaretHorizontal: BlueprintIcons16Id
    
    var DoubleCaretVertical: BlueprintIcons16Id
    
    var DoubleChevronDown: BlueprintIcons16Id
    
    var DoubleChevronLeft: BlueprintIcons16Id
    
    var DoubleChevronRight: BlueprintIcons16Id
    
    var DoubleChevronUp: BlueprintIcons16Id
    
    var DoughnutChart: BlueprintIcons16Id
    
    var Download: BlueprintIcons16Id
    
    var DragHandleHorizontal: BlueprintIcons16Id
    
    var DragHandleVertical: BlueprintIcons16Id
    
    var Draw: BlueprintIcons16Id
    
    var DrawerLeft: BlueprintIcons16Id
    
    var DrawerLeftFilled: BlueprintIcons16Id
    
    var DrawerRight: BlueprintIcons16Id
    
    var DrawerRightFilled: BlueprintIcons16Id
    
    var DriveTime: BlueprintIcons16Id
    
    var Duplicate: BlueprintIcons16Id
    
    var EDIT: BlueprintIcons16Id
    
    var EJECT: BlueprintIcons16Id
    
    var EMOJI: BlueprintIcons16Id
    
    var ENDORSED: BlueprintIcons16Id
    
    var ENVELOPE: BlueprintIcons16Id
    
    var EQUALS: BlueprintIcons16Id
    
    var ERASER: BlueprintIcons16Id
    
    var ERROR: BlueprintIcons16Id
    
    var EURO: BlueprintIcons16Id
    
    var EXCHANGE: BlueprintIcons16Id
    
    var EXCLUDE_ROW: BlueprintIcons16Id
    
    var EXPAND_ALL: BlueprintIcons16Id
    
    var EXPORT: BlueprintIcons16Id
    
    var EYE_OFF: BlueprintIcons16Id
    
    var EYE_ON: BlueprintIcons16Id
    
    var EYE_OPEN: BlueprintIcons16Id
    
    var Edit: BlueprintIcons16Id
    
    var Eject: BlueprintIcons16Id
    
    var Emoji: BlueprintIcons16Id
    
    var Endorsed: BlueprintIcons16Id
    
    var Envelope: BlueprintIcons16Id
    
    var Equals: BlueprintIcons16Id
    
    var Eraser: BlueprintIcons16Id
    
    var Error: BlueprintIcons16Id
    
    var Euro: BlueprintIcons16Id
    
    var Exchange: BlueprintIcons16Id
    
    var ExcludeRow: BlueprintIcons16Id
    
    var ExpandAll: BlueprintIcons16Id
    
    var Export: BlueprintIcons16Id
    
    var EyeOff: BlueprintIcons16Id
    
    var EyeOn: BlueprintIcons16Id
    
    var EyeOpen: BlueprintIcons16Id
    
    var FAST_BACKWARD: BlueprintIcons16Id
    
    var FAST_FORWARD: BlueprintIcons16Id
    
    var FEED: BlueprintIcons16Id
    
    var FEED_SUBSCRIBED: BlueprintIcons16Id
    
    var FILM: BlueprintIcons16Id
    
    var FILTER: BlueprintIcons16Id
    
    var FILTER_KEEP: BlueprintIcons16Id
    
    var FILTER_LIST: BlueprintIcons16Id
    
    var FILTER_OPEN: BlueprintIcons16Id
    
    var FILTER_REMOVE: BlueprintIcons16Id
    
    var FLAG: BlueprintIcons16Id
    
    var FLAME: BlueprintIcons16Id
    
    var FLASH: BlueprintIcons16Id
    
    var FLOATING_POINT: BlueprintIcons16Id
    
    var FLOPPY_DISK: BlueprintIcons16Id
    
    var FLOWS: BlueprintIcons16Id
    
    var FLOW_BRANCH: BlueprintIcons16Id
    
    var FLOW_END: BlueprintIcons16Id
    
    var FLOW_LINEAR: BlueprintIcons16Id
    
    var FLOW_REVIEW: BlueprintIcons16Id
    
    var FLOW_REVIEW_BRANCH: BlueprintIcons16Id
    
    var FOLDER_CLOSE: BlueprintIcons16Id
    
    var FOLDER_NEW: BlueprintIcons16Id
    
    var FOLDER_OPEN: BlueprintIcons16Id
    
    var FOLDER_SHARED: BlueprintIcons16Id
    
    var FOLDER_SHARED_OPEN: BlueprintIcons16Id
    
    var FOLLOWER: BlueprintIcons16Id
    
    var FOLLOWING: BlueprintIcons16Id
    
    var FONT: BlueprintIcons16Id
    
    var FORK: BlueprintIcons16Id
    
    var FORM: BlueprintIcons16Id
    
    var FUEL: BlueprintIcons16Id
    
    var FULLSCREEN: BlueprintIcons16Id
    
    var FULL_CIRCLE: BlueprintIcons16Id
    
    var FULL_STACKED_CHART: BlueprintIcons16Id
    
    var FUNCTION: BlueprintIcons16Id
    
    var FastBackward: BlueprintIcons16Id
    
    var FastForward: BlueprintIcons16Id
    
    var Feed: BlueprintIcons16Id
    
    var FeedSubscribed: BlueprintIcons16Id
    
    var Film: BlueprintIcons16Id
    
    var Filter: BlueprintIcons16Id
    
    var FilterKeep: BlueprintIcons16Id
    
    var FilterList: BlueprintIcons16Id
    
    var FilterOpen: BlueprintIcons16Id
    
    var FilterRemove: BlueprintIcons16Id
    
    var Flag: BlueprintIcons16Id
    
    var Flame: BlueprintIcons16Id
    
    var Flash: BlueprintIcons16Id
    
    var FloatingPoint: BlueprintIcons16Id
    
    var FloppyDisk: BlueprintIcons16Id
    
    var FlowBranch: BlueprintIcons16Id
    
    var FlowEnd: BlueprintIcons16Id
    
    var FlowLinear: BlueprintIcons16Id
    
    var FlowReview: BlueprintIcons16Id
    
    var FlowReviewBranch: BlueprintIcons16Id
    
    var Flows: BlueprintIcons16Id
    
    var FolderClose: BlueprintIcons16Id
    
    var FolderNew: BlueprintIcons16Id
    
    var FolderOpen: BlueprintIcons16Id
    
    var FolderShared: BlueprintIcons16Id
    
    var FolderSharedOpen: BlueprintIcons16Id
    
    var Follower: BlueprintIcons16Id
    
    var Following: BlueprintIcons16Id
    
    var Font: BlueprintIcons16Id
    
    var Fork: BlueprintIcons16Id
    
    var Form: BlueprintIcons16Id
    
    var Fuel: BlueprintIcons16Id
    
    var FullCircle: BlueprintIcons16Id
    
    var FullStackedChart: BlueprintIcons16Id
    
    var Fullscreen: BlueprintIcons16Id
    
    var Function: BlueprintIcons16Id
    
    var GANTT_CHART: BlueprintIcons16Id
    
    var GEOFENCE: BlueprintIcons16Id
    
    var GEOLOCATION: BlueprintIcons16Id
    
    var GEOSEARCH: BlueprintIcons16Id
    
    var GIT_BRANCH: BlueprintIcons16Id
    
    var GIT_COMMIT: BlueprintIcons16Id
    
    var GIT_MERGE: BlueprintIcons16Id
    
    var GIT_NEW_BRANCH: BlueprintIcons16Id
    
    var GIT_PULL: BlueprintIcons16Id
    
    var GIT_PUSH: BlueprintIcons16Id
    
    var GIT_REPO: BlueprintIcons16Id
    
    var GLASS: BlueprintIcons16Id
    
    var GLOBE: BlueprintIcons16Id
    
    var GLOBE_NETWORK: BlueprintIcons16Id
    
    var GRAPH: BlueprintIcons16Id
    
    var GRAPH_REMOVE: BlueprintIcons16Id
    
    var GREATER_THAN: BlueprintIcons16Id
    
    var GREATER_THAN_OR_EQUAL_TO: BlueprintIcons16Id
    
    var GRID: BlueprintIcons16Id
    
    var GRID_VIEW: BlueprintIcons16Id
    
    var GROUPED_BAR_CHART: BlueprintIcons16Id
    
    var GROUP_OBJECTS: BlueprintIcons16Id
    
    var GanttChart: BlueprintIcons16Id
    
    var Geofence: BlueprintIcons16Id
    
    var Geolocation: BlueprintIcons16Id
    
    var Geosearch: BlueprintIcons16Id
    
    var GitBranch: BlueprintIcons16Id
    
    var GitCommit: BlueprintIcons16Id
    
    var GitMerge: BlueprintIcons16Id
    
    var GitNewBranch: BlueprintIcons16Id
    
    var GitPull: BlueprintIcons16Id
    
    var GitPush: BlueprintIcons16Id
    
    var GitRepo: BlueprintIcons16Id
    
    var Glass: BlueprintIcons16Id
    
    var Globe: BlueprintIcons16Id
    
    var GlobeNetwork: BlueprintIcons16Id
    
    var Graph: BlueprintIcons16Id
    
    var GraphRemove: BlueprintIcons16Id
    
    var GreaterThan: BlueprintIcons16Id
    
    var GreaterThanOrEqualTo: BlueprintIcons16Id
    
    var Grid: BlueprintIcons16Id
    
    var GridView: BlueprintIcons16Id
    
    var GroupObjects: BlueprintIcons16Id
    
    var GroupedBarChart: BlueprintIcons16Id
    
    var HAND: BlueprintIcons16Id
    
    var HAND_DOWN: BlueprintIcons16Id
    
    var HAND_LEFT: BlueprintIcons16Id
    
    var HAND_RIGHT: BlueprintIcons16Id
    
    var HAND_UP: BlueprintIcons16Id
    
    var HAT: BlueprintIcons16Id
    
    var HEADER: BlueprintIcons16Id
    
    var HEADER_ONE: BlueprintIcons16Id
    
    var HEADER_THREE: BlueprintIcons16Id
    
    var HEADER_TWO: BlueprintIcons16Id
    
    var HEADSET: BlueprintIcons16Id
    
    var HEART: BlueprintIcons16Id
    
    var HEART_BROKEN: BlueprintIcons16Id
    
    var HEATMAP: BlueprintIcons16Id
    
    var HEAT_GRID: BlueprintIcons16Id
    
    var HELICOPTER: BlueprintIcons16Id
    
    var HELP: BlueprintIcons16Id
    
    var HELPER_MANAGEMENT: BlueprintIcons16Id
    
    var HIGHLIGHT: BlueprintIcons16Id
    
    var HIGH_PRIORITY: BlueprintIcons16Id
    
    var HIGH_VOLTAGE_POLE: BlueprintIcons16Id
    
    var HISTORY: BlueprintIcons16Id
    
    var HOME: BlueprintIcons16Id
    
    var HORIZONTAL_BAR_CHART: BlueprintIcons16Id
    
    var HORIZONTAL_BAR_CHART_ASC: BlueprintIcons16Id
    
    var HORIZONTAL_BAR_CHART_DESC: BlueprintIcons16Id
    
    var HORIZONTAL_DISTRIBUTION: BlueprintIcons16Id
    
    var HORIZONTAL_INBETWEEN: BlueprintIcons16Id
    
    var HURRICANE: BlueprintIcons16Id
    
    var Hand: BlueprintIcons16Id
    
    var HandDown: BlueprintIcons16Id
    
    var HandLeft: BlueprintIcons16Id
    
    var HandRight: BlueprintIcons16Id
    
    var HandUp: BlueprintIcons16Id
    
    var Hat: BlueprintIcons16Id
    
    var Header: BlueprintIcons16Id
    
    var HeaderOne: BlueprintIcons16Id
    
    var HeaderThree: BlueprintIcons16Id
    
    var HeaderTwo: BlueprintIcons16Id
    
    var Headset: BlueprintIcons16Id
    
    var Heart: BlueprintIcons16Id
    
    var HeartBroken: BlueprintIcons16Id
    
    var HeatGrid: BlueprintIcons16Id
    
    var Heatmap: BlueprintIcons16Id
    
    var Helicopter: BlueprintIcons16Id
    
    var Help: BlueprintIcons16Id
    
    var HelperManagement: BlueprintIcons16Id
    
    var HighPriority: BlueprintIcons16Id
    
    var HighVoltagePole: BlueprintIcons16Id
    
    var Highlight: BlueprintIcons16Id
    
    var History: BlueprintIcons16Id
    
    var Home: BlueprintIcons16Id
    
    var HorizontalBarChart: BlueprintIcons16Id
    
    var HorizontalBarChartAsc: BlueprintIcons16Id
    
    var HorizontalBarChartDesc: BlueprintIcons16Id
    
    var HorizontalDistribution: BlueprintIcons16Id
    
    var HorizontalInbetween: BlueprintIcons16Id
    
    var Hurricane: BlueprintIcons16Id
    
    var ID_NUMBER: BlueprintIcons16Id
    
    var IMAGE_ROTATE_LEFT: BlueprintIcons16Id
    
    var IMAGE_ROTATE_RIGHT: BlueprintIcons16Id
    
    var IMPORT: BlueprintIcons16Id
    
    var INBOX: BlueprintIcons16Id
    
    var INBOX_FILTERED: BlueprintIcons16Id
    
    var INBOX_GEO: BlueprintIcons16Id
    
    var INBOX_SEARCH: BlueprintIcons16Id
    
    var INBOX_UPDATE: BlueprintIcons16Id
    
    var INFO_SIGN: BlueprintIcons16Id
    
    var INHERITANCE: BlueprintIcons16Id
    
    var INHERITED_GROUP: BlueprintIcons16Id
    
    var INNER_JOIN: BlueprintIcons16Id
    
    var INSERT: BlueprintIcons16Id
    
    var INTERSECTION: BlueprintIcons16Id
    
    var IP_ADDRESS: BlueprintIcons16Id
    
    var ISSUE: BlueprintIcons16Id
    
    var ISSUE_CLOSED: BlueprintIcons16Id
    
    var ISSUE_NEW: BlueprintIcons16Id
    
    var ITALIC: BlueprintIcons16Id
    
    var IdNumber: BlueprintIcons16Id
    
    var ImageRotateLeft: BlueprintIcons16Id
    
    var ImageRotateRight: BlueprintIcons16Id
    
    var Import: BlueprintIcons16Id
    
    var Inbox: BlueprintIcons16Id
    
    var InboxFiltered: BlueprintIcons16Id
    
    var InboxGeo: BlueprintIcons16Id
    
    var InboxSearch: BlueprintIcons16Id
    
    var InboxUpdate: BlueprintIcons16Id
    
    var InfoSign: BlueprintIcons16Id
    
    var Inheritance: BlueprintIcons16Id
    
    var InheritedGroup: BlueprintIcons16Id
    
    var InnerJoin: BlueprintIcons16Id
    
    var Insert: BlueprintIcons16Id
    
    var Intersection: BlueprintIcons16Id
    
    var IpAddress: BlueprintIcons16Id
    
    var Issue: BlueprintIcons16Id
    
    var IssueClosed: BlueprintIcons16Id
    
    var IssueNew: BlueprintIcons16Id
    
    var Italic: BlueprintIcons16Id
    
    var JOIN_TABLE: BlueprintIcons16Id
    
    var JoinTable: BlueprintIcons16Id
    
    var KEY: BlueprintIcons16Id
    
    var KEY_BACKSPACE: BlueprintIcons16Id
    
    var KEY_COMMAND: BlueprintIcons16Id
    
    var KEY_CONTROL: BlueprintIcons16Id
    
    var KEY_DELETE: BlueprintIcons16Id
    
    var KEY_ENTER: BlueprintIcons16Id
    
    var KEY_ESCAPE: BlueprintIcons16Id
    
    var KEY_OPTION: BlueprintIcons16Id
    
    var KEY_SHIFT: BlueprintIcons16Id
    
    var KEY_TAB: BlueprintIcons16Id
    
    var KNOWN_VEHICLE: BlueprintIcons16Id
    
    var Key: BlueprintIcons16Id
    
    var KeyBackspace: BlueprintIcons16Id
    
    var KeyCommand: BlueprintIcons16Id
    
    var KeyControl: BlueprintIcons16Id
    
    var KeyDelete: BlueprintIcons16Id
    
    var KeyEnter: BlueprintIcons16Id
    
    var KeyEscape: BlueprintIcons16Id
    
    var KeyOption: BlueprintIcons16Id
    
    var KeyShift: BlueprintIcons16Id
    
    var KeyTab: BlueprintIcons16Id
    
    var KnownVehicle: BlueprintIcons16Id
    
    var LABEL: BlueprintIcons16Id
    
    var LAB_TEST: BlueprintIcons16Id
    
    var LAYER: BlueprintIcons16Id
    
    var LAYERS: BlueprintIcons16Id
    
    var LAYER_OUTLINE: BlueprintIcons16Id
    
    var LAYOUT: BlueprintIcons16Id
    
    var LAYOUT_AUTO: BlueprintIcons16Id
    
    var LAYOUT_BALLOON: BlueprintIcons16Id
    
    var LAYOUT_CIRCLE: BlueprintIcons16Id
    
    var LAYOUT_GRID: BlueprintIcons16Id
    
    var LAYOUT_GROUP_BY: BlueprintIcons16Id
    
    var LAYOUT_HIERARCHY: BlueprintIcons16Id
    
    var LAYOUT_LINEAR: BlueprintIcons16Id
    
    var LAYOUT_SKEW_GRID: BlueprintIcons16Id
    
    var LAYOUT_SORTED_CLUSTERS: BlueprintIcons16Id
    
    var LEARNING: BlueprintIcons16Id
    
    var LEFT_JOIN: BlueprintIcons16Id
    
    var LESS_THAN: BlueprintIcons16Id
    
    var LESS_THAN_OR_EQUAL_TO: BlueprintIcons16Id
    
    var LIFESAVER: BlueprintIcons16Id
    
    var LIGHTBULB: BlueprintIcons16Id
    
    var LIGHTNING: BlueprintIcons16Id
    
    var LINK: BlueprintIcons16Id
    
    var LIST: BlueprintIcons16Id
    
    var LIST_COLUMNS: BlueprintIcons16Id
    
    var LIST_DETAIL_VIEW: BlueprintIcons16Id
    
    var LOCATE: BlueprintIcons16Id
    
    var LOCK: BlueprintIcons16Id
    
    var LOG_IN: BlueprintIcons16Id
    
    var LOG_OUT: BlueprintIcons16Id
    
    var LOW_VOLTAGE_POLE: BlueprintIcons16Id
    
    var LabTest: BlueprintIcons16Id
    
    var Label: BlueprintIcons16Id
    
    var Layer: BlueprintIcons16Id
    
    var LayerOutline: BlueprintIcons16Id
    
    var Layers: BlueprintIcons16Id
    
    var Layout: BlueprintIcons16Id
    
    var LayoutAuto: BlueprintIcons16Id
    
    var LayoutBalloon: BlueprintIcons16Id
    
    var LayoutCircle: BlueprintIcons16Id
    
    var LayoutGrid: BlueprintIcons16Id
    
    var LayoutGroupBy: BlueprintIcons16Id
    
    var LayoutHierarchy: BlueprintIcons16Id
    
    var LayoutLinear: BlueprintIcons16Id
    
    var LayoutSkewGrid: BlueprintIcons16Id
    
    var LayoutSortedClusters: BlueprintIcons16Id
    
    var Learning: BlueprintIcons16Id
    
    var LeftJoin: BlueprintIcons16Id
    
    var LessThan: BlueprintIcons16Id
    
    var LessThanOrEqualTo: BlueprintIcons16Id
    
    var Lifesaver: BlueprintIcons16Id
    
    var Lightbulb: BlueprintIcons16Id
    
    var Lightning: BlueprintIcons16Id
    
    var Link: BlueprintIcons16Id
    
    var List: BlueprintIcons16Id
    
    var ListColumns: BlueprintIcons16Id
    
    var ListDetailView: BlueprintIcons16Id
    
    var Locate: BlueprintIcons16Id
    
    var Lock: BlueprintIcons16Id
    
    var LogIn: BlueprintIcons16Id
    
    var LogOut: BlueprintIcons16Id
    
    var LowVoltagePole: BlueprintIcons16Id
    
    var MANUAL: BlueprintIcons16Id
    
    var MANUALLY_ENTERED_DATA: BlueprintIcons16Id
    
    var MANY_TO_MANY: BlueprintIcons16Id
    
    var MANY_TO_ONE: BlueprintIcons16Id
    
    var MAP: BlueprintIcons16Id
    
    var MAP_CREATE: BlueprintIcons16Id
    
    var MAP_MARKER: BlueprintIcons16Id
    
    var MAXIMIZE: BlueprintIcons16Id
    
    var MEDIA: BlueprintIcons16Id
    
    var MENU: BlueprintIcons16Id
    
    var MENU_CLOSED: BlueprintIcons16Id
    
    var MENU_OPEN: BlueprintIcons16Id
    
    var MERGE_COLUMNS: BlueprintIcons16Id
    
    var MERGE_LINKS: BlueprintIcons16Id
    
    var MINIMIZE: BlueprintIcons16Id
    
    var MINUS: BlueprintIcons16Id
    
    var MOBILE_PHONE: BlueprintIcons16Id
    
    var MOBILE_VIDEO: BlueprintIcons16Id
    
    var MODAL: BlueprintIcons16Id
    
    var MODAL_FILLED: BlueprintIcons16Id
    
    var MOON: BlueprintIcons16Id
    
    var MORE: BlueprintIcons16Id
    
    var MOUNTAIN: BlueprintIcons16Id
    
    var MOVE: BlueprintIcons16Id
    
    var MUGSHOT: BlueprintIcons16Id
    
    var MULTI_SELECT: BlueprintIcons16Id
    
    var MUSIC: BlueprintIcons16Id
    
    var Manual: BlueprintIcons16Id
    
    var ManuallyEnteredData: BlueprintIcons16Id
    
    var ManyToMany: BlueprintIcons16Id
    
    var ManyToOne: BlueprintIcons16Id
    
    var Map: BlueprintIcons16Id
    
    var MapCreate: BlueprintIcons16Id
    
    var MapMarker: BlueprintIcons16Id
    
    var Maximize: BlueprintIcons16Id
    
    var Media: BlueprintIcons16Id
    
    var Menu: BlueprintIcons16Id
    
    var MenuClosed: BlueprintIcons16Id
    
    var MenuOpen: BlueprintIcons16Id
    
    var MergeColumns: BlueprintIcons16Id
    
    var MergeLinks: BlueprintIcons16Id
    
    var Minimize: BlueprintIcons16Id
    
    var Minus: BlueprintIcons16Id
    
    var MobilePhone: BlueprintIcons16Id
    
    var MobileVideo: BlueprintIcons16Id
    
    var Modal: BlueprintIcons16Id
    
    var ModalFilled: BlueprintIcons16Id
    
    var Moon: BlueprintIcons16Id
    
    var More: BlueprintIcons16Id
    
    var Mountain: BlueprintIcons16Id
    
    var Move: BlueprintIcons16Id
    
    var Mugshot: BlueprintIcons16Id
    
    var MultiSelect: BlueprintIcons16Id
    
    var Music: BlueprintIcons16Id
    
    var NEST: BlueprintIcons16Id
    
    var NEW_DRAWING: BlueprintIcons16Id
    
    var NEW_GRID_ITEM: BlueprintIcons16Id
    
    var NEW_LAYER: BlueprintIcons16Id
    
    var NEW_LAYERS: BlueprintIcons16Id
    
    var NEW_LINK: BlueprintIcons16Id
    
    var NEW_OBJECT: BlueprintIcons16Id
    
    var NEW_PERSON: BlueprintIcons16Id
    
    var NEW_PRESCRIPTION: BlueprintIcons16Id
    
    var NEW_TEXT_BOX: BlueprintIcons16Id
    
    var NINJA: BlueprintIcons16Id
    
    var NOTIFICATIONS: BlueprintIcons16Id
    
    var NOTIFICATIONS_SNOOZE: BlueprintIcons16Id
    
    var NOTIFICATIONS_UPDATED: BlueprintIcons16Id
    
    var NOT_EQUAL_TO: BlueprintIcons16Id
    
    var NUMBERED_LIST: BlueprintIcons16Id
    
    var NUMERICAL: BlueprintIcons16Id
    
    var Nest: BlueprintIcons16Id
    
    var NewDrawing: BlueprintIcons16Id
    
    var NewGridItem: BlueprintIcons16Id
    
    var NewLayer: BlueprintIcons16Id
    
    var NewLayers: BlueprintIcons16Id
    
    var NewLink: BlueprintIcons16Id
    
    var NewObject: BlueprintIcons16Id
    
    var NewPerson: BlueprintIcons16Id
    
    var NewPrescription: BlueprintIcons16Id
    
    var NewTextBox: BlueprintIcons16Id
    
    var Ninja: BlueprintIcons16Id
    
    var NotEqualTo: BlueprintIcons16Id
    
    var Notifications: BlueprintIcons16Id
    
    var NotificationsSnooze: BlueprintIcons16Id
    
    var NotificationsUpdated: BlueprintIcons16Id
    
    var NumberedList: BlueprintIcons16Id
    
    var Numerical: BlueprintIcons16Id
    
    var OFFICE: BlueprintIcons16Id
    
    var OFFLINE: BlueprintIcons16Id
    
    var OIL_FIELD: BlueprintIcons16Id
    
    var ONE_COLUMN: BlueprintIcons16Id
    
    var ONE_TO_MANY: BlueprintIcons16Id
    
    var ONE_TO_ONE: BlueprintIcons16Id
    
    var OPEN_APPLICATION: BlueprintIcons16Id
    
    var OUTDATED: BlueprintIcons16Id
    
    var Office: BlueprintIcons16Id
    
    var Offline: BlueprintIcons16Id
    
    var OilField: BlueprintIcons16Id
    
    var OneColumn: BlueprintIcons16Id
    
    var OneToMany: BlueprintIcons16Id
    
    var OneToOne: BlueprintIcons16Id
    
    var OpenApplication: BlueprintIcons16Id
    
    var Outdated: BlueprintIcons16Id
    
    var PAGE_LAYOUT: BlueprintIcons16Id
    
    var PANEL_STATS: BlueprintIcons16Id
    
    var PANEL_TABLE: BlueprintIcons16Id
    
    var PAPERCLIP: BlueprintIcons16Id
    
    var PARAGRAPH: BlueprintIcons16Id
    
    var PATH: BlueprintIcons16Id
    
    var PATH_SEARCH: BlueprintIcons16Id
    
    var PAUSE: BlueprintIcons16Id
    
    var PEOPLE: BlueprintIcons16Id
    
    var PERCENTAGE: BlueprintIcons16Id
    
    var PERSON: BlueprintIcons16Id
    
    var PHONE: BlueprintIcons16Id
    
    var PIE_CHART: BlueprintIcons16Id
    
    var PIN: BlueprintIcons16Id
    
    var PIVOT: BlueprintIcons16Id
    
    var PIVOT_TABLE: BlueprintIcons16Id
    
    var PLAY: BlueprintIcons16Id
    
    var PLAYBOOK: BlueprintIcons16Id
    
    var PLUS: BlueprintIcons16Id
    
    var POLYGON_FILTER: BlueprintIcons16Id
    
    var POWER: BlueprintIcons16Id
    
    var PREDICTIVE_ANALYSIS: BlueprintIcons16Id
    
    var PRESCRIPTION: BlueprintIcons16Id
    
    var PRESENTATION: BlueprintIcons16Id
    
    var PRINT: BlueprintIcons16Id
    
    var PROJECTS: BlueprintIcons16Id
    
    var PROPERTIES: BlueprintIcons16Id
    
    var PROPERTY: BlueprintIcons16Id
    
    var PUBLISH_FUNCTION: BlueprintIcons16Id
    
    var PULSE: BlueprintIcons16Id
    
    var PageLayout: BlueprintIcons16Id
    
    var PanelStats: BlueprintIcons16Id
    
    var PanelTable: BlueprintIcons16Id
    
    var Paperclip: BlueprintIcons16Id
    
    var Paragraph: BlueprintIcons16Id
    
    var Path: BlueprintIcons16Id
    
    var PathSearch: BlueprintIcons16Id
    
    var Pause: BlueprintIcons16Id
    
    var People: BlueprintIcons16Id
    
    var Percentage: BlueprintIcons16Id
    
    var Person: BlueprintIcons16Id
    
    var Phone: BlueprintIcons16Id
    
    var PieChart: BlueprintIcons16Id
    
    var Pin: BlueprintIcons16Id
    
    var Pivot: BlueprintIcons16Id
    
    var PivotTable: BlueprintIcons16Id
    
    var Play: BlueprintIcons16Id
    
    var Playbook: BlueprintIcons16Id
    
    var Plus: BlueprintIcons16Id
    
    var PolygonFilter: BlueprintIcons16Id
    
    var Power: BlueprintIcons16Id
    
    var PredictiveAnalysis: BlueprintIcons16Id
    
    var Prescription: BlueprintIcons16Id
    
    var Presentation: BlueprintIcons16Id
    
    var Print: BlueprintIcons16Id
    
    var Projects: BlueprintIcons16Id
    
    var Properties: BlueprintIcons16Id
    
    var Property: BlueprintIcons16Id
    
    var PublishFunction: BlueprintIcons16Id
    
    var Pulse: BlueprintIcons16Id
    
    var RAIN: BlueprintIcons16Id
    
    var RANDOM: BlueprintIcons16Id
    
    var RECORD: BlueprintIcons16Id
    
    var RECTANGLE: BlueprintIcons16Id
    
    var RECT_HEIGHT: BlueprintIcons16Id
    
    var RECT_WIDTH: BlueprintIcons16Id
    
    var REDO: BlueprintIcons16Id
    
    var REFRESH: BlueprintIcons16Id
    
    var REGEX: BlueprintIcons16Id
    
    var REGRESSION_CHART: BlueprintIcons16Id
    
    var REMOVE: BlueprintIcons16Id
    
    var REMOVE_COLUMN: BlueprintIcons16Id
    
    var REMOVE_COLUMN_LEFT: BlueprintIcons16Id
    
    var REMOVE_COLUMN_RIGHT: BlueprintIcons16Id
    
    var REMOVE_ROW_BOTTOM: BlueprintIcons16Id
    
    var REMOVE_ROW_TOP: BlueprintIcons16Id
    
    var REPEAT: BlueprintIcons16Id
    
    var RESET: BlueprintIcons16Id
    
    var RESOLVE: BlueprintIcons16Id
    
    var RIG: BlueprintIcons16Id
    
    var RIGHT_JOIN: BlueprintIcons16Id
    
    var RING: BlueprintIcons16Id
    
    var ROCKET: BlueprintIcons16Id
    
    var ROCKET_SLANT: BlueprintIcons16Id
    
    var ROTATE_DOCUMENT: BlueprintIcons16Id
    
    var ROTATE_PAGE: BlueprintIcons16Id
    
    var ROUTE: BlueprintIcons16Id
    
    var Rain: BlueprintIcons16Id
    
    var Random: BlueprintIcons16Id
    
    var Record: BlueprintIcons16Id
    
    var RectHeight: BlueprintIcons16Id
    
    var RectWidth: BlueprintIcons16Id
    
    var Rectangle: BlueprintIcons16Id
    
    var Redo: BlueprintIcons16Id
    
    var Refresh: BlueprintIcons16Id
    
    var Regex: BlueprintIcons16Id
    
    var RegressionChart: BlueprintIcons16Id
    
    var Remove: BlueprintIcons16Id
    
    var RemoveColumn: BlueprintIcons16Id
    
    var RemoveColumnLeft: BlueprintIcons16Id
    
    var RemoveColumnRight: BlueprintIcons16Id
    
    var RemoveRowBottom: BlueprintIcons16Id
    
    var RemoveRowTop: BlueprintIcons16Id
    
    var Repeat: BlueprintIcons16Id
    
    var Reset: BlueprintIcons16Id
    
    var Resolve: BlueprintIcons16Id
    
    var Rig: BlueprintIcons16Id
    
    var RightJoin: BlueprintIcons16Id
    
    var Ring: BlueprintIcons16Id
    
    var Rocket: BlueprintIcons16Id
    
    var RocketSlant: BlueprintIcons16Id
    
    var RotateDocument: BlueprintIcons16Id
    
    var RotatePage: BlueprintIcons16Id
    
    var Route: BlueprintIcons16Id
    
    var SATELLITE: BlueprintIcons16Id
    
    var SAVED: BlueprintIcons16Id
    
    var SCATTER_PLOT: BlueprintIcons16Id
    
    var SEARCH: BlueprintIcons16Id
    
    var SEARCH_AROUND: BlueprintIcons16Id
    
    var SEARCH_TEMPLATE: BlueprintIcons16Id
    
    var SEARCH_TEXT: BlueprintIcons16Id
    
    var SEGMENTED_CONTROL: BlueprintIcons16Id
    
    var SELECT: BlueprintIcons16Id
    
    var SELECTION: BlueprintIcons16Id
    
    var SEND_MESSAGE: BlueprintIcons16Id
    
    var SEND_TO: BlueprintIcons16Id
    
    var SEND_TO_GRAPH: BlueprintIcons16Id
    
    var SEND_TO_MAP: BlueprintIcons16Id
    
    var SERIES_ADD: BlueprintIcons16Id
    
    var SERIES_CONFIGURATION: BlueprintIcons16Id
    
    var SERIES_DERIVED: BlueprintIcons16Id
    
    var SERIES_FILTERED: BlueprintIcons16Id
    
    var SERIES_SEARCH: BlueprintIcons16Id
    
    var SETTINGS: BlueprintIcons16Id
    
    var SHAPES: BlueprintIcons16Id
    
    var SHARE: BlueprintIcons16Id
    
    var SHARED_FILTER: BlueprintIcons16Id
    
    var SHIELD: BlueprintIcons16Id
    
    var SHIP: BlueprintIcons16Id
    
    var SHOP: BlueprintIcons16Id
    
    var SHOPPING_CART: BlueprintIcons16Id
    
    var SIGNAL_SEARCH: BlueprintIcons16Id
    
    var SIM_CARD: BlueprintIcons16Id
    
    var SLASH: BlueprintIcons16Id
    
    var SMALL_CROSS: BlueprintIcons16Id
    
    var SMALL_INFO_SIGN: BlueprintIcons16Id
    
    var SMALL_MINUS: BlueprintIcons16Id
    
    var SMALL_PLUS: BlueprintIcons16Id
    
    var SMALL_SQUARE: BlueprintIcons16Id
    
    var SMALL_TICK: BlueprintIcons16Id
    
    var SNOWFLAKE: BlueprintIcons16Id
    
    var SOCIAL_MEDIA: BlueprintIcons16Id
    
    var SORT: BlueprintIcons16Id
    
    var SORT_ALPHABETICAL: BlueprintIcons16Id
    
    var SORT_ALPHABETICAL_DESC: BlueprintIcons16Id
    
    var SORT_ASC: BlueprintIcons16Id
    
    var SORT_DESC: BlueprintIcons16Id
    
    var SORT_NUMERICAL: BlueprintIcons16Id
    
    var SORT_NUMERICAL_DESC: BlueprintIcons16Id
    
    var SPLIT_COLUMNS: BlueprintIcons16Id
    
    var SQUARE: BlueprintIcons16Id
    
    var STACKED_CHART: BlueprintIcons16Id
    
    var STADIUM_GEOMETRY: BlueprintIcons16Id
    
    var STAR: BlueprintIcons16Id
    
    var STAR_EMPTY: BlueprintIcons16Id
    
    var STEP_BACKWARD: BlueprintIcons16Id
    
    var STEP_CHART: BlueprintIcons16Id
    
    var STEP_FORWARD: BlueprintIcons16Id
    
    var STOP: BlueprintIcons16Id
    
    var STOPWATCH: BlueprintIcons16Id
    
    var STRIKETHROUGH: BlueprintIcons16Id
    
    var STYLE: BlueprintIcons16Id
    
    var SWAP_HORIZONTAL: BlueprintIcons16Id
    
    var SWAP_VERTICAL: BlueprintIcons16Id
    
    var SWITCH: BlueprintIcons16Id
    
    var SYMBOL_CIRCLE: BlueprintIcons16Id
    
    var SYMBOL_CROSS: BlueprintIcons16Id
    
    var SYMBOL_DIAMOND: BlueprintIcons16Id
    
    var SYMBOL_RECTANGLE: BlueprintIcons16Id
    
    var SYMBOL_SQUARE: BlueprintIcons16Id
    
    var SYMBOL_TRIANGLE_DOWN: BlueprintIcons16Id
    
    var SYMBOL_TRIANGLE_UP: BlueprintIcons16Id
    
    var SYRINGE: BlueprintIcons16Id
    
    var Satellite: BlueprintIcons16Id
    
    var Saved: BlueprintIcons16Id
    
    var ScatterPlot: BlueprintIcons16Id
    
    var Search: BlueprintIcons16Id
    
    var SearchAround: BlueprintIcons16Id
    
    var SearchTemplate: BlueprintIcons16Id
    
    var SearchText: BlueprintIcons16Id
    
    var SegmentedControl: BlueprintIcons16Id
    
    var Select: BlueprintIcons16Id
    
    var Selection: BlueprintIcons16Id
    
    var SendMessage: BlueprintIcons16Id
    
    var SendTo: BlueprintIcons16Id
    
    var SendToGraph: BlueprintIcons16Id
    
    var SendToMap: BlueprintIcons16Id
    
    var SeriesAdd: BlueprintIcons16Id
    
    var SeriesConfiguration: BlueprintIcons16Id
    
    var SeriesDerived: BlueprintIcons16Id
    
    var SeriesFiltered: BlueprintIcons16Id
    
    var SeriesSearch: BlueprintIcons16Id
    
    var Settings: BlueprintIcons16Id
    
    var Shapes: BlueprintIcons16Id
    
    var Share: BlueprintIcons16Id
    
    var SharedFilter: BlueprintIcons16Id
    
    var Shield: BlueprintIcons16Id
    
    var Ship: BlueprintIcons16Id
    
    var Shop: BlueprintIcons16Id
    
    var ShoppingCart: BlueprintIcons16Id
    
    var SignalSearch: BlueprintIcons16Id
    
    var SimCard: BlueprintIcons16Id
    
    var Slash: BlueprintIcons16Id
    
    var SmallCross: BlueprintIcons16Id
    
    var SmallInfoSign: BlueprintIcons16Id
    
    var SmallMinus: BlueprintIcons16Id
    
    var SmallPlus: BlueprintIcons16Id
    
    var SmallSquare: BlueprintIcons16Id
    
    var SmallTick: BlueprintIcons16Id
    
    var Snowflake: BlueprintIcons16Id
    
    var SocialMedia: BlueprintIcons16Id
    
    var Sort: BlueprintIcons16Id
    
    var SortAlphabetical: BlueprintIcons16Id
    
    var SortAlphabeticalDesc: BlueprintIcons16Id
    
    var SortAsc: BlueprintIcons16Id
    
    var SortDesc: BlueprintIcons16Id
    
    var SortNumerical: BlueprintIcons16Id
    
    var SortNumericalDesc: BlueprintIcons16Id
    
    var SplitColumns: BlueprintIcons16Id
    
    var Square: BlueprintIcons16Id
    
    var StackedChart: BlueprintIcons16Id
    
    var StadiumGeometry: BlueprintIcons16Id
    
    var Star: BlueprintIcons16Id
    
    var StarEmpty: BlueprintIcons16Id
    
    var StepBackward: BlueprintIcons16Id
    
    var StepChart: BlueprintIcons16Id
    
    var StepForward: BlueprintIcons16Id
    
    var Stop: BlueprintIcons16Id
    
    var Stopwatch: BlueprintIcons16Id
    
    var Strikethrough: BlueprintIcons16Id
    
    var Style: BlueprintIcons16Id
    
    var SwapHorizontal: BlueprintIcons16Id
    
    var SwapVertical: BlueprintIcons16Id
    
    var Switch: BlueprintIcons16Id
    
    var SymbolCircle: BlueprintIcons16Id
    
    var SymbolCross: BlueprintIcons16Id
    
    var SymbolDiamond: BlueprintIcons16Id
    
    var SymbolRectangle: BlueprintIcons16Id
    
    var SymbolSquare: BlueprintIcons16Id
    
    var SymbolTriangleDown: BlueprintIcons16Id
    
    var SymbolTriangleUp: BlueprintIcons16Id
    
    var Syringe: BlueprintIcons16Id
    
    var TAG: BlueprintIcons16Id
    
    var TAKE_ACTION: BlueprintIcons16Id
    
    var TANK: BlueprintIcons16Id
    
    var TARGET: BlueprintIcons16Id
    
    var TAXI: BlueprintIcons16Id
    
    var TEMPERATURE: BlueprintIcons16Id
    
    var TEXT_HIGHLIGHT: BlueprintIcons16Id
    
    var TH: BlueprintIcons16Id
    
    var THIRD_PARTY: BlueprintIcons16Id
    
    var THUMBS_DOWN: BlueprintIcons16Id
    
    var THUMBS_UP: BlueprintIcons16Id
    
    var TH_DERIVED: BlueprintIcons16Id
    
    var TH_DISCONNECT: BlueprintIcons16Id
    
    var TH_FILTERED: BlueprintIcons16Id
    
    var TH_LIST: BlueprintIcons16Id
    
    var TICK: BlueprintIcons16Id
    
    var TICK_CIRCLE: BlueprintIcons16Id
    
    var TIME: BlueprintIcons16Id
    
    var TIMELINE_AREA_CHART: BlueprintIcons16Id
    
    var TIMELINE_BAR_CHART: BlueprintIcons16Id
    
    var TIMELINE_EVENTS: BlueprintIcons16Id
    
    var TIMELINE_LINE_CHART: BlueprintIcons16Id
    
    var TINT: BlueprintIcons16Id
    
    var TORCH: BlueprintIcons16Id
    
    var TRACTOR: BlueprintIcons16Id
    
    var TRAIN: BlueprintIcons16Id
    
    var TRANSLATE: BlueprintIcons16Id
    
    var TRASH: BlueprintIcons16Id
    
    var TREE: BlueprintIcons16Id
    
    var TRENDING_DOWN: BlueprintIcons16Id
    
    var TRENDING_UP: BlueprintIcons16Id
    
    var TRUCK: BlueprintIcons16Id
    
    var TWO_COLUMNS: BlueprintIcons16Id
    
    var Tag: BlueprintIcons16Id
    
    var TakeAction: BlueprintIcons16Id
    
    var Tank: BlueprintIcons16Id
    
    var Target: BlueprintIcons16Id
    
    var Taxi: BlueprintIcons16Id
    
    var Temperature: BlueprintIcons16Id
    
    var TextHighlight: BlueprintIcons16Id
    
    var Th: BlueprintIcons16Id
    
    var ThDerived: BlueprintIcons16Id
    
    var ThDisconnect: BlueprintIcons16Id
    
    var ThFiltered: BlueprintIcons16Id
    
    var ThList: BlueprintIcons16Id
    
    var ThirdParty: BlueprintIcons16Id
    
    var ThumbsDown: BlueprintIcons16Id
    
    var ThumbsUp: BlueprintIcons16Id
    
    var Tick: BlueprintIcons16Id
    
    var TickCircle: BlueprintIcons16Id
    
    var Time: BlueprintIcons16Id
    
    var TimelineAreaChart: BlueprintIcons16Id
    
    var TimelineBarChart: BlueprintIcons16Id
    
    var TimelineEvents: BlueprintIcons16Id
    
    var TimelineLineChart: BlueprintIcons16Id
    
    var Tint: BlueprintIcons16Id
    
    var Torch: BlueprintIcons16Id
    
    var Tractor: BlueprintIcons16Id
    
    var Train: BlueprintIcons16Id
    
    var Translate: BlueprintIcons16Id
    
    var Trash: BlueprintIcons16Id
    
    var Tree: BlueprintIcons16Id
    
    var TrendingDown: BlueprintIcons16Id
    
    var TrendingUp: BlueprintIcons16Id
    
    var Truck: BlueprintIcons16Id
    
    var TwoColumns: BlueprintIcons16Id
    
    var UNARCHIVE: BlueprintIcons16Id
    
    var UNDERLINE: BlueprintIcons16Id
    
    var UNDO: BlueprintIcons16Id
    
    var UNGROUP_OBJECTS: BlueprintIcons16Id
    
    var UNKNOWN_VEHICLE: BlueprintIcons16Id
    
    var UNLOCK: BlueprintIcons16Id
    
    var UNPIN: BlueprintIcons16Id
    
    var UNRESOLVE: BlueprintIcons16Id
    
    var UPDATED: BlueprintIcons16Id
    
    var UPLOAD: BlueprintIcons16Id
    
    var USER: BlueprintIcons16Id
    
    var Unarchive: BlueprintIcons16Id
    
    var Underline: BlueprintIcons16Id
    
    var Undo: BlueprintIcons16Id
    
    var UngroupObjects: BlueprintIcons16Id
    
    var UnknownVehicle: BlueprintIcons16Id
    
    var Unlock: BlueprintIcons16Id
    
    var Unpin: BlueprintIcons16Id
    
    var Unresolve: BlueprintIcons16Id
    
    var Updated: BlueprintIcons16Id
    
    var Upload: BlueprintIcons16Id
    
    var User: BlueprintIcons16Id
    
    var VARIABLE: BlueprintIcons16Id
    
    var VERTICAL_BAR_CHART_ASC: BlueprintIcons16Id
    
    var VERTICAL_BAR_CHART_DESC: BlueprintIcons16Id
    
    var VERTICAL_DISTRIBUTION: BlueprintIcons16Id
    
    var VERTICAL_INBETWEEN: BlueprintIcons16Id
    
    var VIDEO: BlueprintIcons16Id
    
    var VIRUS: BlueprintIcons16Id
    
    var VOLUME_DOWN: BlueprintIcons16Id
    
    var VOLUME_OFF: BlueprintIcons16Id
    
    var VOLUME_UP: BlueprintIcons16Id
    
    var Variable: BlueprintIcons16Id
    
    var VerticalBarChartAsc: BlueprintIcons16Id
    
    var VerticalBarChartDesc: BlueprintIcons16Id
    
    var VerticalDistribution: BlueprintIcons16Id
    
    var VerticalInbetween: BlueprintIcons16Id
    
    var Video: BlueprintIcons16Id
    
    var Virus: BlueprintIcons16Id
    
    var VolumeDown: BlueprintIcons16Id
    
    var VolumeOff: BlueprintIcons16Id
    
    var VolumeUp: BlueprintIcons16Id
    
    var WALK: BlueprintIcons16Id
    
    var WARNING_SIGN: BlueprintIcons16Id
    
    var WATERFALL_CHART: BlueprintIcons16Id
    
    var WAVES: BlueprintIcons16Id
    
    var WIDGET: BlueprintIcons16Id
    
    var WIDGET_BUTTON: BlueprintIcons16Id
    
    var WIDGET_FOOTER: BlueprintIcons16Id
    
    var WIDGET_HEADER: BlueprintIcons16Id
    
    var WIND: BlueprintIcons16Id
    
    var WRENCH: BlueprintIcons16Id
    
    var Walk: BlueprintIcons16Id
    
    var WarningSign: BlueprintIcons16Id
    
    var WaterfallChart: BlueprintIcons16Id
    
    var Waves: BlueprintIcons16Id
    
    var Widget: BlueprintIcons16Id
    
    var WidgetButton: BlueprintIcons16Id
    
    var WidgetFooter: BlueprintIcons16Id
    
    var WidgetHeader: BlueprintIcons16Id
    
    var Wind: BlueprintIcons16Id
    
    var Wrench: BlueprintIcons16Id
    
    var ZOOM_IN: BlueprintIcons16Id
    
    var ZOOM_OUT: BlueprintIcons16Id
    
    var ZOOM_TO_FIT: BlueprintIcons16Id
    
    var ZoomIn: BlueprintIcons16Id
    
    var ZoomOut: BlueprintIcons16Id
    
    var ZoomToFit: BlueprintIcons16Id
  }
  object TypeofIconNames {
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeofIconNames] (val x: Self) extends AnyVal {
      
      inline def setADD(value: BlueprintIcons16Id): Self = StObject.set(x, "ADD", value.asInstanceOf[js.Any])
      
      inline def setADD_CLIP(value: BlueprintIcons16Id): Self = StObject.set(x, "ADD_CLIP", value.asInstanceOf[js.Any])
      
      inline def setADD_COLUMN_LEFT(value: BlueprintIcons16Id): Self = StObject.set(x, "ADD_COLUMN_LEFT", value.asInstanceOf[js.Any])
      
      inline def setADD_COLUMN_RIGHT(value: BlueprintIcons16Id): Self = StObject.set(x, "ADD_COLUMN_RIGHT", value.asInstanceOf[js.Any])
      
      inline def setADD_LOCATION(value: BlueprintIcons16Id): Self = StObject.set(x, "ADD_LOCATION", value.asInstanceOf[js.Any])
      
      inline def setADD_ROW_BOTTOM(value: BlueprintIcons16Id): Self = StObject.set(x, "ADD_ROW_BOTTOM", value.asInstanceOf[js.Any])
      
      inline def setADD_ROW_TOP(value: BlueprintIcons16Id): Self = StObject.set(x, "ADD_ROW_TOP", value.asInstanceOf[js.Any])
      
      inline def setADD_TO_ARTIFACT(value: BlueprintIcons16Id): Self = StObject.set(x, "ADD_TO_ARTIFACT", value.asInstanceOf[js.Any])
      
      inline def setADD_TO_FOLDER(value: BlueprintIcons16Id): Self = StObject.set(x, "ADD_TO_FOLDER", value.asInstanceOf[js.Any])
      
      inline def setAIMPOINTS_TARGET(value: BlueprintIcons16Id): Self = StObject.set(x, "AIMPOINTS_TARGET", value.asInstanceOf[js.Any])
      
      inline def setAIRPLANE(value: BlueprintIcons16Id): Self = StObject.set(x, "AIRPLANE", value.asInstanceOf[js.Any])
      
      inline def setALIGNMENT_BOTTOM(value: BlueprintIcons16Id): Self = StObject.set(x, "ALIGNMENT_BOTTOM", value.asInstanceOf[js.Any])
      
      inline def setALIGNMENT_HORIZONTAL_CENTER(value: BlueprintIcons16Id): Self = StObject.set(x, "ALIGNMENT_HORIZONTAL_CENTER", value.asInstanceOf[js.Any])
      
      inline def setALIGNMENT_LEFT(value: BlueprintIcons16Id): Self = StObject.set(x, "ALIGNMENT_LEFT", value.asInstanceOf[js.Any])
      
      inline def setALIGNMENT_RIGHT(value: BlueprintIcons16Id): Self = StObject.set(x, "ALIGNMENT_RIGHT", value.asInstanceOf[js.Any])
      
      inline def setALIGNMENT_TOP(value: BlueprintIcons16Id): Self = StObject.set(x, "ALIGNMENT_TOP", value.asInstanceOf[js.Any])
      
      inline def setALIGNMENT_VERTICAL_CENTER(value: BlueprintIcons16Id): Self = StObject.set(x, "ALIGNMENT_VERTICAL_CENTER", value.asInstanceOf[js.Any])
      
      inline def setALIGN_CENTER(value: BlueprintIcons16Id): Self = StObject.set(x, "ALIGN_CENTER", value.asInstanceOf[js.Any])
      
      inline def setALIGN_JUSTIFY(value: BlueprintIcons16Id): Self = StObject.set(x, "ALIGN_JUSTIFY", value.asInstanceOf[js.Any])
      
      inline def setALIGN_LEFT(value: BlueprintIcons16Id): Self = StObject.set(x, "ALIGN_LEFT", value.asInstanceOf[js.Any])
      
      inline def setALIGN_RIGHT(value: BlueprintIcons16Id): Self = StObject.set(x, "ALIGN_RIGHT", value.asInstanceOf[js.Any])
      
      inline def setANCHOR(value: BlueprintIcons16Id): Self = StObject.set(x, "ANCHOR", value.asInstanceOf[js.Any])
      
      inline def setANNOTATION(value: BlueprintIcons16Id): Self = StObject.set(x, "ANNOTATION", value.asInstanceOf[js.Any])
      
      inline def setANTENNA(value: BlueprintIcons16Id): Self = StObject.set(x, "ANTENNA", value.asInstanceOf[js.Any])
      
      inline def setAPPLICATION(value: BlueprintIcons16Id): Self = StObject.set(x, "APPLICATION", value.asInstanceOf[js.Any])
      
      inline def setAPPLICATIONS(value: BlueprintIcons16Id): Self = StObject.set(x, "APPLICATIONS", value.asInstanceOf[js.Any])
      
      inline def setAPP_HEADER(value: BlueprintIcons16Id): Self = StObject.set(x, "APP_HEADER", value.asInstanceOf[js.Any])
      
      inline def setARCHIVE(value: BlueprintIcons16Id): Self = StObject.set(x, "ARCHIVE", value.asInstanceOf[js.Any])
      
      inline def setAREA_OF_INTEREST(value: BlueprintIcons16Id): Self = StObject.set(x, "AREA_OF_INTEREST", value.asInstanceOf[js.Any])
      
      inline def setARRAY(value: BlueprintIcons16Id): Self = StObject.set(x, "ARRAY", value.asInstanceOf[js.Any])
      
      inline def setARRAY_BOOLEAN(value: BlueprintIcons16Id): Self = StObject.set(x, "ARRAY_BOOLEAN", value.asInstanceOf[js.Any])
      
      inline def setARRAY_DATE(value: BlueprintIcons16Id): Self = StObject.set(x, "ARRAY_DATE", value.asInstanceOf[js.Any])
      
      inline def setARRAY_FLOATING_POINT(value: BlueprintIcons16Id): Self = StObject.set(x, "ARRAY_FLOATING_POINT", value.asInstanceOf[js.Any])
      
      inline def setARRAY_NUMERIC(value: BlueprintIcons16Id): Self = StObject.set(x, "ARRAY_NUMERIC", value.asInstanceOf[js.Any])
      
      inline def setARRAY_STRING(value: BlueprintIcons16Id): Self = StObject.set(x, "ARRAY_STRING", value.asInstanceOf[js.Any])
      
      inline def setARRAY_TIMESTAMP(value: BlueprintIcons16Id): Self = StObject.set(x, "ARRAY_TIMESTAMP", value.asInstanceOf[js.Any])
      
      inline def setARROWS_HORIZONTAL(value: BlueprintIcons16Id): Self = StObject.set(x, "ARROWS_HORIZONTAL", value.asInstanceOf[js.Any])
      
      inline def setARROWS_VERTICAL(value: BlueprintIcons16Id): Self = StObject.set(x, "ARROWS_VERTICAL", value.asInstanceOf[js.Any])
      
      inline def setARROW_BOTTOM_LEFT(value: BlueprintIcons16Id): Self = StObject.set(x, "ARROW_BOTTOM_LEFT", value.asInstanceOf[js.Any])
      
      inline def setARROW_BOTTOM_RIGHT(value: BlueprintIcons16Id): Self = StObject.set(x, "ARROW_BOTTOM_RIGHT", value.asInstanceOf[js.Any])
      
      inline def setARROW_DOWN(value: BlueprintIcons16Id): Self = StObject.set(x, "ARROW_DOWN", value.asInstanceOf[js.Any])
      
      inline def setARROW_LEFT(value: BlueprintIcons16Id): Self = StObject.set(x, "ARROW_LEFT", value.asInstanceOf[js.Any])
      
      inline def setARROW_RIGHT(value: BlueprintIcons16Id): Self = StObject.set(x, "ARROW_RIGHT", value.asInstanceOf[js.Any])
      
      inline def setARROW_TOP_LEFT(value: BlueprintIcons16Id): Self = StObject.set(x, "ARROW_TOP_LEFT", value.asInstanceOf[js.Any])
      
      inline def setARROW_TOP_RIGHT(value: BlueprintIcons16Id): Self = StObject.set(x, "ARROW_TOP_RIGHT", value.asInstanceOf[js.Any])
      
      inline def setARROW_UP(value: BlueprintIcons16Id): Self = StObject.set(x, "ARROW_UP", value.asInstanceOf[js.Any])
      
      inline def setASTERISK(value: BlueprintIcons16Id): Self = StObject.set(x, "ASTERISK", value.asInstanceOf[js.Any])
      
      inline def setAT(value: BlueprintIcons16Id): Self = StObject.set(x, "AT", value.asInstanceOf[js.Any])
      
      inline def setAUTOMATIC_UPDATES(value: BlueprintIcons16Id): Self = StObject.set(x, "AUTOMATIC_UPDATES", value.asInstanceOf[js.Any])
      
      inline def setAddClip(value: BlueprintIcons16Id): Self = StObject.set(x, "AddClip", value.asInstanceOf[js.Any])
      
      inline def setAddColumnLeft(value: BlueprintIcons16Id): Self = StObject.set(x, "AddColumnLeft", value.asInstanceOf[js.Any])
      
      inline def setAddColumnRight(value: BlueprintIcons16Id): Self = StObject.set(x, "AddColumnRight", value.asInstanceOf[js.Any])
      
      inline def setAddLocation(value: BlueprintIcons16Id): Self = StObject.set(x, "AddLocation", value.asInstanceOf[js.Any])
      
      inline def setAddRowBottom(value: BlueprintIcons16Id): Self = StObject.set(x, "AddRowBottom", value.asInstanceOf[js.Any])
      
      inline def setAddRowTop(value: BlueprintIcons16Id): Self = StObject.set(x, "AddRowTop", value.asInstanceOf[js.Any])
      
      inline def setAddToArtifact(value: BlueprintIcons16Id): Self = StObject.set(x, "AddToArtifact", value.asInstanceOf[js.Any])
      
      inline def setAddToFolder(value: BlueprintIcons16Id): Self = StObject.set(x, "AddToFolder", value.asInstanceOf[js.Any])
      
      inline def setAimpointsTarget(value: BlueprintIcons16Id): Self = StObject.set(x, "AimpointsTarget", value.asInstanceOf[js.Any])
      
      inline def setAlignCenter(value: BlueprintIcons16Id): Self = StObject.set(x, "AlignCenter", value.asInstanceOf[js.Any])
      
      inline def setAlignJustify(value: BlueprintIcons16Id): Self = StObject.set(x, "AlignJustify", value.asInstanceOf[js.Any])
      
      inline def setAlignLeft(value: BlueprintIcons16Id): Self = StObject.set(x, "AlignLeft", value.asInstanceOf[js.Any])
      
      inline def setAlignRight(value: BlueprintIcons16Id): Self = StObject.set(x, "AlignRight", value.asInstanceOf[js.Any])
      
      inline def setAlignmentBottom(value: BlueprintIcons16Id): Self = StObject.set(x, "AlignmentBottom", value.asInstanceOf[js.Any])
      
      inline def setAlignmentHorizontalCenter(value: BlueprintIcons16Id): Self = StObject.set(x, "AlignmentHorizontalCenter", value.asInstanceOf[js.Any])
      
      inline def setAlignmentLeft(value: BlueprintIcons16Id): Self = StObject.set(x, "AlignmentLeft", value.asInstanceOf[js.Any])
      
      inline def setAlignmentRight(value: BlueprintIcons16Id): Self = StObject.set(x, "AlignmentRight", value.asInstanceOf[js.Any])
      
      inline def setAlignmentTop(value: BlueprintIcons16Id): Self = StObject.set(x, "AlignmentTop", value.asInstanceOf[js.Any])
      
      inline def setAlignmentVerticalCenter(value: BlueprintIcons16Id): Self = StObject.set(x, "AlignmentVerticalCenter", value.asInstanceOf[js.Any])
      
      inline def setAppHeader(value: BlueprintIcons16Id): Self = StObject.set(x, "AppHeader", value.asInstanceOf[js.Any])
      
      inline def setAreaOfInterest(value: BlueprintIcons16Id): Self = StObject.set(x, "AreaOfInterest", value.asInstanceOf[js.Any])
      
      inline def setArrayBoolean(value: BlueprintIcons16Id): Self = StObject.set(x, "ArrayBoolean", value.asInstanceOf[js.Any])
      
      inline def setArrayDate(value: BlueprintIcons16Id): Self = StObject.set(x, "ArrayDate", value.asInstanceOf[js.Any])
      
      inline def setArrayFloatingPoint(value: BlueprintIcons16Id): Self = StObject.set(x, "ArrayFloatingPoint", value.asInstanceOf[js.Any])
      
      inline def setArrayNumeric(value: BlueprintIcons16Id): Self = StObject.set(x, "ArrayNumeric", value.asInstanceOf[js.Any])
      
      inline def setArrayString(value: BlueprintIcons16Id): Self = StObject.set(x, "ArrayString", value.asInstanceOf[js.Any])
      
      inline def setArrayTimestamp(value: BlueprintIcons16Id): Self = StObject.set(x, "ArrayTimestamp", value.asInstanceOf[js.Any])
      
      inline def setArrowBottomLeft(value: BlueprintIcons16Id): Self = StObject.set(x, "ArrowBottomLeft", value.asInstanceOf[js.Any])
      
      inline def setArrowBottomRight(value: BlueprintIcons16Id): Self = StObject.set(x, "ArrowBottomRight", value.asInstanceOf[js.Any])
      
      inline def setArrowDown(value: BlueprintIcons16Id): Self = StObject.set(x, "ArrowDown", value.asInstanceOf[js.Any])
      
      inline def setArrowLeft(value: BlueprintIcons16Id): Self = StObject.set(x, "ArrowLeft", value.asInstanceOf[js.Any])
      
      inline def setArrowRight(value: BlueprintIcons16Id): Self = StObject.set(x, "ArrowRight", value.asInstanceOf[js.Any])
      
      inline def setArrowTopLeft(value: BlueprintIcons16Id): Self = StObject.set(x, "ArrowTopLeft", value.asInstanceOf[js.Any])
      
      inline def setArrowTopRight(value: BlueprintIcons16Id): Self = StObject.set(x, "ArrowTopRight", value.asInstanceOf[js.Any])
      
      inline def setArrowUp(value: BlueprintIcons16Id): Self = StObject.set(x, "ArrowUp", value.asInstanceOf[js.Any])
      
      inline def setArrowsHorizontal(value: BlueprintIcons16Id): Self = StObject.set(x, "ArrowsHorizontal", value.asInstanceOf[js.Any])
      
      inline def setArrowsVertical(value: BlueprintIcons16Id): Self = StObject.set(x, "ArrowsVertical", value.asInstanceOf[js.Any])
      
      inline def setAutomaticUpdates(value: BlueprintIcons16Id): Self = StObject.set(x, "AutomaticUpdates", value.asInstanceOf[js.Any])
      
      inline def setBACKLINK(value: BlueprintIcons16Id): Self = StObject.set(x, "BACKLINK", value.asInstanceOf[js.Any])
      
      inline def setBADGE(value: BlueprintIcons16Id): Self = StObject.set(x, "BADGE", value.asInstanceOf[js.Any])
      
      inline def setBANK_ACCOUNT(value: BlueprintIcons16Id): Self = StObject.set(x, "BANK_ACCOUNT", value.asInstanceOf[js.Any])
      
      inline def setBAN_CIRCLE(value: BlueprintIcons16Id): Self = StObject.set(x, "BAN_CIRCLE", value.asInstanceOf[js.Any])
      
      inline def setBARCODE(value: BlueprintIcons16Id): Self = StObject.set(x, "BARCODE", value.asInstanceOf[js.Any])
      
      inline def setBLANK(value: BlueprintIcons16Id): Self = StObject.set(x, "BLANK", value.asInstanceOf[js.Any])
      
      inline def setBLOCKED_PERSON(value: BlueprintIcons16Id): Self = StObject.set(x, "BLOCKED_PERSON", value.asInstanceOf[js.Any])
      
      inline def setBOLD(value: BlueprintIcons16Id): Self = StObject.set(x, "BOLD", value.asInstanceOf[js.Any])
      
      inline def setBOOK(value: BlueprintIcons16Id): Self = StObject.set(x, "BOOK", value.asInstanceOf[js.Any])
      
      inline def setBOOKMARK(value: BlueprintIcons16Id): Self = StObject.set(x, "BOOKMARK", value.asInstanceOf[js.Any])
      
      inline def setBOX(value: BlueprintIcons16Id): Self = StObject.set(x, "BOX", value.asInstanceOf[js.Any])
      
      inline def setBRIEFCASE(value: BlueprintIcons16Id): Self = StObject.set(x, "BRIEFCASE", value.asInstanceOf[js.Any])
      
      inline def setBRING_DATA(value: BlueprintIcons16Id): Self = StObject.set(x, "BRING_DATA", value.asInstanceOf[js.Any])
      
      inline def setBUG(value: BlueprintIcons16Id): Self = StObject.set(x, "BUG", value.asInstanceOf[js.Any])
      
      inline def setBUGGY(value: BlueprintIcons16Id): Self = StObject.set(x, "BUGGY", value.asInstanceOf[js.Any])
      
      inline def setBUILD(value: BlueprintIcons16Id): Self = StObject.set(x, "BUILD", value.asInstanceOf[js.Any])
      
      inline def setBanCircle(value: BlueprintIcons16Id): Self = StObject.set(x, "BanCircle", value.asInstanceOf[js.Any])
      
      inline def setBankAccount(value: BlueprintIcons16Id): Self = StObject.set(x, "BankAccount", value.asInstanceOf[js.Any])
      
      inline def setBlockedPerson(value: BlueprintIcons16Id): Self = StObject.set(x, "BlockedPerson", value.asInstanceOf[js.Any])
      
      inline def setBringData(value: BlueprintIcons16Id): Self = StObject.set(x, "BringData", value.asInstanceOf[js.Any])
      
      inline def setCALCULATOR(value: BlueprintIcons16Id): Self = StObject.set(x, "CALCULATOR", value.asInstanceOf[js.Any])
      
      inline def setCALENDAR(value: BlueprintIcons16Id): Self = StObject.set(x, "CALENDAR", value.asInstanceOf[js.Any])
      
      inline def setCAMERA(value: BlueprintIcons16Id): Self = StObject.set(x, "CAMERA", value.asInstanceOf[js.Any])
      
      inline def setCARET_DOWN(value: BlueprintIcons16Id): Self = StObject.set(x, "CARET_DOWN", value.asInstanceOf[js.Any])
      
      inline def setCARET_LEFT(value: BlueprintIcons16Id): Self = StObject.set(x, "CARET_LEFT", value.asInstanceOf[js.Any])
      
      inline def setCARET_RIGHT(value: BlueprintIcons16Id): Self = StObject.set(x, "CARET_RIGHT", value.asInstanceOf[js.Any])
      
      inline def setCARET_UP(value: BlueprintIcons16Id): Self = StObject.set(x, "CARET_UP", value.asInstanceOf[js.Any])
      
      inline def setCARGO_SHIP(value: BlueprintIcons16Id): Self = StObject.set(x, "CARGO_SHIP", value.asInstanceOf[js.Any])
      
      inline def setCELL_TOWER(value: BlueprintIcons16Id): Self = StObject.set(x, "CELL_TOWER", value.asInstanceOf[js.Any])
      
      inline def setCHANGES(value: BlueprintIcons16Id): Self = StObject.set(x, "CHANGES", value.asInstanceOf[js.Any])
      
      inline def setCHART(value: BlueprintIcons16Id): Self = StObject.set(x, "CHART", value.asInstanceOf[js.Any])
      
      inline def setCHAT(value: BlueprintIcons16Id): Self = StObject.set(x, "CHAT", value.asInstanceOf[js.Any])
      
      inline def setCHEVRON_BACKWARD(value: BlueprintIcons16Id): Self = StObject.set(x, "CHEVRON_BACKWARD", value.asInstanceOf[js.Any])
      
      inline def setCHEVRON_DOWN(value: BlueprintIcons16Id): Self = StObject.set(x, "CHEVRON_DOWN", value.asInstanceOf[js.Any])
      
      inline def setCHEVRON_FORWARD(value: BlueprintIcons16Id): Self = StObject.set(x, "CHEVRON_FORWARD", value.asInstanceOf[js.Any])
      
      inline def setCHEVRON_LEFT(value: BlueprintIcons16Id): Self = StObject.set(x, "CHEVRON_LEFT", value.asInstanceOf[js.Any])
      
      inline def setCHEVRON_RIGHT(value: BlueprintIcons16Id): Self = StObject.set(x, "CHEVRON_RIGHT", value.asInstanceOf[js.Any])
      
      inline def setCHEVRON_UP(value: BlueprintIcons16Id): Self = StObject.set(x, "CHEVRON_UP", value.asInstanceOf[js.Any])
      
      inline def setCIRCLE(value: BlueprintIcons16Id): Self = StObject.set(x, "CIRCLE", value.asInstanceOf[js.Any])
      
      inline def setCIRCLE_ARROW_DOWN(value: BlueprintIcons16Id): Self = StObject.set(x, "CIRCLE_ARROW_DOWN", value.asInstanceOf[js.Any])
      
      inline def setCIRCLE_ARROW_LEFT(value: BlueprintIcons16Id): Self = StObject.set(x, "CIRCLE_ARROW_LEFT", value.asInstanceOf[js.Any])
      
      inline def setCIRCLE_ARROW_RIGHT(value: BlueprintIcons16Id): Self = StObject.set(x, "CIRCLE_ARROW_RIGHT", value.asInstanceOf[js.Any])
      
      inline def setCIRCLE_ARROW_UP(value: BlueprintIcons16Id): Self = StObject.set(x, "CIRCLE_ARROW_UP", value.asInstanceOf[js.Any])
      
      inline def setCITATION(value: BlueprintIcons16Id): Self = StObject.set(x, "CITATION", value.asInstanceOf[js.Any])
      
      inline def setCLEAN(value: BlueprintIcons16Id): Self = StObject.set(x, "CLEAN", value.asInstanceOf[js.Any])
      
      inline def setCLIP(value: BlueprintIcons16Id): Self = StObject.set(x, "CLIP", value.asInstanceOf[js.Any])
      
      inline def setCLIPBOARD(value: BlueprintIcons16Id): Self = StObject.set(x, "CLIPBOARD", value.asInstanceOf[js.Any])
      
      inline def setCLOUD(value: BlueprintIcons16Id): Self = StObject.set(x, "CLOUD", value.asInstanceOf[js.Any])
      
      inline def setCLOUD_DOWNLOAD(value: BlueprintIcons16Id): Self = StObject.set(x, "CLOUD_DOWNLOAD", value.asInstanceOf[js.Any])
      
      inline def setCLOUD_UPLOAD(value: BlueprintIcons16Id): Self = StObject.set(x, "CLOUD_UPLOAD", value.asInstanceOf[js.Any])
      
      inline def setCODE(value: BlueprintIcons16Id): Self = StObject.set(x, "CODE", value.asInstanceOf[js.Any])
      
      inline def setCODE_BLOCK(value: BlueprintIcons16Id): Self = StObject.set(x, "CODE_BLOCK", value.asInstanceOf[js.Any])
      
      inline def setCOG(value: BlueprintIcons16Id): Self = StObject.set(x, "COG", value.asInstanceOf[js.Any])
      
      inline def setCOLLAPSE_ALL(value: BlueprintIcons16Id): Self = StObject.set(x, "COLLAPSE_ALL", value.asInstanceOf[js.Any])
      
      inline def setCOLOR_FILL(value: BlueprintIcons16Id): Self = StObject.set(x, "COLOR_FILL", value.asInstanceOf[js.Any])
      
      inline def setCOLUMN_LAYOUT(value: BlueprintIcons16Id): Self = StObject.set(x, "COLUMN_LAYOUT", value.asInstanceOf[js.Any])
      
      inline def setCOMMENT(value: BlueprintIcons16Id): Self = StObject.set(x, "COMMENT", value.asInstanceOf[js.Any])
      
      inline def setCOMPARISON(value: BlueprintIcons16Id): Self = StObject.set(x, "COMPARISON", value.asInstanceOf[js.Any])
      
      inline def setCOMPASS(value: BlueprintIcons16Id): Self = StObject.set(x, "COMPASS", value.asInstanceOf[js.Any])
      
      inline def setCOMPRESSED(value: BlueprintIcons16Id): Self = StObject.set(x, "COMPRESSED", value.asInstanceOf[js.Any])
      
      inline def setCONFIRM(value: BlueprintIcons16Id): Self = StObject.set(x, "CONFIRM", value.asInstanceOf[js.Any])
      
      inline def setCONSOLE(value: BlueprintIcons16Id): Self = StObject.set(x, "CONSOLE", value.asInstanceOf[js.Any])
      
      inline def setCONTRAST(value: BlueprintIcons16Id): Self = StObject.set(x, "CONTRAST", value.asInstanceOf[js.Any])
      
      inline def setCONTROL(value: BlueprintIcons16Id): Self = StObject.set(x, "CONTROL", value.asInstanceOf[js.Any])
      
      inline def setCREDIT_CARD(value: BlueprintIcons16Id): Self = StObject.set(x, "CREDIT_CARD", value.asInstanceOf[js.Any])
      
      inline def setCROSS(value: BlueprintIcons16Id): Self = StObject.set(x, "CROSS", value.asInstanceOf[js.Any])
      
      inline def setCROWN(value: BlueprintIcons16Id): Self = StObject.set(x, "CROWN", value.asInstanceOf[js.Any])
      
      inline def setCUBE(value: BlueprintIcons16Id): Self = StObject.set(x, "CUBE", value.asInstanceOf[js.Any])
      
      inline def setCUBE_ADD(value: BlueprintIcons16Id): Self = StObject.set(x, "CUBE_ADD", value.asInstanceOf[js.Any])
      
      inline def setCUBE_REMOVE(value: BlueprintIcons16Id): Self = StObject.set(x, "CUBE_REMOVE", value.asInstanceOf[js.Any])
      
      inline def setCURVED_RANGE_CHART(value: BlueprintIcons16Id): Self = StObject.set(x, "CURVED_RANGE_CHART", value.asInstanceOf[js.Any])
      
      inline def setCUT(value: BlueprintIcons16Id): Self = StObject.set(x, "CUT", value.asInstanceOf[js.Any])
      
      inline def setCYCLE(value: BlueprintIcons16Id): Self = StObject.set(x, "CYCLE", value.asInstanceOf[js.Any])
      
      inline def setCaretDown(value: BlueprintIcons16Id): Self = StObject.set(x, "CaretDown", value.asInstanceOf[js.Any])
      
      inline def setCaretLeft(value: BlueprintIcons16Id): Self = StObject.set(x, "CaretLeft", value.asInstanceOf[js.Any])
      
      inline def setCaretRight(value: BlueprintIcons16Id): Self = StObject.set(x, "CaretRight", value.asInstanceOf[js.Any])
      
      inline def setCaretUp(value: BlueprintIcons16Id): Self = StObject.set(x, "CaretUp", value.asInstanceOf[js.Any])
      
      inline def setCargoShip(value: BlueprintIcons16Id): Self = StObject.set(x, "CargoShip", value.asInstanceOf[js.Any])
      
      inline def setCellTower(value: BlueprintIcons16Id): Self = StObject.set(x, "CellTower", value.asInstanceOf[js.Any])
      
      inline def setChevronBackward(value: BlueprintIcons16Id): Self = StObject.set(x, "ChevronBackward", value.asInstanceOf[js.Any])
      
      inline def setChevronDown(value: BlueprintIcons16Id): Self = StObject.set(x, "ChevronDown", value.asInstanceOf[js.Any])
      
      inline def setChevronForward(value: BlueprintIcons16Id): Self = StObject.set(x, "ChevronForward", value.asInstanceOf[js.Any])
      
      inline def setChevronLeft(value: BlueprintIcons16Id): Self = StObject.set(x, "ChevronLeft", value.asInstanceOf[js.Any])
      
      inline def setChevronRight(value: BlueprintIcons16Id): Self = StObject.set(x, "ChevronRight", value.asInstanceOf[js.Any])
      
      inline def setChevronUp(value: BlueprintIcons16Id): Self = StObject.set(x, "ChevronUp", value.asInstanceOf[js.Any])
      
      inline def setCircleArrowDown(value: BlueprintIcons16Id): Self = StObject.set(x, "CircleArrowDown", value.asInstanceOf[js.Any])
      
      inline def setCircleArrowLeft(value: BlueprintIcons16Id): Self = StObject.set(x, "CircleArrowLeft", value.asInstanceOf[js.Any])
      
      inline def setCircleArrowRight(value: BlueprintIcons16Id): Self = StObject.set(x, "CircleArrowRight", value.asInstanceOf[js.Any])
      
      inline def setCircleArrowUp(value: BlueprintIcons16Id): Self = StObject.set(x, "CircleArrowUp", value.asInstanceOf[js.Any])
      
      inline def setCloudDownload(value: BlueprintIcons16Id): Self = StObject.set(x, "CloudDownload", value.asInstanceOf[js.Any])
      
      inline def setCloudUpload(value: BlueprintIcons16Id): Self = StObject.set(x, "CloudUpload", value.asInstanceOf[js.Any])
      
      inline def setCodeBlock(value: BlueprintIcons16Id): Self = StObject.set(x, "CodeBlock", value.asInstanceOf[js.Any])
      
      inline def setCollapseAll(value: BlueprintIcons16Id): Self = StObject.set(x, "CollapseAll", value.asInstanceOf[js.Any])
      
      inline def setColorFill(value: BlueprintIcons16Id): Self = StObject.set(x, "ColorFill", value.asInstanceOf[js.Any])
      
      inline def setColumnLayout(value: BlueprintIcons16Id): Self = StObject.set(x, "ColumnLayout", value.asInstanceOf[js.Any])
      
      inline def setCreditCard(value: BlueprintIcons16Id): Self = StObject.set(x, "CreditCard", value.asInstanceOf[js.Any])
      
      inline def setCubeAdd(value: BlueprintIcons16Id): Self = StObject.set(x, "CubeAdd", value.asInstanceOf[js.Any])
      
      inline def setCubeRemove(value: BlueprintIcons16Id): Self = StObject.set(x, "CubeRemove", value.asInstanceOf[js.Any])
      
      inline def setCurvedRangeChart(value: BlueprintIcons16Id): Self = StObject.set(x, "CurvedRangeChart", value.asInstanceOf[js.Any])
      
      inline def setDASHBOARD(value: BlueprintIcons16Id): Self = StObject.set(x, "DASHBOARD", value.asInstanceOf[js.Any])
      
      inline def setDATABASE(value: BlueprintIcons16Id): Self = StObject.set(x, "DATABASE", value.asInstanceOf[js.Any])
      
      inline def setDATA_CONNECTION(value: BlueprintIcons16Id): Self = StObject.set(x, "DATA_CONNECTION", value.asInstanceOf[js.Any])
      
      inline def setDATA_LINEAGE(value: BlueprintIcons16Id): Self = StObject.set(x, "DATA_LINEAGE", value.asInstanceOf[js.Any])
      
      inline def setDELETE(value: BlueprintIcons16Id): Self = StObject.set(x, "DELETE", value.asInstanceOf[js.Any])
      
      inline def setDELTA(value: BlueprintIcons16Id): Self = StObject.set(x, "DELTA", value.asInstanceOf[js.Any])
      
      inline def setDERIVE_COLUMN(value: BlueprintIcons16Id): Self = StObject.set(x, "DERIVE_COLUMN", value.asInstanceOf[js.Any])
      
      inline def setDESKTOP(value: BlueprintIcons16Id): Self = StObject.set(x, "DESKTOP", value.asInstanceOf[js.Any])
      
      inline def setDIAGNOSIS(value: BlueprintIcons16Id): Self = StObject.set(x, "DIAGNOSIS", value.asInstanceOf[js.Any])
      
      inline def setDIAGRAM_TREE(value: BlueprintIcons16Id): Self = StObject.set(x, "DIAGRAM_TREE", value.asInstanceOf[js.Any])
      
      inline def setDIRECTION_LEFT(value: BlueprintIcons16Id): Self = StObject.set(x, "DIRECTION_LEFT", value.asInstanceOf[js.Any])
      
      inline def setDIRECTION_RIGHT(value: BlueprintIcons16Id): Self = StObject.set(x, "DIRECTION_RIGHT", value.asInstanceOf[js.Any])
      
      inline def setDISABLE(value: BlueprintIcons16Id): Self = StObject.set(x, "DISABLE", value.asInstanceOf[js.Any])
      
      inline def setDIVIDE(value: BlueprintIcons16Id): Self = StObject.set(x, "DIVIDE", value.asInstanceOf[js.Any])
      
      inline def setDOCUMENT(value: BlueprintIcons16Id): Self = StObject.set(x, "DOCUMENT", value.asInstanceOf[js.Any])
      
      inline def setDOCUMENT_OPEN(value: BlueprintIcons16Id): Self = StObject.set(x, "DOCUMENT_OPEN", value.asInstanceOf[js.Any])
      
      inline def setDOCUMENT_SHARE(value: BlueprintIcons16Id): Self = StObject.set(x, "DOCUMENT_SHARE", value.asInstanceOf[js.Any])
      
      inline def setDOLLAR(value: BlueprintIcons16Id): Self = StObject.set(x, "DOLLAR", value.asInstanceOf[js.Any])
      
      inline def setDOT(value: BlueprintIcons16Id): Self = StObject.set(x, "DOT", value.asInstanceOf[js.Any])
      
      inline def setDOUBLE_CARET_HORIZONTAL(value: BlueprintIcons16Id): Self = StObject.set(x, "DOUBLE_CARET_HORIZONTAL", value.asInstanceOf[js.Any])
      
      inline def setDOUBLE_CARET_VERTICAL(value: BlueprintIcons16Id): Self = StObject.set(x, "DOUBLE_CARET_VERTICAL", value.asInstanceOf[js.Any])
      
      inline def setDOUBLE_CHEVRON_DOWN(value: BlueprintIcons16Id): Self = StObject.set(x, "DOUBLE_CHEVRON_DOWN", value.asInstanceOf[js.Any])
      
      inline def setDOUBLE_CHEVRON_LEFT(value: BlueprintIcons16Id): Self = StObject.set(x, "DOUBLE_CHEVRON_LEFT", value.asInstanceOf[js.Any])
      
      inline def setDOUBLE_CHEVRON_RIGHT(value: BlueprintIcons16Id): Self = StObject.set(x, "DOUBLE_CHEVRON_RIGHT", value.asInstanceOf[js.Any])
      
      inline def setDOUBLE_CHEVRON_UP(value: BlueprintIcons16Id): Self = StObject.set(x, "DOUBLE_CHEVRON_UP", value.asInstanceOf[js.Any])
      
      inline def setDOUGHNUT_CHART(value: BlueprintIcons16Id): Self = StObject.set(x, "DOUGHNUT_CHART", value.asInstanceOf[js.Any])
      
      inline def setDOWNLOAD(value: BlueprintIcons16Id): Self = StObject.set(x, "DOWNLOAD", value.asInstanceOf[js.Any])
      
      inline def setDRAG_HANDLE_HORIZONTAL(value: BlueprintIcons16Id): Self = StObject.set(x, "DRAG_HANDLE_HORIZONTAL", value.asInstanceOf[js.Any])
      
      inline def setDRAG_HANDLE_VERTICAL(value: BlueprintIcons16Id): Self = StObject.set(x, "DRAG_HANDLE_VERTICAL", value.asInstanceOf[js.Any])
      
      inline def setDRAW(value: BlueprintIcons16Id): Self = StObject.set(x, "DRAW", value.asInstanceOf[js.Any])
      
      inline def setDRAWER_LEFT(value: BlueprintIcons16Id): Self = StObject.set(x, "DRAWER_LEFT", value.asInstanceOf[js.Any])
      
      inline def setDRAWER_LEFT_FILLED(value: BlueprintIcons16Id): Self = StObject.set(x, "DRAWER_LEFT_FILLED", value.asInstanceOf[js.Any])
      
      inline def setDRAWER_RIGHT(value: BlueprintIcons16Id): Self = StObject.set(x, "DRAWER_RIGHT", value.asInstanceOf[js.Any])
      
      inline def setDRAWER_RIGHT_FILLED(value: BlueprintIcons16Id): Self = StObject.set(x, "DRAWER_RIGHT_FILLED", value.asInstanceOf[js.Any])
      
      inline def setDRIVE_TIME(value: BlueprintIcons16Id): Self = StObject.set(x, "DRIVE_TIME", value.asInstanceOf[js.Any])
      
      inline def setDUPLICATE(value: BlueprintIcons16Id): Self = StObject.set(x, "DUPLICATE", value.asInstanceOf[js.Any])
      
      inline def setDataConnection(value: BlueprintIcons16Id): Self = StObject.set(x, "DataConnection", value.asInstanceOf[js.Any])
      
      inline def setDataLineage(value: BlueprintIcons16Id): Self = StObject.set(x, "DataLineage", value.asInstanceOf[js.Any])
      
      inline def setDeriveColumn(value: BlueprintIcons16Id): Self = StObject.set(x, "DeriveColumn", value.asInstanceOf[js.Any])
      
      inline def setDiagramTree(value: BlueprintIcons16Id): Self = StObject.set(x, "DiagramTree", value.asInstanceOf[js.Any])
      
      inline def setDirectionLeft(value: BlueprintIcons16Id): Self = StObject.set(x, "DirectionLeft", value.asInstanceOf[js.Any])
      
      inline def setDirectionRight(value: BlueprintIcons16Id): Self = StObject.set(x, "DirectionRight", value.asInstanceOf[js.Any])
      
      inline def setDocumentOpen(value: BlueprintIcons16Id): Self = StObject.set(x, "DocumentOpen", value.asInstanceOf[js.Any])
      
      inline def setDocumentShare(value: BlueprintIcons16Id): Self = StObject.set(x, "DocumentShare", value.asInstanceOf[js.Any])
      
      inline def setDoubleCaretHorizontal(value: BlueprintIcons16Id): Self = StObject.set(x, "DoubleCaretHorizontal", value.asInstanceOf[js.Any])
      
      inline def setDoubleCaretVertical(value: BlueprintIcons16Id): Self = StObject.set(x, "DoubleCaretVertical", value.asInstanceOf[js.Any])
      
      inline def setDoubleChevronDown(value: BlueprintIcons16Id): Self = StObject.set(x, "DoubleChevronDown", value.asInstanceOf[js.Any])
      
      inline def setDoubleChevronLeft(value: BlueprintIcons16Id): Self = StObject.set(x, "DoubleChevronLeft", value.asInstanceOf[js.Any])
      
      inline def setDoubleChevronRight(value: BlueprintIcons16Id): Self = StObject.set(x, "DoubleChevronRight", value.asInstanceOf[js.Any])
      
      inline def setDoubleChevronUp(value: BlueprintIcons16Id): Self = StObject.set(x, "DoubleChevronUp", value.asInstanceOf[js.Any])
      
      inline def setDoughnutChart(value: BlueprintIcons16Id): Self = StObject.set(x, "DoughnutChart", value.asInstanceOf[js.Any])
      
      inline def setDragHandleHorizontal(value: BlueprintIcons16Id): Self = StObject.set(x, "DragHandleHorizontal", value.asInstanceOf[js.Any])
      
      inline def setDragHandleVertical(value: BlueprintIcons16Id): Self = StObject.set(x, "DragHandleVertical", value.asInstanceOf[js.Any])
      
      inline def setDrawerLeft(value: BlueprintIcons16Id): Self = StObject.set(x, "DrawerLeft", value.asInstanceOf[js.Any])
      
      inline def setDrawerLeftFilled(value: BlueprintIcons16Id): Self = StObject.set(x, "DrawerLeftFilled", value.asInstanceOf[js.Any])
      
      inline def setDrawerRight(value: BlueprintIcons16Id): Self = StObject.set(x, "DrawerRight", value.asInstanceOf[js.Any])
      
      inline def setDrawerRightFilled(value: BlueprintIcons16Id): Self = StObject.set(x, "DrawerRightFilled", value.asInstanceOf[js.Any])
      
      inline def setDriveTime(value: BlueprintIcons16Id): Self = StObject.set(x, "DriveTime", value.asInstanceOf[js.Any])
      
      inline def setEDIT(value: BlueprintIcons16Id): Self = StObject.set(x, "EDIT", value.asInstanceOf[js.Any])
      
      inline def setEJECT(value: BlueprintIcons16Id): Self = StObject.set(x, "EJECT", value.asInstanceOf[js.Any])
      
      inline def setEMOJI(value: BlueprintIcons16Id): Self = StObject.set(x, "EMOJI", value.asInstanceOf[js.Any])
      
      inline def setENDORSED(value: BlueprintIcons16Id): Self = StObject.set(x, "ENDORSED", value.asInstanceOf[js.Any])
      
      inline def setENVELOPE(value: BlueprintIcons16Id): Self = StObject.set(x, "ENVELOPE", value.asInstanceOf[js.Any])
      
      inline def setEQUALS(value: BlueprintIcons16Id): Self = StObject.set(x, "EQUALS", value.asInstanceOf[js.Any])
      
      inline def setERASER(value: BlueprintIcons16Id): Self = StObject.set(x, "ERASER", value.asInstanceOf[js.Any])
      
      inline def setERROR(value: BlueprintIcons16Id): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
      
      inline def setEURO(value: BlueprintIcons16Id): Self = StObject.set(x, "EURO", value.asInstanceOf[js.Any])
      
      inline def setEXCHANGE(value: BlueprintIcons16Id): Self = StObject.set(x, "EXCHANGE", value.asInstanceOf[js.Any])
      
      inline def setEXCLUDE_ROW(value: BlueprintIcons16Id): Self = StObject.set(x, "EXCLUDE_ROW", value.asInstanceOf[js.Any])
      
      inline def setEXPAND_ALL(value: BlueprintIcons16Id): Self = StObject.set(x, "EXPAND_ALL", value.asInstanceOf[js.Any])
      
      inline def setEXPORT(value: BlueprintIcons16Id): Self = StObject.set(x, "EXPORT", value.asInstanceOf[js.Any])
      
      inline def setEYE_OFF(value: BlueprintIcons16Id): Self = StObject.set(x, "EYE_OFF", value.asInstanceOf[js.Any])
      
      inline def setEYE_ON(value: BlueprintIcons16Id): Self = StObject.set(x, "EYE_ON", value.asInstanceOf[js.Any])
      
      inline def setEYE_OPEN(value: BlueprintIcons16Id): Self = StObject.set(x, "EYE_OPEN", value.asInstanceOf[js.Any])
      
      inline def setExcludeRow(value: BlueprintIcons16Id): Self = StObject.set(x, "ExcludeRow", value.asInstanceOf[js.Any])
      
      inline def setExpandAll(value: BlueprintIcons16Id): Self = StObject.set(x, "ExpandAll", value.asInstanceOf[js.Any])
      
      inline def setEyeOff(value: BlueprintIcons16Id): Self = StObject.set(x, "EyeOff", value.asInstanceOf[js.Any])
      
      inline def setEyeOn(value: BlueprintIcons16Id): Self = StObject.set(x, "EyeOn", value.asInstanceOf[js.Any])
      
      inline def setEyeOpen(value: BlueprintIcons16Id): Self = StObject.set(x, "EyeOpen", value.asInstanceOf[js.Any])
      
      inline def setFAST_BACKWARD(value: BlueprintIcons16Id): Self = StObject.set(x, "FAST_BACKWARD", value.asInstanceOf[js.Any])
      
      inline def setFAST_FORWARD(value: BlueprintIcons16Id): Self = StObject.set(x, "FAST_FORWARD", value.asInstanceOf[js.Any])
      
      inline def setFEED(value: BlueprintIcons16Id): Self = StObject.set(x, "FEED", value.asInstanceOf[js.Any])
      
      inline def setFEED_SUBSCRIBED(value: BlueprintIcons16Id): Self = StObject.set(x, "FEED_SUBSCRIBED", value.asInstanceOf[js.Any])
      
      inline def setFILM(value: BlueprintIcons16Id): Self = StObject.set(x, "FILM", value.asInstanceOf[js.Any])
      
      inline def setFILTER(value: BlueprintIcons16Id): Self = StObject.set(x, "FILTER", value.asInstanceOf[js.Any])
      
      inline def setFILTER_KEEP(value: BlueprintIcons16Id): Self = StObject.set(x, "FILTER_KEEP", value.asInstanceOf[js.Any])
      
      inline def setFILTER_LIST(value: BlueprintIcons16Id): Self = StObject.set(x, "FILTER_LIST", value.asInstanceOf[js.Any])
      
      inline def setFILTER_OPEN(value: BlueprintIcons16Id): Self = StObject.set(x, "FILTER_OPEN", value.asInstanceOf[js.Any])
      
      inline def setFILTER_REMOVE(value: BlueprintIcons16Id): Self = StObject.set(x, "FILTER_REMOVE", value.asInstanceOf[js.Any])
      
      inline def setFLAG(value: BlueprintIcons16Id): Self = StObject.set(x, "FLAG", value.asInstanceOf[js.Any])
      
      inline def setFLAME(value: BlueprintIcons16Id): Self = StObject.set(x, "FLAME", value.asInstanceOf[js.Any])
      
      inline def setFLASH(value: BlueprintIcons16Id): Self = StObject.set(x, "FLASH", value.asInstanceOf[js.Any])
      
      inline def setFLOATING_POINT(value: BlueprintIcons16Id): Self = StObject.set(x, "FLOATING_POINT", value.asInstanceOf[js.Any])
      
      inline def setFLOPPY_DISK(value: BlueprintIcons16Id): Self = StObject.set(x, "FLOPPY_DISK", value.asInstanceOf[js.Any])
      
      inline def setFLOWS(value: BlueprintIcons16Id): Self = StObject.set(x, "FLOWS", value.asInstanceOf[js.Any])
      
      inline def setFLOW_BRANCH(value: BlueprintIcons16Id): Self = StObject.set(x, "FLOW_BRANCH", value.asInstanceOf[js.Any])
      
      inline def setFLOW_END(value: BlueprintIcons16Id): Self = StObject.set(x, "FLOW_END", value.asInstanceOf[js.Any])
      
      inline def setFLOW_LINEAR(value: BlueprintIcons16Id): Self = StObject.set(x, "FLOW_LINEAR", value.asInstanceOf[js.Any])
      
      inline def setFLOW_REVIEW(value: BlueprintIcons16Id): Self = StObject.set(x, "FLOW_REVIEW", value.asInstanceOf[js.Any])
      
      inline def setFLOW_REVIEW_BRANCH(value: BlueprintIcons16Id): Self = StObject.set(x, "FLOW_REVIEW_BRANCH", value.asInstanceOf[js.Any])
      
      inline def setFOLDER_CLOSE(value: BlueprintIcons16Id): Self = StObject.set(x, "FOLDER_CLOSE", value.asInstanceOf[js.Any])
      
      inline def setFOLDER_NEW(value: BlueprintIcons16Id): Self = StObject.set(x, "FOLDER_NEW", value.asInstanceOf[js.Any])
      
      inline def setFOLDER_OPEN(value: BlueprintIcons16Id): Self = StObject.set(x, "FOLDER_OPEN", value.asInstanceOf[js.Any])
      
      inline def setFOLDER_SHARED(value: BlueprintIcons16Id): Self = StObject.set(x, "FOLDER_SHARED", value.asInstanceOf[js.Any])
      
      inline def setFOLDER_SHARED_OPEN(value: BlueprintIcons16Id): Self = StObject.set(x, "FOLDER_SHARED_OPEN", value.asInstanceOf[js.Any])
      
      inline def setFOLLOWER(value: BlueprintIcons16Id): Self = StObject.set(x, "FOLLOWER", value.asInstanceOf[js.Any])
      
      inline def setFOLLOWING(value: BlueprintIcons16Id): Self = StObject.set(x, "FOLLOWING", value.asInstanceOf[js.Any])
      
      inline def setFONT(value: BlueprintIcons16Id): Self = StObject.set(x, "FONT", value.asInstanceOf[js.Any])
      
      inline def setFORK(value: BlueprintIcons16Id): Self = StObject.set(x, "FORK", value.asInstanceOf[js.Any])
      
      inline def setFORM(value: BlueprintIcons16Id): Self = StObject.set(x, "FORM", value.asInstanceOf[js.Any])
      
      inline def setFUEL(value: BlueprintIcons16Id): Self = StObject.set(x, "FUEL", value.asInstanceOf[js.Any])
      
      inline def setFULLSCREEN(value: BlueprintIcons16Id): Self = StObject.set(x, "FULLSCREEN", value.asInstanceOf[js.Any])
      
      inline def setFULL_CIRCLE(value: BlueprintIcons16Id): Self = StObject.set(x, "FULL_CIRCLE", value.asInstanceOf[js.Any])
      
      inline def setFULL_STACKED_CHART(value: BlueprintIcons16Id): Self = StObject.set(x, "FULL_STACKED_CHART", value.asInstanceOf[js.Any])
      
      inline def setFUNCTION(value: BlueprintIcons16Id): Self = StObject.set(x, "FUNCTION", value.asInstanceOf[js.Any])
      
      inline def setFastBackward(value: BlueprintIcons16Id): Self = StObject.set(x, "FastBackward", value.asInstanceOf[js.Any])
      
      inline def setFastForward(value: BlueprintIcons16Id): Self = StObject.set(x, "FastForward", value.asInstanceOf[js.Any])
      
      inline def setFeedSubscribed(value: BlueprintIcons16Id): Self = StObject.set(x, "FeedSubscribed", value.asInstanceOf[js.Any])
      
      inline def setFilterKeep(value: BlueprintIcons16Id): Self = StObject.set(x, "FilterKeep", value.asInstanceOf[js.Any])
      
      inline def setFilterList(value: BlueprintIcons16Id): Self = StObject.set(x, "FilterList", value.asInstanceOf[js.Any])
      
      inline def setFilterOpen(value: BlueprintIcons16Id): Self = StObject.set(x, "FilterOpen", value.asInstanceOf[js.Any])
      
      inline def setFilterRemove(value: BlueprintIcons16Id): Self = StObject.set(x, "FilterRemove", value.asInstanceOf[js.Any])
      
      inline def setFloatingPoint(value: BlueprintIcons16Id): Self = StObject.set(x, "FloatingPoint", value.asInstanceOf[js.Any])
      
      inline def setFloppyDisk(value: BlueprintIcons16Id): Self = StObject.set(x, "FloppyDisk", value.asInstanceOf[js.Any])
      
      inline def setFlowBranch(value: BlueprintIcons16Id): Self = StObject.set(x, "FlowBranch", value.asInstanceOf[js.Any])
      
      inline def setFlowEnd(value: BlueprintIcons16Id): Self = StObject.set(x, "FlowEnd", value.asInstanceOf[js.Any])
      
      inline def setFlowLinear(value: BlueprintIcons16Id): Self = StObject.set(x, "FlowLinear", value.asInstanceOf[js.Any])
      
      inline def setFlowReview(value: BlueprintIcons16Id): Self = StObject.set(x, "FlowReview", value.asInstanceOf[js.Any])
      
      inline def setFlowReviewBranch(value: BlueprintIcons16Id): Self = StObject.set(x, "FlowReviewBranch", value.asInstanceOf[js.Any])
      
      inline def setFolderClose(value: BlueprintIcons16Id): Self = StObject.set(x, "FolderClose", value.asInstanceOf[js.Any])
      
      inline def setFolderNew(value: BlueprintIcons16Id): Self = StObject.set(x, "FolderNew", value.asInstanceOf[js.Any])
      
      inline def setFolderOpen(value: BlueprintIcons16Id): Self = StObject.set(x, "FolderOpen", value.asInstanceOf[js.Any])
      
      inline def setFolderShared(value: BlueprintIcons16Id): Self = StObject.set(x, "FolderShared", value.asInstanceOf[js.Any])
      
      inline def setFolderSharedOpen(value: BlueprintIcons16Id): Self = StObject.set(x, "FolderSharedOpen", value.asInstanceOf[js.Any])
      
      inline def setFullCircle(value: BlueprintIcons16Id): Self = StObject.set(x, "FullCircle", value.asInstanceOf[js.Any])
      
      inline def setFullStackedChart(value: BlueprintIcons16Id): Self = StObject.set(x, "FullStackedChart", value.asInstanceOf[js.Any])
      
      inline def setGANTT_CHART(value: BlueprintIcons16Id): Self = StObject.set(x, "GANTT_CHART", value.asInstanceOf[js.Any])
      
      inline def setGEOFENCE(value: BlueprintIcons16Id): Self = StObject.set(x, "GEOFENCE", value.asInstanceOf[js.Any])
      
      inline def setGEOLOCATION(value: BlueprintIcons16Id): Self = StObject.set(x, "GEOLOCATION", value.asInstanceOf[js.Any])
      
      inline def setGEOSEARCH(value: BlueprintIcons16Id): Self = StObject.set(x, "GEOSEARCH", value.asInstanceOf[js.Any])
      
      inline def setGIT_BRANCH(value: BlueprintIcons16Id): Self = StObject.set(x, "GIT_BRANCH", value.asInstanceOf[js.Any])
      
      inline def setGIT_COMMIT(value: BlueprintIcons16Id): Self = StObject.set(x, "GIT_COMMIT", value.asInstanceOf[js.Any])
      
      inline def setGIT_MERGE(value: BlueprintIcons16Id): Self = StObject.set(x, "GIT_MERGE", value.asInstanceOf[js.Any])
      
      inline def setGIT_NEW_BRANCH(value: BlueprintIcons16Id): Self = StObject.set(x, "GIT_NEW_BRANCH", value.asInstanceOf[js.Any])
      
      inline def setGIT_PULL(value: BlueprintIcons16Id): Self = StObject.set(x, "GIT_PULL", value.asInstanceOf[js.Any])
      
      inline def setGIT_PUSH(value: BlueprintIcons16Id): Self = StObject.set(x, "GIT_PUSH", value.asInstanceOf[js.Any])
      
      inline def setGIT_REPO(value: BlueprintIcons16Id): Self = StObject.set(x, "GIT_REPO", value.asInstanceOf[js.Any])
      
      inline def setGLASS(value: BlueprintIcons16Id): Self = StObject.set(x, "GLASS", value.asInstanceOf[js.Any])
      
      inline def setGLOBE(value: BlueprintIcons16Id): Self = StObject.set(x, "GLOBE", value.asInstanceOf[js.Any])
      
      inline def setGLOBE_NETWORK(value: BlueprintIcons16Id): Self = StObject.set(x, "GLOBE_NETWORK", value.asInstanceOf[js.Any])
      
      inline def setGRAPH(value: BlueprintIcons16Id): Self = StObject.set(x, "GRAPH", value.asInstanceOf[js.Any])
      
      inline def setGRAPH_REMOVE(value: BlueprintIcons16Id): Self = StObject.set(x, "GRAPH_REMOVE", value.asInstanceOf[js.Any])
      
      inline def setGREATER_THAN(value: BlueprintIcons16Id): Self = StObject.set(x, "GREATER_THAN", value.asInstanceOf[js.Any])
      
      inline def setGREATER_THAN_OR_EQUAL_TO(value: BlueprintIcons16Id): Self = StObject.set(x, "GREATER_THAN_OR_EQUAL_TO", value.asInstanceOf[js.Any])
      
      inline def setGRID(value: BlueprintIcons16Id): Self = StObject.set(x, "GRID", value.asInstanceOf[js.Any])
      
      inline def setGRID_VIEW(value: BlueprintIcons16Id): Self = StObject.set(x, "GRID_VIEW", value.asInstanceOf[js.Any])
      
      inline def setGROUPED_BAR_CHART(value: BlueprintIcons16Id): Self = StObject.set(x, "GROUPED_BAR_CHART", value.asInstanceOf[js.Any])
      
      inline def setGROUP_OBJECTS(value: BlueprintIcons16Id): Self = StObject.set(x, "GROUP_OBJECTS", value.asInstanceOf[js.Any])
      
      inline def setGanttChart(value: BlueprintIcons16Id): Self = StObject.set(x, "GanttChart", value.asInstanceOf[js.Any])
      
      inline def setGitBranch(value: BlueprintIcons16Id): Self = StObject.set(x, "GitBranch", value.asInstanceOf[js.Any])
      
      inline def setGitCommit(value: BlueprintIcons16Id): Self = StObject.set(x, "GitCommit", value.asInstanceOf[js.Any])
      
      inline def setGitMerge(value: BlueprintIcons16Id): Self = StObject.set(x, "GitMerge", value.asInstanceOf[js.Any])
      
      inline def setGitNewBranch(value: BlueprintIcons16Id): Self = StObject.set(x, "GitNewBranch", value.asInstanceOf[js.Any])
      
      inline def setGitPull(value: BlueprintIcons16Id): Self = StObject.set(x, "GitPull", value.asInstanceOf[js.Any])
      
      inline def setGitPush(value: BlueprintIcons16Id): Self = StObject.set(x, "GitPush", value.asInstanceOf[js.Any])
      
      inline def setGitRepo(value: BlueprintIcons16Id): Self = StObject.set(x, "GitRepo", value.asInstanceOf[js.Any])
      
      inline def setGlobeNetwork(value: BlueprintIcons16Id): Self = StObject.set(x, "GlobeNetwork", value.asInstanceOf[js.Any])
      
      inline def setGraphRemove(value: BlueprintIcons16Id): Self = StObject.set(x, "GraphRemove", value.asInstanceOf[js.Any])
      
      inline def setGreaterThan(value: BlueprintIcons16Id): Self = StObject.set(x, "GreaterThan", value.asInstanceOf[js.Any])
      
      inline def setGreaterThanOrEqualTo(value: BlueprintIcons16Id): Self = StObject.set(x, "GreaterThanOrEqualTo", value.asInstanceOf[js.Any])
      
      inline def setGridView(value: BlueprintIcons16Id): Self = StObject.set(x, "GridView", value.asInstanceOf[js.Any])
      
      inline def setGroupObjects(value: BlueprintIcons16Id): Self = StObject.set(x, "GroupObjects", value.asInstanceOf[js.Any])
      
      inline def setGroupedBarChart(value: BlueprintIcons16Id): Self = StObject.set(x, "GroupedBarChart", value.asInstanceOf[js.Any])
      
      inline def setHAND(value: BlueprintIcons16Id): Self = StObject.set(x, "HAND", value.asInstanceOf[js.Any])
      
      inline def setHAND_DOWN(value: BlueprintIcons16Id): Self = StObject.set(x, "HAND_DOWN", value.asInstanceOf[js.Any])
      
      inline def setHAND_LEFT(value: BlueprintIcons16Id): Self = StObject.set(x, "HAND_LEFT", value.asInstanceOf[js.Any])
      
      inline def setHAND_RIGHT(value: BlueprintIcons16Id): Self = StObject.set(x, "HAND_RIGHT", value.asInstanceOf[js.Any])
      
      inline def setHAND_UP(value: BlueprintIcons16Id): Self = StObject.set(x, "HAND_UP", value.asInstanceOf[js.Any])
      
      inline def setHAT(value: BlueprintIcons16Id): Self = StObject.set(x, "HAT", value.asInstanceOf[js.Any])
      
      inline def setHEADER(value: BlueprintIcons16Id): Self = StObject.set(x, "HEADER", value.asInstanceOf[js.Any])
      
      inline def setHEADER_ONE(value: BlueprintIcons16Id): Self = StObject.set(x, "HEADER_ONE", value.asInstanceOf[js.Any])
      
      inline def setHEADER_THREE(value: BlueprintIcons16Id): Self = StObject.set(x, "HEADER_THREE", value.asInstanceOf[js.Any])
      
      inline def setHEADER_TWO(value: BlueprintIcons16Id): Self = StObject.set(x, "HEADER_TWO", value.asInstanceOf[js.Any])
      
      inline def setHEADSET(value: BlueprintIcons16Id): Self = StObject.set(x, "HEADSET", value.asInstanceOf[js.Any])
      
      inline def setHEART(value: BlueprintIcons16Id): Self = StObject.set(x, "HEART", value.asInstanceOf[js.Any])
      
      inline def setHEART_BROKEN(value: BlueprintIcons16Id): Self = StObject.set(x, "HEART_BROKEN", value.asInstanceOf[js.Any])
      
      inline def setHEATMAP(value: BlueprintIcons16Id): Self = StObject.set(x, "HEATMAP", value.asInstanceOf[js.Any])
      
      inline def setHEAT_GRID(value: BlueprintIcons16Id): Self = StObject.set(x, "HEAT_GRID", value.asInstanceOf[js.Any])
      
      inline def setHELICOPTER(value: BlueprintIcons16Id): Self = StObject.set(x, "HELICOPTER", value.asInstanceOf[js.Any])
      
      inline def setHELP(value: BlueprintIcons16Id): Self = StObject.set(x, "HELP", value.asInstanceOf[js.Any])
      
      inline def setHELPER_MANAGEMENT(value: BlueprintIcons16Id): Self = StObject.set(x, "HELPER_MANAGEMENT", value.asInstanceOf[js.Any])
      
      inline def setHIGHLIGHT(value: BlueprintIcons16Id): Self = StObject.set(x, "HIGHLIGHT", value.asInstanceOf[js.Any])
      
      inline def setHIGH_PRIORITY(value: BlueprintIcons16Id): Self = StObject.set(x, "HIGH_PRIORITY", value.asInstanceOf[js.Any])
      
      inline def setHIGH_VOLTAGE_POLE(value: BlueprintIcons16Id): Self = StObject.set(x, "HIGH_VOLTAGE_POLE", value.asInstanceOf[js.Any])
      
      inline def setHISTORY(value: BlueprintIcons16Id): Self = StObject.set(x, "HISTORY", value.asInstanceOf[js.Any])
      
      inline def setHOME(value: BlueprintIcons16Id): Self = StObject.set(x, "HOME", value.asInstanceOf[js.Any])
      
      inline def setHORIZONTAL_BAR_CHART(value: BlueprintIcons16Id): Self = StObject.set(x, "HORIZONTAL_BAR_CHART", value.asInstanceOf[js.Any])
      
      inline def setHORIZONTAL_BAR_CHART_ASC(value: BlueprintIcons16Id): Self = StObject.set(x, "HORIZONTAL_BAR_CHART_ASC", value.asInstanceOf[js.Any])
      
      inline def setHORIZONTAL_BAR_CHART_DESC(value: BlueprintIcons16Id): Self = StObject.set(x, "HORIZONTAL_BAR_CHART_DESC", value.asInstanceOf[js.Any])
      
      inline def setHORIZONTAL_DISTRIBUTION(value: BlueprintIcons16Id): Self = StObject.set(x, "HORIZONTAL_DISTRIBUTION", value.asInstanceOf[js.Any])
      
      inline def setHORIZONTAL_INBETWEEN(value: BlueprintIcons16Id): Self = StObject.set(x, "HORIZONTAL_INBETWEEN", value.asInstanceOf[js.Any])
      
      inline def setHURRICANE(value: BlueprintIcons16Id): Self = StObject.set(x, "HURRICANE", value.asInstanceOf[js.Any])
      
      inline def setHandDown(value: BlueprintIcons16Id): Self = StObject.set(x, "HandDown", value.asInstanceOf[js.Any])
      
      inline def setHandLeft(value: BlueprintIcons16Id): Self = StObject.set(x, "HandLeft", value.asInstanceOf[js.Any])
      
      inline def setHandRight(value: BlueprintIcons16Id): Self = StObject.set(x, "HandRight", value.asInstanceOf[js.Any])
      
      inline def setHandUp(value: BlueprintIcons16Id): Self = StObject.set(x, "HandUp", value.asInstanceOf[js.Any])
      
      inline def setHeaderOne(value: BlueprintIcons16Id): Self = StObject.set(x, "HeaderOne", value.asInstanceOf[js.Any])
      
      inline def setHeaderThree(value: BlueprintIcons16Id): Self = StObject.set(x, "HeaderThree", value.asInstanceOf[js.Any])
      
      inline def setHeaderTwo(value: BlueprintIcons16Id): Self = StObject.set(x, "HeaderTwo", value.asInstanceOf[js.Any])
      
      inline def setHeartBroken(value: BlueprintIcons16Id): Self = StObject.set(x, "HeartBroken", value.asInstanceOf[js.Any])
      
      inline def setHeatGrid(value: BlueprintIcons16Id): Self = StObject.set(x, "HeatGrid", value.asInstanceOf[js.Any])
      
      inline def setHelperManagement(value: BlueprintIcons16Id): Self = StObject.set(x, "HelperManagement", value.asInstanceOf[js.Any])
      
      inline def setHighPriority(value: BlueprintIcons16Id): Self = StObject.set(x, "HighPriority", value.asInstanceOf[js.Any])
      
      inline def setHighVoltagePole(value: BlueprintIcons16Id): Self = StObject.set(x, "HighVoltagePole", value.asInstanceOf[js.Any])
      
      inline def setHorizontalBarChart(value: BlueprintIcons16Id): Self = StObject.set(x, "HorizontalBarChart", value.asInstanceOf[js.Any])
      
      inline def setHorizontalBarChartAsc(value: BlueprintIcons16Id): Self = StObject.set(x, "HorizontalBarChartAsc", value.asInstanceOf[js.Any])
      
      inline def setHorizontalBarChartDesc(value: BlueprintIcons16Id): Self = StObject.set(x, "HorizontalBarChartDesc", value.asInstanceOf[js.Any])
      
      inline def setHorizontalDistribution(value: BlueprintIcons16Id): Self = StObject.set(x, "HorizontalDistribution", value.asInstanceOf[js.Any])
      
      inline def setHorizontalInbetween(value: BlueprintIcons16Id): Self = StObject.set(x, "HorizontalInbetween", value.asInstanceOf[js.Any])
      
      inline def setID_NUMBER(value: BlueprintIcons16Id): Self = StObject.set(x, "ID_NUMBER", value.asInstanceOf[js.Any])
      
      inline def setIMAGE_ROTATE_LEFT(value: BlueprintIcons16Id): Self = StObject.set(x, "IMAGE_ROTATE_LEFT", value.asInstanceOf[js.Any])
      
      inline def setIMAGE_ROTATE_RIGHT(value: BlueprintIcons16Id): Self = StObject.set(x, "IMAGE_ROTATE_RIGHT", value.asInstanceOf[js.Any])
      
      inline def setIMPORT(value: BlueprintIcons16Id): Self = StObject.set(x, "IMPORT", value.asInstanceOf[js.Any])
      
      inline def setINBOX(value: BlueprintIcons16Id): Self = StObject.set(x, "INBOX", value.asInstanceOf[js.Any])
      
      inline def setINBOX_FILTERED(value: BlueprintIcons16Id): Self = StObject.set(x, "INBOX_FILTERED", value.asInstanceOf[js.Any])
      
      inline def setINBOX_GEO(value: BlueprintIcons16Id): Self = StObject.set(x, "INBOX_GEO", value.asInstanceOf[js.Any])
      
      inline def setINBOX_SEARCH(value: BlueprintIcons16Id): Self = StObject.set(x, "INBOX_SEARCH", value.asInstanceOf[js.Any])
      
      inline def setINBOX_UPDATE(value: BlueprintIcons16Id): Self = StObject.set(x, "INBOX_UPDATE", value.asInstanceOf[js.Any])
      
      inline def setINFO_SIGN(value: BlueprintIcons16Id): Self = StObject.set(x, "INFO_SIGN", value.asInstanceOf[js.Any])
      
      inline def setINHERITANCE(value: BlueprintIcons16Id): Self = StObject.set(x, "INHERITANCE", value.asInstanceOf[js.Any])
      
      inline def setINHERITED_GROUP(value: BlueprintIcons16Id): Self = StObject.set(x, "INHERITED_GROUP", value.asInstanceOf[js.Any])
      
      inline def setINNER_JOIN(value: BlueprintIcons16Id): Self = StObject.set(x, "INNER_JOIN", value.asInstanceOf[js.Any])
      
      inline def setINSERT(value: BlueprintIcons16Id): Self = StObject.set(x, "INSERT", value.asInstanceOf[js.Any])
      
      inline def setINTERSECTION(value: BlueprintIcons16Id): Self = StObject.set(x, "INTERSECTION", value.asInstanceOf[js.Any])
      
      inline def setIP_ADDRESS(value: BlueprintIcons16Id): Self = StObject.set(x, "IP_ADDRESS", value.asInstanceOf[js.Any])
      
      inline def setISSUE(value: BlueprintIcons16Id): Self = StObject.set(x, "ISSUE", value.asInstanceOf[js.Any])
      
      inline def setISSUE_CLOSED(value: BlueprintIcons16Id): Self = StObject.set(x, "ISSUE_CLOSED", value.asInstanceOf[js.Any])
      
      inline def setISSUE_NEW(value: BlueprintIcons16Id): Self = StObject.set(x, "ISSUE_NEW", value.asInstanceOf[js.Any])
      
      inline def setITALIC(value: BlueprintIcons16Id): Self = StObject.set(x, "ITALIC", value.asInstanceOf[js.Any])
      
      inline def setIdNumber(value: BlueprintIcons16Id): Self = StObject.set(x, "IdNumber", value.asInstanceOf[js.Any])
      
      inline def setImageRotateLeft(value: BlueprintIcons16Id): Self = StObject.set(x, "ImageRotateLeft", value.asInstanceOf[js.Any])
      
      inline def setImageRotateRight(value: BlueprintIcons16Id): Self = StObject.set(x, "ImageRotateRight", value.asInstanceOf[js.Any])
      
      inline def setInboxFiltered(value: BlueprintIcons16Id): Self = StObject.set(x, "InboxFiltered", value.asInstanceOf[js.Any])
      
      inline def setInboxGeo(value: BlueprintIcons16Id): Self = StObject.set(x, "InboxGeo", value.asInstanceOf[js.Any])
      
      inline def setInboxSearch(value: BlueprintIcons16Id): Self = StObject.set(x, "InboxSearch", value.asInstanceOf[js.Any])
      
      inline def setInboxUpdate(value: BlueprintIcons16Id): Self = StObject.set(x, "InboxUpdate", value.asInstanceOf[js.Any])
      
      inline def setInfoSign(value: BlueprintIcons16Id): Self = StObject.set(x, "InfoSign", value.asInstanceOf[js.Any])
      
      inline def setInheritedGroup(value: BlueprintIcons16Id): Self = StObject.set(x, "InheritedGroup", value.asInstanceOf[js.Any])
      
      inline def setInnerJoin(value: BlueprintIcons16Id): Self = StObject.set(x, "InnerJoin", value.asInstanceOf[js.Any])
      
      inline def setIpAddress(value: BlueprintIcons16Id): Self = StObject.set(x, "IpAddress", value.asInstanceOf[js.Any])
      
      inline def setIssueClosed(value: BlueprintIcons16Id): Self = StObject.set(x, "IssueClosed", value.asInstanceOf[js.Any])
      
      inline def setIssueNew(value: BlueprintIcons16Id): Self = StObject.set(x, "IssueNew", value.asInstanceOf[js.Any])
      
      inline def setJOIN_TABLE(value: BlueprintIcons16Id): Self = StObject.set(x, "JOIN_TABLE", value.asInstanceOf[js.Any])
      
      inline def setJoinTable(value: BlueprintIcons16Id): Self = StObject.set(x, "JoinTable", value.asInstanceOf[js.Any])
      
      inline def setKEY(value: BlueprintIcons16Id): Self = StObject.set(x, "KEY", value.asInstanceOf[js.Any])
      
      inline def setKEY_BACKSPACE(value: BlueprintIcons16Id): Self = StObject.set(x, "KEY_BACKSPACE", value.asInstanceOf[js.Any])
      
      inline def setKEY_COMMAND(value: BlueprintIcons16Id): Self = StObject.set(x, "KEY_COMMAND", value.asInstanceOf[js.Any])
      
      inline def setKEY_CONTROL(value: BlueprintIcons16Id): Self = StObject.set(x, "KEY_CONTROL", value.asInstanceOf[js.Any])
      
      inline def setKEY_DELETE(value: BlueprintIcons16Id): Self = StObject.set(x, "KEY_DELETE", value.asInstanceOf[js.Any])
      
      inline def setKEY_ENTER(value: BlueprintIcons16Id): Self = StObject.set(x, "KEY_ENTER", value.asInstanceOf[js.Any])
      
      inline def setKEY_ESCAPE(value: BlueprintIcons16Id): Self = StObject.set(x, "KEY_ESCAPE", value.asInstanceOf[js.Any])
      
      inline def setKEY_OPTION(value: BlueprintIcons16Id): Self = StObject.set(x, "KEY_OPTION", value.asInstanceOf[js.Any])
      
      inline def setKEY_SHIFT(value: BlueprintIcons16Id): Self = StObject.set(x, "KEY_SHIFT", value.asInstanceOf[js.Any])
      
      inline def setKEY_TAB(value: BlueprintIcons16Id): Self = StObject.set(x, "KEY_TAB", value.asInstanceOf[js.Any])
      
      inline def setKNOWN_VEHICLE(value: BlueprintIcons16Id): Self = StObject.set(x, "KNOWN_VEHICLE", value.asInstanceOf[js.Any])
      
      inline def setKeyBackspace(value: BlueprintIcons16Id): Self = StObject.set(x, "KeyBackspace", value.asInstanceOf[js.Any])
      
      inline def setKeyCommand(value: BlueprintIcons16Id): Self = StObject.set(x, "KeyCommand", value.asInstanceOf[js.Any])
      
      inline def setKeyControl(value: BlueprintIcons16Id): Self = StObject.set(x, "KeyControl", value.asInstanceOf[js.Any])
      
      inline def setKeyDelete(value: BlueprintIcons16Id): Self = StObject.set(x, "KeyDelete", value.asInstanceOf[js.Any])
      
      inline def setKeyEnter(value: BlueprintIcons16Id): Self = StObject.set(x, "KeyEnter", value.asInstanceOf[js.Any])
      
      inline def setKeyEscape(value: BlueprintIcons16Id): Self = StObject.set(x, "KeyEscape", value.asInstanceOf[js.Any])
      
      inline def setKeyOption(value: BlueprintIcons16Id): Self = StObject.set(x, "KeyOption", value.asInstanceOf[js.Any])
      
      inline def setKeyShift(value: BlueprintIcons16Id): Self = StObject.set(x, "KeyShift", value.asInstanceOf[js.Any])
      
      inline def setKeyTab(value: BlueprintIcons16Id): Self = StObject.set(x, "KeyTab", value.asInstanceOf[js.Any])
      
      inline def setKnownVehicle(value: BlueprintIcons16Id): Self = StObject.set(x, "KnownVehicle", value.asInstanceOf[js.Any])
      
      inline def setLABEL(value: BlueprintIcons16Id): Self = StObject.set(x, "LABEL", value.asInstanceOf[js.Any])
      
      inline def setLAB_TEST(value: BlueprintIcons16Id): Self = StObject.set(x, "LAB_TEST", value.asInstanceOf[js.Any])
      
      inline def setLAYER(value: BlueprintIcons16Id): Self = StObject.set(x, "LAYER", value.asInstanceOf[js.Any])
      
      inline def setLAYERS(value: BlueprintIcons16Id): Self = StObject.set(x, "LAYERS", value.asInstanceOf[js.Any])
      
      inline def setLAYER_OUTLINE(value: BlueprintIcons16Id): Self = StObject.set(x, "LAYER_OUTLINE", value.asInstanceOf[js.Any])
      
      inline def setLAYOUT(value: BlueprintIcons16Id): Self = StObject.set(x, "LAYOUT", value.asInstanceOf[js.Any])
      
      inline def setLAYOUT_AUTO(value: BlueprintIcons16Id): Self = StObject.set(x, "LAYOUT_AUTO", value.asInstanceOf[js.Any])
      
      inline def setLAYOUT_BALLOON(value: BlueprintIcons16Id): Self = StObject.set(x, "LAYOUT_BALLOON", value.asInstanceOf[js.Any])
      
      inline def setLAYOUT_CIRCLE(value: BlueprintIcons16Id): Self = StObject.set(x, "LAYOUT_CIRCLE", value.asInstanceOf[js.Any])
      
      inline def setLAYOUT_GRID(value: BlueprintIcons16Id): Self = StObject.set(x, "LAYOUT_GRID", value.asInstanceOf[js.Any])
      
      inline def setLAYOUT_GROUP_BY(value: BlueprintIcons16Id): Self = StObject.set(x, "LAYOUT_GROUP_BY", value.asInstanceOf[js.Any])
      
      inline def setLAYOUT_HIERARCHY(value: BlueprintIcons16Id): Self = StObject.set(x, "LAYOUT_HIERARCHY", value.asInstanceOf[js.Any])
      
      inline def setLAYOUT_LINEAR(value: BlueprintIcons16Id): Self = StObject.set(x, "LAYOUT_LINEAR", value.asInstanceOf[js.Any])
      
      inline def setLAYOUT_SKEW_GRID(value: BlueprintIcons16Id): Self = StObject.set(x, "LAYOUT_SKEW_GRID", value.asInstanceOf[js.Any])
      
      inline def setLAYOUT_SORTED_CLUSTERS(value: BlueprintIcons16Id): Self = StObject.set(x, "LAYOUT_SORTED_CLUSTERS", value.asInstanceOf[js.Any])
      
      inline def setLEARNING(value: BlueprintIcons16Id): Self = StObject.set(x, "LEARNING", value.asInstanceOf[js.Any])
      
      inline def setLEFT_JOIN(value: BlueprintIcons16Id): Self = StObject.set(x, "LEFT_JOIN", value.asInstanceOf[js.Any])
      
      inline def setLESS_THAN(value: BlueprintIcons16Id): Self = StObject.set(x, "LESS_THAN", value.asInstanceOf[js.Any])
      
      inline def setLESS_THAN_OR_EQUAL_TO(value: BlueprintIcons16Id): Self = StObject.set(x, "LESS_THAN_OR_EQUAL_TO", value.asInstanceOf[js.Any])
      
      inline def setLIFESAVER(value: BlueprintIcons16Id): Self = StObject.set(x, "LIFESAVER", value.asInstanceOf[js.Any])
      
      inline def setLIGHTBULB(value: BlueprintIcons16Id): Self = StObject.set(x, "LIGHTBULB", value.asInstanceOf[js.Any])
      
      inline def setLIGHTNING(value: BlueprintIcons16Id): Self = StObject.set(x, "LIGHTNING", value.asInstanceOf[js.Any])
      
      inline def setLINK(value: BlueprintIcons16Id): Self = StObject.set(x, "LINK", value.asInstanceOf[js.Any])
      
      inline def setLIST(value: BlueprintIcons16Id): Self = StObject.set(x, "LIST", value.asInstanceOf[js.Any])
      
      inline def setLIST_COLUMNS(value: BlueprintIcons16Id): Self = StObject.set(x, "LIST_COLUMNS", value.asInstanceOf[js.Any])
      
      inline def setLIST_DETAIL_VIEW(value: BlueprintIcons16Id): Self = StObject.set(x, "LIST_DETAIL_VIEW", value.asInstanceOf[js.Any])
      
      inline def setLOCATE(value: BlueprintIcons16Id): Self = StObject.set(x, "LOCATE", value.asInstanceOf[js.Any])
      
      inline def setLOCK(value: BlueprintIcons16Id): Self = StObject.set(x, "LOCK", value.asInstanceOf[js.Any])
      
      inline def setLOG_IN(value: BlueprintIcons16Id): Self = StObject.set(x, "LOG_IN", value.asInstanceOf[js.Any])
      
      inline def setLOG_OUT(value: BlueprintIcons16Id): Self = StObject.set(x, "LOG_OUT", value.asInstanceOf[js.Any])
      
      inline def setLOW_VOLTAGE_POLE(value: BlueprintIcons16Id): Self = StObject.set(x, "LOW_VOLTAGE_POLE", value.asInstanceOf[js.Any])
      
      inline def setLabTest(value: BlueprintIcons16Id): Self = StObject.set(x, "LabTest", value.asInstanceOf[js.Any])
      
      inline def setLayerOutline(value: BlueprintIcons16Id): Self = StObject.set(x, "LayerOutline", value.asInstanceOf[js.Any])
      
      inline def setLayoutAuto(value: BlueprintIcons16Id): Self = StObject.set(x, "LayoutAuto", value.asInstanceOf[js.Any])
      
      inline def setLayoutBalloon(value: BlueprintIcons16Id): Self = StObject.set(x, "LayoutBalloon", value.asInstanceOf[js.Any])
      
      inline def setLayoutCircle(value: BlueprintIcons16Id): Self = StObject.set(x, "LayoutCircle", value.asInstanceOf[js.Any])
      
      inline def setLayoutGrid(value: BlueprintIcons16Id): Self = StObject.set(x, "LayoutGrid", value.asInstanceOf[js.Any])
      
      inline def setLayoutGroupBy(value: BlueprintIcons16Id): Self = StObject.set(x, "LayoutGroupBy", value.asInstanceOf[js.Any])
      
      inline def setLayoutHierarchy(value: BlueprintIcons16Id): Self = StObject.set(x, "LayoutHierarchy", value.asInstanceOf[js.Any])
      
      inline def setLayoutLinear(value: BlueprintIcons16Id): Self = StObject.set(x, "LayoutLinear", value.asInstanceOf[js.Any])
      
      inline def setLayoutSkewGrid(value: BlueprintIcons16Id): Self = StObject.set(x, "LayoutSkewGrid", value.asInstanceOf[js.Any])
      
      inline def setLayoutSortedClusters(value: BlueprintIcons16Id): Self = StObject.set(x, "LayoutSortedClusters", value.asInstanceOf[js.Any])
      
      inline def setLeftJoin(value: BlueprintIcons16Id): Self = StObject.set(x, "LeftJoin", value.asInstanceOf[js.Any])
      
      inline def setLessThan(value: BlueprintIcons16Id): Self = StObject.set(x, "LessThan", value.asInstanceOf[js.Any])
      
      inline def setLessThanOrEqualTo(value: BlueprintIcons16Id): Self = StObject.set(x, "LessThanOrEqualTo", value.asInstanceOf[js.Any])
      
      inline def setListColumns(value: BlueprintIcons16Id): Self = StObject.set(x, "ListColumns", value.asInstanceOf[js.Any])
      
      inline def setListDetailView(value: BlueprintIcons16Id): Self = StObject.set(x, "ListDetailView", value.asInstanceOf[js.Any])
      
      inline def setLogIn(value: BlueprintIcons16Id): Self = StObject.set(x, "LogIn", value.asInstanceOf[js.Any])
      
      inline def setLogOut(value: BlueprintIcons16Id): Self = StObject.set(x, "LogOut", value.asInstanceOf[js.Any])
      
      inline def setLowVoltagePole(value: BlueprintIcons16Id): Self = StObject.set(x, "LowVoltagePole", value.asInstanceOf[js.Any])
      
      inline def setMANUAL(value: BlueprintIcons16Id): Self = StObject.set(x, "MANUAL", value.asInstanceOf[js.Any])
      
      inline def setMANUALLY_ENTERED_DATA(value: BlueprintIcons16Id): Self = StObject.set(x, "MANUALLY_ENTERED_DATA", value.asInstanceOf[js.Any])
      
      inline def setMANY_TO_MANY(value: BlueprintIcons16Id): Self = StObject.set(x, "MANY_TO_MANY", value.asInstanceOf[js.Any])
      
      inline def setMANY_TO_ONE(value: BlueprintIcons16Id): Self = StObject.set(x, "MANY_TO_ONE", value.asInstanceOf[js.Any])
      
      inline def setMAP(value: BlueprintIcons16Id): Self = StObject.set(x, "MAP", value.asInstanceOf[js.Any])
      
      inline def setMAP_CREATE(value: BlueprintIcons16Id): Self = StObject.set(x, "MAP_CREATE", value.asInstanceOf[js.Any])
      
      inline def setMAP_MARKER(value: BlueprintIcons16Id): Self = StObject.set(x, "MAP_MARKER", value.asInstanceOf[js.Any])
      
      inline def setMAXIMIZE(value: BlueprintIcons16Id): Self = StObject.set(x, "MAXIMIZE", value.asInstanceOf[js.Any])
      
      inline def setMEDIA(value: BlueprintIcons16Id): Self = StObject.set(x, "MEDIA", value.asInstanceOf[js.Any])
      
      inline def setMENU(value: BlueprintIcons16Id): Self = StObject.set(x, "MENU", value.asInstanceOf[js.Any])
      
      inline def setMENU_CLOSED(value: BlueprintIcons16Id): Self = StObject.set(x, "MENU_CLOSED", value.asInstanceOf[js.Any])
      
      inline def setMENU_OPEN(value: BlueprintIcons16Id): Self = StObject.set(x, "MENU_OPEN", value.asInstanceOf[js.Any])
      
      inline def setMERGE_COLUMNS(value: BlueprintIcons16Id): Self = StObject.set(x, "MERGE_COLUMNS", value.asInstanceOf[js.Any])
      
      inline def setMERGE_LINKS(value: BlueprintIcons16Id): Self = StObject.set(x, "MERGE_LINKS", value.asInstanceOf[js.Any])
      
      inline def setMINIMIZE(value: BlueprintIcons16Id): Self = StObject.set(x, "MINIMIZE", value.asInstanceOf[js.Any])
      
      inline def setMINUS(value: BlueprintIcons16Id): Self = StObject.set(x, "MINUS", value.asInstanceOf[js.Any])
      
      inline def setMOBILE_PHONE(value: BlueprintIcons16Id): Self = StObject.set(x, "MOBILE_PHONE", value.asInstanceOf[js.Any])
      
      inline def setMOBILE_VIDEO(value: BlueprintIcons16Id): Self = StObject.set(x, "MOBILE_VIDEO", value.asInstanceOf[js.Any])
      
      inline def setMODAL(value: BlueprintIcons16Id): Self = StObject.set(x, "MODAL", value.asInstanceOf[js.Any])
      
      inline def setMODAL_FILLED(value: BlueprintIcons16Id): Self = StObject.set(x, "MODAL_FILLED", value.asInstanceOf[js.Any])
      
      inline def setMOON(value: BlueprintIcons16Id): Self = StObject.set(x, "MOON", value.asInstanceOf[js.Any])
      
      inline def setMORE(value: BlueprintIcons16Id): Self = StObject.set(x, "MORE", value.asInstanceOf[js.Any])
      
      inline def setMOUNTAIN(value: BlueprintIcons16Id): Self = StObject.set(x, "MOUNTAIN", value.asInstanceOf[js.Any])
      
      inline def setMOVE(value: BlueprintIcons16Id): Self = StObject.set(x, "MOVE", value.asInstanceOf[js.Any])
      
      inline def setMUGSHOT(value: BlueprintIcons16Id): Self = StObject.set(x, "MUGSHOT", value.asInstanceOf[js.Any])
      
      inline def setMULTI_SELECT(value: BlueprintIcons16Id): Self = StObject.set(x, "MULTI_SELECT", value.asInstanceOf[js.Any])
      
      inline def setMUSIC(value: BlueprintIcons16Id): Self = StObject.set(x, "MUSIC", value.asInstanceOf[js.Any])
      
      inline def setManuallyEnteredData(value: BlueprintIcons16Id): Self = StObject.set(x, "ManuallyEnteredData", value.asInstanceOf[js.Any])
      
      inline def setManyToMany(value: BlueprintIcons16Id): Self = StObject.set(x, "ManyToMany", value.asInstanceOf[js.Any])
      
      inline def setManyToOne(value: BlueprintIcons16Id): Self = StObject.set(x, "ManyToOne", value.asInstanceOf[js.Any])
      
      inline def setMapCreate(value: BlueprintIcons16Id): Self = StObject.set(x, "MapCreate", value.asInstanceOf[js.Any])
      
      inline def setMapMarker(value: BlueprintIcons16Id): Self = StObject.set(x, "MapMarker", value.asInstanceOf[js.Any])
      
      inline def setMenuClosed(value: BlueprintIcons16Id): Self = StObject.set(x, "MenuClosed", value.asInstanceOf[js.Any])
      
      inline def setMenuOpen(value: BlueprintIcons16Id): Self = StObject.set(x, "MenuOpen", value.asInstanceOf[js.Any])
      
      inline def setMergeColumns(value: BlueprintIcons16Id): Self = StObject.set(x, "MergeColumns", value.asInstanceOf[js.Any])
      
      inline def setMergeLinks(value: BlueprintIcons16Id): Self = StObject.set(x, "MergeLinks", value.asInstanceOf[js.Any])
      
      inline def setMobilePhone(value: BlueprintIcons16Id): Self = StObject.set(x, "MobilePhone", value.asInstanceOf[js.Any])
      
      inline def setMobileVideo(value: BlueprintIcons16Id): Self = StObject.set(x, "MobileVideo", value.asInstanceOf[js.Any])
      
      inline def setModalFilled(value: BlueprintIcons16Id): Self = StObject.set(x, "ModalFilled", value.asInstanceOf[js.Any])
      
      inline def setMultiSelect(value: BlueprintIcons16Id): Self = StObject.set(x, "MultiSelect", value.asInstanceOf[js.Any])
      
      inline def setNEST(value: BlueprintIcons16Id): Self = StObject.set(x, "NEST", value.asInstanceOf[js.Any])
      
      inline def setNEW_DRAWING(value: BlueprintIcons16Id): Self = StObject.set(x, "NEW_DRAWING", value.asInstanceOf[js.Any])
      
      inline def setNEW_GRID_ITEM(value: BlueprintIcons16Id): Self = StObject.set(x, "NEW_GRID_ITEM", value.asInstanceOf[js.Any])
      
      inline def setNEW_LAYER(value: BlueprintIcons16Id): Self = StObject.set(x, "NEW_LAYER", value.asInstanceOf[js.Any])
      
      inline def setNEW_LAYERS(value: BlueprintIcons16Id): Self = StObject.set(x, "NEW_LAYERS", value.asInstanceOf[js.Any])
      
      inline def setNEW_LINK(value: BlueprintIcons16Id): Self = StObject.set(x, "NEW_LINK", value.asInstanceOf[js.Any])
      
      inline def setNEW_OBJECT(value: BlueprintIcons16Id): Self = StObject.set(x, "NEW_OBJECT", value.asInstanceOf[js.Any])
      
      inline def setNEW_PERSON(value: BlueprintIcons16Id): Self = StObject.set(x, "NEW_PERSON", value.asInstanceOf[js.Any])
      
      inline def setNEW_PRESCRIPTION(value: BlueprintIcons16Id): Self = StObject.set(x, "NEW_PRESCRIPTION", value.asInstanceOf[js.Any])
      
      inline def setNEW_TEXT_BOX(value: BlueprintIcons16Id): Self = StObject.set(x, "NEW_TEXT_BOX", value.asInstanceOf[js.Any])
      
      inline def setNINJA(value: BlueprintIcons16Id): Self = StObject.set(x, "NINJA", value.asInstanceOf[js.Any])
      
      inline def setNOTIFICATIONS(value: BlueprintIcons16Id): Self = StObject.set(x, "NOTIFICATIONS", value.asInstanceOf[js.Any])
      
      inline def setNOTIFICATIONS_SNOOZE(value: BlueprintIcons16Id): Self = StObject.set(x, "NOTIFICATIONS_SNOOZE", value.asInstanceOf[js.Any])
      
      inline def setNOTIFICATIONS_UPDATED(value: BlueprintIcons16Id): Self = StObject.set(x, "NOTIFICATIONS_UPDATED", value.asInstanceOf[js.Any])
      
      inline def setNOT_EQUAL_TO(value: BlueprintIcons16Id): Self = StObject.set(x, "NOT_EQUAL_TO", value.asInstanceOf[js.Any])
      
      inline def setNUMBERED_LIST(value: BlueprintIcons16Id): Self = StObject.set(x, "NUMBERED_LIST", value.asInstanceOf[js.Any])
      
      inline def setNUMERICAL(value: BlueprintIcons16Id): Self = StObject.set(x, "NUMERICAL", value.asInstanceOf[js.Any])
      
      inline def setNewDrawing(value: BlueprintIcons16Id): Self = StObject.set(x, "NewDrawing", value.asInstanceOf[js.Any])
      
      inline def setNewGridItem(value: BlueprintIcons16Id): Self = StObject.set(x, "NewGridItem", value.asInstanceOf[js.Any])
      
      inline def setNewLayer(value: BlueprintIcons16Id): Self = StObject.set(x, "NewLayer", value.asInstanceOf[js.Any])
      
      inline def setNewLayers(value: BlueprintIcons16Id): Self = StObject.set(x, "NewLayers", value.asInstanceOf[js.Any])
      
      inline def setNewLink(value: BlueprintIcons16Id): Self = StObject.set(x, "NewLink", value.asInstanceOf[js.Any])
      
      inline def setNewObject(value: BlueprintIcons16Id): Self = StObject.set(x, "NewObject", value.asInstanceOf[js.Any])
      
      inline def setNewPerson(value: BlueprintIcons16Id): Self = StObject.set(x, "NewPerson", value.asInstanceOf[js.Any])
      
      inline def setNewPrescription(value: BlueprintIcons16Id): Self = StObject.set(x, "NewPrescription", value.asInstanceOf[js.Any])
      
      inline def setNewTextBox(value: BlueprintIcons16Id): Self = StObject.set(x, "NewTextBox", value.asInstanceOf[js.Any])
      
      inline def setNotEqualTo(value: BlueprintIcons16Id): Self = StObject.set(x, "NotEqualTo", value.asInstanceOf[js.Any])
      
      inline def setNotificationsSnooze(value: BlueprintIcons16Id): Self = StObject.set(x, "NotificationsSnooze", value.asInstanceOf[js.Any])
      
      inline def setNotificationsUpdated(value: BlueprintIcons16Id): Self = StObject.set(x, "NotificationsUpdated", value.asInstanceOf[js.Any])
      
      inline def setNumberedList(value: BlueprintIcons16Id): Self = StObject.set(x, "NumberedList", value.asInstanceOf[js.Any])
      
      inline def setOFFICE(value: BlueprintIcons16Id): Self = StObject.set(x, "OFFICE", value.asInstanceOf[js.Any])
      
      inline def setOFFLINE(value: BlueprintIcons16Id): Self = StObject.set(x, "OFFLINE", value.asInstanceOf[js.Any])
      
      inline def setOIL_FIELD(value: BlueprintIcons16Id): Self = StObject.set(x, "OIL_FIELD", value.asInstanceOf[js.Any])
      
      inline def setONE_COLUMN(value: BlueprintIcons16Id): Self = StObject.set(x, "ONE_COLUMN", value.asInstanceOf[js.Any])
      
      inline def setONE_TO_MANY(value: BlueprintIcons16Id): Self = StObject.set(x, "ONE_TO_MANY", value.asInstanceOf[js.Any])
      
      inline def setONE_TO_ONE(value: BlueprintIcons16Id): Self = StObject.set(x, "ONE_TO_ONE", value.asInstanceOf[js.Any])
      
      inline def setOPEN_APPLICATION(value: BlueprintIcons16Id): Self = StObject.set(x, "OPEN_APPLICATION", value.asInstanceOf[js.Any])
      
      inline def setOUTDATED(value: BlueprintIcons16Id): Self = StObject.set(x, "OUTDATED", value.asInstanceOf[js.Any])
      
      inline def setOilField(value: BlueprintIcons16Id): Self = StObject.set(x, "OilField", value.asInstanceOf[js.Any])
      
      inline def setOneColumn(value: BlueprintIcons16Id): Self = StObject.set(x, "OneColumn", value.asInstanceOf[js.Any])
      
      inline def setOneToMany(value: BlueprintIcons16Id): Self = StObject.set(x, "OneToMany", value.asInstanceOf[js.Any])
      
      inline def setOneToOne(value: BlueprintIcons16Id): Self = StObject.set(x, "OneToOne", value.asInstanceOf[js.Any])
      
      inline def setOpenApplication(value: BlueprintIcons16Id): Self = StObject.set(x, "OpenApplication", value.asInstanceOf[js.Any])
      
      inline def setPAGE_LAYOUT(value: BlueprintIcons16Id): Self = StObject.set(x, "PAGE_LAYOUT", value.asInstanceOf[js.Any])
      
      inline def setPANEL_STATS(value: BlueprintIcons16Id): Self = StObject.set(x, "PANEL_STATS", value.asInstanceOf[js.Any])
      
      inline def setPANEL_TABLE(value: BlueprintIcons16Id): Self = StObject.set(x, "PANEL_TABLE", value.asInstanceOf[js.Any])
      
      inline def setPAPERCLIP(value: BlueprintIcons16Id): Self = StObject.set(x, "PAPERCLIP", value.asInstanceOf[js.Any])
      
      inline def setPARAGRAPH(value: BlueprintIcons16Id): Self = StObject.set(x, "PARAGRAPH", value.asInstanceOf[js.Any])
      
      inline def setPATH(value: BlueprintIcons16Id): Self = StObject.set(x, "PATH", value.asInstanceOf[js.Any])
      
      inline def setPATH_SEARCH(value: BlueprintIcons16Id): Self = StObject.set(x, "PATH_SEARCH", value.asInstanceOf[js.Any])
      
      inline def setPAUSE(value: BlueprintIcons16Id): Self = StObject.set(x, "PAUSE", value.asInstanceOf[js.Any])
      
      inline def setPEOPLE(value: BlueprintIcons16Id): Self = StObject.set(x, "PEOPLE", value.asInstanceOf[js.Any])
      
      inline def setPERCENTAGE(value: BlueprintIcons16Id): Self = StObject.set(x, "PERCENTAGE", value.asInstanceOf[js.Any])
      
      inline def setPERSON(value: BlueprintIcons16Id): Self = StObject.set(x, "PERSON", value.asInstanceOf[js.Any])
      
      inline def setPHONE(value: BlueprintIcons16Id): Self = StObject.set(x, "PHONE", value.asInstanceOf[js.Any])
      
      inline def setPIE_CHART(value: BlueprintIcons16Id): Self = StObject.set(x, "PIE_CHART", value.asInstanceOf[js.Any])
      
      inline def setPIN(value: BlueprintIcons16Id): Self = StObject.set(x, "PIN", value.asInstanceOf[js.Any])
      
      inline def setPIVOT(value: BlueprintIcons16Id): Self = StObject.set(x, "PIVOT", value.asInstanceOf[js.Any])
      
      inline def setPIVOT_TABLE(value: BlueprintIcons16Id): Self = StObject.set(x, "PIVOT_TABLE", value.asInstanceOf[js.Any])
      
      inline def setPLAY(value: BlueprintIcons16Id): Self = StObject.set(x, "PLAY", value.asInstanceOf[js.Any])
      
      inline def setPLAYBOOK(value: BlueprintIcons16Id): Self = StObject.set(x, "PLAYBOOK", value.asInstanceOf[js.Any])
      
      inline def setPLUS(value: BlueprintIcons16Id): Self = StObject.set(x, "PLUS", value.asInstanceOf[js.Any])
      
      inline def setPOLYGON_FILTER(value: BlueprintIcons16Id): Self = StObject.set(x, "POLYGON_FILTER", value.asInstanceOf[js.Any])
      
      inline def setPOWER(value: BlueprintIcons16Id): Self = StObject.set(x, "POWER", value.asInstanceOf[js.Any])
      
      inline def setPREDICTIVE_ANALYSIS(value: BlueprintIcons16Id): Self = StObject.set(x, "PREDICTIVE_ANALYSIS", value.asInstanceOf[js.Any])
      
      inline def setPRESCRIPTION(value: BlueprintIcons16Id): Self = StObject.set(x, "PRESCRIPTION", value.asInstanceOf[js.Any])
      
      inline def setPRESENTATION(value: BlueprintIcons16Id): Self = StObject.set(x, "PRESENTATION", value.asInstanceOf[js.Any])
      
      inline def setPRINT(value: BlueprintIcons16Id): Self = StObject.set(x, "PRINT", value.asInstanceOf[js.Any])
      
      inline def setPROJECTS(value: BlueprintIcons16Id): Self = StObject.set(x, "PROJECTS", value.asInstanceOf[js.Any])
      
      inline def setPROPERTIES(value: BlueprintIcons16Id): Self = StObject.set(x, "PROPERTIES", value.asInstanceOf[js.Any])
      
      inline def setPROPERTY(value: BlueprintIcons16Id): Self = StObject.set(x, "PROPERTY", value.asInstanceOf[js.Any])
      
      inline def setPUBLISH_FUNCTION(value: BlueprintIcons16Id): Self = StObject.set(x, "PUBLISH_FUNCTION", value.asInstanceOf[js.Any])
      
      inline def setPULSE(value: BlueprintIcons16Id): Self = StObject.set(x, "PULSE", value.asInstanceOf[js.Any])
      
      inline def setPageLayout(value: BlueprintIcons16Id): Self = StObject.set(x, "PageLayout", value.asInstanceOf[js.Any])
      
      inline def setPanelStats(value: BlueprintIcons16Id): Self = StObject.set(x, "PanelStats", value.asInstanceOf[js.Any])
      
      inline def setPanelTable(value: BlueprintIcons16Id): Self = StObject.set(x, "PanelTable", value.asInstanceOf[js.Any])
      
      inline def setPathSearch(value: BlueprintIcons16Id): Self = StObject.set(x, "PathSearch", value.asInstanceOf[js.Any])
      
      inline def setPieChart(value: BlueprintIcons16Id): Self = StObject.set(x, "PieChart", value.asInstanceOf[js.Any])
      
      inline def setPivotTable(value: BlueprintIcons16Id): Self = StObject.set(x, "PivotTable", value.asInstanceOf[js.Any])
      
      inline def setPolygonFilter(value: BlueprintIcons16Id): Self = StObject.set(x, "PolygonFilter", value.asInstanceOf[js.Any])
      
      inline def setPredictiveAnalysis(value: BlueprintIcons16Id): Self = StObject.set(x, "PredictiveAnalysis", value.asInstanceOf[js.Any])
      
      inline def setPublishFunction(value: BlueprintIcons16Id): Self = StObject.set(x, "PublishFunction", value.asInstanceOf[js.Any])
      
      inline def setRAIN(value: BlueprintIcons16Id): Self = StObject.set(x, "RAIN", value.asInstanceOf[js.Any])
      
      inline def setRANDOM(value: BlueprintIcons16Id): Self = StObject.set(x, "RANDOM", value.asInstanceOf[js.Any])
      
      inline def setRECORD(value: BlueprintIcons16Id): Self = StObject.set(x, "RECORD", value.asInstanceOf[js.Any])
      
      inline def setRECTANGLE(value: BlueprintIcons16Id): Self = StObject.set(x, "RECTANGLE", value.asInstanceOf[js.Any])
      
      inline def setRECT_HEIGHT(value: BlueprintIcons16Id): Self = StObject.set(x, "RECT_HEIGHT", value.asInstanceOf[js.Any])
      
      inline def setRECT_WIDTH(value: BlueprintIcons16Id): Self = StObject.set(x, "RECT_WIDTH", value.asInstanceOf[js.Any])
      
      inline def setREDO(value: BlueprintIcons16Id): Self = StObject.set(x, "REDO", value.asInstanceOf[js.Any])
      
      inline def setREFRESH(value: BlueprintIcons16Id): Self = StObject.set(x, "REFRESH", value.asInstanceOf[js.Any])
      
      inline def setREGEX(value: BlueprintIcons16Id): Self = StObject.set(x, "REGEX", value.asInstanceOf[js.Any])
      
      inline def setREGRESSION_CHART(value: BlueprintIcons16Id): Self = StObject.set(x, "REGRESSION_CHART", value.asInstanceOf[js.Any])
      
      inline def setREMOVE(value: BlueprintIcons16Id): Self = StObject.set(x, "REMOVE", value.asInstanceOf[js.Any])
      
      inline def setREMOVE_COLUMN(value: BlueprintIcons16Id): Self = StObject.set(x, "REMOVE_COLUMN", value.asInstanceOf[js.Any])
      
      inline def setREMOVE_COLUMN_LEFT(value: BlueprintIcons16Id): Self = StObject.set(x, "REMOVE_COLUMN_LEFT", value.asInstanceOf[js.Any])
      
      inline def setREMOVE_COLUMN_RIGHT(value: BlueprintIcons16Id): Self = StObject.set(x, "REMOVE_COLUMN_RIGHT", value.asInstanceOf[js.Any])
      
      inline def setREMOVE_ROW_BOTTOM(value: BlueprintIcons16Id): Self = StObject.set(x, "REMOVE_ROW_BOTTOM", value.asInstanceOf[js.Any])
      
      inline def setREMOVE_ROW_TOP(value: BlueprintIcons16Id): Self = StObject.set(x, "REMOVE_ROW_TOP", value.asInstanceOf[js.Any])
      
      inline def setREPEAT(value: BlueprintIcons16Id): Self = StObject.set(x, "REPEAT", value.asInstanceOf[js.Any])
      
      inline def setRESET(value: BlueprintIcons16Id): Self = StObject.set(x, "RESET", value.asInstanceOf[js.Any])
      
      inline def setRESOLVE(value: BlueprintIcons16Id): Self = StObject.set(x, "RESOLVE", value.asInstanceOf[js.Any])
      
      inline def setRIG(value: BlueprintIcons16Id): Self = StObject.set(x, "RIG", value.asInstanceOf[js.Any])
      
      inline def setRIGHT_JOIN(value: BlueprintIcons16Id): Self = StObject.set(x, "RIGHT_JOIN", value.asInstanceOf[js.Any])
      
      inline def setRING(value: BlueprintIcons16Id): Self = StObject.set(x, "RING", value.asInstanceOf[js.Any])
      
      inline def setROCKET(value: BlueprintIcons16Id): Self = StObject.set(x, "ROCKET", value.asInstanceOf[js.Any])
      
      inline def setROCKET_SLANT(value: BlueprintIcons16Id): Self = StObject.set(x, "ROCKET_SLANT", value.asInstanceOf[js.Any])
      
      inline def setROTATE_DOCUMENT(value: BlueprintIcons16Id): Self = StObject.set(x, "ROTATE_DOCUMENT", value.asInstanceOf[js.Any])
      
      inline def setROTATE_PAGE(value: BlueprintIcons16Id): Self = StObject.set(x, "ROTATE_PAGE", value.asInstanceOf[js.Any])
      
      inline def setROUTE(value: BlueprintIcons16Id): Self = StObject.set(x, "ROUTE", value.asInstanceOf[js.Any])
      
      inline def setRectHeight(value: BlueprintIcons16Id): Self = StObject.set(x, "RectHeight", value.asInstanceOf[js.Any])
      
      inline def setRectWidth(value: BlueprintIcons16Id): Self = StObject.set(x, "RectWidth", value.asInstanceOf[js.Any])
      
      inline def setRegressionChart(value: BlueprintIcons16Id): Self = StObject.set(x, "RegressionChart", value.asInstanceOf[js.Any])
      
      inline def setRemoveColumn(value: BlueprintIcons16Id): Self = StObject.set(x, "RemoveColumn", value.asInstanceOf[js.Any])
      
      inline def setRemoveColumnLeft(value: BlueprintIcons16Id): Self = StObject.set(x, "RemoveColumnLeft", value.asInstanceOf[js.Any])
      
      inline def setRemoveColumnRight(value: BlueprintIcons16Id): Self = StObject.set(x, "RemoveColumnRight", value.asInstanceOf[js.Any])
      
      inline def setRemoveRowBottom(value: BlueprintIcons16Id): Self = StObject.set(x, "RemoveRowBottom", value.asInstanceOf[js.Any])
      
      inline def setRemoveRowTop(value: BlueprintIcons16Id): Self = StObject.set(x, "RemoveRowTop", value.asInstanceOf[js.Any])
      
      inline def setRightJoin(value: BlueprintIcons16Id): Self = StObject.set(x, "RightJoin", value.asInstanceOf[js.Any])
      
      inline def setRocketSlant(value: BlueprintIcons16Id): Self = StObject.set(x, "RocketSlant", value.asInstanceOf[js.Any])
      
      inline def setRotateDocument(value: BlueprintIcons16Id): Self = StObject.set(x, "RotateDocument", value.asInstanceOf[js.Any])
      
      inline def setRotatePage(value: BlueprintIcons16Id): Self = StObject.set(x, "RotatePage", value.asInstanceOf[js.Any])
      
      inline def setSATELLITE(value: BlueprintIcons16Id): Self = StObject.set(x, "SATELLITE", value.asInstanceOf[js.Any])
      
      inline def setSAVED(value: BlueprintIcons16Id): Self = StObject.set(x, "SAVED", value.asInstanceOf[js.Any])
      
      inline def setSCATTER_PLOT(value: BlueprintIcons16Id): Self = StObject.set(x, "SCATTER_PLOT", value.asInstanceOf[js.Any])
      
      inline def setSEARCH(value: BlueprintIcons16Id): Self = StObject.set(x, "SEARCH", value.asInstanceOf[js.Any])
      
      inline def setSEARCH_AROUND(value: BlueprintIcons16Id): Self = StObject.set(x, "SEARCH_AROUND", value.asInstanceOf[js.Any])
      
      inline def setSEARCH_TEMPLATE(value: BlueprintIcons16Id): Self = StObject.set(x, "SEARCH_TEMPLATE", value.asInstanceOf[js.Any])
      
      inline def setSEARCH_TEXT(value: BlueprintIcons16Id): Self = StObject.set(x, "SEARCH_TEXT", value.asInstanceOf[js.Any])
      
      inline def setSEGMENTED_CONTROL(value: BlueprintIcons16Id): Self = StObject.set(x, "SEGMENTED_CONTROL", value.asInstanceOf[js.Any])
      
      inline def setSELECT(value: BlueprintIcons16Id): Self = StObject.set(x, "SELECT", value.asInstanceOf[js.Any])
      
      inline def setSELECTION(value: BlueprintIcons16Id): Self = StObject.set(x, "SELECTION", value.asInstanceOf[js.Any])
      
      inline def setSEND_MESSAGE(value: BlueprintIcons16Id): Self = StObject.set(x, "SEND_MESSAGE", value.asInstanceOf[js.Any])
      
      inline def setSEND_TO(value: BlueprintIcons16Id): Self = StObject.set(x, "SEND_TO", value.asInstanceOf[js.Any])
      
      inline def setSEND_TO_GRAPH(value: BlueprintIcons16Id): Self = StObject.set(x, "SEND_TO_GRAPH", value.asInstanceOf[js.Any])
      
      inline def setSEND_TO_MAP(value: BlueprintIcons16Id): Self = StObject.set(x, "SEND_TO_MAP", value.asInstanceOf[js.Any])
      
      inline def setSERIES_ADD(value: BlueprintIcons16Id): Self = StObject.set(x, "SERIES_ADD", value.asInstanceOf[js.Any])
      
      inline def setSERIES_CONFIGURATION(value: BlueprintIcons16Id): Self = StObject.set(x, "SERIES_CONFIGURATION", value.asInstanceOf[js.Any])
      
      inline def setSERIES_DERIVED(value: BlueprintIcons16Id): Self = StObject.set(x, "SERIES_DERIVED", value.asInstanceOf[js.Any])
      
      inline def setSERIES_FILTERED(value: BlueprintIcons16Id): Self = StObject.set(x, "SERIES_FILTERED", value.asInstanceOf[js.Any])
      
      inline def setSERIES_SEARCH(value: BlueprintIcons16Id): Self = StObject.set(x, "SERIES_SEARCH", value.asInstanceOf[js.Any])
      
      inline def setSETTINGS(value: BlueprintIcons16Id): Self = StObject.set(x, "SETTINGS", value.asInstanceOf[js.Any])
      
      inline def setSHAPES(value: BlueprintIcons16Id): Self = StObject.set(x, "SHAPES", value.asInstanceOf[js.Any])
      
      inline def setSHARE(value: BlueprintIcons16Id): Self = StObject.set(x, "SHARE", value.asInstanceOf[js.Any])
      
      inline def setSHARED_FILTER(value: BlueprintIcons16Id): Self = StObject.set(x, "SHARED_FILTER", value.asInstanceOf[js.Any])
      
      inline def setSHIELD(value: BlueprintIcons16Id): Self = StObject.set(x, "SHIELD", value.asInstanceOf[js.Any])
      
      inline def setSHIP(value: BlueprintIcons16Id): Self = StObject.set(x, "SHIP", value.asInstanceOf[js.Any])
      
      inline def setSHOP(value: BlueprintIcons16Id): Self = StObject.set(x, "SHOP", value.asInstanceOf[js.Any])
      
      inline def setSHOPPING_CART(value: BlueprintIcons16Id): Self = StObject.set(x, "SHOPPING_CART", value.asInstanceOf[js.Any])
      
      inline def setSIGNAL_SEARCH(value: BlueprintIcons16Id): Self = StObject.set(x, "SIGNAL_SEARCH", value.asInstanceOf[js.Any])
      
      inline def setSIM_CARD(value: BlueprintIcons16Id): Self = StObject.set(x, "SIM_CARD", value.asInstanceOf[js.Any])
      
      inline def setSLASH(value: BlueprintIcons16Id): Self = StObject.set(x, "SLASH", value.asInstanceOf[js.Any])
      
      inline def setSMALL_CROSS(value: BlueprintIcons16Id): Self = StObject.set(x, "SMALL_CROSS", value.asInstanceOf[js.Any])
      
      inline def setSMALL_INFO_SIGN(value: BlueprintIcons16Id): Self = StObject.set(x, "SMALL_INFO_SIGN", value.asInstanceOf[js.Any])
      
      inline def setSMALL_MINUS(value: BlueprintIcons16Id): Self = StObject.set(x, "SMALL_MINUS", value.asInstanceOf[js.Any])
      
      inline def setSMALL_PLUS(value: BlueprintIcons16Id): Self = StObject.set(x, "SMALL_PLUS", value.asInstanceOf[js.Any])
      
      inline def setSMALL_SQUARE(value: BlueprintIcons16Id): Self = StObject.set(x, "SMALL_SQUARE", value.asInstanceOf[js.Any])
      
      inline def setSMALL_TICK(value: BlueprintIcons16Id): Self = StObject.set(x, "SMALL_TICK", value.asInstanceOf[js.Any])
      
      inline def setSNOWFLAKE(value: BlueprintIcons16Id): Self = StObject.set(x, "SNOWFLAKE", value.asInstanceOf[js.Any])
      
      inline def setSOCIAL_MEDIA(value: BlueprintIcons16Id): Self = StObject.set(x, "SOCIAL_MEDIA", value.asInstanceOf[js.Any])
      
      inline def setSORT(value: BlueprintIcons16Id): Self = StObject.set(x, "SORT", value.asInstanceOf[js.Any])
      
      inline def setSORT_ALPHABETICAL(value: BlueprintIcons16Id): Self = StObject.set(x, "SORT_ALPHABETICAL", value.asInstanceOf[js.Any])
      
      inline def setSORT_ALPHABETICAL_DESC(value: BlueprintIcons16Id): Self = StObject.set(x, "SORT_ALPHABETICAL_DESC", value.asInstanceOf[js.Any])
      
      inline def setSORT_ASC(value: BlueprintIcons16Id): Self = StObject.set(x, "SORT_ASC", value.asInstanceOf[js.Any])
      
      inline def setSORT_DESC(value: BlueprintIcons16Id): Self = StObject.set(x, "SORT_DESC", value.asInstanceOf[js.Any])
      
      inline def setSORT_NUMERICAL(value: BlueprintIcons16Id): Self = StObject.set(x, "SORT_NUMERICAL", value.asInstanceOf[js.Any])
      
      inline def setSORT_NUMERICAL_DESC(value: BlueprintIcons16Id): Self = StObject.set(x, "SORT_NUMERICAL_DESC", value.asInstanceOf[js.Any])
      
      inline def setSPLIT_COLUMNS(value: BlueprintIcons16Id): Self = StObject.set(x, "SPLIT_COLUMNS", value.asInstanceOf[js.Any])
      
      inline def setSQUARE(value: BlueprintIcons16Id): Self = StObject.set(x, "SQUARE", value.asInstanceOf[js.Any])
      
      inline def setSTACKED_CHART(value: BlueprintIcons16Id): Self = StObject.set(x, "STACKED_CHART", value.asInstanceOf[js.Any])
      
      inline def setSTADIUM_GEOMETRY(value: BlueprintIcons16Id): Self = StObject.set(x, "STADIUM_GEOMETRY", value.asInstanceOf[js.Any])
      
      inline def setSTAR(value: BlueprintIcons16Id): Self = StObject.set(x, "STAR", value.asInstanceOf[js.Any])
      
      inline def setSTAR_EMPTY(value: BlueprintIcons16Id): Self = StObject.set(x, "STAR_EMPTY", value.asInstanceOf[js.Any])
      
      inline def setSTEP_BACKWARD(value: BlueprintIcons16Id): Self = StObject.set(x, "STEP_BACKWARD", value.asInstanceOf[js.Any])
      
      inline def setSTEP_CHART(value: BlueprintIcons16Id): Self = StObject.set(x, "STEP_CHART", value.asInstanceOf[js.Any])
      
      inline def setSTEP_FORWARD(value: BlueprintIcons16Id): Self = StObject.set(x, "STEP_FORWARD", value.asInstanceOf[js.Any])
      
      inline def setSTOP(value: BlueprintIcons16Id): Self = StObject.set(x, "STOP", value.asInstanceOf[js.Any])
      
      inline def setSTOPWATCH(value: BlueprintIcons16Id): Self = StObject.set(x, "STOPWATCH", value.asInstanceOf[js.Any])
      
      inline def setSTRIKETHROUGH(value: BlueprintIcons16Id): Self = StObject.set(x, "STRIKETHROUGH", value.asInstanceOf[js.Any])
      
      inline def setSTYLE(value: BlueprintIcons16Id): Self = StObject.set(x, "STYLE", value.asInstanceOf[js.Any])
      
      inline def setSWAP_HORIZONTAL(value: BlueprintIcons16Id): Self = StObject.set(x, "SWAP_HORIZONTAL", value.asInstanceOf[js.Any])
      
      inline def setSWAP_VERTICAL(value: BlueprintIcons16Id): Self = StObject.set(x, "SWAP_VERTICAL", value.asInstanceOf[js.Any])
      
      inline def setSWITCH(value: BlueprintIcons16Id): Self = StObject.set(x, "SWITCH", value.asInstanceOf[js.Any])
      
      inline def setSYMBOL_CIRCLE(value: BlueprintIcons16Id): Self = StObject.set(x, "SYMBOL_CIRCLE", value.asInstanceOf[js.Any])
      
      inline def setSYMBOL_CROSS(value: BlueprintIcons16Id): Self = StObject.set(x, "SYMBOL_CROSS", value.asInstanceOf[js.Any])
      
      inline def setSYMBOL_DIAMOND(value: BlueprintIcons16Id): Self = StObject.set(x, "SYMBOL_DIAMOND", value.asInstanceOf[js.Any])
      
      inline def setSYMBOL_RECTANGLE(value: BlueprintIcons16Id): Self = StObject.set(x, "SYMBOL_RECTANGLE", value.asInstanceOf[js.Any])
      
      inline def setSYMBOL_SQUARE(value: BlueprintIcons16Id): Self = StObject.set(x, "SYMBOL_SQUARE", value.asInstanceOf[js.Any])
      
      inline def setSYMBOL_TRIANGLE_DOWN(value: BlueprintIcons16Id): Self = StObject.set(x, "SYMBOL_TRIANGLE_DOWN", value.asInstanceOf[js.Any])
      
      inline def setSYMBOL_TRIANGLE_UP(value: BlueprintIcons16Id): Self = StObject.set(x, "SYMBOL_TRIANGLE_UP", value.asInstanceOf[js.Any])
      
      inline def setSYRINGE(value: BlueprintIcons16Id): Self = StObject.set(x, "SYRINGE", value.asInstanceOf[js.Any])
      
      inline def setScatterPlot(value: BlueprintIcons16Id): Self = StObject.set(x, "ScatterPlot", value.asInstanceOf[js.Any])
      
      inline def setSearchAround(value: BlueprintIcons16Id): Self = StObject.set(x, "SearchAround", value.asInstanceOf[js.Any])
      
      inline def setSearchTemplate(value: BlueprintIcons16Id): Self = StObject.set(x, "SearchTemplate", value.asInstanceOf[js.Any])
      
      inline def setSearchText(value: BlueprintIcons16Id): Self = StObject.set(x, "SearchText", value.asInstanceOf[js.Any])
      
      inline def setSegmentedControl(value: BlueprintIcons16Id): Self = StObject.set(x, "SegmentedControl", value.asInstanceOf[js.Any])
      
      inline def setSendMessage(value: BlueprintIcons16Id): Self = StObject.set(x, "SendMessage", value.asInstanceOf[js.Any])
      
      inline def setSendTo(value: BlueprintIcons16Id): Self = StObject.set(x, "SendTo", value.asInstanceOf[js.Any])
      
      inline def setSendToGraph(value: BlueprintIcons16Id): Self = StObject.set(x, "SendToGraph", value.asInstanceOf[js.Any])
      
      inline def setSendToMap(value: BlueprintIcons16Id): Self = StObject.set(x, "SendToMap", value.asInstanceOf[js.Any])
      
      inline def setSeriesAdd(value: BlueprintIcons16Id): Self = StObject.set(x, "SeriesAdd", value.asInstanceOf[js.Any])
      
      inline def setSeriesConfiguration(value: BlueprintIcons16Id): Self = StObject.set(x, "SeriesConfiguration", value.asInstanceOf[js.Any])
      
      inline def setSeriesDerived(value: BlueprintIcons16Id): Self = StObject.set(x, "SeriesDerived", value.asInstanceOf[js.Any])
      
      inline def setSeriesFiltered(value: BlueprintIcons16Id): Self = StObject.set(x, "SeriesFiltered", value.asInstanceOf[js.Any])
      
      inline def setSeriesSearch(value: BlueprintIcons16Id): Self = StObject.set(x, "SeriesSearch", value.asInstanceOf[js.Any])
      
      inline def setSharedFilter(value: BlueprintIcons16Id): Self = StObject.set(x, "SharedFilter", value.asInstanceOf[js.Any])
      
      inline def setShoppingCart(value: BlueprintIcons16Id): Self = StObject.set(x, "ShoppingCart", value.asInstanceOf[js.Any])
      
      inline def setSignalSearch(value: BlueprintIcons16Id): Self = StObject.set(x, "SignalSearch", value.asInstanceOf[js.Any])
      
      inline def setSimCard(value: BlueprintIcons16Id): Self = StObject.set(x, "SimCard", value.asInstanceOf[js.Any])
      
      inline def setSmallCross(value: BlueprintIcons16Id): Self = StObject.set(x, "SmallCross", value.asInstanceOf[js.Any])
      
      inline def setSmallInfoSign(value: BlueprintIcons16Id): Self = StObject.set(x, "SmallInfoSign", value.asInstanceOf[js.Any])
      
      inline def setSmallMinus(value: BlueprintIcons16Id): Self = StObject.set(x, "SmallMinus", value.asInstanceOf[js.Any])
      
      inline def setSmallPlus(value: BlueprintIcons16Id): Self = StObject.set(x, "SmallPlus", value.asInstanceOf[js.Any])
      
      inline def setSmallSquare(value: BlueprintIcons16Id): Self = StObject.set(x, "SmallSquare", value.asInstanceOf[js.Any])
      
      inline def setSmallTick(value: BlueprintIcons16Id): Self = StObject.set(x, "SmallTick", value.asInstanceOf[js.Any])
      
      inline def setSocialMedia(value: BlueprintIcons16Id): Self = StObject.set(x, "SocialMedia", value.asInstanceOf[js.Any])
      
      inline def setSortAlphabetical(value: BlueprintIcons16Id): Self = StObject.set(x, "SortAlphabetical", value.asInstanceOf[js.Any])
      
      inline def setSortAlphabeticalDesc(value: BlueprintIcons16Id): Self = StObject.set(x, "SortAlphabeticalDesc", value.asInstanceOf[js.Any])
      
      inline def setSortAsc(value: BlueprintIcons16Id): Self = StObject.set(x, "SortAsc", value.asInstanceOf[js.Any])
      
      inline def setSortDesc(value: BlueprintIcons16Id): Self = StObject.set(x, "SortDesc", value.asInstanceOf[js.Any])
      
      inline def setSortNumerical(value: BlueprintIcons16Id): Self = StObject.set(x, "SortNumerical", value.asInstanceOf[js.Any])
      
      inline def setSortNumericalDesc(value: BlueprintIcons16Id): Self = StObject.set(x, "SortNumericalDesc", value.asInstanceOf[js.Any])
      
      inline def setSplitColumns(value: BlueprintIcons16Id): Self = StObject.set(x, "SplitColumns", value.asInstanceOf[js.Any])
      
      inline def setStackedChart(value: BlueprintIcons16Id): Self = StObject.set(x, "StackedChart", value.asInstanceOf[js.Any])
      
      inline def setStadiumGeometry(value: BlueprintIcons16Id): Self = StObject.set(x, "StadiumGeometry", value.asInstanceOf[js.Any])
      
      inline def setStarEmpty(value: BlueprintIcons16Id): Self = StObject.set(x, "StarEmpty", value.asInstanceOf[js.Any])
      
      inline def setStepBackward(value: BlueprintIcons16Id): Self = StObject.set(x, "StepBackward", value.asInstanceOf[js.Any])
      
      inline def setStepChart(value: BlueprintIcons16Id): Self = StObject.set(x, "StepChart", value.asInstanceOf[js.Any])
      
      inline def setStepForward(value: BlueprintIcons16Id): Self = StObject.set(x, "StepForward", value.asInstanceOf[js.Any])
      
      inline def setSwapHorizontal(value: BlueprintIcons16Id): Self = StObject.set(x, "SwapHorizontal", value.asInstanceOf[js.Any])
      
      inline def setSwapVertical(value: BlueprintIcons16Id): Self = StObject.set(x, "SwapVertical", value.asInstanceOf[js.Any])
      
      inline def setSymbolCircle(value: BlueprintIcons16Id): Self = StObject.set(x, "SymbolCircle", value.asInstanceOf[js.Any])
      
      inline def setSymbolCross(value: BlueprintIcons16Id): Self = StObject.set(x, "SymbolCross", value.asInstanceOf[js.Any])
      
      inline def setSymbolDiamond(value: BlueprintIcons16Id): Self = StObject.set(x, "SymbolDiamond", value.asInstanceOf[js.Any])
      
      inline def setSymbolRectangle(value: BlueprintIcons16Id): Self = StObject.set(x, "SymbolRectangle", value.asInstanceOf[js.Any])
      
      inline def setSymbolSquare(value: BlueprintIcons16Id): Self = StObject.set(x, "SymbolSquare", value.asInstanceOf[js.Any])
      
      inline def setSymbolTriangleDown(value: BlueprintIcons16Id): Self = StObject.set(x, "SymbolTriangleDown", value.asInstanceOf[js.Any])
      
      inline def setSymbolTriangleUp(value: BlueprintIcons16Id): Self = StObject.set(x, "SymbolTriangleUp", value.asInstanceOf[js.Any])
      
      inline def setTAG(value: BlueprintIcons16Id): Self = StObject.set(x, "TAG", value.asInstanceOf[js.Any])
      
      inline def setTAKE_ACTION(value: BlueprintIcons16Id): Self = StObject.set(x, "TAKE_ACTION", value.asInstanceOf[js.Any])
      
      inline def setTANK(value: BlueprintIcons16Id): Self = StObject.set(x, "TANK", value.asInstanceOf[js.Any])
      
      inline def setTARGET(value: BlueprintIcons16Id): Self = StObject.set(x, "TARGET", value.asInstanceOf[js.Any])
      
      inline def setTAXI(value: BlueprintIcons16Id): Self = StObject.set(x, "TAXI", value.asInstanceOf[js.Any])
      
      inline def setTEMPERATURE(value: BlueprintIcons16Id): Self = StObject.set(x, "TEMPERATURE", value.asInstanceOf[js.Any])
      
      inline def setTEXT_HIGHLIGHT(value: BlueprintIcons16Id): Self = StObject.set(x, "TEXT_HIGHLIGHT", value.asInstanceOf[js.Any])
      
      inline def setTH(value: BlueprintIcons16Id): Self = StObject.set(x, "TH", value.asInstanceOf[js.Any])
      
      inline def setTHIRD_PARTY(value: BlueprintIcons16Id): Self = StObject.set(x, "THIRD_PARTY", value.asInstanceOf[js.Any])
      
      inline def setTHUMBS_DOWN(value: BlueprintIcons16Id): Self = StObject.set(x, "THUMBS_DOWN", value.asInstanceOf[js.Any])
      
      inline def setTHUMBS_UP(value: BlueprintIcons16Id): Self = StObject.set(x, "THUMBS_UP", value.asInstanceOf[js.Any])
      
      inline def setTH_DERIVED(value: BlueprintIcons16Id): Self = StObject.set(x, "TH_DERIVED", value.asInstanceOf[js.Any])
      
      inline def setTH_DISCONNECT(value: BlueprintIcons16Id): Self = StObject.set(x, "TH_DISCONNECT", value.asInstanceOf[js.Any])
      
      inline def setTH_FILTERED(value: BlueprintIcons16Id): Self = StObject.set(x, "TH_FILTERED", value.asInstanceOf[js.Any])
      
      inline def setTH_LIST(value: BlueprintIcons16Id): Self = StObject.set(x, "TH_LIST", value.asInstanceOf[js.Any])
      
      inline def setTICK(value: BlueprintIcons16Id): Self = StObject.set(x, "TICK", value.asInstanceOf[js.Any])
      
      inline def setTICK_CIRCLE(value: BlueprintIcons16Id): Self = StObject.set(x, "TICK_CIRCLE", value.asInstanceOf[js.Any])
      
      inline def setTIME(value: BlueprintIcons16Id): Self = StObject.set(x, "TIME", value.asInstanceOf[js.Any])
      
      inline def setTIMELINE_AREA_CHART(value: BlueprintIcons16Id): Self = StObject.set(x, "TIMELINE_AREA_CHART", value.asInstanceOf[js.Any])
      
      inline def setTIMELINE_BAR_CHART(value: BlueprintIcons16Id): Self = StObject.set(x, "TIMELINE_BAR_CHART", value.asInstanceOf[js.Any])
      
      inline def setTIMELINE_EVENTS(value: BlueprintIcons16Id): Self = StObject.set(x, "TIMELINE_EVENTS", value.asInstanceOf[js.Any])
      
      inline def setTIMELINE_LINE_CHART(value: BlueprintIcons16Id): Self = StObject.set(x, "TIMELINE_LINE_CHART", value.asInstanceOf[js.Any])
      
      inline def setTINT(value: BlueprintIcons16Id): Self = StObject.set(x, "TINT", value.asInstanceOf[js.Any])
      
      inline def setTORCH(value: BlueprintIcons16Id): Self = StObject.set(x, "TORCH", value.asInstanceOf[js.Any])
      
      inline def setTRACTOR(value: BlueprintIcons16Id): Self = StObject.set(x, "TRACTOR", value.asInstanceOf[js.Any])
      
      inline def setTRAIN(value: BlueprintIcons16Id): Self = StObject.set(x, "TRAIN", value.asInstanceOf[js.Any])
      
      inline def setTRANSLATE(value: BlueprintIcons16Id): Self = StObject.set(x, "TRANSLATE", value.asInstanceOf[js.Any])
      
      inline def setTRASH(value: BlueprintIcons16Id): Self = StObject.set(x, "TRASH", value.asInstanceOf[js.Any])
      
      inline def setTREE(value: BlueprintIcons16Id): Self = StObject.set(x, "TREE", value.asInstanceOf[js.Any])
      
      inline def setTRENDING_DOWN(value: BlueprintIcons16Id): Self = StObject.set(x, "TRENDING_DOWN", value.asInstanceOf[js.Any])
      
      inline def setTRENDING_UP(value: BlueprintIcons16Id): Self = StObject.set(x, "TRENDING_UP", value.asInstanceOf[js.Any])
      
      inline def setTRUCK(value: BlueprintIcons16Id): Self = StObject.set(x, "TRUCK", value.asInstanceOf[js.Any])
      
      inline def setTWO_COLUMNS(value: BlueprintIcons16Id): Self = StObject.set(x, "TWO_COLUMNS", value.asInstanceOf[js.Any])
      
      inline def setTakeAction(value: BlueprintIcons16Id): Self = StObject.set(x, "TakeAction", value.asInstanceOf[js.Any])
      
      inline def setTextHighlight(value: BlueprintIcons16Id): Self = StObject.set(x, "TextHighlight", value.asInstanceOf[js.Any])
      
      inline def setThDerived(value: BlueprintIcons16Id): Self = StObject.set(x, "ThDerived", value.asInstanceOf[js.Any])
      
      inline def setThDisconnect(value: BlueprintIcons16Id): Self = StObject.set(x, "ThDisconnect", value.asInstanceOf[js.Any])
      
      inline def setThFiltered(value: BlueprintIcons16Id): Self = StObject.set(x, "ThFiltered", value.asInstanceOf[js.Any])
      
      inline def setThList(value: BlueprintIcons16Id): Self = StObject.set(x, "ThList", value.asInstanceOf[js.Any])
      
      inline def setThirdParty(value: BlueprintIcons16Id): Self = StObject.set(x, "ThirdParty", value.asInstanceOf[js.Any])
      
      inline def setThumbsDown(value: BlueprintIcons16Id): Self = StObject.set(x, "ThumbsDown", value.asInstanceOf[js.Any])
      
      inline def setThumbsUp(value: BlueprintIcons16Id): Self = StObject.set(x, "ThumbsUp", value.asInstanceOf[js.Any])
      
      inline def setTickCircle(value: BlueprintIcons16Id): Self = StObject.set(x, "TickCircle", value.asInstanceOf[js.Any])
      
      inline def setTimelineAreaChart(value: BlueprintIcons16Id): Self = StObject.set(x, "TimelineAreaChart", value.asInstanceOf[js.Any])
      
      inline def setTimelineBarChart(value: BlueprintIcons16Id): Self = StObject.set(x, "TimelineBarChart", value.asInstanceOf[js.Any])
      
      inline def setTimelineEvents(value: BlueprintIcons16Id): Self = StObject.set(x, "TimelineEvents", value.asInstanceOf[js.Any])
      
      inline def setTimelineLineChart(value: BlueprintIcons16Id): Self = StObject.set(x, "TimelineLineChart", value.asInstanceOf[js.Any])
      
      inline def setTrendingDown(value: BlueprintIcons16Id): Self = StObject.set(x, "TrendingDown", value.asInstanceOf[js.Any])
      
      inline def setTrendingUp(value: BlueprintIcons16Id): Self = StObject.set(x, "TrendingUp", value.asInstanceOf[js.Any])
      
      inline def setTwoColumns(value: BlueprintIcons16Id): Self = StObject.set(x, "TwoColumns", value.asInstanceOf[js.Any])
      
      inline def setUNARCHIVE(value: BlueprintIcons16Id): Self = StObject.set(x, "UNARCHIVE", value.asInstanceOf[js.Any])
      
      inline def setUNDERLINE(value: BlueprintIcons16Id): Self = StObject.set(x, "UNDERLINE", value.asInstanceOf[js.Any])
      
      inline def setUNDO(value: BlueprintIcons16Id): Self = StObject.set(x, "UNDO", value.asInstanceOf[js.Any])
      
      inline def setUNGROUP_OBJECTS(value: BlueprintIcons16Id): Self = StObject.set(x, "UNGROUP_OBJECTS", value.asInstanceOf[js.Any])
      
      inline def setUNKNOWN_VEHICLE(value: BlueprintIcons16Id): Self = StObject.set(x, "UNKNOWN_VEHICLE", value.asInstanceOf[js.Any])
      
      inline def setUNLOCK(value: BlueprintIcons16Id): Self = StObject.set(x, "UNLOCK", value.asInstanceOf[js.Any])
      
      inline def setUNPIN(value: BlueprintIcons16Id): Self = StObject.set(x, "UNPIN", value.asInstanceOf[js.Any])
      
      inline def setUNRESOLVE(value: BlueprintIcons16Id): Self = StObject.set(x, "UNRESOLVE", value.asInstanceOf[js.Any])
      
      inline def setUPDATED(value: BlueprintIcons16Id): Self = StObject.set(x, "UPDATED", value.asInstanceOf[js.Any])
      
      inline def setUPLOAD(value: BlueprintIcons16Id): Self = StObject.set(x, "UPLOAD", value.asInstanceOf[js.Any])
      
      inline def setUSER(value: BlueprintIcons16Id): Self = StObject.set(x, "USER", value.asInstanceOf[js.Any])
      
      inline def setUngroupObjects(value: BlueprintIcons16Id): Self = StObject.set(x, "UngroupObjects", value.asInstanceOf[js.Any])
      
      inline def setUnknownVehicle(value: BlueprintIcons16Id): Self = StObject.set(x, "UnknownVehicle", value.asInstanceOf[js.Any])
      
      inline def setVARIABLE(value: BlueprintIcons16Id): Self = StObject.set(x, "VARIABLE", value.asInstanceOf[js.Any])
      
      inline def setVERTICAL_BAR_CHART_ASC(value: BlueprintIcons16Id): Self = StObject.set(x, "VERTICAL_BAR_CHART_ASC", value.asInstanceOf[js.Any])
      
      inline def setVERTICAL_BAR_CHART_DESC(value: BlueprintIcons16Id): Self = StObject.set(x, "VERTICAL_BAR_CHART_DESC", value.asInstanceOf[js.Any])
      
      inline def setVERTICAL_DISTRIBUTION(value: BlueprintIcons16Id): Self = StObject.set(x, "VERTICAL_DISTRIBUTION", value.asInstanceOf[js.Any])
      
      inline def setVERTICAL_INBETWEEN(value: BlueprintIcons16Id): Self = StObject.set(x, "VERTICAL_INBETWEEN", value.asInstanceOf[js.Any])
      
      inline def setVIDEO(value: BlueprintIcons16Id): Self = StObject.set(x, "VIDEO", value.asInstanceOf[js.Any])
      
      inline def setVIRUS(value: BlueprintIcons16Id): Self = StObject.set(x, "VIRUS", value.asInstanceOf[js.Any])
      
      inline def setVOLUME_DOWN(value: BlueprintIcons16Id): Self = StObject.set(x, "VOLUME_DOWN", value.asInstanceOf[js.Any])
      
      inline def setVOLUME_OFF(value: BlueprintIcons16Id): Self = StObject.set(x, "VOLUME_OFF", value.asInstanceOf[js.Any])
      
      inline def setVOLUME_UP(value: BlueprintIcons16Id): Self = StObject.set(x, "VOLUME_UP", value.asInstanceOf[js.Any])
      
      inline def setVerticalBarChartAsc(value: BlueprintIcons16Id): Self = StObject.set(x, "VerticalBarChartAsc", value.asInstanceOf[js.Any])
      
      inline def setVerticalBarChartDesc(value: BlueprintIcons16Id): Self = StObject.set(x, "VerticalBarChartDesc", value.asInstanceOf[js.Any])
      
      inline def setVerticalDistribution(value: BlueprintIcons16Id): Self = StObject.set(x, "VerticalDistribution", value.asInstanceOf[js.Any])
      
      inline def setVerticalInbetween(value: BlueprintIcons16Id): Self = StObject.set(x, "VerticalInbetween", value.asInstanceOf[js.Any])
      
      inline def setVolumeDown(value: BlueprintIcons16Id): Self = StObject.set(x, "VolumeDown", value.asInstanceOf[js.Any])
      
      inline def setVolumeOff(value: BlueprintIcons16Id): Self = StObject.set(x, "VolumeOff", value.asInstanceOf[js.Any])
      
      inline def setVolumeUp(value: BlueprintIcons16Id): Self = StObject.set(x, "VolumeUp", value.asInstanceOf[js.Any])
      
      inline def setWALK(value: BlueprintIcons16Id): Self = StObject.set(x, "WALK", value.asInstanceOf[js.Any])
      
      inline def setWARNING_SIGN(value: BlueprintIcons16Id): Self = StObject.set(x, "WARNING_SIGN", value.asInstanceOf[js.Any])
      
      inline def setWATERFALL_CHART(value: BlueprintIcons16Id): Self = StObject.set(x, "WATERFALL_CHART", value.asInstanceOf[js.Any])
      
      inline def setWAVES(value: BlueprintIcons16Id): Self = StObject.set(x, "WAVES", value.asInstanceOf[js.Any])
      
      inline def setWIDGET(value: BlueprintIcons16Id): Self = StObject.set(x, "WIDGET", value.asInstanceOf[js.Any])
      
      inline def setWIDGET_BUTTON(value: BlueprintIcons16Id): Self = StObject.set(x, "WIDGET_BUTTON", value.asInstanceOf[js.Any])
      
      inline def setWIDGET_FOOTER(value: BlueprintIcons16Id): Self = StObject.set(x, "WIDGET_FOOTER", value.asInstanceOf[js.Any])
      
      inline def setWIDGET_HEADER(value: BlueprintIcons16Id): Self = StObject.set(x, "WIDGET_HEADER", value.asInstanceOf[js.Any])
      
      inline def setWIND(value: BlueprintIcons16Id): Self = StObject.set(x, "WIND", value.asInstanceOf[js.Any])
      
      inline def setWRENCH(value: BlueprintIcons16Id): Self = StObject.set(x, "WRENCH", value.asInstanceOf[js.Any])
      
      inline def setWarningSign(value: BlueprintIcons16Id): Self = StObject.set(x, "WarningSign", value.asInstanceOf[js.Any])
      
      inline def setWaterfallChart(value: BlueprintIcons16Id): Self = StObject.set(x, "WaterfallChart", value.asInstanceOf[js.Any])
      
      inline def setWidgetButton(value: BlueprintIcons16Id): Self = StObject.set(x, "WidgetButton", value.asInstanceOf[js.Any])
      
      inline def setWidgetFooter(value: BlueprintIcons16Id): Self = StObject.set(x, "WidgetFooter", value.asInstanceOf[js.Any])
      
      inline def setWidgetHeader(value: BlueprintIcons16Id): Self = StObject.set(x, "WidgetHeader", value.asInstanceOf[js.Any])
      
      inline def setZOOM_IN(value: BlueprintIcons16Id): Self = StObject.set(x, "ZOOM_IN", value.asInstanceOf[js.Any])
      
      inline def setZOOM_OUT(value: BlueprintIcons16Id): Self = StObject.set(x, "ZOOM_OUT", value.asInstanceOf[js.Any])
      
      inline def setZOOM_TO_FIT(value: BlueprintIcons16Id): Self = StObject.set(x, "ZOOM_TO_FIT", value.asInstanceOf[js.Any])
      
      inline def setZoomIn(value: BlueprintIcons16Id): Self = StObject.set(x, "ZoomIn", value.asInstanceOf[js.Any])
      
      inline def setZoomOut(value: BlueprintIcons16Id): Self = StObject.set(x, "ZoomOut", value.asInstanceOf[js.Any])
      
      inline def setZoomToFit(value: BlueprintIcons16Id): Self = StObject.set(x, "ZoomToFit", value.asInstanceOf[js.Any])
    }
  }
}
