package typings.scrollbooster

import typings.scrollbooster.mod.ScrollingState
import typings.scrollbooster.scrollboosterStrings.all
import typings.scrollbooster.scrollboosterStrings.horizontal
import typings.scrollbooster.scrollboosterStrings.mouse
import typings.scrollbooster.scrollboosterStrings.native
import typings.scrollbooster.scrollboosterStrings.touch
import typings.scrollbooster.scrollboosterStrings.transform
import typings.scrollbooster.scrollboosterStrings.vertical
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Bottom extends StObject {
    
    var bottom: Boolean = js.native
    
    var left: Boolean = js.native
    
    var right: Boolean = js.native
    
    var top: Boolean = js.native
  }
  object Bottom {
    
    @scala.inline
    def apply(bottom: Boolean, left: Boolean, right: Boolean, top: Boolean): Bottom = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bottom]
    }
    
    @scala.inline
    implicit class BottomMutableBuilder[Self <: Bottom] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Boolean): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Boolean): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: Boolean): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<scrollbooster.scrollbooster.ScrollBoosterOptions> */
  @js.native
  trait PartialScrollBoosterOptio extends StObject {
    
    var bounce: js.UndefOr[Boolean] = js.native
    
    var bounceForce: js.UndefOr[Double] = js.native
    
    var content: js.UndefOr[HTMLElement | Null] = js.native
    
    var direction: js.UndefOr[horizontal | vertical | all] = js.native
    
    var emulateScroll: js.UndefOr[Boolean] = js.native
    
    var friction: js.UndefOr[Double] = js.native
    
    var inputsFocus: js.UndefOr[Boolean] = js.native
    
    var onClick: js.UndefOr[js.Function2[/* state */ ScrollingState, /* event */ Event, Unit]] = js.native
    
    var onUpdate: js.UndefOr[js.Function1[/* state */ ScrollingState, Unit]] = js.native
    
    var pointerMode: js.UndefOr[touch | mouse | all] = js.native
    
    var scrollMode: js.UndefOr[transform | native] = js.native
    
    var shouldScroll: js.UndefOr[js.Function2[/* state */ ScrollingState, /* event */ Event, Boolean]] = js.native
    
    var textSelection: js.UndefOr[Boolean] = js.native
    
    var viewport: js.UndefOr[HTMLElement | Null] = js.native
  }
  object PartialScrollBoosterOptio {
    
    @scala.inline
    def apply(): PartialScrollBoosterOptio = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialScrollBoosterOptio]
    }
    
    @scala.inline
    implicit class PartialScrollBoosterOptioMutableBuilder[Self <: PartialScrollBoosterOptio] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBounce(value: Boolean): Self = StObject.set(x, "bounce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBounceForce(value: Double): Self = StObject.set(x, "bounceForce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBounceForceUndefined: Self = StObject.set(x, "bounceForce", js.undefined)
      
      @scala.inline
      def setBounceUndefined: Self = StObject.set(x, "bounce", js.undefined)
      
      @scala.inline
      def setContent(value: HTMLElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentNull: Self = StObject.set(x, "content", null)
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setDirection(value: horizontal | vertical | all): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setEmulateScroll(value: Boolean): Self = StObject.set(x, "emulateScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmulateScrollUndefined: Self = StObject.set(x, "emulateScroll", js.undefined)
      
      @scala.inline
      def setFriction(value: Double): Self = StObject.set(x, "friction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrictionUndefined: Self = StObject.set(x, "friction", js.undefined)
      
      @scala.inline
      def setInputsFocus(value: Boolean): Self = StObject.set(x, "inputsFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputsFocusUndefined: Self = StObject.set(x, "inputsFocus", js.undefined)
      
      @scala.inline
      def setOnClick(value: (/* state */ ScrollingState, /* event */ Event) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnUpdate(value: /* state */ ScrollingState => Unit): Self = StObject.set(x, "onUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      @scala.inline
      def setPointerMode(value: touch | mouse | all): Self = StObject.set(x, "pointerMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointerModeUndefined: Self = StObject.set(x, "pointerMode", js.undefined)
      
      @scala.inline
      def setScrollMode(value: transform | native): Self = StObject.set(x, "scrollMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollModeUndefined: Self = StObject.set(x, "scrollMode", js.undefined)
      
      @scala.inline
      def setShouldScroll(value: (/* state */ ScrollingState, /* event */ Event) => Boolean): Self = StObject.set(x, "shouldScroll", js.Any.fromFunction2(value))
      
      @scala.inline
      def setShouldScrollUndefined: Self = StObject.set(x, "shouldScroll", js.undefined)
      
      @scala.inline
      def setTextSelection(value: Boolean): Self = StObject.set(x, "textSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextSelectionUndefined: Self = StObject.set(x, "textSelection", js.undefined)
      
      @scala.inline
      def setViewport(value: HTMLElement): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewportNull: Self = StObject.set(x, "viewport", null)
      
      @scala.inline
      def setViewportUndefined: Self = StObject.set(x, "viewport", js.undefined)
    }
  }
  
  /* Inlined std.Required<scrollbooster.scrollbooster.Position> */
  @js.native
  trait RequiredPosition extends StObject {
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object RequiredPosition {
    
    @scala.inline
    def apply(x: Double, y: Double): RequiredPosition = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredPosition]
    }
    
    @scala.inline
    implicit class RequiredPositionMutableBuilder[Self <: RequiredPosition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
