package typings.sharp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrategyEnum extends StObject {
  
  var attention: Double = js.native
  
  var entropy: Double = js.native
}
object StrategyEnum {
  
  @scala.inline
  def apply(attention: Double, entropy: Double): StrategyEnum = {
    val __obj = js.Dynamic.literal(attention = attention.asInstanceOf[js.Any], entropy = entropy.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrategyEnum]
  }
  
  @scala.inline
  implicit class StrategyEnumMutableBuilder[Self <: StrategyEnum] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttention(value: Double): Self = StObject.set(x, "attention", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntropy(value: Double): Self = StObject.set(x, "entropy", value.asInstanceOf[js.Any])
  }
}
