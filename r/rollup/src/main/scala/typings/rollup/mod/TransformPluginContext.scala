package typings.rollup.mod

import typings.rollup.anon.Column
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformPluginContext
  extends StObject
     with PluginContext {
  
  def debug(log: String, pos: Double): Unit = js.native
  def debug(log: String, pos: Column): Unit = js.native
  def debug(log: js.Function0[RollupLog | String], pos: Double): Unit = js.native
  def debug(log: js.Function0[RollupLog | String], pos: Column): Unit = js.native
  def debug(log: RollupLog, pos: Double): Unit = js.native
  def debug(log: RollupLog, pos: Column): Unit = js.native
  @JSName("debug")
  var debug_Original_TransformPluginContext: LoggingFunctionWithPosition = js.native
  
  def error(error: String, pos: Double): scala.Nothing = js.native
  def error(error: String, pos: Column): scala.Nothing = js.native
  def error(error: RollupError, pos: Double): scala.Nothing = js.native
  def error(error: RollupError, pos: Column): scala.Nothing = js.native
  
  def getCombinedSourcemap(): SourceMap = js.native
  
  def info(log: String, pos: Double): Unit = js.native
  def info(log: String, pos: Column): Unit = js.native
  def info(log: js.Function0[RollupLog | String], pos: Double): Unit = js.native
  def info(log: js.Function0[RollupLog | String], pos: Column): Unit = js.native
  def info(log: RollupLog, pos: Double): Unit = js.native
  def info(log: RollupLog, pos: Column): Unit = js.native
  @JSName("info")
  var info_Original_TransformPluginContext: LoggingFunctionWithPosition = js.native
  
  def warn(log: String, pos: Double): Unit = js.native
  def warn(log: String, pos: Column): Unit = js.native
  def warn(log: js.Function0[RollupLog | String], pos: Double): Unit = js.native
  def warn(log: js.Function0[RollupLog | String], pos: Column): Unit = js.native
  def warn(log: RollupLog, pos: Double): Unit = js.native
  def warn(log: RollupLog, pos: Column): Unit = js.native
  @JSName("warn")
  var warn_Original_TransformPluginContext: LoggingFunctionWithPosition = js.native
}
