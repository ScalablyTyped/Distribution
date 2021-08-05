package typings.serverless.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopulateService extends StObject {
  
  def populateService(): js.Promise[js.Any]
}
object PopulateService {
  
  inline def apply(populateService: () => js.Promise[js.Any]): PopulateService = {
    val __obj = js.Dynamic.literal(populateService = js.Any.fromFunction0(populateService))
    __obj.asInstanceOf[PopulateService]
  }
  
  extension [Self <: PopulateService](x: Self) {
    
    inline def setPopulateService(value: () => js.Promise[js.Any]): Self = StObject.set(x, "populateService", js.Any.fromFunction0(value))
  }
}
