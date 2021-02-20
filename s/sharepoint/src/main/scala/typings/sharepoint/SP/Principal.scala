package typings.sharepoint.SP

import typings.sharepoint.SP.Utilities.PrincipalType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Principal extends ClientObject {
  
  def get_id(): Double = js.native
  
  def get_isHiddenInUI(): Boolean = js.native
  
  def get_loginName(): String = js.native
  
  def get_principalType(): PrincipalType = js.native
  
  def get_title(): String = js.native
  
  def set_title(value: String): Unit = js.native
}
