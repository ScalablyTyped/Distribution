package typings.puppeteerCore

import typings.puppeteerCore.anon.PreferredRevision
import typings.puppeteerCore.commonConnectionMod.Connection
import typings.puppeteerCore.nodeLaunchOptionsMod.LaunchOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeBrowserRunnerMod {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/node/BrowserRunner", "BrowserRunner")
  @js.native
  class BrowserRunner protected () extends StObject {
    def this(executablePath: String, processArguments: js.Array[String]) = this()
    def this(executablePath: String, processArguments: js.Array[String], tempDirectory: String) = this()
    
    /* private */ var _closed: js.Any = js.native
    
    /* private */ var _executablePath: js.Any = js.native
    
    /* private */ var _listeners: js.Any = js.native
    
    /* private */ var _processArguments: js.Any = js.native
    
    /* private */ var _processClosing: js.Any = js.native
    
    /* private */ var _tempDirectory: js.Any = js.native
    
    def close(): js.Promise[Unit] = js.native
    
    var connection: js.Any = js.native
    
    def kill(): Unit = js.native
    
    var proc: js.Any = js.native
    
    def setupConnection(options: PreferredRevision): js.Promise[Connection] = js.native
    
    def start(options: LaunchOptions): Unit = js.native
  }
}
