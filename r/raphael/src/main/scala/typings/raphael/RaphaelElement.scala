package typings.raphael

import org.scalablytyped.runtime.StringDictionary
import typings.std.DragEvent
import typings.std.HTMLElement
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RaphaelElement extends js.Object {
  var id: String = js.native
  var matrix: RaphaelMatrix = js.native
  var next: RaphaelElement = js.native
  var node: SVGElement = js.native
  var paper: RaphaelPaper = js.native
  var prev: RaphaelElement = js.native
  @JSName("raphael")
  var raphael_Original: RaphaelStatic = js.native
  def animate(animation: RaphaelAnimation): RaphaelElement = js.native
  def animate(params: StringDictionary[js.Any], ms: Double): RaphaelElement = js.native
  def animate(params: StringDictionary[js.Any], ms: Double, easing: String): RaphaelElement = js.native
  def animate(params: StringDictionary[js.Any], ms: Double, easing: String, callback: js.Function): RaphaelElement = js.native
  def animateWith(el: RaphaelElement, anim: RaphaelAnimation, animation: RaphaelAnimation): RaphaelElement = js.native
  def animateWith(el: RaphaelElement, anim: RaphaelAnimation, params: js.Any, ms: Double): RaphaelElement = js.native
  def animateWith(el: RaphaelElement, anim: RaphaelAnimation, params: js.Any, ms: Double, easing: String): RaphaelElement = js.native
  def animateWith(
    el: RaphaelElement,
    anim: RaphaelAnimation,
    params: js.Any,
    ms: Double,
    easing: String,
    callback: js.Function
  ): RaphaelElement = js.native
  def attr(attrName: String): js.Any = js.native
  def attr(attrName: String, value: js.Any): RaphaelElement = js.native
  def attr(attrNames: js.Array[String]): js.Array[_] = js.native
  def attr(params: js.Any): RaphaelElement = js.native
  def click(handler: js.Function): RaphaelElement = js.native
  def data(key: String): js.Any = js.native
  def data(key: String, value: js.Any): RaphaelElement = js.native
  def dblclick(handler: js.Function): RaphaelElement = js.native
  def drag(
    onmove: js.Function5[
      /* dx */ Double, 
      /* dy */ Double, 
      /* x */ Double, 
      /* y */ Double, 
      /* event */ DragEvent, 
      js.Object
    ],
    onstart: js.Function3[/* x */ Double, /* y */ Double, /* event */ DragEvent, js.Object],
    onend: js.Function1[/* DragEvent */ js.Any, js.Object]
  ): RaphaelElement = js.native
  def drag(
    onmove: js.Function5[
      /* dx */ Double, 
      /* dy */ Double, 
      /* x */ Double, 
      /* y */ Double, 
      /* event */ DragEvent, 
      js.Object
    ],
    onstart: js.Function3[/* x */ Double, /* y */ Double, /* event */ DragEvent, js.Object],
    onend: js.Function1[/* DragEvent */ js.Any, js.Object],
    mcontext: js.Any
  ): RaphaelElement = js.native
  def drag(
    onmove: js.Function5[
      /* dx */ Double, 
      /* dy */ Double, 
      /* x */ Double, 
      /* y */ Double, 
      /* event */ DragEvent, 
      js.Object
    ],
    onstart: js.Function3[/* x */ Double, /* y */ Double, /* event */ DragEvent, js.Object],
    onend: js.Function1[/* DragEvent */ js.Any, js.Object],
    mcontext: js.Any,
    scontext: js.Any
  ): RaphaelElement = js.native
  def drag(
    onmove: js.Function5[
      /* dx */ Double, 
      /* dy */ Double, 
      /* x */ Double, 
      /* y */ Double, 
      /* event */ DragEvent, 
      js.Object
    ],
    onstart: js.Function3[/* x */ Double, /* y */ Double, /* event */ DragEvent, js.Object],
    onend: js.Function1[/* DragEvent */ js.Any, js.Object],
    mcontext: js.Any,
    scontext: js.Any,
    econtext: js.Any
  ): RaphaelElement = js.native
  def getBBox(): BoundingBox = js.native
  def getBBox(isWithoutTransform: Boolean): BoundingBox = js.native
  def glow(): RaphaelSet = js.native
  def glow(glow: Anon_Color): RaphaelSet = js.native
  def hide(): RaphaelElement = js.native
  def hover(f_in: js.Function, f_out: js.Function): RaphaelElement = js.native
  def hover(f_in: js.Function, f_out: js.Function, icontext: js.Any): RaphaelElement = js.native
  def hover(f_in: js.Function, f_out: js.Function, icontext: js.Any, ocontext: js.Any): RaphaelElement = js.native
  def insertAfter(el: RaphaelElement): RaphaelElement = js.native
  def insertBefore(el: RaphaelElement): RaphaelElement = js.native
  def isPointInside(x: Double, y: Double): Boolean = js.native
  def isVisible(): Boolean = js.native
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
  def raphael(container: String, width: Double, height: Double): RaphaelPaper = js.native
  def raphael(container: String, width: Double, height: Double, callback: js.Function): RaphaelPaper = js.native
  def raphael(container: HTMLElement, width: Double, height: Double): RaphaelPaper = js.native
  def raphael(container: HTMLElement, width: Double, height: Double, callback: js.Function): RaphaelPaper = js.native
  def raphael(onReadyCallback: js.Function): RaphaelPaper = js.native
  def raphael(x: Double, y: Double, width: Double, height: Double): RaphaelPaper = js.native
  def raphael(x: Double, y: Double, width: Double, height: Double, callback: js.Function): RaphaelPaper = js.native
  def remove(): Unit = js.native
  def removeData(): RaphaelElement = js.native
  def removeData(key: String): RaphaelElement = js.native
  def resume(): RaphaelElement = js.native
  def resume(anim: RaphaelAnimation): RaphaelElement = js.native
  def rotate(deg: Double): RaphaelElement = js.native
  def rotate(deg: Double, cx: Double): RaphaelElement = js.native
  def rotate(deg: Double, cx: Double, cy: Double): RaphaelElement = js.native
  def setTime(anim: RaphaelAnimation): Unit = js.native
  def setTime(anim: RaphaelAnimation, value: Double): RaphaelElement = js.native
  def show(): RaphaelElement = js.native
  def status(): js.Array[Anon_Anim] = js.native
  def status(anim: RaphaelAnimation): Double = js.native
  def status(anim: RaphaelAnimation, value: Double): RaphaelElement = js.native
  def stop(): RaphaelElement = js.native
  def stop(anim: RaphaelAnimation): RaphaelElement = js.native
  def toBack(): RaphaelElement = js.native
  def toFront(): RaphaelElement = js.native
  def touchcancel(handler: js.Function): RaphaelElement = js.native
  def touchend(handler: js.Function): RaphaelElement = js.native
  def touchmove(handler: js.Function): RaphaelElement = js.native
  def touchstart(handler: js.Function): RaphaelElement = js.native
  def transform(): String = js.native
  def transform(tstr: String): RaphaelElement = js.native
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

