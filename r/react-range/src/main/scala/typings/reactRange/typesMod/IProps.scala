package typings.reactRange.typesMod

import typings.react.mod.ReactNode
import typings.reactRange.anon.Children
import typings.reactRange.anon.Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProps extends js.Object {
  var allowOverlap: Boolean
  var direction: Direction
  var disabled: Boolean
  var max: Double
  var min: Double
  var onFinalChange: js.UndefOr[js.Function1[/* values */ js.Array[Double], Unit]] = js.undefined
  var rtl: Boolean
  var step: Double
  var values: js.Array[Double]
  def onChange(values: js.Array[Double]): Unit
  def renderThumb(params: Index): ReactNode
  def renderTrack(params: Children): ReactNode
}

object IProps {
  @scala.inline
  def apply(
    allowOverlap: Boolean,
    direction: Direction,
    disabled: Boolean,
    max: Double,
    min: Double,
    onChange: js.Array[Double] => Unit,
    renderThumb: Index => ReactNode,
    renderTrack: Children => ReactNode,
    rtl: Boolean,
    step: Double,
    values: js.Array[Double],
    onFinalChange: /* values */ js.Array[Double] => Unit = null
  ): IProps = {
    val __obj = js.Dynamic.literal(allowOverlap = allowOverlap.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), renderThumb = js.Any.fromFunction1(renderThumb), renderTrack = js.Any.fromFunction1(renderTrack), rtl = rtl.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    if (onFinalChange != null) __obj.updateDynamic("onFinalChange")(js.Any.fromFunction1(onFinalChange))
    __obj.asInstanceOf[IProps]
  }
}

