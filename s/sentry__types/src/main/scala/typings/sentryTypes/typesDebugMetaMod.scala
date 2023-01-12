package typings.sentryTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDebugMetaMod {
  
  trait DebugImage extends StObject {
    
    var code_file: String
    
    var code_id: js.UndefOr[String | Null] = js.undefined
    
    var debug_file: js.UndefOr[String | Null] = js.undefined
    
    var debug_id: String
    
    var `type`: DebugImageType
  }
  object DebugImage {
    
    inline def apply(code_file: String, debug_id: String, `type`: DebugImageType): DebugImage = {
      val __obj = js.Dynamic.literal(code_file = code_file.asInstanceOf[js.Any], debug_id = debug_id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DebugImage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DebugImage] (val x: Self) extends AnyVal {
      
      inline def setCode_file(value: String): Self = StObject.set(x, "code_file", value.asInstanceOf[js.Any])
      
      inline def setCode_id(value: String): Self = StObject.set(x, "code_id", value.asInstanceOf[js.Any])
      
      inline def setCode_idNull: Self = StObject.set(x, "code_id", null)
      
      inline def setCode_idUndefined: Self = StObject.set(x, "code_id", js.undefined)
      
      inline def setDebug_file(value: String): Self = StObject.set(x, "debug_file", value.asInstanceOf[js.Any])
      
      inline def setDebug_fileNull: Self = StObject.set(x, "debug_file", null)
      
      inline def setDebug_fileUndefined: Self = StObject.set(x, "debug_file", js.undefined)
      
      inline def setDebug_id(value: String): Self = StObject.set(x, "debug_id", value.asInstanceOf[js.Any])
      
      inline def setType(value: DebugImageType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sentryTypes.sentryTypesStrings.wasm
    - typings.sentryTypes.sentryTypesStrings.macho
    - typings.sentryTypes.sentryTypesStrings.elf
    - typings.sentryTypes.sentryTypesStrings.pe
  */
  trait DebugImageType extends StObject
  object DebugImageType {
    
    inline def elf: typings.sentryTypes.sentryTypesStrings.elf = "elf".asInstanceOf[typings.sentryTypes.sentryTypesStrings.elf]
    
    inline def macho: typings.sentryTypes.sentryTypesStrings.macho = "macho".asInstanceOf[typings.sentryTypes.sentryTypesStrings.macho]
    
    inline def pe: typings.sentryTypes.sentryTypesStrings.pe = "pe".asInstanceOf[typings.sentryTypes.sentryTypesStrings.pe]
    
    inline def wasm: typings.sentryTypes.sentryTypesStrings.wasm = "wasm".asInstanceOf[typings.sentryTypes.sentryTypesStrings.wasm]
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
}
