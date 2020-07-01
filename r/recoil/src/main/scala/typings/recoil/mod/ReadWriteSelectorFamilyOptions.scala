package typings.recoil.mod

import typings.recoil.anon.Get
import typings.recoil.anon.Reset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadWriteSelectorFamilyOptions[T, P /* <: SerializableParam */] extends js.Object {
  // cacheImplementation_UNSTABLE?: () => CacheImplementation<Loadable<T>>,
  // cacheImplementationForParams_UNSTABLE?: () => CacheImplementation<
  //   RecoilValue<T>,
  // >,
  var dangerouslyAllowMutability: js.UndefOr[Boolean] = js.undefined
  var key: String
  def get(param: P): js.Function1[/* opts */ Get, js.Promise[T] | RecoilValue[T] | T]
  def set(param: P): js.Function2[/* opts */ Reset, /* newValue */ T | DefaultValue, Unit]
}

object ReadWriteSelectorFamilyOptions {
  @scala.inline
  def apply[T, /* <: typings.recoil.mod.SerializableParam */ P](
    get: P => js.Function1[/* opts */ Get, js.Promise[T] | RecoilValue[T] | T],
    key: String,
    set: P => js.Function2[/* opts */ Reset, /* newValue */ T | DefaultValue, Unit],
    dangerouslyAllowMutability: js.UndefOr[Boolean] = js.undefined
  ): ReadWriteSelectorFamilyOptions[T, P] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), key = key.asInstanceOf[js.Any], set = js.Any.fromFunction1(set))
    if (!js.isUndefined(dangerouslyAllowMutability)) __obj.updateDynamic("dangerouslyAllowMutability")(dangerouslyAllowMutability.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadWriteSelectorFamilyOptions[T, P]]
  }
}

