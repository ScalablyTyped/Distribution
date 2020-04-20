package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EcKeyGenParams extends Algorithm {
  var namedCurve: NamedCurve
}

object EcKeyGenParams {
  @scala.inline
  def apply(name: java.lang.String, namedCurve: NamedCurve): EcKeyGenParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namedCurve = namedCurve.asInstanceOf[js.Any])
    __obj.asInstanceOf[EcKeyGenParams]
  }
}

