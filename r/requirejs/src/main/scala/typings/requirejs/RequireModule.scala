package typings.requirejs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// todo: not sure what to do with this guy
@js.native
trait RequireModule extends StObject {
  
  /**
    *
    **/
  def config(): js.Object = js.native
}
object RequireModule {
  
  @scala.inline
  def apply(config: () => js.Object): RequireModule = {
    val __obj = js.Dynamic.literal(config = js.Any.fromFunction0(config))
    __obj.asInstanceOf[RequireModule]
  }
  
  @scala.inline
  implicit class RequireModuleMutableBuilder[Self <: RequireModule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: () => js.Object): Self = StObject.set(x, "config", js.Any.fromFunction0(value))
  }
}
