package typings
package sharepointLib.SPNs.TaxonomyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TermCollection
  extends sharepointLib.SPNs.ClientObjectCollection[Term] {
  def getById(id: sharepointLib.SPNs.Guid): Term = js.native
  def getByName(name: java.lang.String): Term = js.native
  def get_item(index: scala.Double): Term = js.native
  def itemAt(index: scala.Double): Term = js.native
}

