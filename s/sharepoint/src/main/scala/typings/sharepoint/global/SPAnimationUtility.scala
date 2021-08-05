package typings.sharepoint.global

import typings.sharepoint.SPAnimation.ID
import typings.sharepoint.anon.X
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SPAnimationUtility {
  
  @JSGlobal("SPAnimationUtility.BasicAnimator")
  @js.native
  class BasicAnimator ()
    extends StObject
       with typings.sharepoint.SPAnimationUtility.BasicAnimator
  object BasicAnimator {
    
    @JSGlobal("SPAnimationUtility.BasicAnimator")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def CommonResize(
      element: HTMLElement,
      newHeight: Double,
      newWidth: Double,
      finishFunc: js.Function1[/* data */ js.Any, Unit],
      data: js.Any,
      animationId: ID
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CommonResize")(element.asInstanceOf[js.Any], newHeight.asInstanceOf[js.Any], newWidth.asInstanceOf[js.Any], finishFunc.asInstanceOf[js.Any], data.asInstanceOf[js.Any], animationId.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def FadeIn(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("FadeIn")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def FadeIn(element: HTMLElement, finishFunc: js.Function1[/* data */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("FadeIn")(element.asInstanceOf[js.Any], finishFunc.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def FadeIn(element: HTMLElement, finishFunc: js.Function1[/* data */ js.Any, Unit], data: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("FadeIn")(element.asInstanceOf[js.Any], finishFunc.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def FadeIn(element: HTMLElement, finishFunc: Unit, data: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("FadeIn")(element.asInstanceOf[js.Any], finishFunc.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def FadeOut(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("FadeOut")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def FadeOut(element: HTMLElement, finishFunc: js.Function1[/* data */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("FadeOut")(element.asInstanceOf[js.Any], finishFunc.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def FadeOut(element: HTMLElement, finishFunc: js.Function1[/* data */ js.Any, Unit], data: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("FadeOut")(element.asInstanceOf[js.Any], finishFunc.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def FadeOut(element: HTMLElement, finishFunc: Unit, data: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("FadeOut")(element.asInstanceOf[js.Any], finishFunc.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def GetLeftOffset(element: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("GetLeftOffset")(element.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /* static member */
    inline def GetRightOffset(element: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("GetRightOffset")(element.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /* static member */
    inline def GetTopOffset(element: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("GetTopOffset")(element.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /* static member */
    inline def GetWindowScrollPosition(): X = ^.asInstanceOf[js.Dynamic].applyDynamic("GetWindowScrollPosition")().asInstanceOf[X]
    
    /* static member */
    inline def IsPositioned(element: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsPositioned")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def Move(element: HTMLElement, posX: Double, posY: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Move")(element.asInstanceOf[js.Any], posX.asInstanceOf[js.Any], posY.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def Move(
      element: HTMLElement,
      posX: Double,
      posY: Double,
      finishFunc: js.Function1[/* data */ js.Any, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Move")(element.asInstanceOf[js.Any], posX.asInstanceOf[js.Any], posY.asInstanceOf[js.Any], finishFunc.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def Move(
      element: HTMLElement,
      posX: Double,
      posY: Double,
      finishFunc: js.Function1[/* data */ js.Any, Unit],
      data: js.Any
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Move")(element.asInstanceOf[js.Any], posX.asInstanceOf[js.Any], posY.asInstanceOf[js.Any], finishFunc.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def Move(element: HTMLElement, posX: Double, posY: Double, finishFunc: Unit, data: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Move")(element.asInstanceOf[js.Any], posX.asInstanceOf[js.Any], posY.asInstanceOf[js.Any], finishFunc.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def PositionAbsolute(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("PositionAbsolute")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* static member */
    inline def PositionAbsoluteExact(element: HTMLElement, topValue: Double, leftValue: Double, heightValue: Double, widthValue: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PositionAbsoluteExact")(element.asInstanceOf[js.Any], topValue.asInstanceOf[js.Any], leftValue.asInstanceOf[js.Any], heightValue.asInstanceOf[js.Any], widthValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def PositionElement(element: HTMLElement, topValue: Double, leftValue: Double, heightValue: Double, widthValue: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PositionElement")(element.asInstanceOf[js.Any], topValue.asInstanceOf[js.Any], leftValue.asInstanceOf[js.Any], heightValue.asInstanceOf[js.Any], widthValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def PositionRelative(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("PositionRelative")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* static member */
    inline def PositionRelativeExact(element: HTMLElement, topValue: Double, leftValue: Double, heightValue: Double, widthValue: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PositionRelativeExact")(element.asInstanceOf[js.Any], topValue.asInstanceOf[js.Any], leftValue.asInstanceOf[js.Any], heightValue.asInstanceOf[js.Any], widthValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def QuickResize(element: HTMLElement, newHeight: Double, newWidth: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("QuickResize")(element.asInstanceOf[js.Any], newHeight.asInstanceOf[js.Any], newWidth.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def QuickResize(
      element: HTMLElement,
      newHeight: Double,
      newWidth: Double,
      finishFunc: js.Function1[/* data */ js.Any, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("QuickResize")(element.asInstanceOf[js.Any], newHeight.asInstanceOf[js.Any], newWidth.asInstanceOf[js.Any], finishFunc.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def QuickResize(
      element: HTMLElement,
      newHeight: Double,
      newWidth: Double,
      finishFunc: js.Function1[/* data */ js.Any, Unit],
      data: js.Any
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("QuickResize")(element.asInstanceOf[js.Any], newHeight.asInstanceOf[js.Any], newWidth.asInstanceOf[js.Any], finishFunc.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def QuickResize(element: HTMLElement, newHeight: Double, newWidth: Double, finishFunc: Unit, data: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("QuickResize")(element.asInstanceOf[js.Any], newHeight.asInstanceOf[js.Any], newWidth.asInstanceOf[js.Any], finishFunc.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def Resize(element: HTMLElement, newHeight: Double, newWidth: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Resize")(element.asInstanceOf[js.Any], newHeight.asInstanceOf[js.Any], newWidth.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def Resize(
      element: HTMLElement,
      newHeight: Double,
      newWidth: Double,
      finishFunc: js.Function1[/* data */ js.Any, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Resize")(element.asInstanceOf[js.Any], newHeight.asInstanceOf[js.Any], newWidth.asInstanceOf[js.Any], finishFunc.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def Resize(
      element: HTMLElement,
      newHeight: Double,
      newWidth: Double,
      finishFunc: js.Function1[/* data */ js.Any, Unit],
      data: js.Any
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Resize")(element.asInstanceOf[js.Any], newHeight.asInstanceOf[js.Any], newWidth.asInstanceOf[js.Any], finishFunc.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def Resize(element: HTMLElement, newHeight: Double, newWidth: Double, finishFunc: Unit, data: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Resize")(element.asInstanceOf[js.Any], newHeight.asInstanceOf[js.Any], newWidth.asInstanceOf[js.Any], finishFunc.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def ResizeContainerAndFillContent(
      element: HTMLElement,
      newHeight: Double,
      newWidth: Double,
      finishFunc: js.Function0[Unit],
      fAddToEnd: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ResizeContainerAndFillContent")(element.asInstanceOf[js.Any], newHeight.asInstanceOf[js.Any], newWidth.asInstanceOf[js.Any], finishFunc.asInstanceOf[js.Any], fAddToEnd.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def StrikeThrough(element: HTMLElement, strikeThroughWidth: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("StrikeThrough")(element.asInstanceOf[js.Any], strikeThroughWidth.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def StrikeThrough(
      element: HTMLElement,
      strikeThroughWidth: Double,
      finishFunc: js.Function1[/* data */ js.Any, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("StrikeThrough")(element.asInstanceOf[js.Any], strikeThroughWidth.asInstanceOf[js.Any], finishFunc.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def StrikeThrough(
      element: HTMLElement,
      strikeThroughWidth: Double,
      finishFunc: js.Function1[/* data */ js.Any, Unit],
      data: js.Any
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("StrikeThrough")(element.asInstanceOf[js.Any], strikeThroughWidth.asInstanceOf[js.Any], finishFunc.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def StrikeThrough(element: HTMLElement, strikeThroughWidth: Double, finishFunc: Unit, data: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("StrikeThrough")(element.asInstanceOf[js.Any], strikeThroughWidth.asInstanceOf[js.Any], finishFunc.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
