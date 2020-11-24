package typings.sharepoint.SP.Taxonomy

import typings.sharepoint.SP.ClientObjectCollection
import typings.sharepoint.SP.Guid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TermSetCollection extends ClientObjectCollection[TermSet] {
  
  def getById(id: Guid): TermSet = js.native
  
  def getByName(name: String): TermSet = js.native
  
  def get_item(index: Double): TermSet = js.native
  
  def itemAt(index: Double): TermSet = js.native
}
