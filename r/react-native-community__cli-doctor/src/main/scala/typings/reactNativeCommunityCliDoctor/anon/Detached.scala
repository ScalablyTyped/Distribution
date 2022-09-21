package typings.reactNativeCommunityCliDoctor.anon

import typings.reactNativeCommunityCliTypes.mod.DetachedCommandFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Detached extends StObject {
  
  var description: String
  
  var detached: Boolean
  
  def func(argv: js.Array[String], args: Contributor): js.Promise[Unit] | Unit
  @JSName("func")
  var func_Original: DetachedCommandFunction[Contributor]
  
  var name: String
  
  var options: js.Array[Description]
}
object Detached {
  
  inline def apply(
    description: String,
    detached: Boolean,
    func: (/* argv */ js.Array[String], Contributor) => js.Promise[Unit] | Unit,
    name: String,
    options: js.Array[Description]
  ): Detached = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], detached = detached.asInstanceOf[js.Any], func = js.Any.fromFunction2(func), name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Detached]
  }
  
  extension [Self <: Detached](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDetached(value: Boolean): Self = StObject.set(x, "detached", value.asInstanceOf[js.Any])
    
    inline def setFunc(value: (/* argv */ js.Array[String], Contributor) => js.Promise[Unit] | Unit): Self = StObject.set(x, "func", js.Any.fromFunction2(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: js.Array[Description]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(value: Description*): Self = StObject.set(x, "options", js.Array(value*))
  }
}
