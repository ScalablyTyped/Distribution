package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildV2
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var creation_time: js.UndefOr[String] = js.undefined
  
  var deletion_time: js.UndefOr[String] = js.undefined
  
  var end_time: js.UndefOr[String] = js.undefined
  
  var group_id: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var jobs: js.UndefOr[JobsState] = js.undefined
  
  var modification_time: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var org_id: js.UndefOr[String] = js.undefined
  
  var owner_id: js.UndefOr[String] = js.undefined
  
  var passed: js.UndefOr[Boolean] = js.undefined
  
  var public: js.UndefOr[Boolean] = js.undefined
  
  var run: js.UndefOr[Double] = js.undefined
  
  var start_time: js.UndefOr[Double] = js.undefined
  
  var status: js.UndefOr[String] = js.undefined
  
  var team_id: js.UndefOr[String] = js.undefined
}
object BuildV2 {
  
  inline def apply(): BuildV2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildV2]
  }
  
  extension [Self <: BuildV2](x: Self) {
    
    inline def setCreation_time(value: String): Self = StObject.set(x, "creation_time", value.asInstanceOf[js.Any])
    
    inline def setCreation_timeUndefined: Self = StObject.set(x, "creation_time", js.undefined)
    
    inline def setDeletion_time(value: String): Self = StObject.set(x, "deletion_time", value.asInstanceOf[js.Any])
    
    inline def setDeletion_timeUndefined: Self = StObject.set(x, "deletion_time", js.undefined)
    
    inline def setEnd_time(value: String): Self = StObject.set(x, "end_time", value.asInstanceOf[js.Any])
    
    inline def setEnd_timeUndefined: Self = StObject.set(x, "end_time", js.undefined)
    
    inline def setGroup_id(value: String): Self = StObject.set(x, "group_id", value.asInstanceOf[js.Any])
    
    inline def setGroup_idUndefined: Self = StObject.set(x, "group_id", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setJobs(value: JobsState): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    inline def setJobsUndefined: Self = StObject.set(x, "jobs", js.undefined)
    
    inline def setModification_time(value: String): Self = StObject.set(x, "modification_time", value.asInstanceOf[js.Any])
    
    inline def setModification_timeUndefined: Self = StObject.set(x, "modification_time", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOrg_id(value: String): Self = StObject.set(x, "org_id", value.asInstanceOf[js.Any])
    
    inline def setOrg_idUndefined: Self = StObject.set(x, "org_id", js.undefined)
    
    inline def setOwner_id(value: String): Self = StObject.set(x, "owner_id", value.asInstanceOf[js.Any])
    
    inline def setOwner_idUndefined: Self = StObject.set(x, "owner_id", js.undefined)
    
    inline def setPassed(value: Boolean): Self = StObject.set(x, "passed", value.asInstanceOf[js.Any])
    
    inline def setPassedUndefined: Self = StObject.set(x, "passed", js.undefined)
    
    inline def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    
    inline def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
    
    inline def setRun(value: Double): Self = StObject.set(x, "run", value.asInstanceOf[js.Any])
    
    inline def setRunUndefined: Self = StObject.set(x, "run", js.undefined)
    
    inline def setStart_time(value: Double): Self = StObject.set(x, "start_time", value.asInstanceOf[js.Any])
    
    inline def setStart_timeUndefined: Self = StObject.set(x, "start_time", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTeam_id(value: String): Self = StObject.set(x, "team_id", value.asInstanceOf[js.Any])
    
    inline def setTeam_idUndefined: Self = StObject.set(x, "team_id", js.undefined)
  }
}
