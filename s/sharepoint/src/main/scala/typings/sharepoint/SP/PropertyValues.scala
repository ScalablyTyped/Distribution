package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertyValues
  extends StObject
     with ClientObject {
  
  def get_fieldValues(): js.Any = js.native
  
  def get_item(fieldName: String): js.Any = js.native
  
  def set_item(fieldName: String, value: js.Any): Unit = js.native
}
