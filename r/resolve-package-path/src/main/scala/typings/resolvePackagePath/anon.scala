package typings.resolvePackagePath

import org.scalablytyped.runtime.StringDictionary
import typings.std.Cache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Delete extends StObject {
    
    var _store: StringDictionary[String] = js.native
    
    def delete(key: String): Unit = js.native
    
    def get(key: String): String = js.native
    
    def has(key: String): Boolean = js.native
    
    def set(key: String, value: js.Any): js.Any = js.native
    
    val size: Double = js.native
  }
  object Delete {
    
    @scala.inline
    def apply(
      _store: StringDictionary[String],
      delete: String => Unit,
      get: String => String,
      has: String => Boolean,
      set: (String, js.Any) => js.Any,
      size: Double
    ): Delete = {
      val __obj = js.Dynamic.literal(_store = _store.asInstanceOf[js.Any], delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), set = js.Any.fromFunction2(set), size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Delete]
    }
    
    @scala.inline
    implicit class DeleteMutableBuilder[Self <: Delete] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelete(value: String => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGet(value: String => String): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHas(value: String => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet(value: (String, js.Any) => js.Any): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_store(value: StringDictionary[String]): Self = StObject.set(x, "_store", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MODULEENTRY extends StObject {
    
    var MODULE_ENTRY: Cache = js.native
    
    var PATH: Cache = js.native
    
    var REAL_DIRECTORY_PATH: Cache = js.native
    
    var REAL_FILE_PATH: Cache = js.native
  }
  object MODULEENTRY {
    
    @scala.inline
    def apply(MODULE_ENTRY: Cache, PATH: Cache, REAL_DIRECTORY_PATH: Cache, REAL_FILE_PATH: Cache): MODULEENTRY = {
      val __obj = js.Dynamic.literal(MODULE_ENTRY = MODULE_ENTRY.asInstanceOf[js.Any], PATH = PATH.asInstanceOf[js.Any], REAL_DIRECTORY_PATH = REAL_DIRECTORY_PATH.asInstanceOf[js.Any], REAL_FILE_PATH = REAL_FILE_PATH.asInstanceOf[js.Any])
      __obj.asInstanceOf[MODULEENTRY]
    }
    
    @scala.inline
    implicit class MODULEENTRYMutableBuilder[Self <: MODULEENTRY] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMODULE_ENTRY(value: Cache): Self = StObject.set(x, "MODULE_ENTRY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPATH(value: Cache): Self = StObject.set(x, "PATH", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setREAL_DIRECTORY_PATH(value: Cache): Self = StObject.set(x, "REAL_DIRECTORY_PATH", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setREAL_FILE_PATH(value: Cache): Self = StObject.set(x, "REAL_FILE_PATH", value.asInstanceOf[js.Any])
    }
  }
}
