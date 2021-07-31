package typings.puppeteerCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timeoutSettingsMod {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/common/TimeoutSettings", "TimeoutSettings")
  @js.native
  class TimeoutSettings () extends StObject {
    
    var _defaultNavigationTimeout: Double | Null = js.native
    
    var _defaultTimeout: Double | Null = js.native
    
    def navigationTimeout(): Double = js.native
    
    def setDefaultNavigationTimeout(timeout: Double): Unit = js.native
    
    def setDefaultTimeout(timeout: Double): Unit = js.native
    
    def timeout(): Double = js.native
  }
}
