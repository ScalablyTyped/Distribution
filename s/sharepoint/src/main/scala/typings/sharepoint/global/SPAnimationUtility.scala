package typings.sharepoint.global

import typings.sharepoint.SPAnimation.ID
import typings.sharepoint.anon.X
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SPAnimationUtility {
  
  @JSGlobal("SPAnimationUtility.BasicAnimator")
  @js.native
  class BasicAnimator ()
    extends typings.sharepoint.SPAnimationUtility.BasicAnimator
  object BasicAnimator {
    
    /* static member */
    @JSGlobal("SPAnimationUtility.BasicAnimator.CommonResize")
    @js.native
    def CommonResize(
      element: HTMLElement,
      newHeight: Double,
      newWidth: Double,
      finishFunc: js.Function1[/* data */ js.Any, Unit],
      data: js.Any,
      animationId: ID
    ): Unit = js.native
    
    /* static member */
    @JSGlobal("SPAnimationUtility.BasicAnimator.FadeIn")
    @js.native
    def FadeIn(element: HTMLElement): Unit = js.native
    @JSGlobal("SPAnimationUtility.BasicAnimator.FadeIn")
    @js.native
    def FadeIn(element: HTMLElement, finishFunc: js.UndefOr[scala.Nothing], data: js.Any): Unit = js.native
    @JSGlobal("SPAnimationUtility.BasicAnimator.FadeIn")
    @js.native
    def FadeIn(element: HTMLElement, finishFunc: js.Function1[/* data */ js.Any, Unit]): Unit = js.native
    @JSGlobal("SPAnimationUtility.BasicAnimator.FadeIn")
    @js.native
    def FadeIn(element: HTMLElement, finishFunc: js.Function1[/* data */ js.Any, Unit], data: js.Any): Unit = js.native
    
    /* static member */
    @JSGlobal("SPAnimationUtility.BasicAnimator.FadeOut")
    @js.native
    def FadeOut(element: HTMLElement): Unit = js.native
    @JSGlobal("SPAnimationUtility.BasicAnimator.FadeOut")
    @js.native
    def FadeOut(element: HTMLElement, finishFunc: js.UndefOr[scala.Nothing], data: js.Any): Unit = js.native
    @JSGlobal("SPAnimationUtility.BasicAnimator.FadeOut")
    @js.native
    def FadeOut(element: HTMLElement, finishFunc: js.Function1[/* data */ js.Any, Unit]): Unit = js.native
    @JSGlobal("SPAnimationUtility.BasicAnimator.FadeOut")
    @js.native
    def FadeOut(element: HTMLElement, finishFunc: js.Function1[/* data */ js.Any, Unit], data: js.Any): Unit = js.native
    
    /* static member */
    @JSGlobal("SPAnimationUtility.BasicAnimator.GetLeftOffset")
    @js.native
    def GetLeftOffset(element: HTMLElement): Double = js.native
    
    /* static member */
    @JSGlobal("SPAnimationUtility.BasicAnimator.GetRightOffset")
    @js.native
    def GetRightOffset(element: HTMLElement): Double = js.native
    
    /* static member */
    @JSGlobal("SPAnimationUtility.BasicAnimator.GetTopOffset")
    @js.native
    def GetTopOffset(element: HTMLElement): Double = js.native
    
    /* static member */
    @JSGlobal("SPAnimationUtility.BasicAnimator.GetWindowScrollPosition")
    @js.native
    def GetWindowScrollPosition(): X = js.native
    
    /* static member */
    @JSGlobal("SPAnimationUtility.BasicAnimator.IsPositioned")
    @js.native
    def IsPositioned(element: HTMLElement): Boolean = js.native
    
    /* static member */
    @JSGlobal("SPAnimationUtility.BasicAnimator.Move")
    @js.native
    def Move(element: HTMLElement, posX: Double, posY: Double): Unit = js.native
    @JSGlobal("SPAnimationUtility.BasicAnimator.Move")
    @js.native
    def Move(
      element: HTMLElement,
      posX: Double,
      posY: Double,
      finishFunc: js.UndefOr[scala.Nothing],
      data: js.Any
    ): Unit = js.native
    @JSGlobal("SPAnimationUtility.BasicAnimator.Move")
    @js.native
    def Move(
      element: HTMLElement,
      posX: Double,
      posY: Double,
      finishFunc: js.Function1[/* data */ js.Any, Unit]
    ): Unit = js.native
    @JSGlobal("SPAnimationUtility.BasicAnimator.Move")
    @js.native
    def Move(
      element: HTMLElement,
      posX: Double,
      posY: Double,
      finishFunc: js.Function1[/* data */ js.Any, Unit],
      data: js.Any
    ): Unit = js.native
    
    /* static member */
    @JSGlobal("SPAnimationUtility.BasicAnimator.PositionAbsolute")
    @js.native
    def PositionAbsolute(element: HTMLElement): Unit = js.native
    
    /* static member */
    @JSGlobal("SPAnimationUtility.BasicAnimator.PositionAbsoluteExact")
    @js.native
    def PositionAbsoluteExact(element: HTMLElement, topValue: Double, leftValue: Double, heightValue: Double, widthValue: Double): Unit = js.native
    
    /* static member */
    @JSGlobal("SPAnimationUtility.BasicAnimator.PositionElement")
    @js.native
    def PositionElement(element: HTMLElement, topValue: Double, leftValue: Double, heightValue: Double, widthValue: Double): Unit = js.native
    
    /* static member */
    @JSGlobal("SPAnimationUtility.BasicAnimator.PositionRelative")
    @js.native
    def PositionRelative(element: HTMLElement): Unit = js.native
    
    /* static member */
    @JSGlobal("SPAnimationUtility.BasicAnimator.PositionRelativeExact")
    @js.native
    def PositionRelativeExact(element: HTMLElement, topValue: Double, leftValue: Double, heightValue: Double, widthValue: Double): Unit = js.native
    
    /* static member */
    @JSGlobal("SPAnimationUtility.BasicAnimator.QuickResize")
    @js.native
    def QuickResize(element: HTMLElement, newHeight: Double, newWidth: Double): Unit = js.native
    @JSGlobal("SPAnimationUtility.BasicAnimator.QuickResize")
    @js.native
    def QuickResize(
      element: HTMLElement,
      newHeight: Double,
      newWidth: Double,
      finishFunc: js.UndefOr[scala.Nothing],
      data: js.Any
    ): Unit = js.native
    @JSGlobal("SPAnimationUtility.BasicAnimator.QuickResize")
    @js.native
    def QuickResize(
      element: HTMLElement,
      newHeight: Double,
      newWidth: Double,
      finishFunc: js.Function1[/* data */ js.Any, Unit]
    ): Unit = js.native
    @JSGlobal("SPAnimationUtility.BasicAnimator.QuickResize")
    @js.native
    def QuickResize(
      element: HTMLElement,
      newHeight: Double,
      newWidth: Double,
      finishFunc: js.Function1[/* data */ js.Any, Unit],
      data: js.Any
    ): Unit = js.native
    
    /* static member */
    @JSGlobal("SPAnimationUtility.BasicAnimator.Resize")
    @js.native
    def Resize(element: HTMLElement, newHeight: Double, newWidth: Double): Unit = js.native
    @JSGlobal("SPAnimationUtility.BasicAnimator.Resize")
    @js.native
    def Resize(
      element: HTMLElement,
      newHeight: Double,
      newWidth: Double,
      finishFunc: js.UndefOr[scala.Nothing],
      data: js.Any
    ): Unit = js.native
    @JSGlobal("SPAnimationUtility.BasicAnimator.Resize")
    @js.native
    def Resize(
      element: HTMLElement,
      newHeight: Double,
      newWidth: Double,
      finishFunc: js.Function1[/* data */ js.Any, Unit]
    ): Unit = js.native
    @JSGlobal("SPAnimationUtility.BasicAnimator.Resize")
    @js.native
    def Resize(
      element: HTMLElement,
      newHeight: Double,
      newWidth: Double,
      finishFunc: js.Function1[/* data */ js.Any, Unit],
      data: js.Any
    ): Unit = js.native
    
    /* static member */
    @JSGlobal("SPAnimationUtility.BasicAnimator.ResizeContainerAndFillContent")
    @js.native
    def ResizeContainerAndFillContent(
      element: HTMLElement,
      newHeight: Double,
      newWidth: Double,
      finishFunc: js.Function0[Unit],
      fAddToEnd: Boolean
    ): Unit = js.native
    
    /* static member */
    @JSGlobal("SPAnimationUtility.BasicAnimator.StrikeThrough")
    @js.native
    def StrikeThrough(element: HTMLElement, strikeThroughWidth: Double): Unit = js.native
    @JSGlobal("SPAnimationUtility.BasicAnimator.StrikeThrough")
    @js.native
    def StrikeThrough(
      element: HTMLElement,
      strikeThroughWidth: Double,
      finishFunc: js.UndefOr[scala.Nothing],
      data: js.Any
    ): Unit = js.native
    @JSGlobal("SPAnimationUtility.BasicAnimator.StrikeThrough")
    @js.native
    def StrikeThrough(
      element: HTMLElement,
      strikeThroughWidth: Double,
      finishFunc: js.Function1[/* data */ js.Any, Unit]
    ): Unit = js.native
    @JSGlobal("SPAnimationUtility.BasicAnimator.StrikeThrough")
    @js.native
    def StrikeThrough(
      element: HTMLElement,
      strikeThroughWidth: Double,
      finishFunc: js.Function1[/* data */ js.Any, Unit],
      data: js.Any
    ): Unit = js.native
  }
}
