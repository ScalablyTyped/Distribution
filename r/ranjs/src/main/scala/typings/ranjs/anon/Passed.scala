package typings.ranjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Passed extends js.Object {
  var U: Double
  var passed: Boolean
}

object Passed {
  @scala.inline
  def apply(U: Double, passed: Boolean): Passed = {
    val __obj = js.Dynamic.literal(U = U.asInstanceOf[js.Any], passed = passed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Passed]
  }
}

