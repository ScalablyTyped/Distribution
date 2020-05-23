package typings.promiseSftp.anon

import typings.ssh2Streams.mod.Attributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attrs extends js.Object {
  var attrs: Attributes
  var filename: String
  var longname: String
}

object Attrs {
  @scala.inline
  def apply(attrs: Attributes, filename: String, longname: String): Attrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], longname = longname.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attrs]
  }
}

