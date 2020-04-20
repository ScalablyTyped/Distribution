package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EcKeyAlgorithm extends KeyAlgorithm {
  var namedCurve: NamedCurve
}

object EcKeyAlgorithm {
  @scala.inline
  def apply(name: java.lang.String, namedCurve: NamedCurve): EcKeyAlgorithm = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namedCurve = namedCurve.asInstanceOf[js.Any])
    __obj.asInstanceOf[EcKeyAlgorithm]
  }
}

