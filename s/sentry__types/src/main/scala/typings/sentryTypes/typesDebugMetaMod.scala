package typings.sentryTypes

import typings.sentryTypes.sentryTypesStrings.sourcemap
import typings.sentryTypes.sentryTypesStrings.wasm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDebugMetaMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.sentryTypes.typesDebugMetaMod.WasmDebugImage
    - typings.sentryTypes.typesDebugMetaMod.SourceMapDebugImage
  */
  trait DebugImage extends StObject
  object DebugImage {
    
    inline def SourceMapDebugImage(code_file: String, debug_id: String): typings.sentryTypes.typesDebugMetaMod.SourceMapDebugImage = {
      val __obj = js.Dynamic.literal(code_file = code_file.asInstanceOf[js.Any], debug_id = debug_id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("sourcemap")
      __obj.asInstanceOf[typings.sentryTypes.typesDebugMetaMod.SourceMapDebugImage]
    }
    
    inline def WasmDebugImage(code_file: String, debug_id: String): typings.sentryTypes.typesDebugMetaMod.WasmDebugImage = {
      val __obj = js.Dynamic.literal(code_file = code_file.asInstanceOf[js.Any], debug_id = debug_id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("wasm")
      __obj.asInstanceOf[typings.sentryTypes.typesDebugMetaMod.WasmDebugImage]
    }
  }
  
  trait DebugMeta extends StObject {
    
    var images: js.UndefOr[js.Array[DebugImage]] = js.undefined
  }
  object DebugMeta {
    
    inline def apply(): DebugMeta = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DebugMeta]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DebugMeta] (val x: Self) extends AnyVal {
      
      inline def setImages(value: js.Array[DebugImage]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      inline def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
      
      inline def setImagesVarargs(value: DebugImage*): Self = StObject.set(x, "images", js.Array(value*))
    }
  }
  
  trait SourceMapDebugImage
    extends StObject
       with DebugImage {
    
    var code_file: String
    
    var debug_id: String
    
    var `type`: sourcemap
  }
  object SourceMapDebugImage {
    
    inline def apply(code_file: String, debug_id: String): SourceMapDebugImage = {
      val __obj = js.Dynamic.literal(code_file = code_file.asInstanceOf[js.Any], debug_id = debug_id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("sourcemap")
      __obj.asInstanceOf[SourceMapDebugImage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SourceMapDebugImage] (val x: Self) extends AnyVal {
      
      inline def setCode_file(value: String): Self = StObject.set(x, "code_file", value.asInstanceOf[js.Any])
      
      inline def setDebug_id(value: String): Self = StObject.set(x, "debug_id", value.asInstanceOf[js.Any])
      
      inline def setType(value: sourcemap): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait WasmDebugImage
    extends StObject
       with DebugImage {
    
    var code_file: String
    
    var code_id: js.UndefOr[String | Null] = js.undefined
    
    var debug_file: js.UndefOr[String | Null] = js.undefined
    
    var debug_id: String
    
    var `type`: wasm
  }
  object WasmDebugImage {
    
    inline def apply(code_file: String, debug_id: String): WasmDebugImage = {
      val __obj = js.Dynamic.literal(code_file = code_file.asInstanceOf[js.Any], debug_id = debug_id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("wasm")
      __obj.asInstanceOf[WasmDebugImage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WasmDebugImage] (val x: Self) extends AnyVal {
      
      inline def setCode_file(value: String): Self = StObject.set(x, "code_file", value.asInstanceOf[js.Any])
      
      inline def setCode_id(value: String): Self = StObject.set(x, "code_id", value.asInstanceOf[js.Any])
      
      inline def setCode_idNull: Self = StObject.set(x, "code_id", null)
      
      inline def setCode_idUndefined: Self = StObject.set(x, "code_id", js.undefined)
      
      inline def setDebug_file(value: String): Self = StObject.set(x, "debug_file", value.asInstanceOf[js.Any])
      
      inline def setDebug_fileNull: Self = StObject.set(x, "debug_file", null)
      
      inline def setDebug_fileUndefined: Self = StObject.set(x, "debug_file", js.undefined)
      
      inline def setDebug_id(value: String): Self = StObject.set(x, "debug_id", value.asInstanceOf[js.Any])
      
      inline def setType(value: wasm): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
