package typings.puppeteerCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmPuppeteerCommonTimeoutSettingsMod {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/common/TimeoutSettings", "TimeoutSettings")
  @js.native
  open class TimeoutSettings () extends StObject {
    
    def navigationTimeout(): Double = js.native
    
    /* private */ var `private`: Any = js.native
    
    def setDefaultNavigationTimeout(timeout: Double): Unit = js.native
    
    def setDefaultTimeout(timeout: Double): Unit = js.native
    
    def timeout(): Double = js.native
  }
}
