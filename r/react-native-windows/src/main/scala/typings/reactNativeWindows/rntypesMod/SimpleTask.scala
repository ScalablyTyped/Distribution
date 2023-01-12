package typings.reactNativeWindows.rntypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleTask extends StObject {
  
  def gen(): Unit
  
  var name: String
}
object SimpleTask {
  
  inline def apply(gen: () => Unit, name: String): SimpleTask = {
    val __obj = js.Dynamic.literal(gen = js.Any.fromFunction0(gen), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleTask]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SimpleTask] (val x: Self) extends AnyVal {
    
    inline def setGen(value: () => Unit): Self = StObject.set(x, "gen", js.Any.fromFunction0(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
