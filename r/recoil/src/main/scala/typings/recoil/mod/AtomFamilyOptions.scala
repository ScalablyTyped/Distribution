package typings.recoil.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AtomFamilyOptions[T, P /* <: SerializableParam */] extends js.Object {
  var dangerouslyAllowMutability: js.UndefOr[Boolean] = js.undefined
  var default: RecoilValue[T] | js.Promise[T] | T | (js.Function1[/* param */ P, T | RecoilValue[T] | js.Promise[T]])
  var key: NodeKey
}

object AtomFamilyOptions {
  @scala.inline
  def apply[T, /* <: typings.recoil.mod.SerializableParam */ P](
    default: RecoilValue[T] | js.Promise[T] | T | (js.Function1[/* param */ P, T | RecoilValue[T] | js.Promise[T]]),
    key: NodeKey,
    dangerouslyAllowMutability: js.UndefOr[Boolean] = js.undefined
  ): AtomFamilyOptions[T, P] = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    if (!js.isUndefined(dangerouslyAllowMutability)) __obj.updateDynamic("dangerouslyAllowMutability")(dangerouslyAllowMutability.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AtomFamilyOptions[T, P]]
  }
}

