package typings.ranjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPassed extends js.Object {
  var U: Double
  var passed: Boolean
}

object AnonPassed {
  @scala.inline
  def apply(U: Double, passed: Boolean): AnonPassed = {
    val __obj = js.Dynamic.literal(U = U.asInstanceOf[js.Any], passed = passed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPassed]
  }
}

