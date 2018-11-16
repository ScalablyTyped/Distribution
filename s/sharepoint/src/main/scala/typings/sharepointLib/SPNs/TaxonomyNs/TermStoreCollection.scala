package typings
package sharepointLib.SPNs.TaxonomyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TermStoreCollection
  extends sharepointLib.SPNs.ClientObjectCollection[TermStore] {
  def getById(id: sharepointLib.SPNs.Guid): TermStore = js.native
  def getByName(name: java.lang.String): TermStore = js.native
  def get_item(index: scala.Double): TermStore = js.native
  def itemAt(index: scala.Double): TermStore = js.native
}

