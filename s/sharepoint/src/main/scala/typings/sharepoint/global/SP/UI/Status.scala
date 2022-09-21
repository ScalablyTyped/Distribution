package typings.sharepoint.global.SP.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.UI.Status")
@js.native
open class Status ()
  extends StObject
     with typings.sharepoint.SP.UI.Status
object Status {
  
  @JSGlobal("SP.UI.Status")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def addStatus(strTitle: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("addStatus")(strTitle.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def addStatus(strTitle: String, strHtml: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("addStatus")(strTitle.asInstanceOf[js.Any], strHtml.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def addStatus(strTitle: String, strHtml: String, atBegining: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("addStatus")(strTitle.asInstanceOf[js.Any], strHtml.asInstanceOf[js.Any], atBegining.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def addStatus(strTitle: String, strHtml: Unit, atBegining: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("addStatus")(strTitle.asInstanceOf[js.Any], strHtml.asInstanceOf[js.Any], atBegining.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* static member */
  inline def appendStatus(sid: String, strTitle: String, strHtml: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("appendStatus")(sid.asInstanceOf[js.Any], strTitle.asInstanceOf[js.Any], strHtml.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* static member */
  inline def removeAllStatus(hide: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAllStatus")(hide.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* static member */
  inline def removeStatus(sid: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeStatus")(sid.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* static member */
  inline def setStatusPriColor(sid: String, strColor: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setStatusPriColor")(sid.asInstanceOf[js.Any], strColor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def updateStatus(sid: String, strHtml: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateStatus")(sid.asInstanceOf[js.Any], strHtml.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
