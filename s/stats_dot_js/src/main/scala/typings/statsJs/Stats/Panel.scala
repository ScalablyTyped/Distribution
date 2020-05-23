package typings.statsJs.Stats

import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Panel extends js.Object {
  var dom: HTMLCanvasElement
  def update(value: Double, maxValue: Double): Unit
}

object Panel {
  @scala.inline
  def apply(dom: HTMLCanvasElement, update: (Double, Double) => Unit): Panel = {
    val __obj = js.Dynamic.literal(dom = dom.asInstanceOf[js.Any], update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[Panel]
  }
}

