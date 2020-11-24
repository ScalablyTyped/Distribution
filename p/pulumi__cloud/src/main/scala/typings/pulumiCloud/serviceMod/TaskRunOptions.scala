package typings.pulumiCloud.serviceMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskRunOptions extends js.Object {
  
  /**
    * Optional environment variables to override those set in the container definition.
    */
  var environment: js.UndefOr[Record[String, String]] = js.native
  
  /**
    * The properties of the host where this task can run.
    */
  var host: js.UndefOr[HostProperties] = js.native
}
object TaskRunOptions {
  
  @scala.inline
  def apply(): TaskRunOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskRunOptions]
  }
  
  @scala.inline
  implicit class TaskRunOptionsOps[Self <: TaskRunOptions] (val x: Self) extends AnyVal {
    
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
    def setEnvironment(value: Record[String, String]): Self = this.set("environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironment: Self = this.set("environment", js.undefined)
    
    @scala.inline
    def setHost(value: HostProperties): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
  }
}
