package typings.slonik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SqlTagConfigurationType extends js.Object {
  var normalizeIdentifier: js.UndefOr[IdentifierNormalizerType] = js.native
}

object SqlTagConfigurationType {
  @scala.inline
  def apply(): SqlTagConfigurationType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqlTagConfigurationType]
  }
  @scala.inline
  implicit class SqlTagConfigurationTypeOps[Self <: SqlTagConfigurationType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNormalizeIdentifier(value: /* identifierName */ String => String): Self = this.set("normalizeIdentifier", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNormalizeIdentifier: Self = this.set("normalizeIdentifier", js.undefined)
  }
  
}

