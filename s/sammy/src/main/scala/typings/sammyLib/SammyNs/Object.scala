package typings
package sammyLib.SammyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Sammy.Object")
@js.native
class Object protected () extends js.Object {
  def this(obj: js.Any) = this()
  def escapeHTML(s: java.lang.String): java.lang.String = js.native
  def h(s: java.lang.String): java.lang.String = js.native
  def has(key: java.lang.String): scala.Boolean = js.native
  def join(args: js.Any*): java.lang.String = js.native
  def keys(): js.Array[java.lang.String] = js.native
  def keys(attributes_only: scala.Boolean): js.Array[java.lang.String] = js.native
  def log(args: js.Any*): scala.Unit = js.native
  def toHTML(): java.lang.String = js.native
  def toHash(): js.Any = js.native
  def toString(include_functions: scala.Boolean): java.lang.String = js.native
}

