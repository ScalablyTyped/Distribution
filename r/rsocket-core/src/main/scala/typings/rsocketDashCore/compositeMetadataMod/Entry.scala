package typings.rsocketDashCore.compositeMetadataMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entry extends js.Object {
  /**
    * Returns the un-decoded content of the {@link Entry}.
    *
    * @return the un-decoded content of the {@link Entry}
    */
  val content: Buffer
  /**
    * Returns the MIME type of the entry, if it can be decoded.
    *
    * @return the MIME type of the entry, if it can be decoded, otherwise {@code null}.
    */
  val mimeType: js.UndefOr[String] = js.undefined
}

object Entry {
  @scala.inline
  def apply(content: Buffer, mimeType: String = null): Entry = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entry]
  }
}

