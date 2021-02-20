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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait BufferForPlaybackAfterRebufferMs extends StObject {
    
    var bufferForPlaybackAfterRebufferMs: js.UndefOr[Double] = js.native
    
    var bufferForPlaybackMs: js.UndefOr[Double] = js.native
    
    var maxBufferMs: js.UndefOr[Double] = js.native
    
    var minBufferMs: js.UndefOr[Double] = js.native
  }
  object BufferForPlaybackAfterRebufferMs {
    
    @scala.inline
    def apply(): BufferForPlaybackAfterRebufferMs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BufferForPlaybackAfterRebufferMs]
    }
    
    @scala.inline
    implicit class BufferForPlaybackAfterRebufferMsMutableBuilder[Self <: BufferForPlaybackAfterRebufferMs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBufferForPlaybackAfterRebufferMs(value: Double): Self = StObject.set(x, "bufferForPlaybackAfterRebufferMs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferForPlaybackAfterRebufferMsUndefined: Self = StObject.set(x, "bufferForPlaybackAfterRebufferMs", js.undefined)
      
      @scala.inline
      def setBufferForPlaybackMs(value: Double): Self = StObject.set(x, "bufferForPlaybackMs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferForPlaybackMsUndefined: Self = StObject.set(x, "bufferForPlaybackMs", js.undefined)
      
      @scala.inline
      def setMaxBufferMs(value: Double): Self = StObject.set(x, "maxBufferMs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxBufferMsUndefined: Self = StObject.set(x, "maxBufferMs", js.undefined)
      
      @scala.inline
      def setMinBufferMs(value: Double): Self = StObject.set(x, "minBufferMs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinBufferMsUndefined: Self = StObject.set(x, "minBufferMs", js.undefined)
    }
  }
  
  @js.native
  trait Headers extends StObject {
    
    var headers: js.UndefOr[StringDictionary[String]] = js.native
    
    var uri: js.UndefOr[String] = js.native
  }
  object Headers {
    
    @scala.inline
    def apply(): Headers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Headers]
    }
    
    @scala.inline
    implicit class HeadersMutableBuilder[Self <: Headers] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    }
  }
  
  @js.native
  trait Height extends StObject {
    
    var height: Double = js.native
    
    var orientation: horizontal | landscape = js.native
    
    var width: Double = js.native
  }
  object Height {
    
    @scala.inline
    def apply(height: Double, orientation: horizontal | landscape, width: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit class HeightMutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientation(value: horizontal | landscape): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Language extends StObject {
    
    var language: js.UndefOr[String] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var `type`: `applicationSlashx-subrip` | applicationSlashttmlPlussignxml | textSlashvtt = js.native
    
    var uri: String = js.native
  }
  object Language {
    
    @scala.inline
    def apply(`type`: `applicationSlashx-subrip` | applicationSlashttmlPlussignxml | textSlashvtt, uri: String): Language = {
      val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Language]
    }
    
    @scala.inline
    implicit class LanguageMutableBuilder[Self <: Language] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setType(value: `applicationSlashx-subrip` | applicationSlashttmlPlussignxml | textSlashvtt): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Type extends StObject {
    
    var `type`: system | disabled | title | language | index = js.native
    
    var value: js.UndefOr[String | Double] = js.native
  }
  object Type {
    
    @scala.inline
    def apply(`type`: system | disabled | title | language | index): Type = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: system | disabled | title | language | index): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait Value extends StObject {
    
    var `type`: auto | disabled | resolution | index = js.native
    
    var value: js.UndefOr[String | Double] = js.native
  }
  object Value {
    
    @scala.inline
    def apply(`type`: auto | disabled | resolution | index): Value = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit class ValueMutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: auto | disabled | resolution | index): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait _empty extends StObject {
    
    @JSName("")
    var _empty: String = js.native
    
    var errorString: String = js.native
  }
  object _empty {
    
    @scala.inline
    def apply(_empty: String, errorString: String): _empty = {
      val __obj = js.Dynamic.literal(errorString = errorString.asInstanceOf[js.Any])
      __obj.updateDynamic("")(_empty.asInstanceOf[js.Any])
      __obj.asInstanceOf[_empty]
    }
    
    @scala.inline
    implicit class _emptyMutableBuilder[Self <: _empty] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorString(value: String): Self = StObject.set(x, "errorString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_empty(value: String): Self = StObject.set(x, "", value.asInstanceOf[js.Any])
    }
  }
}
