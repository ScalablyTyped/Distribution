package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserCustomActionCollection extends ClientObjectCollection[UserCustomAction] {
  
  def add(): UserCustomAction = js.native
  
  def clear(): Unit = js.native
  
  def getById(id: Guid): UserCustomAction = js.native
  
  def get_item(index: Double): UserCustomAction = js.native
  
  def itemAt(index: Double): UserCustomAction = js.native
}
