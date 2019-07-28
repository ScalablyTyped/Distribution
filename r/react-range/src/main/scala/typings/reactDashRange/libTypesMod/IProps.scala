package typings.reactDashRange.libTypesMod

import typings.react.reactMod.ReactNode
import typings.reactDashRange.Anon_Children
import typings.reactDashRange.Anon_Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProps extends js.Object {
  var allowOverlap: Boolean
  var direction: Direction
  var disabled: Boolean
  var max: Double
  var min: Double
  var step: Double
  var values: js.Array[Double]
  def onChange(values: js.Array[Double]): Unit
  def renderThumb(params: Anon_Index): ReactNode
  def renderTrack(params: Anon_Children): ReactNode
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
    renderThumb: Anon_Index => ReactNode,
    renderTrack: Anon_Children => ReactNode,
    step: Double,
    values: js.Array[Double]
  ): IProps = {
    val __obj = js.Dynamic.literal(allowOverlap = allowOverlap, direction = direction, disabled = disabled, max = max, min = min, onChange = js.Any.fromFunction1(onChange), renderThumb = js.Any.fromFunction1(renderThumb), renderTrack = js.Any.fromFunction1(renderTrack), step = step, values = values)
  
    __obj.asInstanceOf[IProps]
  }
}

