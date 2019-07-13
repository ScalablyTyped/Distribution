package typings
package reactDashRangeLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProps extends js.Object {
  var allowOverlap: scala.Boolean
  var direction: Direction
  var disabled: scala.Boolean
  var max: scala.Double
  var min: scala.Double
  var step: scala.Double
  var values: js.Array[scala.Double]
  def onChange(values: js.Array[scala.Double]): scala.Unit
  def renderThumb(params: reactDashRangeLib.Anon_Index): reactLib.reactMod.ReactNode
  def renderTrack(params: reactDashRangeLib.Anon_Children): reactLib.reactMod.ReactNode
}

object IProps {
  @scala.inline
  def apply(
    allowOverlap: scala.Boolean,
    direction: Direction,
    disabled: scala.Boolean,
    max: scala.Double,
    min: scala.Double,
    onChange: js.Array[scala.Double] => scala.Unit,
    renderThumb: reactDashRangeLib.Anon_Index => reactLib.reactMod.ReactNode,
    renderTrack: reactDashRangeLib.Anon_Children => reactLib.reactMod.ReactNode,
    step: scala.Double,
    values: js.Array[scala.Double]
  ): IProps = {
    val __obj = js.Dynamic.literal(allowOverlap = allowOverlap, direction = direction, disabled = disabled, max = max, min = min, onChange = js.Any.fromFunction1(onChange), renderThumb = js.Any.fromFunction1(renderThumb), renderTrack = js.Any.fromFunction1(renderTrack), step = step, values = values)
  
    __obj.asInstanceOf[IProps]
  }
}

