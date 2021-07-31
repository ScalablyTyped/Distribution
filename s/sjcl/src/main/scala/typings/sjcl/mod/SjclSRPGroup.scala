package typings.sjcl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SjclSRPGroup extends StObject {
  
  var N: BigNumber
  
  var g: BigNumber
}
object SjclSRPGroup {
  
  @scala.inline
  def apply(N: BigNumber, g: BigNumber): SjclSRPGroup = {
    val __obj = js.Dynamic.literal(N = N.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any])
    __obj.asInstanceOf[SjclSRPGroup]
  }
  
  @scala.inline
  implicit class SjclSRPGroupMutableBuilder[Self <: SjclSRPGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setG(value: BigNumber): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setN(value: BigNumber): Self = StObject.set(x, "N", value.asInstanceOf[js.Any])
  }
}
