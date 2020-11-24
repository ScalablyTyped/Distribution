package typings.sharepoint.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in SharePoint Online*/
@JSGlobal("StringUtil")
@js.native
object StringUtil extends js.Object {
  
  def ApplyStringTemplate(str: String, params: js.Any*): String = js.native
  
  def BuildParam(stPattern: String, params: js.Any*): String = js.native
}
