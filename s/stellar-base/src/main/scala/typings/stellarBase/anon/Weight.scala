package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.SignerKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Weight extends StObject {
  
  var key: SignerKey = js.native
  
  var weight: Double = js.native
}
object Weight {
  
  @scala.inline
  def apply(key: SignerKey, weight: Double): Weight = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Weight]
  }
  
  @scala.inline
  implicit class WeightMutableBuilder[Self <: Weight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: SignerKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
  }
}
