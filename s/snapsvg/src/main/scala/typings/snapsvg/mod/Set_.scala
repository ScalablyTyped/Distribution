package typings.snapsvg.mod

import org.scalablytyped.runtime.StringDictionary
import typings.snapsvg.snapsvgStrings.viewBox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Set_ extends js.Object {
  
  def animate(
    attrs: (js.Tuple4[
      StringDictionary[String | Double | Boolean | _], 
      js.UndefOr[Double], 
      js.UndefOr[js.Function1[/* num */ Double, Double]], 
      js.UndefOr[js.Function0[Unit]]
    ])*
  ): Element = js.native
  def animate(attrs: StringDictionary[String | Double | Boolean | js.Any], duration: Double): Set_ = js.native
  def animate(
    attrs: StringDictionary[String | Double | Boolean | js.Any],
    duration: Double,
    easing: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): Set_ = js.native
  def animate(
    attrs: StringDictionary[String | Double | Boolean | js.Any],
    duration: Double,
    easing: js.Function1[/* num */ Double, Double]
  ): Set_ = js.native
  def animate(
    attrs: StringDictionary[String | Double | Boolean | js.Any],
    duration: Double,
    easing: js.Function1[/* num */ Double, Double],
    callback: js.Function0[Unit]
  ): Set_ = js.native
  
  def attr(param: String): Set_ = js.native
  def attr(params: StringDictionary[String | Double | Boolean | BBox | js.Any]): Set_ = js.native
  @JSName("attr")
  def attr_viewBox(param: viewBox): Set_ = js.native
  
  def bind(attr: String, callback: js.Function): Set_ = js.native
  def bind(attr: String, element: Element): Set_ = js.native
  def bind(attr: String, element: Element, eattr: String): Set_ = js.native
  
  def clear(): Unit = js.native
  
  def exclude(el: Element): Boolean = js.native
  
  def forEach(callback: js.Function2[/* el */ Element, /* index */ js.UndefOr[Double], Unit | Boolean]): Set_ = js.native
  def forEach(
    callback: js.Function2[/* el */ Element, /* index */ js.UndefOr[Double], Unit | Boolean],
    thisArg: js.Object
  ): Set_ = js.native
  
  def getBBox(): BBox = js.native
  
  def insertAfter(): Set_ = js.native
  
  def pop(): Element = js.native
  
  def push(els: Element*): Set_ = js.native
  def push(el: Element): Set_ = js.native
  
  def remove(): Set_ = js.native
  
  def splice(index: Double, count: Double, insertion: Element*): Set_ = js.native
}
