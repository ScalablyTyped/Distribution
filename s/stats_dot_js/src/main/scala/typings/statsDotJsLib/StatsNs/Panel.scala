package typings
package statsDotJsLib.StatsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Stats.Panel")
@js.native
class Panel protected () extends js.Object {
  def this(name: java.lang.String, foregroundColor: java.lang.String, backgroundColor: java.lang.String) = this()
  var dom: stdLib.HTMLCanvasElement = js.native
  def update(value: scala.Double, maxValue: scala.Double): scala.Unit = js.native
}

