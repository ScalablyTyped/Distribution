package typings.storybookAddonKnobs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Deserialize extends StObject {
  
  def deserialize(v: Any): Any
  
  def serialize(v: Any): Any
}
object Deserialize {
  
  inline def apply(deserialize: Any => Any, serialize: Any => Any): Deserialize = {
    val __obj = js.Dynamic.literal(deserialize = js.Any.fromFunction1(deserialize), serialize = js.Any.fromFunction1(serialize))
    __obj.asInstanceOf[Deserialize]
  }
  
  extension [Self <: Deserialize](x: Self) {
    
    inline def setDeserialize(value: Any => Any): Self = StObject.set(x, "deserialize", js.Any.fromFunction1(value))
    
    inline def setSerialize(value: Any => Any): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
  }
}
