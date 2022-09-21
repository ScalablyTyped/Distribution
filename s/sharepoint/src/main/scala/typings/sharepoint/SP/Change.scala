package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Change
  extends StObject
     with ClientObject {
  
  def get_changeToken(): ChangeToken = js.native
  
  def get_changeType(): ChangeType = js.native
  
  def get_siteId(): Guid = js.native
  
  def get_time(): js.Date = js.native
}
