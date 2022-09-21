package typings.puppeteer.anon

import typings.puppeteer.mod.NetworkConditions_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  Slow 3G :puppeteer.puppeteer.NetworkConditions,   Fast 3G :puppeteer.puppeteer.NetworkConditions}> */
trait ReadonlySlow3GNetworkCondSlow3G extends StObject {
  
  val `Fast 3G`: NetworkConditions_
  
  val `Slow 3G`: NetworkConditions_
}
object ReadonlySlow3GNetworkCondSlow3G {
  
  inline def apply(`Fast 3G`: NetworkConditions_, `Slow 3G`: NetworkConditions_): ReadonlySlow3GNetworkCondSlow3G = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Fast 3G")((`Fast 3G`).asInstanceOf[js.Any])
    __obj.updateDynamic("Slow 3G")((`Slow 3G`).asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlySlow3GNetworkCondSlow3G]
  }
  
  extension [Self <: ReadonlySlow3GNetworkCondSlow3G](x: Self) {
    
    inline def `setFast 3G`(value: NetworkConditions_): Self = StObject.set(x, "Fast 3G", value.asInstanceOf[js.Any])
    
    inline def `setSlow 3G`(value: NetworkConditions_): Self = StObject.set(x, "Slow 3G", value.asInstanceOf[js.Any])
  }
}
