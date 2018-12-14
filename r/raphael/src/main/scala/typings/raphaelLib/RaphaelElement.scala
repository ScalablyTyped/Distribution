package typings
package raphaelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RaphaelElement extends js.Object {
  var id: java.lang.String = js.native
  var matrix: RaphaelMatrix = js.native
  var next: RaphaelElement = js.native
  var node: stdLib.SVGElement = js.native
  var paper: RaphaelPaper = js.native
  var prev: RaphaelElement = js.native
  @JSName("raphael")
  var raphael_Original: RaphaelStatic = js.native
  def animate(animation: RaphaelAnimation): RaphaelElement = js.native
  def animate(params: org.scalablytyped.runtime.StringDictionary[js.Any], ms: scala.Double): RaphaelElement = js.native
  def animate(
    params: org.scalablytyped.runtime.StringDictionary[js.Any],
    ms: scala.Double,
    easing: java.lang.String
  ): RaphaelElement = js.native
  def animate(
    params: org.scalablytyped.runtime.StringDictionary[js.Any],
    ms: scala.Double,
    easing: java.lang.String,
    callback: js.Function
  ): RaphaelElement = js.native
  def animateWith(el: RaphaelElement, anim: RaphaelAnimation, animation: RaphaelAnimation): RaphaelElement = js.native
  def animateWith(el: RaphaelElement, anim: RaphaelAnimation, params: js.Any, ms: scala.Double): RaphaelElement = js.native
  def animateWith(
    el: RaphaelElement,
    anim: RaphaelAnimation,
    params: js.Any,
    ms: scala.Double,
    easing: java.lang.String
  ): RaphaelElement = js.native
  def animateWith(
    el: RaphaelElement,
    anim: RaphaelAnimation,
    params: js.Any,
    ms: scala.Double,
    easing: java.lang.String,
    callback: js.Function
  ): RaphaelElement = js.native
  def attr(attrName: java.lang.String): js.Any = js.native
  def attr(attrName: java.lang.String, value: js.Any): RaphaelElement = js.native
  def attr(attrNames: js.Array[java.lang.String]): js.Array[_] = js.native
  def attr(params: js.Any): RaphaelElement = js.native
  def click(handler: js.Function): RaphaelElement = js.native
  def data(key: java.lang.String): js.Any = js.native
  def data(key: java.lang.String, value: js.Any): RaphaelElement = js.native
  def dblclick(handler: js.Function): RaphaelElement = js.native
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
  ): RaphaelElement = js.native
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
  ): RaphaelElement = js.native
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
  ): RaphaelElement = js.native
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
  ): RaphaelElement = js.native
  def getBBox(): BoundingBox = js.native
  def getBBox(isWithoutTransform: scala.Boolean): BoundingBox = js.native
  def glow(): RaphaelSet = js.native
  def glow(glow: Anon_Color): RaphaelSet = js.native
  def hide(): RaphaelElement = js.native
  def hover(f_in: js.Function, f_out: js.Function): RaphaelElement = js.native
  def hover(f_in: js.Function, f_out: js.Function, icontext: js.Any): RaphaelElement = js.native
  def hover(f_in: js.Function, f_out: js.Function, icontext: js.Any, ocontext: js.Any): RaphaelElement = js.native
  def insertAfter(el: RaphaelElement): RaphaelElement = js.native
  def insertBefore(el: RaphaelElement): RaphaelElement = js.native
  def isPointInside(x: scala.Double, y: scala.Double): scala.Boolean = js.native
  def isVisible(): scala.Boolean = js.native
  def mousedown(handler: js.Function): RaphaelElement = js.native
  def mousemove(handler: js.Function): RaphaelElement = js.native
  def mouseout(handler: js.Function): RaphaelElement = js.native
  def mouseover(handler: js.Function): RaphaelElement = js.native
  def mouseup(handler: js.Function): RaphaelElement = js.native
  def onDragOver(f: js.Function): RaphaelElement = js.native
  def pause(): RaphaelElement = js.native
  def pause(anim: RaphaelAnimation): RaphaelElement = js.native
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
  def removeData(): RaphaelElement = js.native
  def removeData(key: java.lang.String): RaphaelElement = js.native
  def resume(): RaphaelElement = js.native
  def resume(anim: RaphaelAnimation): RaphaelElement = js.native
  def rotate(deg: scala.Double): RaphaelElement = js.native
  def rotate(deg: scala.Double, cx: scala.Double): RaphaelElement = js.native
  def rotate(deg: scala.Double, cx: scala.Double, cy: scala.Double): RaphaelElement = js.native
  def setTime(anim: RaphaelAnimation): scala.Unit = js.native
  def setTime(anim: RaphaelAnimation, value: scala.Double): RaphaelElement = js.native
  def show(): RaphaelElement = js.native
  def status(): js.Array[Anon_Anim] = js.native
  def status(anim: RaphaelAnimation): scala.Double = js.native
  def status(anim: RaphaelAnimation, value: scala.Double): RaphaelElement = js.native
  def stop(): RaphaelElement = js.native
  def stop(anim: RaphaelAnimation): RaphaelElement = js.native
  def toBack(): RaphaelElement = js.native
  def toFront(): RaphaelElement = js.native
  def touchcancel(handler: js.Function): RaphaelElement = js.native
  def touchend(handler: js.Function): RaphaelElement = js.native
  def touchmove(handler: js.Function): RaphaelElement = js.native
  def touchstart(handler: js.Function): RaphaelElement = js.native
  def transform(): java.lang.String = js.native
  def transform(tstr: java.lang.String): RaphaelElement = js.native
  def unclick(handler: js.Function): RaphaelElement = js.native
  def undblclick(handler: js.Function): RaphaelElement = js.native
  def undrag(): RaphaelElement = js.native
  def unhover(): RaphaelElement = js.native
  def unhover(f_in: js.Function, f_out: js.Function): RaphaelElement = js.native
  def unmousedown(handler: js.Function): RaphaelElement = js.native
  def unmousemove(handler: js.Function): RaphaelElement = js.native
  def unmouseout(handler: js.Function): RaphaelElement = js.native
  def unmouseover(handler: js.Function): RaphaelElement = js.native
  def unmouseup(handler: js.Function): RaphaelElement = js.native
  def untouchcancel(handler: js.Function): RaphaelElement = js.native
  def untouchend(handler: js.Function): RaphaelElement = js.native
  def untouchmove(handler: js.Function): RaphaelElement = js.native
  def untouchstart(handler: js.Function): RaphaelElement = js.native
}

