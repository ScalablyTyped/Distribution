package typings.sharepoint.SP.Taxonomy

import typings.sharepoint.SP.ClientObject
import typings.sharepoint.SP.Guid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaxonomyItem
  extends StObject
     with ClientObject {
  
  def deleteObject(): Unit = js.native
  
  def get_createdDate(): js.Date = js.native
  
  def get_id(): Guid = js.native
  
  def get_lastModifiedDate(): js.Date = js.native
  
  def get_name(): String = js.native
  
  def get_termStore(): TermStore = js.native
  
  def set_name(value: String): Unit = js.native
}
