package typings.sharepoint.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTemplateCollection extends ClientObjectCollection[ListTemplate] {
  def getByName(name: String): ListTemplate = js.native
  def get_item(index: Double): ListTemplate = js.native
  def itemAt(index: Double): ListTemplate = js.native
}

