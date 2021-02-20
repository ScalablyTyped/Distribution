package typings.sharepoint.SP.Taxonomy

import typings.sharepoint.SP.ClientObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Label extends ClientObject {
  
  def deleteObject(): Unit = js.native
  
  def get_isDefaultForLanguage(): Boolean = js.native
  
  def get_language(): Double = js.native
  
  def get_term(): Term = js.native
  
  def get_value(): String = js.native
  
  def setAsDefaultForLanguage(): Unit = js.native
  
  def set_language(value: Double): Unit = js.native
  
  def set_value(value: String): Unit = js.native
}
