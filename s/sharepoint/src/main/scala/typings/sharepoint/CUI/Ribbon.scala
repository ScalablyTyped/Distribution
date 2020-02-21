package typings.sharepoint.CUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CUI.Ribbon")
@js.native
class Ribbon protected () extends Component {
  def this(id: String, properties: ControlProperties) = this()
  def addChildAtIndex(child: js.Any, index: Double): scala.Unit = js.native
  def addContextualGroup(id: String, title: String, color: js.Any, command: String): js.Any = js.native
  def get_contextualGroupIds(): js.Array[String] = js.native
  def hideContextualGroup(id: String): scala.Unit = js.native
  def refresh(): scala.Unit = js.native
  def removeContextualGroup(id: String): scala.Unit = js.native
  def setFocus(): scala.Unit = js.native
  def setFocusOnCurrentTab(): scala.Unit = js.native
  def setFocusOnRibbon(): scala.Unit = js.native
  def showContextualGroup(id: String): scala.Unit = js.native
}

