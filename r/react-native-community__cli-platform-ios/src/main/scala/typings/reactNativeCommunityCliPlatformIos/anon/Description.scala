package typings.reactNativeCommunityCliPlatformIos.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Description extends StObject {
  
  var description: String
  
  def func(): js.Promise[Unit]
  
  var name: String
}
object Description {
  
  inline def apply(description: String, func: () => js.Promise[Unit], name: String): Description = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], func = js.Any.fromFunction0(func), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Description]
  }
  
  extension [Self <: Description](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setFunc(value: () => js.Promise[Unit]): Self = StObject.set(x, "func", js.Any.fromFunction0(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
