package typings.statsJs.mod

import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stats.js", "Panel")
@js.native
class Panel protected ()
  extends typings.statsJs.Stats.Panel {
  def this(name: String, foregroundColor: String, backgroundColor: String) = this()
  /* CompleteClass */
  override var dom: HTMLCanvasElement = js.native
  /* CompleteClass */
  override def update(value: Double, maxValue: Double): Unit = js.native
}

