package typings.qunit.QUnit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestStartDetails extends js.Object {
  var module: String
  var name: String
}

object TestStartDetails {
  @scala.inline
  def apply(module: String, name: String): TestStartDetails = {
    val __obj = js.Dynamic.literal(module = module, name = name)
  
    __obj.asInstanceOf[TestStartDetails]
  }
}

