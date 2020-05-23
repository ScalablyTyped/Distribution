package typings.ranjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chi2 extends js.Object {
  var chi2: Double
  var passed: Boolean
}

object Chi2 {
  @scala.inline
  def apply(chi2: Double, passed: Boolean): Chi2 = {
    val __obj = js.Dynamic.literal(chi2 = chi2.asInstanceOf[js.Any], passed = passed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chi2]
  }
}

