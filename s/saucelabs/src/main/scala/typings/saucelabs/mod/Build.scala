package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.saucelabs.anon.Completed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Build
  extends /* key */ StringDictionary[js.Any] {
  
  var creation_time: js.UndefOr[Double] = js.native
  
  var deletion_time: js.UndefOr[Double] = js.native
  
  var end_time: js.UndefOr[Double] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var jobs: js.UndefOr[Completed] = js.native
  
  var modification_time: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var number: js.UndefOr[Double] = js.native
  
  var owner: js.UndefOr[String] = js.native
  
  var passed: js.UndefOr[Boolean] = js.native
  
  var prefix: js.UndefOr[String] = js.native
  
  var public: js.UndefOr[Boolean] = js.native
  
  var run: js.UndefOr[Double] = js.native
  
  var start_time: js.UndefOr[Double] = js.native
  
  var status: js.UndefOr[String] = js.native
}
object Build {
  
  @scala.inline
  def apply(): Build = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Build]
  }
  
  @scala.inline
  implicit class BuildOps[Self <: Build] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreation_time(value: Double): Self = this.set("creation_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreation_time: Self = this.set("creation_time", js.undefined)
    
    @scala.inline
    def setDeletion_time(value: Double): Self = this.set("deletion_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletion_time: Self = this.set("deletion_time", js.undefined)
    
    @scala.inline
    def setEnd_time(value: Double): Self = this.set("end_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd_time: Self = this.set("end_time", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setJobs(value: Completed): Self = this.set("jobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobs: Self = this.set("jobs", js.undefined)
    
    @scala.inline
    def setModification_time(value: Double): Self = this.set("modification_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModification_time: Self = this.set("modification_time", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNumber(value: Double): Self = this.set("number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
    
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    
    @scala.inline
    def setPassed(value: Boolean): Self = this.set("passed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassed: Self = this.set("passed", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setPublic(value: Boolean): Self = this.set("public", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublic: Self = this.set("public", js.undefined)
    
    @scala.inline
    def setRun(value: Double): Self = this.set("run", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRun: Self = this.set("run", js.undefined)
    
    @scala.inline
    def setStart_time(value: Double): Self = this.set("start_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart_time: Self = this.set("start_time", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
