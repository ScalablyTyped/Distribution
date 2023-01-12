package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// whereNow
trait WhereNowParameters extends StObject {
  
  var uuid: js.UndefOr[String] = js.undefined
}
object WhereNowParameters {
  
  inline def apply(): WhereNowParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WhereNowParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WhereNowParameters] (val x: Self) extends AnyVal {
    
    inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    inline def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
  }
}
