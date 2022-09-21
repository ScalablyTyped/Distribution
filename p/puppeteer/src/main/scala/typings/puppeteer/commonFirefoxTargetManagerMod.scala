package typings.puppeteer

import typings.puppeteer.apiBrowserMod.TargetFilterCallback
import typings.puppeteer.commonTargetManagerMod.TargetFactory
import typings.puppeteer.commonTargetManagerMod.TargetInterceptor
import typings.puppeteer.commonTargetManagerMod.TargetManager
import typings.puppeteer.puppeteerCommonConnectionMod.CDPSession
import typings.puppeteer.puppeteerCommonConnectionMod.Connection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonFirefoxTargetManagerMod {
  
  @JSImport("puppeteer/lib/esm/puppeteer/common/FirefoxTargetManager", "FirefoxTargetManager")
  @js.native
  open class FirefoxTargetManager protected () extends TargetManager {
    def this(connection: Connection, targetFactory: TargetFactory) = this()
    def this(connection: Connection, targetFactory: TargetFactory, targetFilterCallback: TargetFilterCallback) = this()
    
    def addTargetInterceptor(client: Connection, interceptor: TargetInterceptor): Unit = js.native
    
    /* private */ var `private`: Any = js.native
    
    def removeSessionListeners(session: CDPSession): Unit = js.native
    
    def removeTargetInterceptor(client: Connection, interceptor: TargetInterceptor): Unit = js.native
    
    def setupAttachmentListeners(session: CDPSession): Unit = js.native
    def setupAttachmentListeners(session: Connection): Unit = js.native
  }
}
