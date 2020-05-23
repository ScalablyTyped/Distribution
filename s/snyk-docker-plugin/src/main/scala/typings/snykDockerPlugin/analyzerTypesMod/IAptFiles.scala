package typings.snykDockerPlugin.analyzerTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAptFiles extends js.Object {
  var dpkgFile: String
  var extFile: String
}

object IAptFiles {
  @scala.inline
  def apply(dpkgFile: String, extFile: String): IAptFiles = {
    val __obj = js.Dynamic.literal(dpkgFile = dpkgFile.asInstanceOf[js.Any], extFile = extFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAptFiles]
  }
}

