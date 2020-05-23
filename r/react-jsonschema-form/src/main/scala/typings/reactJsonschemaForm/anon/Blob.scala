package typings.reactJsonschemaForm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Blob extends js.Object {
  var blob: typings.std.Blob
  var name: String
}

object Blob {
  @scala.inline
  def apply(blob: typings.std.Blob, name: String): Blob = {
    val __obj = js.Dynamic.literal(blob = blob.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Blob]
  }
}

