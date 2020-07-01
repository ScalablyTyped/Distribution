package typings.recoil.anon

import typings.recoil.mod.GetRecoilValue
import typings.recoil.mod.RecoilValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Get extends js.Object {
  var get: GetRecoilValue
}

object Get {
  @scala.inline
  def apply(get: /* recoilVal */ RecoilValue[js.Any] => js.Any): Get = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[Get]
  }
}

