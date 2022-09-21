package typings.recoil.mod

import typings.recoil.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbstractRecoilValueReadonly[T] extends StObject {
  
  var __tag: js.Array[T]
  
  var key: NodeKey
  
  def toJSON(): Key
}
object AbstractRecoilValueReadonly {
  
  inline def apply[T](__tag: js.Array[T], key: NodeKey, toJSON: () => Key): AbstractRecoilValueReadonly[T] = {
    val __obj = js.Dynamic.literal(__tag = __tag.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[AbstractRecoilValueReadonly[T]]
  }
  
  extension [Self <: AbstractRecoilValueReadonly[?], T](x: Self & AbstractRecoilValueReadonly[T]) {
    
    inline def setKey(value: NodeKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setToJSON(value: () => Key): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    inline def set__tag(value: js.Array[T]): Self = StObject.set(x, "__tag", value.asInstanceOf[js.Any])
    
    inline def set__tagVarargs(value: T*): Self = StObject.set(x, "__tag", js.Array(value*))
  }
}
