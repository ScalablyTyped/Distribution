package typings.recoil.mod

import typings.recoil.anon.Get
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadOnlySelectorOptions[T] extends js.Object {
  var dangerouslyAllowMutability: js.UndefOr[Boolean] = js.undefined
  var key: String
  def get(opts: Get): js.Promise[T] | RecoilValue[T] | T
}

object ReadOnlySelectorOptions {
  @scala.inline
  def apply[T](
    get: Get => js.Promise[T] | RecoilValue[T] | T,
    key: String,
    dangerouslyAllowMutability: js.UndefOr[Boolean] = js.undefined
  ): ReadOnlySelectorOptions[T] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), key = key.asInstanceOf[js.Any])
    if (!js.isUndefined(dangerouslyAllowMutability)) __obj.updateDynamic("dangerouslyAllowMutability")(dangerouslyAllowMutability.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadOnlySelectorOptions[T]]
  }
}

