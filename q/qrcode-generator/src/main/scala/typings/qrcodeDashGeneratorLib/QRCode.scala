package typings
package qrcodeDashGeneratorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QRCode extends js.Object {
  def addData(data: java.lang.String): scala.Unit = js.native
  def addData(data: java.lang.String, mode: Mode): scala.Unit = js.native
  def createASCII(): java.lang.String = js.native
  def createASCII(cellSize: scala.Double): java.lang.String = js.native
  def createASCII(cellSize: scala.Double, margin: scala.Double): java.lang.String = js.native
  def createDataURL(): java.lang.String = js.native
  def createDataURL(cellSize: scala.Double): java.lang.String = js.native
  def createDataURL(cellSize: scala.Double, margin: scala.Double): java.lang.String = js.native
  def createImgTag(): java.lang.String = js.native
  def createImgTag(cellSize: scala.Double): java.lang.String = js.native
  def createImgTag(cellSize: scala.Double, margin: scala.Double): java.lang.String = js.native
  def createSvgTag(): java.lang.String = js.native
  def createSvgTag(cellSize: scala.Double): java.lang.String = js.native
  def createSvgTag(cellSize: scala.Double, margin: scala.Double): java.lang.String = js.native
  def createSvgTag(opts: Anon_CellSize): java.lang.String = js.native
  def createTableTag(): java.lang.String = js.native
  def createTableTag(cellSize: scala.Double): java.lang.String = js.native
  def createTableTag(cellSize: scala.Double, margin: scala.Double): java.lang.String = js.native
  def getModuleCount(): scala.Double = js.native
  def isDark(row: scala.Double, col: scala.Double): scala.Boolean = js.native
  def make(): scala.Unit = js.native
  def renderTo2dContext(context: stdLib.CanvasRenderingContext2D): scala.Unit = js.native
  def renderTo2dContext(context: stdLib.CanvasRenderingContext2D, cellSize: scala.Double): scala.Unit = js.native
}

