package typings.snapsvg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Paper extends Element {
  
  def circle(x: Double, y: Double, r: Double): Element = js.native
  
  def clear(): Unit = js.native
  
  def el(name: String, attr: js.Object): Element = js.native
  
  def ellipse(x: Double, y: Double, rx: Double, ry: Double): Element = js.native
  
  def filter(filstr: String): Element = js.native
  
  def g(): Paper = js.native
  def g(varargs: js.Any): Paper = js.native
  
  def gradient(gradient: String): Gradient = js.native
  
  def group(els: js.Any*): Paper = js.native
  
  def image(src: String, x: Double, y: Double, width: Double, height: Double): Element = js.native
  
  def line(x1: Double, y1: Double, x2: Double, y2: Double): Element = js.native
  
  def mask(varargs: js.Any): js.Object = js.native
  
  def path(pathSpec: String): Element = js.native
  def path(pathSpec: js.Array[js.Array[String | Double]]): Element = js.native
  
  def polygon(varargs: js.Array[_]): Element = js.native
  
  def polyline(varargs: js.Array[_]): Element = js.native
  
  def ptrn(
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    vbx: Double,
    vby: Double,
    vbw: Double,
    vbh: Double
  ): js.Object = js.native
  
  def rect(x: Double, y: Double, width: Double, height: Double): Element = js.native
  def rect(x: Double, y: Double, width: Double, height: Double, rx: js.UndefOr[scala.Nothing], ry: Double): Element = js.native
  def rect(x: Double, y: Double, width: Double, height: Double, rx: Double): Element = js.native
  def rect(x: Double, y: Double, width: Double, height: Double, rx: Double, ry: Double): Element = js.native
  
  def svg(
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    vbx: Double,
    vby: Double,
    vbw: Double,
    vbh: Double
  ): js.Object = js.native
  
  def symbol(vbx: Double, vby: Double, vbw: Double, vbh: Double): Element = js.native
  
  def text(x: Double, y: Double, text: String): Element = js.native
  def text(x: Double, y: Double, text: js.Array[String | Double]): Element = js.native
  def text(x: Double, y: Double, text: Double): Element = js.native
  
  def toDataURL(): String = js.native
  
  def use(id: String): js.Object = js.native
  def use(id: Element): js.Object = js.native
}
