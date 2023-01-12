package typings.recoil.mod

import typings.recoil.anon.Get
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadOnlySelectorFamilyOptions[T, P /* <: SerializableParam */] extends StObject {
  
  // cachePolicyForParams_UNSTABLE?: CachePolicyWithoutEviction; TODO: removing while we discuss long term API
  var cachePolicy_UNSTABLE: js.UndefOr[CachePolicyWithoutEquality] = js.undefined
  
  // TODO: using the more restrictive CachePolicyWithoutEquality while we discuss long term API
  var dangerouslyAllowMutability: js.UndefOr[Boolean] = js.undefined
  
  def get(param: P): js.Function1[/* opts */ Get, js.Promise[T] | RecoilValue[T] | Loadable[T] | WrappedValue[T] | T]
  
  var key: String
}
object ReadOnlySelectorFamilyOptions {
  
  inline def apply[T, P /* <: SerializableParam */](
    get: P => js.Function1[/* opts */ Get, js.Promise[T] | RecoilValue[T] | Loadable[T] | WrappedValue[T] | T],
    key: String
  ): ReadOnlySelectorFamilyOptions[T, P] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadOnlySelectorFamilyOptions[T, P]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadOnlySelectorFamilyOptions[?, ?], T, P /* <: SerializableParam */] (val x: Self & (ReadOnlySelectorFamilyOptions[T, P])) extends AnyVal {
    
    inline def setCachePolicy_UNSTABLE(value: CachePolicyWithoutEquality): Self = StObject.set(x, "cachePolicy_UNSTABLE", value.asInstanceOf[js.Any])
    
    inline def setCachePolicy_UNSTABLEUndefined: Self = StObject.set(x, "cachePolicy_UNSTABLE", js.undefined)
    
    inline def setDangerouslyAllowMutability(value: Boolean): Self = StObject.set(x, "dangerouslyAllowMutability", value.asInstanceOf[js.Any])
    
    inline def setDangerouslyAllowMutabilityUndefined: Self = StObject.set(x, "dangerouslyAllowMutability", js.undefined)
    
    inline def setGet(
      value: P => js.Function1[/* opts */ Get, js.Promise[T] | RecoilValue[T] | Loadable[T] | WrappedValue[T] | T]
    ): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
