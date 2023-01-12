package typings.recoil.mod

import typings.recoil.anon.Get
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadOnlySelectorOptions[T] extends StObject {
  
  var cachePolicy_UNSTABLE: js.UndefOr[CachePolicyWithoutEquality] = js.undefined
  
  var dangerouslyAllowMutability: js.UndefOr[Boolean] = js.undefined
  
  def get(opts: Get): js.Promise[T] | RecoilValue[T] | Loadable[T] | WrappedValue[T] | T
  
  var key: String
}
object ReadOnlySelectorOptions {
  
  inline def apply[T](get: Get => js.Promise[T] | RecoilValue[T] | Loadable[T] | WrappedValue[T] | T, key: String): ReadOnlySelectorOptions[T] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadOnlySelectorOptions[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadOnlySelectorOptions[?], T] (val x: Self & ReadOnlySelectorOptions[T]) extends AnyVal {
    
    inline def setCachePolicy_UNSTABLE(value: CachePolicyWithoutEquality): Self = StObject.set(x, "cachePolicy_UNSTABLE", value.asInstanceOf[js.Any])
    
    inline def setCachePolicy_UNSTABLEUndefined: Self = StObject.set(x, "cachePolicy_UNSTABLE", js.undefined)
    
    inline def setDangerouslyAllowMutability(value: Boolean): Self = StObject.set(x, "dangerouslyAllowMutability", value.asInstanceOf[js.Any])
    
    inline def setDangerouslyAllowMutabilityUndefined: Self = StObject.set(x, "dangerouslyAllowMutability", js.undefined)
    
    inline def setGet(value: Get => js.Promise[T] | RecoilValue[T] | Loadable[T] | WrappedValue[T] | T): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
