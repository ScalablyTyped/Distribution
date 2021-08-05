package typings.puppeteer

import typings.puppeteer.mod.LayoutDimension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var delay: js.UndefOr[Double] = js.undefined
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    }
  }
  
  trait Bottom extends StObject {
    
    /** Bottom margin. */
    var bottom: js.UndefOr[LayoutDimension] = js.undefined
    
    /** Left margin. */
    var left: js.UndefOr[LayoutDimension] = js.undefined
    
    /** Right margin. */
    var right: js.UndefOr[LayoutDimension] = js.undefined
    
    /** Top margin. */
    var top: js.UndefOr[LayoutDimension] = js.undefined
  }
  object Bottom {
    
    inline def apply(): Bottom = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Bottom]
    }
    
    extension [Self <: Bottom](x: Self) {
      
      inline def setBottom(value: LayoutDimension): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setLeft(value: LayoutDimension): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setRight(value: LayoutDimension): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setTop(value: LayoutDimension): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  trait Delay extends StObject {
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
  }
  object Delay {
    
    inline def apply(): Delay = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Delay]
    }
    
    extension [Self <: Delay](x: Self) {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait DelayNumber extends StObject {
    
    var delay: Double
  }
  object DelayNumber {
    
    inline def apply(delay: Double): DelayNumber = {
      val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any])
      __obj.asInstanceOf[DelayNumber]
    }
    
    extension [Self <: DelayNumber](x: Self) {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    }
  }
  
  trait DeviceScaleFactor extends StObject {
    
    var deviceScaleFactor: Double
    
    var hasTouch: Boolean
    
    var height: Double
    
    var isLandscape: Boolean
    
    var isMobile: Boolean
    
    var width: Double
  }
  object DeviceScaleFactor {
    
    inline def apply(
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
    
    extension [Self <: DeviceScaleFactor](x: Self) {
      
      inline def setDeviceScaleFactor(value: Double): Self = StObject.set(x, "deviceScaleFactor", value.asInstanceOf[js.Any])
      
      inline def setHasTouch(value: Boolean): Self = StObject.set(x, "hasTouch", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setIsLandscape(value: Boolean): Self = StObject.set(x, "isLandscape", value.asInstanceOf[js.Any])
      
      inline def setIsMobile(value: Boolean): Self = StObject.set(x, "isMobile", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait End extends StObject {
    
    var end: Double
    
    var start: Double
  }
  object End {
    
    inline def apply(end: Double, start: Double): End = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[End]
    }
    
    extension [Self <: End](x: Self) {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait ErrorText extends StObject {
    
    var errorText: String
  }
  object ErrorText {
    
    inline def apply(errorText: String): ErrorText = {
      val __obj = js.Dynamic.literal(errorText = errorText.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorText]
    }
    
    extension [Self <: ErrorText](x: Self) {
      
      inline def setErrorText(value: String): Self = StObject.set(x, "errorText", value.asInstanceOf[js.Any])
    }
  }
  
  trait HasTouch extends StObject {
    
    /**
      * Specify device scale factor (can be thought of as dpr).
      * @default 1
      */
    var deviceScaleFactor: js.UndefOr[Double] = js.undefined
    
    /**
      * Specifies if viewport supports touch events.
      * @default false
      */
    var hasTouch: js.UndefOr[Boolean] = js.undefined
    
    /**
      * page height in pixels.
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * Specifies if viewport is in landscape mode.
      * @default false
      */
    var isLandscape: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the meta viewport tag is taken into account.
      * @default false
      */
    var isMobile: js.UndefOr[Boolean] = js.undefined
    
    /**
      * page width in pixels.
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object HasTouch {
    
    inline def apply(): HasTouch = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HasTouch]
    }
    
    extension [Self <: HasTouch](x: Self) {
      
      inline def setDeviceScaleFactor(value: Double): Self = StObject.set(x, "deviceScaleFactor", value.asInstanceOf[js.Any])
      
      inline def setDeviceScaleFactorUndefined: Self = StObject.set(x, "deviceScaleFactor", js.undefined)
      
      inline def setHasTouch(value: Boolean): Self = StObject.set(x, "hasTouch", value.asInstanceOf[js.Any])
      
      inline def setHasTouchUndefined: Self = StObject.set(x, "hasTouch", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIsLandscape(value: Boolean): Self = StObject.set(x, "isLandscape", value.asInstanceOf[js.Any])
      
      inline def setIsLandscapeUndefined: Self = StObject.set(x, "isLandscape", js.undefined)
      
      inline def setIsMobile(value: Boolean): Self = StObject.set(x, "isMobile", value.asInstanceOf[js.Any])
      
      inline def setIsMobileUndefined: Self = StObject.set(x, "isMobile", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait IsScreenUnlocked extends StObject {
    
    var isScreenUnlocked: Boolean
    
    var isUserActive: Boolean
  }
  object IsScreenUnlocked {
    
    inline def apply(isScreenUnlocked: Boolean, isUserActive: Boolean): IsScreenUnlocked = {
      val __obj = js.Dynamic.literal(isScreenUnlocked = isScreenUnlocked.asInstanceOf[js.Any], isUserActive = isUserActive.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsScreenUnlocked]
    }
    
    extension [Self <: IsScreenUnlocked](x: Self) {
      
      inline def setIsScreenUnlocked(value: Boolean): Self = StObject.set(x, "isScreenUnlocked", value.asInstanceOf[js.Any])
      
      inline def setIsUserActive(value: Boolean): Self = StObject.set(x, "isUserActive", value.asInstanceOf[js.Any])
    }
  }
  
  trait Metrics extends StObject {
    
    var metrics: typings.puppeteer.mod.Metrics
    
    var title: String
  }
  object Metrics {
    
    inline def apply(metrics: typings.puppeteer.mod.Metrics, title: String): Metrics = {
      val __obj = js.Dynamic.literal(metrics = metrics.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Metrics]
    }
    
    extension [Self <: Metrics](x: Self) {
      
      inline def setMetrics(value: typings.puppeteer.mod.Metrics): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait Steps extends StObject {
    
    var steps: Double
  }
  object Steps {
    
    inline def apply(steps: Double): Steps = {
      val __obj = js.Dynamic.literal(steps = steps.asInstanceOf[js.Any])
      __obj.asInstanceOf[Steps]
    }
    
    extension [Self <: Steps](x: Self) {
      
      inline def setSteps(value: Double): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    }
  }
  
  trait Text extends StObject {
    
    var text: js.UndefOr[String] = js.undefined
  }
  object Text {
    
    inline def apply(): Text = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Text]
    }
    
    extension [Self <: Text](x: Self) {
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait TimeoutError extends StObject {
    
    var TimeoutError: typings.puppeteer.mod.TimeoutError
  }
  object TimeoutError {
    
    inline def apply(TimeoutError: typings.puppeteer.mod.TimeoutError): TimeoutError = {
      val __obj = js.Dynamic.literal(TimeoutError = TimeoutError.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeoutError]
    }
    
    extension [Self <: TimeoutError](x: Self) {
      
      inline def setTimeoutError(value: typings.puppeteer.mod.TimeoutError): Self = StObject.set(x, "TimeoutError", value.asInstanceOf[js.Any])
    }
  }
}
