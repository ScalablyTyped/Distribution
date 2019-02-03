package typings
package sharepointLib.SPNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.UI.Status")
@js.native
class Status () extends js.Object

/* static members */
@JSGlobal("SP.UI.Status")
@js.native
object Status extends js.Object {
  def addStatus(strTitle: java.lang.String): java.lang.String = js.native
  def addStatus(strTitle: java.lang.String, strHtml: java.lang.String): java.lang.String = js.native
  def addStatus(strTitle: java.lang.String, strHtml: java.lang.String, atBegining: scala.Boolean): java.lang.String = js.native
  def appendStatus(sid: java.lang.String, strTitle: java.lang.String, strHtml: java.lang.String): java.lang.String = js.native
  def removeAllStatus(hide: scala.Boolean): scala.Unit = js.native
  def removeStatus(sid: java.lang.String): scala.Unit = js.native
  def setStatusPriColor(sid: java.lang.String, strColor: java.lang.String): scala.Unit = js.native
  def updateStatus(sid: java.lang.String, strHtml: java.lang.String): scala.Unit = js.native
}

