package typings.statsJs.mod

import typings.statsJs.Stats
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stats.js", JSImport.Namespace)
@js.native
class ^ () extends Stats {
  /* CompleteClass */
  override var REVISION: Double = js.native
  /* CompleteClass */
  override var dom: HTMLDivElement = js.native
  /* CompleteClass */
  override def addPanel(panel: typings.statsJs.Stats.Panel): typings.statsJs.Stats.Panel = js.native
  /* CompleteClass */
  override def begin(): Unit = js.native
  /* CompleteClass */
  override def end(): Double = js.native
  /**
    * @param value 0:fps, 1: ms, 2: mb, 3+: custom
    */
  /* CompleteClass */
  override def showPanel(value: Double): Unit = js.native
  /* CompleteClass */
  override def update(): Unit = js.native
}

