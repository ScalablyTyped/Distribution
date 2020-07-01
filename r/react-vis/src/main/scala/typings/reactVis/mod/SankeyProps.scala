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

trait SankeyProps extends js.Object {
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
  def apply(
    height: Double,
    links: js.Array[Source],
    nodes: js.Array[SankeyPoint],
    width: Double,
    align: justify | left | right | center = null,
    className: String = null,
    hasVoronoi: js.UndefOr[Boolean] = js.undefined,
    hideLabels: js.UndefOr[Boolean] = js.undefined,
    layout: js.UndefOr[Double] = js.undefined,
    margin: Margin | Double = null,
    nodePadding: js.UndefOr[Double] = js.undefined,
    nodeWidth: js.UndefOr[Double] = js.undefined,
    onLinkClick: (SankeyPoint, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit = null,
    onLinkMouseOut: (SankeyPoint, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit = null,
    onLinkMouseOver: (SankeyPoint, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit = null,
    onValueClick: (SankeyPoint, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit = null,
    onValueMouseOut: (SankeyPoint, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit = null,
    onValueMouseOver: (SankeyPoint, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit = null,
    style: Links = null
  ): SankeyProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(hasVoronoi)) __obj.updateDynamic("hasVoronoi")(hasVoronoi.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideLabels)) __obj.updateDynamic("hideLabels")(hideLabels.get.asInstanceOf[js.Any])
    if (!js.isUndefined(layout)) __obj.updateDynamic("layout")(layout.get.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(nodePadding)) __obj.updateDynamic("nodePadding")(nodePadding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nodeWidth)) __obj.updateDynamic("nodeWidth")(nodeWidth.get.asInstanceOf[js.Any])
    if (onLinkClick != null) __obj.updateDynamic("onLinkClick")(js.Any.fromFunction2(onLinkClick))
    if (onLinkMouseOut != null) __obj.updateDynamic("onLinkMouseOut")(js.Any.fromFunction2(onLinkMouseOut))
    if (onLinkMouseOver != null) __obj.updateDynamic("onLinkMouseOver")(js.Any.fromFunction2(onLinkMouseOver))
    if (onValueClick != null) __obj.updateDynamic("onValueClick")(js.Any.fromFunction2(onValueClick))
    if (onValueMouseOut != null) __obj.updateDynamic("onValueMouseOut")(js.Any.fromFunction2(onValueMouseOut))
    if (onValueMouseOver != null) __obj.updateDynamic("onValueMouseOver")(js.Any.fromFunction2(onValueMouseOver))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SankeyProps]
  }
}

