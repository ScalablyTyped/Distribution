package typings.sinonjsCommons

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deprecatedMod {
  
  @JSImport("@sinonjs/commons/types/deprecated", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultMsg(packageName: String, funcName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultMsg")(packageName.asInstanceOf[js.Any], funcName.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def printWarning(msg: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("printWarning")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def wrap(func: js.Function, msg: String): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(func.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[js.Function]
}
