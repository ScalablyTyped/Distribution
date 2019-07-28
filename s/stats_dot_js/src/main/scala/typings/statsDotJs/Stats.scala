package typings.statsDotJs

import typings.statsDotJs.StatsNs.Panel
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Stats")
@js.native
class Stats () extends js.Object {
  var REVISION: Double = js.native
  var dom: HTMLDivElement = js.native
  def addPanel(panel: Panel): Panel = js.native
  def begin(): Unit = js.native
  def end(): Double = js.native
  /**
    * @param value 0:fps, 1: ms, 2: mb, 3+: custom
    */
  def showPanel(value: Double): Unit = js.native
  def update(): Unit = js.native
}

