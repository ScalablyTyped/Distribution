package typings.qunit.QUnit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeginDetails extends js.Object {
  var totalTests: Double
}

object BeginDetails {
  @scala.inline
  def apply(totalTests: Double): BeginDetails = {
    val __obj = js.Dynamic.literal(totalTests = totalTests.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BeginDetails]
  }
}

