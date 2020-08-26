package typings.prosemirrorMarkdown.mod

import typings.prosemirrorModel.mod.Fragment
import typings.prosemirrorModel.mod.Mark
import typings.prosemirrorModel.mod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarkSerializerConfig[S /* <: Schema[_, _] */] extends js.Object {
  var close: String | MarkSerializerMethod[S] = js.native
  var escape: js.UndefOr[Boolean] = js.native
  var expelEnclosingWhitespace: js.UndefOr[Boolean] = js.native
  var mixable: js.UndefOr[Boolean] = js.native
  var open: String | MarkSerializerMethod[S] = js.native
}

object MarkSerializerConfig {
  @scala.inline
  def apply[/* <: typings.prosemirrorModel.mod.Schema[_, _] */ S](close: String | MarkSerializerMethod[S], open: String | MarkSerializerMethod[S]): MarkSerializerConfig[S] = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkSerializerConfig[S]]
  }
  @scala.inline
  implicit class MarkSerializerConfigOps[Self <: MarkSerializerConfig[_], /* <: typings.prosemirrorModel.mod.Schema[_, _] */ S] (val x: Self with MarkSerializerConfig[S]) extends AnyVal {
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
    def setCloseFunction4(
      value: (/* state */ MarkdownSerializerState[S], /* mark */ Mark[S], /* parent */ Fragment[S], /* index */ Double) => Unit
    ): Self = this.set("close", js.Any.fromFunction4(value))
    @scala.inline
    def setClose(value: String | MarkSerializerMethod[S]): Self = this.set("close", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpenFunction4(
      value: (/* state */ MarkdownSerializerState[S], /* mark */ Mark[S], /* parent */ Fragment[S], /* index */ Double) => Unit
    ): Self = this.set("open", js.Any.fromFunction4(value))
    @scala.inline
    def setOpen(value: String | MarkSerializerMethod[S]): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def setEscape(value: Boolean): Self = this.set("escape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEscape: Self = this.set("escape", js.undefined)
    @scala.inline
    def setExpelEnclosingWhitespace(value: Boolean): Self = this.set("expelEnclosingWhitespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpelEnclosingWhitespace: Self = this.set("expelEnclosingWhitespace", js.undefined)
    @scala.inline
    def setMixable(value: Boolean): Self = this.set("mixable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMixable: Self = this.set("mixable", js.undefined)
  }
  
}

