package typings.sjcl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SjclSRPGroup extends StObject {
  
  var N: BigNumber
  
  var g: BigNumber
}
object SjclSRPGroup {
  
  inline def apply(N: BigNumber, g: BigNumber): SjclSRPGroup = {
    val __obj = js.Dynamic.literal(N = N.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any])
    __obj.asInstanceOf[SjclSRPGroup]
  }
  
  extension [Self <: SjclSRPGroup](x: Self) {
    
    inline def setG(value: BigNumber): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
    
    inline def setN(value: BigNumber): Self = StObject.set(x, "N", value.asInstanceOf[js.Any])
  }
}
