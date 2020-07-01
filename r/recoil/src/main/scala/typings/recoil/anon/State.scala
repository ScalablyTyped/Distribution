package typings.recoil.anon

import typings.recoil.mod.Loadable
import typings.recoil.mod.LoadablePromise
import typings.recoil.recoilStrings.loading
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State[T] extends Loadable[T] {
  var contents: LoadablePromise[T]
  var state: loading
}

object State {
  @scala.inline
  def apply[T](contents: LoadablePromise[T], state: loading): State[T] = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[State[T]]
  }
}

