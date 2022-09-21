package typings.qiniuJs

import typings.qiniuJs.reportV3Mod.V3LogInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggerMod {
  
  @JSImport("qiniu-js/esm/logger", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Logger {
    def this(token: String) = this()
    def this(token: String, disableReport: Boolean) = this()
    def this(token: String, disableReport: Boolean, level: LogLevel) = this()
    def this(token: String, disableReport: Unit, level: LogLevel) = this()
    def this(token: String, disableReport: Boolean, level: Unit, prefix: String) = this()
    def this(token: String, disableReport: Boolean, level: LogLevel, prefix: String) = this()
    def this(token: String, disableReport: Unit, level: Unit, prefix: String) = this()
    def this(token: String, disableReport: Unit, level: LogLevel, prefix: String) = this()
  }
  /* static members */
  object default {
    
    @JSImport("qiniu-js/esm/logger", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("qiniu-js/esm/logger", "default.id")
    @js.native
    def id: Any = js.native
    inline def id_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.qiniuJs.qiniuJsStrings.INFO
    - typings.qiniuJs.qiniuJsStrings.WARN
    - typings.qiniuJs.qiniuJsStrings.ERROR
    - typings.qiniuJs.qiniuJsStrings.OFF
  */
  trait LogLevel extends StObject
  object LogLevel {
    
    inline def ERROR: typings.qiniuJs.qiniuJsStrings.ERROR = "ERROR".asInstanceOf[typings.qiniuJs.qiniuJsStrings.ERROR]
    
    inline def INFO: typings.qiniuJs.qiniuJsStrings.INFO = "INFO".asInstanceOf[typings.qiniuJs.qiniuJsStrings.INFO]
    
    inline def OFF: typings.qiniuJs.qiniuJsStrings.OFF = "OFF".asInstanceOf[typings.qiniuJs.qiniuJsStrings.OFF]
    
    inline def WARN: typings.qiniuJs.qiniuJsStrings.WARN = "WARN".asInstanceOf[typings.qiniuJs.qiniuJsStrings.WARN]
  }
  
  @js.native
  trait Logger extends StObject {
    
    /* private */ var disableReport: Any = js.native
    
    /**
      * @param  {unknown[]} ...args
      * @description 输出 error 级别的调试信息。
      */
    def error(args: Any*): Unit = js.native
    
    /* private */ var getPrintPrefix: Any = js.native
    
    /* private */ var id: Any = js.native
    
    /**
      * @param  {unknown[]} ...args
      * @description 输出 info 级别的调试信息。
      */
    def info(args: Any*): Unit = js.native
    
    /* private */ var level: Any = js.native
    
    /* private */ var prefix: Any = js.native
    
    /**
      * @param  {V3LogInfo} data 上报的数据。
      * @param  {boolean} retry 重试次数，可选，默认为 3。
      * @description 向服务端上报统计信息。
      */
    def report(data: V3LogInfo): Unit = js.native
    def report(data: V3LogInfo, retry: Double): Unit = js.native
    
    /* private */ var token: Any = js.native
    
    /**
      * @param  {unknown[]} ...args
      * @description 输出 warn 级别的调试信息。
      */
    def warn(args: Any*): Unit = js.native
  }
}
