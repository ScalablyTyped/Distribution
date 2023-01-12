package typings.requirejs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// todo: not sure what to do with this guy
trait RequireModule extends StObject {
  
  /**
    *
    **/
  def config(): js.Object
}
object RequireModule {
  
  inline def apply(config: () => js.Object): RequireModule = {
    val __obj = js.Dynamic.literal(config = js.Any.fromFunction0(config))
    __obj.asInstanceOf[RequireModule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequireModule] (val x: Self) extends AnyVal {
    
    inline def setConfig(value: () => js.Object): Self = StObject.set(x, "config", js.Any.fromFunction0(value))
  }
}
