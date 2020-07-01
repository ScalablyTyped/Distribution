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

trait TreemapProps extends js.Object {
  var animation: js.UndefOr[String | AnimationParam | Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
   // default: ''
  var data: js.UndefOr[TreemapPoint] = js.undefined
  var getColor: js.UndefOr[RVGet[TreemapPoint, color]] = js.undefined
  var getSize: js.UndefOr[RVGet[TreemapPoint, size]] = js.undefined
   // default: {'children':[]}
  var height: Double
  var hideRootNode: js.UndefOr[Boolean] = js.undefined
   // default: false
  var margin: js.UndefOr[Margin | Double] = js.undefined
   // default: {'left':40,'right':10,'top':10,'bottom':40}
  var mode: js.UndefOr[
    squarify | resquarify | slice | dice | slicedice | binary | circlePack | partition | `partition-pivot`
  ] = js.undefined
   // default: 'squarify'
  var onLeafClick: js.UndefOr[RVValueEventHandler[TreemapPoint]] = js.undefined
  var onLeafMouseOut: js.UndefOr[RVValueEventHandler[TreemapPoint]] = js.undefined
  var onLeafMouseOver: js.UndefOr[RVValueEventHandler[TreemapPoint]] = js.undefined
  var padding: js.UndefOr[Double] = js.undefined
   // default: 1
  var sortFunction: js.UndefOr[
    js.Function3[/* a */ js.Any, /* b */ js.Any, /* getSize */ RVGet[TreemapPoint, size], Double]
  ] = js.undefined
  var useCirclePacking: js.UndefOr[Boolean] = js.undefined
  var width: Double
}

object TreemapProps {
  @scala.inline
  def apply(
    height: Double,
    width: Double,
    animation: String | AnimationParam | Boolean = null,
    className: String = null,
    data: TreemapPoint = null,
    getColor: TreemapPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any = null,
    getSize: TreemapPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any = null,
    hideRootNode: js.UndefOr[Boolean] = js.undefined,
    margin: Margin | Double = null,
    mode: squarify | resquarify | slice | dice | slicedice | binary | circlePack | partition | `partition-pivot` = null,
    onLeafClick: (TreemapPoint, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit = null,
    onLeafMouseOut: (TreemapPoint, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit = null,
    onLeafMouseOver: (TreemapPoint, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit = null,
    padding: js.UndefOr[Double] = js.undefined,
    sortFunction: (/* a */ js.Any, /* b */ js.Any, /* getSize */ RVGet[TreemapPoint, size]) => Double = null,
    useCirclePacking: js.UndefOr[Boolean] = js.undefined
  ): TreemapProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (getColor != null) __obj.updateDynamic("getColor")(js.Any.fromFunction1(getColor))
    if (getSize != null) __obj.updateDynamic("getSize")(js.Any.fromFunction1(getSize))
    if (!js.isUndefined(hideRootNode)) __obj.updateDynamic("hideRootNode")(hideRootNode.get.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onLeafClick != null) __obj.updateDynamic("onLeafClick")(js.Any.fromFunction2(onLeafClick))
    if (onLeafMouseOut != null) __obj.updateDynamic("onLeafMouseOut")(js.Any.fromFunction2(onLeafMouseOut))
    if (onLeafMouseOver != null) __obj.updateDynamic("onLeafMouseOver")(js.Any.fromFunction2(onLeafMouseOver))
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.get.asInstanceOf[js.Any])
    if (sortFunction != null) __obj.updateDynamic("sortFunction")(js.Any.fromFunction3(sortFunction))
    if (!js.isUndefined(useCirclePacking)) __obj.updateDynamic("useCirclePacking")(useCirclePacking.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreemapProps]
  }
}

