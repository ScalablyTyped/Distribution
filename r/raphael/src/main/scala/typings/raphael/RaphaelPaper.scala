package typings.raphael

import typings.std.SVGDefsElement
import typings.std.SVGSVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RaphaelPaper extends js.Object {
  var bottom: RaphaelElement = js.native
  var canvas: SVGSVGElement = js.native
  var defs: SVGDefsElement = js.native
  var height: Double = js.native
  var top: RaphaelElement = js.native
  var width: Double = js.native
  def add(JSON: js.Any): RaphaelSet = js.native
  def circle(x: Double, y: Double, r: Double): RaphaelElement = js.native
  def clear(): Unit = js.native
  def ellipse(x: Double, y: Double, rx: Double, ry: Double): RaphaelElement = js.native
  def forEach(callback: js.Function1[/* el */ RaphaelElement, Boolean]): RaphaelPaper = js.native
  def forEach(callback: js.Function1[/* el */ RaphaelElement, Boolean], thisArg: js.Any): RaphaelPaper = js.native
  def getById(id: Double): RaphaelElement = js.native
  def getElementByPoint(x: Double, y: Double): RaphaelElement = js.native
  def getElementsByPoint(x: Double, y: Double): RaphaelSet = js.native
  def getFont(family: String): RaphaelFont = js.native
  def getFont(family: String, weight: String): RaphaelFont = js.native
  def getFont(family: String, weight: String, style: String): RaphaelFont = js.native
  def getFont(family: String, weight: String, style: String, stretch: String): RaphaelFont = js.native
  def getFont(family: String, weight: Double): RaphaelFont = js.native
  def getFont(family: String, weight: Double, style: String): RaphaelFont = js.native
  def getFont(family: String, weight: Double, style: String, stretch: String): RaphaelFont = js.native
  def image(src: String, x: Double, y: Double, width: Double, height: Double): RaphaelElement = js.native
  def path(): RaphaelPath = js.native
  def path(pathString: String): RaphaelPath = js.native
  def path(pathString: js.Array[String | Double]): RaphaelPath = js.native
  def print(x: Double, y: Double, str: String, font: RaphaelFont): RaphaelPath = js.native
  def print(x: Double, y: Double, str: String, font: RaphaelFont, size: Double): RaphaelPath = js.native
  def print(x: Double, y: Double, str: String, font: RaphaelFont, size: Double, origin: String): RaphaelPath = js.native
  def print(
    x: Double,
    y: Double,
    str: String,
    font: RaphaelFont,
    size: Double,
    origin: String,
    letter_spacing: Double
  ): RaphaelPath = js.native
  def rect(x: Double, y: Double, width: Double, height: Double): RaphaelElement = js.native
  def rect(x: Double, y: Double, width: Double, height: Double, r: Double): RaphaelElement = js.native
  def remove(): Unit = js.native
  def renderfix(): Unit = js.native
  def safari(): Unit = js.native
  def set(): RaphaelSet = js.native
  def set(elements: js.Array[RaphaelElement]): RaphaelSet = js.native
  def setFinish(): RaphaelSet = js.native
  def setSize(width: Double, height: Double): Unit = js.native
  def setStart(): Unit = js.native
  def setViewBox(x: Double, y: Double, w: Double, h: Double, fit: Boolean): Unit = js.native
  def text(x: Double, y: Double, text: String): RaphaelElement = js.native
}

