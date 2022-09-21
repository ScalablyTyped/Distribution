package typings.puppeteerCore

import typings.puppeteerCore.browserMod.TargetFilterCallback
import typings.puppeteerCore.commonConnectionMod.Connection
import typings.puppeteerCore.targetManagerMod.TargetFactory
import typings.puppeteerCore.targetManagerMod.TargetInterceptor
import typings.puppeteerCore.targetManagerMod.TargetManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chromeTargetManagerMod {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/common/ChromeTargetManager", "ChromeTargetManager")
  @js.native
  open class ChromeTargetManager protected () extends TargetManager {
    def this(connection: Connection, targetFactory: TargetFactory) = this()
    def this(connection: Connection, targetFactory: TargetFactory, targetFilterCallback: TargetFilterCallback) = this()
    
    def addTargetInterceptor(session: Connection, interceptor: TargetInterceptor): Unit = js.native
    
    /* private */ var `private`: Any = js.native
    
    def removeTargetInterceptor(client: Connection, interceptor: TargetInterceptor): Unit = js.native
  }
}
