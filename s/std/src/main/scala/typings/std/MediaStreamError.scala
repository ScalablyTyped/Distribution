package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaStreamError extends js.Object {
  val constraintName: java.lang.String | Null = js.native
  val message: java.lang.String | Null = js.native
  val name: java.lang.String = js.native
}

object MediaStreamError {
  @scala.inline
  def apply(name: java.lang.String): MediaStreamError = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamError]
  }
  @scala.inline
  implicit class MediaStreamErrorOps[Self <: MediaStreamError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: java.lang.String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setConstraintName(value: java.lang.String): Self = this.set("constraintName", value.asInstanceOf[js.Any])
    @scala.inline
    def setConstraintNameNull: Self = this.set("constraintName", null)
    @scala.inline
    def setMessage(value: java.lang.String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageNull: Self = this.set("message", null)
  }
  
}

