package typings.reactNativeAppIntroSlider

import typings.reactNative.mod.NativeScrollEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ActiveDotStyle extends StObject {
    
    var activeDotStyle: BackgroundColor
    
    var bottomButton: Boolean
    
    var doneLabel: String
    
    var dotClickEnabled: Boolean
    
    var dotStyle: BackgroundColor
    
    var nextLabel: String
    
    var prevLabel: String
    
    var showDoneButton: Boolean
    
    var showNextButton: Boolean
    
    var showPrevButton: Boolean
    
    var showSkipButton: Boolean
    
    var skipLabel: String
  }
  object ActiveDotStyle {
    
    inline def apply(
      activeDotStyle: BackgroundColor,
      bottomButton: Boolean,
      doneLabel: String,
      dotClickEnabled: Boolean,
      dotStyle: BackgroundColor,
      nextLabel: String,
      prevLabel: String,
      showDoneButton: Boolean,
      showNextButton: Boolean,
      showPrevButton: Boolean,
      showSkipButton: Boolean,
      skipLabel: String
    ): ActiveDotStyle = {
      val __obj = js.Dynamic.literal(activeDotStyle = activeDotStyle.asInstanceOf[js.Any], bottomButton = bottomButton.asInstanceOf[js.Any], doneLabel = doneLabel.asInstanceOf[js.Any], dotClickEnabled = dotClickEnabled.asInstanceOf[js.Any], dotStyle = dotStyle.asInstanceOf[js.Any], nextLabel = nextLabel.asInstanceOf[js.Any], prevLabel = prevLabel.asInstanceOf[js.Any], showDoneButton = showDoneButton.asInstanceOf[js.Any], showNextButton = showNextButton.asInstanceOf[js.Any], showPrevButton = showPrevButton.asInstanceOf[js.Any], showSkipButton = showSkipButton.asInstanceOf[js.Any], skipLabel = skipLabel.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActiveDotStyle]
    }
    
    extension [Self <: ActiveDotStyle](x: Self) {
      
      inline def setActiveDotStyle(value: BackgroundColor): Self = StObject.set(x, "activeDotStyle", value.asInstanceOf[js.Any])
      
      inline def setBottomButton(value: Boolean): Self = StObject.set(x, "bottomButton", value.asInstanceOf[js.Any])
      
      inline def setDoneLabel(value: String): Self = StObject.set(x, "doneLabel", value.asInstanceOf[js.Any])
      
      inline def setDotClickEnabled(value: Boolean): Self = StObject.set(x, "dotClickEnabled", value.asInstanceOf[js.Any])
      
      inline def setDotStyle(value: BackgroundColor): Self = StObject.set(x, "dotStyle", value.asInstanceOf[js.Any])
      
      inline def setNextLabel(value: String): Self = StObject.set(x, "nextLabel", value.asInstanceOf[js.Any])
      
      inline def setPrevLabel(value: String): Self = StObject.set(x, "prevLabel", value.asInstanceOf[js.Any])
      
      inline def setShowDoneButton(value: Boolean): Self = StObject.set(x, "showDoneButton", value.asInstanceOf[js.Any])
      
      inline def setShowNextButton(value: Boolean): Self = StObject.set(x, "showNextButton", value.asInstanceOf[js.Any])
      
      inline def setShowPrevButton(value: Boolean): Self = StObject.set(x, "showPrevButton", value.asInstanceOf[js.Any])
      
      inline def setShowSkipButton(value: Boolean): Self = StObject.set(x, "showSkipButton", value.asInstanceOf[js.Any])
      
      inline def setSkipLabel(value: String): Self = StObject.set(x, "skipLabel", value.asInstanceOf[js.Any])
    }
  }
  
  trait ActiveIndex extends StObject {
    
    var activeIndex: Double
    
    var height: Double
    
    var width: Double
  }
  object ActiveIndex {
    
    inline def apply(activeIndex: Double, height: Double, width: Double): ActiveIndex = {
      val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActiveIndex]
    }
    
    extension [Self <: ActiveIndex](x: Self) {
      
      inline def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait BackgroundColor extends StObject {
    
    var backgroundColor: String
  }
  object BackgroundColor {
    
    inline def apply(backgroundColor: String): BackgroundColor = {
      val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[BackgroundColor]
    }
    
    extension [Self <: BackgroundColor](x: Self) {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dimensions extends StObject {
    
    var dimensions: Height
  }
  object Dimensions {
    
    inline def apply(dimensions: Height): Dimensions = {
      val __obj = js.Dynamic.literal(dimensions = dimensions.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dimensions]
    }
    
    extension [Self <: Dimensions](x: Self) {
      
      inline def setDimensions(value: Height): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    }
  }
  
  trait Height extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object Height {
    
    inline def apply(height: Double, width: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    extension [Self <: Height](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait NativeEvent extends StObject {
    
    var nativeEvent: NativeScrollEvent
  }
  object NativeEvent {
    
    inline def apply(nativeEvent: NativeScrollEvent): NativeEvent = {
      val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeEvent]
    }
    
    extension [Self <: NativeEvent](x: Self) {
      
      inline def setNativeEvent(value: NativeScrollEvent): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
    }
  }
}
