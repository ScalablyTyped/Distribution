package typings.ranjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChi2 extends js.Object {
  var chi2: Double
  var passed: Boolean
}

object AnonChi2 {
  @scala.inline
  def apply(chi2: Double, passed: Boolean): AnonChi2 = {
    val __obj = js.Dynamic.literal(chi2 = chi2.asInstanceOf[js.Any], passed = passed.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonChi2]
  }
}

