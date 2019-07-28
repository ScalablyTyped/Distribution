package typings.promiseDashSftp

import typings.ssh2DashStreams.ssh2DashStreamsMod.Attributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attrs extends js.Object {
  var attrs: Attributes
  var filename: String
  var longname: String
}

object Anon_Attrs {
  @scala.inline
  def apply(attrs: Attributes, filename: String, longname: String): Anon_Attrs = {
    val __obj = js.Dynamic.literal(attrs = attrs, filename = filename, longname = longname)
  
    __obj.asInstanceOf[Anon_Attrs]
  }
}

