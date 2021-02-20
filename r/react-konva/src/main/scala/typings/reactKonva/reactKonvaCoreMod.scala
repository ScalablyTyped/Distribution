package typings.reactKonva

import org.scalablytyped.runtime.StringDictionary
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
import typings.konva.mod.Konva.Image
import typings.konva.mod.Konva.ImageConfig
import typings.konva.mod.Konva.KonvaEventObject
import typings.konva.mod.Konva.Label
import typings.konva.mod.Konva.Layer
import typings.konva.mod.Konva.LayerConfig
import typings.konva.mod.Konva.Line
import typings.konva.mod.Konva.LineConfig
import typings.konva.mod.Konva.Node
import typings.konva.mod.Konva.NodeConfig
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
import typings.konva.nodeMod.Filter
import typings.konva.nodeMod.globalCompositeOperationType
import typings.konva.typesMod.Vector2d
import typings.react.mod.CSSProperties
import typings.react.mod.ClassAttributes
import typings.react.mod.FunctionComponent
import typings.std.DragEvent
import typings.std.Event
import typings.std.MouseEvent
import typings.std.Number
import typings.std.PointerEvent
import typings.std.TouchEvent
import typings.std.WheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactKonvaCoreMod {
  
  @JSImport("react-konva/lib/ReactKonvaCore", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-konva/lib/ReactKonvaCore", "Arc")
  @js.native
  def Arc: KonvaNodeComponent[typings.konva.mod.Konva.Arc, ArcConfig] = js.native
  @scala.inline
  def Arc_=(x: KonvaNodeComponent[Arc, ArcConfig]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Arc")(x.asInstanceOf[js.Any])
  
  @JSImport("react-konva/lib/ReactKonvaCore", "Arrow")
  @js.native
  def Arrow: KonvaNodeComponent[typings.konva.mod.Konva.Arrow, ArrowConfig] = js.native
  @scala.inline
  def Arrow_=(x: KonvaNodeComponent[Arrow, ArrowConfig]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Arrow")(x.asInstanceOf[js.Any])
  
  @JSImport("react-konva/lib/ReactKonvaCore", "Circle")
  @js.native
  def Circle: KonvaNodeComponent[typings.konva.mod.Konva.Circle, CircleConfig] = js.native
  @scala.inline
  def Circle_=(x: KonvaNodeComponent[Circle, CircleConfig]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Circle")(x.asInstanceOf[js.Any])
  
  @JSImport("react-konva/lib/ReactKonvaCore", "Ellipse")
  @js.native
  def Ellipse: KonvaNodeComponent[typings.konva.mod.Konva.Ellipse, EllipseConfig] = js.native
  @scala.inline
  def Ellipse_=(x: KonvaNodeComponent[Ellipse, EllipseConfig]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Ellipse")(x.asInstanceOf[js.Any])
  
  @JSImport("react-konva/lib/ReactKonvaCore", "FastLayer")
  @js.native
  def FastLayer: KonvaNodeComponent[typings.konva.mod.Konva.FastLayer, LayerConfig] = js.native
  @scala.inline
  def FastLayer_=(x: KonvaNodeComponent[FastLayer, LayerConfig]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FastLayer")(x.asInstanceOf[js.Any])
  
  @JSImport("react-konva/lib/ReactKonvaCore", "Group")
  @js.native
  def Group: KonvaNodeComponent[typings.konva.mod.Konva.Group, NodeConfig] = js.native
  @scala.inline
  def Group_=(x: KonvaNodeComponent[Group, NodeConfig]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Group")(x.asInstanceOf[js.Any])
  
  @JSImport("react-konva/lib/ReactKonvaCore", "Image")
  @js.native
  def Image: KonvaNodeComponent[typings.konva.mod.Konva.Image, ImageConfig] = js.native
  @scala.inline
  def Image_=(x: KonvaNodeComponent[Image, ImageConfig]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Image")(x.asInstanceOf[js.Any])
  
  @JSImport("react-konva/lib/ReactKonvaCore", "Label")
  @js.native
  def Label: KonvaNodeComponent[typings.konva.mod.Konva.Label, NodeConfig] = js.native
  @scala.inline
  def Label_=(x: KonvaNodeComponent[Label, NodeConfig]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Label")(x.asInstanceOf[js.Any])
  
  @JSImport("react-konva/lib/ReactKonvaCore", "Layer")
  @js.native
  def Layer: KonvaNodeComponent[typings.konva.mod.Konva.Layer, LayerConfig] = js.native
  @scala.inline
  def Layer_=(x: KonvaNodeComponent[Layer, LayerConfig]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Layer")(x.asInstanceOf[js.Any])
  
  @JSImport("react-konva/lib/ReactKonvaCore", "Line")
  @js.native
  def Line: KonvaNodeComponent[typings.konva.mod.Konva.Line, LineConfig] = js.native
  @scala.inline
  def Line_=(x: KonvaNodeComponent[Line, LineConfig]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Line")(x.asInstanceOf[js.Any])
  
  @JSImport("react-konva/lib/ReactKonvaCore", "Path")
  @js.native
  def Path: KonvaNodeComponent[typings.konva.mod.Konva.Path, PathConfig] = js.native
  @scala.inline
  def Path_=(x: KonvaNodeComponent[Path, PathConfig]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Path")(x.asInstanceOf[js.Any])
  
  @JSImport("react-konva/lib/ReactKonvaCore", "Rect")
  @js.native
  def Rect: KonvaNodeComponent[typings.konva.mod.Konva.Rect, RectConfig] = js.native
  @scala.inline
  def Rect_=(x: KonvaNodeComponent[Rect, RectConfig]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Rect")(x.asInstanceOf[js.Any])
  
  @JSImport("react-konva/lib/ReactKonvaCore", "RegularPolygon")
  @js.native
  def RegularPolygon: KonvaNodeComponent[typings.konva.mod.Konva.RegularPolygon, RegularPolygonConfig] = js.native
  @scala.inline
  def RegularPolygon_=(x: KonvaNodeComponent[RegularPolygon, RegularPolygonConfig]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RegularPolygon")(x.asInstanceOf[js.Any])
  
  @JSImport("react-konva/lib/ReactKonvaCore", "Ring")
  @js.native
  def Ring: KonvaNodeComponent[typings.konva.mod.Konva.Ring, RingConfig] = js.native
  @scala.inline
  def Ring_=(x: KonvaNodeComponent[Ring, RingConfig]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Ring")(x.asInstanceOf[js.Any])
  
  @JSImport("react-konva/lib/ReactKonvaCore", "Shape")
  @js.native
  def Shape: KonvaNodeComponent[typings.konva.mod.Konva.Shape, ShapeConfig] = js.native
  @scala.inline
  def Shape_=(x: KonvaNodeComponent[Shape, ShapeConfig]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Shape")(x.asInstanceOf[js.Any])
  
  @JSImport("react-konva/lib/ReactKonvaCore", "Sprite")
  @js.native
  def Sprite: KonvaNodeComponent[typings.konva.mod.Konva.Sprite, SpriteConfig] = js.native
  @scala.inline
  def Sprite_=(x: KonvaNodeComponent[Sprite, SpriteConfig]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Sprite")(x.asInstanceOf[js.Any])
  
  @JSImport("react-konva/lib/ReactKonvaCore", "Stage")
  @js.native
  def Stage: KonvaNodeComponent[typings.konva.mod.Konva.Stage, StageProps] = js.native
  @scala.inline
  def Stage_=(x: KonvaNodeComponent[Stage, StageProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Stage")(x.asInstanceOf[js.Any])
  
  @JSImport("react-konva/lib/ReactKonvaCore", "Star")
  @js.native
  def Star: KonvaNodeComponent[typings.konva.mod.Konva.Star, StarConfig] = js.native
  @scala.inline
  def Star_=(x: KonvaNodeComponent[Star, StarConfig]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Star")(x.asInstanceOf[js.Any])
  
  @JSImport("react-konva/lib/ReactKonvaCore", "Tag")
  @js.native
  def Tag: KonvaNodeComponent[typings.konva.mod.Konva.Tag, TagConfig] = js.native
  @scala.inline
  def Tag_=(x: KonvaNodeComponent[Tag, TagConfig]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tag")(x.asInstanceOf[js.Any])
  
  @JSImport("react-konva/lib/ReactKonvaCore", "Text")
  @js.native
  def Text: KonvaNodeComponent[typings.konva.mod.Konva.Text, TextConfig] = js.native
  
  @JSImport("react-konva/lib/ReactKonvaCore", "TextPath")
  @js.native
  def TextPath: KonvaNodeComponent[typings.konva.mod.Konva.TextPath, TextPathConfig] = js.native
  @scala.inline
  def TextPath_=(x: KonvaNodeComponent[TextPath, TextPathConfig]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TextPath")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def Text_=(x: KonvaNodeComponent[Text, TextConfig]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Text")(x.asInstanceOf[js.Any])
  
  @JSImport("react-konva/lib/ReactKonvaCore", "Transformer")
  @js.native
  def Transformer: KonvaNodeComponent[typings.konva.mod.Konva.Transformer, TransformerConfig] = js.native
  @scala.inline
  def Transformer_=(x: KonvaNodeComponent[Transformer, TransformerConfig]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Transformer")(x.asInstanceOf[js.Any])
  
  @JSImport("react-konva/lib/ReactKonvaCore", "Wedge")
  @js.native
  def Wedge: KonvaNodeComponent[typings.konva.mod.Konva.Wedge, WedgeConfig] = js.native
  @scala.inline
  def Wedge_=(x: KonvaNodeComponent[Wedge, WedgeConfig]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Wedge")(x.asInstanceOf[js.Any])
  
  @JSImport("react-konva/lib/ReactKonvaCore", "useStrictMode")
  @js.native
  def useStrictMode: js.Function1[/* useStrictMode */ Boolean, Unit] = js.native
  @scala.inline
  def useStrictMode_=(x: js.Function1[/* useStrictMode */ Boolean, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useStrictMode")(x.asInstanceOf[js.Any])
  
  @js.native
  trait KonvaNodeComponent[Node /* <: Node */, Props] extends FunctionComponent[Props with KonvaNodeEvents with ClassAttributes[Node]] {
    
    def getNativeNode(): Node = js.native
    
    def getPublicInstance(): Node = js.native
  }
  
  @js.native
  trait KonvaNodeEvents extends StObject {
    
    var onClick: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[MouseEvent], Unit]] = js.native
    
    var onContextMenu: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[PointerEvent], Unit]] = js.native
    
    var onDblClick: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[MouseEvent], Unit]] = js.native
    
    var onDblTap: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[Event], Unit]] = js.native
    
    var onDragEnd: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[DragEvent], Unit]] = js.native
    
    var onDragMove: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[DragEvent], Unit]] = js.native
    
    var onDragStart: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[DragEvent], Unit]] = js.native
    
    var onMouseDown: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[MouseEvent], Unit]] = js.native
    
    var onMouseEnter: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[MouseEvent], Unit]] = js.native
    
    var onMouseLeave: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[MouseEvent], Unit]] = js.native
    
    var onMouseMove: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[MouseEvent], Unit]] = js.native
    
    var onMouseOut: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[MouseEvent], Unit]] = js.native
    
    var onMouseOver: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[MouseEvent], Unit]] = js.native
    
    var onMouseUp: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[MouseEvent], Unit]] = js.native
    
    var onTap: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[Event], Unit]] = js.native
    
    var onTouchEnd: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[TouchEvent], Unit]] = js.native
    
    var onTouchMove: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[TouchEvent], Unit]] = js.native
    
    var onTouchStart: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[TouchEvent], Unit]] = js.native
    
    var onTransform: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[Event], Unit]] = js.native
    
    var onTransformEnd: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[Event], Unit]] = js.native
    
    var onTransformStart: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[Event], Unit]] = js.native
    
    var onWheel: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[WheelEvent], Unit]] = js.native
  }
  object KonvaNodeEvents {
    
    @scala.inline
    def apply(): KonvaNodeEvents = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KonvaNodeEvents]
    }
    
    @scala.inline
    implicit class KonvaNodeEventsMutableBuilder[Self <: KonvaNodeEvents] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnClick(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnContextMenu(value: /* evt */ KonvaEventObject[PointerEvent] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      @scala.inline
      def setOnDblClick(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): Self = StObject.set(x, "onDblClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDblClickUndefined: Self = StObject.set(x, "onDblClick", js.undefined)
      
      @scala.inline
      def setOnDblTap(value: /* evt */ KonvaEventObject[Event] => Unit): Self = StObject.set(x, "onDblTap", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDblTapUndefined: Self = StObject.set(x, "onDblTap", js.undefined)
      
      @scala.inline
      def setOnDragEnd(value: /* evt */ KonvaEventObject[DragEvent] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      @scala.inline
      def setOnDragMove(value: /* evt */ KonvaEventObject[DragEvent] => Unit): Self = StObject.set(x, "onDragMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragMoveUndefined: Self = StObject.set(x, "onDragMove", js.undefined)
      
      @scala.inline
      def setOnDragStart(value: /* evt */ KonvaEventObject[DragEvent] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      @scala.inline
      def setOnMouseDown(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOnMouseMove(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      @scala.inline
      def setOnMouseOut(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
      
      @scala.inline
      def setOnMouseOver(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      @scala.inline
      def setOnMouseUp(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      @scala.inline
      def setOnTap(value: /* evt */ KonvaEventObject[Event] => Unit): Self = StObject.set(x, "onTap", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTapUndefined: Self = StObject.set(x, "onTap", js.undefined)
      
      @scala.inline
      def setOnTouchEnd(value: /* evt */ KonvaEventObject[TouchEvent] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      @scala.inline
      def setOnTouchMove(value: /* evt */ KonvaEventObject[TouchEvent] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      @scala.inline
      def setOnTouchStart(value: /* evt */ KonvaEventObject[TouchEvent] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      @scala.inline
      def setOnTransform(value: /* evt */ KonvaEventObject[Event] => Unit): Self = StObject.set(x, "onTransform", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTransformEnd(value: /* evt */ KonvaEventObject[Event] => Unit): Self = StObject.set(x, "onTransformEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTransformEndUndefined: Self = StObject.set(x, "onTransformEnd", js.undefined)
      
      @scala.inline
      def setOnTransformStart(value: /* evt */ KonvaEventObject[Event] => Unit): Self = StObject.set(x, "onTransformStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTransformStartUndefined: Self = StObject.set(x, "onTransformStart", js.undefined)
      
      @scala.inline
      def setOnTransformUndefined: Self = StObject.set(x, "onTransform", js.undefined)
      
      @scala.inline
      def setOnWheel(value: /* evt */ KonvaEventObject[WheelEvent] => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
    }
  }
  
  /* Inlined parent konva.konva.default.NodeConfig */
  /* Inlined parent react-konva.react-konva/lib/ReactKonvaCore.KonvaNodeEvents */
  /* Inlined parent std.Pick<react.react.HTMLProps<any>, 'className' | 'role' | 'style' | 'tabIndex' | 'title'> */
  @js.native
  trait StageProps
    extends /* index */ StringDictionary[js.Any] {
    
    var className: js.UndefOr[String] = js.native
    
    var dragBoundFunc: js.UndefOr[
        js.ThisFunction1[/* this */ typings.konva.nodeMod.Node[this.type], /* pos */ Vector2d, Vector2d]
      ] = js.native
    
    var dragDistance: js.UndefOr[Double] = js.native
    
    var draggable: js.UndefOr[Boolean] = js.native
    
    var filters: js.UndefOr[js.Array[Filter]] = js.native
    
    var globalCompositeOperation: js.UndefOr[globalCompositeOperationType] = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var listening: js.UndefOr[Boolean] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var offset: js.UndefOr[Vector2d] = js.native
    
    var offsetX: js.UndefOr[Double] = js.native
    
    var offsetY: js.UndefOr[Double] = js.native
    
    var onClick: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[MouseEvent], Unit]] = js.native
    
    var onContentClick: js.UndefOr[js.Function1[/* evt */ js.Any, Unit]] = js.native
    
    var onContentDblclick: js.UndefOr[js.Function1[/* evt */ js.Any, Unit]] = js.native
    
    var onContentDbltap: js.UndefOr[js.Function1[/* evt */ js.Any, Unit]] = js.native
    
    var onContentMousedown: js.UndefOr[js.Function1[/* evt */ js.Any, Unit]] = js.native
    
    var onContentMousemove: js.UndefOr[js.Function1[/* evt */ js.Any, Unit]] = js.native
    
    var onContentMouseout: js.UndefOr[js.Function1[/* evt */ js.Any, Unit]] = js.native
    
    var onContentMouseover: js.UndefOr[js.Function1[/* evt */ js.Any, Unit]] = js.native
    
    var onContentMouseup: js.UndefOr[js.Function1[/* evt */ js.Any, Unit]] = js.native
    
    var onContentTap: js.UndefOr[js.Function1[/* evt */ js.Any, Unit]] = js.native
    
    var onContentTouchend: js.UndefOr[js.Function1[/* evt */ js.Any, Unit]] = js.native
    
    var onContentTouchmove: js.UndefOr[js.Function1[/* evt */ js.Any, Unit]] = js.native
    
    var onContentTouchstart: js.UndefOr[js.Function1[/* evt */ js.Any, Unit]] = js.native
    
    var onContentWheel: js.UndefOr[js.Function1[/* evt */ js.Any, Unit]] = js.native
    
    var onContextMenu: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[PointerEvent], Unit]] = js.native
    
    var onDblClick: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[MouseEvent], Unit]] = js.native
    
    var onDblTap: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[Event], Unit]] = js.native
    
    var onDragEnd: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[DragEvent], Unit]] = js.native
    
    var onDragMove: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[DragEvent], Unit]] = js.native
    
    var onDragStart: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[DragEvent], Unit]] = js.native
    
    var onMouseDown: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[MouseEvent], Unit]] = js.native
    
    var onMouseEnter: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[MouseEvent], Unit]] = js.native
    
    var onMouseLeave: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[MouseEvent], Unit]] = js.native
    
    var onMouseMove: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[MouseEvent], Unit]] = js.native
    
    var onMouseOut: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[MouseEvent], Unit]] = js.native
    
    var onMouseOver: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[MouseEvent], Unit]] = js.native
    
    var onMouseUp: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[MouseEvent], Unit]] = js.native
    
    var onTap: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[Event], Unit]] = js.native
    
    var onTouchEnd: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[TouchEvent], Unit]] = js.native
    
    var onTouchMove: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[TouchEvent], Unit]] = js.native
    
    var onTouchStart: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[TouchEvent], Unit]] = js.native
    
    var onTransform: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[Event], Unit]] = js.native
    
    var onTransformEnd: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[Event], Unit]] = js.native
    
    var onTransformStart: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[Event], Unit]] = js.native
    
    var onWheel: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[WheelEvent], Unit]] = js.native
    
    var opacity: js.UndefOr[Number] = js.native
    
    var preventDefault: js.UndefOr[Boolean] = js.native
    
    var role: js.UndefOr[String] = js.native
    
    var rotation: js.UndefOr[Double] = js.native
    
    var rotationDeg: js.UndefOr[Double] = js.native
    
    var scale: js.UndefOr[Vector2d] = js.native
    
    var scaleX: js.UndefOr[Double] = js.native
    
    var scaleY: js.UndefOr[Double] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var tabIndex: js.UndefOr[Double] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var visible: js.UndefOr[Boolean] = js.native
    
    var width: js.UndefOr[Double] = js.native
    
    var x: js.UndefOr[Double] = js.native
    
    var y: js.UndefOr[Double] = js.native
  }
  object StageProps {
    
    @scala.inline
    def apply(): StageProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StageProps]
    }
    
    @scala.inline
    implicit class StagePropsMutableBuilder[Self <: StageProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDragBoundFunc(
        value: js.ThisFunction1[/* this */ typings.konva.nodeMod.Node[StageProps], /* pos */ Vector2d, Vector2d]
      ): Self = StObject.set(x, "dragBoundFunc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragBoundFuncUndefined: Self = StObject.set(x, "dragBoundFunc", js.undefined)
      
      @scala.inline
      def setDragDistance(value: Double): Self = StObject.set(x, "dragDistance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragDistanceUndefined: Self = StObject.set(x, "dragDistance", js.undefined)
      
      @scala.inline
      def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      @scala.inline
      def setFilters(value: js.Array[Filter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setGlobalCompositeOperation(value: globalCompositeOperationType): Self = StObject.set(x, "globalCompositeOperation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalCompositeOperationUndefined: Self = StObject.set(x, "globalCompositeOperation", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setListening(value: Boolean): Self = StObject.set(x, "listening", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListeningUndefined: Self = StObject.set(x, "listening", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOffset(value: Vector2d): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
      
      @scala.inline
      def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnContentClick(value: /* evt */ js.Any => Unit): Self = StObject.set(x, "onContentClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContentClickUndefined: Self = StObject.set(x, "onContentClick", js.undefined)
      
      @scala.inline
      def setOnContentDblclick(value: /* evt */ js.Any => Unit): Self = StObject.set(x, "onContentDblclick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContentDblclickUndefined: Self = StObject.set(x, "onContentDblclick", js.undefined)
      
      @scala.inline
      def setOnContentDbltap(value: /* evt */ js.Any => Unit): Self = StObject.set(x, "onContentDbltap", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContentDbltapUndefined: Self = StObject.set(x, "onContentDbltap", js.undefined)
      
      @scala.inline
      def setOnContentMousedown(value: /* evt */ js.Any => Unit): Self = StObject.set(x, "onContentMousedown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContentMousedownUndefined: Self = StObject.set(x, "onContentMousedown", js.undefined)
      
      @scala.inline
      def setOnContentMousemove(value: /* evt */ js.Any => Unit): Self = StObject.set(x, "onContentMousemove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContentMousemoveUndefined: Self = StObject.set(x, "onContentMousemove", js.undefined)
      
      @scala.inline
      def setOnContentMouseout(value: /* evt */ js.Any => Unit): Self = StObject.set(x, "onContentMouseout", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContentMouseoutUndefined: Self = StObject.set(x, "onContentMouseout", js.undefined)
      
      @scala.inline
      def setOnContentMouseover(value: /* evt */ js.Any => Unit): Self = StObject.set(x, "onContentMouseover", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContentMouseoverUndefined: Self = StObject.set(x, "onContentMouseover", js.undefined)
      
      @scala.inline
      def setOnContentMouseup(value: /* evt */ js.Any => Unit): Self = StObject.set(x, "onContentMouseup", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContentMouseupUndefined: Self = StObject.set(x, "onContentMouseup", js.undefined)
      
      @scala.inline
      def setOnContentTap(value: /* evt */ js.Any => Unit): Self = StObject.set(x, "onContentTap", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContentTapUndefined: Self = StObject.set(x, "onContentTap", js.undefined)
      
      @scala.inline
      def setOnContentTouchend(value: /* evt */ js.Any => Unit): Self = StObject.set(x, "onContentTouchend", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContentTouchendUndefined: Self = StObject.set(x, "onContentTouchend", js.undefined)
      
      @scala.inline
      def setOnContentTouchmove(value: /* evt */ js.Any => Unit): Self = StObject.set(x, "onContentTouchmove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContentTouchmoveUndefined: Self = StObject.set(x, "onContentTouchmove", js.undefined)
      
      @scala.inline
      def setOnContentTouchstart(value: /* evt */ js.Any => Unit): Self = StObject.set(x, "onContentTouchstart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContentTouchstartUndefined: Self = StObject.set(x, "onContentTouchstart", js.undefined)
      
      @scala.inline
      def setOnContentWheel(value: /* evt */ js.Any => Unit): Self = StObject.set(x, "onContentWheel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContentWheelUndefined: Self = StObject.set(x, "onContentWheel", js.undefined)
      
      @scala.inline
      def setOnContextMenu(value: /* evt */ KonvaEventObject[PointerEvent] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      @scala.inline
      def setOnDblClick(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): Self = StObject.set(x, "onDblClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDblClickUndefined: Self = StObject.set(x, "onDblClick", js.undefined)
      
      @scala.inline
      def setOnDblTap(value: /* evt */ KonvaEventObject[Event] => Unit): Self = StObject.set(x, "onDblTap", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDblTapUndefined: Self = StObject.set(x, "onDblTap", js.undefined)
      
      @scala.inline
      def setOnDragEnd(value: /* evt */ KonvaEventObject[DragEvent] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      @scala.inline
      def setOnDragMove(value: /* evt */ KonvaEventObject[DragEvent] => Unit): Self = StObject.set(x, "onDragMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragMoveUndefined: Self = StObject.set(x, "onDragMove", js.undefined)
      
      @scala.inline
      def setOnDragStart(value: /* evt */ KonvaEventObject[DragEvent] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      @scala.inline
      def setOnMouseDown(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOnMouseMove(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      @scala.inline
      def setOnMouseOut(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
      
      @scala.inline
      def setOnMouseOver(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      @scala.inline
      def setOnMouseUp(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      @scala.inline
      def setOnTap(value: /* evt */ KonvaEventObject[Event] => Unit): Self = StObject.set(x, "onTap", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTapUndefined: Self = StObject.set(x, "onTap", js.undefined)
      
      @scala.inline
      def setOnTouchEnd(value: /* evt */ KonvaEventObject[TouchEvent] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      @scala.inline
      def setOnTouchMove(value: /* evt */ KonvaEventObject[TouchEvent] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      @scala.inline
      def setOnTouchStart(value: /* evt */ KonvaEventObject[TouchEvent] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      @scala.inline
      def setOnTransform(value: /* evt */ KonvaEventObject[Event] => Unit): Self = StObject.set(x, "onTransform", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTransformEnd(value: /* evt */ KonvaEventObject[Event] => Unit): Self = StObject.set(x, "onTransformEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTransformEndUndefined: Self = StObject.set(x, "onTransformEnd", js.undefined)
      
      @scala.inline
      def setOnTransformStart(value: /* evt */ KonvaEventObject[Event] => Unit): Self = StObject.set(x, "onTransformStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTransformStartUndefined: Self = StObject.set(x, "onTransformStart", js.undefined)
      
      @scala.inline
      def setOnTransformUndefined: Self = StObject.set(x, "onTransform", js.undefined)
      
      @scala.inline
      def setOnWheel(value: /* evt */ KonvaEventObject[WheelEvent] => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
      
      @scala.inline
      def setOpacity(value: Number): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setPreventDefault(value: Boolean): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationDeg(value: Double): Self = StObject.set(x, "rotationDeg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationDegUndefined: Self = StObject.set(x, "rotationDeg", js.undefined)
      
      @scala.inline
      def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      @scala.inline
      def setScale(value: Vector2d): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      @scala.inline
      def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleXUndefined: Self = StObject.set(x, "scaleX", js.undefined)
      
      @scala.inline
      def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleYUndefined: Self = StObject.set(x, "scaleY", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
}
