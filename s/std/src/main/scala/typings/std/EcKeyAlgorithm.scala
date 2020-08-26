package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EcKeyAlgorithm extends KeyAlgorithm {
  var namedCurve: NamedCurve = js.native
}

object EcKeyAlgorithm {
  @scala.inline
  def apply(name: java.lang.String, namedCurve: NamedCurve): EcKeyAlgorithm = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namedCurve = namedCurve.asInstanceOf[js.Any])
    __obj.asInstanceOf[EcKeyAlgorithm]
  }
  @scala.inline
  implicit class EcKeyAlgorithmOps[Self <: EcKeyAlgorithm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNamedCurve(value: NamedCurve): Self = this.set("namedCurve", value.asInstanceOf[js.Any])
  }
  
}

