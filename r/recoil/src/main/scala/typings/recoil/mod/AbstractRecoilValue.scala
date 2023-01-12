package typings.recoil.mod

import typings.recoil.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// recoilValue.d.ts
trait AbstractRecoilValue[T] extends StObject {
  
  def __cTag(t: T): Unit
  
  var __tag: js.Array[T]
  
  // for contravariance
  var key: NodeKey
  
  def toJSON(): Key
}
object AbstractRecoilValue {
  
  inline def apply[T](__cTag: T => Unit, __tag: js.Array[T], key: NodeKey, toJSON: () => Key): AbstractRecoilValue[T] = {
    val __obj = js.Dynamic.literal(__cTag = js.Any.fromFunction1(__cTag), __tag = __tag.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[AbstractRecoilValue[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AbstractRecoilValue[?], T] (val x: Self & AbstractRecoilValue[T]) extends AnyVal {
    
    inline def setKey(value: NodeKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setToJSON(value: () => Key): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    inline def set__cTag(value: T => Unit): Self = StObject.set(x, "__cTag", js.Any.fromFunction1(value))
    
    inline def set__tag(value: js.Array[T]): Self = StObject.set(x, "__tag", value.asInstanceOf[js.Any])
    
    inline def set__tagVarargs(value: T*): Self = StObject.set(x, "__tag", js.Array(value*))
  }
}
