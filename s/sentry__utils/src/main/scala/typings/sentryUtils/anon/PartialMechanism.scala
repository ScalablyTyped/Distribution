package typings.sentryUtils.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@sentry/types.@sentry/types.Mechanism> */
trait PartialMechanism extends StObject {
  
  var data: js.UndefOr[StringDictionary[String | Boolean]] = js.undefined
  
  var handled: js.UndefOr[Boolean] = js.undefined
  
  var synthetic: js.UndefOr[Boolean] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object PartialMechanism {
  
  inline def apply(): PartialMechanism = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMechanism]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialMechanism] (val x: Self) extends AnyVal {
    
    inline def setData(value: StringDictionary[String | Boolean]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
    
    inline def setHandledUndefined: Self = StObject.set(x, "handled", js.undefined)
    
    inline def setSynthetic(value: Boolean): Self = StObject.set(x, "synthetic", value.asInstanceOf[js.Any])
    
    inline def setSyntheticUndefined: Self = StObject.set(x, "synthetic", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
