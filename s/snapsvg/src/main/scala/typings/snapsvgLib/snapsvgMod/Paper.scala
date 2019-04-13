package typings
package snapsvgLib.snapsvgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Paper extends Element {
  def circle(x: scala.Double, y: scala.Double, r: scala.Double): Element = js.native
  def clear(): scala.Unit = js.native
  def el(name: java.lang.String, attr: js.Object): Element = js.native
  def ellipse(x: scala.Double, y: scala.Double, rx: scala.Double, ry: scala.Double): Element = js.native
  def filter(filstr: java.lang.String): Element = js.native
  def g(): Paper = js.native
  def g(varargs: js.Any): Paper = js.native
  def gradient(gradient: java.lang.String): Gradient = js.native
  def group(els: js.Any*): Paper = js.native
  def image(src: java.lang.String, x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): Element = js.native
  def line(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double): Element = js.native
  def mask(varargs: js.Any): js.Object = js.native
  def path(pathSpec: java.lang.String): Element = js.native
  def path(pathSpec: js.Array[js.Array[java.lang.String | scala.Double]]): Element = js.native
  def polygon(varargs: js.Array[_]): Element = js.native
  def polyline(varargs: js.Array[_]): Element = js.native
  def ptrn(
    x: scala.Double,
    y: scala.Double,
    width: scala.Double,
    height: scala.Double,
    vbx: scala.Double,
    vby: scala.Double,
    vbw: scala.Double,
    vbh: scala.Double
  ): js.Object = js.native
  def rect(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): Element = js.native
  def rect(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double, rx: scala.Double): Element = js.native
  def rect(
    x: scala.Double,
    y: scala.Double,
    width: scala.Double,
    height: scala.Double,
    rx: scala.Double,
    ry: scala.Double
  ): Element = js.native
  def svg(
    x: scala.Double,
    y: scala.Double,
    width: scala.Double,
    height: scala.Double,
    vbx: scala.Double,
    vby: scala.Double,
    vbw: scala.Double,
    vbh: scala.Double
  ): js.Object = js.native
  def symbol(vbx: scala.Double, vby: scala.Double, vbw: scala.Double, vbh: scala.Double): Element = js.native
  def text(x: scala.Double, y: scala.Double, text: java.lang.String): Element = js.native
  def text(x: scala.Double, y: scala.Double, text: js.Array[java.lang.String | scala.Double]): Element = js.native
  def text(x: scala.Double, y: scala.Double, text: scala.Double): Element = js.native
  def toDataURL(): java.lang.String = js.native
  def use(id: java.lang.String): js.Object = js.native
  def use(id: Element): js.Object = js.native
}

