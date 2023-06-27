package typings.sentryReplay.typesTypesReplayMod

import typings.sentryTypes.typesBreadcrumbMod.FetchBreadcrumbHint
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FetchHint
  extends StObject
     with FetchBreadcrumbHint {
  
  @JSName("response")
  var response_FetchHint: Response
}
object FetchHint {
  
  inline def apply(endTimestamp: Double, input: js.Array[Any], response: Response, startTimestamp: Double): FetchHint = {
    val __obj = js.Dynamic.literal(endTimestamp = endTimestamp.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], startTimestamp = startTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchHint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FetchHint] (val x: Self) extends AnyVal {
    
    inline def setResponse(value: Response): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
