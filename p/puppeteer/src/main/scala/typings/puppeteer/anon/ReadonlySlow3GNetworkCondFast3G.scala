package typings.puppeteer.anon

import typings.puppeteer.commonNetworkManagerMod.NetworkConditions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  Slow 3G :puppeteer.puppeteer/lib/esm/puppeteer/common/NetworkManager.NetworkConditions,   Fast 3G :puppeteer.puppeteer/lib/esm/puppeteer/common/NetworkManager.NetworkConditions}> */
trait ReadonlySlow3GNetworkCondFast3G extends StObject {
  
  val `Fast 3G`: NetworkConditions
  
  val `Slow 3G`: NetworkConditions
}
object ReadonlySlow3GNetworkCondFast3G {
  
  inline def apply(`Fast 3G`: NetworkConditions, `Slow 3G`: NetworkConditions): ReadonlySlow3GNetworkCondFast3G = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Fast 3G")((`Fast 3G`).asInstanceOf[js.Any])
    __obj.updateDynamic("Slow 3G")((`Slow 3G`).asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlySlow3GNetworkCondFast3G]
  }
  
  extension [Self <: ReadonlySlow3GNetworkCondFast3G](x: Self) {
    
    inline def `setFast 3G`(value: NetworkConditions): Self = StObject.set(x, "Fast 3G", value.asInstanceOf[js.Any])
    
    inline def `setSlow 3G`(value: NetworkConditions): Self = StObject.set(x, "Slow 3G", value.asInstanceOf[js.Any])
  }
}
