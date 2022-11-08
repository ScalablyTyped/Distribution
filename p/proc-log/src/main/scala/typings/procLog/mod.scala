package typings.procLog

import typings.procLog.procLogStrings.error
import typings.procLog.procLogStrings.http
import typings.procLog.procLogStrings.info
import typings.procLog.procLogStrings.notice
import typings.procLog.procLogStrings.silly
import typings.procLog.procLogStrings.verbose
import typings.procLog.procLogStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("proc-log", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("proc-log", "LEVELS")
  @js.native
  val LEVELS: js.Tuple7[error, warn, notice, info, verbose, silly, http] = js.native
  
  inline def error(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def http(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("http")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def info(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def notice(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("notice")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def pause(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("pause")().asInstanceOf[Unit]
  
  inline def resume(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resume")().asInstanceOf[Unit]
  
  inline def silly(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("silly")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def verbose(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("verbose")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def warn(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.procLog.procLogStrings.error
    - typings.procLog.procLogStrings.warn
    - typings.procLog.procLogStrings.notice
    - typings.procLog.procLogStrings.info
    - typings.procLog.procLogStrings.verbose
    - typings.procLog.procLogStrings.silly
    - typings.procLog.procLogStrings.http
  */
  trait LogLevel extends StObject
  object LogLevel {
    
    inline def error: typings.procLog.procLogStrings.error = "error".asInstanceOf[typings.procLog.procLogStrings.error]
    
    inline def http: typings.procLog.procLogStrings.http = "http".asInstanceOf[typings.procLog.procLogStrings.http]
    
    inline def info: typings.procLog.procLogStrings.info = "info".asInstanceOf[typings.procLog.procLogStrings.info]
    
    inline def notice: typings.procLog.procLogStrings.notice = "notice".asInstanceOf[typings.procLog.procLogStrings.notice]
    
    inline def silly: typings.procLog.procLogStrings.silly = "silly".asInstanceOf[typings.procLog.procLogStrings.silly]
    
    inline def verbose: typings.procLog.procLogStrings.verbose = "verbose".asInstanceOf[typings.procLog.procLogStrings.verbose]
    
    inline def warn: typings.procLog.procLogStrings.warn = "warn".asInstanceOf[typings.procLog.procLogStrings.warn]
  }
}
