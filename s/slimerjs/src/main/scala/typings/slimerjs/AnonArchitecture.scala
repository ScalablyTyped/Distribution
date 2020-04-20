package typings.slimerjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArchitecture extends js.Object {
  var architecture: String
  var name: String
  var version: String
}

object AnonArchitecture {
  @scala.inline
  def apply(architecture: String, name: String, version: String): AnonArchitecture = {
    val __obj = js.Dynamic.literal(architecture = architecture.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArchitecture]
  }
}

