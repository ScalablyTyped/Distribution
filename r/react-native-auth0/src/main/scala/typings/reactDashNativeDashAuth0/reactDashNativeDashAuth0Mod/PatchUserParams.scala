package typings.reactDashNativeDashAuth0.reactDashNativeDashAuth0Mod

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
    val __obj = js.Dynamic.literal(id = id, metadata = metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PatchUserParams[T]]
  }
}

