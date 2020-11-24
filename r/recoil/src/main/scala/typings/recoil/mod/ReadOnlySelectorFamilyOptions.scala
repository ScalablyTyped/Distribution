package typings.recoil.mod

import typings.recoil.anon.Get
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadOnlySelectorFamilyOptions[T, P /* <: SerializableParam */] extends js.Object {
  
  // cacheImplementation_UNSTABLE?: () => CacheImplementation<Loadable<T>>,
  // cacheImplementationForParams_UNSTABLE?: () => CacheImplementation<
  //   RecoilValue<T>,
  // >,
  var dangerouslyAllowMutability: js.UndefOr[Boolean] = js.native
  
  def get(param: P): js.Function1[/* opts */ Get, js.Promise[T] | RecoilValue[T] | T] = js.native
  
  var key: String = js.native
}
object ReadOnlySelectorFamilyOptions {
  
  @scala.inline
  def apply[T, P /* <: SerializableParam */](get: P => js.Function1[/* opts */ Get, js.Promise[T] | RecoilValue[T] | T], key: String): ReadOnlySelectorFamilyOptions[T, P] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadOnlySelectorFamilyOptions[T, P]]
  }
  
  @scala.inline
  implicit class ReadOnlySelectorFamilyOptionsOps[Self <: ReadOnlySelectorFamilyOptions[_, _], T, P /* <: SerializableParam */] (val x: Self with (ReadOnlySelectorFamilyOptions[T, P])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGet(value: P => js.Function1[/* opts */ Get, js.Promise[T] | RecoilValue[T] | T]): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDangerouslyAllowMutability(value: Boolean): Self = this.set("dangerouslyAllowMutability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDangerouslyAllowMutability: Self = this.set("dangerouslyAllowMutability", js.undefined)
  }
}
