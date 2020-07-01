package typings.reactVis.mod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.reactVis.reactVisStrings.angle
import typings.reactVis.reactVisStrings.angle0
import typings.reactVis.reactVisStrings.label
import typings.reactVis.reactVisStrings.size
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SunburstProps extends js.Object {
  var animation: js.UndefOr[String | AnimationParam | Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
   // default: ''
  var colorType: js.UndefOr[String] = js.undefined
   // default: 'literal'
  var data: SunburstPoint
  var getAngle: js.UndefOr[RVGet[SunburstPoint, angle]] = js.undefined
  var getAngle0: js.UndefOr[RVGet[SunburstPoint, angle0]] = js.undefined
   // default: false
  var getLabel: js.UndefOr[RVGet[SunburstPoint, label]] = js.undefined
  var getSize: js.UndefOr[RVGet[SunburstPoint, size]] = js.undefined
  var height: Double
  var hideRootNode: js.UndefOr[Boolean] = js.undefined
  var onValueClick: js.UndefOr[RVValueEventHandler[SunburstPoint]] = js.undefined
  var onValueMouseOut: js.UndefOr[RVValueEventHandler[SunburstPoint]] = js.undefined
  var onValueMouseOver: js.UndefOr[RVValueEventHandler[SunburstPoint]] = js.undefined
  var width: Double
}

object SunburstProps {
  @scala.inline
  def apply(
    data: SunburstPoint,
    height: Double,
    width: Double,
    animation: String | AnimationParam | Boolean = null,
    className: String = null,
    colorType: String = null,
    getAngle: SunburstPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any = null,
    getAngle0: SunburstPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any = null,
    getLabel: SunburstPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any = null,
    getSize: SunburstPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any = null,
    hideRootNode: js.UndefOr[Boolean] = js.undefined,
    onValueClick: (SunburstPoint, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit = null,
    onValueMouseOut: (SunburstPoint, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit = null,
    onValueMouseOver: (SunburstPoint, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit = null
  ): SunburstProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (colorType != null) __obj.updateDynamic("colorType")(colorType.asInstanceOf[js.Any])
    if (getAngle != null) __obj.updateDynamic("getAngle")(js.Any.fromFunction1(getAngle))
    if (getAngle0 != null) __obj.updateDynamic("getAngle0")(js.Any.fromFunction1(getAngle0))
    if (getLabel != null) __obj.updateDynamic("getLabel")(js.Any.fromFunction1(getLabel))
    if (getSize != null) __obj.updateDynamic("getSize")(js.Any.fromFunction1(getSize))
    if (!js.isUndefined(hideRootNode)) __obj.updateDynamic("hideRootNode")(hideRootNode.get.asInstanceOf[js.Any])
    if (onValueClick != null) __obj.updateDynamic("onValueClick")(js.Any.fromFunction2(onValueClick))
    if (onValueMouseOut != null) __obj.updateDynamic("onValueMouseOut")(js.Any.fromFunction2(onValueMouseOut))
    if (onValueMouseOver != null) __obj.updateDynamic("onValueMouseOver")(js.Any.fromFunction2(onValueMouseOver))
    __obj.asInstanceOf[SunburstProps]
  }
}

