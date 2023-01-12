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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Bottom extends StObject {
    
    var bottom: Boolean
    
    var left: Boolean
    
    var right: Boolean
    
    var top: Boolean
  }
  object Bottom {
    
    inline def apply(bottom: Boolean, left: Boolean, right: Boolean, top: Boolean): Bottom = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bottom]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Bottom] (val x: Self) extends AnyVal {
      
      inline def setBottom(value: Boolean): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Boolean): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Boolean): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<scrollbooster.scrollbooster.ScrollBoosterOptions> */
  trait PartialScrollBoosterOptio extends StObject {
    
    var bounce: js.UndefOr[Boolean] = js.undefined
    
    var bounceForce: js.UndefOr[Double] = js.undefined
    
    var content: js.UndefOr[HTMLElement | Null] = js.undefined
    
    var direction: js.UndefOr[horizontal | vertical | all] = js.undefined
    
    var emulateScroll: js.UndefOr[Boolean] = js.undefined
    
    var friction: js.UndefOr[Double] = js.undefined
    
    var inputsFocus: js.UndefOr[Boolean] = js.undefined
    
    var onClick: js.UndefOr[js.Function2[/* state */ ScrollingState, /* event */ Event, Unit]] = js.undefined
    
    var onUpdate: js.UndefOr[js.Function1[/* state */ ScrollingState, Unit]] = js.undefined
    
    var pointerMode: js.UndefOr[touch | mouse | all] = js.undefined
    
    var scrollMode: js.UndefOr[transform | native] = js.undefined
    
    var shouldScroll: js.UndefOr[js.Function2[/* state */ ScrollingState, /* event */ Event, Boolean]] = js.undefined
    
    var textSelection: js.UndefOr[Boolean] = js.undefined
    
    var viewport: js.UndefOr[HTMLElement | Null] = js.undefined
  }
  object PartialScrollBoosterOptio {
    
    inline def apply(): PartialScrollBoosterOptio = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialScrollBoosterOptio]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialScrollBoosterOptio] (val x: Self) extends AnyVal {
      
      inline def setBounce(value: Boolean): Self = StObject.set(x, "bounce", value.asInstanceOf[js.Any])
      
      inline def setBounceForce(value: Double): Self = StObject.set(x, "bounceForce", value.asInstanceOf[js.Any])
      
      inline def setBounceForceUndefined: Self = StObject.set(x, "bounceForce", js.undefined)
      
      inline def setBounceUndefined: Self = StObject.set(x, "bounce", js.undefined)
      
      inline def setContent(value: HTMLElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDirection(value: horizontal | vertical | all): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setEmulateScroll(value: Boolean): Self = StObject.set(x, "emulateScroll", value.asInstanceOf[js.Any])
      
      inline def setEmulateScrollUndefined: Self = StObject.set(x, "emulateScroll", js.undefined)
      
      inline def setFriction(value: Double): Self = StObject.set(x, "friction", value.asInstanceOf[js.Any])
      
      inline def setFrictionUndefined: Self = StObject.set(x, "friction", js.undefined)
      
      inline def setInputsFocus(value: Boolean): Self = StObject.set(x, "inputsFocus", value.asInstanceOf[js.Any])
      
      inline def setInputsFocusUndefined: Self = StObject.set(x, "inputsFocus", js.undefined)
      
      inline def setOnClick(value: (/* state */ ScrollingState, /* event */ Event) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnUpdate(value: /* state */ ScrollingState => Unit): Self = StObject.set(x, "onUpdate", js.Any.fromFunction1(value))
      
      inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      inline def setPointerMode(value: touch | mouse | all): Self = StObject.set(x, "pointerMode", value.asInstanceOf[js.Any])
      
      inline def setPointerModeUndefined: Self = StObject.set(x, "pointerMode", js.undefined)
      
      inline def setScrollMode(value: transform | native): Self = StObject.set(x, "scrollMode", value.asInstanceOf[js.Any])
      
      inline def setScrollModeUndefined: Self = StObject.set(x, "scrollMode", js.undefined)
      
      inline def setShouldScroll(value: (/* state */ ScrollingState, /* event */ Event) => Boolean): Self = StObject.set(x, "shouldScroll", js.Any.fromFunction2(value))
      
      inline def setShouldScrollUndefined: Self = StObject.set(x, "shouldScroll", js.undefined)
      
      inline def setTextSelection(value: Boolean): Self = StObject.set(x, "textSelection", value.asInstanceOf[js.Any])
      
      inline def setTextSelectionUndefined: Self = StObject.set(x, "textSelection", js.undefined)
      
      inline def setViewport(value: HTMLElement): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
      
      inline def setViewportNull: Self = StObject.set(x, "viewport", null)
      
      inline def setViewportUndefined: Self = StObject.set(x, "viewport", js.undefined)
    }
  }
  
  /* Inlined std.Required<scrollbooster.scrollbooster.Position> */
  trait RequiredPosition extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object RequiredPosition {
    
    inline def apply(x: Double, y: Double): RequiredPosition = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredPosition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequiredPosition] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait X extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object X {
    
    inline def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
