package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.saucelabs.anon.Completed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Build
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var creation_time: js.UndefOr[Double] = js.undefined
  
  var deletion_time: js.UndefOr[Double] = js.undefined
  
  var end_time: js.UndefOr[Double] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var jobs: js.UndefOr[Completed] = js.undefined
  
  var modification_time: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var number: js.UndefOr[Double] = js.undefined
  
  var owner: js.UndefOr[String] = js.undefined
  
  var passed: js.UndefOr[Boolean] = js.undefined
  
  var prefix: js.UndefOr[String] = js.undefined
  
  var public: js.UndefOr[Boolean] = js.undefined
  
  var run: js.UndefOr[Double] = js.undefined
  
  var start_time: js.UndefOr[Double] = js.undefined
  
  var status: js.UndefOr[String] = js.undefined
}
object Build {
  
  @scala.inline
  def apply(): Build = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Build]
  }
  
  @scala.inline
  implicit class BuildMutableBuilder[Self <: Build] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreation_time(value: Double): Self = StObject.set(x, "creation_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreation_timeUndefined: Self = StObject.set(x, "creation_time", js.undefined)
    
    @scala.inline
    def setDeletion_time(value: Double): Self = StObject.set(x, "deletion_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletion_timeUndefined: Self = StObject.set(x, "deletion_time", js.undefined)
    
    @scala.inline
    def setEnd_time(value: Double): Self = StObject.set(x, "end_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd_timeUndefined: Self = StObject.set(x, "end_time", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setJobs(value: Completed): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobsUndefined: Self = StObject.set(x, "jobs", js.undefined)
    
    @scala.inline
    def setModification_time(value: Double): Self = StObject.set(x, "modification_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModification_timeUndefined: Self = StObject.set(x, "modification_time", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setPassed(value: Boolean): Self = StObject.set(x, "passed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassedUndefined: Self = StObject.set(x, "passed", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    @scala.inline
    def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
    
    @scala.inline
    def setRun(value: Double): Self = StObject.set(x, "run", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunUndefined: Self = StObject.set(x, "run", js.undefined)
    
    @scala.inline
    def setStart_time(value: Double): Self = StObject.set(x, "start_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_timeUndefined: Self = StObject.set(x, "start_time", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
