package typings.promiseFs

import typings.promiseFs.promiseFsStrings.buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBuffer extends js.Object {
  var encoding: buffer
}

object AnonBuffer {
  @scala.inline
  def apply(encoding: buffer): AnonBuffer = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBuffer]
  }
}

