package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebTemplateCollection extends ClientObjectCollection[WebTemplate] {
  def getByName(name: String): WebTemplate = js.native
  def get_item(index: Double): WebTemplate = js.native
  def itemAt(index: Double): WebTemplate = js.native
}

