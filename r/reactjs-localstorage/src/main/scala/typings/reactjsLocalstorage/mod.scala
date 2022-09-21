package typings.reactjsLocalstorage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object reactLocalStorage {
    
    @JSImport("reactjs-localstorage", "reactLocalStorage")
    @js.native
    val ^ : js.Any = js.native
    
    inline def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
    
    inline def get[T](key: String): T = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any]).asInstanceOf[T]
    inline def get[T](key: String, defaultValue: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def get[T](key: String, defaultValue: T, silent: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], silent.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def get[T](key: String, defaultValue: Unit, silent: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], silent.asInstanceOf[js.Any])).asInstanceOf[T]
    
    inline def getObject(key: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getObject")(key.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    inline def getObject(key: String, defaultValue: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("getObject")(key.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def getObject(key: String, defaultValue: js.Object, silent: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("getObject")(key.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], silent.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def getObject(key: String, defaultValue: Unit, silent: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("getObject")(key.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], silent.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    
    inline def remove(key: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def set(key: String, value: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def set(key: String, value: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def set(key: String, value: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def setObject(key: String, value: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("setObject")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}
