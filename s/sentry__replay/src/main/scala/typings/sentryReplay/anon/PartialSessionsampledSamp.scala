package typings.sentryReplay.anon

import typings.sentryReplay.typesTypesReplayMod.Sampled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@sentry/replay.@sentry/replay/types/types.Session> & {  sampled :@sentry/replay.@sentry/replay/types/types.Sampled} */
trait PartialSessionsampledSamp extends StObject {
  
  var id: js.UndefOr[String] = js.undefined
  
  var lastActivity: js.UndefOr[Double] = js.undefined
  
  var previousSessionId: js.UndefOr[String] = js.undefined
  
  var sampled: js.UndefOr[Sampled] = js.undefined
  
  var segmentId: js.UndefOr[Double] = js.undefined
  
  var shouldRefresh: js.UndefOr[Boolean] = js.undefined
  
  var started: js.UndefOr[Double] = js.undefined
}
object PartialSessionsampledSamp {
  
  inline def apply(): PartialSessionsampledSamp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSessionsampledSamp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialSessionsampledSamp] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLastActivity(value: Double): Self = StObject.set(x, "lastActivity", value.asInstanceOf[js.Any])
    
    inline def setLastActivityUndefined: Self = StObject.set(x, "lastActivity", js.undefined)
    
    inline def setPreviousSessionId(value: String): Self = StObject.set(x, "previousSessionId", value.asInstanceOf[js.Any])
    
    inline def setPreviousSessionIdUndefined: Self = StObject.set(x, "previousSessionId", js.undefined)
    
    inline def setSampled(value: Sampled): Self = StObject.set(x, "sampled", value.asInstanceOf[js.Any])
    
    inline def setSampledUndefined: Self = StObject.set(x, "sampled", js.undefined)
    
    inline def setSegmentId(value: Double): Self = StObject.set(x, "segmentId", value.asInstanceOf[js.Any])
    
    inline def setSegmentIdUndefined: Self = StObject.set(x, "segmentId", js.undefined)
    
    inline def setShouldRefresh(value: Boolean): Self = StObject.set(x, "shouldRefresh", value.asInstanceOf[js.Any])
    
    inline def setShouldRefreshUndefined: Self = StObject.set(x, "shouldRefresh", js.undefined)
    
    inline def setStarted(value: Double): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
    
    inline def setStartedUndefined: Self = StObject.set(x, "started", js.undefined)
  }
}
