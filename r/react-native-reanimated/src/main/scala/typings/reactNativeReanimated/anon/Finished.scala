package typings.reactNativeReanimated.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Finished extends StObject {
  
  var finished: Boolean
}
object Finished {
  
  inline def apply(finished: Boolean): Finished = {
    val __obj = js.Dynamic.literal(finished = finished.asInstanceOf[js.Any])
    __obj.asInstanceOf[Finished]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Finished] (val x: Self) extends AnyVal {
    
    inline def setFinished(value: Boolean): Self = StObject.set(x, "finished", value.asInstanceOf[js.Any])
  }
}
