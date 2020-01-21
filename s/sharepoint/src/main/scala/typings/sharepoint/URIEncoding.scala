package typings.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Available only in SharePoint Online*/
@JSGlobal("URI_Encoding")
@js.native
object URIEncoding extends js.Object {
  def encodeURIComponent(str: String): String = js.native
  def encodeURIComponent(str: String, bAsUrl: Boolean): String = js.native
  def encodeURIComponent(str: String, bAsUrl: Boolean, bForFilterQuery: Boolean): String = js.native
  def encodeURIComponent(str: String, bAsUrl: Boolean, bForFilterQuery: Boolean, bForCallback: Boolean): String = js.native
  def escapeUrlForCallback(str: String): String = js.native
}

