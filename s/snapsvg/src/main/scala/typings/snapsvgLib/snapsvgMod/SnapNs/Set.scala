package typings
package snapsvgLib.snapsvgMod.SnapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Set extends js.Object {
  def animate(
    attrs: (js.Tuple4[
      org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | _], 
      js.UndefOr[scala.Double], 
      js.UndefOr[js.Function1[/* num */ scala.Double, scala.Double]], 
      js.UndefOr[js.Function0[scala.Unit]]
    ])*
  ): Element = js.native
  def animate(
    attrs: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | js.Any],
    duration: scala.Double
  ): Set = js.native
  def animate(
    attrs: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | js.Any],
    duration: scala.Double,
    easing: js.Function1[/* num */ scala.Double, scala.Double]
  ): Set = js.native
  def animate(
    attrs: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | js.Any],
    duration: scala.Double,
    easing: js.Function1[/* num */ scala.Double, scala.Double],
    callback: js.Function0[scala.Unit]
  ): Set = js.native
  def attr(param: java.lang.String): Set = js.native
  def attr(
    params: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | BBox | js.Any]
  ): Set = js.native
  @JSName("attr")
  def attr_viewBox(param: snapsvgLib.snapsvgLibStrings.viewBox): Set = js.native
  def bind(attr: java.lang.String, callback: js.Function): Set = js.native
  def bind(attr: java.lang.String, element: Element): Set = js.native
  def bind(attr: java.lang.String, element: Element, eattr: java.lang.String): Set = js.native
  def clear(): scala.Unit = js.native
  def exclude(el: Element): scala.Boolean = js.native
  def forEach(
    callback: js.Function2[/* el */ Element, /* index */ js.UndefOr[scala.Double], scala.Unit | scala.Boolean]
  ): Set = js.native
  def forEach(
    callback: js.Function2[/* el */ Element, /* index */ js.UndefOr[scala.Double], scala.Unit | scala.Boolean],
    thisArg: js.Object
  ): Set = js.native
  def getBBox(): BBox = js.native
  def insertAfter(): Set = js.native
  def pop(): Element = js.native
  def push(els: Element*): Set = js.native
  def push(el: Element): Set = js.native
  def remove(): Set = js.native
  def splice(index: scala.Double, count: scala.Double, insertion: Element*): Set = js.native
}

