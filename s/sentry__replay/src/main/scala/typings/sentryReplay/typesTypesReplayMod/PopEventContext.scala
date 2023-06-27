package typings.sentryReplay.typesTypesReplayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopEventContext
  extends StObject
     with CommonEventContext {
  
  /**
    * List of Sentry error ids that have occurred during a replay segment
    */
  var errorIds: js.Array[String]
  
  /**
    * List of Sentry trace ids that have occurred during a replay segment
    */
  var traceIds: js.Array[String]
}
object PopEventContext {
  
  inline def apply(
    errorIds: js.Array[String],
    initialTimestamp: Double,
    initialUrl: String,
    traceIds: js.Array[String],
    urls: js.Array[String]
  ): PopEventContext = {
    val __obj = js.Dynamic.literal(errorIds = errorIds.asInstanceOf[js.Any], initialTimestamp = initialTimestamp.asInstanceOf[js.Any], initialUrl = initialUrl.asInstanceOf[js.Any], traceIds = traceIds.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopEventContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PopEventContext] (val x: Self) extends AnyVal {
    
    inline def setErrorIds(value: js.Array[String]): Self = StObject.set(x, "errorIds", value.asInstanceOf[js.Any])
    
    inline def setErrorIdsVarargs(value: String*): Self = StObject.set(x, "errorIds", js.Array(value*))
    
    inline def setTraceIds(value: js.Array[String]): Self = StObject.set(x, "traceIds", value.asInstanceOf[js.Any])
    
    inline def setTraceIdsVarargs(value: String*): Self = StObject.set(x, "traceIds", js.Array(value*))
  }
}
