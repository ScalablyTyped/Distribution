package typings.rotDashJs.rotDashJsMod

import typings.rotDashJs.rotDashJsMod._Global_.Array
import typings.std.Node
import typings.std.UIEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js", "Display")
@js.native
class Display () extends js.Object {
  def this(options: DisplayOptions) = this()
  @JSName("DEBUG")
  var DEBUG_Original: DigCallback = js.native
  def DEBUG(x: Double, y: Double, cellValue: Double): js.Any = js.native
  def clear(): Unit = js.native
  def computeFontSize(availWidth: Double, availHeight: Double): Double = js.native
  def computeSize(availWidth: Double, availHeight: Double): js.Tuple2[Double, Double] = js.native
  def draw(x: Double, y: Double, character: String): Unit = js.native
  def draw(x: Double, y: Double, character: String, fg: String): Unit = js.native
  def draw(x: Double, y: Double, character: String, fg: String, bg: String): Unit = js.native
  def draw(x: Double, y: Double, character: String, fg: String, bg: Array[String]): Unit = js.native
  def draw(x: Double, y: Double, character: String, fg: Array[String]): Unit = js.native
  def draw(x: Double, y: Double, character: String, fg: Array[String], bg: String): Unit = js.native
  def draw(x: Double, y: Double, character: String, fg: Array[String], bg: Array[String]): Unit = js.native
  def draw(x: Double, y: Double, character: Array[String]): Unit = js.native
  def draw(x: Double, y: Double, character: Array[String], fg: String): Unit = js.native
  def draw(x: Double, y: Double, character: Array[String], fg: String, bg: String): Unit = js.native
  def draw(x: Double, y: Double, character: Array[String], fg: String, bg: Array[String]): Unit = js.native
  def draw(x: Double, y: Double, character: Array[String], fg: Array[String]): Unit = js.native
  def draw(x: Double, y: Double, character: Array[String], fg: Array[String], bg: String): Unit = js.native
  def draw(x: Double, y: Double, character: Array[String], fg: Array[String], bg: Array[String]): Unit = js.native
  def drawText(x: Double, y: Double, text: String): Double = js.native
  def drawText(x: Double, y: Double, text: String, maxWidth: Double): Double = js.native
  def eventToPosition(e: UIEvent): (js.Tuple2[Double, Double]) | Double = js.native
  def getContainer(): Node = js.native
  def getOptions(): DisplayOptions = js.native
  def setOptions(options: DisplayOptions): Display = js.native
}

