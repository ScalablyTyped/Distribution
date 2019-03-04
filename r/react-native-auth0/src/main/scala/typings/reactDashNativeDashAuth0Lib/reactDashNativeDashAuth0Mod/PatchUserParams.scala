package typings
package reactDashNativeDashAuth0Lib.reactDashNativeDashAuth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatchUserParams[T] extends js.Object {
  var id: java.lang.String
  var metadata: T
}

object PatchUserParams {
  @scala.inline
  def apply[T](id: java.lang.String, metadata: T): PatchUserParams[T] = {
    val __obj = js.Dynamic.literal(id = id, metadata = metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PatchUserParams[T]]
  }
}

