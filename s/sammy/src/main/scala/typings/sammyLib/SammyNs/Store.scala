package typings
package sammyLib.SammyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Store
  extends org.scalablytyped.runtime.Instantiable0[js.Any]
     with org.scalablytyped.runtime.Instantiable1[/* options */ js.Any, js.Any] {
  var stores: js.Any = js.native
  def Cookie(name: js.Any, element: js.Any, options: js.Any): js.Any = js.native
  def Data(name: js.Any, element: js.Any): js.Any = js.native
  def LocalStorage(name: js.Any, element: js.Any): js.Any = js.native
  def Memory(name: js.Any, element: js.Any): js.Any = js.native
  def SessionStorage(name: js.Any, element: js.Any): js.Any = js.native
  def Template(app: js.Any, method_alias: js.Any): js.Any = js.native
  def clear(key: java.lang.String): js.Any = js.native
  def clearAll(): scala.Unit = js.native
  def each(callback: js.Function): scala.Boolean = js.native
  def exists(key: java.lang.String): scala.Boolean = js.native
  def fetch(key: java.lang.String, callback: js.Function): js.Any = js.native
  def filter(callback: js.Function): scala.Boolean = js.native
  def first(callback: js.Function): scala.Boolean = js.native
  def get(key: java.lang.String): js.Any = js.native
  def isAvailable(): scala.Boolean = js.native
  def isAvailable(`type`: js.Any): js.Any = js.native
  def keys(): js.Array[java.lang.String] = js.native
  def load(key: java.lang.String, path: java.lang.String, callback: js.Function): scala.Unit = js.native
  def set(key: java.lang.String, value: js.Any): js.Any = js.native
}

