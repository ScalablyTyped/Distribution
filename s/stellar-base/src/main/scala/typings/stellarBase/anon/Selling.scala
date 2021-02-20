package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.Int64
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Selling extends StObject {
  
  var buying: Int64 = js.native
  
  var selling: Int64 = js.native
}
object Selling {
  
  @scala.inline
  def apply(buying: Int64, selling: Int64): Selling = {
    val __obj = js.Dynamic.literal(buying = buying.asInstanceOf[js.Any], selling = selling.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selling]
  }
  
  @scala.inline
  implicit class SellingMutableBuilder[Self <: Selling] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuying(value: Int64): Self = StObject.set(x, "buying", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelling(value: Int64): Self = StObject.set(x, "selling", value.asInstanceOf[js.Any])
  }
}
