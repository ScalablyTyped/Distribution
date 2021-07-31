package typings.sharepoint.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in SharePoint Online*/
object Encoding {
  
  @JSGlobal("Encoding")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def AttrQuote(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("AttrQuote")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def CanonicalizeUrlEncodingCase(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("CanonicalizeUrlEncodingCase")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def EncodeScriptQuote(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("EncodeScriptQuote")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def HtmlDecode(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("HtmlDecode")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def HtmlEncode(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("HtmlEncode")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def ScriptEncode(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ScriptEncode")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def ScriptEncodeWithQuote(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ScriptEncodeWithQuote")(str.asInstanceOf[js.Any]).asInstanceOf[String]
}
