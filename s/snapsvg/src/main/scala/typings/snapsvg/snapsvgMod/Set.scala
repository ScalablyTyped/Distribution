package typings.snapsvg.snapsvgMod

import org.scalablytyped.runtime.StringDictionary
import typings.snapsvg.snapsvgStrings.viewBox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Set extends js.Object {
  def animate(
    attrs: (js.Tuple4[
      StringDictionary[String | Double | Boolean | _], 
      js.UndefOr[Double], 
      js.UndefOr[js.Function1[/* num */ Double, Double]], 
      js.UndefOr[js.Function0[Unit]]
    ])*
  ): Element = js.native
  def animate(attrs: StringDictionary[String | Double | Boolean | js.Any], duration: Double): Set = js.native
  def animate(
    attrs: StringDictionary[String | Double | Boolean | js.Any],
    duration: Double,
    easing: js.Function1[/* num */ Double, Double]
  ): Set = js.native
  def animate(
    attrs: StringDictionary[String | Double | Boolean | js.Any],
    duration: Double,
    easing: js.Function1[/* num */ Double, Double],
    callback: js.Function0[Unit]
  ): Set = js.native
  def attr(param: String): Set = js.native
  def attr(params: StringDictionary[String | Double | Boolean | BBox | js.Any]): Set = js.native
  @JSName("attr")
  def attr_viewBox(param: viewBox): Set = js.native
  def bind(attr: String, callback: js.Function): Set = js.native
  def bind(attr: String, element: Element): Set = js.native
  def bind(attr: String, element: Element, eattr: String): Set = js.native
  def clear(): Unit = js.native
  def exclude(el: Element): Boolean = js.native
  def forEach(callback: js.Function2[/* el */ Element, /* index */ js.UndefOr[Double], Unit | Boolean]): Set = js.native
  def forEach(
    callback: js.Function2[/* el */ Element, /* index */ js.UndefOr[Double], Unit | Boolean],
    thisArg: js.Object
  ): Set = js.native
  def getBBox(): BBox = js.native
  def insertAfter(): Set = js.native
  def pop(): Element = js.native
  def push(els: Element*): Set = js.native
  def push(el: Element): Set = js.native
  def remove(): Set = js.native
  def splice(index: Double, count: Double, insertion: Element*): Set = js.native
}

@JSImport("snapsvg", "set")
@js.native
object set extends js.Object {
  def apply(els: Element*): Set = js.native
}

