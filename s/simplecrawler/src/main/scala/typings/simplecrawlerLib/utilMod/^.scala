package typings
package simplecrawlerLib.utilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("util", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def debug(string: java.lang.String): scala.Unit = js.native
  def debuglog(key: java.lang.String): js.Function2[/* msg */ java.lang.String, /* repeated */ js.Any, scala.Unit] = js.native
  def deprecate[T /* <: js.Function */](fn: T, message: java.lang.String): T = js.native
  def error(param: js.Any*): scala.Unit = js.native
  def format(format: js.Any, param: js.Any*): java.lang.String = js.native
  def inherits(constructor: js.Any, superConstructor: js.Any): scala.Unit = js.native
  def inspect(`object`: js.Any): java.lang.String = js.native
  def inspect(`object`: js.Any, options: InspectOptions): java.lang.String = js.native
  def inspect(`object`: js.Any, showHidden: scala.Boolean): java.lang.String = js.native
  def inspect(`object`: js.Any, showHidden: scala.Boolean, depth: scala.Double): java.lang.String = js.native
  def inspect(`object`: js.Any, showHidden: scala.Boolean, depth: scala.Double, color: scala.Boolean): java.lang.String = js.native
  def inspect(`object`: js.Any, showHidden: scala.Boolean, depth: scala.Null, color: scala.Boolean): java.lang.String = js.native
  def isArray(`object`: js.Any): /* is std.Array<any> */ scala.Boolean = js.native
  def isBoolean(`object`: js.Any): /* is boolean */ scala.Boolean = js.native
  def isBuffer(`object`: js.Any): /* is simplecrawler.Buffer */ scala.Boolean = js.native
  def isDate(`object`: js.Any): /* is std.Date */ scala.Boolean = js.native
  def isError(`object`: js.Any): /* is simplecrawler.Error */ scala.Boolean = js.native
  def isFunction(`object`: js.Any): scala.Boolean = js.native
  def isNull(`object`: js.Any): /* is null */ scala.Boolean = js.native
  def isNullOrUndefined(`object`: js.Any): scala.Boolean = js.native
  def isNumber(`object`: js.Any): /* is number */ scala.Boolean = js.native
  def isObject(`object`: js.Any): scala.Boolean = js.native
  def isPrimitive(`object`: js.Any): scala.Boolean = js.native
  def isRegExp(`object`: js.Any): /* is std.RegExp */ scala.Boolean = js.native
  def isString(`object`: js.Any): /* is string */ scala.Boolean = js.native
  def isSymbol(`object`: js.Any): /* is symbol */ scala.Boolean = js.native
  def isUndefined(`object`: js.Any): /* is undefined */ scala.Boolean = js.native
  def log(string: java.lang.String): scala.Unit = js.native
  def print(param: js.Any*): scala.Unit = js.native
  def puts(param: js.Any*): scala.Unit = js.native
}

