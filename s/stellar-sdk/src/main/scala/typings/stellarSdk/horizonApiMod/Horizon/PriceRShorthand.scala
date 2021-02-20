package typings.stellarSdk.horizonApiMod.Horizon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PriceRShorthand extends StObject {
  
  var d: Double = js.native
  
  var n: Double = js.native
}
object PriceRShorthand {
  
  @scala.inline
  def apply(d: Double, n: Double): PriceRShorthand = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
    __obj.asInstanceOf[PriceRShorthand]
  }
  
  @scala.inline
  implicit class PriceRShorthandMutableBuilder[Self <: PriceRShorthand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setD(value: Double): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
  }
}
