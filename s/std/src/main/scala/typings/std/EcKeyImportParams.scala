package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EcKeyImportParams extends Algorithm {
  var namedCurve: NamedCurve
}

object EcKeyImportParams {
  @scala.inline
  def apply(name: java.lang.String, namedCurve: NamedCurve): EcKeyImportParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namedCurve = namedCurve.asInstanceOf[js.Any])
    __obj.asInstanceOf[EcKeyImportParams]
  }
}

