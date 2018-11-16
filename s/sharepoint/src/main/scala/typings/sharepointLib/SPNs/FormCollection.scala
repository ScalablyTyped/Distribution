package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormCollection extends ClientObjectCollection[Form] {
  def getById(id: Guid): Form = js.native
  def getByPageType(formType: PageType): Form = js.native
  def get_item(index: scala.Double): Form = js.native
  def itemAt(index: scala.Double): Form = js.native
}

