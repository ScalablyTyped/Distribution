package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureCollection extends ClientObjectCollection[Feature] {
  def add(featureId: Guid, force: scala.Boolean, featdefScope: FeatureDefinitionScope): Feature = js.native
  def getById(featureId: Guid): Feature = js.native
  def get_item(index: scala.Double): Feature = js.native
  def itemAt(index: scala.Double): Feature = js.native
  def remove(featureId: Guid, force: scala.Boolean): scala.Unit = js.native
}

