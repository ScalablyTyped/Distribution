package typings.rgroveParseXml.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseOptions extends js.Object {
  var ignoreUndefinedEntities: js.UndefOr[Boolean] = js.native
  var preserveCdata: js.UndefOr[Boolean] = js.native
  var preserveComments: js.UndefOr[Boolean] = js.native
  var resolveUndefinedEntity: js.UndefOr[js.Function1[/* ref */ String, String]] = js.native
}

object ParseOptions {
  @scala.inline
  def apply(): ParseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseOptions]
  }
  @scala.inline
  implicit class ParseOptionsOps[Self <: ParseOptions] (val x: Self) extends AnyVal {
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
    def setIgnoreUndefinedEntities(value: Boolean): Self = this.set("ignoreUndefinedEntities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreUndefinedEntities: Self = this.set("ignoreUndefinedEntities", js.undefined)
    @scala.inline
    def setPreserveCdata(value: Boolean): Self = this.set("preserveCdata", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveCdata: Self = this.set("preserveCdata", js.undefined)
    @scala.inline
    def setPreserveComments(value: Boolean): Self = this.set("preserveComments", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveComments: Self = this.set("preserveComments", js.undefined)
    @scala.inline
    def setResolveUndefinedEntity(value: /* ref */ String => String): Self = this.set("resolveUndefinedEntity", js.Any.fromFunction1(value))
    @scala.inline
    def deleteResolveUndefinedEntity: Self = this.set("resolveUndefinedEntity", js.undefined)
  }
  
}

