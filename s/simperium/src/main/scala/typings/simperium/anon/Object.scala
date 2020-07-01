package typings.simperium.anon

import typings.simperium.mod.Change
import typings.simperium.mod.LocalQueuedChange
import typings.simperium.simperiumStrings.full
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Object[T] extends LocalQueuedChange[T] {
  var `object`: T
  var originalChange: Change[T]
  var `type`: full
}

object Object {
  @scala.inline
  def apply[T](`object`: T, originalChange: Change[T], `type`: full): Object[T] = {
    val __obj = js.Dynamic.literal(originalChange = originalChange.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Object[T]]
  }
}

