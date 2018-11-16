package typings
package sharepointLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Available only in SharePoint Online*/
@JSGlobal("URI_Encoding")
@js.native
object URIUnderscoreEncodingNs extends js.Object {
  def encodeURIComponent(str: java.lang.String): java.lang.String = js.native
  def encodeURIComponent(str: java.lang.String, bAsUrl: scala.Boolean): java.lang.String = js.native
  def encodeURIComponent(str: java.lang.String, bAsUrl: scala.Boolean, bForFilterQuery: scala.Boolean): java.lang.String = js.native
  def encodeURIComponent(
    str: java.lang.String,
    bAsUrl: scala.Boolean,
    bForFilterQuery: scala.Boolean,
    bForCallback: scala.Boolean
  ): java.lang.String = js.native
  def escapeUrlForCallback(str: java.lang.String): java.lang.String = js.native
}

