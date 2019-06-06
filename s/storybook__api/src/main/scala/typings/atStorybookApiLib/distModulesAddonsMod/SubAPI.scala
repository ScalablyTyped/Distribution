package typings
package atStorybookApiLib.distModulesAddonsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubAPI extends js.Object {
  def getElements(`type`: Types): Collection
  def getPanels(): Collection
  def getSelectedPanel(): java.lang.String
  def setSelectedPanel(panelName: java.lang.String): scala.Unit
}

object SubAPI {
  @scala.inline
  def apply(
    getElements: Types => Collection,
    getPanels: () => Collection,
    getSelectedPanel: () => java.lang.String,
    setSelectedPanel: java.lang.String => scala.Unit
  ): SubAPI = {
    val __obj = js.Dynamic.literal(getElements = js.Any.fromFunction1(getElements), getPanels = js.Any.fromFunction0(getPanels), getSelectedPanel = js.Any.fromFunction0(getSelectedPanel), setSelectedPanel = js.Any.fromFunction1(setSelectedPanel))
  
    __obj.asInstanceOf[SubAPI]
  }
}

