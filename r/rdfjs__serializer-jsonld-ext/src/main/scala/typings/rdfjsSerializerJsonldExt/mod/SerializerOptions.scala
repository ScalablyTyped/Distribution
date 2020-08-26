package typings.rdfjsSerializerJsonldExt.mod

import typings.jsonld.jsonldSpecMod.Context
import typings.jsonld.jsonldSpecMod.JsonLdObj
import typings.rdfjsSerializerJsonldExt.rdfjsSerializerJsonldExtStrings.`object`
import typings.rdfjsSerializerJsonldExt.rdfjsSerializerJsonldExtStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SerializerOptions extends js.Object {
  var compact: js.UndefOr[Boolean] = js.native
  var context: js.UndefOr[Context] = js.native
  var encoding: js.UndefOr[string | `object`] = js.native
  var flatten: js.UndefOr[Boolean] = js.native
  var frame: js.UndefOr[Boolean] = js.native
  var skipContext: js.UndefOr[Boolean] = js.native
  var skipGraphProperty: js.UndefOr[Boolean] = js.native
}

object SerializerOptions {
  @scala.inline
  def apply(): SerializerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SerializerOptions]
  }
  @scala.inline
  implicit class SerializerOptionsOps[Self <: SerializerOptions] (val x: Self) extends AnyVal {
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
    def setCompact(value: Boolean): Self = this.set("compact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompact: Self = this.set("compact", js.undefined)
    @scala.inline
    def setContextVarargs(value: JsonLdObj*): Self = this.set("context", js.Array(value :_*))
    @scala.inline
    def setContext(value: Context): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setEncoding(value: string | `object`): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setFlatten(value: Boolean): Self = this.set("flatten", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlatten: Self = this.set("flatten", js.undefined)
    @scala.inline
    def setFrame(value: Boolean): Self = this.set("frame", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrame: Self = this.set("frame", js.undefined)
    @scala.inline
    def setSkipContext(value: Boolean): Self = this.set("skipContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipContext: Self = this.set("skipContext", js.undefined)
    @scala.inline
    def setSkipGraphProperty(value: Boolean): Self = this.set("skipGraphProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipGraphProperty: Self = this.set("skipGraphProperty", js.undefined)
  }
  
}

