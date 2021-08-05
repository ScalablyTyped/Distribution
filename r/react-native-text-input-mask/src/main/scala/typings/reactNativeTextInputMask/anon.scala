package typings.reactNativeTextInputMask

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ContentSize extends StObject {
    
    var contentSize: Height
    
    var eventCount: Double
    
    var target: Double
    
    var text: String
  }
  object ContentSize {
    
    inline def apply(contentSize: Height, eventCount: Double, target: Double, text: String): ContentSize = {
      val __obj = js.Dynamic.literal(contentSize = contentSize.asInstanceOf[js.Any], eventCount = eventCount.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentSize]
    }
    
    extension [Self <: ContentSize](x: Self) {
      
      inline def setContentSize(value: Height): Self = StObject.set(x, "contentSize", value.asInstanceOf[js.Any])
      
      inline def setEventCount(value: Double): Self = StObject.set(x, "eventCount", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: Double): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait ContentSizeHeight extends StObject {
    
    var contentSize: Height
  }
  object ContentSizeHeight {
    
    inline def apply(contentSize: Height): ContentSizeHeight = {
      val __obj = js.Dynamic.literal(contentSize = contentSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentSizeHeight]
    }
    
    extension [Self <: ContentSizeHeight](x: Self) {
      
      inline def setContentSize(value: Height): Self = StObject.set(x, "contentSize", value.asInstanceOf[js.Any])
    }
  }
  
  trait End extends StObject {
    
    var end: js.UndefOr[Double] = js.undefined
    
    var start: Double
  }
  object End {
    
    inline def apply(start: Double): End = {
      val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[End]
    }
    
    extension [Self <: End](x: Self) {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
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
    
    var nativeEvent: ContentSize
  }
  object NativeEvent {
    
    inline def apply(nativeEvent: ContentSize): NativeEvent = {
      val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeEvent]
    }
    
    extension [Self <: NativeEvent](x: Self) {
      
      inline def setNativeEvent(value: ContentSize): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
    }
  }
  
  trait NativeEventContentSizeHeight extends StObject {
    
    var nativeEvent: ContentSizeHeight
  }
  object NativeEventContentSizeHeight {
    
    inline def apply(nativeEvent: ContentSizeHeight): NativeEventContentSizeHeight = {
      val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeEventContentSizeHeight]
    }
    
    extension [Self <: NativeEventContentSizeHeight](x: Self) {
      
      inline def setNativeEvent(value: ContentSizeHeight): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
    }
  }
  
  trait NativeEventText extends StObject {
    
    var nativeEvent: Text
  }
  object NativeEventText {
    
    inline def apply(nativeEvent: Text): NativeEventText = {
      val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeEventText]
    }
    
    extension [Self <: NativeEventText](x: Self) {
      
      inline def setNativeEvent(value: Text): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
    }
  }
  
  trait Text extends StObject {
    
    var text: String
  }
  object Text {
    
    inline def apply(text: String): Text = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Text]
    }
    
    extension [Self <: Text](x: Self) {
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
