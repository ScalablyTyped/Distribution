package typings.quill.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.quill.quillStrings.api
  - typings.quill.quillStrings.user
  - typings.quill.quillStrings.silent
*/
trait Sources extends js.Object

object Sources {
  @scala.inline
  def api: typings.quill.quillStrings.api = this.cast("api")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def silent: typings.quill.quillStrings.silent = this.cast("silent")
  @scala.inline
  def user: typings.quill.quillStrings.user = this.cast("user")
}

