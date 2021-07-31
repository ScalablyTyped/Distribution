package typings.sendmail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Content extends StObject {
    
    var content: js.UndefOr[js.Any] = js.undefined
    
    var contentType: js.UndefOr[String] = js.undefined
    
    var encoding: js.UndefOr[String] = js.undefined
    
    var filename: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object Content {
    
    @scala.inline
    def apply(): Content = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Content]
    }
    
    @scala.inline
    implicit class ContentMutableBuilder[Self <: Content] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: js.Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Debug extends StObject {
    
    var debug: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var error: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var info: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var warn: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object Debug {
    
    @scala.inline
    def apply(): Debug = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Debug]
    }
    
    @scala.inline
    implicit class DebugMutableBuilder[Self <: Debug] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: () => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setError(value: () => Unit): Self = StObject.set(x, "error", js.Any.fromFunction0(value))
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setInfo(value: () => Unit): Self = StObject.set(x, "info", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      @scala.inline
      def setWarn(value: () => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction0(value))
      
      @scala.inline
      def setWarnUndefined: Self = StObject.set(x, "warn", js.undefined)
    }
  }
  
  trait KeySelector extends StObject {
    
    var keySelector: String
    
    var privateKey: String
  }
  object KeySelector {
    
    @scala.inline
    def apply(keySelector: String, privateKey: String): KeySelector = {
      val __obj = js.Dynamic.literal(keySelector = keySelector.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeySelector]
    }
    
    @scala.inline
    implicit class KeySelectorMutableBuilder[Self <: KeySelector] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeySelector(value: String): Self = StObject.set(x, "keySelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateKey(value: String): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    }
  }
}
