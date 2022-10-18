package typings.reactKonva

import org.scalablytyped.runtime.StringDictionary
import typings.konva.libNodeMod.Filter
import typings.konva.libNodeMod.Node
import typings.konva.libNodeMod.globalCompositeOperationType
import typings.konva.libTypesMod.Vector2d
import typings.konva.mod.Konva.Arc
import typings.konva.mod.Konva.ArcConfig
import typings.konva.mod.Konva.Arrow
import typings.konva.mod.Konva.ArrowConfig
import typings.konva.mod.Konva.Circle
import typings.konva.mod.Konva.CircleConfig
import typings.konva.mod.Konva.Ellipse
import typings.konva.mod.Konva.EllipseConfig
import typings.konva.mod.Konva.FastLayer
import typings.konva.mod.Konva.Group
import typings.konva.mod.Konva.GroupConfig
import typings.konva.mod.Konva.Image
import typings.konva.mod.Konva.ImageConfig
import typings.konva.mod.Konva.KonvaEventObject
import typings.konva.mod.Konva.Label
import typings.konva.mod.Konva.LabelConfig
import typings.konva.mod.Konva.Layer
import typings.konva.mod.Konva.LayerConfig
import typings.konva.mod.Konva.Line
import typings.konva.mod.Konva.LineConfig
import typings.konva.mod.Konva.Path
import typings.konva.mod.Konva.PathConfig
import typings.konva.mod.Konva.Rect
import typings.konva.mod.Konva.RectConfig
import typings.konva.mod.Konva.RegularPolygon
import typings.konva.mod.Konva.RegularPolygonConfig
import typings.konva.mod.Konva.Ring
import typings.konva.mod.Konva.RingConfig
import typings.konva.mod.Konva.Shape
import typings.konva.mod.Konva.ShapeConfig
import typings.konva.mod.Konva.Sprite
import typings.konva.mod.Konva.SpriteConfig
import typings.konva.mod.Konva.Stage
import typings.konva.mod.Konva.Star
import typings.konva.mod.Konva.StarConfig
import typings.konva.mod.Konva.Tag
import typings.konva.mod.Konva.TagConfig
import typings.konva.mod.Konva.Text
import typings.konva.mod.Konva.TextConfig
import typings.konva.mod.Konva.TextPath
import typings.konva.mod.Konva.TextPathConfig
import typings.konva.mod.Konva.Transformer
import typings.konva.mod.Konva.TransformerConfig
import typings.konva.mod.Konva.Wedge
import typings.konva.mod.Konva.WedgeConfig
import typings.react.mod.AriaRole
import typings.react.mod.CSSProperties
import typings.react.mod.ClassAttributes
import typings.react.mod.FunctionComponent
import typings.reactReconciler.mod.Reconciler
import typings.std.DragEvent
import typings.std.Event
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.TouchEvent
import typings.std.WheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactKonvaCoreMod {
  
  @JSImport("react-konva/ReactKonvaCore", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-konva/ReactKonvaCore", "Arc")
  @js.native
  def Arc: KonvaNodeComponent[typings.konva.mod.Konva.Arc, ArcConfig] = js.native
  inline def Arc_=(x: KonvaNodeComponent[Arc, ArcConfig]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Arc")(x.asInstanceOf[js.Any])
  
  @JSImport("react-konva/ReactKonvaCore", "Arrow")
  @js.native
  def Arrow: KonvaNodeComponent[typings.konva.mod.Konva.Arrow, ArrowConfig] = js.native
  inline def Arrow_=(x: KonvaNodeComponent[Arrow, ArrowConfig]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Arrow")(x.asInstanceOf[js.Any])
  
  @JSImport("react-konva/ReactKonvaCore", "Circle")
  @js.native
  def Circle: KonvaNodeComponent[typings.konva.mod.Konva.Circle, CircleConfig] = js.native
  inline def Circle_=(x: KonvaNodeComponent[Circle, CircleConfig]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Circle")(x.asInstanceOf[js.Any])
  
  @JSImport("react-konva/ReactKonvaCore", "Ellipse")
  @js.native
  def Ellipse: KonvaNodeComponent[typings.konva.mod.Konva.Ellipse, EllipseConfig] = js.native
  inline def Ellipse_=(x: KonvaNodeComponent[Ellipse, EllipseConfig]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Ellipse")(x.asInstanceOf[js.Any])
  
  @JSImport("react-konva/ReactKonvaCore", "FastLayer")
  @js.native
  def FastLayer: KonvaNodeComponent[typings.konva.mod.Konva.FastLayer, LayerConfig] = js.native
  inline def FastLayer_=(x: KonvaNodeComponent[FastLayer, LayerConfig]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FastLayer")(x.asInstanceOf[js.Any])
  
  @JSImport("react-konva/ReactKonvaCore", "Group")
  @js.native
  def Group: KonvaNodeComponent[typings.konva.mod.Konva.Group, GroupConfig] = js.native
  inline def Group_=(x: KonvaNodeComponent[Group, GroupConfig]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Group")(x.asInstanceOf[js.Any])
  
  @JSImport("react-konva/ReactKonvaCore", "Image")
  @js.native
  def Image: KonvaNodeComponent[typings.konva.mod.Konva.Image, ImageConfig] = js.native
  inline def Image_=(x: KonvaNodeComponent[Image, ImageConfig]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Image")(x.asInstanceOf[js.Any])
  
  @JSImport("react-konva/ReactKonvaCore", "KonvaRenderer")
  @js.native
  def KonvaRenderer: Reconciler[Any, Any, Any, Any, Any] = js.native
  inline def KonvaRenderer_=(x: Reconciler[Any, Any, Any, Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("KonvaRenderer")(x.asInstanceOf[js.Any])
  
  @JSImport("react-konva/ReactKonvaCore", "Label")
  @js.native
  def Label: KonvaNodeComponent[typings.konva.mod.Konva.Label, LabelConfig] = js.native
  inline def Label_=(x: KonvaNodeComponent[Label, LabelConfig]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Label")(x.asInstanceOf[js.Any])
  
  @JSImport("react-konva/ReactKonvaCore", "Layer")
  @js.native
  def Layer: KonvaNodeComponent[typings.konva.mod.Konva.Layer, LayerConfig] = js.native
  inline def Layer_=(x: KonvaNodeComponent[Layer, LayerConfig]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Layer")(x.asInstanceOf[js.Any])
  
  @JSImport("react-konva/ReactKonvaCore", "Line")
  @js.native
  def Line: KonvaNodeComponent[typings.konva.mod.Konva.Line, LineConfig] = js.native
  inline def Line_=(x: KonvaNodeComponent[Line, LineConfig]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Line")(x.asInstanceOf[js.Any])
  
  @JSImport("react-konva/ReactKonvaCore", "Path")
  @js.native
  def Path: KonvaNodeComponent[typings.konva.mod.Konva.Path, PathConfig] = js.native
  inline def Path_=(x: KonvaNodeComponent[Path, PathConfig]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Path")(x.asInstanceOf[js.Any])
  
  @JSImport("react-konva/ReactKonvaCore", "Rect")
  @js.native
  def Rect: KonvaNodeComponent[typings.konva.mod.Konva.Rect, RectConfig] = js.native
  inline def Rect_=(x: KonvaNodeComponent[Rect, RectConfig]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Rect")(x.asInstanceOf[js.Any])
  
  @JSImport("react-konva/ReactKonvaCore", "RegularPolygon")
  @js.native
  def RegularPolygon: KonvaNodeComponent[typings.konva.mod.Konva.RegularPolygon, RegularPolygonConfig] = js.native
  inline def RegularPolygon_=(x: KonvaNodeComponent[RegularPolygon, RegularPolygonConfig]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RegularPolygon")(x.asInstanceOf[js.Any])
  
  @JSImport("react-konva/ReactKonvaCore", "Ring")
  @js.native
  def Ring: KonvaNodeComponent[typings.konva.mod.Konva.Ring, RingConfig] = js.native
  inline def Ring_=(x: KonvaNodeComponent[Ring, RingConfig]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Ring")(x.asInstanceOf[js.Any])
  
  @JSImport("react-konva/ReactKonvaCore", "Shape")
  @js.native
  def Shape: KonvaNodeComponent[typings.konva.mod.Konva.Shape, ShapeConfig] = js.native
  inline def Shape_=(x: KonvaNodeComponent[Shape, ShapeConfig]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Shape")(x.asInstanceOf[js.Any])
  
  @JSImport("react-konva/ReactKonvaCore", "Sprite")
  @js.native
  def Sprite: KonvaNodeComponent[typings.konva.mod.Konva.Sprite, SpriteConfig] = js.native
  inline def Sprite_=(x: KonvaNodeComponent[Sprite, SpriteConfig]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Sprite")(x.asInstanceOf[js.Any])
  
  @JSImport("react-konva/ReactKonvaCore", "Stage")
  @js.native
  def Stage: KonvaNodeComponent[typings.konva.mod.Konva.Stage, StageProps] = js.native
  inline def Stage_=(x: KonvaNodeComponent[Stage, StageProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Stage")(x.asInstanceOf[js.Any])
  
  @JSImport("react-konva/ReactKonvaCore", "Star")
  @js.native
  def Star: KonvaNodeComponent[typings.konva.mod.Konva.Star, StarConfig] = js.native
  inline def Star_=(x: KonvaNodeComponent[Star, StarConfig]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Star")(x.asInstanceOf[js.Any])
  
  @JSImport("react-konva/ReactKonvaCore", "Tag")
  @js.native
  def Tag: KonvaNodeComponent[typings.konva.mod.Konva.Tag, TagConfig] = js.native
  inline def Tag_=(x: KonvaNodeComponent[Tag, TagConfig]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tag")(x.asInstanceOf[js.Any])
  
  @JSImport("react-konva/ReactKonvaCore", "Text")
  @js.native
  def Text: KonvaNodeComponent[typings.konva.mod.Konva.Text, TextConfig] = js.native
  
  @JSImport("react-konva/ReactKonvaCore", "TextPath")
  @js.native
  def TextPath: KonvaNodeComponent[typings.konva.mod.Konva.TextPath, TextPathConfig] = js.native
  inline def TextPath_=(x: KonvaNodeComponent[TextPath, TextPathConfig]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TextPath")(x.asInstanceOf[js.Any])
  
  inline def Text_=(x: KonvaNodeComponent[Text, TextConfig]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Text")(x.asInstanceOf[js.Any])
  
  @JSImport("react-konva/ReactKonvaCore", "Transformer")
  @js.native
  def Transformer: KonvaNodeComponent[typings.konva.mod.Konva.Transformer, TransformerConfig] = js.native
  inline def Transformer_=(x: KonvaNodeComponent[Transformer, TransformerConfig]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Transformer")(x.asInstanceOf[js.Any])
  
  @JSImport("react-konva/ReactKonvaCore", "Wedge")
  @js.native
  def Wedge: KonvaNodeComponent[typings.konva.mod.Konva.Wedge, WedgeConfig] = js.native
  inline def Wedge_=(x: KonvaNodeComponent[Wedge, WedgeConfig]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Wedge")(x.asInstanceOf[js.Any])
  
  @JSImport("react-konva/ReactKonvaCore", "useStrictMode")
  @js.native
  def useStrictMode: js.Function1[/* useStrictMode */ Boolean, Unit] = js.native
  inline def useStrictMode_=(x: js.Function1[/* useStrictMode */ Boolean, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useStrictMode")(x.asInstanceOf[js.Any])
  
  @js.native
  trait KonvaNodeComponent[Node /* <: typings.konva.mod.Konva.Node */, Props]
    extends StObject
       with FunctionComponent[Props & KonvaNodeEvents & ClassAttributes[Node]] {
    
    def getNativeNode(): Node = js.native
    
    def getPublicInstance(): Node = js.native
  }
  
  trait KonvaNodeEvents extends StObject {
    
    var onClick: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[MouseEvent], Unit]] = js.undefined
    
    var onContextMenu: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[PointerEvent], Unit]] = js.undefined
    
    var onDblClick: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[MouseEvent], Unit]] = js.undefined
    
    var onDblTap: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[Event], Unit]] = js.undefined
    
    var onDragEnd: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[DragEvent], Unit]] = js.undefined
    
    var onDragMove: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[DragEvent], Unit]] = js.undefined
    
    var onDragStart: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[DragEvent], Unit]] = js.undefined
    
    var onMouseDown: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[MouseEvent], Unit]] = js.undefined
    
    var onMouseEnter: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[MouseEvent], Unit]] = js.undefined
    
    var onMouseLeave: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[MouseEvent], Unit]] = js.undefined
    
    var onMouseMove: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[MouseEvent], Unit]] = js.undefined
    
    var onMouseOut: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[MouseEvent], Unit]] = js.undefined
    
    var onMouseOver: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[MouseEvent], Unit]] = js.undefined
    
    var onMouseUp: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[MouseEvent], Unit]] = js.undefined
    
    var onTap: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[Event], Unit]] = js.undefined
    
    var onTouchEnd: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[TouchEvent], Unit]] = js.undefined
    
    var onTouchMove: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[TouchEvent], Unit]] = js.undefined
    
    var onTouchStart: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[TouchEvent], Unit]] = js.undefined
    
    var onTransform: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[Event], Unit]] = js.undefined
    
    var onTransformEnd: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[Event], Unit]] = js.undefined
    
    var onTransformStart: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[Event], Unit]] = js.undefined
    
    var onWheel: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[WheelEvent], Unit]] = js.undefined
  }
  object KonvaNodeEvents {
    
    inline def apply(): KonvaNodeEvents = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KonvaNodeEvents]
    }
    
    extension [Self <: KonvaNodeEvents](x: Self) {
      
      inline def setOnClick(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnContextMenu(value: /* evt */ KonvaEventObject[PointerEvent] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      inline def setOnDblClick(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): Self = StObject.set(x, "onDblClick", js.Any.fromFunction1(value))
      
      inline def setOnDblClickUndefined: Self = StObject.set(x, "onDblClick", js.undefined)
      
      inline def setOnDblTap(value: /* evt */ KonvaEventObject[Event] => Unit): Self = StObject.set(x, "onDblTap", js.Any.fromFunction1(value))
      
      inline def setOnDblTapUndefined: Self = StObject.set(x, "onDblTap", js.undefined)
      
      inline def setOnDragEnd(value: /* evt */ KonvaEventObject[DragEvent] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
      
      inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      inline def setOnDragMove(value: /* evt */ KonvaEventObject[DragEvent] => Unit): Self = StObject.set(x, "onDragMove", js.Any.fromFunction1(value))
      
      inline def setOnDragMoveUndefined: Self = StObject.set(x, "onDragMove", js.undefined)
      
      inline def setOnDragStart(value: /* evt */ KonvaEventObject[DragEvent] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setOnMouseDown(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnMouseEnter(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setOnMouseOut(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1(value))
      
      inline def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
      
      inline def setOnMouseOver(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
      
      inline def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      inline def setOnMouseUp(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      inline def setOnTap(value: /* evt */ KonvaEventObject[Event] => Unit): Self = StObject.set(x, "onTap", js.Any.fromFunction1(value))
      
      inline def setOnTapUndefined: Self = StObject.set(x, "onTap", js.undefined)
      
      inline def setOnTouchEnd(value: /* evt */ KonvaEventObject[TouchEvent] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      inline def setOnTouchMove(value: /* evt */ KonvaEventObject[TouchEvent] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      inline def setOnTouchStart(value: /* evt */ KonvaEventObject[TouchEvent] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      inline def setOnTransform(value: /* evt */ KonvaEventObject[Event] => Unit): Self = StObject.set(x, "onTransform", js.Any.fromFunction1(value))
      
      inline def setOnTransformEnd(value: /* evt */ KonvaEventObject[Event] => Unit): Self = StObject.set(x, "onTransformEnd", js.Any.fromFunction1(value))
      
      inline def setOnTransformEndUndefined: Self = StObject.set(x, "onTransformEnd", js.undefined)
      
      inline def setOnTransformStart(value: /* evt */ KonvaEventObject[Event] => Unit): Self = StObject.set(x, "onTransformStart", js.Any.fromFunction1(value))
      
      inline def setOnTransformStartUndefined: Self = StObject.set(x, "onTransformStart", js.undefined)
      
      inline def setOnTransformUndefined: Self = StObject.set(x, "onTransform", js.undefined)
      
      inline def setOnWheel(value: /* evt */ KonvaEventObject[WheelEvent] => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
      
      inline def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
    }
  }
  
  /* Inlined parent konva.konva.default.NodeConfig */
  /* Inlined parent react-konva.react-konva/ReactKonvaCore.KonvaNodeEvents */
  /* Inlined parent std.Pick<react.react.HTMLAttributes<std.HTMLDivElement>, 'className' | 'role' | 'style' | 'tabIndex' | 'title'> */
  trait StageProps
    extends StObject
       with /* index */ StringDictionary[Any] {
    
    var className: js.UndefOr[String] = js.undefined
    
    var dragBoundFunc: js.UndefOr[js.ThisFunction1[/* this */ Node[this.type], /* pos */ Vector2d, Vector2d]] = js.undefined
    
    var dragDistance: js.UndefOr[Double] = js.undefined
    
    var draggable: js.UndefOr[Boolean] = js.undefined
    
    var filters: js.UndefOr[js.Array[Filter]] = js.undefined
    
    var globalCompositeOperation: js.UndefOr[globalCompositeOperationType] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var listening: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var offset: js.UndefOr[Vector2d] = js.undefined
    
    var offsetX: js.UndefOr[Double] = js.undefined
    
    var offsetY: js.UndefOr[Double] = js.undefined
    
    var onClick: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[MouseEvent], Unit]] = js.undefined
    
    var onContextMenu: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[PointerEvent], Unit]] = js.undefined
    
    var onDblClick: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[MouseEvent], Unit]] = js.undefined
    
    var onDblTap: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[Event], Unit]] = js.undefined
    
    var onDragEnd: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[DragEvent], Unit]] = js.undefined
    
    var onDragMove: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[DragEvent], Unit]] = js.undefined
    
    var onDragStart: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[DragEvent], Unit]] = js.undefined
    
    var onMouseDown: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[MouseEvent], Unit]] = js.undefined
    
    var onMouseEnter: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[MouseEvent], Unit]] = js.undefined
    
    var onMouseLeave: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[MouseEvent], Unit]] = js.undefined
    
    var onMouseMove: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[MouseEvent], Unit]] = js.undefined
    
    var onMouseOut: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[MouseEvent], Unit]] = js.undefined
    
    var onMouseOver: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[MouseEvent], Unit]] = js.undefined
    
    var onMouseUp: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[MouseEvent], Unit]] = js.undefined
    
    var onTap: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[Event], Unit]] = js.undefined
    
    var onTouchEnd: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[TouchEvent], Unit]] = js.undefined
    
    var onTouchMove: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[TouchEvent], Unit]] = js.undefined
    
    var onTouchStart: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[TouchEvent], Unit]] = js.undefined
    
    var onTransform: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[Event], Unit]] = js.undefined
    
    var onTransformEnd: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[Event], Unit]] = js.undefined
    
    var onTransformStart: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[Event], Unit]] = js.undefined
    
    var onWheel: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[WheelEvent], Unit]] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var preventDefault: js.UndefOr[Boolean] = js.undefined
    
    var role: js.UndefOr[AriaRole] = js.undefined
    
    var rotation: js.UndefOr[Double] = js.undefined
    
    var rotationDeg: js.UndefOr[Double] = js.undefined
    
    var scale: js.UndefOr[Vector2d] = js.undefined
    
    var scaleX: js.UndefOr[Double] = js.undefined
    
    var scaleY: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object StageProps {
    
    inline def apply(): StageProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StageProps]
    }
    
    extension [Self <: StageProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDragBoundFunc(value: js.ThisFunction1[/* this */ Node[StageProps], /* pos */ Vector2d, Vector2d]): Self = StObject.set(x, "dragBoundFunc", value.asInstanceOf[js.Any])
      
      inline def setDragBoundFuncUndefined: Self = StObject.set(x, "dragBoundFunc", js.undefined)
      
      inline def setDragDistance(value: Double): Self = StObject.set(x, "dragDistance", value.asInstanceOf[js.Any])
      
      inline def setDragDistanceUndefined: Self = StObject.set(x, "dragDistance", js.undefined)
      
      inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setFilters(value: js.Array[Filter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "filters", js.Array(value*))
      
      inline def setGlobalCompositeOperation(value: globalCompositeOperationType): Self = StObject.set(x, "globalCompositeOperation", value.asInstanceOf[js.Any])
      
      inline def setGlobalCompositeOperationUndefined: Self = StObject.set(x, "globalCompositeOperation", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setListening(value: Boolean): Self = StObject.set(x, "listening", value.asInstanceOf[js.Any])
      
      inline def setListeningUndefined: Self = StObject.set(x, "listening", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOffset(value: Vector2d): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
      
      inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
      
      inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
      
      inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
      
      inline def setOnClick(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnContextMenu(value: /* evt */ KonvaEventObject[PointerEvent] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      inline def setOnDblClick(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): Self = StObject.set(x, "onDblClick", js.Any.fromFunction1(value))
      
      inline def setOnDblClickUndefined: Self = StObject.set(x, "onDblClick", js.undefined)
      
      inline def setOnDblTap(value: /* evt */ KonvaEventObject[Event] => Unit): Self = StObject.set(x, "onDblTap", js.Any.fromFunction1(value))
      
      inline def setOnDblTapUndefined: Self = StObject.set(x, "onDblTap", js.undefined)
      
      inline def setOnDragEnd(value: /* evt */ KonvaEventObject[DragEvent] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
      
      inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      inline def setOnDragMove(value: /* evt */ KonvaEventObject[DragEvent] => Unit): Self = StObject.set(x, "onDragMove", js.Any.fromFunction1(value))
      
      inline def setOnDragMoveUndefined: Self = StObject.set(x, "onDragMove", js.undefined)
      
      inline def setOnDragStart(value: /* evt */ KonvaEventObject[DragEvent] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setOnMouseDown(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnMouseEnter(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setOnMouseOut(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1(value))
      
      inline def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
      
      inline def setOnMouseOver(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
      
      inline def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      inline def setOnMouseUp(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      inline def setOnTap(value: /* evt */ KonvaEventObject[Event] => Unit): Self = StObject.set(x, "onTap", js.Any.fromFunction1(value))
      
      inline def setOnTapUndefined: Self = StObject.set(x, "onTap", js.undefined)
      
      inline def setOnTouchEnd(value: /* evt */ KonvaEventObject[TouchEvent] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      inline def setOnTouchMove(value: /* evt */ KonvaEventObject[TouchEvent] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      inline def setOnTouchStart(value: /* evt */ KonvaEventObject[TouchEvent] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      inline def setOnTransform(value: /* evt */ KonvaEventObject[Event] => Unit): Self = StObject.set(x, "onTransform", js.Any.fromFunction1(value))
      
      inline def setOnTransformEnd(value: /* evt */ KonvaEventObject[Event] => Unit): Self = StObject.set(x, "onTransformEnd", js.Any.fromFunction1(value))
      
      inline def setOnTransformEndUndefined: Self = StObject.set(x, "onTransformEnd", js.undefined)
      
      inline def setOnTransformStart(value: /* evt */ KonvaEventObject[Event] => Unit): Self = StObject.set(x, "onTransformStart", js.Any.fromFunction1(value))
      
      inline def setOnTransformStartUndefined: Self = StObject.set(x, "onTransformStart", js.undefined)
      
      inline def setOnTransformUndefined: Self = StObject.set(x, "onTransform", js.undefined)
      
      inline def setOnWheel(value: /* evt */ KonvaEventObject[WheelEvent] => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
      
      inline def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setPreventDefault(value: Boolean): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
      
      inline def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
      
      inline def setRole(value: AriaRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationDeg(value: Double): Self = StObject.set(x, "rotationDeg", value.asInstanceOf[js.Any])
      
      inline def setRotationDegUndefined: Self = StObject.set(x, "rotationDeg", js.undefined)
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      inline def setScale(value: Vector2d): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
      
      inline def setScaleXUndefined: Self = StObject.set(x, "scaleX", js.undefined)
      
      inline def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
      
      inline def setScaleYUndefined: Self = StObject.set(x, "scaleY", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
}
