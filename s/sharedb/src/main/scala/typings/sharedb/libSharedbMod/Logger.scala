package typings.sharedb.libSharedbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sharedb/lib/sharedb", "Logger")
@js.native
open class Logger () extends StObject {
  
  def error(data: Any*): Unit = js.native
  @JSName("error")
  var error_Original: LoggerFunction = js.native
  
  def info(data: Any*): Unit = js.native
  @JSName("info")
  var info_Original: LoggerFunction = js.native
  
  def setMethods(overrides: LoggerOverrides): Unit = js.native
  
  def warn(data: Any*): Unit = js.native
  @JSName("warn")
  var warn_Original: LoggerFunction = js.native
}
