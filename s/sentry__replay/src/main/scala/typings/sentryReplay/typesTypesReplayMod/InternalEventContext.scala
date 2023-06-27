package typings.sentryReplay.typesTypesReplayMod

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InternalEventContext
  extends StObject
     with CommonEventContext {
  
  /**
    * Set of Sentry error ids that have occurred during a replay segment
    */
  var errorIds: Set[String]
  
  /**
    * Set of Sentry trace ids that have occurred during a replay segment
    */
  var traceIds: Set[String]
}
object InternalEventContext {
  
  inline def apply(
    errorIds: Set[String],
    initialTimestamp: Double,
    initialUrl: String,
    traceIds: Set[String],
    urls: js.Array[String]
  ): InternalEventContext = {
    val __obj = js.Dynamic.literal(errorIds = errorIds.asInstanceOf[js.Any], initialTimestamp = initialTimestamp.asInstanceOf[js.Any], initialUrl = initialUrl.asInstanceOf[js.Any], traceIds = traceIds.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalEventContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InternalEventContext] (val x: Self) extends AnyVal {
    
    inline def setErrorIds(value: Set[String]): Self = StObject.set(x, "errorIds", value.asInstanceOf[js.Any])
    
    inline def setTraceIds(value: Set[String]): Self = StObject.set(x, "traceIds", value.asInstanceOf[js.Any])
  }
}
