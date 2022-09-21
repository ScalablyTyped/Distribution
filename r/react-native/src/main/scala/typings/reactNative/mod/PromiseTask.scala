package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PromiseTask extends StObject {
  
  def gen(): js.Promise[Any]
  
  var name: String
}
object PromiseTask {
  
  inline def apply(gen: () => js.Promise[Any], name: String): PromiseTask = {
    val __obj = js.Dynamic.literal(gen = js.Any.fromFunction0(gen), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromiseTask]
  }
  
  extension [Self <: PromiseTask](x: Self) {
    
    inline def setGen(value: () => js.Promise[Any]): Self = StObject.set(x, "gen", js.Any.fromFunction0(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
