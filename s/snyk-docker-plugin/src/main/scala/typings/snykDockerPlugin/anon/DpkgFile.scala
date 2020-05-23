package typings.snykDockerPlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DpkgFile extends js.Object {
  var dpkgFile: String
  var extFile: String
}

object DpkgFile {
  @scala.inline
  def apply(dpkgFile: String, extFile: String): DpkgFile = {
    val __obj = js.Dynamic.literal(dpkgFile = dpkgFile.asInstanceOf[js.Any], extFile = extFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[DpkgFile]
  }
}

