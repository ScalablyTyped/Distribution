package typings.pulumiCloud.serviceMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskRunOptions extends StObject {
  
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
  implicit class TaskRunOptionsMutableBuilder[Self <: TaskRunOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvironment(value: Record[String, String]): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    @scala.inline
    def setHost(value: HostProperties): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
  }
}
