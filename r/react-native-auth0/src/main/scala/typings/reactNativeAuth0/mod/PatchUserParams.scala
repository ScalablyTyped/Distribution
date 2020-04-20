package typings.reactNativeAuth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatchUserParams[T] extends js.Object {
  var id: String
  var metadata: T
}

object PatchUserParams {
  @scala.inline
  def apply[T](id: String, metadata: T): PatchUserParams[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchUserParams[T]]
  }
}

