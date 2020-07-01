package typings.simperium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoteInfo[T] extends js.Object {
  var isIndexing: Boolean
  var original: T
  var patch: JSONDiff[T]
}

object RemoteInfo {
  @scala.inline
  def apply[T](isIndexing: Boolean, original: T, patch: JSONDiff[T]): RemoteInfo[T] = {
    val __obj = js.Dynamic.literal(isIndexing = isIndexing.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteInfo[T]]
  }
}

