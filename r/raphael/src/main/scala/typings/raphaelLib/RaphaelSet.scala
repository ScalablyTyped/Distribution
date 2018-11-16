package typings
package raphaelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RaphaelSet
  extends /* key */ ScalablyTyped.runtime.NumberDictionary[RaphaelElement] {
  var id: java.lang.String = js.native
  var length: scala.Double = js.native
  var matrix: RaphaelMatrix = js.native
  var next: RaphaelSet = js.native
  var paper: RaphaelPaper = js.native
  var prev: RaphaelSet = js.native
  @JSName("raphael")
  var raphael_Original: RaphaelStatic = js.native
  def animate(animation: RaphaelAnimation): RaphaelSet = js.native
  def animate(params: ScalablyTyped.runtime.StringDictionary[js.Any], ms: scala.Double): RaphaelSet = js.native
  def animate(params: ScalablyTyped.runtime.StringDictionary[js.Any], ms: scala.Double, easing: java.lang.String): RaphaelSet = js.native
  def animate(
    params: ScalablyTyped.runtime.StringDictionary[js.Any],
    ms: scala.Double,
    easing: java.lang.String,
    callback: js.Function
  ): RaphaelSet = js.native
  def animateWith(el: RaphaelElement, anim: RaphaelAnimation, animation: RaphaelAnimation): RaphaelSet = js.native
  def animateWith(el: RaphaelElement, anim: RaphaelAnimation, params: js.Any, ms: scala.Double): RaphaelSet = js.native
  def animateWith(
    el: RaphaelElement,
    anim: RaphaelAnimation,
    params: js.Any,
    ms: scala.Double,
    easing: java.lang.String
  ): RaphaelSet = js.native
  def animateWith(
    el: RaphaelElement,
    anim: RaphaelAnimation,
    params: js.Any,
    ms: scala.Double,
    easing: java.lang.String,
    callback: js.Function
  ): RaphaelSet = js.native
  def attr(attrName: java.lang.String): js.Any = js.native
  def attr(attrName: java.lang.String, value: js.Any): RaphaelSet = js.native
  def attr(attrNames: js.Array[java.lang.String]): js.Array[_] = js.native
  def attr(params: ScalablyTyped.runtime.StringDictionary[js.Any]): RaphaelSet = js.native
  def clear(): scala.Unit = js.native
  def click(handler: js.Function): RaphaelSet = js.native
  def data(key: java.lang.String): js.Any = js.native
  def data(key: java.lang.String, value: js.Any): RaphaelSet = js.native
  def dblclick(handler: js.Function): RaphaelSet = js.native
  def drag(
    onmove: js.Function5[
      /* dx */ scala.Double, 
      /* dy */ scala.Double, 
      /* x */ scala.Double, 
      /* y */ scala.Double, 
      /* event */ stdLib.DragEvent, 
      js.Object
    ],
    onstart: js.Function3[/* x */ scala.Double, /* y */ scala.Double, /* event */ stdLib.DragEvent, js.Object],
    onend: js.Function1[/* DragEvent */ js.Any, js.Object]
  ): RaphaelSet = js.native
  def drag(
    onmove: js.Function5[
      /* dx */ scala.Double, 
      /* dy */ scala.Double, 
      /* x */ scala.Double, 
      /* y */ scala.Double, 
      /* event */ stdLib.DragEvent, 
      js.Object
    ],
    onstart: js.Function3[/* x */ scala.Double, /* y */ scala.Double, /* event */ stdLib.DragEvent, js.Object],
    onend: js.Function1[/* DragEvent */ js.Any, js.Object],
    mcontext: js.Any
  ): RaphaelSet = js.native
  def drag(
    onmove: js.Function5[
      /* dx */ scala.Double, 
      /* dy */ scala.Double, 
      /* x */ scala.Double, 
      /* y */ scala.Double, 
      /* event */ stdLib.DragEvent, 
      js.Object
    ],
    onstart: js.Function3[/* x */ scala.Double, /* y */ scala.Double, /* event */ stdLib.DragEvent, js.Object],
    onend: js.Function1[/* DragEvent */ js.Any, js.Object],
    mcontext: js.Any,
    scontext: js.Any
  ): RaphaelSet = js.native
  def drag(
    onmove: js.Function5[
      /* dx */ scala.Double, 
      /* dy */ scala.Double, 
      /* x */ scala.Double, 
      /* y */ scala.Double, 
      /* event */ stdLib.DragEvent, 
      js.Object
    ],
    onstart: js.Function3[/* x */ scala.Double, /* y */ scala.Double, /* event */ stdLib.DragEvent, js.Object],
    onend: js.Function1[/* DragEvent */ js.Any, js.Object],
    mcontext: js.Any,
    scontext: js.Any,
    econtext: js.Any
  ): RaphaelSet = js.native
  def exclude(element: RaphaelElement): scala.Boolean = js.native
  def forEach(callback: js.Function): RaphaelSet = js.native
  def forEach(callback: js.Function, thisArg: js.Any): RaphaelSet = js.native
  def getBBox(): BoundingBox = js.native
  def getBBox(isWithoutTransform: scala.Boolean): BoundingBox = js.native
  def glow(): RaphaelSet = js.native
  def glow(glow: Anon_Color): RaphaelSet = js.native
  def hide(): RaphaelSet = js.native
  def hover(f_in: js.Function, f_out: js.Function): RaphaelSet = js.native
  def hover(f_in: js.Function, f_out: js.Function, icontext: js.Any): RaphaelSet = js.native
  def hover(f_in: js.Function, f_out: js.Function, icontext: js.Any, ocontext: js.Any): RaphaelSet = js.native
  def insertAfter(el: RaphaelElement): RaphaelSet = js.native
  def insertBefore(el: RaphaelElement): RaphaelSet = js.native
  def isPointInside(x: scala.Double, y: scala.Double): scala.Boolean = js.native
  def isVisible(): scala.Boolean = js.native
  def mousedown(handler: js.Function): RaphaelSet = js.native
  def mousemove(handler: js.Function): RaphaelSet = js.native
  def mouseout(handler: js.Function): RaphaelSet = js.native
  def mouseover(handler: js.Function): RaphaelSet = js.native
  def mouseup(handler: js.Function): RaphaelSet = js.native
  def onDragOver(f: js.Function): RaphaelSet = js.native
  def pause(): RaphaelSet = js.native
  def pause(anim: RaphaelAnimation): RaphaelSet = js.native
  def pop(): RaphaelElement = js.native
  def push(RaphaelElement: js.Any*): RaphaelSet = js.native
  def raphael(): RaphaelPaper = js.native
  def raphael(all: js.Array[_]): RaphaelPaper = js.native
  def raphael(all: js.Array[_], callback: js.Function): RaphaelPaper = js.native
  def raphael(container: java.lang.String, width: scala.Double, height: scala.Double): RaphaelPaper = js.native
  def raphael(container: java.lang.String, width: scala.Double, height: scala.Double, callback: js.Function): RaphaelPaper = js.native
  def raphael(container: stdLib.HTMLElement, width: scala.Double, height: scala.Double): RaphaelPaper = js.native
  def raphael(container: stdLib.HTMLElement, width: scala.Double, height: scala.Double, callback: js.Function): RaphaelPaper = js.native
  def raphael(onReadyCallback: js.Function): RaphaelPaper = js.native
  def raphael(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): RaphaelPaper = js.native
  def raphael(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double, callback: js.Function): RaphaelPaper = js.native
  def remove(): scala.Unit = js.native
  def removeData(): RaphaelSet = js.native
  def removeData(key: java.lang.String): RaphaelSet = js.native
  def resume(): RaphaelSet = js.native
  def resume(anim: RaphaelAnimation): RaphaelSet = js.native
  def setTime(anim: RaphaelAnimation): scala.Unit = js.native
  def setTime(anim: RaphaelAnimation, value: scala.Double): RaphaelSet = js.native
  def show(): RaphaelSet = js.native
  def splice(index: scala.Double, count: scala.Double): RaphaelSet = js.native
  def splice(index: scala.Double, count: scala.Double, insertion: RaphaelElement*): RaphaelSet = js.native
  def status(): js.Array[Anon_Anim] = js.native
  def status(anim: RaphaelAnimation): scala.Double = js.native
  def status(anim: RaphaelAnimation, value: scala.Double): RaphaelSet = js.native
  def stop(): RaphaelSet = js.native
  def stop(anim: RaphaelAnimation): RaphaelSet = js.native
  def toBack(): RaphaelSet = js.native
  def toFront(): RaphaelSet = js.native
  def touchcancel(handler: js.Function): RaphaelSet = js.native
  def touchend(handler: js.Function): RaphaelSet = js.native
  def touchmove(handler: js.Function): RaphaelSet = js.native
  def touchstart(handler: js.Function): RaphaelSet = js.native
  def transform(): java.lang.String = js.native
  def transform(tstr: java.lang.String): RaphaelSet = js.native
  def unclick(handler: js.Function): RaphaelSet = js.native
  def undblclick(handler: js.Function): RaphaelSet = js.native
  def undrag(): RaphaelSet = js.native
  def unhover(): RaphaelSet = js.native
  def unhover(f_in: js.Function, f_out: js.Function): RaphaelSet = js.native
  def unmousedown(handler: js.Function): RaphaelSet = js.native
  def unmousemove(handler: js.Function): RaphaelSet = js.native
  def unmouseout(handler: js.Function): RaphaelSet = js.native
  def unmouseover(handler: js.Function): RaphaelSet = js.native
  def unmouseup(handler: js.Function): RaphaelSet = js.native
  def untouchcancel(handler: js.Function): RaphaelSet = js.native
  def untouchend(handler: js.Function): RaphaelSet = js.native
  def untouchmove(handler: js.Function): RaphaelSet = js.native
  def untouchstart(handler: js.Function): RaphaelSet = js.native
}

