package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureCollection extends ClientObjectCollection[Feature] {
  
  def add(featureId: Guid, force: Boolean, featdefScope: FeatureDefinitionScope): Feature = js.native
  
  def getById(featureId: Guid): Feature = js.native
  
  def get_item(index: Double): Feature = js.native
  
  def itemAt(index: Double): Feature = js.native
  
  def remove(featureId: Guid, force: Boolean): Unit = js.native
}
