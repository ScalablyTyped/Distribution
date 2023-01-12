package typings.serverless.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopulateService extends StObject {
  
  def populateService(): js.Promise[Any]
}
object PopulateService {
  
  inline def apply(populateService: () => js.Promise[Any]): PopulateService = {
    val __obj = js.Dynamic.literal(populateService = js.Any.fromFunction0(populateService))
    __obj.asInstanceOf[PopulateService]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PopulateService] (val x: Self) extends AnyVal {
    
    inline def setPopulateService(value: () => js.Promise[Any]): Self = StObject.set(x, "populateService", js.Any.fromFunction0(value))
  }
}
