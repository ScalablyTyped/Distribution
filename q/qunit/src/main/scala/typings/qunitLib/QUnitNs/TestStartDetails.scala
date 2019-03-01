package typings
package qunitLib.QUnitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestStartDetails extends js.Object {
  var module: java.lang.String
  var name: java.lang.String
}

object TestStartDetails {
  @scala.inline
  def apply(module: java.lang.String, name: java.lang.String): TestStartDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("module")(module)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[TestStartDetails]
  }
}

