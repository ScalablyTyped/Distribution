package typings.sharepoint.Srch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Srch.DisplayControl")
@js.native
class DisplayControl () extends ClientControl {
  def add_oneTimeResultRendered(value: js.Any): Unit = js.native
  def add_queryReady(value: js.Any): Unit = js.native
  def add_resultRendered(value: js.Any): Unit = js.native
  def dataProvider_QueryIssuing(sender: js.Any, e: js.Any): Unit = js.native
  def dataProvider_ResultReady(sender: js.Any, e: js.Any): Unit = js.native
  def get_currentResultTableCollection(): js.Any = js.native
  def get_dataProvider(): DataProvider = js.native
  def get_emptyMessage(): String = js.native
  def get_queryGroupName(): String = js.native
  def get_renderedResult(): Boolean = js.native
  def get_shouldShowNoResultMessage(): Boolean = js.native
  def processQueryIssuing(queryState: js.Any): Unit = js.native
  def processResultReady(resultTableCollection: js.Any): Unit = js.native
  def raiseOneTimeResultRenderedEvent(arg: js.Any): Unit = js.native
  def raiseQueryReadyEvent(arg: js.Any): Unit = js.native
  def raiseResultRenderedEvent(arg: js.Any): Unit = js.native
  def refresh(queryState: js.Any): Unit = js.native
  def remove_oneTimeResultRendered(value: js.Any): Unit = js.native
  def remove_queryReady(value: js.Any): Unit = js.native
  def remove_resultRendered(value: js.Any): Unit = js.native
  def render(): Unit = js.native
  def set_currentResultTableCollection(value: js.Any): js.Any = js.native
  def set_emptyMessage(value: String): String = js.native
  def set_queryGroupName(value: String): String = js.native
  def set_renderedResult(value: Boolean): Boolean = js.native
  def set_shouldShowNoResultMessage(value: Boolean): Boolean = js.native
}

