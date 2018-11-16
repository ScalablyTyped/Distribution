package typings
package sharepointLib.SrchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Srch.DisplayControl")
@js.native
class DisplayControl () extends ClientControl {
  def add_oneTimeResultRendered(value: js.Any): scala.Unit = js.native
  def add_queryReady(value: js.Any): scala.Unit = js.native
  def add_resultRendered(value: js.Any): scala.Unit = js.native
  def dataProvider_QueryIssuing(sender: js.Any, e: js.Any): scala.Unit = js.native
  def dataProvider_ResultReady(sender: js.Any, e: js.Any): scala.Unit = js.native
  def get_currentResultTableCollection(): js.Any = js.native
  def get_dataProvider(): DataProvider = js.native
  def get_emptyMessage(): java.lang.String = js.native
  def get_queryGroupName(): java.lang.String = js.native
  def get_renderedResult(): scala.Boolean = js.native
  def get_shouldShowNoResultMessage(): scala.Boolean = js.native
  def processQueryIssuing(queryState: js.Any): scala.Unit = js.native
  def processResultReady(resultTableCollection: js.Any): scala.Unit = js.native
  def raiseOneTimeResultRenderedEvent(arg: js.Any): scala.Unit = js.native
  def raiseQueryReadyEvent(arg: js.Any): scala.Unit = js.native
  def raiseResultRenderedEvent(arg: js.Any): scala.Unit = js.native
  def refresh(queryState: js.Any): scala.Unit = js.native
  def remove_oneTimeResultRendered(value: js.Any): scala.Unit = js.native
  def remove_queryReady(value: js.Any): scala.Unit = js.native
  def remove_resultRendered(value: js.Any): scala.Unit = js.native
  def render(): scala.Unit = js.native
  def set_currentResultTableCollection(value: js.Any): js.Any = js.native
  def set_emptyMessage(value: java.lang.String): java.lang.String = js.native
  def set_queryGroupName(value: java.lang.String): java.lang.String = js.native
  def set_renderedResult(value: scala.Boolean): scala.Boolean = js.native
  def set_shouldShowNoResultMessage(value: scala.Boolean): scala.Boolean = js.native
}

