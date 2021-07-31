package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PromiseTask extends StObject {
  
  def gen(): js.Promise[js.Any]
  
  var name: String
}
object PromiseTask {
  
  @scala.inline
  def apply(gen: () => js.Promise[js.Any], name: String): PromiseTask = {
    val __obj = js.Dynamic.literal(gen = js.Any.fromFunction0(gen), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromiseTask]
  }
  
  @scala.inline
  implicit class PromiseTaskMutableBuilder[Self <: PromiseTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGen(value: () => js.Promise[js.Any]): Self = StObject.set(x, "gen", js.Any.fromFunction0(value))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
