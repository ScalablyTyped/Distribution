package typings
package raphaelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RaphaelPaper extends js.Object {
  var bottom: RaphaelElement = js.native
  var canvas: stdLib.SVGSVGElement = js.native
  var defs: stdLib.SVGDefsElement = js.native
  var height: scala.Double = js.native
  var top: RaphaelElement = js.native
  var width: scala.Double = js.native
  def add(JSON: js.Any): RaphaelSet = js.native
  def circle(x: scala.Double, y: scala.Double, r: scala.Double): RaphaelElement = js.native
  def clear(): scala.Unit = js.native
  def ellipse(x: scala.Double, y: scala.Double, rx: scala.Double, ry: scala.Double): RaphaelElement = js.native
  def forEach(callback: js.Function1[/* el */ RaphaelElement, scala.Boolean]): RaphaelPaper = js.native
  def forEach(callback: js.Function1[/* el */ RaphaelElement, scala.Boolean], thisArg: js.Any): RaphaelPaper = js.native
  def getById(id: scala.Double): RaphaelElement = js.native
  def getElementByPoint(x: scala.Double, y: scala.Double): RaphaelElement = js.native
  def getElementsByPoint(x: scala.Double, y: scala.Double): RaphaelSet = js.native
  def getFont(family: java.lang.String): RaphaelFont = js.native
  def getFont(family: java.lang.String, weight: java.lang.String): RaphaelFont = js.native
  def getFont(family: java.lang.String, weight: java.lang.String, style: java.lang.String): RaphaelFont = js.native
  def getFont(
    family: java.lang.String,
    weight: java.lang.String,
    style: java.lang.String,
    stretch: java.lang.String
  ): RaphaelFont = js.native
  def getFont(family: java.lang.String, weight: scala.Double): RaphaelFont = js.native
  def getFont(family: java.lang.String, weight: scala.Double, style: java.lang.String): RaphaelFont = js.native
  def getFont(family: java.lang.String, weight: scala.Double, style: java.lang.String, stretch: java.lang.String): RaphaelFont = js.native
  def image(src: java.lang.String, x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): RaphaelElement = js.native
  def path(): RaphaelPath = js.native
  def path(pathString: java.lang.String): RaphaelPath = js.native
  def path(pathString: js.Array[java.lang.String | scala.Double]): RaphaelPath = js.native
  def print(x: scala.Double, y: scala.Double, str: java.lang.String, font: RaphaelFont): RaphaelPath = js.native
  def print(x: scala.Double, y: scala.Double, str: java.lang.String, font: RaphaelFont, size: scala.Double): RaphaelPath = js.native
  def print(
    x: scala.Double,
    y: scala.Double,
    str: java.lang.String,
    font: RaphaelFont,
    size: scala.Double,
    origin: java.lang.String
  ): RaphaelPath = js.native
  def print(
    x: scala.Double,
    y: scala.Double,
    str: java.lang.String,
    font: RaphaelFont,
    size: scala.Double,
    origin: java.lang.String,
    letter_spacing: scala.Double
  ): RaphaelPath = js.native
  def rect(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): RaphaelElement = js.native
  def rect(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double, r: scala.Double): RaphaelElement = js.native
  def remove(): scala.Unit = js.native
  def renderfix(): scala.Unit = js.native
  def safari(): scala.Unit = js.native
  def set(): RaphaelSet = js.native
  def set(elements: js.Array[RaphaelElement]): RaphaelSet = js.native
  def setFinish(): RaphaelSet = js.native
  def setSize(width: scala.Double, height: scala.Double): scala.Unit = js.native
  def setStart(): scala.Unit = js.native
  def setViewBox(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double, fit: scala.Boolean): scala.Unit = js.native
  def text(x: scala.Double, y: scala.Double, text: java.lang.String): RaphaelElement = js.native
}

