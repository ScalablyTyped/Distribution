package typings.scrivito

import typings.scrivito.mod.Obj
import typings.scrivito.mod.ObjSearchSingleAttribute
import typings.scrivito.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Attributes extends StObject {
    
    var attributes: js.Array[ObjSearchSingleAttribute]
    
    var limit: Double
  }
  object Attributes {
    
    @scala.inline
    def apply(attributes: js.Array[ObjSearchSingleAttribute], limit: Double): Attributes = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attributes]
    }
    
    @scala.inline
    implicit class AttributesMutableBuilder[Self <: Attributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: js.Array[ObjSearchSingleAttribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesVarargs(value: ObjSearchSingleAttribute*): Self = StObject.set(x, "attributes", js.Array(value :_*))
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    }
  }
  
  trait Content extends StObject {
    
    var content: js.Any
    
    var name: String
    
    var obj: js.UndefOr[Obj] = js.undefined
    
    var widget: js.UndefOr[Widget] = js.undefined
  }
  object Content {
    
    @scala.inline
    def apply(content: js.Any, name: String): Content = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Content]
    }
    
    @scala.inline
    implicit class ContentMutableBuilder[Self <: Content] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: js.Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObj(value: Obj): Self = StObject.set(x, "obj", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjUndefined: Self = StObject.set(x, "obj", js.undefined)
      
      @scala.inline
      def setWidget(value: Widget): Self = StObject.set(x, "widget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidgetUndefined: Self = StObject.set(x, "widget", js.undefined)
    }
  }
  
  trait ContentType extends StObject {
    
    var contentType: js.UndefOr[String] = js.undefined
    
    var filename: String
  }
  object ContentType {
    
    @scala.inline
    def apply(filename: String): ContentType = {
      val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentType]
    }
    
    @scala.inline
    implicit class ContentTypeMutableBuilder[Self <: ContentType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    }
  }
  
  trait DumpLoaded extends StObject {
    
    var dumpLoaded: Boolean
  }
  object DumpLoaded {
    
    @scala.inline
    def apply(dumpLoaded: Boolean): DumpLoaded = {
      val __obj = js.Dynamic.literal(dumpLoaded = dumpLoaded.asInstanceOf[js.Any])
      __obj.asInstanceOf[DumpLoaded]
    }
    
    @scala.inline
    implicit class DumpLoadedMutableBuilder[Self <: DumpLoaded] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDumpLoaded(value: Boolean): Self = StObject.set(x, "dumpLoaded", value.asInstanceOf[js.Any])
    }
  }
  
  trait Filename extends StObject {
    
    var contentType: js.UndefOr[String] = js.undefined
    
    var filename: js.UndefOr[String] = js.undefined
  }
  object Filename {
    
    @scala.inline
    def apply(): Filename = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Filename]
    }
    
    @scala.inline
    implicit class FilenameMutableBuilder[Self <: Filename] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    }
  }
  
  trait Hash extends StObject {
    
    var hash: js.UndefOr[String] = js.undefined
    
    var params: js.UndefOr[js.Any] = js.undefined
  }
  object Hash {
    
    @scala.inline
    def apply(): Hash = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Hash]
    }
    
    @scala.inline
    implicit class HashMutableBuilder[Self <: Hash] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      @scala.inline
      def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    }
  }
  
  trait IncludeObjs extends StObject {
    
    var includeObjs: Double
    
    var limit: Double
  }
  object IncludeObjs {
    
    @scala.inline
    def apply(includeObjs: Double, limit: Double): IncludeObjs = {
      val __obj = js.Dynamic.literal(includeObjs = includeObjs.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any])
      __obj.asInstanceOf[IncludeObjs]
    }
    
    @scala.inline
    implicit class IncludeObjsMutableBuilder[Self <: IncludeObjs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIncludeObjs(value: Double): Self = StObject.set(x, "includeObjs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    }
  }
  
  trait Length extends StObject {
    
    var length: Double
  }
  object Length {
    
    @scala.inline
    def apply(length: Double): Length = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[Length]
    }
    
    @scala.inline
    implicit class LengthMutableBuilder[Self <: Length] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  trait Message extends StObject {
    
    var message: String
    
    var severity: String
  }
  object Message {
    
    @scala.inline
    def apply(message: String, severity: String): Message = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    @scala.inline
    implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    }
  }
  
  trait PreloadDump extends StObject {
    
    var preloadDump: js.Any
    
    var result: Obj
  }
  object PreloadDump {
    
    @scala.inline
    def apply(preloadDump: js.Any, result: Obj): PreloadDump = {
      val __obj = js.Dynamic.literal(preloadDump = preloadDump.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreloadDump]
    }
    
    @scala.inline
    implicit class PreloadDumpMutableBuilder[Self <: PreloadDump] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPreloadDump(value: js.Any): Self = StObject.set(x, "preloadDump", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResult(value: Obj): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  trait Query extends StObject {
    
    var hash: js.UndefOr[String] = js.undefined
    
    var query: js.UndefOr[String] = js.undefined
  }
  object Query {
    
    @scala.inline
    def apply(): Query = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Query]
    }
    
    @scala.inline
    implicit class QueryMutableBuilder[Self <: Query] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      @scala.inline
      def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    }
  }
  
  trait Toolbar extends StObject {
    
    var toolbar: js.Array[String]
  }
  object Toolbar {
    
    @scala.inline
    def apply(toolbar: js.Array[String]): Toolbar = {
      val __obj = js.Dynamic.literal(toolbar = toolbar.asInstanceOf[js.Any])
      __obj.asInstanceOf[Toolbar]
    }
    
    @scala.inline
    implicit class ToolbarMutableBuilder[Self <: Toolbar] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToolbar(value: js.Array[String]): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolbarVarargs(value: String*): Self = StObject.set(x, "toolbar", js.Array(value :_*))
    }
  }
}
