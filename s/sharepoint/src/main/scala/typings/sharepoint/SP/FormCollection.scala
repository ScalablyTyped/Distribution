package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormCollection extends ClientObjectCollection[Form] {
  
  def getById(id: Guid): Form = js.native
  
  def getByPageType(formType: PageType): Form = js.native
  
  def get_item(index: Double): Form = js.native
  
  def itemAt(index: Double): Form = js.native
}
