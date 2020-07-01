package typings.recoil.mod

import typings.recoil.anon.Get
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadOnlySelectorFamilyOptions[T, P /* <: SerializableParam */] extends js.Object {
  // cacheImplementation_UNSTABLE?: () => CacheImplementation<Loadable<T>>,
  // cacheImplementationForParams_UNSTABLE?: () => CacheImplementation<
  //   RecoilValue<T>,
  // >,
  var dangerouslyAllowMutability: js.UndefOr[Boolean] = js.undefined
  var key: String
  def get(param: P): js.Function1[/* opts */ Get, js.Promise[T] | RecoilValue[T] | T]
}

object ReadOnlySelectorFamilyOptions {
  @scala.inline
  def apply[T, /* <: typings.recoil.mod.SerializableParam */ P](
    get: P => js.Function1[/* opts */ Get, js.Promise[T] | RecoilValue[T] | T],
    key: String,
    dangerouslyAllowMutability: js.UndefOr[Boolean] = js.undefined
  ): ReadOnlySelectorFamilyOptions[T, P] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), key = key.asInstanceOf[js.Any])
    if (!js.isUndefined(dangerouslyAllowMutability)) __obj.updateDynamic("dangerouslyAllowMutability")(dangerouslyAllowMutability.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadOnlySelectorFamilyOptions[T, P]]
  }
}

