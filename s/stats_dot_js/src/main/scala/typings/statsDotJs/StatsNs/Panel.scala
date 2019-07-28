package typings.statsDotJs.StatsNs

import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Stats.Panel")
@js.native
class Panel protected () extends js.Object {
  def this(name: String, foregroundColor: String, backgroundColor: String) = this()
  var dom: HTMLCanvasElement = js.native
  def update(value: Double, maxValue: Double): Unit = js.native
}

