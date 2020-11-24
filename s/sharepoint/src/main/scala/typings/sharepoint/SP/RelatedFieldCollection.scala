package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelatedFieldCollection extends ClientObjectCollection[RelatedField] {
  
  def get_item(index: Double): RelatedField = js.native
  
  def itemAt(index: Double): RelatedField = js.native
}
