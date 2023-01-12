package typings.promClient.mod

import org.scalablytyped.runtime.StringDictionary
import typings.promClient.anon.Body
import typings.promClient.mod.Pushgateway.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("prom-client", "Pushgateway")
@js.native
open class Pushgateway protected () extends StObject {
  /**
  	 * @param url Complete url to the Pushgateway. If port is needed append url with :port
  	 * @param options Options
  	 * @param registry Registry
  	 */
  def this(url: String) = this()
  def this(url: String, options: Any) = this()
  def this(url: String, options: Any, registry: Registry) = this()
  def this(url: String, options: Unit, registry: Registry) = this()
  
  /**
  	 * Delete all metrics for jobName
  	 * @param params Push parameters
  	 */
  def delete(params: Parameters): js.Promise[Body] = js.native
  
  /**
  	 * Overwrite all metric (using PUT to Pushgateway)
  	 * @param params Push parameters
  	 */
  def push(params: Parameters): js.Promise[Body] = js.native
  
  /**
  	 * Add metric and overwrite old ones
  	 * @param params Push parameters
  	 */
  def pushAdd(params: Parameters): js.Promise[Body] = js.native
}
object Pushgateway {
  
  trait Parameters extends StObject {
    
    /**
    		 * Label sets used in the url when making a request to the Pushgateway,
    		 */
    var groupings: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
    		 * Jobname that is pushing the metric
    		 */
    var jobName: String
  }
  object Parameters {
    
    inline def apply(jobName: String): Parameters = {
      val __obj = js.Dynamic.literal(jobName = jobName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Parameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Parameters] (val x: Self) extends AnyVal {
      
      inline def setGroupings(value: StringDictionary[String]): Self = StObject.set(x, "groupings", value.asInstanceOf[js.Any])
      
      inline def setGroupingsUndefined: Self = StObject.set(x, "groupings", js.undefined)
      
      inline def setJobName(value: String): Self = StObject.set(x, "jobName", value.asInstanceOf[js.Any])
    }
  }
}
