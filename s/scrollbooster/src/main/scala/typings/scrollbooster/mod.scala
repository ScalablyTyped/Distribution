package typings.scrollbooster

import typings.scrollbooster.anon.Bottom
import typings.scrollbooster.anon.PartialScrollBoosterOptio
import typings.scrollbooster.anon.RequiredPosition
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

object mod {
  
  @JSImport("scrollbooster", JSImport.Default)
  @js.native
  class default protected () extends ScrollBooster {
    def this(options: ScrollBoosterOptions) = this()
  }
  
  @js.native
  trait Position extends StObject {
    
    var x: js.UndefOr[Double] = js.native
    
    var y: js.UndefOr[Double] = js.native
  }
  object Position {
    
    @scala.inline
    def apply(): Position = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Position]
    }
    
    @scala.inline
    implicit class PositionMutableBuilder[Self <: Position] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  @js.native
  trait ScrollBooster extends StObject {
    
    def destroy(): Unit = js.native
    
    def getState(): ScrollingState = js.native
    
    def scrollTo(position: Position): Unit = js.native
    
    def setPosition(position: Position): Unit = js.native
    
    def updateMetrics(): Unit = js.native
    
    def updateOptions(options: PartialScrollBoosterOptio): Unit = js.native
  }
  object ScrollBooster {
    
    @scala.inline
    def apply(
      destroy: () => Unit,
      getState: () => ScrollingState,
      scrollTo: Position => Unit,
      setPosition: Position => Unit,
      updateMetrics: () => Unit,
      updateOptions: PartialScrollBoosterOptio => Unit
    ): ScrollBooster = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getState = js.Any.fromFunction0(getState), scrollTo = js.Any.fromFunction1(scrollTo), setPosition = js.Any.fromFunction1(setPosition), updateMetrics = js.Any.fromFunction0(updateMetrics), updateOptions = js.Any.fromFunction1(updateOptions))
      __obj.asInstanceOf[ScrollBooster]
    }
    
    @scala.inline
    implicit class ScrollBoosterMutableBuilder[Self <: ScrollBooster] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetState(value: () => ScrollingState): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
      
      @scala.inline
      def setScrollTo(value: Position => Unit): Self = StObject.set(x, "scrollTo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetPosition(value: Position => Unit): Self = StObject.set(x, "setPosition", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUpdateMetrics(value: () => Unit): Self = StObject.set(x, "updateMetrics", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUpdateOptions(value: PartialScrollBoosterOptio => Unit): Self = StObject.set(x, "updateOptions", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait ScrollBoosterOptions extends StObject {
    
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
    
    var viewport: HTMLElement | Null = js.native
  }
  object ScrollBoosterOptions {
    
    @scala.inline
    def apply(): ScrollBoosterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollBoosterOptions]
    }
    
    @scala.inline
    implicit class ScrollBoosterOptionsMutableBuilder[Self <: ScrollBoosterOptions] (val x: Self) extends AnyVal {
      
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
    }
  }
  
  @js.native
  trait ScrollingState extends StObject {
    
    var borderCollision: Bottom = js.native
    
    var dragOffset: Double = js.native
    
    var isDragging: Boolean = js.native
    
    var isMoving: Boolean = js.native
    
    var position: RequiredPosition = js.native
  }
  object ScrollingState {
    
    @scala.inline
    def apply(
      borderCollision: Bottom,
      dragOffset: Double,
      isDragging: Boolean,
      isMoving: Boolean,
      position: RequiredPosition
    ): ScrollingState = {
      val __obj = js.Dynamic.literal(borderCollision = borderCollision.asInstanceOf[js.Any], dragOffset = dragOffset.asInstanceOf[js.Any], isDragging = isDragging.asInstanceOf[js.Any], isMoving = isMoving.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollingState]
    }
    
    @scala.inline
    implicit class ScrollingStateMutableBuilder[Self <: ScrollingState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorderCollision(value: Bottom): Self = StObject.set(x, "borderCollision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragOffset(value: Double): Self = StObject.set(x, "dragOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDragging(value: Boolean): Self = StObject.set(x, "isDragging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMoving(value: Boolean): Self = StObject.set(x, "isMoving", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(value: RequiredPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
}
