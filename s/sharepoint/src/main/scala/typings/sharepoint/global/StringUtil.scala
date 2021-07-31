package typings.sharepoint.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in SharePoint Online*/
object StringUtil {
  
  @JSGlobal("StringUtil")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def ApplyStringTemplate(str: String, params: js.Any*): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ApplyStringTemplate")(str.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def BuildParam(stPattern: String, params: js.Any*): String = (^.asInstanceOf[js.Dynamic].applyDynamic("BuildParam")(stPattern.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[String]
}
