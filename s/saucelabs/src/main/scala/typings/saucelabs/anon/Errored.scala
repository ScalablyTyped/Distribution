package typings.saucelabs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Errored extends StObject {
  
  var completed: js.UndefOr[Boolean] = js.undefined
  
  var errored: js.UndefOr[String] = js.undefined
  
  var failed: js.UndefOr[String] = js.undefined
  
  var faulty: js.UndefOr[Boolean] = js.undefined
  
  var finished: js.UndefOr[String] = js.undefined
  
  var groupId: js.UndefOr[String] = js.undefined
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var modifiedSince: js.UndefOr[String] = js.undefined
  
  var `new`: js.UndefOr[String] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var orgId: js.UndefOr[String] = js.undefined
  
  var passed: js.UndefOr[String] = js.undefined
  
  var public: js.UndefOr[Boolean] = js.undefined
  
  var queued: js.UndefOr[Boolean] = js.undefined
  
  var running: js.UndefOr[Boolean] = js.undefined
  
  var teamId: js.UndefOr[String] = js.undefined
  
  var userId: js.UndefOr[String] = js.undefined
}
object Errored {
  
  inline def apply(): Errored = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Errored]
  }
  
  extension [Self <: Errored](x: Self) {
    
    inline def setCompleted(value: Boolean): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
    
    inline def setCompletedUndefined: Self = StObject.set(x, "completed", js.undefined)
    
    inline def setErrored(value: String): Self = StObject.set(x, "errored", value.asInstanceOf[js.Any])
    
    inline def setErroredUndefined: Self = StObject.set(x, "errored", js.undefined)
    
    inline def setFailed(value: String): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    inline def setFailedUndefined: Self = StObject.set(x, "failed", js.undefined)
    
    inline def setFaulty(value: Boolean): Self = StObject.set(x, "faulty", value.asInstanceOf[js.Any])
    
    inline def setFaultyUndefined: Self = StObject.set(x, "faulty", js.undefined)
    
    inline def setFinished(value: String): Self = StObject.set(x, "finished", value.asInstanceOf[js.Any])
    
    inline def setFinishedUndefined: Self = StObject.set(x, "finished", js.undefined)
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setModifiedSince(value: String): Self = StObject.set(x, "modifiedSince", value.asInstanceOf[js.Any])
    
    inline def setModifiedSinceUndefined: Self = StObject.set(x, "modifiedSince", js.undefined)
    
    inline def setNew(value: String): Self = StObject.set(x, "new", value.asInstanceOf[js.Any])
    
    inline def setNewUndefined: Self = StObject.set(x, "new", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOrgId(value: String): Self = StObject.set(x, "orgId", value.asInstanceOf[js.Any])
    
    inline def setOrgIdUndefined: Self = StObject.set(x, "orgId", js.undefined)
    
    inline def setPassed(value: String): Self = StObject.set(x, "passed", value.asInstanceOf[js.Any])
    
    inline def setPassedUndefined: Self = StObject.set(x, "passed", js.undefined)
    
    inline def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    
    inline def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
    
    inline def setQueued(value: Boolean): Self = StObject.set(x, "queued", value.asInstanceOf[js.Any])
    
    inline def setQueuedUndefined: Self = StObject.set(x, "queued", js.undefined)
    
    inline def setRunning(value: Boolean): Self = StObject.set(x, "running", value.asInstanceOf[js.Any])
    
    inline def setRunningUndefined: Self = StObject.set(x, "running", js.undefined)
    
    inline def setTeamId(value: String): Self = StObject.set(x, "teamId", value.asInstanceOf[js.Any])
    
    inline def setTeamIdUndefined: Self = StObject.set(x, "teamId", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
