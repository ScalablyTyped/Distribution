package typings
package sharepointLib.SPAnimationUtilityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SPAnimationUtility.BasicAnimator")
@js.native
class BasicAnimator () extends js.Object

/* static members */
@JSGlobal("SPAnimationUtility.BasicAnimator")
@js.native
object BasicAnimator extends js.Object {
  def CommonResize(
    element: stdLib.HTMLElement,
    newHeight: scala.Double,
    newWidth: scala.Double,
    finishFunc: js.Function1[/* data */ js.Any, scala.Unit],
    data: js.Any,
    animationId: sharepointLib.SPAnimationNs.ID
  ): scala.Unit = js.native
  def FadeIn(element: stdLib.HTMLElement): scala.Unit = js.native
  def FadeIn(element: stdLib.HTMLElement, finishFunc: js.Function1[/* data */ js.Any, scala.Unit]): scala.Unit = js.native
  def FadeIn(element: stdLib.HTMLElement, finishFunc: js.Function1[/* data */ js.Any, scala.Unit], data: js.Any): scala.Unit = js.native
  def FadeOut(element: stdLib.HTMLElement): scala.Unit = js.native
  def FadeOut(element: stdLib.HTMLElement, finishFunc: js.Function1[/* data */ js.Any, scala.Unit]): scala.Unit = js.native
  def FadeOut(element: stdLib.HTMLElement, finishFunc: js.Function1[/* data */ js.Any, scala.Unit], data: js.Any): scala.Unit = js.native
  def GetLeftOffset(element: stdLib.HTMLElement): scala.Double = js.native
  def GetRightOffset(element: stdLib.HTMLElement): scala.Double = js.native
  def GetTopOffset(element: stdLib.HTMLElement): scala.Double = js.native
  def GetWindowScrollPosition(): sharepointLib.Anon_X = js.native
  def IsPositioned(element: stdLib.HTMLElement): scala.Boolean = js.native
  def Move(element: stdLib.HTMLElement, posX: scala.Double, posY: scala.Double): scala.Unit = js.native
  def Move(
    element: stdLib.HTMLElement,
    posX: scala.Double,
    posY: scala.Double,
    finishFunc: js.Function1[/* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def Move(
    element: stdLib.HTMLElement,
    posX: scala.Double,
    posY: scala.Double,
    finishFunc: js.Function1[/* data */ js.Any, scala.Unit],
    data: js.Any
  ): scala.Unit = js.native
  def PositionAbsolute(element: stdLib.HTMLElement): scala.Unit = js.native
  def PositionAbsoluteExact(
    element: stdLib.HTMLElement,
    topValue: scala.Double,
    leftValue: scala.Double,
    heightValue: scala.Double,
    widthValue: scala.Double
  ): scala.Unit = js.native
  def PositionElement(
    element: stdLib.HTMLElement,
    topValue: scala.Double,
    leftValue: scala.Double,
    heightValue: scala.Double,
    widthValue: scala.Double
  ): scala.Unit = js.native
  def PositionRelative(element: stdLib.HTMLElement): scala.Unit = js.native
  def PositionRelativeExact(
    element: stdLib.HTMLElement,
    topValue: scala.Double,
    leftValue: scala.Double,
    heightValue: scala.Double,
    widthValue: scala.Double
  ): scala.Unit = js.native
  def QuickResize(element: stdLib.HTMLElement, newHeight: scala.Double, newWidth: scala.Double): scala.Unit = js.native
  def QuickResize(
    element: stdLib.HTMLElement,
    newHeight: scala.Double,
    newWidth: scala.Double,
    finishFunc: js.Function1[/* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def QuickResize(
    element: stdLib.HTMLElement,
    newHeight: scala.Double,
    newWidth: scala.Double,
    finishFunc: js.Function1[/* data */ js.Any, scala.Unit],
    data: js.Any
  ): scala.Unit = js.native
  def Resize(element: stdLib.HTMLElement, newHeight: scala.Double, newWidth: scala.Double): scala.Unit = js.native
  def Resize(
    element: stdLib.HTMLElement,
    newHeight: scala.Double,
    newWidth: scala.Double,
    finishFunc: js.Function1[/* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def Resize(
    element: stdLib.HTMLElement,
    newHeight: scala.Double,
    newWidth: scala.Double,
    finishFunc: js.Function1[/* data */ js.Any, scala.Unit],
    data: js.Any
  ): scala.Unit = js.native
  def ResizeContainerAndFillContent(
    element: stdLib.HTMLElement,
    newHeight: scala.Double,
    newWidth: scala.Double,
    finishFunc: js.Function0[scala.Unit],
    fAddToEnd: scala.Boolean
  ): scala.Unit = js.native
  def StrikeThrough(element: stdLib.HTMLElement, strikeThroughWidth: scala.Double): scala.Unit = js.native
  def StrikeThrough(
    element: stdLib.HTMLElement,
    strikeThroughWidth: scala.Double,
    finishFunc: js.Function1[/* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def StrikeThrough(
    element: stdLib.HTMLElement,
    strikeThroughWidth: scala.Double,
    finishFunc: js.Function1[/* data */ js.Any, scala.Unit],
    data: js.Any
  ): scala.Unit = js.native
}

