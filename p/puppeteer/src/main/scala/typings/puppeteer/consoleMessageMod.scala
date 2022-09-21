package typings.puppeteer

import typings.puppeteer.jshandleMod.JSHandle
import typings.puppeteer.puppeteerStrings.clear_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object consoleMessageMod {
  
  @JSImport("puppeteer/lib/cjs/puppeteer/common/ConsoleMessage", "ConsoleMessage")
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
    - typings.puppeteer.puppeteerStrings.log
    - typings.puppeteer.puppeteerStrings.debug
    - typings.puppeteer.puppeteerStrings.info
    - typings.puppeteer.puppeteerStrings.error
    - typings.puppeteer.puppeteerStrings.warning
    - typings.puppeteer.puppeteerStrings.dir
    - typings.puppeteer.puppeteerStrings.dirxml
    - typings.puppeteer.puppeteerStrings.table
    - typings.puppeteer.puppeteerStrings.trace
    - typings.puppeteer.puppeteerStrings.clear_
    - typings.puppeteer.puppeteerStrings.startGroup
    - typings.puppeteer.puppeteerStrings.startGroupCollapsed
    - typings.puppeteer.puppeteerStrings.endGroup
    - typings.puppeteer.puppeteerStrings.assert
    - typings.puppeteer.puppeteerStrings.profile
    - typings.puppeteer.puppeteerStrings.profileEnd
    - typings.puppeteer.puppeteerStrings.count
    - typings.puppeteer.puppeteerStrings.timeEnd
    - typings.puppeteer.puppeteerStrings.verbose
  */
  trait ConsoleMessageType extends StObject
  object ConsoleMessageType {
    
    inline def assert: typings.puppeteer.puppeteerStrings.assert = "assert".asInstanceOf[typings.puppeteer.puppeteerStrings.assert]
    
    inline def clear: clear_ = "clear".asInstanceOf[clear_]
    
    inline def count: typings.puppeteer.puppeteerStrings.count = "count".asInstanceOf[typings.puppeteer.puppeteerStrings.count]
    
    inline def debug: typings.puppeteer.puppeteerStrings.debug = "debug".asInstanceOf[typings.puppeteer.puppeteerStrings.debug]
    
    inline def dir: typings.puppeteer.puppeteerStrings.dir = "dir".asInstanceOf[typings.puppeteer.puppeteerStrings.dir]
    
    inline def dirxml: typings.puppeteer.puppeteerStrings.dirxml = "dirxml".asInstanceOf[typings.puppeteer.puppeteerStrings.dirxml]
    
    inline def endGroup: typings.puppeteer.puppeteerStrings.endGroup = "endGroup".asInstanceOf[typings.puppeteer.puppeteerStrings.endGroup]
    
    inline def error: typings.puppeteer.puppeteerStrings.error = "error".asInstanceOf[typings.puppeteer.puppeteerStrings.error]
    
    inline def info: typings.puppeteer.puppeteerStrings.info = "info".asInstanceOf[typings.puppeteer.puppeteerStrings.info]
    
    inline def log: typings.puppeteer.puppeteerStrings.log = "log".asInstanceOf[typings.puppeteer.puppeteerStrings.log]
    
    inline def profile: typings.puppeteer.puppeteerStrings.profile = "profile".asInstanceOf[typings.puppeteer.puppeteerStrings.profile]
    
    inline def profileEnd: typings.puppeteer.puppeteerStrings.profileEnd = "profileEnd".asInstanceOf[typings.puppeteer.puppeteerStrings.profileEnd]
    
    inline def startGroup: typings.puppeteer.puppeteerStrings.startGroup = "startGroup".asInstanceOf[typings.puppeteer.puppeteerStrings.startGroup]
    
    inline def startGroupCollapsed: typings.puppeteer.puppeteerStrings.startGroupCollapsed = "startGroupCollapsed".asInstanceOf[typings.puppeteer.puppeteerStrings.startGroupCollapsed]
    
    inline def table: typings.puppeteer.puppeteerStrings.table = "table".asInstanceOf[typings.puppeteer.puppeteerStrings.table]
    
    inline def timeEnd: typings.puppeteer.puppeteerStrings.timeEnd = "timeEnd".asInstanceOf[typings.puppeteer.puppeteerStrings.timeEnd]
    
    inline def trace: typings.puppeteer.puppeteerStrings.trace = "trace".asInstanceOf[typings.puppeteer.puppeteerStrings.trace]
    
    inline def verbose: typings.puppeteer.puppeteerStrings.verbose = "verbose".asInstanceOf[typings.puppeteer.puppeteerStrings.verbose]
    
    inline def warning: typings.puppeteer.puppeteerStrings.warning = "warning".asInstanceOf[typings.puppeteer.puppeteerStrings.warning]
  }
}
