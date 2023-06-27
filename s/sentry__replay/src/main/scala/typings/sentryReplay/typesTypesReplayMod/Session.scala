package typings.sentryReplay.typesTypesReplayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Session extends StObject {
  
  var id: String
  
  /**
    * Last known activity of the session (in ms)
    */
  var lastActivity: Double
  
  /**
    * The ID of the previous session.
    * If this is empty, there was no previous session.
    */
  var previousSessionId: js.UndefOr[String] = js.undefined
  
  /**
    * Is the session sampled? `false` if not sampled, otherwise, `session` or `buffer`
    */
  var sampled: Sampled
  
  /**
    * Segment ID for replay events
    */
  var segmentId: Double
  
  /**
    * If this is false, the session should not be refreshed when it was inactive.
    * This can be the case if you had a buffered session which is now recording because an error happened.
    */
  var shouldRefresh: Boolean
  
  /**
    * Start time of current session (in ms)
    */
  var started: Double
}
object Session {
  
  inline def apply(
    id: String,
    lastActivity: Double,
    sampled: Sampled,
    segmentId: Double,
    shouldRefresh: Boolean,
    started: Double
  ): Session = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], lastActivity = lastActivity.asInstanceOf[js.Any], sampled = sampled.asInstanceOf[js.Any], segmentId = segmentId.asInstanceOf[js.Any], shouldRefresh = shouldRefresh.asInstanceOf[js.Any], started = started.asInstanceOf[js.Any])
    __obj.asInstanceOf[Session]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Session] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastActivity(value: Double): Self = StObject.set(x, "lastActivity", value.asInstanceOf[js.Any])
    
    inline def setPreviousSessionId(value: String): Self = StObject.set(x, "previousSessionId", value.asInstanceOf[js.Any])
    
    inline def setPreviousSessionIdUndefined: Self = StObject.set(x, "previousSessionId", js.undefined)
    
    inline def setSampled(value: Sampled): Self = StObject.set(x, "sampled", value.asInstanceOf[js.Any])
    
    inline def setSegmentId(value: Double): Self = StObject.set(x, "segmentId", value.asInstanceOf[js.Any])
    
    inline def setShouldRefresh(value: Boolean): Self = StObject.set(x, "shouldRefresh", value.asInstanceOf[js.Any])
    
    inline def setStarted(value: Double): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
  }
}
