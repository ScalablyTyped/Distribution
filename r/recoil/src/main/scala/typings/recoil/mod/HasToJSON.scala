package typings.recoil.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasToJSON extends StObject {
  
  def toJSON(): SerializableParam
}
object HasToJSON {
  
  inline def apply(toJSON: () => SerializableParam): HasToJSON = {
    val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[HasToJSON]
  }
  
  extension [Self <: HasToJSON](x: Self) {
    
    inline def setToJSON(value: () => SerializableParam): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}
