package typings.sentryTypes.typesEnvelopeMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseEnvelopeItemHeaders
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var length: js.UndefOr[Double] = js.undefined
  
  var `type`: EnvelopeItemType
}
object BaseEnvelopeItemHeaders {
  
  inline def apply(`type`: EnvelopeItemType): BaseEnvelopeItemHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseEnvelopeItemHeaders]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseEnvelopeItemHeaders] (val x: Self) extends AnyVal {
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setType(value: EnvelopeItemType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
