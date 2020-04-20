package typings.qunit.QUnit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleStartDetails extends js.Object {
  var name: String
}

object ModuleStartDetails {
  @scala.inline
  def apply(name: String): ModuleStartDetails = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleStartDetails]
  }
}

