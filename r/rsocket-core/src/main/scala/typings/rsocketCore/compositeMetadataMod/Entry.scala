package typings.rsocketCore.compositeMetadataMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Entry extends js.Object {
  /**
    * Returns the un-decoded content of the {@link Entry}.
    *
    * @return the un-decoded content of the {@link Entry}
    */
  val content: Buffer = js.native
  /**
    * Returns the MIME type of the entry, if it can be decoded.
    *
    * @return the MIME type of the entry, if it can be decoded, otherwise {@code null}.
    */
  val mimeType: js.UndefOr[String] = js.native
}

object Entry {
  @scala.inline
  def apply(content: Buffer): Entry = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entry]
  }
  @scala.inline
  implicit class EntryOps[Self <: Entry] (val x: Self) extends AnyVal {
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
    def setContent(value: Buffer): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMimeType: Self = this.set("mimeType", js.undefined)
  }
  
}

