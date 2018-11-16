package typings
package snapsvgLib.snapsvgMod.SnapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Element extends js.Object {
  var node: stdLib.HTMLElement = js.native
  /** The top level element will included an reference to its Paper after it is rendered. */
  var paper: js.UndefOr[Paper] = js.native
  var `type`: java.lang.String = js.native
  def add(el: Element): Element = js.native
  def add(el: Set): Element = js.native
  def addClass(value: java.lang.String): Element = js.native
  def after(el: Element): Element = js.native
  def align(el: Element, way: java.lang.String): Element = js.native
  def animate(animation: js.Any): Element = js.native
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
  def append(el: Element): Element = js.native
  def append(el: Set): Element = js.native
  def appendTo(el: Element): Element = js.native
  def asPX(attr: java.lang.String): scala.Double = js.native
  def asPX(attr: java.lang.String, value: java.lang.String): scala.Double = js.native
  def attr(param: java.lang.String): java.lang.String = js.native
  def attr(
    params: ScalablyTyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | BBox | js.Any]
  ): Element = js.native
              //TODO: check what is really returned
  @JSName("attr")
  def attr_viewBox(param: snapsvgLib.snapsvgLibStrings.viewBox): BBox = js.native
  def before(el: Element): Element = js.native
  def children(): js.Array[Element] = js.native
  def click(handler: js.Function1[/* event */ stdLib.MouseEvent, scala.Unit]): Element = js.native
  def click(handler: js.Function1[/* event */ stdLib.MouseEvent, scala.Unit], thisArg: js.Any): Element = js.native
  def data(key: java.lang.String): js.Any = js.native
  def data(key: java.lang.String, value: js.Any): js.Any = js.native
  def dblclick(handler: js.Function1[/* event */ stdLib.MouseEvent, scala.Unit]): Element = js.native
  def dblclick(handler: js.Function1[/* event */ stdLib.MouseEvent, scala.Unit], thisArg: js.Any): Element = js.native
  def drag(): Element = js.native
  def drag(
    onMove: js.Function5[
      /* dx */ scala.Double, 
      /* dy */ scala.Double, 
      /* x */ scala.Double, 
      /* y */ scala.Double, 
      /* event */ stdLib.MouseEvent, 
      scala.Unit
    ],
    onStart: js.Function3[/* x */ scala.Double, /* y */ scala.Double, /* event */ stdLib.MouseEvent, scala.Unit],
    onEnd: js.Function1[/* event */ stdLib.MouseEvent, scala.Unit]
  ): Element = js.native
  def drag(
    onMove: js.Function5[
      /* dx */ scala.Double, 
      /* dy */ scala.Double, 
      /* x */ scala.Double, 
      /* y */ scala.Double, 
      /* event */ stdLib.MouseEvent, 
      scala.Unit
    ],
    onStart: js.Function3[/* x */ scala.Double, /* y */ scala.Double, /* event */ stdLib.MouseEvent, scala.Unit],
    onEnd: js.Function1[/* event */ stdLib.MouseEvent, scala.Unit],
    moveThisArg: js.Any
  ): Element = js.native
  def drag(
    onMove: js.Function5[
      /* dx */ scala.Double, 
      /* dy */ scala.Double, 
      /* x */ scala.Double, 
      /* y */ scala.Double, 
      /* event */ stdLib.MouseEvent, 
      scala.Unit
    ],
    onStart: js.Function3[/* x */ scala.Double, /* y */ scala.Double, /* event */ stdLib.MouseEvent, scala.Unit],
    onEnd: js.Function1[/* event */ stdLib.MouseEvent, scala.Unit],
    moveThisArg: js.Any,
    startThisArg: js.Any
  ): Element = js.native
  def drag(
    onMove: js.Function5[
      /* dx */ scala.Double, 
      /* dy */ scala.Double, 
      /* x */ scala.Double, 
      /* y */ scala.Double, 
      /* event */ stdLib.MouseEvent, 
      scala.Unit
    ],
    onStart: js.Function3[/* x */ scala.Double, /* y */ scala.Double, /* event */ stdLib.MouseEvent, scala.Unit],
    onEnd: js.Function1[/* event */ stdLib.MouseEvent, scala.Unit],
    moveThisArg: js.Any,
    startThisArg: js.Any,
    endThisArg: js.Any
  ): Element = js.native
  def getAlign(el: Element, way: java.lang.String): java.lang.String = js.native
  def getBBox(): BBox = js.native
  def getPointAtLength(length: scala.Double): snapsvgLib.Anon_Alpha = js.native
  def getSubpath(from: scala.Double, to: scala.Double): java.lang.String = js.native
  def getTotalLength(): scala.Double = js.native
  def hasClass(value: java.lang.String): scala.Boolean = js.native
  def hover(
    hoverInHandler: js.Function1[/* event */ stdLib.MouseEvent, scala.Unit],
    hoverOutHandler: js.Function1[/* event */ stdLib.MouseEvent, scala.Unit]
  ): Element = js.native
  def hover(
    hoverInHandler: js.Function1[/* event */ stdLib.MouseEvent, scala.Unit],
    hoverOutHandler: js.Function1[/* event */ stdLib.MouseEvent, scala.Unit],
    inThisArg: js.Any,
    outThisArg: js.Any
  ): Element = js.native
  def hover(
    hoverInHandler: js.Function1[/* event */ stdLib.MouseEvent, scala.Unit],
    hoverOutHandler: js.Function1[/* event */ stdLib.MouseEvent, scala.Unit],
    thisArg: js.Any
  ): Element = js.native
  def inAnim(): js.Array[snapsvgLib.Anon_Anim] = js.native
  def innerSVG(): java.lang.String = js.native
  def insertAfter(el: Element): Element = js.native
  def insertBefore(el: Element): Element = js.native
  def marker(
    x: scala.Double,
    y: scala.Double,
    width: scala.Double,
    height: scala.Double,
    refX: scala.Double,
    refY: scala.Double
  ): Element = js.native
  def mousedown(handler: js.Function1[/* event */ stdLib.MouseEvent, scala.Unit]): Element = js.native
  def mousedown(handler: js.Function1[/* event */ stdLib.MouseEvent, scala.Unit], thisArg: js.Any): Element = js.native
  def mousemove(handler: js.Function1[/* event */ stdLib.MouseEvent, scala.Unit]): Element = js.native
  def mousemove(handler: js.Function1[/* event */ stdLib.MouseEvent, scala.Unit], thisArg: js.Any): Element = js.native
  def mouseout(handler: js.Function1[/* event */ stdLib.MouseEvent, scala.Unit]): Element = js.native
  def mouseout(handler: js.Function1[/* event */ stdLib.MouseEvent, scala.Unit], thisArg: js.Any): Element = js.native
  def mouseover(handler: js.Function1[/* event */ stdLib.MouseEvent, scala.Unit]): Element = js.native
  def mouseover(handler: js.Function1[/* event */ stdLib.MouseEvent, scala.Unit], thisArg: js.Any): Element = js.native
  def mouseup(handler: js.Function1[/* event */ stdLib.MouseEvent, scala.Unit]): Element = js.native
  def mouseup(handler: js.Function1[/* event */ stdLib.MouseEvent, scala.Unit], thisArg: js.Any): Element = js.native
  def outerSVG(): java.lang.String = js.native
  def parent(): Element = js.native
  def pattern(x: js.Any, y: js.Any, width: js.Any, height: js.Any): Element = js.native
  def prepend(el: Element): Element = js.native
  def prependTo(el: Element): Element = js.native
  def remove(): Element = js.native
  def removeClass(value: java.lang.String): Element = js.native
  def removeData(): Element = js.native
  def removeData(key: java.lang.String): Element = js.native
  def select(query: java.lang.String): Element = js.native
  def selectAll(): Set = js.native
  def selectAll(query: java.lang.String): Set = js.native
  def stop(): Element = js.native
  def toDefs(): Element = js.native
  def toJSON(): js.Any = js.native
  def toPattern(x: java.lang.String, y: java.lang.String, width: java.lang.String, height: java.lang.String): js.Object = js.native
  def toPattern(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): js.Object = js.native
  def toggleClass(value: java.lang.String, flag: scala.Boolean): Element = js.native
  def touchcancel(handler: js.Function1[/* event */ stdLib.MouseEvent, scala.Unit]): Element = js.native
  def touchcancel(handler: js.Function1[/* event */ stdLib.MouseEvent, scala.Unit], thisArg: js.Any): Element = js.native
  def touchend(handler: js.Function1[/* event */ stdLib.MouseEvent, scala.Unit]): Element = js.native
  def touchend(handler: js.Function1[/* event */ stdLib.MouseEvent, scala.Unit], thisArg: js.Any): Element = js.native
  def touchmove(handler: js.Function1[/* event */ stdLib.MouseEvent, scala.Unit]): Element = js.native
  def touchmove(handler: js.Function1[/* event */ stdLib.MouseEvent, scala.Unit], thisArg: js.Any): Element = js.native
  def touchstart(handler: js.Function1[/* event */ stdLib.MouseEvent, scala.Unit]): Element = js.native
  def touchstart(handler: js.Function1[/* event */ stdLib.MouseEvent, scala.Unit], thisArg: js.Any): Element = js.native
  def transform(): TransformationDescriptor = js.native
  def transform(tstr: java.lang.String): Element = js.native
  def unclick(): Element = js.native
  def unclick(handler: js.Function1[/* event */ stdLib.MouseEvent, scala.Unit]): Element = js.native
  def undblclick(): Element = js.native
  def undblclick(handler: js.Function1[/* event */ stdLib.MouseEvent, scala.Unit]): Element = js.native
  def undrag(): Element = js.native
  def undrag(
    onMove: js.Function3[
      /* dx */ scala.Double, 
      /* dy */ scala.Double, 
      /* event */ stdLib.MouseEvent, 
      scala.Unit
    ],
    onStart: js.Function3[/* x */ scala.Double, /* y */ scala.Double, /* event */ stdLib.MouseEvent, scala.Unit],
    onEnd: js.Function1[/* event */ stdLib.MouseEvent, scala.Unit]
  ): Element = js.native
  def unhover(
    hoverInHandler: js.Function1[/* event */ stdLib.MouseEvent, scala.Unit],
    hoverOutHandler: js.Function1[/* event */ stdLib.MouseEvent, scala.Unit]
  ): Element = js.native
  def unmousedown(): Element = js.native
  def unmousedown(handler: js.Function1[/* event */ stdLib.MouseEvent, scala.Unit]): Element = js.native
  def unmousemove(): Element = js.native
  def unmousemove(handler: js.Function1[/* event */ stdLib.MouseEvent, scala.Unit]): Element = js.native
  def unmouseout(): Element = js.native
  def unmouseout(handler: js.Function1[/* event */ stdLib.MouseEvent, scala.Unit]): Element = js.native
  def unmouseover(): Element = js.native
  def unmouseover(handler: js.Function1[/* event */ stdLib.MouseEvent, scala.Unit]): Element = js.native
  def unmouseup(): Element = js.native
  def unmouseup(handler: js.Function1[/* event */ stdLib.MouseEvent, scala.Unit]): Element = js.native
  def untouchcancel(): Element = js.native
  def untouchcancel(handler: js.Function1[/* event */ stdLib.MouseEvent, scala.Unit]): Element = js.native
  def untouchend(): Element = js.native
  def untouchend(handler: js.Function1[/* event */ stdLib.MouseEvent, scala.Unit]): Element = js.native
  def untouchmove(): Element = js.native
  def untouchmove(handler: js.Function1[/* event */ stdLib.MouseEvent, scala.Unit]): Element = js.native
  def untouchstart(): Element = js.native
  def untouchstart(handler: js.Function1[/* event */ stdLib.MouseEvent, scala.Unit]): Element = js.native
  def use(): js.Object = js.native
}

