package typings.sharepoint.SP.Taxonomy

import typings.sharepoint.SP.ClientObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomPropertyMatchInformation extends ClientObject {
  
  def get_customPropertyName(): String = js.native
  
  def get_customPropertyValue(): String = js.native
  
  def get_resultCollectionSize(): Double = js.native
  
  def get_stringMatchOption(): StringMatchOption = js.native
  
  def get_trimUnavailable(): Boolean = js.native
  
  def set_customPropertyName(value: String): Unit = js.native
  
  def set_customPropertyValue(value: String): Unit = js.native
  
  def set_resultCollectionSize(value: Double): Unit = js.native
  
  def set_stringMatchOption(value: StringMatchOption): Unit = js.native
  
  def set_trimUnavailable(value: Boolean): Unit = js.native
}
