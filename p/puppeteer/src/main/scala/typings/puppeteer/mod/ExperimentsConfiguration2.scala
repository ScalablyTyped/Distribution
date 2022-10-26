package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines experiment options for Puppeteer.
  *
  * See individual properties for more information.
  *
  * @public
  */
trait ExperimentsConfiguration2 extends StObject {
  
  /**
    * Require Puppeteer to download Chromium for Apple M1.
    *
    * On Apple M1 devices Puppeteer by default downloads the version for
    * Intel's processor which runs via Rosetta. It works without any problems,
    * however, with this option, you should get more efficient resource usage
    * (CPU and RAM) that could lead to a faster execution time.
    *
    * Can be overridden by `PUPPETEER_EXPERIMENTAL_CHROMIUM_MAC_ARM`.
    *
    * @defaultValue `false`
    */
  var macArmChromiumEnabled: js.UndefOr[Boolean] = js.undefined
}
object ExperimentsConfiguration2 {
  
  inline def apply(): ExperimentsConfiguration2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExperimentsConfiguration2]
  }
  
  extension [Self <: ExperimentsConfiguration2](x: Self) {
    
    inline def setMacArmChromiumEnabled(value: Boolean): Self = StObject.set(x, "macArmChromiumEnabled", value.asInstanceOf[js.Any])
    
    inline def setMacArmChromiumEnabledUndefined: Self = StObject.set(x, "macArmChromiumEnabled", js.undefined)
  }
}
