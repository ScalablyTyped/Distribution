package typings.reactMovable.anon

import typings.react.mod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ref extends js.Object {
  var ref: RefObject[_]
}

object Ref {
  @scala.inline
  def apply(ref: RefObject[_]): Ref = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ref]
  }
}

