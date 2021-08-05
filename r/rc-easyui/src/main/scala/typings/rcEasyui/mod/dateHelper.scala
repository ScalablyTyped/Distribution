package typings.rcEasyui.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateHelper {
  
  @JSImport("rc-easyui", "dateHelper")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rc-easyui", "dateHelper.ampm")
  @js.native
  val ampm: js.Array[String] = js.native
  
  inline def formatDate(e: js.Any, t: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def parseDate(e: js.Any, t: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parseDate")(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def parseSelections(e: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseSelections")(e.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def setAmPm(e: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAmPm")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
