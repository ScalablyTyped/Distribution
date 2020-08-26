package typings.sharepoint.global.SP.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.UI.Status")
@js.native
class Status ()
  extends typings.sharepoint.SP.UI.Status

/* static members */
@JSGlobal("SP.UI.Status")
@js.native
object Status extends js.Object {
  def addStatus(strTitle: String): String = js.native
  def addStatus(strTitle: String, strHtml: js.UndefOr[scala.Nothing], atBegining: Boolean): String = js.native
  def addStatus(strTitle: String, strHtml: String): String = js.native
  def addStatus(strTitle: String, strHtml: String, atBegining: Boolean): String = js.native
  def appendStatus(sid: String, strTitle: String, strHtml: String): String = js.native
  def removeAllStatus(hide: Boolean): Unit = js.native
  def removeStatus(sid: String): Unit = js.native
  def setStatusPriColor(sid: String, strColor: String): Unit = js.native
  def updateStatus(sid: String, strHtml: String): Unit = js.native
}

