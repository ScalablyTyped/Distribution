package typings.sapLogging

import typings.sapLogging.mod.LogLevels
import typings.sapLogging.mod.TraceLevels
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapLoggingStrings {
  
  @js.native
  sealed trait debug
    extends StObject
       with TraceLevels
  inline def debug: debug = "debug".asInstanceOf[debug]
  
  @js.native
  sealed trait error
    extends StObject
       with LogLevels
       with TraceLevels
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait fatal
    extends StObject
       with LogLevels
       with TraceLevels
  inline def fatal: fatal = "fatal".asInstanceOf[fatal]
  
  @js.native
  sealed trait info
    extends StObject
       with LogLevels
       with TraceLevels
  inline def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait path
    extends StObject
       with TraceLevels
  inline def path: path = "path".asInstanceOf[path]
  
  @js.native
  sealed trait warning
    extends StObject
       with LogLevels
       with TraceLevels
  inline def warning: warning = "warning".asInstanceOf[warning]
}
