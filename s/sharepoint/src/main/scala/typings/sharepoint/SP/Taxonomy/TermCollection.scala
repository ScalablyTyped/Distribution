package typings.sharepoint.SP.Taxonomy

import typings.sharepoint.SP.ClientObjectCollection
import typings.sharepoint.SP.Guid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TermCollection
  extends StObject
     with ClientObjectCollection[Term] {
  
  def getById(id: Guid): Term = js.native
  
  def getByName(name: String): Term = js.native
  
  def get_item(index: Double): Term = js.native
  
  def itemAt(index: Double): Term = js.native
}
