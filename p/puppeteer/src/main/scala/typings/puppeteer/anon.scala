package typings.puppeteer

import typings.puppeteer.mod.LayoutDimension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0` extends StObject {
    
    var delay: js.UndefOr[Double] = js.native
  }
  object `0` {
    
    @scala.inline
    def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    }
  }
  
  @js.native
  trait Bottom extends StObject {
    
    /** Bottom margin. */
    var bottom: js.UndefOr[LayoutDimension] = js.native
    
    /** Left margin. */
    var left: js.UndefOr[LayoutDimension] = js.native
    
    /** Right margin. */
    var right: js.UndefOr[LayoutDimension] = js.native
    
    /** Top margin. */
    var top: js.UndefOr[LayoutDimension] = js.native
  }
  object Bottom {
    
    @scala.inline
    def apply(): Bottom = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Bottom]
    }
    
    @scala.inline
    implicit class BottomMutableBuilder[Self <: Bottom] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: LayoutDimension): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setLeft(value: LayoutDimension): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setRight(value: LayoutDimension): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setTop(value: LayoutDimension): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  @js.native
  trait Delay extends StObject {
    
    var delay: js.UndefOr[Double] = js.native
    
    var text: js.UndefOr[String] = js.native
  }
  object Delay {
    
    @scala.inline
    def apply(): Delay = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Delay]
    }
    
    @scala.inline
    implicit class DelayMutableBuilder[Self <: Delay] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  @js.native
  trait DelayNumber extends StObject {
    
    var delay: Double = js.native
  }
  object DelayNumber {
    
    @scala.inline
    def apply(delay: Double): DelayNumber = {
      val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any])
      __obj.asInstanceOf[DelayNumber]
    }
    
    @scala.inline
    implicit class DelayNumberMutableBuilder[Self <: DelayNumber] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DeviceScaleFactor extends StObject {
    
    var deviceScaleFactor: Double = js.native
    
    var hasTouch: Boolean = js.native
    
    var height: Double = js.native
    
    var isLandscape: Boolean = js.native
    
    var isMobile: Boolean = js.native
    
    var width: Double = js.native
  }
  object DeviceScaleFactor {
    
    @scala.inline
    def apply(
      deviceScaleFactor: Double,
      hasTouch: Boolean,
      height: Double,
      isLandscape: Boolean,
      isMobile: Boolean,
      width: Double
    ): DeviceScaleFactor = {
      val __obj = js.Dynamic.literal(deviceScaleFactor = deviceScaleFactor.asInstanceOf[js.Any], hasTouch = hasTouch.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], isLandscape = isLandscape.asInstanceOf[js.Any], isMobile = isMobile.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeviceScaleFactor]
    }
    
    @scala.inline
    implicit class DeviceScaleFactorMutableBuilder[Self <: DeviceScaleFactor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeviceScaleFactor(value: Double): Self = StObject.set(x, "deviceScaleFactor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasTouch(value: Boolean): Self = StObject.set(x, "hasTouch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLandscape(value: Boolean): Self = StObject.set(x, "isLandscape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMobile(value: Boolean): Self = StObject.set(x, "isMobile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait End extends StObject {
    
    var end: Double = js.native
    
    var start: Double = js.native
  }
  object End {
    
    @scala.inline
    def apply(end: Double, start: Double): End = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[End]
    }
    
    @scala.inline
    implicit class EndMutableBuilder[Self <: End] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ErrorText extends StObject {
    
    var errorText: String = js.native
  }
  object ErrorText {
    
    @scala.inline
    def apply(errorText: String): ErrorText = {
      val __obj = js.Dynamic.literal(errorText = errorText.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorText]
    }
    
    @scala.inline
    implicit class ErrorTextMutableBuilder[Self <: ErrorText] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorText(value: String): Self = StObject.set(x, "errorText", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HasTouch extends StObject {
    
    /**
      * Specify device scale factor (can be thought of as dpr).
      * @default 1
      */
    var deviceScaleFactor: js.UndefOr[Double] = js.native
    
    /**
      * Specifies if viewport supports touch events.
      * @default false
      */
    var hasTouch: js.UndefOr[Boolean] = js.native
    
    /**
      * page height in pixels.
      */
    var height: js.UndefOr[Double] = js.native
    
    /**
      * Specifies if viewport is in landscape mode.
      * @default false
      */
    var isLandscape: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether the meta viewport tag is taken into account.
      * @default false
      */
    var isMobile: js.UndefOr[Boolean] = js.native
    
    /**
      * page width in pixels.
      */
    var width: js.UndefOr[Double] = js.native
  }
  object HasTouch {
    
    @scala.inline
    def apply(): HasTouch = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HasTouch]
    }
    
    @scala.inline
    implicit class HasTouchMutableBuilder[Self <: HasTouch] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeviceScaleFactor(value: Double): Self = StObject.set(x, "deviceScaleFactor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceScaleFactorUndefined: Self = StObject.set(x, "deviceScaleFactor", js.undefined)
      
      @scala.inline
      def setHasTouch(value: Boolean): Self = StObject.set(x, "hasTouch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasTouchUndefined: Self = StObject.set(x, "hasTouch", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setIsLandscape(value: Boolean): Self = StObject.set(x, "isLandscape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLandscapeUndefined: Self = StObject.set(x, "isLandscape", js.undefined)
      
      @scala.inline
      def setIsMobile(value: Boolean): Self = StObject.set(x, "isMobile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMobileUndefined: Self = StObject.set(x, "isMobile", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait IsScreenUnlocked extends StObject {
    
    var isScreenUnlocked: Boolean = js.native
    
    var isUserActive: Boolean = js.native
  }
  object IsScreenUnlocked {
    
    @scala.inline
    def apply(isScreenUnlocked: Boolean, isUserActive: Boolean): IsScreenUnlocked = {
      val __obj = js.Dynamic.literal(isScreenUnlocked = isScreenUnlocked.asInstanceOf[js.Any], isUserActive = isUserActive.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsScreenUnlocked]
    }
    
    @scala.inline
    implicit class IsScreenUnlockedMutableBuilder[Self <: IsScreenUnlocked] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsScreenUnlocked(value: Boolean): Self = StObject.set(x, "isScreenUnlocked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsUserActive(value: Boolean): Self = StObject.set(x, "isUserActive", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Metrics extends StObject {
    
    var metrics: typings.puppeteer.mod.Metrics = js.native
    
    var title: String = js.native
  }
  object Metrics {
    
    @scala.inline
    def apply(metrics: typings.puppeteer.mod.Metrics, title: String): Metrics = {
      val __obj = js.Dynamic.literal(metrics = metrics.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Metrics]
    }
    
    @scala.inline
    implicit class MetricsMutableBuilder[Self <: Metrics] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMetrics(value: typings.puppeteer.mod.Metrics): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Steps extends StObject {
    
    var steps: Double = js.native
  }
  object Steps {
    
    @scala.inline
    def apply(steps: Double): Steps = {
      val __obj = js.Dynamic.literal(steps = steps.asInstanceOf[js.Any])
      __obj.asInstanceOf[Steps]
    }
    
    @scala.inline
    implicit class StepsMutableBuilder[Self <: Steps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSteps(value: Double): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Text extends StObject {
    
    var text: js.UndefOr[String] = js.native
  }
  object Text {
    
    @scala.inline
    def apply(): Text = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Text]
    }
    
    @scala.inline
    implicit class TextMutableBuilder[Self <: Text] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  @js.native
  trait TimeoutError extends StObject {
    
    var TimeoutError: typings.puppeteer.mod.TimeoutError = js.native
  }
  object TimeoutError {
    
    @scala.inline
    def apply(TimeoutError: typings.puppeteer.mod.TimeoutError): TimeoutError = {
      val __obj = js.Dynamic.literal(TimeoutError = TimeoutError.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeoutError]
    }
    
    @scala.inline
    implicit class TimeoutErrorMutableBuilder[Self <: TimeoutError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTimeoutError(value: typings.puppeteer.mod.TimeoutError): Self = StObject.set(x, "TimeoutError", value.asInstanceOf[js.Any])
    }
  }
}
