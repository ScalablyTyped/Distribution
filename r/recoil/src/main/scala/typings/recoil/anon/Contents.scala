package typings.recoil.anon

import typings.recoil.mod.Loadable
import typings.recoil.recoilStrings.hasValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Contents[T] extends Loadable[T] {
  var contents: T
  var state: hasValue
}

object Contents {
  @scala.inline
  def apply[T](contents: T, state: hasValue): Contents[T] = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contents[T]]
  }
}

