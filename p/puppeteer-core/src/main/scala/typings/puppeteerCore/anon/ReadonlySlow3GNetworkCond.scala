package typings.puppeteerCore.anon

import typings.puppeteerCore.networkManagerMod.NetworkConditions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  Slow 3G :puppeteer-core.puppeteer-core/lib/cjs/puppeteer/common/NetworkManager.NetworkConditions,   Fast 3G :puppeteer-core.puppeteer-core/lib/cjs/puppeteer/common/NetworkManager.NetworkConditions}> */
trait ReadonlySlow3GNetworkCond extends StObject {
  
  val `Fast 3G`: NetworkConditions
  
  val `Slow 3G`: NetworkConditions
}
object ReadonlySlow3GNetworkCond {
  
  inline def apply(`Fast 3G`: NetworkConditions, `Slow 3G`: NetworkConditions): ReadonlySlow3GNetworkCond = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Fast 3G")((`Fast 3G`).asInstanceOf[js.Any])
    __obj.updateDynamic("Slow 3G")((`Slow 3G`).asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlySlow3GNetworkCond]
  }
  
  extension [Self <: ReadonlySlow3GNetworkCond](x: Self) {
    
    inline def `setFast 3G`(value: NetworkConditions): Self = StObject.set(x, "Fast 3G", value.asInstanceOf[js.Any])
    
    inline def `setSlow 3G`(value: NetworkConditions): Self = StObject.set(x, "Slow 3G", value.asInstanceOf[js.Any])
  }
}
