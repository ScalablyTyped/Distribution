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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SankeyProps extends js.Object {
  var align: js.UndefOr[justify | left | right | center] = js.native
   // default: 'justify'
  var className: js.UndefOr[String] = js.native
   // default: ''
  var hasVoronoi: js.UndefOr[Boolean] = js.native
   // default: false
  var height: Double = js.native
  var hideLabels: js.UndefOr[Boolean] = js.native
   // default: false
  var layout: js.UndefOr[Double] = js.native
   // default: 50
  var links: js.Array[Source] = js.native
  var margin: js.UndefOr[Margin | Double] = js.native
   // default: {'top':20,'left':20,'right':20,'bottom':20}
  var nodePadding: js.UndefOr[Double] = js.native
  var nodeWidth: js.UndefOr[Double] = js.native
   // default: 10
  var nodes: js.Array[SankeyPoint] = js.native
  var onLinkClick: js.UndefOr[RVValueEventHandler[SankeyPoint]] = js.native
  var onLinkMouseOut: js.UndefOr[RVValueEventHandler[SankeyPoint]] = js.native
  var onLinkMouseOver: js.UndefOr[RVValueEventHandler[SankeyPoint]] = js.native
  var onValueClick: js.UndefOr[RVValueEventHandler[SankeyPoint]] = js.native
  var onValueMouseOut: js.UndefOr[RVValueEventHandler[SankeyPoint]] = js.native
   // default: 10
  var onValueMouseOver: js.UndefOr[RVValueEventHandler[SankeyPoint]] = js.native
  var style: js.UndefOr[Links] = js.native
   // default: {'links':{},'rects':{},'labels':{}}
  var width: Double = js.native
}

object SankeyProps {
  @scala.inline
  def apply(height: Double, links: js.Array[Source], nodes: js.Array[SankeyPoint], width: Double): SankeyProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SankeyProps]
  }
  @scala.inline
  implicit class SankeyPropsOps[Self <: SankeyProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinksVarargs(value: Source*): Self = this.set("links", js.Array(value :_*))
    @scala.inline
    def setLinks(value: js.Array[Source]): Self = this.set("links", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodesVarargs(value: SankeyPoint*): Self = this.set("nodes", js.Array(value :_*))
    @scala.inline
    def setNodes(value: js.Array[SankeyPoint]): Self = this.set("nodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlign(value: justify | left | right | center): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setHasVoronoi(value: Boolean): Self = this.set("hasVoronoi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasVoronoi: Self = this.set("hasVoronoi", js.undefined)
    @scala.inline
    def setHideLabels(value: Boolean): Self = this.set("hideLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideLabels: Self = this.set("hideLabels", js.undefined)
    @scala.inline
    def setLayout(value: Double): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    @scala.inline
    def setMargin(value: Margin | Double): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setNodePadding(value: Double): Self = this.set("nodePadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodePadding: Self = this.set("nodePadding", js.undefined)
    @scala.inline
    def setNodeWidth(value: Double): Self = this.set("nodeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeWidth: Self = this.set("nodeWidth", js.undefined)
    @scala.inline
    def setOnLinkClick(value: (SankeyPoint, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = this.set("onLinkClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnLinkClick: Self = this.set("onLinkClick", js.undefined)
    @scala.inline
    def setOnLinkMouseOut(value: (SankeyPoint, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = this.set("onLinkMouseOut", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnLinkMouseOut: Self = this.set("onLinkMouseOut", js.undefined)
    @scala.inline
    def setOnLinkMouseOver(value: (SankeyPoint, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = this.set("onLinkMouseOver", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnLinkMouseOver: Self = this.set("onLinkMouseOver", js.undefined)
    @scala.inline
    def setOnValueClick(value: (SankeyPoint, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = this.set("onValueClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnValueClick: Self = this.set("onValueClick", js.undefined)
    @scala.inline
    def setOnValueMouseOut(value: (SankeyPoint, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = this.set("onValueMouseOut", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnValueMouseOut: Self = this.set("onValueMouseOut", js.undefined)
    @scala.inline
    def setOnValueMouseOver(value: (SankeyPoint, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = this.set("onValueMouseOver", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnValueMouseOver: Self = this.set("onValueMouseOver", js.undefined)
    @scala.inline
    def setStyle(value: Links): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

