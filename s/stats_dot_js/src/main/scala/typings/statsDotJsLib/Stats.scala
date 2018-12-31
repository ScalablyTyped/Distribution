package typings
package statsDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Stats")
@js.native
class Stats () extends js.Object {
  var REVISION: scala.Double = js.native
  var dom: stdLib.HTMLDivElement = js.native
  def addPanel(panel: statsDotJsLib.StatsNs.Panel): statsDotJsLib.StatsNs.Panel = js.native
  def begin(): scala.Unit = js.native
  def end(): scala.Double = js.native
  /**
    * @param value 0:fps, 1: ms, 2: mb, 3+: custom
    */
  def showPanel(value: scala.Double): scala.Unit = js.native
  def update(): scala.Unit = js.native
}

