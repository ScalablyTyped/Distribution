package typings.quickStore

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Database = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Database]
  inline def apply(filename: String): Database = ^.asInstanceOf[js.Dynamic].apply(filename.asInstanceOf[js.Any]).asInstanceOf[Database]
  inline def apply(filename: String, data: DatabaseContents): Database = (^.asInstanceOf[js.Dynamic].apply(filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Database]
  inline def apply(filename: Unit, data: DatabaseContents): Database = (^.asInstanceOf[js.Dynamic].apply(filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Database]
  
  @JSImport("quick-store", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Callback[Value] = js.Function1[/* data */ Value, Unit]
  
  @js.native
  trait Database extends StObject {
    
    def change(filename: String): Unit = js.native
    
    def clear(): Unit = js.native
    def clear(callback: Callback[DatabaseContents]): Unit = js.native
    
    def get(): DatabaseContents = js.native
    def get(callback: Callback[DatabaseContents]): Unit = js.native
    
    def getItem(key: String, callback: Callback[Value]): Unit = js.native
    
    def put(data: DatabaseContents): Unit = js.native
    def put(data: DatabaseContents, callback: Callback[DatabaseContents]): Unit = js.native
    
    def removeItem(key: String): Unit = js.native
    def removeItem(key: String, callback: Callback[DatabaseContents]): Unit = js.native
    
    def setItem(key: String, value: Value): Unit = js.native
    def setItem(key: String, value: Value, callback: Callback[DatabaseContents]): Unit = js.native
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type DatabaseContents = {[key: string] : quick-store.quick-store.Value}
  }}}
  to avoid circular code involving: 
  - quick-store.quick-store.DatabaseContents
  - quick-store.quick-store.Value
  */
  trait DatabaseContents
    extends StObject
       with /* key */ StringDictionary[Value]
  object DatabaseContents {
    
    inline def apply(): DatabaseContents = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DatabaseContents]
    }
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type Value = string | number | quick-store.quick-store.DatabaseContents | std.Array<quick-store.quick-store.Value> | boolean | null
  }}}
  to avoid circular code involving: 
  - quick-store.quick-store.Value
  */
  type Value = String | Double | DatabaseContents | js.Array[Any] | Boolean | Null
}
