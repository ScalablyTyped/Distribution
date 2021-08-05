package typings.pulumiCloud.serviceMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskRunOptions extends StObject {
  
  /**
    * Optional environment variables to override those set in the container definition.
    */
  var environment: js.UndefOr[Record[String, String]] = js.undefined
  
  /**
    * The properties of the host where this task can run.
    */
  var host: js.UndefOr[HostProperties] = js.undefined
}
object TaskRunOptions {
  
  inline def apply(): TaskRunOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskRunOptions]
  }
  
  extension [Self <: TaskRunOptions](x: Self) {
    
    inline def setEnvironment(value: Record[String, String]): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setHost(value: HostProperties): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
  }
}
