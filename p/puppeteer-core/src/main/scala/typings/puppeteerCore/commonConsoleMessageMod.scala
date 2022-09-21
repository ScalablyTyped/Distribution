package typings.puppeteerCore

import typings.puppeteerCore.commonJshandleMod.JSHandle
import typings.puppeteerCore.puppeteerCoreStrings.clear_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonConsoleMessageMod {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/common/ConsoleMessage", "ConsoleMessage")
  @js.native
  open class ConsoleMessage protected () extends StObject {
    /**
      * @public
      */
    def this(
      `type`: ConsoleMessageType,
      text: String,
      args: js.Array[JSHandle[Any]],
      stackTraceLocations: js.Array[ConsoleMessageLocation]
    ) = this()
    
    /**
      * @returns An array of arguments passed to the console.
      */
    def args(): js.Array[JSHandle[Any]] = js.native
    
    /**
      * @returns The location of the console message.
      */
    def location(): ConsoleMessageLocation = js.native
    
    /* private */ var `private`: Any = js.native
    
    /**
      * @returns The array of locations on the stack of the console message.
      */
    def stackTrace(): js.Array[ConsoleMessageLocation] = js.native
    
    /**
      * @returns The text of the console message.
      */
    def text(): String = js.native
    
    /**
      * @returns The type of the console message.
      */
    def `type`(): ConsoleMessageType = js.native
  }
  
  trait ConsoleMessageLocation extends StObject {
    
    /**
      * 0-based column number in the resource if known or `undefined` otherwise.
      */
    var columnNumber: js.UndefOr[Double] = js.undefined
    
    /**
      * 0-based line number in the resource if known or `undefined` otherwise.
      */
    var lineNumber: js.UndefOr[Double] = js.undefined
    
    /**
      * URL of the resource if known or `undefined` otherwise.
      */
    var url: js.UndefOr[String] = js.undefined
  }
  object ConsoleMessageLocation {
    
    inline def apply(): ConsoleMessageLocation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConsoleMessageLocation]
    }
    
    extension [Self <: ConsoleMessageLocation](x: Self) {
      
      inline def setColumnNumber(value: Double): Self = StObject.set(x, "columnNumber", value.asInstanceOf[js.Any])
      
      inline def setColumnNumberUndefined: Self = StObject.set(x, "columnNumber", js.undefined)
      
      inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      inline def setLineNumberUndefined: Self = StObject.set(x, "lineNumber", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.puppeteerCore.puppeteerCoreStrings.log
    - typings.puppeteerCore.puppeteerCoreStrings.debug
    - typings.puppeteerCore.puppeteerCoreStrings.info
    - typings.puppeteerCore.puppeteerCoreStrings.error
    - typings.puppeteerCore.puppeteerCoreStrings.warning
    - typings.puppeteerCore.puppeteerCoreStrings.dir
    - typings.puppeteerCore.puppeteerCoreStrings.dirxml
    - typings.puppeteerCore.puppeteerCoreStrings.table
    - typings.puppeteerCore.puppeteerCoreStrings.trace
    - typings.puppeteerCore.puppeteerCoreStrings.clear_
    - typings.puppeteerCore.puppeteerCoreStrings.startGroup
    - typings.puppeteerCore.puppeteerCoreStrings.startGroupCollapsed
    - typings.puppeteerCore.puppeteerCoreStrings.endGroup
    - typings.puppeteerCore.puppeteerCoreStrings.assert
    - typings.puppeteerCore.puppeteerCoreStrings.profile
    - typings.puppeteerCore.puppeteerCoreStrings.profileEnd
    - typings.puppeteerCore.puppeteerCoreStrings.count
    - typings.puppeteerCore.puppeteerCoreStrings.timeEnd
    - typings.puppeteerCore.puppeteerCoreStrings.verbose
  */
  trait ConsoleMessageType extends StObject
  object ConsoleMessageType {
    
    inline def assert: typings.puppeteerCore.puppeteerCoreStrings.assert = "assert".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.assert]
    
    inline def clear: clear_ = "clear".asInstanceOf[clear_]
    
    inline def count: typings.puppeteerCore.puppeteerCoreStrings.count = "count".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.count]
    
    inline def debug: typings.puppeteerCore.puppeteerCoreStrings.debug = "debug".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.debug]
    
    inline def dir: typings.puppeteerCore.puppeteerCoreStrings.dir = "dir".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.dir]
    
    inline def dirxml: typings.puppeteerCore.puppeteerCoreStrings.dirxml = "dirxml".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.dirxml]
    
    inline def endGroup: typings.puppeteerCore.puppeteerCoreStrings.endGroup = "endGroup".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.endGroup]
    
    inline def error: typings.puppeteerCore.puppeteerCoreStrings.error = "error".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.error]
    
    inline def info: typings.puppeteerCore.puppeteerCoreStrings.info = "info".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.info]
    
    inline def log: typings.puppeteerCore.puppeteerCoreStrings.log = "log".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.log]
    
    inline def profile: typings.puppeteerCore.puppeteerCoreStrings.profile = "profile".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.profile]
    
    inline def profileEnd: typings.puppeteerCore.puppeteerCoreStrings.profileEnd = "profileEnd".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.profileEnd]
    
    inline def startGroup: typings.puppeteerCore.puppeteerCoreStrings.startGroup = "startGroup".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.startGroup]
    
    inline def startGroupCollapsed: typings.puppeteerCore.puppeteerCoreStrings.startGroupCollapsed = "startGroupCollapsed".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.startGroupCollapsed]
    
    inline def table: typings.puppeteerCore.puppeteerCoreStrings.table = "table".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.table]
    
    inline def timeEnd: typings.puppeteerCore.puppeteerCoreStrings.timeEnd = "timeEnd".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.timeEnd]
    
    inline def trace: typings.puppeteerCore.puppeteerCoreStrings.trace = "trace".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.trace]
    
    inline def verbose: typings.puppeteerCore.puppeteerCoreStrings.verbose = "verbose".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.verbose]
    
    inline def warning: typings.puppeteerCore.puppeteerCoreStrings.warning = "warning".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.warning]
  }
}
