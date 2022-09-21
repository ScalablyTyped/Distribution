package typings.sentryNode.anon

import typings.sentryUtils.anon.Ip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@sentry/utils.@sentry/utils.AddRequestDataToEventOptions, 'deps'> */
trait OmitAddRequestDataToEvent extends StObject {
  
  var include: js.UndefOr[Ip] = js.undefined
}
object OmitAddRequestDataToEvent {
  
  inline def apply(): OmitAddRequestDataToEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitAddRequestDataToEvent]
  }
  
  extension [Self <: OmitAddRequestDataToEvent](x: Self) {
    
    inline def setInclude(value: Ip): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
  }
}
