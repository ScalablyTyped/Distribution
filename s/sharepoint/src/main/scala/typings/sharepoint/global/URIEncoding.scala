package typings.sharepoint.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in SharePoint Online*/
@JSGlobal("URI_Encoding")
@js.native
object URIEncoding extends js.Object {
  
  def encodeURIComponent(str: String): String = js.native
  def encodeURIComponent(
    str: String,
    bAsUrl: js.UndefOr[scala.Nothing],
    bForFilterQuery: js.UndefOr[scala.Nothing],
    bForCallback: Boolean
  ): String = js.native
  def encodeURIComponent(str: String, bAsUrl: js.UndefOr[scala.Nothing], bForFilterQuery: Boolean): String = js.native
  def encodeURIComponent(str: String, bAsUrl: js.UndefOr[scala.Nothing], bForFilterQuery: Boolean, bForCallback: Boolean): String = js.native
  def encodeURIComponent(str: String, bAsUrl: Boolean): String = js.native
  def encodeURIComponent(str: String, bAsUrl: Boolean, bForFilterQuery: js.UndefOr[scala.Nothing], bForCallback: Boolean): String = js.native
  def encodeURIComponent(str: String, bAsUrl: Boolean, bForFilterQuery: Boolean): String = js.native
  def encodeURIComponent(str: String, bAsUrl: Boolean, bForFilterQuery: Boolean, bForCallback: Boolean): String = js.native
  
  def escapeUrlForCallback(str: String): String = js.native
}
