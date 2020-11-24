package typings.serverless.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var extraServicePath: js.UndefOr[String] = js.native
  
  var function: js.UndefOr[String] = js.native
  
  var noDeploy: js.UndefOr[Boolean] = js.native
  
  var region: String | Null = js.native
  
  var stage: String | Null = js.native
  
  var watch: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setExtraServicePath(value: String): Self = this.set("extraServicePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtraServicePath: Self = this.set("extraServicePath", js.undefined)
    
    @scala.inline
    def setFunction(value: String): Self = this.set("function", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFunction: Self = this.set("function", js.undefined)
    
    @scala.inline
    def setNoDeploy(value: Boolean): Self = this.set("noDeploy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoDeploy: Self = this.set("noDeploy", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionNull: Self = this.set("region", null)
    
    @scala.inline
    def setStage(value: String): Self = this.set("stage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageNull: Self = this.set("stage", null)
    
    @scala.inline
    def setWatch(value: Boolean): Self = this.set("watch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWatch: Self = this.set("watch", js.undefined)
  }
}
