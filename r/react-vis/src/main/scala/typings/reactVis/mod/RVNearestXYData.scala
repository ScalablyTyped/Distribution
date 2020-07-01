package typings.reactVis.mod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RVNearestXYData[T /* <: AbstractSeriesPoint */] extends js.Object {
  var event: MouseEvent[HTMLElement, NativeMouseEvent]
  var index: Double
  var innerX: /* import warning: importer.ImportType#apply Failed type conversion: T['x'] */ js.Any
  var innerY: /* import warning: importer.ImportType#apply Failed type conversion: T['y'] */ js.Any
}

object RVNearestXYData {
  @scala.inline
  def apply[/* <: typings.reactVis.mod.AbstractSeriesPoint */ T](
    event: MouseEvent[HTMLElement, NativeMouseEvent],
    index: Double,
    innerX: /* import warning: importer.ImportType#apply Failed type conversion: T['x'] */ js.Any,
    innerY: /* import warning: importer.ImportType#apply Failed type conversion: T['y'] */ js.Any
  ): RVNearestXYData[T] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], innerX = innerX.asInstanceOf[js.Any], innerY = innerY.asInstanceOf[js.Any])
    __obj.asInstanceOf[RVNearestXYData[T]]
  }
}

