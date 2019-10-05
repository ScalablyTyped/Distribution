package typings.sharepoint.SP.Utilities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Utilities.UrlBuilder")
@js.native
class UrlBuilder protected () extends js.Object {
  def this(path: String) = this()
  def addKeyValueQueryString(key: String, value: String): Unit = js.native
  def combinePath(path: String): Unit = js.native
  /** Returns the resulting url */
  def get_url(): String = js.native
}

/* static members */
@JSGlobal("SP.Utilities.UrlBuilder")
@js.native
object UrlBuilder extends js.Object {
  def removeQueryString(url: String, key: String): String = js.native
  def replaceOrAddQueryString(url: String, key: String, value: String): String = js.native
  def urlCombine(path1: String, path2: String): String = js.native
}

