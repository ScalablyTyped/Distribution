package typings.segfaultHandler

import typings.segfaultHandler.segfaultHandlerStrings.SIGSEGV
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("segfault-handler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def causeSegfault(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("causeSegfault")().asInstanceOf[Unit]
  
  inline def registerHandler(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerHandler")().asInstanceOf[Unit]
  inline def registerHandler(file: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerHandler")(file.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def registerHandler(file: String, callback: CrashCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerHandler")(file.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type CrashCallback = js.Function3[/* signal */ SIGNAL, /* address */ String, /* stack */ js.Array[String], Any]
  
  type SIGNAL = SIGSEGV | String
}
