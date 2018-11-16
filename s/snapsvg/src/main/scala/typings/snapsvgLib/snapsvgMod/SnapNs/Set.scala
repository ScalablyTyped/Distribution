package typings
package snapsvgLib.snapsvgMod.SnapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Set extends js.Object {
  def animate(
    attrs: ScalablyTyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | js.Any],
    duration: scala.Double
  ): Element = js.native
  def animate(
    attrs: ScalablyTyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | js.Any],
    duration: scala.Double,
    easing: js.Function1[/* num */ scala.Double, scala.Double]
  ): Element = js.native
  def animate(
    attrs: ScalablyTyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | js.Any],
    duration: scala.Double,
    easing: js.Function1[/* num */ scala.Double, scala.Double],
    callback: js.Function0[scala.Unit]
  ): Element = js.native
  def animate(params: snapsvgLib.Anon_Attrs*): Element = js.native
  def attr(param: java.lang.String): java.lang.String = js.native
  def attr(
    params: ScalablyTyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | BBox | js.Any]
  ): Element = js.native
  @JSName("attr")
  def attr_viewBox(param: snapsvgLib.snapsvgLibStrings.viewBox): BBox = js.native
  def bind(attr: java.lang.String, callback: js.Function): Set = js.native
  def bind(attr: java.lang.String, element: Element): Set = js.native
  def bind(attr: java.lang.String, element: Element, eattr: java.lang.String): Set = js.native
  def clear(): Set = js.native
  def exclude(element: Element): scala.Boolean = js.native
  def forEach(callback: js.Function): Set = js.native
  def forEach(callback: js.Function, thisArg: js.Object): Set = js.native
  def pop(): Element = js.native
  def push(els: js.Array[Element]): Element = js.native
  def push(el: Element): Element = js.native
  def remove(): Set = js.native
  def splice(index: scala.Double, count: scala.Double): js.Array[Element] = js.native
  def splice(index: scala.Double, count: scala.Double, insertion: js.Array[js.Object]): js.Array[Element] = js.native
}

