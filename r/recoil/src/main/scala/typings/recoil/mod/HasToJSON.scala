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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HasToJSON] (val x: Self) extends AnyVal {
    
    inline def setToJSON(value: () => SerializableParam): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}
