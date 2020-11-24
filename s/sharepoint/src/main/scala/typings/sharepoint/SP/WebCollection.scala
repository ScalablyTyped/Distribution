package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebCollection extends ClientObjectCollection[Web] {
  
  def add(parameters: WebCreationInformation): Web = js.native
  
  def get_item(index: Double): Web = js.native
  
  def itemAt(index: Double): Web = js.native
}
