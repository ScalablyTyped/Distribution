package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangeCollection extends ClientObjectCollection[Change] {
  
  def get_item(index: Double): Change = js.native
  
  def itemAt(index: Double): Change = js.native
}
