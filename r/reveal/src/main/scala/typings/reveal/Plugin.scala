package typings.reveal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Plugin extends StObject {
  
  var id: String
  
  def init(deck: RevealStatic): Unit | js.Promise[Any]
}
object Plugin {
  
  inline def apply(id: String, init: RevealStatic => Unit | js.Promise[Any]): Plugin = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], init = js.Any.fromFunction1(init))
    __obj.asInstanceOf[Plugin]
  }
  
  extension [Self <: Plugin](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInit(value: RevealStatic => Unit | js.Promise[Any]): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
  }
}
