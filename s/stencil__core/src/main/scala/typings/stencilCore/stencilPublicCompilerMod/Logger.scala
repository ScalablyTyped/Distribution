package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Logger extends StObject {
  
  def bgRed(msg: String): String = js.native
  
  def blue(msg: String): String = js.native
  
  def bold(msg: String): String = js.native
  
  var createLineUpdater: js.UndefOr[js.Function0[js.Promise[LoggerLineUpdater]]] = js.native
  
  def createTimeSpan(startMsg: String): LoggerTimeSpan = js.native
  def createTimeSpan(startMsg: String, debug: Boolean): LoggerTimeSpan = js.native
  def createTimeSpan(startMsg: String, debug: Boolean, appendTo: js.Array[String]): LoggerTimeSpan = js.native
  def createTimeSpan(startMsg: String, debug: Unit, appendTo: js.Array[String]): LoggerTimeSpan = js.native
  
  def cyan(msg: String): String = js.native
  
  def debug(msg: Any*): Unit = js.native
  
  def dim(msg: String): String = js.native
  
  def emoji(e: String): String = js.native
  
  def enableColors(useColors: Boolean): Unit = js.native
  
  def error(msg: Any*): Unit = js.native
  
  def getLevel(): LogLevel = js.native
  
  def gray(msg: String): String = js.native
  
  def green(msg: String): String = js.native
  
  def info(msg: Any*): Unit = js.native
  
  def magenta(msg: String): String = js.native
  
  def printDiagnostics(diagnostics: js.Array[Diagnostic]): Unit = js.native
  def printDiagnostics(diagnostics: js.Array[Diagnostic], cwd: String): Unit = js.native
  
  def red(msg: String): String = js.native
  
  def setLevel(level: LogLevel): Unit = js.native
  
  var setLogFilePath: js.UndefOr[js.Function1[/* p */ String, Unit]] = js.native
  
  def warn(msg: Any*): Unit = js.native
  
  var writeLogs: js.UndefOr[js.Function1[/* append */ Boolean, Unit]] = js.native
  
  def yellow(msg: String): String = js.native
}
