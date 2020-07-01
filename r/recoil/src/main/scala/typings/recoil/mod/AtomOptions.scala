package typings.recoil.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AtomOptions[T] extends js.Object {
  var dangerouslyAllowMutability: js.UndefOr[Boolean] = js.undefined
  var default: RecoilValue[T] | js.Promise[T] | T
  var key: NodeKey
}

object AtomOptions {
  @scala.inline
  def apply[T](
    default: RecoilValue[T] | js.Promise[T] | T,
    key: NodeKey,
    dangerouslyAllowMutability: js.UndefOr[Boolean] = js.undefined
  ): AtomOptions[T] = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    if (!js.isUndefined(dangerouslyAllowMutability)) __obj.updateDynamic("dangerouslyAllowMutability")(dangerouslyAllowMutability.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AtomOptions[T]]
  }
}

