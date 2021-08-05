package typings.pubnub.mod

import typings.pubnub.anon.CustomFields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSpaceParameters extends StObject {
  
  var include: js.UndefOr[CustomFields] = js.undefined
  
  var spaceId: String
}
object GetSpaceParameters {
  
  inline def apply(spaceId: String): GetSpaceParameters = {
    val __obj = js.Dynamic.literal(spaceId = spaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSpaceParameters]
  }
  
  extension [Self <: GetSpaceParameters](x: Self) {
    
    inline def setInclude(value: CustomFields): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setSpaceId(value: String): Self = StObject.set(x, "spaceId", value.asInstanceOf[js.Any])
  }
}
