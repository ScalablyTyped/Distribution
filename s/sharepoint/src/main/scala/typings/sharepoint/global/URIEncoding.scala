package typings.sharepoint.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in SharePoint Online*/
object URIEncoding {
  
  @JSGlobal("URI_Encoding")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def encodeURIComponent(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeURIComponent")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def encodeURIComponent(str: String, bAsUrl: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeURIComponent")(str.asInstanceOf[js.Any], bAsUrl.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def encodeURIComponent(str: String, bAsUrl: Boolean, bForFilterQuery: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeURIComponent")(str.asInstanceOf[js.Any], bAsUrl.asInstanceOf[js.Any], bForFilterQuery.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def encodeURIComponent(str: String, bAsUrl: Boolean, bForFilterQuery: Boolean, bForCallback: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeURIComponent")(str.asInstanceOf[js.Any], bAsUrl.asInstanceOf[js.Any], bForFilterQuery.asInstanceOf[js.Any], bForCallback.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def encodeURIComponent(str: String, bAsUrl: Boolean, bForFilterQuery: Unit, bForCallback: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeURIComponent")(str.asInstanceOf[js.Any], bAsUrl.asInstanceOf[js.Any], bForFilterQuery.asInstanceOf[js.Any], bForCallback.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def encodeURIComponent(str: String, bAsUrl: Unit, bForFilterQuery: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeURIComponent")(str.asInstanceOf[js.Any], bAsUrl.asInstanceOf[js.Any], bForFilterQuery.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def encodeURIComponent(str: String, bAsUrl: Unit, bForFilterQuery: Boolean, bForCallback: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeURIComponent")(str.asInstanceOf[js.Any], bAsUrl.asInstanceOf[js.Any], bForFilterQuery.asInstanceOf[js.Any], bForCallback.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def encodeURIComponent(str: String, bAsUrl: Unit, bForFilterQuery: Unit, bForCallback: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeURIComponent")(str.asInstanceOf[js.Any], bAsUrl.asInstanceOf[js.Any], bForFilterQuery.asInstanceOf[js.Any], bForCallback.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def escapeUrlForCallback(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeUrlForCallback")(str.asInstanceOf[js.Any]).asInstanceOf[String]
}
