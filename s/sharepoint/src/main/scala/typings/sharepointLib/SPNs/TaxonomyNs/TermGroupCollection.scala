package typings
package sharepointLib.SPNs.TaxonomyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TermGroupCollection
  extends sharepointLib.SPNs.ClientObjectCollection[TermGroup] {
  def getById(id: sharepointLib.SPNs.Guid): TermGroup = js.native
  def getByName(name: java.lang.String): TermGroup = js.native
  def get_item(index: scala.Double): TermGroup = js.native
  def itemAt(index: scala.Double): TermGroup = js.native
}

