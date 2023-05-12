package typings.recurlyRecurlyJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RedemptionCodes extends StObject {
  
  /**
    * The set of promotional codes entered into the payment sheet. Includes codes that have already been approved.
    */
  var redemptionCodes: js.Array[String]
}
object RedemptionCodes {
  
  inline def apply(redemptionCodes: js.Array[String]): RedemptionCodes = {
    val __obj = js.Dynamic.literal(redemptionCodes = redemptionCodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedemptionCodes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RedemptionCodes] (val x: Self) extends AnyVal {
    
    inline def setRedemptionCodes(value: js.Array[String]): Self = StObject.set(x, "redemptionCodes", value.asInstanceOf[js.Any])
    
    inline def setRedemptionCodesVarargs(value: String*): Self = StObject.set(x, "redemptionCodes", js.Array(value*))
  }
}
