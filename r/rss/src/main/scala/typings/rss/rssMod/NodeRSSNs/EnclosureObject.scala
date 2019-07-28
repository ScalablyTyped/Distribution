package typings.rss.rssMod.NodeRSSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnclosureObject extends js.Object {
  /**
    * Path to binary file (or URL).
    */
  var file: js.UndefOr[String] = js.undefined
  /**
    * Size of the file.
    */
  var size: js.UndefOr[Double] = js.undefined
  /**
    * If not provided, the MIME Type will be guessed based
    * on the extension of the file or URL, passing type to
    * the enclosure will override the guessed type.
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * URL to file object (or file).
    */
  var url: String
}

object EnclosureObject {
  @scala.inline
  def apply(url: String, file: String = null, size: Int | Double = null, `type`: String = null): EnclosureObject = {
    val __obj = js.Dynamic.literal(url = url)
    if (file != null) __obj.updateDynamic("file")(file)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[EnclosureObject]
  }
}

