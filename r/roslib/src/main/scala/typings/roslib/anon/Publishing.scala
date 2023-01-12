package typings.roslib.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Publishing extends StObject {
  
  var publishing: js.Array[java.lang.String]
  
  var services: js.Array[java.lang.String]
  
  var subscribing: js.Array[java.lang.String]
}
object Publishing {
  
  inline def apply(
    publishing: js.Array[java.lang.String],
    services: js.Array[java.lang.String],
    subscribing: js.Array[java.lang.String]
  ): Publishing = {
    val __obj = js.Dynamic.literal(publishing = publishing.asInstanceOf[js.Any], services = services.asInstanceOf[js.Any], subscribing = subscribing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Publishing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Publishing] (val x: Self) extends AnyVal {
    
    inline def setPublishing(value: js.Array[java.lang.String]): Self = StObject.set(x, "publishing", value.asInstanceOf[js.Any])
    
    inline def setPublishingVarargs(value: java.lang.String*): Self = StObject.set(x, "publishing", js.Array(value*))
    
    inline def setServices(value: js.Array[java.lang.String]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setServicesVarargs(value: java.lang.String*): Self = StObject.set(x, "services", js.Array(value*))
    
    inline def setSubscribing(value: js.Array[java.lang.String]): Self = StObject.set(x, "subscribing", value.asInstanceOf[js.Any])
    
    inline def setSubscribingVarargs(value: java.lang.String*): Self = StObject.set(x, "subscribing", js.Array(value*))
  }
}
