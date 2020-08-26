package typings.snapsvg.mod

import org.scalablytyped.runtime.StringDictionary
import typings.snapsvg.anon.Alpha
import typings.snapsvg.anon.Anim
import typings.snapsvg.snapsvgStrings.viewBox
import typings.std.HTMLElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Element extends js.Object {
  var node: HTMLElement = js.native
  /** The top level element will included an reference to its Paper after it is rendered. */
  var paper: js.UndefOr[Paper] = js.native
  var `type`: String = js.native
  def add(el: Element): Element = js.native
  def add(el: Set_): Element = js.native
  def addClass(value: String): Element = js.native
  def after(el: Element): Element = js.native
  def align(el: Element, way: String): Element = js.native
  def animate(animation: js.Any): Element = js.native
  def animate(attrs: StringDictionary[String | Double | Boolean | js.Any], duration: Double): Element = js.native
  def animate(
    attrs: StringDictionary[String | Double | Boolean | js.Any],
    duration: Double,
    easing: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): Element = js.native
  def animate(
    attrs: StringDictionary[String | Double | Boolean | js.Any],
    duration: Double,
    easing: js.Function1[/* num */ Double, Double]
  ): Element = js.native
  def animate(
    attrs: StringDictionary[String | Double | Boolean | js.Any],
    duration: Double,
    easing: js.Function1[/* num */ Double, Double],
    callback: js.Function0[Unit]
  ): Element = js.native
  def append(el: Element): Element = js.native
  def append(el: Set_): Element = js.native
  def appendTo(el: Element): Element = js.native
  def asPX(attr: String): Double = js.native
  def asPX(attr: String, value: String): Double = js.native
  def attr(param: String): String = js.native
  def attr(params: StringDictionary[String | Double | Boolean | BBox | js.Any]): Element = js.native
              //TODO: check what is really returned
  @JSName("attr")
  def attr_viewBox(param: viewBox): BBox = js.native
  def before(el: Element): Element = js.native
  def children(): js.Array[Element] = js.native
  def click(handler: js.Function1[/* event */ MouseEvent, Unit]): Element = js.native
  def click(handler: js.Function1[/* event */ MouseEvent, Unit], thisArg: js.Any): Element = js.native
  def data(key: String): js.Any = js.native
  def data(key: String, value: js.Any): js.Any = js.native
  def dblclick(handler: js.Function1[/* event */ MouseEvent, Unit]): Element = js.native
  def dblclick(handler: js.Function1[/* event */ MouseEvent, Unit], thisArg: js.Any): Element = js.native
  def drag(): Element = js.native
  def drag(
    onMove: js.Function5[
      /* dx */ Double, 
      /* dy */ Double, 
      /* x */ Double, 
      /* y */ Double, 
      /* event */ MouseEvent, 
      Unit
    ],
    onStart: js.Function3[/* x */ Double, /* y */ Double, /* event */ MouseEvent, Unit],
    onEnd: js.Function1[/* event */ MouseEvent, Unit]
  ): Element = js.native
  def drag(
    onMove: js.Function5[
      /* dx */ Double, 
      /* dy */ Double, 
      /* x */ Double, 
      /* y */ Double, 
      /* event */ MouseEvent, 
      Unit
    ],
    onStart: js.Function3[/* x */ Double, /* y */ Double, /* event */ MouseEvent, Unit],
    onEnd: js.Function1[/* event */ MouseEvent, Unit],
    moveThisArg: js.UndefOr[scala.Nothing],
    startThisArg: js.UndefOr[scala.Nothing],
    endThisArg: js.Any
  ): Element = js.native
  def drag(
    onMove: js.Function5[
      /* dx */ Double, 
      /* dy */ Double, 
      /* x */ Double, 
      /* y */ Double, 
      /* event */ MouseEvent, 
      Unit
    ],
    onStart: js.Function3[/* x */ Double, /* y */ Double, /* event */ MouseEvent, Unit],
    onEnd: js.Function1[/* event */ MouseEvent, Unit],
    moveThisArg: js.UndefOr[scala.Nothing],
    startThisArg: js.Any
  ): Element = js.native
  def drag(
    onMove: js.Function5[
      /* dx */ Double, 
      /* dy */ Double, 
      /* x */ Double, 
      /* y */ Double, 
      /* event */ MouseEvent, 
      Unit
    ],
    onStart: js.Function3[/* x */ Double, /* y */ Double, /* event */ MouseEvent, Unit],
    onEnd: js.Function1[/* event */ MouseEvent, Unit],
    moveThisArg: js.UndefOr[scala.Nothing],
    startThisArg: js.Any,
    endThisArg: js.Any
  ): Element = js.native
  def drag(
    onMove: js.Function5[
      /* dx */ Double, 
      /* dy */ Double, 
      /* x */ Double, 
      /* y */ Double, 
      /* event */ MouseEvent, 
      Unit
    ],
    onStart: js.Function3[/* x */ Double, /* y */ Double, /* event */ MouseEvent, Unit],
    onEnd: js.Function1[/* event */ MouseEvent, Unit],
    moveThisArg: js.Any
  ): Element = js.native
  def drag(
    onMove: js.Function5[
      /* dx */ Double, 
      /* dy */ Double, 
      /* x */ Double, 
      /* y */ Double, 
      /* event */ MouseEvent, 
      Unit
    ],
    onStart: js.Function3[/* x */ Double, /* y */ Double, /* event */ MouseEvent, Unit],
    onEnd: js.Function1[/* event */ MouseEvent, Unit],
    moveThisArg: js.Any,
    startThisArg: js.UndefOr[scala.Nothing],
    endThisArg: js.Any
  ): Element = js.native
  def drag(
    onMove: js.Function5[
      /* dx */ Double, 
      /* dy */ Double, 
      /* x */ Double, 
      /* y */ Double, 
      /* event */ MouseEvent, 
      Unit
    ],
    onStart: js.Function3[/* x */ Double, /* y */ Double, /* event */ MouseEvent, Unit],
    onEnd: js.Function1[/* event */ MouseEvent, Unit],
    moveThisArg: js.Any,
    startThisArg: js.Any
  ): Element = js.native
  def drag(
    onMove: js.Function5[
      /* dx */ Double, 
      /* dy */ Double, 
      /* x */ Double, 
      /* y */ Double, 
      /* event */ MouseEvent, 
      Unit
    ],
    onStart: js.Function3[/* x */ Double, /* y */ Double, /* event */ MouseEvent, Unit],
    onEnd: js.Function1[/* event */ MouseEvent, Unit],
    moveThisArg: js.Any,
    startThisArg: js.Any,
    endThisArg: js.Any
  ): Element = js.native
  def getAlign(el: Element, way: String): String = js.native
  def getBBox(): BBox = js.native
  def getPointAtLength(length: Double): Alpha = js.native
  def getSubpath(from: Double, to: Double): String = js.native
  def getTotalLength(): Double = js.native
  def hasClass(value: String): Boolean = js.native
  def hover(
    hoverInHandler: js.Function1[/* event */ MouseEvent, Unit],
    hoverOutHandler: js.Function1[/* event */ MouseEvent, Unit]
  ): Element = js.native
  def hover(
    hoverInHandler: js.Function1[/* event */ MouseEvent, Unit],
    hoverOutHandler: js.Function1[/* event */ MouseEvent, Unit],
    inThisArg: js.UndefOr[scala.Nothing],
    outThisArg: js.Any
  ): Element = js.native
  def hover(
    hoverInHandler: js.Function1[/* event */ MouseEvent, Unit],
    hoverOutHandler: js.Function1[/* event */ MouseEvent, Unit],
    inThisArg: js.Any,
    outThisArg: js.Any
  ): Element = js.native
  def hover(
    hoverInHandler: js.Function1[/* event */ MouseEvent, Unit],
    hoverOutHandler: js.Function1[/* event */ MouseEvent, Unit],
    thisArg: js.Any
  ): Element = js.native
  def inAnim(): js.Array[Anim] = js.native
  def innerSVG(): String = js.native
  def insertAfter(el: Element): Element = js.native
  def insertBefore(el: Element): Element = js.native
  def marker(x: Double, y: Double, width: Double, height: Double, refX: Double, refY: Double): Element = js.native
  def mousedown(handler: js.Function1[/* event */ MouseEvent, Unit]): Element = js.native
  def mousedown(handler: js.Function1[/* event */ MouseEvent, Unit], thisArg: js.Any): Element = js.native
  def mousemove(handler: js.Function1[/* event */ MouseEvent, Unit]): Element = js.native
  def mousemove(handler: js.Function1[/* event */ MouseEvent, Unit], thisArg: js.Any): Element = js.native
  def mouseout(handler: js.Function1[/* event */ MouseEvent, Unit]): Element = js.native
  def mouseout(handler: js.Function1[/* event */ MouseEvent, Unit], thisArg: js.Any): Element = js.native
  def mouseover(handler: js.Function1[/* event */ MouseEvent, Unit]): Element = js.native
  def mouseover(handler: js.Function1[/* event */ MouseEvent, Unit], thisArg: js.Any): Element = js.native
  def mouseup(handler: js.Function1[/* event */ MouseEvent, Unit]): Element = js.native
  def mouseup(handler: js.Function1[/* event */ MouseEvent, Unit], thisArg: js.Any): Element = js.native
  def outerSVG(): String = js.native
  def parent(): Element = js.native
  def pattern(x: js.Any, y: js.Any, width: js.Any, height: js.Any): Element = js.native
  def prepend(el: Element): Element = js.native
  def prependTo(el: Element): Element = js.native
  def remove(): Element = js.native
  def removeClass(value: String): Element = js.native
  def removeData(): Element = js.native
  def removeData(key: String): Element = js.native
  def select(query: String): Element = js.native
  def selectAll(): Set_ = js.native
  def selectAll(query: String): Set_ = js.native
  def stop(): Element = js.native
  def toDefs(): Element = js.native
  def toJSON(): js.Any = js.native
  def toPattern(x: String, y: String, width: String, height: String): js.Object = js.native
  def toPattern(x: Double, y: Double, width: Double, height: Double): js.Object = js.native
  def toggleClass(value: String, flag: Boolean): Element = js.native
  def touchcancel(handler: js.Function1[/* event */ MouseEvent, Unit]): Element = js.native
  def touchcancel(handler: js.Function1[/* event */ MouseEvent, Unit], thisArg: js.Any): Element = js.native
  def touchend(handler: js.Function1[/* event */ MouseEvent, Unit]): Element = js.native
  def touchend(handler: js.Function1[/* event */ MouseEvent, Unit], thisArg: js.Any): Element = js.native
  def touchmove(handler: js.Function1[/* event */ MouseEvent, Unit]): Element = js.native
  def touchmove(handler: js.Function1[/* event */ MouseEvent, Unit], thisArg: js.Any): Element = js.native
  def touchstart(handler: js.Function1[/* event */ MouseEvent, Unit]): Element = js.native
  def touchstart(handler: js.Function1[/* event */ MouseEvent, Unit], thisArg: js.Any): Element = js.native
  def transform(): TransformationDescriptor = js.native
  def transform(tstr: String): Element = js.native
  def unclick(): Element = js.native
  def unclick(handler: js.Function1[/* event */ MouseEvent, Unit]): Element = js.native
  def undblclick(): Element = js.native
  def undblclick(handler: js.Function1[/* event */ MouseEvent, Unit]): Element = js.native
  def undrag(): Element = js.native
  def undrag(
    onMove: js.Function3[/* dx */ Double, /* dy */ Double, /* event */ MouseEvent, Unit],
    onStart: js.Function3[/* x */ Double, /* y */ Double, /* event */ MouseEvent, Unit],
    onEnd: js.Function1[/* event */ MouseEvent, Unit]
  ): Element = js.native
  def unhover(
    hoverInHandler: js.Function1[/* event */ MouseEvent, Unit],
    hoverOutHandler: js.Function1[/* event */ MouseEvent, Unit]
  ): Element = js.native
  def unmousedown(): Element = js.native
  def unmousedown(handler: js.Function1[/* event */ MouseEvent, Unit]): Element = js.native
  def unmousemove(): Element = js.native
  def unmousemove(handler: js.Function1[/* event */ MouseEvent, Unit]): Element = js.native
  def unmouseout(): Element = js.native
  def unmouseout(handler: js.Function1[/* event */ MouseEvent, Unit]): Element = js.native
  def unmouseover(): Element = js.native
  def unmouseover(handler: js.Function1[/* event */ MouseEvent, Unit]): Element = js.native
  def unmouseup(): Element = js.native
  def unmouseup(handler: js.Function1[/* event */ MouseEvent, Unit]): Element = js.native
  def untouchcancel(): Element = js.native
  def untouchcancel(handler: js.Function1[/* event */ MouseEvent, Unit]): Element = js.native
  def untouchend(): Element = js.native
  def untouchend(handler: js.Function1[/* event */ MouseEvent, Unit]): Element = js.native
  def untouchmove(): Element = js.native
  def untouchmove(handler: js.Function1[/* event */ MouseEvent, Unit]): Element = js.native
  def untouchstart(): Element = js.native
  def untouchstart(handler: js.Function1[/* event */ MouseEvent, Unit]): Element = js.native
  def use(): js.Object = js.native
}

