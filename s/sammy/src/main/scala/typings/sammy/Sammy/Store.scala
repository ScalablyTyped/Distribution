package typings.sammy.Sammy

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Store
  extends Instantiable0[js.Any]
     with Instantiable1[/* options */ js.Any, js.Any] {
  
  def Cookie(name: js.Any, element: js.Any, options: js.Any): js.Any = js.native
  
  def Data(name: js.Any, element: js.Any): js.Any = js.native
  
  def LocalStorage(name: js.Any, element: js.Any): js.Any = js.native
  
  def Memory(name: js.Any, element: js.Any): js.Any = js.native
  
  def SessionStorage(name: js.Any, element: js.Any): js.Any = js.native
  
  def Template(app: js.Any, method_alias: js.Any): js.Any = js.native
  
  def clear(key: String): js.Any = js.native
  
  def clearAll(): Unit = js.native
  
  def each(callback: js.Function): Boolean = js.native
  
  def exists(key: String): Boolean = js.native
  
  def fetch(key: String, callback: js.Function): js.Any = js.native
  
  def filter(callback: js.Function): Boolean = js.native
  
  def first(callback: js.Function): Boolean = js.native
  
  def get(key: String): js.Any = js.native
  
  def isAvailable(): Boolean = js.native
  def isAvailable(`type`: js.Any): js.Any = js.native
  
  def keys(): js.Array[String] = js.native
  
  def load(key: String, path: String, callback: js.Function): Unit = js.native
  
  def set(key: String, value: js.Any): js.Any = js.native
  
  var stores: js.Any = js.native
}
