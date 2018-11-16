package typings
package rotDashJsLib.rotDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js", "Display")
@js.native
class Display () extends js.Object {
  def this(options: DisplayOptions) = this()
  @JSName("DEBUG")
  var DEBUG_Original: DigCallback = js.native
  def DEBUG(x: scala.Double, y: scala.Double, cellValue: scala.Double): js.Any = js.native
  def clear(): scala.Unit = js.native
  def computeFontSize(availWidth: scala.Double, availHeight: scala.Double): scala.Double = js.native
  def computeSize(availWidth: scala.Double, availHeight: scala.Double): js.Tuple2[scala.Double, scala.Double] = js.native
  def draw(x: scala.Double, y: scala.Double, character: java.lang.String): scala.Unit = js.native
  def draw(x: scala.Double, y: scala.Double, character: java.lang.String, fg: java.lang.String): scala.Unit = js.native
  def draw(
    x: scala.Double,
    y: scala.Double,
    character: java.lang.String,
    fg: java.lang.String,
    bg: java.lang.String
  ): scala.Unit = js.native
  def draw(
    x: scala.Double,
    y: scala.Double,
    character: java.lang.String,
    fg: java.lang.String,
    bg: rotDashJsLib.rotDashJsMod.Global.Array[java.lang.String]
  ): scala.Unit = js.native
  def draw(
    x: scala.Double,
    y: scala.Double,
    character: java.lang.String,
    fg: rotDashJsLib.rotDashJsMod.Global.Array[java.lang.String]
  ): scala.Unit = js.native
  def draw(
    x: scala.Double,
    y: scala.Double,
    character: java.lang.String,
    fg: rotDashJsLib.rotDashJsMod.Global.Array[java.lang.String],
    bg: java.lang.String
  ): scala.Unit = js.native
  def draw(
    x: scala.Double,
    y: scala.Double,
    character: java.lang.String,
    fg: rotDashJsLib.rotDashJsMod.Global.Array[java.lang.String],
    bg: rotDashJsLib.rotDashJsMod.Global.Array[java.lang.String]
  ): scala.Unit = js.native
  def draw(
    x: scala.Double,
    y: scala.Double,
    character: rotDashJsLib.rotDashJsMod.Global.Array[java.lang.String]
  ): scala.Unit = js.native
  def draw(
    x: scala.Double,
    y: scala.Double,
    character: rotDashJsLib.rotDashJsMod.Global.Array[java.lang.String],
    fg: java.lang.String
  ): scala.Unit = js.native
  def draw(
    x: scala.Double,
    y: scala.Double,
    character: rotDashJsLib.rotDashJsMod.Global.Array[java.lang.String],
    fg: java.lang.String,
    bg: java.lang.String
  ): scala.Unit = js.native
  def draw(
    x: scala.Double,
    y: scala.Double,
    character: rotDashJsLib.rotDashJsMod.Global.Array[java.lang.String],
    fg: java.lang.String,
    bg: rotDashJsLib.rotDashJsMod.Global.Array[java.lang.String]
  ): scala.Unit = js.native
  def draw(
    x: scala.Double,
    y: scala.Double,
    character: rotDashJsLib.rotDashJsMod.Global.Array[java.lang.String],
    fg: rotDashJsLib.rotDashJsMod.Global.Array[java.lang.String]
  ): scala.Unit = js.native
  def draw(
    x: scala.Double,
    y: scala.Double,
    character: rotDashJsLib.rotDashJsMod.Global.Array[java.lang.String],
    fg: rotDashJsLib.rotDashJsMod.Global.Array[java.lang.String],
    bg: java.lang.String
  ): scala.Unit = js.native
  def draw(
    x: scala.Double,
    y: scala.Double,
    character: rotDashJsLib.rotDashJsMod.Global.Array[java.lang.String],
    fg: rotDashJsLib.rotDashJsMod.Global.Array[java.lang.String],
    bg: rotDashJsLib.rotDashJsMod.Global.Array[java.lang.String]
  ): scala.Unit = js.native
  def drawText(x: scala.Double, y: scala.Double, text: java.lang.String): scala.Double = js.native
  def drawText(x: scala.Double, y: scala.Double, text: java.lang.String, maxWidth: scala.Double): scala.Double = js.native
  def eventToPosition(e: stdLib.UIEvent): (js.Tuple2[scala.Double, scala.Double]) | scala.Double = js.native
  def getContainer(): stdLib.Node = js.native
  def getOptions(): DisplayOptions = js.native
  def setOptions(options: DisplayOptions): Display = js.native
}

