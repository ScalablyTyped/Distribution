package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldMultiChoice
  extends StObject
     with Field {
  
  def get_choices(): js.Array[String] = js.native
  
  def get_fillInChoice(): Boolean = js.native
  
  def get_mappings(): String = js.native
  
  def set_choices(value: js.Array[String]): Unit = js.native
  
  def set_fillInChoice(value: Boolean): Unit = js.native
}
