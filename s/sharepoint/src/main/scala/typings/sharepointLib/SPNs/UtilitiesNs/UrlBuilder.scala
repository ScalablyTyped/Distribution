package typings
package sharepointLib.SPNs.UtilitiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Utilities.UrlBuilder")
@js.native
class UrlBuilder protected () extends js.Object {
  def this(path: java.lang.String) = this()
  def addKeyValueQueryString(key: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def combinePath(path: java.lang.String): scala.Unit = js.native
  /** Returns the resulting url */
  def get_url(): java.lang.String = js.native
}

/* static members */
@JSGlobal("SP.Utilities.UrlBuilder")
@js.native
object UrlBuilder extends js.Object {
  def removeQueryString(url: java.lang.String, key: java.lang.String): java.lang.String = js.native
  def replaceOrAddQueryString(url: java.lang.String, key: java.lang.String, value: java.lang.String): java.lang.String = js.native
  def urlCombine(path1: java.lang.String, path2: java.lang.String): java.lang.String = js.native
}

