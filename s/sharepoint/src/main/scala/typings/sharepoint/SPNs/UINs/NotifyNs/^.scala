package typings.sharepoint.SPNs.UINs.NotifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.UI.Notify")
@js.native
object ^ extends js.Object {
  def addNotification(strHtml: String, bSticky: Boolean): String = js.native
  def removeNotification(nid: String): Unit = js.native
  def showLoadingNotification(bSticky: Boolean): String = js.native
}

