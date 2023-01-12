package typings.sdpTransform.anon

import typings.sdpTransform.sdpTransformStrings.AS
import typings.sdpTransform.sdpTransformStrings.CT
import typings.sdpTransform.sdpTransformStrings.RR
import typings.sdpTransform.sdpTransformStrings.RS
import typings.sdpTransform.sdpTransformStrings.TIAS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Limit extends StObject {
  
  var limit: Double | String
  
  var `type`: TIAS | AS | CT | RR | RS
}
object Limit {
  
  inline def apply(limit: Double | String, `type`: TIAS | AS | CT | RR | RS): Limit = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Limit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Limit] (val x: Self) extends AnyVal {
    
    inline def setLimit(value: Double | String): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setType(value: TIAS | AS | CT | RR | RS): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
