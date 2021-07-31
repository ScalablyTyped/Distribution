package typings.reactVis.mod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.reactVis.anon.Links
import typings.reactVis.anon.Source
import typings.reactVis.reactVisStrings.center
import typings.reactVis.reactVisStrings.justify
import typings.reactVis.reactVisStrings.left
import typings.reactVis.reactVisStrings.right
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SankeyProps extends StObject {
  
  var align: js.UndefOr[justify | left | right | center] = js.undefined
  
  // default: 'justify'
  var className: js.UndefOr[String] = js.undefined
  
  // default: ''
  var hasVoronoi: js.UndefOr[Boolean] = js.undefined
  
  // default: false
  var height: Double
  
  var hideLabels: js.UndefOr[Boolean] = js.undefined
  
  // default: false
  var layout: js.UndefOr[Double] = js.undefined
  
  // default: 50
  var links: js.Array[Source]
  
  var margin: js.UndefOr[Margin | Double] = js.undefined
  
  // default: {'top':20,'left':20,'right':20,'bottom':20}
  var nodePadding: js.UndefOr[Double] = js.undefined
  
  var nodeWidth: js.UndefOr[Double] = js.undefined
  
  // default: 10
  var nodes: js.Array[SankeyPoint]
  
  var onLinkClick: js.UndefOr[RVValueEventHandler[SankeyPoint]] = js.undefined
  
  var onLinkMouseOut: js.UndefOr[RVValueEventHandler[SankeyPoint]] = js.undefined
  
  var onLinkMouseOver: js.UndefOr[RVValueEventHandler[SankeyPoint]] = js.undefined
  
  var onValueClick: js.UndefOr[RVValueEventHandler[SankeyPoint]] = js.undefined
  
  var onValueMouseOut: js.UndefOr[RVValueEventHandler[SankeyPoint]] = js.undefined
  
  // default: 10
  var onValueMouseOver: js.UndefOr[RVValueEventHandler[SankeyPoint]] = js.undefined
  
  var style: js.UndefOr[Links] = js.undefined
  
  // default: {'links':{},'rects':{},'labels':{}}
  var width: Double
}
object SankeyProps {
  
  @scala.inline
  def apply(height: Double, links: js.Array[Source], nodes: js.Array[SankeyPoint], width: Double): SankeyProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SankeyProps]
  }
  
  @scala.inline
  implicit class SankeyPropsMutableBuilder[Self <: SankeyProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: justify | left | right | center): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setHasVoronoi(value: Boolean): Self = StObject.set(x, "hasVoronoi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasVoronoiUndefined: Self = StObject.set(x, "hasVoronoi", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideLabels(value: Boolean): Self = StObject.set(x, "hideLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideLabelsUndefined: Self = StObject.set(x, "hideLabels", js.undefined)
    
    @scala.inline
    def setLayout(value: Double): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setLinks(value: js.Array[Source]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinksVarargs(value: Source*): Self = StObject.set(x, "links", js.Array(value :_*))
    
    @scala.inline
    def setMargin(value: Margin | Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    @scala.inline
    def setNodePadding(value: Double): Self = StObject.set(x, "nodePadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodePaddingUndefined: Self = StObject.set(x, "nodePadding", js.undefined)
    
    @scala.inline
    def setNodeWidth(value: Double): Self = StObject.set(x, "nodeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeWidthUndefined: Self = StObject.set(x, "nodeWidth", js.undefined)
    
    @scala.inline
    def setNodes(value: js.Array[SankeyPoint]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesVarargs(value: SankeyPoint*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    
    @scala.inline
    def setOnLinkClick(value: (SankeyPoint, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onLinkClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnLinkClickUndefined: Self = StObject.set(x, "onLinkClick", js.undefined)
    
    @scala.inline
    def setOnLinkMouseOut(value: (SankeyPoint, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onLinkMouseOut", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnLinkMouseOutUndefined: Self = StObject.set(x, "onLinkMouseOut", js.undefined)
    
    @scala.inline
    def setOnLinkMouseOver(value: (SankeyPoint, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onLinkMouseOver", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnLinkMouseOverUndefined: Self = StObject.set(x, "onLinkMouseOver", js.undefined)
    
    @scala.inline
    def setOnValueClick(value: (SankeyPoint, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onValueClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnValueClickUndefined: Self = StObject.set(x, "onValueClick", js.undefined)
    
    @scala.inline
    def setOnValueMouseOut(value: (SankeyPoint, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onValueMouseOut", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnValueMouseOutUndefined: Self = StObject.set(x, "onValueMouseOut", js.undefined)
    
    @scala.inline
    def setOnValueMouseOver(value: (SankeyPoint, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onValueMouseOver", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnValueMouseOverUndefined: Self = StObject.set(x, "onValueMouseOver", js.undefined)
    
    @scala.inline
    def setStyle(value: Links): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
