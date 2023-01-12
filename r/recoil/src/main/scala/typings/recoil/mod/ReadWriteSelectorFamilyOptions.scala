package typings.recoil.mod

import typings.recoil.anon.Get
import typings.recoil.anon.Reset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadWriteSelectorFamilyOptions[T, P /* <: SerializableParam */] extends StObject {
  
  // cachePolicyForParams_UNSTABLE?: CachePolicyWithoutEviction; TODO: removing while we discuss long term API
  var cachePolicy_UNSTABLE: js.UndefOr[CachePolicyWithoutEquality] = js.undefined
  
  // TODO: using the more restrictive CachePolicyWithoutEquality while we discuss long term API
  var dangerouslyAllowMutability: js.UndefOr[Boolean] = js.undefined
  
  def get(param: P): js.Function1[/* opts */ Get, js.Promise[T] | Loadable[T] | WrappedValue[T] | RecoilValue[T] | T]
  
  var key: String
  
  def set(param: P): js.Function2[/* opts */ Reset, /* newValue */ T | DefaultValue, Unit]
}
object ReadWriteSelectorFamilyOptions {
  
  inline def apply[T, P /* <: SerializableParam */](
    get: P => js.Function1[/* opts */ Get, js.Promise[T] | Loadable[T] | WrappedValue[T] | RecoilValue[T] | T],
    key: String,
    set: P => js.Function2[/* opts */ Reset, /* newValue */ T | DefaultValue, Unit]
  ): ReadWriteSelectorFamilyOptions[T, P] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), key = key.asInstanceOf[js.Any], set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[ReadWriteSelectorFamilyOptions[T, P]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadWriteSelectorFamilyOptions[?, ?], T, P /* <: SerializableParam */] (val x: Self & (ReadWriteSelectorFamilyOptions[T, P])) extends AnyVal {
    
    inline def setCachePolicy_UNSTABLE(value: CachePolicyWithoutEquality): Self = StObject.set(x, "cachePolicy_UNSTABLE", value.asInstanceOf[js.Any])
    
    inline def setCachePolicy_UNSTABLEUndefined: Self = StObject.set(x, "cachePolicy_UNSTABLE", js.undefined)
    
    inline def setDangerouslyAllowMutability(value: Boolean): Self = StObject.set(x, "dangerouslyAllowMutability", value.asInstanceOf[js.Any])
    
    inline def setDangerouslyAllowMutabilityUndefined: Self = StObject.set(x, "dangerouslyAllowMutability", js.undefined)
    
    inline def setGet(
      value: P => js.Function1[/* opts */ Get, js.Promise[T] | Loadable[T] | WrappedValue[T] | RecoilValue[T] | T]
    ): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setSet(value: P => js.Function2[/* opts */ Reset, /* newValue */ T | DefaultValue, Unit]): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
  }
}
