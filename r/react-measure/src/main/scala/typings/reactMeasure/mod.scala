package typings.reactMeasure

import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.Ref
import typings.react.mod.SFC
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-measure", JSImport.Default)
  @js.native
  class default ()
    extends Component[MeasureProps, js.Object, js.Any]
  
  @JSImport("react-measure", "withContentRect")
  @js.native
  def withContentRect(types: js.Array[MeasurementType]): js.Function1[/* fn */ MeasuredComponent[js.Object], ComponentType[js.Object]] = js.native
  @JSImport("react-measure", "withContentRect")
  @js.native
  def withContentRect(types: MeasurementType): js.Function1[/* fn */ MeasuredComponent[js.Object], ComponentType[js.Object]] = js.native
  
  @js.native
  trait BottomRight extends StObject {
    
    val bottom: Double = js.native
    
    val right: Double = js.native
  }
  object BottomRight {
    
    @scala.inline
    def apply(bottom: Double, right: Double): BottomRight = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[BottomRight]
    }
    
    @scala.inline
    implicit class BottomRightMutableBuilder[Self <: BottomRight] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    }
  }
  
  type BoundingRect = Dimensions with Margin
  
  @js.native
  trait ContentRect extends StObject {
    
    var bounds: js.UndefOr[BoundingRect] = js.native
    
    var client: js.UndefOr[Rect] = js.native
    
    var entry: js.UndefOr[js.Any] = js.native
    
    var margin: js.UndefOr[Margin] = js.native
    
    var offset: js.UndefOr[Rect] = js.native
    
    var scroll: js.UndefOr[Rect] = js.native
  }
  object ContentRect {
    
    @scala.inline
    def apply(): ContentRect = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContentRect]
    }
    
    @scala.inline
    implicit class ContentRectMutableBuilder[Self <: ContentRect] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBounds(value: BoundingRect): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      @scala.inline
      def setClient(value: Rect): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      @scala.inline
      def setEntry(value: js.Any): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntryUndefined: Self = StObject.set(x, "entry", js.undefined)
      
      @scala.inline
      def setMargin(value: Margin): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setOffset(value: Rect): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setScroll(value: Rect): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
    }
  }
  
  @js.native
  trait Dimensions extends StObject {
    
    val height: Double = js.native
    
    val width: Double = js.native
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
  
  type Margin = TopLeft with BottomRight
  
  type Measure = Component[MeasureProps, js.Object, js.Any]
  
  @js.native
  trait MeasureProps extends StObject {
    
    var bounds: js.UndefOr[Boolean] = js.native
    
    var children: js.UndefOr[SFC[MeasuredComponentProps]] = js.native
    
    var client: js.UndefOr[Boolean] = js.native
    
    var innerRef: js.UndefOr[Ref[Element]] = js.native
    
    var margin: js.UndefOr[Boolean] = js.native
    
    var offset: js.UndefOr[Boolean] = js.native
    
    var onResize: js.UndefOr[js.Function1[/* contentRect */ ContentRect, Unit]] = js.native
    
    var scroll: js.UndefOr[Boolean] = js.native
  }
  object MeasureProps {
    
    @scala.inline
    def apply(): MeasureProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MeasureProps]
    }
    
    @scala.inline
    implicit class MeasurePropsMutableBuilder[Self <: MeasureProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBounds(value: Boolean): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      @scala.inline
      def setChildren(value: SFC[MeasuredComponentProps]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClient(value: Boolean): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      @scala.inline
      def setInnerRef(value: Ref[Element]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefFunction1(value: /* instance */ Element | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      @scala.inline
      def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      @scala.inline
      def setMargin(value: Boolean): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setOffset(value: Boolean): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOnResize(value: /* contentRect */ ContentRect => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      @scala.inline
      def setScroll(value: Boolean): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
    }
  }
  
  type MeasuredComponent[T] = ComponentType[T with MeasuredComponentProps]
  
  @js.native
  trait MeasuredComponentProps extends StObject {
    
    var contentRect: ContentRect = js.native
    
    def measure(): Unit = js.native
    
    def measureRef(): Unit = js.native
    def measureRef(ref: Element): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMeasure.reactMeasureStrings.client
    - typings.reactMeasure.reactMeasureStrings.offset
    - typings.reactMeasure.reactMeasureStrings.scroll
    - typings.reactMeasure.reactMeasureStrings.bounds
    - typings.reactMeasure.reactMeasureStrings.margin
  */
  trait MeasurementType extends StObject
  object MeasurementType {
    
    @scala.inline
    def bounds: typings.reactMeasure.reactMeasureStrings.bounds = "bounds".asInstanceOf[typings.reactMeasure.reactMeasureStrings.bounds]
    
    @scala.inline
    def client: typings.reactMeasure.reactMeasureStrings.client = "client".asInstanceOf[typings.reactMeasure.reactMeasureStrings.client]
    
    @scala.inline
    def margin: typings.reactMeasure.reactMeasureStrings.margin = "margin".asInstanceOf[typings.reactMeasure.reactMeasureStrings.margin]
    
    @scala.inline
    def offset: typings.reactMeasure.reactMeasureStrings.offset = "offset".asInstanceOf[typings.reactMeasure.reactMeasureStrings.offset]
    
    @scala.inline
    def scroll: typings.reactMeasure.reactMeasureStrings.scroll = "scroll".asInstanceOf[typings.reactMeasure.reactMeasureStrings.scroll]
  }
  
  type Rect = TopLeft with Dimensions
  
  @js.native
  trait TopLeft extends StObject {
    
    val left: Double = js.native
    
    val top: Double = js.native
  }
  object TopLeft {
    
    @scala.inline
    def apply(left: Double, top: Double): TopLeft = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[TopLeft]
    }
    
    @scala.inline
    implicit class TopLeftMutableBuilder[Self <: TopLeft] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
}
