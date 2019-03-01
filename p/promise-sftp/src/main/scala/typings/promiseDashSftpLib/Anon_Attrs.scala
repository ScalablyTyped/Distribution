package typings
package promiseDashSftpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attrs extends js.Object {
  var attrs: ssh2DashStreamsLib.ssh2DashStreamsMod.Attributes
  var filename: java.lang.String
  var longname: java.lang.String
}

object Anon_Attrs {
  @scala.inline
  def apply(
    attrs: ssh2DashStreamsLib.ssh2DashStreamsMod.Attributes,
    filename: java.lang.String,
    longname: java.lang.String
  ): Anon_Attrs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attrs")(attrs)
    __obj.updateDynamic("filename")(filename)
    __obj.updateDynamic("longname")(longname)
    __obj.asInstanceOf[Anon_Attrs]
  }
}

