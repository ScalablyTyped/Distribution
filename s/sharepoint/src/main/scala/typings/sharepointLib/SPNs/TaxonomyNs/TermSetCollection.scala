package typings
package sharepointLib.SPNs.TaxonomyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TermSetCollection
  extends sharepointLib.SPNs.ClientObjectCollection[TermSet] {
  def getById(id: sharepointLib.SPNs.Guid): TermSet = js.native
  def getByName(name: java.lang.String): TermSet = js.native
  def get_item(index: scala.Double): TermSet = js.native
  def itemAt(index: scala.Double): TermSet = js.native
}

