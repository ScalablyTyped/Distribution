package typings.sentryTypes.typesEnvelopeMod

import typings.sentryTypes.sentryTypesStrings.replay_event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplayEventItemHeaders extends StObject {
  
  var `type`: replay_event
}
object ReplayEventItemHeaders {
  
  inline def apply(): ReplayEventItemHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("replay_event")
    __obj.asInstanceOf[ReplayEventItemHeaders]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplayEventItemHeaders] (val x: Self) extends AnyVal {
    
    inline def setType(value: replay_event): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
