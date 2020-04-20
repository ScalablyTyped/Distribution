package typings.reactJsonschemaForm

import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBlob extends js.Object {
  var blob: Blob
  var name: String
}

object AnonBlob {
  @scala.inline
  def apply(blob: Blob, name: String): AnonBlob = {
    val __obj = js.Dynamic.literal(blob = blob.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBlob]
  }
}

