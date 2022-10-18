package typings.snyk.anon

import typings.snyk.distLibSnykTestLegacyMod.TestDepGraphResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BinariesVulns extends StObject {
  
  var baseImage: js.UndefOr[Any] = js.undefined
  
  var binariesVulns: js.UndefOr[TestDepGraphResult] = js.undefined
}
object BinariesVulns {
  
  inline def apply(): BinariesVulns = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BinariesVulns]
  }
  
  extension [Self <: BinariesVulns](x: Self) {
    
    inline def setBaseImage(value: Any): Self = StObject.set(x, "baseImage", value.asInstanceOf[js.Any])
    
    inline def setBaseImageUndefined: Self = StObject.set(x, "baseImage", js.undefined)
    
    inline def setBinariesVulns(value: TestDepGraphResult): Self = StObject.set(x, "binariesVulns", value.asInstanceOf[js.Any])
    
    inline def setBinariesVulnsUndefined: Self = StObject.set(x, "binariesVulns", js.undefined)
  }
}
