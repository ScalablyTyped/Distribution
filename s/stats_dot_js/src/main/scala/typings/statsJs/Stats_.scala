package typings.statsJs

import typings.statsJs.Stats.Panel
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stats_ extends js.Object {
  var REVISION: Double
  var dom: HTMLDivElement
  def addPanel(panel: Panel): Panel
  def begin(): Unit
  def end(): Double
  /**
    * @param value 0:fps, 1: ms, 2: mb, 3+: custom
    */
  def showPanel(value: Double): Unit
  def update(): Unit
}

object Stats_ {
  @scala.inline
  def apply(
    REVISION: Double,
    addPanel: Panel => Panel,
    begin: () => Unit,
    dom: HTMLDivElement,
    end: () => Double,
    showPanel: Double => Unit,
    update: () => Unit
  ): Stats_ = {
    val __obj = js.Dynamic.literal(REVISION = REVISION.asInstanceOf[js.Any], addPanel = js.Any.fromFunction1(addPanel), begin = js.Any.fromFunction0(begin), dom = dom.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), showPanel = js.Any.fromFunction1(showPanel), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[Stats_]
  }
}

