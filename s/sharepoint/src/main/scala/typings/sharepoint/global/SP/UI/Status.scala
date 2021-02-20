package typings.sharepoint.global.SP.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.UI.Status")
@js.native
class Status ()
  extends typings.sharepoint.SP.UI.Status
object Status {
  
  /* static member */
  @JSGlobal("SP.UI.Status.addStatus")
  @js.native
  def addStatus(strTitle: String): String = js.native
  @JSGlobal("SP.UI.Status.addStatus")
  @js.native
  def addStatus(strTitle: String, strHtml: js.UndefOr[scala.Nothing], atBegining: Boolean): String = js.native
  @JSGlobal("SP.UI.Status.addStatus")
  @js.native
  def addStatus(strTitle: String, strHtml: String): String = js.native
  @JSGlobal("SP.UI.Status.addStatus")
  @js.native
  def addStatus(strTitle: String, strHtml: String, atBegining: Boolean): String = js.native
  
  /* static member */
  @JSGlobal("SP.UI.Status.appendStatus")
  @js.native
  def appendStatus(sid: String, strTitle: String, strHtml: String): String = js.native
  
  /* static member */
  @JSGlobal("SP.UI.Status.removeAllStatus")
  @js.native
  def removeAllStatus(hide: Boolean): Unit = js.native
  
  /* static member */
  @JSGlobal("SP.UI.Status.removeStatus")
  @js.native
  def removeStatus(sid: String): Unit = js.native
  
  /* static member */
  @JSGlobal("SP.UI.Status.setStatusPriColor")
  @js.native
  def setStatusPriColor(sid: String, strColor: String): Unit = js.native
  
  /* static member */
  @JSGlobal("SP.UI.Status.updateStatus")
  @js.native
  def updateStatus(sid: String, strHtml: String): Unit = js.native
}
