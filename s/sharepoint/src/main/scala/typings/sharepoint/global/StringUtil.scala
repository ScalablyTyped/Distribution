package typings.sharepoint.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in SharePoint Online*/
object StringUtil {
  
  @JSGlobal("StringUtil")
  @js.native
  val ^ : js.Any = js.native
  
  inline def ApplyStringTemplate(str: String, params: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ApplyStringTemplate")(scala.List(str.asInstanceOf[js.Any]).`++`(params.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  
  inline def BuildParam(stPattern: String, params: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("BuildParam")(scala.List(stPattern.asInstanceOf[js.Any]).`++`(params.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
}
