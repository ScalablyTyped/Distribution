package typings.rollup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MinimalPluginContext extends StObject {
  
  def debug(log: String): Unit = js.native
  def debug(log: js.Function0[RollupLog | String]): Unit = js.native
  def debug(log: RollupLog): Unit = js.native
  @JSName("debug")
  var debug_Original: LoggingFunction = js.native
  
  def error(error: String): scala.Nothing = js.native
  def error(error: RollupError): scala.Nothing = js.native
  
  def info(log: String): Unit = js.native
  def info(log: js.Function0[RollupLog | String]): Unit = js.native
  def info(log: RollupLog): Unit = js.native
  @JSName("info")
  var info_Original: LoggingFunction = js.native
  
  var meta: PluginContextMeta = js.native
  
  def warn(log: String): Unit = js.native
  def warn(log: js.Function0[RollupLog | String]): Unit = js.native
  def warn(log: RollupLog): Unit = js.native
  @JSName("warn")
  var warn_Original: LoggingFunction = js.native
}
