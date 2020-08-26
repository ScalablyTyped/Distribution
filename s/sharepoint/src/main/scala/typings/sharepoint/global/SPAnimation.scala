package typings.sharepoint.global

import typings.sharepoint.SPAnimation.ID
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SPAnimation")
@js.native
object SPAnimation extends js.Object {
  @js.native
  class Object protected ()
    extends typings.sharepoint.SPAnimation.Object {
    def this(
      animationID: ID,
      delay: Double,
      element: js.Array[HTMLElement],
      finalState: typings.sharepoint.SPAnimation.State
    ) = this()
    def this(
      animationID: ID,
      delay: Double,
      element: HTMLElement,
      finalState: typings.sharepoint.SPAnimation.State
    ) = this()
    def this(
      animationID: ID,
      delay: Double,
      element: js.Array[HTMLElement],
      finalState: typings.sharepoint.SPAnimation.State,
      finishFunc: js.Function1[/* data */ js.Any, Unit]
    ) = this()
    def this(
      animationID: ID,
      delay: Double,
      element: HTMLElement,
      finalState: typings.sharepoint.SPAnimation.State,
      finishFunc: js.Function1[/* data */ js.Any, Unit]
    ) = this()
    def this(
      animationID: ID,
      delay: Double,
      element: js.Array[HTMLElement],
      finalState: typings.sharepoint.SPAnimation.State,
      finishFunc: js.UndefOr[scala.Nothing],
      data: js.Any
    ) = this()
    def this(
      animationID: ID,
      delay: Double,
      element: js.Array[HTMLElement],
      finalState: typings.sharepoint.SPAnimation.State,
      finishFunc: js.Function1[/* data */ js.Any, Unit],
      data: js.Any
    ) = this()
    def this(
      animationID: ID,
      delay: Double,
      element: HTMLElement,
      finalState: typings.sharepoint.SPAnimation.State,
      finishFunc: js.UndefOr[scala.Nothing],
      data: js.Any
    ) = this()
    def this(
      animationID: ID,
      delay: Double,
      element: HTMLElement,
      finalState: typings.sharepoint.SPAnimation.State,
      finishFunc: js.Function1[/* data */ js.Any, Unit],
      data: js.Any
    ) = this()
  }
  
  @js.native
  class Settings ()
    extends typings.sharepoint.SPAnimation.Settings
  
  @js.native
  class State ()
    extends typings.sharepoint.SPAnimation.State
  
  @js.native
  object Attribute extends js.Object {
    /* 2 */ val Height: typings.sharepoint.SPAnimation.Attribute.Height with Double = js.native
    /* 4 */ val Opacity: typings.sharepoint.SPAnimation.Attribute.Opacity with Double = js.native
    /* 0 */ val PositionX: typings.sharepoint.SPAnimation.Attribute.PositionX with Double = js.native
    /* 1 */ val PositionY: typings.sharepoint.SPAnimation.Attribute.PositionY with Double = js.native
    /* 3 */ val Width: typings.sharepoint.SPAnimation.Attribute.Width with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SPAnimation.Attribute with Double] = js.native
  }
  
  @js.native
  object ID extends js.Object {
    /* 2 */ val Basic_Fade: typings.sharepoint.SPAnimation.ID.Basic_Fade with Double = js.native
    /* 3 */ val Basic_Move: typings.sharepoint.SPAnimation.ID.Basic_Move with Double = js.native
    /* 14 */ val Basic_Opacity: typings.sharepoint.SPAnimation.ID.Basic_Opacity with Double = js.native
    /* 16 */ val Basic_QuickFade: typings.sharepoint.SPAnimation.ID.Basic_QuickFade with Double = js.native
    /* 15 */ val Basic_QuickShow: typings.sharepoint.SPAnimation.ID.Basic_QuickShow with Double = js.native
    /* 21 */ val Basic_QuickSize: typings.sharepoint.SPAnimation.ID.Basic_QuickSize with Double = js.native
    /* 0 */ val Basic_Show: typings.sharepoint.SPAnimation.ID.Basic_Show with Double = js.native
    /* 4 */ val Basic_Size: typings.sharepoint.SPAnimation.ID.Basic_Size with Double = js.native
    /* 1 */ val Basic_SlowShow: typings.sharepoint.SPAnimation.ID.Basic_SlowShow with Double = js.native
    /* 18 */ val Basic_StrikeThrough: typings.sharepoint.SPAnimation.ID.Basic_StrikeThrough with Double = js.native
    /* 17 */ val Content_SlideInFadeInGeneric: typings.sharepoint.SPAnimation.ID.Content_SlideInFadeInGeneric with Double = js.native
    /* 8 */ val Content_SlideInFadeInLeft: typings.sharepoint.SPAnimation.ID.Content_SlideInFadeInLeft with Double = js.native
    /* 9 */ val Content_SlideInFadeInLeftInc: typings.sharepoint.SPAnimation.ID.Content_SlideInFadeInLeftInc with Double = js.native
    /* 5 */ val Content_SlideInFadeInRight: typings.sharepoint.SPAnimation.ID.Content_SlideInFadeInRight with Double = js.native
    /* 6 */ val Content_SlideInFadeInRightInc: typings.sharepoint.SPAnimation.ID.Content_SlideInFadeInRightInc with Double = js.native
    /* 7 */ val Content_SlideOutFadeOutRight: typings.sharepoint.SPAnimation.ID.Content_SlideOutFadeOutRight with Double = js.native
    /* 19 */ val SmallObject_SlideInFadeInBottom: typings.sharepoint.SPAnimation.ID.SmallObject_SlideInFadeInBottom with Double = js.native
    /* 11 */ val SmallObject_SlideInFadeInLeft: typings.sharepoint.SPAnimation.ID.SmallObject_SlideInFadeInLeft with Double = js.native
    /* 10 */ val SmallObject_SlideInFadeInTop: typings.sharepoint.SPAnimation.ID.SmallObject_SlideInFadeInTop with Double = js.native
    /* 20 */ val SmallObject_SlideOutFadeOutBottom: typings.sharepoint.SPAnimation.ID.SmallObject_SlideOutFadeOutBottom with Double = js.native
    /* 13 */ val Test_Hold: typings.sharepoint.SPAnimation.ID.Test_Hold with Double = js.native
    /* 12 */ val Test_Instant: typings.sharepoint.SPAnimation.ID.Test_Instant with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SPAnimation.ID with Double] = js.native
  }
  
  /* static members */
  @js.native
  object Settings extends js.Object {
    def DisableAnimation(): Unit = js.native
    def DisableSessionAnimation(): Unit = js.native
    def IsAnimationEnabled(): Boolean = js.native
  }
  
}

