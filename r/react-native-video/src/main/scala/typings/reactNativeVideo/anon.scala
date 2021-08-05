package typings.reactNativeVideo

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeVideo.reactNativeVideoStrings.`applicationSlashx-subrip`
import typings.reactNativeVideo.reactNativeVideoStrings.applicationSlashttmlPlussignxml
import typings.reactNativeVideo.reactNativeVideoStrings.auto
import typings.reactNativeVideo.reactNativeVideoStrings.disabled
import typings.reactNativeVideo.reactNativeVideoStrings.horizontal
import typings.reactNativeVideo.reactNativeVideoStrings.index
import typings.reactNativeVideo.reactNativeVideoStrings.landscape
import typings.reactNativeVideo.reactNativeVideoStrings.language
import typings.reactNativeVideo.reactNativeVideoStrings.resolution
import typings.reactNativeVideo.reactNativeVideoStrings.system
import typings.reactNativeVideo.reactNativeVideoStrings.textSlashvtt
import typings.reactNativeVideo.reactNativeVideoStrings.title
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait BufferForPlaybackAfterRebufferMs extends StObject {
    
    var bufferForPlaybackAfterRebufferMs: js.UndefOr[Double] = js.undefined
    
    var bufferForPlaybackMs: js.UndefOr[Double] = js.undefined
    
    var maxBufferMs: js.UndefOr[Double] = js.undefined
    
    var minBufferMs: js.UndefOr[Double] = js.undefined
  }
  object BufferForPlaybackAfterRebufferMs {
    
    inline def apply(): BufferForPlaybackAfterRebufferMs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BufferForPlaybackAfterRebufferMs]
    }
    
    extension [Self <: BufferForPlaybackAfterRebufferMs](x: Self) {
      
      inline def setBufferForPlaybackAfterRebufferMs(value: Double): Self = StObject.set(x, "bufferForPlaybackAfterRebufferMs", value.asInstanceOf[js.Any])
      
      inline def setBufferForPlaybackAfterRebufferMsUndefined: Self = StObject.set(x, "bufferForPlaybackAfterRebufferMs", js.undefined)
      
      inline def setBufferForPlaybackMs(value: Double): Self = StObject.set(x, "bufferForPlaybackMs", value.asInstanceOf[js.Any])
      
      inline def setBufferForPlaybackMsUndefined: Self = StObject.set(x, "bufferForPlaybackMs", js.undefined)
      
      inline def setMaxBufferMs(value: Double): Self = StObject.set(x, "maxBufferMs", value.asInstanceOf[js.Any])
      
      inline def setMaxBufferMsUndefined: Self = StObject.set(x, "maxBufferMs", js.undefined)
      
      inline def setMinBufferMs(value: Double): Self = StObject.set(x, "minBufferMs", value.asInstanceOf[js.Any])
      
      inline def setMinBufferMsUndefined: Self = StObject.set(x, "minBufferMs", js.undefined)
    }
  }
  
  trait Headers extends StObject {
    
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var uri: js.UndefOr[String] = js.undefined
  }
  object Headers {
    
    inline def apply(): Headers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Headers]
    }
    
    extension [Self <: Headers](x: Self) {
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    }
  }
  
  trait Height extends StObject {
    
    var height: Double
    
    var orientation: horizontal | landscape
    
    var width: Double
  }
  object Height {
    
    inline def apply(height: Double, orientation: horizontal | landscape, width: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    extension [Self <: Height](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setOrientation(value: horizontal | landscape): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Language extends StObject {
    
    var language: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var `type`: `applicationSlashx-subrip` | applicationSlashttmlPlussignxml | textSlashvtt
    
    var uri: String
  }
  object Language {
    
    inline def apply(`type`: `applicationSlashx-subrip` | applicationSlashttmlPlussignxml | textSlashvtt, uri: String): Language = {
      val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Language]
    }
    
    extension [Self <: Language](x: Self) {
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: `applicationSlashx-subrip` | applicationSlashttmlPlussignxml | textSlashvtt): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type extends StObject {
    
    var `type`: system | disabled | title | language | index
    
    var value: js.UndefOr[String | Double] = js.undefined
  }
  object Type {
    
    inline def apply(`type`: system | disabled | title | language | index): Type = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    extension [Self <: Type](x: Self) {
      
      inline def setType(value: system | disabled | title | language | index): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait Value extends StObject {
    
    var `type`: auto | disabled | resolution | index
    
    var value: js.UndefOr[String | Double] = js.undefined
  }
  object Value {
    
    inline def apply(`type`: auto | disabled | resolution | index): Value = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    extension [Self <: Value](x: Self) {
      
      inline def setType(value: auto | disabled | resolution | index): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait _empty extends StObject {
    
    @JSName("")
    var _empty: String
    
    var errorString: String
  }
  object _empty {
    
    inline def apply(_empty: String, errorString: String): _empty = {
      val __obj = js.Dynamic.literal(errorString = errorString.asInstanceOf[js.Any])
      __obj.updateDynamic("")(_empty.asInstanceOf[js.Any])
      __obj.asInstanceOf[_empty]
    }
    
    extension [Self <: _empty](x: Self) {
      
      inline def setErrorString(value: String): Self = StObject.set(x, "errorString", value.asInstanceOf[js.Any])
      
      inline def set_empty(value: String): Self = StObject.set(x, "", value.asInstanceOf[js.Any])
    }
  }
}
