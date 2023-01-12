package typings.reactNativeFirebase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CACHESDIRECTORYPATH extends StObject {
  
  var CACHES_DIRECTORY_PATH: String
  
  var DOCUMENT_DIRECTORY_PATH: String
  
  var EXTERNAL_DIRECTORY_PATH: String
  
  var EXTERNAL_STORAGE_DIRECTORY_PATH: String
  
  var FILETYPE_DIRECTORY: String
  
  var FILETYPE_REGULAR: String
  
  var LIBRARY_DIRECTORY_PATH: String
  
  var MAIN_BUNDLE_PATH: String
  
  var TEMP_DIRECTORY_PATH: String
}
object CACHESDIRECTORYPATH {
  
  inline def apply(
    CACHES_DIRECTORY_PATH: String,
    DOCUMENT_DIRECTORY_PATH: String,
    EXTERNAL_DIRECTORY_PATH: String,
    EXTERNAL_STORAGE_DIRECTORY_PATH: String,
    FILETYPE_DIRECTORY: String,
    FILETYPE_REGULAR: String,
    LIBRARY_DIRECTORY_PATH: String,
    MAIN_BUNDLE_PATH: String,
    TEMP_DIRECTORY_PATH: String
  ): CACHESDIRECTORYPATH = {
    val __obj = js.Dynamic.literal(CACHES_DIRECTORY_PATH = CACHES_DIRECTORY_PATH.asInstanceOf[js.Any], DOCUMENT_DIRECTORY_PATH = DOCUMENT_DIRECTORY_PATH.asInstanceOf[js.Any], EXTERNAL_DIRECTORY_PATH = EXTERNAL_DIRECTORY_PATH.asInstanceOf[js.Any], EXTERNAL_STORAGE_DIRECTORY_PATH = EXTERNAL_STORAGE_DIRECTORY_PATH.asInstanceOf[js.Any], FILETYPE_DIRECTORY = FILETYPE_DIRECTORY.asInstanceOf[js.Any], FILETYPE_REGULAR = FILETYPE_REGULAR.asInstanceOf[js.Any], LIBRARY_DIRECTORY_PATH = LIBRARY_DIRECTORY_PATH.asInstanceOf[js.Any], MAIN_BUNDLE_PATH = MAIN_BUNDLE_PATH.asInstanceOf[js.Any], TEMP_DIRECTORY_PATH = TEMP_DIRECTORY_PATH.asInstanceOf[js.Any])
    __obj.asInstanceOf[CACHESDIRECTORYPATH]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CACHESDIRECTORYPATH] (val x: Self) extends AnyVal {
    
    inline def setCACHES_DIRECTORY_PATH(value: String): Self = StObject.set(x, "CACHES_DIRECTORY_PATH", value.asInstanceOf[js.Any])
    
    inline def setDOCUMENT_DIRECTORY_PATH(value: String): Self = StObject.set(x, "DOCUMENT_DIRECTORY_PATH", value.asInstanceOf[js.Any])
    
    inline def setEXTERNAL_DIRECTORY_PATH(value: String): Self = StObject.set(x, "EXTERNAL_DIRECTORY_PATH", value.asInstanceOf[js.Any])
    
    inline def setEXTERNAL_STORAGE_DIRECTORY_PATH(value: String): Self = StObject.set(x, "EXTERNAL_STORAGE_DIRECTORY_PATH", value.asInstanceOf[js.Any])
    
    inline def setFILETYPE_DIRECTORY(value: String): Self = StObject.set(x, "FILETYPE_DIRECTORY", value.asInstanceOf[js.Any])
    
    inline def setFILETYPE_REGULAR(value: String): Self = StObject.set(x, "FILETYPE_REGULAR", value.asInstanceOf[js.Any])
    
    inline def setLIBRARY_DIRECTORY_PATH(value: String): Self = StObject.set(x, "LIBRARY_DIRECTORY_PATH", value.asInstanceOf[js.Any])
    
    inline def setMAIN_BUNDLE_PATH(value: String): Self = StObject.set(x, "MAIN_BUNDLE_PATH", value.asInstanceOf[js.Any])
    
    inline def setTEMP_DIRECTORY_PATH(value: String): Self = StObject.set(x, "TEMP_DIRECTORY_PATH", value.asInstanceOf[js.Any])
  }
}
