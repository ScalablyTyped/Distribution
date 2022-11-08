package typings.procLog

import typings.procLog.mod.LogLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object procLogStrings {
  
  @js.native
  sealed trait error
    extends StObject
       with LogLevel
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait http
    extends StObject
       with LogLevel
  inline def http: http = "http".asInstanceOf[http]
  
  @js.native
  sealed trait info
    extends StObject
       with LogLevel
  inline def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait notice
    extends StObject
       with LogLevel
  inline def notice: notice = "notice".asInstanceOf[notice]
  
  @js.native
  sealed trait silly
    extends StObject
       with LogLevel
  inline def silly: silly = "silly".asInstanceOf[silly]
  
  @js.native
  sealed trait verbose
    extends StObject
       with LogLevel
  inline def verbose: verbose = "verbose".asInstanceOf[verbose]
  
  @js.native
  sealed trait warn
    extends StObject
       with LogLevel
  inline def warn: warn = "warn".asInstanceOf[warn]
}
