package typings.reactNativeTextInputMask

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ContentSize extends StObject {
    
    var contentSize: Height = js.native
    
    var eventCount: Double = js.native
    
    var target: Double = js.native
    
    var text: String = js.native
  }
  object ContentSize {
    
    @scala.inline
    def apply(contentSize: Height, eventCount: Double, target: Double, text: String): ContentSize = {
      val __obj = js.Dynamic.literal(contentSize = contentSize.asInstanceOf[js.Any], eventCount = eventCount.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentSize]
    }
    
    @scala.inline
    implicit class ContentSizeMutableBuilder[Self <: ContentSize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentSize(value: Height): Self = StObject.set(x, "contentSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventCount(value: Double): Self = StObject.set(x, "eventCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: Double): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ContentSizeHeight extends StObject {
    
    var contentSize: Height = js.native
  }
  object ContentSizeHeight {
    
    @scala.inline
    def apply(contentSize: Height): ContentSizeHeight = {
      val __obj = js.Dynamic.literal(contentSize = contentSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentSizeHeight]
    }
    
    @scala.inline
    implicit class ContentSizeHeightMutableBuilder[Self <: ContentSizeHeight] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentSize(value: Height): Self = StObject.set(x, "contentSize", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait End extends StObject {
    
    var end: js.UndefOr[Double] = js.native
    
    var start: Double = js.native
  }
  object End {
    
    @scala.inline
    def apply(start: Double): End = {
      val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[End]
    }
    
    @scala.inline
    implicit class EndMutableBuilder[Self <: End] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Height extends StObject {
    
    var height: Double = js.native
    
    var width: Double = js.native
  }
  object Height {
    
    @scala.inline
    def apply(height: Double, width: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit class HeightMutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NativeEvent extends StObject {
    
    var nativeEvent: ContentSize = js.native
  }
  object NativeEvent {
    
    @scala.inline
    def apply(nativeEvent: ContentSize): NativeEvent = {
      val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeEvent]
    }
    
    @scala.inline
    implicit class NativeEventMutableBuilder[Self <: NativeEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNativeEvent(value: ContentSize): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NativeEventContentSizeHeight extends StObject {
    
    var nativeEvent: ContentSizeHeight = js.native
  }
  object NativeEventContentSizeHeight {
    
    @scala.inline
    def apply(nativeEvent: ContentSizeHeight): NativeEventContentSizeHeight = {
      val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeEventContentSizeHeight]
    }
    
    @scala.inline
    implicit class NativeEventContentSizeHeightMutableBuilder[Self <: NativeEventContentSizeHeight] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNativeEvent(value: ContentSizeHeight): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NativeEventText extends StObject {
    
    var nativeEvent: Text = js.native
  }
  object NativeEventText {
    
    @scala.inline
    def apply(nativeEvent: Text): NativeEventText = {
      val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeEventText]
    }
    
    @scala.inline
    implicit class NativeEventTextMutableBuilder[Self <: NativeEventText] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNativeEvent(value: Text): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Text extends StObject {
    
    var text: String = js.native
  }
  object Text {
    
    @scala.inline
    def apply(text: String): Text = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Text]
    }
    
    @scala.inline
    implicit class TextMutableBuilder[Self <: Text] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
