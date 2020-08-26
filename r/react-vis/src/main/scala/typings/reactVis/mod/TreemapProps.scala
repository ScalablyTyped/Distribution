package typings.reactVis.mod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.reactVis.reactVisStrings.`partition-pivot`
import typings.reactVis.reactVisStrings.binary
import typings.reactVis.reactVisStrings.circlePack
import typings.reactVis.reactVisStrings.color
import typings.reactVis.reactVisStrings.dice
import typings.reactVis.reactVisStrings.partition
import typings.reactVis.reactVisStrings.resquarify
import typings.reactVis.reactVisStrings.size
import typings.reactVis.reactVisStrings.slice
import typings.reactVis.reactVisStrings.slicedice
import typings.reactVis.reactVisStrings.squarify
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreemapProps extends js.Object {
  var animation: js.UndefOr[String | AnimationParam | Boolean] = js.native
  var className: js.UndefOr[String] = js.native
   // default: ''
  var data: js.UndefOr[TreemapPoint] = js.native
  var getColor: js.UndefOr[RVGet[TreemapPoint, color]] = js.native
  var getSize: js.UndefOr[RVGet[TreemapPoint, size]] = js.native
   // default: {'children':[]}
  var height: Double = js.native
  var hideRootNode: js.UndefOr[Boolean] = js.native
   // default: false
  var margin: js.UndefOr[Margin | Double] = js.native
   // default: {'left':40,'right':10,'top':10,'bottom':40}
  var mode: js.UndefOr[
    squarify | resquarify | slice | dice | slicedice | binary | circlePack | partition | `partition-pivot`
  ] = js.native
   // default: 'squarify'
  var onLeafClick: js.UndefOr[RVValueEventHandler[TreemapPoint]] = js.native
  var onLeafMouseOut: js.UndefOr[RVValueEventHandler[TreemapPoint]] = js.native
  var onLeafMouseOver: js.UndefOr[RVValueEventHandler[TreemapPoint]] = js.native
  var padding: js.UndefOr[Double] = js.native
   // default: 1
  var sortFunction: js.UndefOr[
    js.Function3[/* a */ js.Any, /* b */ js.Any, /* getSize */ RVGet[TreemapPoint, size], Double]
  ] = js.native
  var useCirclePacking: js.UndefOr[Boolean] = js.native
  var width: Double = js.native
}

object TreemapProps {
  @scala.inline
  def apply(height: Double, width: Double): TreemapProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreemapProps]
  }
  @scala.inline
  implicit class TreemapPropsOps[Self <: TreemapProps] (val x: Self) extends AnyVal {
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
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimation(value: String | AnimationParam | Boolean): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setData(value: TreemapPoint): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setGetColor(
      value: TreemapPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): Self = this.set("getColor", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetColor: Self = this.set("getColor", js.undefined)
    @scala.inline
    def setGetSize(
      value: TreemapPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): Self = this.set("getSize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetSize: Self = this.set("getSize", js.undefined)
    @scala.inline
    def setHideRootNode(value: Boolean): Self = this.set("hideRootNode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideRootNode: Self = this.set("hideRootNode", js.undefined)
    @scala.inline
    def setMargin(value: Margin | Double): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setMode(
      value: squarify | resquarify | slice | dice | slicedice | binary | circlePack | partition | `partition-pivot`
    ): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setOnLeafClick(value: (TreemapPoint, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = this.set("onLeafClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnLeafClick: Self = this.set("onLeafClick", js.undefined)
    @scala.inline
    def setOnLeafMouseOut(value: (TreemapPoint, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = this.set("onLeafMouseOut", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnLeafMouseOut: Self = this.set("onLeafMouseOut", js.undefined)
    @scala.inline
    def setOnLeafMouseOver(value: (TreemapPoint, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = this.set("onLeafMouseOver", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnLeafMouseOver: Self = this.set("onLeafMouseOver", js.undefined)
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setSortFunction(value: (/* a */ js.Any, /* b */ js.Any, /* getSize */ RVGet[TreemapPoint, size]) => Double): Self = this.set("sortFunction", js.Any.fromFunction3(value))
    @scala.inline
    def deleteSortFunction: Self = this.set("sortFunction", js.undefined)
    @scala.inline
    def setUseCirclePacking(value: Boolean): Self = this.set("useCirclePacking", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseCirclePacking: Self = this.set("useCirclePacking", js.undefined)
  }
  
}

